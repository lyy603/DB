package com.db.hot_show.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.hot_show.mvp.model.bean.ShowingListBean;
import com.db.widget.rating_bar.MaterialRatingBar;

import java.util.List;


public class ShowingListAdapter extends BaseQuickAdapter<ShowingListBean.SubjectsBean, BaseViewHolder> {

    private String director = "", leading_role = "";

    private MaterialRatingBar ratingBar;

    public ShowingListAdapter(List<ShowingListBean.SubjectsBean> data) {
        super(R.layout.item_showing_list_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, ShowingListBean.SubjectsBean bean) {

        ratingBar = viewHolder.getView(R.id.rating_bar);

        director = mContext.getString(R.string.hot_showing_director);
        leading_role = mContext.getString(R.string.hot_showing_leading_role);

        //拼接导演名称
//        for (int i = 0; i < bean.getDirectors().size(); i++) {
//            if (i != 0)
//                director = director + "/";
//            director = director + bean.getDirectors().get(i).getName();
//        }

        //拼接主演名称
        for (int i = 0; i < bean.getCasts().size(); i++) {
            if (i != 0)
                leading_role = leading_role + "/";
            leading_role = leading_role + bean.getCasts().get(i).getName();
        }

        ratingBar.setRating((float) bean.getRating().getAverage() / 2);

        viewHolder.setText(R.id.tv_title, bean.getTitle())
                .setText(R.id.tv_director, director + bean.getDirectors().get(0).getName())
                .setText(R.id.tv_leading_role, leading_role)
                .setText(R.id.tv_point, bean.getRating().getAverage() + "")
                .setText(R.id.tv_see_number, mContext.getString(R.string.hot_showing_collect_count, bean.getCollect_count() + ""))
                .setText(R.id.btn_buy, mContext.getString(R.string.hot_showing_buy_ticket))
                .addOnClickListener(R.id.btn_buy);

        Glide.with(mContext)
                .load(bean.getImages().getLarge())
                .crossFade()
                .into((ImageView) viewHolder.getView(R.id.iv_movie));
    }
}
