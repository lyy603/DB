package com.db.hot_show.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import com.db.hot_show.mvp.view.IIsChildRequestScrollListener;
import com.db.util.global.FragmentAdapter;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 作者：lyy on 2017/5/16 17:47
 */

public class HotShowingViewPagerAdapter extends FragmentAdapter implements IIsChildRequestScrollListener {

    private WeakReference<ViewPager> mViewPager;//也许有点用

    public HotShowingViewPagerAdapter(FragmentManager fm, ViewPager viewPager, List<Fragment> fragmentList) {
        super(fm, fragmentList);
        mViewPager = new WeakReference<ViewPager>(viewPager);
    }

    @Override
    public boolean requestScroll(boolean up, boolean shouldNotRefresh) {
        //有子项目,有设置 vp ,没被清掉
        if (mViewPager != null && mViewPager.get() != null) {
            int currentItem = mViewPager.get().getCurrentItem();
            //实现了接口
            if (getItem(currentItem) instanceof IIsChildRequestScrollListener)
                return ((IIsChildRequestScrollListener) getItem(currentItem)).requestScroll(up, shouldNotRefresh);
        }
        return false;
    }
}
