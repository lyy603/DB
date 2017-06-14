package com.db.hot_show.ui.behavior;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

import com.db.R;
import com.db.hot_show.mvp.view.IIsChildRequestScrollListener;

import net.lucode.hackware.magicindicator.MagicIndicator;

/**
 * 作者：lyy on 2017/5/16 17:01
 */

public class MagicIndicatorBehavior extends CoordinatorLayout.Behavior {

    //从顶部到底部滑动的总时间
    public static final long DURATION_SCROLL = 500;

    /**
     * 手指控制的滑动
     */
    private boolean mControlChange;

    /**
     * 向上滑动,还是向下滑动
     */
    private boolean mUp;

    /**
     * 滚动的最大距离
     */
    private int mTranslationMax;

    private ValueAnimator mValueAnimator;

    private MagicIndicator indicator;

    private ViewPager photo_view_pager, list_view_pager;

    public MagicIndicatorBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        mValueAnimator = ValueAnimator.ofFloat(0, 1);
        mTranslationMax = context.getResources().getDimensionPixelOffset(R.dimen.airbnb_translation_min);
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, View child, int layoutDirection) {
        parent.onLayoutChild(child, layoutDirection);
        if (indicator == null) {
            indicator = (MagicIndicator) child;
            list_view_pager = (ViewPager) parent.findViewById(R.id.viewpager);
            photo_view_pager = (ViewPager) parent.findViewById(R.id.viewpager_photo);

            indicator.setTranslationY(mTranslationMax);
        }
        return true;
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        mControlChange = true;
        return (nestedScrollAxes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0;
    }

    @Override//滚动前的准备
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dx, int dy, int[] consumed) {
        mUp = dy > 0;
        if (mValueAnimator.isRunning()) {
            mValueAnimator.cancel();
        }

        if (isChildRequestScroll(child.getTranslationY())) {
            consumed[1] = 0;
            return;
        }

        consumed[1] = dy;//全部消耗
        int distance = -dy / 2;//降低移动的速度

        if (child.getTranslationY() + distance > mTranslationMax) {//大于最大距离
            distance = mTranslationMax;
        } else if (child.getTranslationY() + distance < 0) {//到顶部
            distance = 0;
        } else {//正常
            distance = (int) (child.getTranslationY() + distance);
        }

        child.setTranslationY(distance);
    }

    @Override
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target) {
        mControlChange = false;
        float translationY = child.getTranslationY();
        if (translationY == mTranslationMax || translationY == 0) {
            return;
        }
//        child.setTranslationY(translationY);
//        scroll(child, translationY);
    }

    /**
     * list 不需要滑动就拦截.需要就不拦截
     */
    @Override
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View child, View target, float velocityX, float velocityY) {
        if (velocityY < -1000 && child.getTranslationY() == 0) {//向下滑的速度小于负1000
            mControlChange = false;
        }

        return !isChildRequestScroll(child.getTranslationY());
    }

    /**
     * 两种情况
     * 1 在顶部
     * 2 photo_view_pager下面
     */
    private void scroll(final View child, final float translationY) {
        final float shouldMoveDistance;
        if (translationY < mTranslationMax / 2) {//这段去上面
            shouldMoveDistance = -translationY;
        } else {//去下面
            shouldMoveDistance = mTranslationMax - translationY;
        }


        mValueAnimator.setDuration((long) (Math.abs(shouldMoveDistance) / mTranslationMax * DURATION_SCROLL));
        mValueAnimator.removeAllUpdateListeners();
        mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                child.setTranslationY(translationY + animation.getAnimatedFraction() * shouldMoveDistance);
            }
        });
        mValueAnimator.start();
    }


    /**
     *Child列表自己是否需要滑动，而不是跟随tab移动
     * @param translationY dependency移动时所在的高度，0表示没有移动
     */
    private boolean isChildRequestScroll(float translationY) {

        PagerAdapter adapter = list_view_pager.getAdapter();

        boolean shouldNotRefresh = translationY == 0;//在顶部的时候不应该刷新
        return ((translationY == 0 || translationY == mTranslationMax && !mUp) &&
                adapter != null && //有适配器
                adapter.getCount() > 0 &&//有item
                adapter instanceof IIsChildRequestScrollListener && //实现了
                ((IIsChildRequestScrollListener) adapter).requestScroll(mUp, shouldNotRefresh)//需要滑动
        );
    }

    @Override
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        mValueAnimator.cancel();
    }
}
