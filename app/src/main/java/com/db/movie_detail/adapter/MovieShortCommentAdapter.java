package com.db.movie_detail.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.movie_detail.mvp.model.bean.MovieShortCommentsBean;

import java.util.List;

/**
 * 作者：lyy on 2017/6/13 10:54
 */

public class MovieShortCommentAdapter extends BaseQuickAdapter<MovieShortCommentsBean.CommentsBean, BaseViewHolder> {

    public MovieShortCommentAdapter(List<MovieShortCommentsBean.CommentsBean> data) {
        super(R.layout.item_move_detail_short_comment, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieShortCommentsBean.CommentsBean item) {

    }
}
