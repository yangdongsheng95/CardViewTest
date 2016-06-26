package com.yds.cardviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //数据
    ArrayList<Card> data;

    //视图
    RecyclerView recyclerView;

    //适配器
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化数据
        data=new ArrayList<>();
        for (int i=0;i<18;i++){
            if (i%3==2){
                Card card=new Card("卡片"+i,"年龄"+i);
                data.add(card);
            }else {
                Card card=new Card("Interface to global information about an application environment.","年龄");
                data.add(card);
            }


        }

        //获得视图
        recyclerView= (RecyclerView) findViewById(R.id.recycleView);

        //设置LinearLayoutManager
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(
                        2,
                        StaggeredGridLayoutManager.VERTICAL
                )
        );

        //设置ItemAnimator
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //设置大小
        recyclerView.setHasFixedSize(true);

        //初始化自定义适配器
        adapter=new MyAdapter(this,data);

        //为recycleView设置适配器
        recyclerView.setAdapter(adapter);
    }
}
