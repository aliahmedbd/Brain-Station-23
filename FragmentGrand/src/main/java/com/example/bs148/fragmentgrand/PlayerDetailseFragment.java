package com.example.bs148.fragmentgrand;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by BS148 on 7/26/2016.
 */
public class PlayerDetailseFragment extends Fragment {

    public static final String ARGS="details";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.player_etails,container,false);
        TextView txt_player_details = (TextView)view.findViewById(R.id.txt_player_details);

        txt_player_details.setText(savedInstanceState.getString(ARGS));

        return  view;

    }
}
