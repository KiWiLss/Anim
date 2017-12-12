package com.magicsoft.anim.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.coder.zzq.smartshow.toast.ProcessViewCallback;
import com.coder.zzq.smartshow.toast.SmartToast;
import com.magicsoft.anim.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: ToastActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/12 9:40
 * @Changes (from 2017/12/12)
 * -----------------------------------------------------------------
 * 2017/12/12 : Create ToastActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class ToastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        SmartToast.plainToast(this)

                .backgroundColorRes(R.color.colorPrimary)

                .textColorRes(R.color.colorAccent)

                .textSizeSp(18)

                .textBold(true)

                .processPlainView(new ProcessViewCallback() {

                    @Override
                    public void processPlainView(LinearLayout outParent, TextView msgView) {

                        //添加左图标

                        Drawable d = ContextCompat.getDrawable(msgView.getContext(),

                                android.R.drawable.ic_menu_add);

                        d.setBounds(0,0,d.getIntrinsicWidth(),d.getIntrinsicHeight());

                        msgView.setCompoundDrawables(d,null,null,null);

                    }
                });
    }



    public void defaultBottom(View view) {
        SmartToast.showAtLocation("自定义位置", Gravity.CENTER,0,0);
    }

    public void defaultCenter(View view) {
        SmartToast.showInCenter("默认中间");
    }

    public void defaultTop(View view) {
        SmartToast.showAtTop("默认顶部");
    }

    public void defaultClick(View view) {
        SmartToast.show("默认样式");
        //ToastUtils.show(getApplicationContext(),"默认样式");
    }

    public void longTime(View view) {
        SmartToast.showLong("长时间默认样式");
    }

    public void longTimeCenter(View view) {
        SmartToast.showLongInCenter("长时间中间");
    }
}
