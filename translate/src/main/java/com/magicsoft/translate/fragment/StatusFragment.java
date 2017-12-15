package com.magicsoft.translate.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kogitune.activity_transition.ActivityTransitionLauncher;
import com.magicsoft.translate.R;
import com.magicsoft.translate.activity.UseToActivity;

/**
 * -----------------------------------------------------------------
 * Copyright (C) 2014-2016, by your company, All rights reserved.
 * -----------------------------------------------------------------
 *
 * @File: StatusFragment.java
 * @Author: winding.kiwi.lss
 * @Version: V100R001C01
 * @Create: 2017/12/15 15:13
 * @Changes (from 2017/12/15)
 * -----------------------------------------------------------------
 * 2017/12/15 : Create StatusFragment.java (winding);
 * -----------------------------------------------------------------
 * @description ${DESCRIPTION}
 */

public class StatusFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_status, container, false);

        v.findViewById(R.id.img_fragment_status_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //发射
                Intent intent = new Intent(getContext(), UseToActivity.class);
                ActivityTransitionLauncher.with(getActivity())
                        .from(view)
                        .launch(intent);


            }
        });
        return v;
    }
}
