package com.magicsoft.anim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.magicsoft.anim.activity.ToastActivity;

public class MainActivity extends AppCompatActivity {

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
}
