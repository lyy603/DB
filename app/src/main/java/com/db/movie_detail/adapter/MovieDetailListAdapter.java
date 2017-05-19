package com.db.movie_detail.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.movie_detail.mvp.model.bean.MovieDetailBean;

import java.util.List;

public class MovieDetailListAdapter extends BaseMultiItemQuickAdapter<MovieDetailBean, BaseViewHolder> {

    public MovieDetailListAdapter(List<MovieDetailBean> data) {
        super(data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieDetailBean item) {
        switch (helper.getItemViewType()) {
            case MovieDetailBean.SHORTCOMMENTS:
                break;
            case MovieDetailBean.REVIEWS:
                break;
            default:
                break;
        }
    }

}
