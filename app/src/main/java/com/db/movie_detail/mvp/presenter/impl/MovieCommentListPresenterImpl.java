package com.db.movie_detail.mvp.presenter.impl;

import com.db.API;
import com.db.movie_detail.mvp.model.bean.MovieShortCommentsBean;
import com.db.movie_detail.mvp.presenter.IMovieCommentListPresenter;
import com.db.movie_detail.mvp.view.IMovieCommentListView;
import com.db.util.GsonHelper;
import com.db.util.retrofit.HttpSubscriber;
import com.db.util.retrofit.RetrofitHelper;
import com.google.gson.JsonObject;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * 作者：lyy on 2017/6/13 11:07
 */

public class MovieCommentListPresenterImpl implements IMovieCommentListPresenter {

    private IMovieCommentListView view;

    public MovieCommentListPresenterImpl(IMovieCommentListView view) {
        this.view = view;
    }

    @Override
    public void getMovieShortCommentList(String movieId, String apikey, String start, String count) {
        RetrofitHelper.getRetrofitHelper().create(API.class)
                .getShortCommentList(movieId, apikey, start, count)
                .subscribeOn(Schedulers.io())
                .flatMap(new Function<JsonObject, Publisher<MovieShortCommentsBean>>() {
                    @Override
                    public Publisher<MovieShortCommentsBean> apply(@NonNull JsonObject jsonObject) throws Exception {
                        MovieShortCommentsBean bean = (MovieShortCommentsBean) GsonHelper.parseJson(jsonObject, MovieShortCommentsBean.class);
                        return Flowable.just(bean);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new HttpSubscriber<MovieShortCommentsBean>() {
                    @Override
                    public void _onNext(MovieShortCommentsBean bean) {
                        view.updateShortComment(bean);
                    }

                    @Override
                    public void _onError(String message) {
                        view.showError(message);
                    }
                });
    }

    @Override
    public void getMovieReviewList(String movieId, String apikey, String start, String count) {

    }
}
