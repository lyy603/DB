package com.db.weather.mvp.view;

import com.db.util.retrofit.exception.IErrorView;
import com.db.weather.mvp.model.bean.DailyWeatherListBean;

public interface IWeatherListView extends IErrorView {

    void updateFutureWeather(DailyWeatherListBean bean);//更新天气详情
}
