package com.magicsoft.translate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magicsoft.translate.R;

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

public class StatusFragment2 extends Fragment {

    public View mImg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_status, container, false);
        mImg = v.findViewById(R.id.img_fragment_status_icon);

        return v;
    }
}
