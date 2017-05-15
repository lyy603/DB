package com.db.hot_show.mvp.view;

import com.db.util.retrofit.exception.IErrorView;

/**
 * 作者：lyy on 2017/5/15 16:38
 */

public interface IPhotoViewPagerView extends IErrorView {

    void updateImageView(String img);//更新图片
}
