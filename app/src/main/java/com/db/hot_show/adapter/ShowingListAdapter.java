package com.db.hot_show.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.hot_show.mvp.model.bean.ShowingListBean;

import java.util.List;


public class ShowingListAdapter extends BaseQuickAdapter<ShowingListBean.SubjectsBean, BaseViewHolder> {


    public ShowingListAdapter(List<ShowingListBean.SubjectsBean> data) {
        super(R.layout.item_demo_list_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, ShowingListBean.SubjectsBean bean) {

    }
}
