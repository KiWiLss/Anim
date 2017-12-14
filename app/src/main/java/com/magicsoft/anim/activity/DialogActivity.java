package com.magicsoft.anim.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.magicsoft.anim.R;
import com.magicsoft.anim.utils.InitDialog;
import com.xiasuhuei321.loadingdialog.view.LoadingDialog;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: DialogActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/13 15:44
 * @Changes (from 2017/12/13)
 * -----------------------------------------------------------------
 * 2017/12/13 : Create DialogActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class DialogActivity extends AppCompatActivity {


    private LoadingDialog loadingDialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

       /* loadingDialog = new LoadingDialog(this);

        loadingDialog.setLoadingText("加载中");
        loadingDialog.setInterceptBack(true);
        loadingDialog.setDrawColor(Color.RED);

        loadingDialog.show();
        loadingDialog.close();*/

        //InitDialog.getInstance().show(false,this);


        final LoadingDialog ld = new LoadingDialog(this);
        ld.setLoadingText("加载中")
                .setSuccessText("加载成功")//显示加载成功时的文字
                //.setFailedText("加载失败")
                .setInterceptBack(true)
                //.setLoadSpeed(new LoadingDialog.Speed())
                //.setRepeatCount(repeatTime)
                .setDrawColor(Color.YELLOW)
                .show();

        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                ld.loadSuccess();
             InitDialog.getInstance().dismiss();
            }
        }, 5000);
    }

    public void showOne(View view) {
      /*  final MaterialDialog materialDialog = new MaterialDialog(this);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_custom, null);
        materialDialog.setView(dialogView);
        materialDialog.setCanceledOnTouchOutside(true);
        materialDialog.show();*/
       /* materialDialog.setCanceledOnTouchOutside(true);
        materialDialog.setTitle("简单测试");
        materialDialog.setMessage("随意测试");
       materialDialog.setPositiveButton("确定", new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               materialDialog.dismiss();
           }
       }).setNegativeButton("取消", new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               materialDialog.dismiss();
           }
       });
        materialDialog.show();*/
    }

    public void showOld(View view) {
       /* AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_custom, null);
        builder.setView(dialogView);
        builder.setCancelable(true);
        builder.show();*/
//        builder.setTitle("原生")
//                .setMessage("原生样式测试")
//                .setCancelable(true)
//                .setNegativeButton("取消",null)
//                .setPositiveButton("确定",null)
//                .create().show();
    }
}
