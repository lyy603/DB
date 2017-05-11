package com.db.root.ui;

import android.os.Bundle;

import com.db.R;
import com.db.main.ui.MainFragment;
import com.db.widget.activity.BaseActivity;


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
