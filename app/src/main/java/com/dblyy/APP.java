package com.dblyy;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.utils.SPUtils;
import com.blankj.utilcode.utils.ToastUtils;
import com.blankj.utilcode.utils.Utils;
import com.miguelbcr.ui.rx_paparazzo2.RxPaparazzo;
import com.squareup.leakcanary.LeakCanary;

/**
 * 作者：lyy on 2017/5/9 14:13
 */

public class App extends Application {

    protected static App instance;
    private SPUtils spUtils;

    public static SPUtils getSpUtils() {
        return getInstance().spUtils;
    }

    public static App getInstance() {
        return instance;
    }

    public static Context getContext() {
        return getInstance().getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        LeakCanary.install(this);
        Utils.init(getApplicationContext());
        ToastUtils.init(true);
        spUtils = new SPUtils(getString(R.string.app_name));
        RxPaparazzo.register(this);
    }
}
