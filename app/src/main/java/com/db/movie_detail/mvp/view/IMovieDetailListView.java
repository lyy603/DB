package com.db.movie_detail.mvp.view;

import com.db.movie_detail.mvp.model.bean.MovieDetailBean;
import com.db.util.retrofit.exception.IErrorView;

public interface IMovieDetailListView extends IErrorView {

    void updateRecyclerView(MovieDetailBean listBean);//更新列表
}
