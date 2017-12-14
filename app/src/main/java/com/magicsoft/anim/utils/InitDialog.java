package com.magicsoft.anim.utils;

import android.app.Dialog;
import android.content.Context;

import com.magicsoft.anim.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: InitDialog.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/13 17:39
 * @Changes (from 2017/12/13)
 * -----------------------------------------------------------------
 * 2017/12/13 : Create InitDialog.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class InitDialog {
    Dialog dialog;


    private InitDialog(){}
    //private static InitDialog instance;


    public static InitDialog getInstance(){
        return InitDialogBean.INIT_DIALOG;
    }

    static class InitDialogBean{
        public static final InitDialog INIT_DIALOG=new InitDialog();
    }

    public void show(boolean isBlodBg,Context context){
            if (isBlodBg) {
                dialog=new Dialog(context, R.style.custom_dialog);
            }else {
                dialog=new Dialog(context, R.style.custom_dialog_false);
            }
            dialog.setContentView(R.layout.dialog_loading);
        dialog.show();
    }

    public void dismiss(){
        if (dialog!=null){
            dialog.dismiss();
            dialog=null;
        }
    }





}
