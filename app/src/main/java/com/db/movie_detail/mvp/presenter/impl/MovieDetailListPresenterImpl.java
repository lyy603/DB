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

import org.reactivestreams.Publisher;

import java.util.ArrayList;
import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MovieDetailListPresenterImpl implements IMovieDetailListPresenter {

    private final IMovieDetailListView view;

    public MovieDetailListPresenterImpl(IMovieDetailListView view) {
        this.view = view;
    }

    @Override
    public void getMovieDetailList(String movieId, String apikey, String start, String count) {

        Retrofit retrofit = RetrofitHelper.getRetrofitHelper();

        Flowable<JsonObject> shortCommentsFlowable = retrofit.create(API.class).getShortCommentList(movieId, apikey, start, count);

        Flowable<JsonObject> reviewsFlowable = retrofit.create(API.class).getReviewList(movieId, apikey, start, count);

        Flowable.mergeDelayError(shortCommentsFlowable, reviewsFlowable)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .flatMap(new Function<JsonObject, Publisher<ArrayList<MovieDetailBean>>>() {
                    @Override
                    public Publisher<ArrayList<MovieDetailBean>> apply(@NonNull JsonObject jsonObject)
                            throws Exception {
                        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                            if (entry.getValue().isJsonArray() && (entry.getKey().equals("comments")
                                    || entry.getKey().equals("reviews"))) {
                                JsonArray array = entry.getValue().getAsJsonArray();
                                ArrayList<MovieDetailBean> list = new ArrayList<>();
                                MovieDetailBean detailBean = new MovieDetailBean();
                                for (JsonElement element : array) {
                                    if (entry.getKey().equals("comments"))
                                        detailBean.setShortCommentsBean((MovieDetailShortCommentsBean.CommentsBean) GsonHelper.parseJson(element, MovieDetailShortCommentsBean.CommentsBean.class));
                                    else if (entry.getKey().equals("reviews"))
                                        detailBean.setReviewsBean((MovieDetailReviewsBean.ReviewsBean) GsonHelper.parseJson(element, MovieDetailReviewsBean.ReviewsBean.class));
                                    list.add(detailBean);
                                }
                                return Flowable.just(list);
                            }
                        }
                        return null;
                    }
                })
                .subscribe(new HttpSubscriber<ArrayList<MovieDetailBean>>() {
                    @Override
                    public void _onNext(ArrayList<MovieDetailBean> movieDetailBeen) {

                    }

                    @Override
                    public void _onError(String message) {

                    }
                });
//        RetrofitHelper.getRetrofitHelper().create(API.class)
//                .getReviewList(apikey, start, count)
//                .subscribeOn(Schedulers.io())
//                .flatMap(new Function<JsonObject, Publisher<MovieDetailReviewsBean>>() {
//                    @Override
//                    public Publisher<MovieDetailReviewsBean> apply(@NonNull JsonObject jsonObject) throws Exception {
//                        MovieDetailReviewsBean bean = (MovieDetailReviewsBean) GsonHelper.parseJson(jsonObject, MovieDetailReviewsBean.class);
//                        return Flowable.just(bean);
//                    }
//                })
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new HttpSubscriber<MovieDetailReviewsBean>() {
//                    @Override
//                    public void _onNext(MovieDetailReviewsBean showingListBean) {
//                        view.updateRecyclerView(showingListBean);
//                    }
//
//                    @Override
//                    public void _onError(String message) {
//                        view.showError(message);
//                    }
//                });
    }
}
