package com.db.movie_detail.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
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
import com.db.movie_detail.adapter.MovieDetailFilmMakerListAdapter;
import com.db.movie_detail.adapter.MovieDetailListAdapter;
import com.db.movie_detail.mvp.model.bean.MovieDetailBean;
import com.db.movie_detail.mvp.model.bean.MovieDetailListBean;
import com.db.movie_detail.mvp.model.bean.PersonDetailBean;
import com.db.movie_detail.mvp.presenter.impl.MovieDetailListPresenterImpl;
import com.db.movie_detail.mvp.view.IMovieDetailListView;
import com.db.widget.ExpandableTextView;
import com.db.widget.fragment.BaseFragment;
import com.db.widget.recyclerview.animation.CustomAnimation;

import java.util.ArrayList;
import java.util.List;

public class MovieDetailFragment extends BaseFragment implements IMovieDetailListView {

    private static final String KEY = "movie_detail";

    private TextView tv_movie_title, tv_movie_src, tv_movie_name, tv_movie_date, tv_movie_time,
            tvWantSee, tv_rating_count, tv_avg_rating;

    private ExpandableTextView summary_content;

    private ImageView iv_movie;

    private FrameLayout fl_img;

    private CardView cv_rating;

    private View header;

    private RecyclerView recycler_view, film_maker_recycler_view;

    private MovieDetailListPresenterImpl presenter;

    private MovieDetailFilmMakerListAdapter filmMakerListAdapter;

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

        context = view.getContext();

        movieId = getArguments().getString(KEY);

        initView();

        initHeader(header);

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

        //其他设置
//        FreeHandViewUtil.setViewSize(cv_rating, cv_rating.getHeight(), cv_rating.getHeight());
    }

    private void initHeader(View header) {
        fl_img = (FrameLayout) header.findViewById(R.id.fl_img);
        iv_movie = (ImageView) header.findViewById(R.id.iv_movie);
        cv_rating = (CardView) header.findViewById(R.id.cv_rating);
        tv_movie_src = (TextView) header.findViewById(R.id.tv_movie_src);
        tv_avg_rating = (TextView) header.findViewById(R.id.tv_avg_rating);
        tv_movie_name = (TextView) header.findViewById(R.id.tv_movie_name);
        tv_movie_date = (TextView) header.findViewById(R.id.tv_movie_date);
        tv_movie_time = (TextView) header.findViewById(R.id.tv_movie_time);
        tv_movie_title = (TextView) header.findViewById(R.id.tv_movie_title);
        tv_rating_count = (TextView) header.findViewById(R.id.tv_rating_count);
        film_maker_recycler_view = (RecyclerView) header.findViewById(R.id.rv_filmmaker);
        summary_content = (ExpandableTextView) header.findViewById(R.id.tv_summary_content);

        filmMakerListAdapter = new MovieDetailFilmMakerListAdapter(new ArrayList<>());
        film_maker_recycler_view.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        film_maker_recycler_view.setAdapter(filmMakerListAdapter);
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

        String genres = item.getYear();

        for (String s : item.getGenres()) {
            genres = genres + "/" + s;
        }

        Glide.with(context)
                .load(item.getImages().getLarge())
                .centerCrop()
                .crossFade()
                .into(iv_movie);

        tv_movie_src.setText(genres);
        tv_movie_title.setText(item.getTitle());
        summary_content.setText(item.getSummary());
        tv_avg_rating.setText(item.getRating().getAverage() + "");
        tv_movie_date.setText(getString(R.string.movie_detail_pubdate, item.getPubdate()));
        tv_movie_time.setText(getString(R.string.movie_detail_durations, item.getDurations().get(0)));
        tv_movie_name.setText(getString(R.string.movie_detail_original_name, item.getOriginal_title()));
        tv_rating_count.setText(getString(R.string.movie_detail_rating_count, item.getRatings_count() + ""));

        List<PersonDetailBean> list = new ArrayList<>();
        list.addAll(item.getDirectors());
        list.addAll(item.getCasts());
        filmMakerListAdapter.setDirectorSize(item.getDirectors().size());
        filmMakerListAdapter.setNewData(list);
    }
}
