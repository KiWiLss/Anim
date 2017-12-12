package com.magicsoft.anim;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.magicsoft.anim.activity.ToastActivity;
import com.magicsoft.anim.activity.ToastActivity2;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MMM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void goToNext(Class<?>clz){
        startActivity(new Intent(this,clz));
    }

    public void toast(View view) {
        goToNext(ToastActivity.class);
    }

    public void toast2(View view) {
        goToNext(ToastActivity2.class);
    }
}
