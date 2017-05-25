
package com.db.util;

import android.view.View;
import android.view.ViewGroup;

/**
 *  视图辅助工具类
 */
public class FreeHandViewUtil {

    /**
     * 设置视图的尺寸
     * 
     * @param view
     * @param width
     */
    public static void setViewSize(View view, int width, int height) {
        if (view == null)
            return;
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        if (lp == null) {
            lp = new ViewGroup.LayoutParams(width, height);
        }
        if (width != -1) {
            lp.width = width;
            view.setMinimumWidth(width);
        }
        if (height != -1) {
            lp.height = height;
            view.setMinimumHeight(height);
        }
        view.setLayoutParams(lp);
    }

    /**
     * 设置视图的宽度
     * 
     * @param view
     * @param width
     */
    public static void setViewWidth(View view, int width) {
        setViewSize(view, width, -1);
    }

    /**
     * 设置视图的高度
     * 
     * @param view
     * @param height
     */
    public static void setViewHeight(View view, int height) {
        setViewSize(view, -1, height);
    }
}
