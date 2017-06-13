package com.db.movie_detail.mvp.view;

import com.db.movie_detail.mvp.model.bean.MovieReviewsBean;
import com.db.movie_detail.mvp.model.bean.MovieShortCommentsBean;
import com.db.util.retrofit.exception.IErrorView;

/**
 * 作者：lyy on 2017/6/13 11:00
 */

public interface IMovieCommentListView extends IErrorView {

    void updateShortComment(MovieShortCommentsBean bean);//更新短评列表

    void updateReview(MovieReviewsBean bean);//更新影评列表
}
