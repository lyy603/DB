package com.db.widget.recyclerview;

import com.chad.library.adapter.base.loadmore.LoadMoreView;
import com.db.R;

/**
 * 作者：lyy on 2017/5/9 11:57
 */

public class CustomLoadMoreView extends LoadMoreView {
    @Override
    public int getLayoutId() {
        return R.layout.layout_loadmore;
    }

    @Override
    protected int getLoadingViewId() {
        return R.id.progressbar;
    }

    @Override
    protected int getLoadFailViewId() {
        return R.id.tv_fail;
    }

    @Override
    protected int getLoadEndViewId() {
        return R.id.tv_end;
    }
}
