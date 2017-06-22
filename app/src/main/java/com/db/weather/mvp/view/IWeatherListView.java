package com.db.weather.mvp.view;

import com.db.util.retrofit.exception.IErrorView;
import com.db.weather.mvp.model.bean.FutureWeatherListBean;

public interface IWeatherListView extends IErrorView {

    void updateFutureWeather(FutureWeatherListBean bean);//更新天气详情
}
