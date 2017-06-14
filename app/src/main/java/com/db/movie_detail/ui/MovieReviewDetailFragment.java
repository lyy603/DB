package com.db.movie_detail.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.db.R;
import com.db.widget.fragment.BaseFragment;

public class MovieReviewDetailFragment extends BaseFragment {

    private static final String KEY_TITLE = "movie_title";

    private static final String KEY_TYPE = "movie_type";

    private static final String KEY_REVIEW_URL = "movie_review_url";

    private static final int TYPE_SHORT_COMMENT = 1;

    private static final int TYPE_REVIEW = 2;

    private WebView web_view;

    private TextView tv_title;

    private LinearLayout ll_toolbar;

    private Context context;

    //页面标题
    private String title = "";

    //请求网页链接
    private String url = "";

    public static MovieReviewDetailFragment newInstance() {
        return newInstance("");
    }

    public static MovieReviewDetailFragment newInstance(String url) {
        MovieReviewDetailFragment fragment = new MovieReviewDetailFragment();
        Bundle args = new Bundle();
        args.putString(KEY_REVIEW_URL, url);
//        args.putString(KEY_TITLE, title);
//        args.putInt(KEY_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_review_detail, container, false);

        web_view = (WebView) view.findViewById(R.id.web_view);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
        ll_toolbar = (LinearLayout) view.findViewById(R.id.ll_movie_comment_toolbar);

        context = view.getContext();

//        movieId = getArguments().getString(KEY_MOVIE_ID);

        url = getArguments().getString(KEY_REVIEW_URL);


        initView();

        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if (!TextUtils.isEmpty(url))
            web_view.loadUrl("http://movie.douban.com&review/8590553/");
    }

    private void initView() {

        //初始化MVP
//        presenter = new MovieCommentListPresenterImpl(this);

        //设置RecyclerView

        //其他设置

    }
}
