package com.magicsoft.anim.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.magicsoft.anim.R;

public class MyToast2 {
    public static final String TAG="MMM";
    private static Toast mToast;
    private volatile static MyToast2 instance;
    private static CharSequence mText;
    private MyToast2(Context context, CharSequence text, int duration) {
        View v = LayoutInflater.from(context).inflate(R.layout.eplay_toast, null);
        if (mToast==null){
            mToast = new Toast(context);
            mToast.setDuration(duration);
            setText(text);
            mToast.setView(v);
        }
    }

    public  MyToast2 setText(CharSequence text){
        if (mToast!=null&& !TextUtils.isEmpty(text)){
            TextView tv = mToast.getView().findViewById(R.id.textView1);
            tv.setText(text);
        }
        return this;
    }



    public static MyToast2 makeText(Context context, CharSequence text, int duration) {
        if (instance==null){
            synchronized (MyToast2.class){
                if (instance==null) {
                    return new MyToast2(context, text, duration);
                }
            }
        }
        mText=text;
       return instance;
    }

    public static MyToast2 makeText(Context context,int duration) {
        if (instance==null){
            return new MyToast2(context, "", duration);
        }
        return instance;
    }

    public void show() {
        if (mToast != null) {
            mToast.show();
        }
    }
    public MyToast2 setGravity(int gravity, int xOffset, int yOffset) {
        if (mToast != null) {
            mToast.setGravity(gravity, xOffset, yOffset);
        }
        return this;
    }


}