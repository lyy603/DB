package com.dblyy.hot_show.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.SizeUtils;
import com.blankj.utilcode.utils.ToastUtils;
import com.dblyy.R;
import com.dblyy.demo_normal.ui.DemoNormalFragment;
import com.dblyy.hot_show.mvp.presenter.impl.DemoNormalPresenterImpl;
import com.dblyy.hot_show.mvp.view.IDemoNormalView;
import com.dblyy.util.ProgressUtil;
import com.dblyy.util.global.FragmentAdapter;
import com.dblyy.widget.fragment.BaseFragment;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ClipPagerTitleView;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

public class HotShowFragment extends BaseFragment implements IDemoNormalView {

    private static final String KEY = "key";

    //    @BindView(R.id.magic_indicator_hot_show)
    MagicIndicator magic_indicator_hot_show;

    //    @BindView(R.id.viewpager)
    ViewPager viewpager;

    private Context context;

    private DemoNormalPresenterImpl presenter;

    private List<Fragment> fragmentList = new ArrayList<>();

    private List<String> selectedTitleList = new ArrayList<>();

    public static HotShowFragment newInstance() {
        return newInstance("");
    }

    private static HotShowFragment newInstance(String game_type) {
        HotShowFragment fragment = new HotShowFragment();
        Bundle args = new Bundle();
        args.putString(KEY, game_type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hot_show, container, false);
        magic_indicator_hot_show = (MagicIndicator) view.findViewById(R.id.magic_indicator_hot_show);
        viewpager = (ViewPager) view.findViewById(R.id.viewpager);

        context = view.getContext();

        initView();

        return view;
    }

    private void initView() {

        //初始化MVP
        presenter = new DemoNormalPresenterImpl(this);

        //初始化viewpager
        String[] nameArray = getResources().getStringArray(R.array.hot_show_tname);
        for (String aTnameArray : nameArray)
            selectedTitleList.add(aTnameArray);

        fragmentList.add(DemoNormalFragment.newInstance("0"));
        fragmentList.add(DemoNormalFragment.newInstance("1"));
        FragmentAdapter fragmentAdapter = new FragmentAdapter(this.getChildFragmentManager(), fragmentList);
        viewpager.setAdapter(fragmentAdapter);
        viewpager.setOffscreenPageLimit(2);

        //设置magic_indicator
        CommonNavigator navigator = new CommonNavigator(context);
        navigator.setAdjustMode(true);
        navigator.setIndicatorOnTop(true);
        navigator.setSkimOver(true);
        navigator.setScrollPivotX(0.2f);

        CommonNavigatorAdapter navigatorAdapter = new CommonNavigatorAdapter() {
            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @Override
            public IPagerTitleView getTitleView(Context context, int i) {
                //框架提供样式，在滑动过程中，文字的颜色随着滑动变色
                ClipPagerTitleView clipPagerTitleView = new ClipPagerTitleView(context);
                clipPagerTitleView.setTextSize(SizeUtils.sp2px(18));
                clipPagerTitleView.setText(selectedTitleList.get(i));
                clipPagerTitleView.setBackgroundResource(R.color.color_white);
                clipPagerTitleView.setClipColor(ContextCompat.getColor(context, R.color.color_text_black));
                clipPagerTitleView.setTextColor(ContextCompat.getColor(context, R.color.color_text_subheading));
                clipPagerTitleView.setOnClickListener(v -> viewpager.setCurrentItem(i));
                return clipPagerTitleView;
            }

            @Override
            public IPagerIndicator getIndicator(Context context) {
                //指示器下方的横线
                LinePagerIndicator indicator = new LinePagerIndicator(context);
                indicator.setMode(LinePagerIndicator.MODE_MATCH_EDGE);
                indicator.setLineHeight(SizeUtils.px2dp(15));
                indicator.setRoundRadius(SizeUtils.px2dp(2));
                indicator.setYOffset(SizeUtils.px2dp(10f));
                indicator.setColors(ContextCompat.getColor(context, R.color.color_black_1));
                return indicator;
            }
        };
        navigator.setAdapter(navigatorAdapter);
        magic_indicator_hot_show.setNavigator(navigator);
        ViewPagerHelper.bind(magic_indicator_hot_show, viewpager);
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
}
