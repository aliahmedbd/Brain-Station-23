package com.example.bs148.fragmentnew.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.bs148.fragmentnew.Adapters.CustomAdapter;
import com.example.bs148.fragmentnew.Interfaces.OnListClickHandler;
import com.example.bs148.fragmentnew.POJO.Info;
import com.example.bs148.fragmentnew.POJO.Player;
import com.example.bs148.fragmentnew.R;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BS148 on 7/27/2016.
 */
public class PlayerListFragment extends Fragment {
    public static String json_array="{\"info\":[{\"name\":\"Sakib AL Hasan\",\"test_high_score\":\"144\",\"odi_high_score\":\"134*\",\"test_average\":\"39.76\",\"odi_average\":\"35.18\",\"picture_location\":\"sakib\",\"type\":\"all\"},{\"name\":\"Sachin Tendulkar\",\"test_high_score\":\"248*\",\"odi_high_score\":\"200*\",\"test_average\":\"55\",\"odi_average\":\"44\",\"picture_location\":\"sachin\",\"type\":\"batsman\"},{\"name\":\"Sourav Ganguly\",\"test_high_score\":\"239\",\"odi_high_score\":\"183*\",\"test_average\":\"42\",\"odi_average\":\"41\",\"picture_location\":\"s\",\"type\":\"batsman\"},{\"name\":\"Shoib Akhter\",\"test_high_score\":\"144\",\"odi_high_score\":\"134*\",\"test_average\":\"39.76\",\"odi_average\":\"35.18\",\"picture_location\":\"akhter\",\"type\":\"bowler\"}]}";
    ///  @BindView(R.id.lst_player_info)

    private ListView lst_player;
    ArrayList <Info> player_list = new ArrayList<Info>();
    public static OnListClickHandler onListClickHandler;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.list_item,container,false);
        lst_player=(ListView) view.findViewById(R.id.lst_player);
        CustomAdapter customAdapter = new CustomAdapter(getActivity(), player_list);
        lst_player.setAdapter(customAdapter);
        lst_player.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListClickHandler.onClickListener(position);
            }
        });
        return view;
    }


    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);
        Gson gson=new Gson();
        Player player=gson.fromJson(json_array,Player.class);
        int size = player.getInfo().size();
        for(int i =0 ;i<size;i++){
            player_list.add(player.getInfo().get(i));
        }
        try{
            onListClickHandler = (OnListClickHandler) context;
        }
        catch (ClassCastException e){

        }

    }


}
