package com.db.movie_detail.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.movie_detail.mvp.model.bean.MovieDetailBean;

import java.util.List;

public class MovieDetailListAdapter extends BaseMultiItemQuickAdapter<MovieDetailBean, BaseViewHolder> {

    public MovieDetailListAdapter(List<MovieDetailBean> data) {
        super(data);
        addItemType(MovieDetailBean.REVIEWS, R.layout.item_move_detail_review);
        addItemType(MovieDetailBean.SHORTCOMMENTS, R.layout.item_move_detail_short_comment);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieDetailBean item) {
        switch (helper.getItemViewType()) {
            case MovieDetailBean.SHORTCOMMENTS:
                helper.setText(R.id.tv_name, item.getShortCommentsBean().getAuthor().getName())
                        .setText(R.id.tv_content, item.getShortCommentsBean().getContent())
                        .setText(R.id.tv_date, item.getShortCommentsBean().getCreated_at());

                Glide.with(mContext)
                        .load(item.getShortCommentsBean().getAuthor().getAvatar())
                        .centerCrop()
                        .crossFade()
                        .into((ImageView) helper.getView(R.id.iv_avatar));

                break;
            case MovieDetailBean.REVIEWS:
                helper.setText(R.id.tv_title, item.getReviewsBean().getTitle())
                        .setText(R.id.tv_content_review, item.getReviewsBean().getSummary())
                        .setText(R.id.tv_useful_num, item.getReviewsBean().getUseful_count() + "");
                break;
            default:
                break;
        }
    }

}
