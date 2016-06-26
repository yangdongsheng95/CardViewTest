package com.yds.cardviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DC on 2016/6/26.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    //上下文
    private Context context;

    //数据
    ArrayList<Card> data;

    //布局服务
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, ArrayList<Card> data) {
        this.context=context;
        this.data=data;

        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v=layoutInflater.inflate(R.layout.card_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Card card=data.get(position);

        holder.age.setText(card.getAge());
        holder.name.setText(card.getName());
    }

    @Override
    public int getItemCount() {
        return data==null? 0:data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView age;

        public ViewHolder(View itemView) {
            super(itemView);

            name= (TextView) itemView.findViewById(R.id.text_name);
            age= (TextView) itemView.findViewById(R.id.text_age);
        }
    }
}
