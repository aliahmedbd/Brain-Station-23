package com.example.bs151.fragmentwithlistview;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ListviewFragment.onSelectedPosition {
    LinearLayout listViewFragmentContainer, showDataContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewFragmentContainer = (LinearLayout) findViewById(R.id.listviewFragmentContainer);
        showDataContainer = (LinearLayout) findViewById(R.id.showDataContainer);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.listviewFragmentContainer, new ListviewFragment());
            transaction.commit();
        }
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.listviewFragmentContainer, new ListviewFragment());
            transaction.commit();
        }
    }

    @Override
    public void selectedPosition(int position) {
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            BlankFragment blankFragment = (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.showDataContainer);
            blankFragment.setData(position);
        }else{
            Intent intent=new Intent(MainActivity.this,DetailsFragment.class);
            intent.putExtra("pos",position);
            startActivity(intent);
        }
    }

}
