package com.db.movie_detail.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.util.ToastUtils;
import com.db.R;
import com.db.movie_detail.adapter.MovieDetailListAdapter;
import com.db.movie_detail.mvp.model.bean.MovieDetailBean;
import com.db.movie_detail.mvp.presenter.impl.MovieDetailListPresenterImpl;
import com.db.movie_detail.mvp.view.IMovieDetailListView;
import com.db.widget.fragment.BaseFragment;
import com.db.widget.recyclerview.animation.CustomAnimation;

import java.util.ArrayList;

public class MovieDetailFragment extends BaseFragment implements IMovieDetailListView {

    private static final String KEY = "movie_detail";

    private RecyclerView recycler_view;

    private MovieDetailListPresenterImpl presenter;

    private MovieDetailListAdapter listAdapter;

    private Context context;

    private String movieId = "0";

    public static MovieDetailFragment newInstance() {
        return newInstance("");
    }

    public static MovieDetailFragment newInstance(String game_type) {
        MovieDetailFragment fragment = new MovieDetailFragment();
        Bundle args = new Bundle();
        args.putString(KEY, game_type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_detail, container, false);
        recycler_view = (RecyclerView) view.findViewById(R.id.rl_movie_detail);

        context = view.getContext();

        movieId = getArguments().getString(KEY);

        initView();

        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if (savedInstanceState == null)
            presenter.getMovieDetailList(movieId, "0b2bdeda43b5688921839c8ecb20399b", "0", "5");
    }

    private void initView() {

        //初始化MVP
        presenter = new MovieDetailListPresenterImpl(this);

        //设置RecyclerView
        listAdapter = new MovieDetailListAdapter(new ArrayList<>());
        listAdapter.openLoadAnimation(new CustomAnimation());

        recycler_view.setLayoutManager(new LinearLayoutManager(context));
        recycler_view.setAdapter(listAdapter);
    }

    @Override
    public void showError(String message) {
        ToastUtils.showShort(message);
    }

    @Override
    public void updateRecyclerView(ArrayList<MovieDetailBean> list) {
        listAdapter.addData(list);
    }
}
