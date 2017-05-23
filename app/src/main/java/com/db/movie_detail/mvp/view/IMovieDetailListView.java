package com.db.movie_detail.mvp.view;

import com.db.movie_detail.mvp.model.bean.MovieDetailBean;
import com.db.util.retrofit.exception.IErrorView;

import java.util.ArrayList;

public interface IMovieDetailListView extends IErrorView {

    void updateRecyclerView(ArrayList<MovieDetailBean> list);//更新列表
}
