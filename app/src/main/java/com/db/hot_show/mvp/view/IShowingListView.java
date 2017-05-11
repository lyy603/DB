package com.db.hot_show.mvp.view;

import com.db.hot_show.mvp.model.bean.ShowingListBean;
import com.db.util.retrofit.exception.IErrorView;
import java.util.List;

public interface IShowingListView extends IErrorView {

    void updateRecyclerView(List<ShowingListBean> list);//更新列表
}
