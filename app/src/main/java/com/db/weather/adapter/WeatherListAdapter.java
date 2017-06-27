package com.db.weather.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.weather.mvp.model.bean.DailyWeatherListBean;

import java.util.List;

public class WeatherListAdapter extends BaseQuickAdapter<DailyWeatherListBean.HourlyBean, BaseViewHolder> {


    public WeatherListAdapter(List<DailyWeatherListBean.HourlyBean> data) {
        super(R.layout.item_weather, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, DailyWeatherListBean.HourlyBean bean) {
    }
}
