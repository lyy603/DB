package com.db.weather.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.weather.mvp.model.bean.FutureWeatherListBean;

import java.util.List;


public class DemoListAdapter extends BaseQuickAdapter<FutureWeatherListBean, BaseViewHolder> {


    public DemoListAdapter(List<FutureWeatherListBean> data) {
        super(R.layout.item_demo_list_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, FutureWeatherListBean bean) {

    }
}
