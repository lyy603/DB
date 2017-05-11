package com.db.hot_show.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.ToastUtils;
import com.db.API;
import com.db.R;
import com.db.hot_show.mvp.model.bean.ShowingListBean;
import com.db.hot_show.mvp.presenter.impl.ShowingListPresenterImpl;
import com.db.hot_show.mvp.view.IShowingListView;
import com.db.util.ProgressUtil;
import com.db.widget.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

public class ShowingFragment extends BaseFragment implements IShowingListView {

    private static final String KEY = "hot_show_ing";

    RecyclerView recycler_view;

    private Context context;

    private ShowingListPresenterImpl presenter;

    private List<Fragment> fragmentList = new ArrayList<>();

    private List<String> selectedTitleList = new ArrayList<>();

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
                    "北京", "1", API.LIMIT + "");
    }

    private void initView() {

        //初始化MVP
        presenter = new ShowingListPresenterImpl(this);

        //初始化recyclerview

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
    public void updateRecyclerView(List<ShowingListBean> list) {

    }
}
