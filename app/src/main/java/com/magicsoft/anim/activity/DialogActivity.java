package com.magicsoft.anim.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.magicsoft.anim.R;

import me.drakeet.materialdialog.MaterialDialog;

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
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);



    }

    public void showOne(View view) {
        MaterialDialog materialDialog = new MaterialDialog(this);
        materialDialog.show();
    }
}
