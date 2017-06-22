package com.db.weather.mvp.presenter.impl;


import com.db.API;
import com.db.util.GsonHelper;
import com.db.util.retrofit.HttpSubscriber;
import com.db.util.retrofit.RetrofitHelper;
import com.db.weather.mvp.model.bean.FutureWeatherListBean;
import com.db.weather.mvp.presenter.IWeatherListPresenter;
import com.db.weather.mvp.view.IWeatherListView;
import com.google.gson.JsonObject;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class WeatherListPresenterImpl implements IWeatherListPresenter {

    private final IWeatherListView view;

    public WeatherListPresenterImpl(IWeatherListView view) {
        this.view = view;
    }

    @Override
    public void getFutureWeather(String key, String language, String city) {
        RetrofitHelper.getWeatherRetrofitHelper()
                .create(API.class)
                .getFutureWeather(city, language, key)
                .subscribeOn(Schedulers.io())
                .flatMap(new Function<JsonObject, Publisher<FutureWeatherListBean>>() {
                    @Override
                    public Publisher<FutureWeatherListBean> apply(@NonNull JsonObject jsonObject) throws Exception {
                        FutureWeatherListBean bean = (FutureWeatherListBean) GsonHelper.parseJson(jsonObject, FutureWeatherListBean.class);
                        return Flowable.just(bean);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new HttpSubscriber<FutureWeatherListBean>() {
                    @Override
                    public void _onNext(FutureWeatherListBean futureWeatherListBean) {
                        view.updateFutureWeather(futureWeatherListBean);
                    }

                    @Override
                    public void _onError(String message) {
                        view.showError(message);
                    }
                });
    }
}
