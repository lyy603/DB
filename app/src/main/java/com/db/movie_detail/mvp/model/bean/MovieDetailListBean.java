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

    private int shortCommentNum = 0;

    private int reviewNum = 0;

    private MovieShortCommentsBean.CommentsBean shortCommentsBean;

    private MovieReviewsBean.ReviewsBean reviewsBean;

    public MovieShortCommentsBean.CommentsBean getShortCommentsBean() {
        return shortCommentsBean;
    }

    public void setShortCommentsBean(MovieShortCommentsBean.CommentsBean shortCommentsBean) {
        this.shortCommentsBean = shortCommentsBean;
        type = SHORTCOMMENTS;
    }

    public MovieReviewsBean.ReviewsBean getReviewsBean() {
        return reviewsBean;
    }

    public void setReviewsBean(MovieReviewsBean.ReviewsBean reviewsBean) {
        this.reviewsBean = reviewsBean;
        type = REVIEWS;
    }

    @Override
    public int getItemType() {
        return type;
    }

    public int getShortCommentNum() {
        return shortCommentNum;
    }

    public void setShortCommentNum(int shortCommentNum) {
        this.shortCommentNum = shortCommentNum;
    }

    public int getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(int reviewNum) {
        this.reviewNum = reviewNum;
    }
}
