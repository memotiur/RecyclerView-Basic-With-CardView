package com.i.androidbasic_1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoRecyclerView(View view) {
       CommunUtil.gotoNextActivity(this,RecyclerViewDemo.class);
    }
}
