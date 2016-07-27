package com.example.bs148.fragmentnew.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bs148.fragmentnew.POJO.Player;
import com.example.bs148.fragmentnew.R;
import com.google.gson.Gson;

/**
 * Created by BS148 on 7/27/2016.
 */
public class PlayerDetailsFragment extends Fragment {
    public static String ARGS = "position";
    int mCurrentPosition = -1;
    Gson gson;
    Player player;
    TextView txt_PlayerName;

    public static PlayerDetailsFragment getInstances(int pos){
        PlayerDetailsFragment playerDetailsFragment = new PlayerDetailsFragment();
        Bundle args = new Bundle();
        args.putInt(ARGS,pos);
        playerDetailsFragment.setArguments(args);
        return  playerDetailsFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.player_details,container,false);
        txt_PlayerName = (TextView)view.findViewById(R.id.txt_details_name);
        if(savedInstanceState != null){
            mCurrentPosition = savedInstanceState.getInt(ARGS);
        }
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gson = new Gson();
        player = gson.fromJson(PlayerListFragment.json_array,Player.class);
        Toast.makeText(getContext(),"Size : "+player.getInfo().size(),Toast.LENGTH_SHORT).show();
        Bundle args = getArguments();
        if (args != null) {
            updateDetails(args.getInt(ARGS));
        } else if (mCurrentPosition != -1) {
            updateDetails(mCurrentPosition);
        }
    }

    public  void updateDetails(int position){
        //txt_PlayerName = (TextView)getActivity().findViewById(R.id.txt_details_name);
        txt_PlayerName.setText(player.getInfo().get(position).getName()+"\n"+player.getInfo().get(position).getTestAverage()+"\n"+player.getInfo().get(position).getOdiAverage());
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save the current article selection in case we need to recreate the fragment
        outState.putInt(ARGS, mCurrentPosition);
    }

    @Override
    public void onResume() {
        super.onResume();

    }
}
