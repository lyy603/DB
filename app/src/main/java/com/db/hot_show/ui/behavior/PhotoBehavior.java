package com.db.hot_show.ui.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

import net.lucode.hackware.magicindicator.MagicIndicator;

/**
 * 作者：lyy on 2017/5/16 10:11
 */

public class PhotoBehavior extends CoordinatorLayout.Behavior {

    //需要gone的时候移动到屏幕外
    private int mTranslationGone;

    private int childHeight;

    public PhotoBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, View child, int layoutDirection) {
        parent.onLayoutChild(child, layoutDirection);
        if (mTranslationGone == 0)
            mTranslationGone = -child.getRight();
        return true;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof MagicIndicator;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        float translationY = dependency.getTranslationY();
        childHeight = child.getHeight();
        if (translationY <= childHeight)
            child.setTranslationY(translationY - childHeight);
        return true;
    }
}
