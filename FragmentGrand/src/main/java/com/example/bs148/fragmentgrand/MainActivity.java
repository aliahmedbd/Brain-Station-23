package com.example.bs148.fragmentgrand;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentContainer;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnClickHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.fragment_container) != null ){

            PlayerListFragment playerListFragment= new PlayerListFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,playerListFragment).commit();

        }

    }

    @Override
    public void onClickHandler(int position) {
        Toast.makeText(getBaseContext(),"Hello",Toast.LENGTH_SHORT).show();
        PlayerDetailseFragment playerDetailseFragment= new PlayerDetailseFragment();



    }
}
