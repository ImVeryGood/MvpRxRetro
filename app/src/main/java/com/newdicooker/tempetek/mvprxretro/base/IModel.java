package com.newdicooker.tempetek.mvprxretro.base;

import rx.functions.Action1;

/**
 * Created by SPC
 * on 2018/10/12
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

public interface IModel<T> extends MvpModel {
    void loadData(Action1<T> action1);
}
