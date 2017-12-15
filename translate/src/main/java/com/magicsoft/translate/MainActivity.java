package com.magicsoft.translate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.magicsoft.translate.activity.FragmentActivity;
import com.magicsoft.translate.activity.ImageViewActivity;
import com.magicsoft.translate.activity.UseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void imageview(View view) {
        startActivity(new Intent(this, ImageViewActivity.class));
    }

    public void fragment(View view) {
        startActivity(new Intent(this, FragmentActivity.class));
    }

    public void activity(View view) {
        startActivity(new Intent(this, UseActivity.class));
    }

    public void listClick(View view) {

    }
}
