package com.db.hot_show.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.hot_show.mvp.model.bean.ShowingListBean;

import java.util.List;


public class ShowingListAdapter extends BaseQuickAdapter<ShowingListBean.SubjectsBean, BaseViewHolder>{


    public ShowingListAdapter(List<ShowingListBean.SubjectsBean> data) {
        super(R.layout.item_showing_list_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, ShowingListBean.SubjectsBean bean) {

        viewHolder.setText(R.id.tv_title, bean.getTitle())
                .setText(R.id.tv_director, bean.getDirectors().get(0).getName())
                .setText(R.id.tv_leading_role, bean.getCasts().get(0).getName())
                .setText(R.id.btn_buy, mContext.getString(R.string.hot_showing_buy_ticket));

        Glide.with(mContext)
                .load(bean.getImages().getSmall())
                .crossFade()
                .centerCrop()
                .into((ImageView) viewHolder.getView(R.id.iv_movie));
    }
}
