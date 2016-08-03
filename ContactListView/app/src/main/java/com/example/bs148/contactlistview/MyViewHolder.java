package com.example.bs148.contactlistview;

import android.support.v7.widget.RecyclerView;

import com.example.bs148.contactlistview.databinding.AdapterContactBinding;

class MyViewHolder extends RecyclerView.ViewHolder{
    private AdapterContactBinding binding;
    public MyViewHolder(AdapterContactBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }
    public void bindConnection(User obj){
        binding.setUser(obj);
    }
}