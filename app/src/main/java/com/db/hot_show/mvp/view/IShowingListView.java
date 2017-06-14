package com.db.hot_show.mvp.view;

import com.db.hot_show.mvp.model.bean.ShowingListBean;
import com.db.util.retrofit.exception.IErrorView;

public interface IShowingListView extends IErrorView {

    void updateRecyclerView(ShowingListBean listBean);//更新列表
}
