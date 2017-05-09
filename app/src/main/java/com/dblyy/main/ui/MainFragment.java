package com.dblyy.main.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.dblyy.R;
import com.dblyy.widget.fragment.BaseFragment;

import net.lucode.hackware.magicindicator.MagicIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：lyy on 2017/5/9 11:30
 */

public class MainFragment extends BaseFragment {

    private static final String KEY = "key";

    @BindView(R.id.layout_container)
    FrameLayout layout_container;

    @BindView(R.id.magic_indicator)
    MagicIndicator magic_indicator;

    private Context context;

    public static MainFragment newInstance() {
        return newInstance("");
    }

    private static MainFragment newInstance(String value) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(KEY, value);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(this, view);

        context = view.getContext();

        initView();

        return view;
    }

    private void initView() {
        //初始化MVP

        //设置RefreshLayout

        //设置RecyclerView

        /***设置其他View***/
        //Fragment相关

    }
}
