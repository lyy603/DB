package com.db.movie_detail.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.movie_detail.mvp.model.bean.MovieDetailListBean;

import java.util.List;

public class MovieDetailListAdapter extends BaseMultiItemQuickAdapter<MovieDetailListBean, BaseViewHolder> {

    public MovieDetailListAdapter(List<MovieDetailListBean> data) {
        super(data);
        addItemType(MovieDetailListBean.REVIEWS, R.layout.item_move_detail_review);
        addItemType(MovieDetailListBean.SHORTCOMMENTS, R.layout.item_move_detail_short_comment);
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieDetailListBean item) {
        switch (helper.getItemViewType()) {
            case MovieDetailListBean.SHORTCOMMENTS:
                helper.setText(R.id.tv_name, item.getShortCommentsBean().getAuthor().getName())
                        .setText(R.id.tv_content, item.getShortCommentsBean().getContent())
                        .setText(R.id.tv_date, item.getShortCommentsBean().getCreated_at());

                Glide.with(mContext)
                        .load(item.getShortCommentsBean().getAuthor().getAvatar())
                        .centerCrop()
                        .crossFade()
                        .into((ImageView) helper.getView(R.id.iv_avatar));

                break;
            case MovieDetailListBean.REVIEWS:
                helper.setText(R.id.tv_title, item.getReviewsBean().getTitle())
                        .setText(R.id.tv_content_review, item.getReviewsBean().getSummary())
                        .setText(R.id.tv_useful_num, item.getReviewsBean().getUseful_count() + "");
                break;
            default:
                break;
        }
    }

}
