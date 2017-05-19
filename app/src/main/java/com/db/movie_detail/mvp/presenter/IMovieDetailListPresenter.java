package com.db.movie_detail.mvp.presenter;


public interface IMovieDetailListPresenter {
    void getMovieDetailList(String movieId, String apikey, String start, String count);//请求电影详情列表
}
