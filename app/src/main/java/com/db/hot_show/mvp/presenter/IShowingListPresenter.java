package com.db.hot_show.mvp.presenter;


public interface IShowingListPresenter {
    void getShowingList(String apikey, String city, String start, String count);//请求正在上映的列表
}
