package com.db.hot_show.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.blankj.utilcode.utils.ToastUtils;
import com.bumptech.glide.Glide;
import com.db.R;
import com.db.hot_show.mvp.view.IPhotoViewPagerView;
import com.db.util.ProgressUtil;
import com.db.widget.fragment.BaseFragment;

import butterknife.ButterKnife;

public class PhotoViewPagerFragment extends BaseFragment implements IPhotoViewPagerView {

    private static final String KEY = "hot_show_ing_pager";

    private String img = "http://img3.doubanio.com/view/photo/photo/public/p2457689105.webp";

    private ImageView imageView;

    private Context context;

    public static PhotoViewPagerFragment newInstance() {
        return newInstance("");
    }

    public static PhotoViewPagerFragment newInstance(String game_type) {
        PhotoViewPagerFragment fragment = new PhotoViewPagerFragment();
        Bundle args = new Bundle();
        args.putString(KEY, game_type);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_photo_viewpager, container, false);
        imageView = (ImageView) view.findViewById(R.id.iv_photo);

        ButterKnife.bind(this, view);

        context = view.getContext();

        initView();

        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
    }

    private void initView() {
        updateImageView(img);
    }

    @Override
    public void updateImageView(String img) {
        Glide.with(context)
                .load(img)
                .centerCrop()
                .crossFade()
                .into(imageView);
    }

    @Override
    public void showError(String message) {
        ProgressUtil.dismiss();
        ToastUtils.showShortToast(message);
    }
}
