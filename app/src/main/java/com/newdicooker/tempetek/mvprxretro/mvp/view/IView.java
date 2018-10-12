package com.newdicooker.tempetek.mvprxretro.mvp.view;

import com.newdicooker.tempetek.mvprxretro.base.MvpView;
import com.newdicooker.tempetek.mvprxretro.bean.MovieBean;

/**
 * Created by SPC
 * on 2018/10/12
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

public interface IView extends MvpView {
    void showView(MovieBean movieBean);
}
