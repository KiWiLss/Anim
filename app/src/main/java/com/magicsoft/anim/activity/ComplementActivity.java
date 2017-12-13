package com.magicsoft.anim.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.magicsoft.anim.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: ComplementActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/12 17:25
 * @Changes (from 2017/12/12)
 * -----------------------------------------------------------------
 * 2017/12/12 : Create ComplementActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class ComplementActivity extends AppCompatActivity {

    private ImageView mImgIcon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complement);

        mImgIcon = (ImageView) findViewById(R.id.img_complement_icon);




    }

    public void alphaClick(View view) {
        //获取动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        //加载动画
        mImgIcon.startAnimation(animation);

    }

    public void translateClick(View view) {
        //获取动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_translatex);
        //加载动画
        mImgIcon.startAnimation(animation);
    }

    public void translateClicky(View view) {
        //获取动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_translatey);
        //加载动画
        mImgIcon.startAnimation(animation);
    }

    public void rotate(View view) {
        //获取动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_rotatex);
        //加载动画
        mImgIcon.startAnimation(animation);
    }

    public void scale(View view) {
        //获取动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        //加载动画
        mImgIcon.startAnimation(animation);

    }

    public void set(View view) {
        //获取动画
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
        //加载动画
        mImgIcon.startAnimation(animation);
    }

    public void alphaClick2(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        alphaAnimation.setDuration(2000);
        alphaAnimation.setFillBefore(true);
        //alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

        alphaAnimation.setRepeatCount(1);
        mImgIcon.startAnimation(alphaAnimation);



    }

    public void translate(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 200, 0, 100);
        translateAnimation.setDuration(2000);

        mImgIcon.startAnimation(translateAnimation);

    }

    public void rotate2(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 180,100,100);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setFillAfter(true);
        mImgIcon.startAnimation(rotateAnimation);
    }

    public void scale2(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 1,
                0, 1,
                Animation.RELATIVE_TO_PARENT, 0f,
                Animation.RELATIVE_TO_PARENT, 0f);
        scaleAnimation.setDuration(3000);
        scaleAnimation.setFillAfter(true);
        mImgIcon.startAnimation(scaleAnimation);
    }

    public void set2(View view) {

        AnimationSet animationSet = new AnimationSet(true);

        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 1,
                0, 1,
                Animation.RELATIVE_TO_PARENT, 0f,
                Animation.RELATIVE_TO_PARENT, 0f);

        //scaleAnimation.setFillAfter(true);

        RotateAnimation rotateAnimation = new RotateAnimation(0, 180,100,100);


        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(2000);
        mImgIcon.startAnimation(animationSet);
        //对动画监听
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
