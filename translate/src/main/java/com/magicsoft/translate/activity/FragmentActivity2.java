package com.magicsoft.translate.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.kogitune.activity_transition.ActivityTransition;
import com.kogitune.activity_transition.ExitActivityTransition;
import com.magicsoft.translate.R;
import com.magicsoft.translate.fragment.StatusFragment2;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: FragmentActivity.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/15 14:57
 * @Changes (from 2017/12/15)
 * -----------------------------------------------------------------
 * 2017/12/15 : Create FragmentActivity.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class FragmentActivity2 extends AppCompatActivity {

    private ExitActivityTransition start;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                supportFragmentManager.beginTransaction();
        StatusFragment2 statusFragment2 = new StatusFragment2();
        fragmentTransaction.add(R.id.fl_fragment_one,statusFragment2).commit();

        start = ActivityTransition.with(getIntent())
                .to(statusFragment2.mImg)
                .start(savedInstanceState);


    }

    @Override
    public void onBackPressed() {
        start.exit(this);
    }
}
