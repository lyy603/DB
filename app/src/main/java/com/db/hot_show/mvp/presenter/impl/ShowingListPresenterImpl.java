package com.db.hot_show.mvp.presenter.impl;

import com.db.API;
import com.db.hot_show.mvp.model.bean.ShowingListBean;
import com.db.hot_show.mvp.presenter.IShowingListPresenter;
import com.db.hot_show.mvp.view.IShowingListView;
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

public class ShowingListPresenterImpl implements IShowingListPresenter {

    private final IShowingListView view;

    public ShowingListPresenterImpl(IShowingListView view) {
        this.view = view;
    }

    @Override
    public void getShowingList(String apikey, String city, String start, String count) {
        RetrofitHelper.getRetrofitHelper().create(API.class)
                .getShowingList(apikey,city,start,count)
                .subscribeOn(Schedulers.io())
                .flatMap(new Function<JsonObject, Publisher<ShowingListBean>>() {
                    @Override
                    public Publisher<ShowingListBean> apply(@NonNull JsonObject jsonObject) throws Exception {
                        ShowingListBean bean = (ShowingListBean) GsonHelper.parseJson(jsonObject,ShowingListBean.class);
                        return Flowable.just(bean);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new HttpSubscriber<ShowingListBean>() {
                    @Override
                    public void _onNext(ShowingListBean showingListBean) {
                        view.updateRecyclerView(showingListBean);
                    }

                    @Override
                    public void _onError(String message) {
                        view.showError(message);
                    }
                });
    }
}
