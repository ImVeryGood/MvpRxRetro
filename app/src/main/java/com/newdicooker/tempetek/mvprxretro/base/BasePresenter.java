package com.newdicooker.tempetek.mvprxretro.base;

import java.lang.ref.WeakReference;

/**
 * Created by SPC
 * on 2018/10/12
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

public class BasePresenter<V extends MvpView> {
    private WeakReference<V> weakReference;

    public void attch(V v) {
        weakReference = new WeakReference<V>(v);
    }

    public void deAttch() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    public V getView() {
        return weakReference.get();
    }
}
