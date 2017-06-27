package com.db.weather.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.weather.mvp.model.bean.FutureWeatherBean;

import java.util.List;

public class WeatherListAdapter extends BaseQuickAdapter<FutureWeatherBean.WeatherBean.FutureBean, BaseViewHolder> {


    public WeatherListAdapter(List<FutureWeatherBean.WeatherBean.FutureBean> data) {
        super(R.layout.item_weather, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, FutureWeatherBean.WeatherBean.FutureBean bean) {

        String[] text = bean.getText().split("/");
        if (text.length < 2)
            text[1] = text[0];

        viewHolder.setText(R.id.tv_date, bean.getDay())
                .setText(R.id.tv_date_2, bean.getDate())
                .setText(R.id.tv_weather_src_low, text[1])
                .setText(R.id.tv_weather_src_height, text[0]);
    }
}
