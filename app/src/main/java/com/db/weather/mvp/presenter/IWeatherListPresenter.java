package com.db.weather.mvp.presenter;


public interface IWeatherListPresenter {

    void getFutureWeather(String key, String language, String city);//请求天气预报细节
}
