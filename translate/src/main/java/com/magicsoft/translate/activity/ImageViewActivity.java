package com.magicsoft.translate.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.magicsoft.translate.R;

import immortalz.me.library.TransitionsHeleper;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: ImageViewActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/15 10:15
 * @Changes (from 2017/12/15)
 * -----------------------------------------------------------------
 * 2017/12/15 : Create ImageViewActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class ImageViewActivity extends AppCompatActivity {
    String imgUrl = "http://imga.mumayi.com/android/wallpaper/2012/01/02/sl_600_2012010206150877826134.jpg";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        final ImageView iv = (ImageView) findViewById(R.id.iv1);

        Glide.with(this)
                .load(imgUrl)
                .centerCrop()
                .into(iv);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TransitionsHeleper.startActivity(ImageViewActivity.this, ImageDetailActivity.class, iv, imgUrl);
            }
        });
    }
}
