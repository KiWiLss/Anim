package com.magicsoft.anim.activity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.magicsoft.anim.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: FrameActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/12 15:46
 * @Changes (from 2017/12/12)
 * -----------------------------------------------------------------
 * 2017/12/12 : Create FrameActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class FrameActivity extends AppCompatActivity {

    private ImageView mImgOne;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        mImgOne = (ImageView) findViewById(R.id.img_frame_one);

    /*    //开启动画
        //mImgOne.setImageResource(R.drawable.lottery_animlist);
        AnimationDrawable drawable = (AnimationDrawable) mImgOne.getDrawable();
        drawable.start();*/

        //停止的方法
        //drawable.stop();


        //方法二
        testMethow();

    }

    private void testMethow() {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        for (int i = 0; i < 2; i++) {
            int id = getResources().getIdentifier("red990" + (i+1), "drawable", getPackageName());
            Drawable drawable = getResources().getDrawable(id);
        animationDrawable.addFrame(drawable,200);
        }
        animationDrawable.setOneShot(false);
        mImgOne.setImageDrawable(animationDrawable);
        animationDrawable.start();
    }
}
