package com.i.androidbasic_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.i.androidbasic_1.adapter.ProductAdapter;
import com.i.androidbasic_1.model.Name;

import java.util.ArrayList;
public class RecyclerViewDemo extends AppCompatActivity {

    RecyclerView rvListDemo;
    private ArrayList<Name> mNameList;
    private ProductAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);

        initProperties();
    }

    private void initProperties() {
        rvListDemo = findViewById(R.id.rvListDemo);
        mNameList = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
          mNameList.add(new Name("Motiur "+ i, "SE"));
        }

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mAdapter = new ProductAdapter(this,mNameList);
        rvListDemo.setLayoutManager(mLayoutManager);
        rvListDemo.setItemAnimator(new DefaultItemAnimator());
        rvListDemo.setAdapter(mAdapter);

    }
}
