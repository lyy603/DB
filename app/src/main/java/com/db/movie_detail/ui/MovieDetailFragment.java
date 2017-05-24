package com.db.movie_detail.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.db.R;
import com.db.movie_detail.adapter.MovieDetailListAdapter;
import com.db.movie_detail.mvp.model.bean.MovieDetailBean;
import com.db.movie_detail.mvp.model.bean.MovieDetailListBean;
import com.db.movie_detail.mvp.presenter.impl.MovieDetailListPresenterImpl;
import com.db.movie_detail.mvp.view.IMovieDetailListView;
import com.db.widget.fragment.BaseFragment;
import com.db.widget.recyclerview.animation.CustomAnimation;

import java.util.ArrayList;

public class MovieDetailFragment extends BaseFragment implements IMovieDetailListView {

    private static final String KEY = "movie_detail";

    private TextView tv_movie_title, tv_movie_src, tv_movie_name, tv_movie_date, tv_movie_time, tvWantSee, tvHadSee;

    private ImageView iv_movie;

    private FrameLayout flImg;

    private View header;

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
        header = getActivity().getLayoutInflater()
                .inflate(R.layout.item_movie_detail_header, (ViewGroup) recycler_view.getParent(), false);
        initHeader(header);

        context = view.getContext();

        movieId = getArguments().getString(KEY);

        initView();

        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if (savedInstanceState == null) {
            presenter.getMovieDetailList(movieId, "0b2bdeda43b5688921839c8ecb20399b", "0", "5");
            presenter.getMovieDetail(movieId, "0b2bdeda43b5688921839c8ecb20399b", "北京");
        }
    }

    private void initView() {

        //初始化MVP
        presenter = new MovieDetailListPresenterImpl(this);

        //设置RecyclerView
        listAdapter = new MovieDetailListAdapter(new ArrayList<>());
        listAdapter.openLoadAnimation(new CustomAnimation());
        listAdapter.addHeaderView(header);

        recycler_view.setLayoutManager(new LinearLayoutManager(context));
        recycler_view.setAdapter(listAdapter);
    }

    private void initHeader(View header) {
        iv_movie = (ImageView) header.findViewById(R.id.iv_movie);
        tv_movie_src = (TextView) header.findViewById(R.id.tv_movie_src);
        tv_movie_name = (TextView) header.findViewById(R.id.tv_movie_name);
        tv_movie_date = (TextView) header.findViewById(R.id.tv_movie_date);
        tv_movie_time = (TextView) header.findViewById(R.id.tv_movie_time);
        tv_movie_title = (TextView) header.findViewById(R.id.tv_movie_title);
    }

    @Override
    public void showError(String message) {
        ToastUtils.showShort(message);
    }

    @Override
    public void updateRecyclerView(ArrayList<MovieDetailListBean> list) {
        listAdapter.addData(list);
    }

    @Override
    public void updateMovieDetail(MovieDetailBean item) {
        Glide.with(context)
                .load(item.getImages().getLarge())
                .centerCrop()
                .crossFade()
                .into(iv_movie);

        tv_movie_title.setText(item.getTitle());
        tv_movie_date.setText(item.getPubdate());
        tv_movie_src.setText(item.getGenres().get(0));
        tv_movie_name.setText(item.getOriginal_title());
        tv_movie_time.setText(item.getDurations().get(0));
    }
}
