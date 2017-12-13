package com.magicsoft.anim.activity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.magicsoft.anim.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: AttriButeActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/13 11:41
 * @Changes (from 2017/12/13)
 * -----------------------------------------------------------------
 * 2017/12/13 : Create AttriButeActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class AttriButeActivity extends AppCompatActivity {

    private ImageView mImg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute);
        mImg = (ImageView) findViewById(R.id.img_attribute_icon);




    }

    public void alpha(View view) {
        //ObjectAnimator objectAnimator = new ObjectAnimator();
        ObjectAnimator alpha = ObjectAnimator.ofFloat(mImg, "alpha", 1.0f, 0.5f, 0.1f, 0.5f, 1.0f);
        alpha.setDuration(4000);
        alpha.start();
    }
}
