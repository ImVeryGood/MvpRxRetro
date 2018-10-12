package com.newdicooker.tempetek.mvprxretro.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by SPC
 * on 2018/10/12
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

public abstract class BaseActivity<V extends MvpView, T extends BasePresenter<V>> extends AppCompatActivity {
    public T prestener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prestener = creatPrestener();
        prestener.attch((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        prestener.deAttch();
    }

    public abstract T creatPrestener();
}
