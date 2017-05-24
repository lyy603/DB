package com.db.movie_detail.mvp.model.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * 作者：lyy on 2017/5/19 10:55
 */

public class MovieDetailListBean implements MultiItemEntity {

    public static final int NODATA = 0;

    //短评
    public static final int SHORTCOMMENTS = 1;

    //影评
    public static final int REVIEWS = 2;

    //数据的类型
    private int type = NODATA;

    private MovieDetailShortCommentsBean.CommentsBean shortCommentsBean;

    private MovieDetailReviewsBean.ReviewsBean reviewsBean;

    public MovieDetailShortCommentsBean.CommentsBean getShortCommentsBean() {
        return shortCommentsBean;
    }

    public void setShortCommentsBean(MovieDetailShortCommentsBean.CommentsBean shortCommentsBean) {
        this.shortCommentsBean = shortCommentsBean;
        type = SHORTCOMMENTS;
    }

    public MovieDetailReviewsBean.ReviewsBean getReviewsBean() {
        return reviewsBean;
    }

    public void setReviewsBean(MovieDetailReviewsBean.ReviewsBean reviewsBean) {
        this.reviewsBean = reviewsBean;
        type = REVIEWS;
    }

    @Override
    public int getItemType() {
        return type;
    }
}
