package com.magicsoft.translate.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.magicsoft.translate.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: ImageDetailActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/15 10:24
 * @Changes (from 2017/12/15)
 * -----------------------------------------------------------------
 * 2017/12/15 : Create ImageDetailActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class ImageDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagedetail);

        ImageView iv = (ImageView) findViewById(R.id.iv_detail);
        final TextView tv = (TextView) findViewById(R.id.tv);




    }
}
