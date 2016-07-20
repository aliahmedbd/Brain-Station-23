package com.example.bs148.playerprofile;

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

import com.example.bs148.playerprofile.PlayersPojo.Info;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
         private Activity activity;
         private ArrayList <Info> data;
         private static LayoutInflater inflater=null;
         public Resources res;
         int i=0;
         public CustomAdapter(Activity a, ArrayList <Info> d,Resources resLocal) {
             activity = a;
             data=d;
             res = resLocal;
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
             public TextView txtTestHighScore;
             public TextView txtODIHighScore;

             public TextView txtODIAverage;
             public TextView txtTestAverage;
             public ImageView img_image;
             public LinearLayout list_layout;

         }
         public View getView(int position, View convertView, ViewGroup parent) {
              
             View vi = convertView;
             ViewHolder holder;
              
             if(convertView==null){
                 vi = inflater.inflate(R.layout.list_item, null);
                 holder = new ViewHolder();
                 holder.txtNmae = (TextView) vi.findViewById(R.id.txt_playerName);
                 holder.txtODIAverage = (TextView) vi.findViewById(R.id.txt_odi_average);
                 holder.txtODIHighScore= (TextView) vi.findViewById(R.id.txt_odi_highScore);
                 holder.txtTestHighScore= (TextView) vi.findViewById(R.id.txt_test_highScore);
                 holder.txtTestAverage= (TextView) vi.findViewById(R.id.txt_test_average);
                 holder.img_image=(ImageView)vi.findViewById(R.id.img_player);
                 holder.list_layout=(LinearLayout)vi.findViewById(R.id.list_layout);
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
                 holder.txtTestHighScore.setText("Test High Score: "+data.get(position).getTestHighScore());
                 holder.txtODIAverage.setText("ODI Average: "+data.get(position).getOdiAverage());
                 holder.txtTestAverage.setText("Test Average: "+data.get(position).getTestAverage());
                 holder.txtODIHighScore.setText("ODI High Score: "+data.get(position).getOdiHighScore());

                 switch (data.get(position).getType()){
                     case "batsman":
                         holder.list_layout.setBackgroundColor(Color.RED);
                         break;
                     case "bowler":
                         holder.list_layout.setBackgroundColor(Color.GREEN);
                         break;
                     case "wicket":
                         holder.list_layout.setBackgroundColor(Color.BLUE);
                         break;
                     case "all":
                         holder.list_layout.setBackgroundColor(Color.MAGENTA);
                         break;

                 }

             }
             Uri path = Uri.parse("android.resource://com.example.bs148.playerprofile/drawable/"+data.get(position).getPictureLocation());
             holder.img_image.setImageURI(path);
             return vi;
         }
     }
