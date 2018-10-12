package com.newdicooker.tempetek.mvprxretro.mvp.model;

import com.newdicooker.tempetek.mvprxretro.base.IModel;
import com.newdicooker.tempetek.mvprxretro.bean.MovieBean;
import com.newdicooker.tempetek.mvprxretro.utils.net.retrofitUtils.DataLoader;

import rx.functions.Action1;

/**
 * Created by SPC
 * on 2018/10/12
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

public class MainModel implements IModel<MovieBean> {
    @Override
    public void loadData(Action1<MovieBean> action1) {
        new DataLoader().getMovies(0, 20).subscribe(action1);
    }
}
