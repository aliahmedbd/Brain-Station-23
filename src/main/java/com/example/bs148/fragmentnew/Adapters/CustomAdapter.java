package com.example.bs148.fragmentnew.Adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bs148.fragmentnew.POJO.Info;
import com.example.bs148.fragmentnew.R;


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
         private Activity activity;
         private ArrayList <Info> data;
         private LayoutInflater inflater=null;

         int i=0;
         public CustomAdapter(Activity a, ArrayList <Info> d) {
             activity = a;
             data=d;
             inflater = ( LayoutInflater )activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
              
         }
         public int getCount() {
             if(data.size()<=0)
                 return 1;
             return data.size();
         }
         public Object getItem(int position) {
             return position;
         }
         public long getItemId(int position) {
             return position;
         }
         public static class ViewHolder{
             public TextView txtNmae;
         }
         public View getView(int position, View convertView, ViewGroup parent) {
             View vi = convertView;
             ViewHolder holder;
             if(convertView==null){
                 vi = inflater.inflate(R.layout.player_list, null);
                 holder = new ViewHolder();
                 holder.txtNmae = (TextView) vi.findViewById(R.id.txtName);
                 vi.setTag( holder );
             }
             else 
                 holder=(ViewHolder)vi.getTag();
             if(data.size()<=0)
             {
                 holder.txtNmae.setText("No Data");
             }
             else
             {
                  holder.txtNmae.setText( data.get(position).getName() );
             }
             return vi;
         }
     }
