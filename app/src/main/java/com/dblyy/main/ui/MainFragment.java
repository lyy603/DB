package com.dblyy.main.ui;

import android.os.Bundle;

import com.dblyy.widget.fragment.BaseFragment;

/**
 * 作者：lyy on 2017/5/9 11:30
 */

public class MainFragment extends BaseFragment {

    private static final String KEY = "key";

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
}
