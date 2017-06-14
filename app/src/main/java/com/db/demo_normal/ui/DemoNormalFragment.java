package com.db.demo_normal.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.db.R;
import com.db.demo_normal.mvp.presenter.impl.DemoNormalPresenterImpl;
import com.db.demo_normal.mvp.view.IDemoNormalView;
import com.db.util.ProgressUtil;
import com.db.widget.fragment.BaseFragment;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DemoNormalFragment extends BaseFragment implements IDemoNormalView {

    private static final String KEY = "key";

    //    @BindView(R.id.toolbar_iv_back)
    ImageView toolbarIvBack;
    //    @BindView(R.id.toolbar_tv_title)
    TextView toolbarTvTitle;
    //    @BindView(R.id.layout_toolbar)
    RelativeLayout layoutToolbar;

    private Context context;
    private DemoNormalPresenterImpl presenter;

    public static DemoNormalFragment newInstance() {
        return newInstance("");
    }

    public static DemoNormalFragment newInstance(String game_type) {
        DemoNormalFragment fragment = new DemoNormalFragment();
        Bundle args = new Bundle();
        args.putString(KEY, game_type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_demo_normal, container, false);
        ButterKnife.bind(this, view);
        toolbarIvBack = (ImageView) view.findViewById(R.id.toolbar_iv_back);
        toolbarTvTitle = (TextView) view.findViewById(R.id.toolbar_tv_title);
        layoutToolbar = (RelativeLayout) view.findViewById(R.id.layout_toolbar);

        context = view.getContext();

        initView();

        return attachToSwipeBack(view);//关联侧滑返回return attachToSwipeBack(view);  否则直接return view;
    }

    private void initView() {
        //初始化MVP
        presenter = new DemoNormalPresenterImpl(this);

        //设置TitleBar
        layoutToolbar.setBackgroundColor(ContextCompat.getColor(context, R.color.color_primary));
        toolbarIvBack.setVisibility(View.VISIBLE);
        toolbarTvTitle.setVisibility(View.VISIBLE);
        toolbarTvTitle.setText(getString(R.string.app_name));

        //设置其他View
    }

    @Override
    public void showError(String message) {
        ProgressUtil.dismiss();
        ToastUtils.showShort(message);
    }

    @OnClick({R.id.toolbar_iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.toolbar_iv_back:
                pop();
                break;
            default:
                break;
        }
    }
}
