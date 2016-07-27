package com.example.bs148.fragmentnew.App;


import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.bs148.fragmentnew.Fragments.PlayerDetailsFragment;
import com.example.bs148.fragmentnew.Fragments.PlayerListFragment;
import com.example.bs148.fragmentnew.Interfaces.OnListClickHandler;
import com.example.bs148.fragmentnew.R;

public class MainActivity extends FragmentActivity implements OnListClickHandler{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.fragment_container) != null){
            if (savedInstanceState != null) {
                return;
            }
            PlayerListFragment playerListFragment = new PlayerListFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_container,playerListFragment).commit();
        }

    }

    @Override
    public void onClickListener(int position) {
        PlayerDetailsFragment playerDetailsFragment =(PlayerDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.frag_player_details);
        if(playerDetailsFragment != null && playerDetailsFragment.isAdded()){
            playerDetailsFragment.updateDetails(position);
        }
        else{
            PlayerDetailsFragment newPlayerFragment = new PlayerDetailsFragment();
            Bundle args = new Bundle();
            args.putInt(PlayerDetailsFragment.ARGS,position);
            newPlayerFragment.setArguments(args);

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,newPlayerFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }


}
