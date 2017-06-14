package com.db.widget.fragment;

import com.db.util.ProgressUtil;

import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * 作者：lyy on 2017/5/9 11:33
 */

public class BaseFragment extends SwipeBackFragment {

    protected final String TAG = this.getClass().getSimpleName();

    @Override
    protected FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultHorizontalAnimator();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ProgressUtil.dismiss();
    }
}
