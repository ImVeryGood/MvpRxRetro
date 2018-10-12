package com.newdicooker.tempetek.mvprxretro.utils.net.netUtils;

/**
 * Created by SPC
 * on 2018/9/26
 * 邮箱：13027699936@163.com.
 * version 2.0.4
 */

/**
 * 回调信息统一封装类
 * Created by WZG on 2016/7/16.
 */
public class BaseResultEntity<T> {
    //  判断标示
    private int ret;
    //    提示信息
    private String msg;
    //显示数据（用户需要关心的数据）
    private T data;


}

