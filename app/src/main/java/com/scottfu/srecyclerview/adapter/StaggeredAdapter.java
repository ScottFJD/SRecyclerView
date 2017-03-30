package com.scottfu.srecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scottfu.srecyclerview.adapter.BaseRecyclerAdapter;
import com.scottfu.srecyclerview.adapter.MyViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fujindong on 2017/3/29.
 */

public class StaggeredAdapter extends BaseRecyclerAdapter {

    private List<Integer> mHeights = new ArrayList<>();

    public StaggeredAdapter(Context context, List<String> datas) {
        super(context,datas);
        for (int i = 0; i < mDatas.size(); i++) {
            mHeights.add((int)(100+ Math.random()*300));
        }

    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDatas.get(position));
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        layoutParams.height = mHeights.get(position);
        holder.itemView.setLayoutParams(layoutParams);
        setUpItemEvent(holder);
    }




}


