package com.db.movie_detail.mvp.presenter;


public interface IMovieCommentListPresenter {
    void getMovieShortCommentList(String movieId, String apikey, String start, String count);//请求电影短评列表

    void getMovieReviewList(String movieId, String apikey, String start, String count);//请求电影影评列表
}
