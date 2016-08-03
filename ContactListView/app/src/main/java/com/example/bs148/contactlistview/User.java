package com.example.bs148.contactlistview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

/**
 * Created by BS148 on 8/3/2016.
 */
public class User {
    private String name;
    private String phoneNumber;
    private Context context;

    public User(Context context){
        this.context=context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void onClick(View v){
        Intent i =new Intent(context,ContactListActivity.class);
        context.startActivity(i);
    }
}
