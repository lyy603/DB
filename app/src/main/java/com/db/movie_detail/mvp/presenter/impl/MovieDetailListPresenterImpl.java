package com.db.movie_detail.mvp.presenter.impl;

import com.db.API;
import com.db.movie_detail.mvp.model.bean.MovieDetailBean;
import com.db.movie_detail.mvp.model.bean.MovieDetailReviewsBean;
import com.db.movie_detail.mvp.model.bean.MovieDetailShortCommentsBean;
import com.db.movie_detail.mvp.presenter.IMovieDetailListPresenter;
import com.db.movie_detail.mvp.view.IMovieDetailListView;
import com.db.util.GsonHelper;
import com.db.util.retrofit.HttpSubscriber;
import com.db.util.retrofit.RetrofitHelper;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MovieDetailListPresenterImpl implements IMovieDetailListPresenter {

    private final IMovieDetailListView view;

    public MovieDetailListPresenterImpl(IMovieDetailListView view) {
        this.view = view;
    }

    private ArrayList<MovieDetailBean> getList(JsonObject jsonObject) {

        ArrayList<MovieDetailBean> list = new ArrayList<>();

        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (entry.getValue().isJsonArray()) {
                JsonArray array = entry.getValue().getAsJsonArray();
                for (JsonElement element : array) {
                    MovieDetailBean detailBean = new MovieDetailBean();
                    if (entry.getKey().equals("comments"))
                        detailBean.setShortCommentsBean((MovieDetailShortCommentsBean.CommentsBean) GsonHelper.parseJson(element, MovieDetailShortCommentsBean.CommentsBean.class));
                    else if (entry.getKey().equals("reviews"))
                        detailBean.setReviewsBean((MovieDetailReviewsBean.ReviewsBean) GsonHelper.parseJson(element, MovieDetailReviewsBean.ReviewsBean.class));
                    list.add(detailBean);
                }
            }
        }
        return list;
    }

    @Override
    public void getMovieDetailList(String movieId, String apikey, String start, String count) {

        Retrofit retrofit = RetrofitHelper.getRetrofitHelper();

        Flowable<JsonObject> shortCommentsFlowable = retrofit.create(API.class).getShortCommentList(movieId, apikey, start, count);

        Flowable<JsonObject> reviewsFlowable = retrofit.create(API.class).getReviewList(movieId, apikey, start, count);

        Flowable.zip(shortCommentsFlowable, reviewsFlowable, (jsonObjectComments, jsonObjectReviews) -> {
            ArrayList<MovieDetailBean> list = new ArrayList<>();
            list.addAll(getList(jsonObjectComments));
            list.addAll(getList(jsonObjectReviews));
            return list;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new HttpSubscriber<ArrayList<MovieDetailBean>>() {
                    @Override
                    public void _onNext(ArrayList<MovieDetailBean> movieDetailBeen) {
                        view.updateRecyclerView(movieDetailBeen);
                    }

                    @Override
                    public void _onError(String message) {
                        view.showError(message);
                    }
                });
//                .flatMap(new Function<JsonObject, Publisher<ArrayList<MovieDetailBean>>>() {
//                    @Override
//                    public Publisher<ArrayList<MovieDetailBean>> apply(@NonNull JsonObject jsonObject)
//                            throws Exception {
//                        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
//                            if (entry.getValue().isJsonArray() && (entry.getKey().equals("comments")
//                                    || entry.getKey().equals("reviews"))) {
//
//                                JsonArray array = entry.getValue().getAsJsonArray();
//                                ArrayList<MovieDetailBean> list = new ArrayList<>();
//                                MovieDetailBean detailBean = new MovieDetailBean();
//
//                                for (JsonElement element : array) {
//                                    if (entry.getKey().equals("comments"))
//                                        detailBean.setShortCommentsBean((MovieDetailShortCommentsBean.CommentsBean) GsonHelper.parseJson(element, MovieDetailShortCommentsBean.CommentsBean.class));
//                                    else if (entry.getKey().equals("reviews"))
//                                        detailBean.setReviewsBean((MovieDetailReviewsBean.ReviewsBean) GsonHelper.parseJson(element, MovieDetailReviewsBean.ReviewsBean.class));
//                                    list.add(detailBean);
//                                }
//
//                                return Flowable.just(list);
//                            }
//                        }
//                        return null;
//                    }
//                })
//                .subscribe(new HttpSubscriber<ArrayList<MovieDetailBean>>() {
//                    @Override
//                    public void _onNext(ArrayList<MovieDetailBean> movieDetailBeen) {
//                        Log.i("lin", "_onNext: ");
//                    }
//
//                    @Override
//                    public void _onError(String message) {
//
//                    }
//                });
    }
}
