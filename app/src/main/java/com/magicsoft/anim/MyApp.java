package com.magicsoft.anim;

import android.app.Application;
import android.content.Context;

import com.coder.zzq.smartshow.toast.SmartToast;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: MyApp.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/12 9:44
 * @Changes (from 2017/12/12)
 * -----------------------------------------------------------------
 * 2017/12/12 : Create MyApp.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class MyApp extends Application {

    private static Context applicationContext;

    private static MyApp instance;
    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        instance=this;
        initAll();
    }

    private void initAll() {
        //使用默认样式
        SmartToast.plainToast(this);
    }

    public static Context getContext(){
        return applicationContext;
    }
    public static MyApp getInstance(){
        return instance;
    }
}
