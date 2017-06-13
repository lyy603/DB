package com.db.movie_detail.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.db.R;
import com.db.movie_detail.adapter.MovieShortCommentAdapter;
import com.db.movie_detail.mvp.model.bean.MovieReviewsBean;
import com.db.movie_detail.mvp.model.bean.MovieShortCommentsBean;
import com.db.movie_detail.mvp.presenter.impl.MovieCommentListPresenterImpl;
import com.db.movie_detail.mvp.view.IMovieCommentListView;
import com.db.widget.fragment.BaseFragment;
import com.db.widget.recyclerview.animation.CustomAnimation;

import java.util.ArrayList;

public class MovieCommentListFragment extends BaseFragment implements IMovieCommentListView {

    private static final String KEY_TITLE = "movie_comment";

    private static final String KEY_TYPE = "movie_comment";

    private static final String KEY_MOVIE_ID = "movie_id";

    private static final int TYPE_SHORT_COMMENT = 1;

    private static final int TYPE_REVIEW = 2;

    private TextView tv_title;

    private LinearLayout ll_toolbar;

    private RecyclerView recycler_view, film_maker_recycler_view;

    private MovieCommentListPresenterImpl presenter;

    private MovieShortCommentAdapter listAdapter;

    private Context context;

    //标题改变的滑动高度
    private int changeHeight;

    //已经滑动的距离
    private int mDistance = 0;

    private int bg_rgb;

    //页面标题
    private String title = "";

    //电影的ID
    private String movieId = "";

    //判断是短评还是影评
    private int type = 1;

    public static MovieCommentListFragment newInstance() {
        return newInstance(1, "", "");
    }

    public static MovieCommentListFragment newInstance(int type, String title, String movieId) {
        MovieCommentListFragment fragment = new MovieCommentListFragment();
        Bundle args = new Bundle();
        args.putString(KEY_MOVIE_ID, movieId);
        args.putString(KEY_TITLE, title);
        args.putInt(KEY_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_comment_list, container, false);

        tv_title = (TextView) view.findViewById(R.id.tv_title);
        recycler_view = (RecyclerView) view.findViewById(R.id.rl_movie_comment);
        ll_toolbar = (LinearLayout) view.findViewById(R.id.ll_movie_comment_toolbar);

        context = view.getContext();

        movieId = getArguments().getString(KEY_MOVIE_ID);

        title = getArguments().getString(KEY_TITLE);

        type = getArguments().getInt(KEY_TYPE);

        initView();

        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if (savedInstanceState == null && !TextUtils.isEmpty(movieId)) {
            if (type == TYPE_SHORT_COMMENT)
                presenter.getMovieShortCommentList(movieId, "0b2bdeda43b5688921839c8ecb20399b", "0", "5");
            else if (type == TYPE_REVIEW)
                presenter.getMovieReviewList(movieId, "0b2bdeda43b5688921839c8ecb20399b", "0", "5");
        }
    }

    private void initView() {

        //初始化MVP
        presenter = new MovieCommentListPresenterImpl(this);

        //设置RecyclerView
        listAdapter = new MovieShortCommentAdapter(new ArrayList<>());
        listAdapter.openLoadAnimation(new CustomAnimation());

        recycler_view.setLayoutManager(new LinearLayoutManager(context));
        recycler_view.setAdapter(listAdapter);

        //其他设置
        if (!TextUtils.isEmpty(title)) {
            if (type == TYPE_SHORT_COMMENT)
                tv_title.setText(getString(R.string.movie_title_short_comment));
            else if (type == TYPE_REVIEW)
                tv_title.setText(getString(R.string.movie_title_review));
        }

    }

//    private void initListener() {
//        ViewTreeObserver vto = iv_movie.getViewTreeObserver();
//        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                changeHeight = tv_movie_src.getTop();
//                iv_movie.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//                recycler_view.addOnScrollListener(new RecyclerView.OnScrollListener() {
//                    @Override
//                    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//
//                        super.onScrolled(recyclerView, dx, dy);
//                        mDistance += dy;
//                        if (mDistance > 0 && mDistance < fl_img.getBottom() - ll_background.getHeight()) {
//                            ll_background.setAlpha(1);
//                            ll_background.setBackgroundColor(getResources().getColor(R.color.color_gray_3));
//                        } else {
//                            ll_background.setBackgroundColor(bg_rgb);
//                            float scale = (float) mDistance / changeHeight;
//                            ll_background.setAlpha(scale);
//                        }
//
//                        if (mDistance > changeHeight - ll_background.getHeight())
//                            tv_title.setText(title);
//                        else
//                            tv_title.setText(R.string.movie_detail_title);
//                    }
//                });
//            }
//        });
//    }

    @Override
    public void showError(String message) {
        ToastUtils.showShort(message);
    }

    @Override
    public void updateShortComment(MovieShortCommentsBean bean) {
        listAdapter.addData(bean.getComments());
    }

    @Override
    public void updateReview(MovieReviewsBean bean) {

    }
}
