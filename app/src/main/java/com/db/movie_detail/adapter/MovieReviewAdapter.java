package com.db.movie_detail.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.movie_detail.mvp.model.bean.MovieReviewsBean;
import com.db.widget.rating_bar.MaterialRatingBar;

import java.util.List;

/**
 * 作者：lyy on 2017/6/13 10:54
 */

public class MovieReviewAdapter extends BaseQuickAdapter<MovieReviewsBean.ReviewsBean, BaseViewHolder> {

    private MaterialRatingBar ratingBar;

    public MovieReviewAdapter(List<MovieReviewsBean.ReviewsBean> data) {
        super(R.layout.item_move_detail_review, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieReviewsBean.ReviewsBean item) {
        String usefulNum = item.getUseful_count() + "/"
                + (item.getUseful_count() + item.getUseless_count());

        helper.setText(R.id.tv_title, item.getTitle())
                .setText(R.id.tv_name, item.getAuthor().getName())
                .setText(R.id.tv_content_review, item.getSummary())
                .setText(R.id.tv_useful_num, item.getUseful_count() + "")
                .setText(R.id.tv_useful_num, mContext.getString(R.string.movie_detail_useful_count, usefulNum));

        ratingBar = helper.getView(R.id.mrb_avg_rating);
        ratingBar.setRating(item.getRating().getValue());
    }
}
