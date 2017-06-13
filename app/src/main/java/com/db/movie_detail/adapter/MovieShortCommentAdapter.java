package com.db.movie_detail.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.movie_detail.mvp.model.bean.MovieShortCommentsBean;
import com.db.widget.rating_bar.MaterialRatingBar;

import java.util.List;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * 作者：lyy on 2017/6/13 10:54
 */

public class MovieShortCommentAdapter extends BaseQuickAdapter<MovieShortCommentsBean.CommentsBean, BaseViewHolder> {

    private MaterialRatingBar ratingBar;

    public MovieShortCommentAdapter(List<MovieShortCommentsBean.CommentsBean> data) {
        super(R.layout.item_move_detail_short_comment, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieShortCommentsBean.CommentsBean item) {

        helper.setText(R.id.tv_content, item.getContent())
                .setText(R.id.tv_date, item.getCreated_at())
                .setText(R.id.tv_name, item.getAuthor().getName())
                .setText(R.id.tv_rating_count, item.getUseful_count() + "");

        Glide.with(mContext)
                .load(item.getAuthor().getAvatar())
                .bitmapTransform(new CropCircleTransformation(mContext))
                .into((ImageView) helper.getView(R.id.iv_avatar));

        ratingBar = helper.getView(R.id.mrb_avg_rating);
        ratingBar.setRating(item.getRating().getValue());
    }
}
