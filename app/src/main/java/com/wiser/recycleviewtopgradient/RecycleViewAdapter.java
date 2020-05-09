package com.wiser.recycleviewtopgradient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * **************************************
 * 项目名称:RecycleViewTopGradient
 *
 * @author wangxy
 * 邮箱：wangxianyu@ksjgs.com
 * 创建时间: 2020/5/9 5:41 PM
 * 用途：
 * **************************************
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;

    public RecycleViewAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class MViewHolder extends RecyclerView.ViewHolder{

        public MViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
