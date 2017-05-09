package com.dblyy.root.ui;

import android.os.Bundle;

import com.dblyy.R;
import com.dblyy.main.ui.MainFragment;
import com.dblyy.widget.activity.BaseActivity;


/**
 * author: LMJ
 * date: 2016/9/1
 */
public class RootActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        loadRootFragment(R.id.layout_container, MainFragment.newInstance());
    }
}
