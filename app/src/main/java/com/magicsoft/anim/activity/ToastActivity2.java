package com.magicsoft.anim.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;

import com.magicsoft.anim.R;
import com.magicsoft.anim.utils.MyToast2;
import com.magicsoft.anim.utils.TUtils;
import com.magicsoft.anim.utils.TUtils2;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: ToastActivity2.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/12 11:53
 * @Changes (from 2017/12/12)
 * -----------------------------------------------------------------
 * 2017/12/12 : Create ToastActivity2.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class ToastActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast2);

       /* SmartToast.customToast(this)

                .view(R.layout.custom_toast)

                //下面的方法不是必须调用的

                .processCustomView(new ProcessViewCallback() {

                    @Override
                    public void processCustomView(View view) {

                        ((TextView) view.findViewById(R.id.custom_toast_msg))

                                .setTextColor(Color.WHITE);

                    }
                });*/


    }

    public void defaultBottom(View view) {
        //SmartToast.showAtLocation("自定义位置", Gravity.CENTER,0,0);
        MyToast2.makeText(getApplicationContext(),"自定义",0).setGravity(Gravity.CENTER,0,0).show();

    }

    public void defaultCenter(View view) {
        MyToast2.makeText(getApplicationContext(),0).setText("自定义再次").setGravity(Gravity.CENTER,0,0).show();
        //SmartToast.showInCenter("默认中间");
        //TUtils.show("默认中间", Gravity.CENTER);
        //MyToast.makeText(getApplicationContext(),"自定义换文字",0).show();


    }

    public void defaultTop(View view) {
        //SmartToast.showAtTop("默认顶部");
        TUtils.show("默认顶部",Gravity.TOP);
    }

    public void defaultClick(View view) {

        //SmartToast.show("默认样式");
        //ToastUtils.show(getApplicationContext(),"默认样式");
        //TUtils.toastCancle();
        TUtils2.show("默认样式");
    }

    public void longTime(View view) {
        //SmartToast.showLong("长时间默认样式");
        TUtils.showL("长时间默认样式");
    }

    public void longTimeCenter(View view) {
       // SmartToast.showLongInCenter("长时间中间");
    }

    public void simpleFalse(View view) {

    }

    public void simpleSure(View view) {

    }

    public void simple(View view) {

    }
}
