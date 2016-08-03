package com.example.bs148.contactlistview;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bs148.contactlistview.databinding.AdapterContactBinding;

import java.util.ArrayList;

/**
 * Created by BS148 on 8/3/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder>{
    ArrayList<User> list;

    CustomAdapter(ArrayList<User> list){
        this.list=list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AdapterContactBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.adapter_contact,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bindConnection(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
