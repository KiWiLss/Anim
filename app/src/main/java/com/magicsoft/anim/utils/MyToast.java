package com.magicsoft.anim.utils;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.magicsoft.anim.R;

public class MyToast {
    public static final String TAG="MMM";
    private static Toast mToast;
    private static MyToast instance;
    private MyToast(Context context, CharSequence text, int duration) {
        View v = LayoutInflater.from(context).inflate(R.layout.eplay_toast, null);
        TextView textView = (TextView) v.findViewById(R.id.textView1);
        textView.setText(text);
        if (mToast==null){
            mToast = new Toast(context);
            mToast.setDuration(duration);
            mToast.setView(v);
            Log.e(TAG, "MyToast: toast create" );
        }
        Log.e(TAG, "MyToast: set view" );
    }

    public static MyToast makeText(Context context, CharSequence text, int duration) {
        if (instance==null){
            Log.e(TAG, "makeText: mytoast create" );
            return new MyToast(context, text, duration);
        }
        Log.e(TAG, "makeText:mytaost use " );
       return instance;
    }

    public void show() {
        if (mToast != null) {
            mToast.show();
            Log.e(TAG, "show: show");
        }
    }
    public MyToast setGravity(int gravity, int xOffset, int yOffset) {
        if (mToast != null) {
            mToast.setGravity(gravity, xOffset, yOffset);
        }
        return this;
    }


}