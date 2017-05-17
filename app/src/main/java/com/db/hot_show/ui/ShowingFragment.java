package com.db.hot_show.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.ToastUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.db.API;
import com.db.R;
import com.db.hot_show.adapter.ShowingListAdapter;
import com.db.hot_show.mvp.model.bean.ShowingListBean;
import com.db.hot_show.mvp.presenter.impl.ShowingListPresenterImpl;
import com.db.hot_show.mvp.view.IIsChildRequestScrollListener;
import com.db.hot_show.mvp.view.IShowingListView;
import com.db.util.ProgressUtil;
import com.db.widget.fragment.BaseFragment;
import com.db.widget.recyclerview.CustomLoadMoreView;
import com.db.widget.recyclerview.animation.CustomAnimation;

import java.util.ArrayList;

import butterknife.OnClick;

public class ShowingFragment extends BaseFragment implements IShowingListView,
        BaseQuickAdapter.RequestLoadMoreListener,IIsChildRequestScrollListener {

    private static final String KEY = "hot_show_ing";

    RecyclerView recycler_view;

    private Context context;

    private ShowingListPresenterImpl presenter;

    private ShowingListAdapter listAdapter;

    //列表当前页码
    private String count = "1";

    public static ShowingFragment newInstance() {
        return newInstance("");
    }

    static ShowingFragment newInstance(String game_type) {
        ShowingFragment fragment = new ShowingFragment();
        Bundle args = new Bundle();
        args.putString(KEY, game_type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_showing, container, false);
        recycler_view = (RecyclerView) view.findViewById(R.id.recycler_view_showing);

        context = view.getContext();

        initView();

        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if (savedInstanceState == null)
            presenter.getShowingList("0b2bdeda43b5688921839c8ecb20399b",
                    "北京", count, API.LIMIT + "");
    }

    private void initView() {

        //初始化MVP
        presenter = new ShowingListPresenterImpl(this);

        //初始化recyclerview
        listAdapter = new ShowingListAdapter(new ArrayList<>());
        listAdapter.openLoadAnimation(new CustomAnimation());
        listAdapter.setAutoLoadMoreSize(API.LIMIT);//加载更多的触发条件
        listAdapter.setOnLoadMoreListener(this, recycler_view);//加载更多回调监听
        listAdapter.setLoadMoreView(new CustomLoadMoreView());

        recycler_view.setLayoutManager(new LinearLayoutManager(context));
        recycler_view.setAdapter(listAdapter);

    }

    @Override
    public void showError(String message) {
        ProgressUtil.dismiss();
        ToastUtils.showShortToast(message);
    }

    @OnClick({R.id.toolbar_iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            default:
                break;
        }
    }

    @Override
    public void updateRecyclerView(ShowingListBean listBean) {
        this.count = listBean.getStart() + 1 + "";
        listAdapter.addData(listBean.getSubjects());
    }

    @Override
    public void onLoadMoreRequested() {
        presenter.getShowingList("0b2bdeda43b5688921839c8ecb20399b",
                "北京", count, API.LIMIT + "");
    }

    @Override
    public boolean requestScroll(boolean up, boolean shouldNotRefresh) {
        //向上滑动,并且 mRecyclerView 可以上滑动
        return (up && ViewCompat.canScrollVertically(recycler_view, 1)) ||
                //向下滑动,且可以下滑或者(可以刷新,且不在初始位置,不在顶部)
                (!up && (ViewCompat.canScrollVertically(recycler_view, -1) ||
                        (!shouldNotRefresh&&((LinearLayoutManager) recycler_view.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0)));

    }
}
