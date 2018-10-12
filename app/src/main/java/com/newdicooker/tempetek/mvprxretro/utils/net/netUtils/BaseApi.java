package com.newdicooker.tempetek.mvprxretro.utils.net.netUtils;

import rx.functions.Func1;

/**
 * Created by SPC
 * on 2018/9/26
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

public class BaseApi<T> implements Func1<BaseResultEntity<T>,T> {
    @Override
    public T call(BaseResultEntity<T> tBaseResultEntity) {
        return null;
    }
}
