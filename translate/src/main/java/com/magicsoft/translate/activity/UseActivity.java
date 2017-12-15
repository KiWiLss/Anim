package com.magicsoft.translate.activity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.kogitune.activity_transition.ActivityTransitionLauncher;
import com.magicsoft.translate.R;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: UseActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/15 15:24
 * @Changes (from 2017/12/15)
 * -----------------------------------------------------------------
 * 2017/12/15 : Create UseActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class UseActivity extends AppCompatActivity {

    private ImageView mImgOne;
    private ImageView mImgTwo;
    private ImageView mImgThree;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use);

        mImgOne = (ImageView) findViewById(R.id.img_use_one);
        mImgTwo = (ImageView) findViewById(R.id.img_use_two);
        mImgThree = (ImageView) findViewById(R.id.img_use_three);

        mImgOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //发射
                Intent intent = new Intent(UseActivity.this, UseToActivity.class);
//                ActivityTransitionLauncher
//                        .with(UseActivity.this)
//                        .from(view)
//                        .launch(intent);

                Bundle transitionBundle = ActivityTransitionLauncher.with(UseActivity.this).from(view).createBundle();
                intent.putExtras(transitionBundle);
                startActivityForResult(intent, 2);
// you should prevent default activity transition animation
                overridePendingTransition(0, 0);

            }
        });

        mImgTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //发射
                Intent intent = new Intent(UseActivity.this, UseToActivity2.class);

                Bundle bundle = ActivityTransitionLauncher.with(UseActivity.this)
                        .from(view)
                        .image(BitmapFactory.decodeResource(getResources(), R.drawable.photo))
                        .createBundle();
                intent.putExtras(bundle);
                startActivityForResult(intent,1);
                overridePendingTransition(0,0);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){
            Log.e("MMM", "onActivityResult: " );
            if (requestCode==1){
                Log.e("MMM", "onActivityResult: 11111" );
            }
            if (requestCode==2){
                Log.e("MMM", "onActivityResult: 22222" );
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0,0);
    }
}
