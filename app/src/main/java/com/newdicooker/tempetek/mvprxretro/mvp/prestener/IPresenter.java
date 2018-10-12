package com.newdicooker.tempetek.mvprxretro.mvp.prestener;

import com.newdicooker.tempetek.mvprxretro.base.BasePresenter;
import com.newdicooker.tempetek.mvprxretro.base.IModel;
import com.newdicooker.tempetek.mvprxretro.bean.MovieBean;
import com.newdicooker.tempetek.mvprxretro.mvp.model.MainModel;
import com.newdicooker.tempetek.mvprxretro.mvp.view.IView;

import rx.functions.Action1;

/**
 * Created by SPC
 * on 2018/10/12
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

public class IPresenter extends BasePresenter<IView> {
    private IModel<MovieBean> iModel;

    public IPresenter() {
        iModel = new MainModel();
    }

    public void load() {
        iModel.loadData(new Action1<MovieBean>() {
            @Override
            public void call(MovieBean movieBean) {
                getView().showView(movieBean);
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                getView().ShowError(throwable);
            }
        });
    }
}
