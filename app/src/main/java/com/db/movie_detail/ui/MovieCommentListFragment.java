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
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.SimpleClickListener;
import com.db.API;
import com.db.R;
import com.db.movie_detail.adapter.MovieReviewAdapter;
import com.db.movie_detail.adapter.MovieShortCommentAdapter;
import com.db.movie_detail.mvp.model.bean.MovieReviewsBean;
import com.db.movie_detail.mvp.model.bean.MovieShortCommentsBean;
import com.db.movie_detail.mvp.presenter.impl.MovieCommentListPresenterImpl;
import com.db.movie_detail.mvp.view.IMovieCommentListView;
import com.db.widget.fragment.BaseFragment;
import com.db.widget.recyclerview.CustomLoadMoreView;
import com.db.widget.recyclerview.animation.CustomAnimation;

import java.util.ArrayList;

public class MovieCommentListFragment extends BaseFragment implements IMovieCommentListView,
        BaseQuickAdapter.RequestLoadMoreListener {

    private static final String KEY_TITLE = "movie_title";

    private static final String KEY_TYPE = "movie_type";

    private static final String KEY_MOVIE_ID = "movie_id";

    private static final int TYPE_SHORT_COMMENT = 1;

    private static final int TYPE_REVIEW = 2;

    private TextView tv_title;

    private LinearLayout ll_toolbar;

    private RecyclerView recycler_view;

    private MovieCommentListPresenterImpl presenter;

    private MovieShortCommentAdapter listAdapter;

    private MovieReviewAdapter reviewAdapter;

    private Context context;

    //请求网页链接
    private String url = "";

    //页面标题
    private String title = "";

    //电影的ID
    private String movieId = "";

    //判断是短评还是影评
    private int type = 1;

    //请求列表的第一个数据的位置
    private int offset = 0;

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
            requestList();
        }
    }

    private void requestList() {
        if (type == TYPE_SHORT_COMMENT)
            presenter.getMovieShortCommentList(movieId, "0b2bdeda43b5688921839c8ecb20399b", offset + "", "20");
        else if (type == TYPE_REVIEW)
            presenter.getMovieReviewList(movieId, "0b2bdeda43b5688921839c8ecb20399b", offset + "", "20");
    }

    private void initView() {

        //初始化MVP
        presenter = new MovieCommentListPresenterImpl(this);

        //设置RecyclerView
        if (type == 1) {
            listAdapter = new MovieShortCommentAdapter(new ArrayList<>());
            listAdapter.openLoadAnimation(new CustomAnimation());
            listAdapter.setAutoLoadMoreSize(API.LIMIT);//加载更多的触发条件
            listAdapter.setOnLoadMoreListener(this, recycler_view);//加载更多回调监听
            listAdapter.setLoadMoreView(new CustomLoadMoreView());

            recycler_view.setLayoutManager(new LinearLayoutManager(context));
            recycler_view.setAdapter(listAdapter);
        } else if (type == 2) {
            reviewAdapter = new MovieReviewAdapter(new ArrayList<>());
            reviewAdapter.openLoadAnimation(new CustomAnimation());
            reviewAdapter.setAutoLoadMoreSize(API.LIMIT);//加载更多的触发条件
            reviewAdapter.setOnLoadMoreListener(this, recycler_view);//加载更多回调监听
            reviewAdapter.setLoadMoreView(new CustomLoadMoreView());

            recycler_view.setLayoutManager(new LinearLayoutManager(context));
            recycler_view.setAdapter(reviewAdapter);

            recycler_view.addOnItemTouchListener(new SimpleClickListener() {
                @Override
                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                    MovieReviewsBean.ReviewsBean bean = (MovieReviewsBean.ReviewsBean) adapter.getData().get(position);
                    start(MovieReviewDetailFragment.newInstance(bean.getAlt()));
                }

                @Override
                public void onItemLongClick(BaseQuickAdapter adapter, View view, int position) {

                }

                @Override
                public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {

                }

                @Override
                public void onItemChildLongClick(BaseQuickAdapter adapter, View view, int position) {

                }
            });
        }

        //其他设置
        if (!TextUtils.isEmpty(title)) {
            if (type == TYPE_SHORT_COMMENT)
                tv_title.setText(getString(R.string.movie_title_short_comment, title));
            else if (type == TYPE_REVIEW)
                tv_title.setText(getString(R.string.movie_title_review, title));
        }

    }

    @Override
    public void showError(String message) {
        ToastUtils.showShort(message);
    }

    @Override
    public void updateShortComment(MovieShortCommentsBean bean) {
        this.offset = this.offset + bean.getComments().size();
        listAdapter.addData(bean.getComments());
//        refresh_layout.setRefreshing(false);
        if (bean.getComments().size() < API.LIMIT)
            listAdapter.loadMoreEnd(true);
        else
            listAdapter.loadMoreComplete();
    }

    @Override
    public void updateReview(MovieReviewsBean bean) {
        this.offset = this.offset + bean.getReviews().size();
        reviewAdapter.addData(bean.getReviews());
//        refresh_layout.setRefreshing(false);
        if (bean.getReviews().size() < API.LIMIT)
            reviewAdapter.loadMoreEnd(true);
        else
            reviewAdapter.loadMoreComplete();
    }

    @Override
    public void onLoadMoreRequested() {
        requestList();
    }
}
