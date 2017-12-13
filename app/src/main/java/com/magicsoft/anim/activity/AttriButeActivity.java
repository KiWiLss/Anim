package com.magicsoft.anim.activity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

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

    public static final String TAG = "MMM";
    private ImageView mImg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute);
        mImg = (ImageView) findViewById(R.id.img_attribute_icon);


        //方法一
        //AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animator);//在xml中已经设置了动画,可以直接调用
        //方法二
        LinearLayout ll = (LinearLayout) findViewById(R.id.ll_attribute_layoutanim);
        //设置过渡动画
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1);
        scaleAnimation.setDuration(2000);
        //设置布局动画的显示属性,第一个参数是动画,第二个参数是每个控件完成动画的延迟,为0时不能设置执行顺序
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(scaleAnimation, 0.5f);
        //设置执行顺序,LayoutAnimationController.ORDER_NORMAL,顺序;ORDER_RANDOM,随机;ORDER_REVERSE逆序
        layoutAnimationController.setOrder(LayoutAnimationController.ORDER_NORMAL);
        ll.setLayoutAnimation(layoutAnimationController);
    }

    public void alpha(View view) {
        //ObjectAnimator objectAnimator = new ObjectAnimator();
        ObjectAnimator alpha = ObjectAnimator.ofFloat(mImg, "alpha", 1.0f, 0.5f, 0.1f, 0.5f, 1.0f);
        alpha.setDuration(4000);
        alpha.setInterpolator(new AccelerateDecelerateInterpolator());
        alpha.start();
    }

    public void rotate(View view) {
        //rotation绕屏幕的z轴旋转;rotationX绕屏幕的x轴旋转;rotationY绕屏幕的y轴旋转
        ObjectAnimator rotate = ObjectAnimator.ofFloat(mImg, "rotationX", 0, 45, 90, 180);
        rotate.setDuration(3000);
        rotate.setRepeatCount(1);
        rotate.setRepeatMode(ValueAnimator.REVERSE);


        rotate.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                Log.e(TAG, "onAnimationStart: ****" );
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                //super.onAnimationEnd(animation);
                Log.e(TAG, "onAnimationEnd: ****" );
            }
        });
        rotate.start();
      /*  rotate.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                Log.e(TAG, "onAnimationStart: " );
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                Log.e(TAG, "onAnimationEnd: " );
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                Log.e(TAG, "onAnimationCancel: " );
            }

            @Override
            public void onAnimationRepeat(Animator animator) {
                Log.e(TAG, "onAnimationRepeat: " );
            }
        });*/
    }

    public void translate(View view) {
        ObjectAnimator translateX = ObjectAnimator.ofFloat(mImg, "translationX", 0, 100, 200);
        translateX.setDuration(2000);
        ObjectAnimator translateY = ObjectAnimator.ofFloat(mImg, "translationY", 0, 100);
        translateY.setDuration(2000);
        translateX.start();
        translateY.start();

    }

    public void scale(View view) {
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(mImg, "scaleX", 1, 0.5f, 1.0f,2,3);
        scaleX.setDuration(3000);
        scaleX.start();
    }

    public void set(View view) {
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(mImg, "scaleX", 1, 0.5f, 1.0f,2,3);
        scaleX.setDuration(3000);

        ObjectAnimator translateX = ObjectAnimator.ofFloat(mImg, "translationX", 0, 100, 200);
        translateX.setDuration(3000);

        //一起执行
//        scaleX.start();
//        translateX.start();
        //一起执行
        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.play(scaleX).with(translateX);
//        animatorSet.start();
        //先后执行
        animatorSet.play(scaleX).before(translateX);
        animatorSet.start();
    }

    public void xmlset(View view) {
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.anim_alpha);
        //设置控件
        animator.setTarget(mImg);
        //开启动画
        animator.start();

    }

    public void propertyVaules(View view) {//帮助同时控制多个动画
        PropertyValuesHolder scaleX = PropertyValuesHolder.ofFloat("scaleX", 1, 0.5f, 2);
        PropertyValuesHolder translationX = PropertyValuesHolder.ofFloat("translationX", 100, 200, 300);

        ObjectAnimator.ofPropertyValuesHolder(mImg,scaleX,translationX).setDuration(2000).start();

    }

    public void valueanimator(View view) {

        ValueAnimator valueAnimator = ValueAnimator.ofFloat(1, 0, 1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float result= (float) valueAnimator.getAnimatedValue();
                mImg.setAlpha(result);
            }
        });
        valueAnimator.setDuration(2000);
        //valueAnimator.setTarget(mImg);
        valueAnimator.start();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void animator(View view) {
        mImg.animate()
                .alpha(0.5f)
                .x(300)
                .setDuration(2000)
                .withStartAction(new Runnable() {
                    @Override
                    public void run() {
                        Log.e(TAG, "run: "+ Thread.currentThread().getName());
                    }
                }).withEndAction(new Runnable() {
            @Override
            public void run() {
                Log.e(TAG, "run: ***"+ Thread.currentThread().getName());
            }
        }).start();
    }
}
