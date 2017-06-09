package com.db.movie_detail.mvp.presenter.impl;

import com.db.API;
import com.db.movie_detail.mvp.model.bean.MovieDetailBean;
import com.db.movie_detail.mvp.model.bean.MovieDetailListBean;
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

import static com.db.util.GsonHelper.parseJson;

public class MovieDetailListPresenterImpl implements IMovieDetailListPresenter {

    private final IMovieDetailListView view;

    private int shortCommentNum = 0;

    private int reviewNum = 0;

    public MovieDetailListPresenterImpl(IMovieDetailListView view) {
        this.view = view;
    }

    private ArrayList<MovieDetailListBean> getList(JsonObject jsonObject) {

        ArrayList<MovieDetailListBean> list = new ArrayList<>();

        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            if (entry.getValue().isJsonArray()) {
                JsonArray array = entry.getValue().getAsJsonArray();
                for (JsonElement element : array) {
                    MovieDetailListBean detailBean = new MovieDetailListBean();
                    if (entry.getKey().equals("comments")) {
                        detailBean.setShortCommentsBean((MovieDetailShortCommentsBean.CommentsBean) parseJson(element, MovieDetailShortCommentsBean.CommentsBean.class));
                        detailBean.setShortCommentNum(shortCommentNum);
                    } else if (entry.getKey().equals("reviews")) {
                        detailBean.setReviewsBean((MovieDetailReviewsBean.ReviewsBean) parseJson(element, MovieDetailReviewsBean.ReviewsBean.class));
                        detailBean.setReviewNum(reviewNum);
                    }
                    list.add(detailBean);
                }
            }
        }
        return list;
    }

    private void getTotal(JsonObject jsonObjectComments, JsonObject jsonObjectReviews) {

        for (Map.Entry<String, JsonElement> entry : jsonObjectComments.entrySet()) {
            if (entry.getKey().equals("total")) {
                shortCommentNum = entry.getValue().getAsInt();
                break;
            }
        }

        for (Map.Entry<String, JsonElement> entry : jsonObjectReviews.entrySet()) {
            if (entry.getKey().equals("total")) {
                reviewNum = entry.getValue().getAsInt();
                break;
            }
        }
    }

    @Override
    public void getMovieDetailList(String movieId, String apikey, String start, String count) {

        Retrofit retrofit = RetrofitHelper.getRetrofitHelper();

        Flowable<JsonObject> shortCommentsFlowable = retrofit.create(API.class).getShortCommentList(movieId, apikey, start, count);

        Flowable<JsonObject> reviewsFlowable = retrofit.create(API.class).getReviewList(movieId, apikey, start, count);

        Flowable.zip(shortCommentsFlowable, reviewsFlowable, (jsonObjectComments, jsonObjectReviews) -> {
            ArrayList<MovieDetailListBean> list = new ArrayList<>();
            getTotal(jsonObjectComments, jsonObjectReviews);
            list.addAll(getList(jsonObjectComments));
            list.addAll(getList(jsonObjectReviews));
            return list;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new HttpSubscriber<ArrayList<MovieDetailListBean>>() {
                    @Override
                    public void _onNext(ArrayList<MovieDetailListBean> movieDetailBeen) {
                        view.updateRecyclerView(movieDetailBeen);
                    }

                    @Override
                    public void _onError(String message) {
                        view.showError(message);
                    }
                });
//                .flatMap(new Function<JsonObject, Publisher<ArrayList<MovieDetailListBean>>>() {
//                    @Override
//                    public Publisher<ArrayList<MovieDetailListBean>> apply(@NonNull JsonObject jsonObject)
//                            throws Exception {
//                        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
//                            if (entry.getValue().isJsonArray() && (entry.getKey().equals("comments")
//                                    || entry.getKey().equals("reviews"))) {
//
//                                JsonArray array = entry.getValue().getAsJsonArray();
//                                ArrayList<MovieDetailListBean> list = new ArrayList<>();
//                                MovieDetailListBean detailBean = new MovieDetailListBean();
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
//                .subscribe(new HttpSubscriber<ArrayList<MovieDetailListBean>>() {
//                    @Override
//                    public void _onNext(ArrayList<MovieDetailListBean> movieDetailBeen) {
//                        Log.i("lin", "_onNext: ");
//                    }
//
//                    @Override
//                    public void _onError(String message) {
//
//                    }
//                });
    }

    @Override
    public void getMovieDetail(String movieId, String apikey, String city) {
        RetrofitHelper.getRetrofitHelper().create(API.class)
                .getMovieDetail(movieId, apikey, city)
                .flatMap(new Function<JsonObject, Publisher<MovieDetailBean>>() {
                    @Override
                    public Publisher<MovieDetailBean> apply(@NonNull JsonObject jsonObject) throws Exception {
                        MovieDetailBean bean = (MovieDetailBean) GsonHelper.parseJson(jsonObject, MovieDetailBean.class);
                        return Flowable.just(bean);
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new HttpSubscriber<MovieDetailBean>() {
                    @Override
                    public void _onNext(MovieDetailBean bean) {
                        view.updateMovieDetail(bean);
                    }

                    @Override
                    public void _onError(String message) {
                        view.showError(message);
                    }
                });
    }
}
