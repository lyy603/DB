package com.db.movie_detail.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.db.R;
import com.db.movie_detail.mvp.model.bean.PersonDetailBean;

import java.util.List;


public class MovieDetailFilmMakerListAdapter extends BaseQuickAdapter<PersonDetailBean, BaseViewHolder> {

    private int mDirectorSize = 0;

    private String tag = "";

    public MovieDetailFilmMakerListAdapter(List<PersonDetailBean> data) {
        super(R.layout.item_film_maker, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, PersonDetailBean bean) {

        if (viewHolder.getAdapterPosition() < mDirectorSize)
            tag = "导演";
        else
            tag = "演员";

        viewHolder.setText(R.id.tv_name, bean.getName())
                .setText(R.id.tv_position, tag);

        Glide.with(mContext)
                .load(bean.getAvatars().getLarge())
                .centerCrop()
                .crossFade()
                .into((ImageView) viewHolder.getView(R.id.iv_avatar));
    }

    public void setDirectorSize(int size) {
        mDirectorSize = size;
    }
}
