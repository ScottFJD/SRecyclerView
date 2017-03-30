package com.scottfu.srecyclerview.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scottfu.srecyclerview.R;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by fujindong on 2017/3/30.
 */

public class CardViewAdapter extends RecyclerView.Adapter<MViewHolder>{

    private Context mContext;
    private LayoutInflater mInflater;
    private List<String> mDatas;

    public CardViewAdapter(Context context, List<String> datas) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mDatas = datas;
    }


    @Override
    public MViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MViewHolder(mInflater.inflate(R.layout.item_cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(MViewHolder holder, int position) {
        holder.mTextView.setText(mDatas.get(position));
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}

class MViewHolder extends RecyclerView.ViewHolder {
    public TextView mTextView;
    public CardView mCardView;
    public MViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.tv_text);
        mCardView = (CardView) itemView.findViewById(R.id.cv_content);
    }
}

