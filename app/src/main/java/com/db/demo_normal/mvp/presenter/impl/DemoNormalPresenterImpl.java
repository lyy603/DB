package com.db.demo_normal.mvp.presenter.impl;

import com.db.demo_normal.mvp.presenter.IDemoNormalPresenter;
import com.db.demo_normal.mvp.view.IDemoNormalView;

public class DemoNormalPresenterImpl implements IDemoNormalPresenter {

    private final IDemoNormalView view;

    public DemoNormalPresenterImpl(IDemoNormalView view) {
        this.view = view;
    }
}
