package com.example.bs148.metrodesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_linear,btn_relative,btn_table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_linear=(Button)findViewById(R.id.btn_liner_layout);
        btn_relative=(Button)findViewById(R.id.btn_Relative_layout);
        btn_table=(Button)findViewById(R.id.btn_table_layout);

        btn_linear.setOnClickListener(this);
        btn_relative.setOnClickListener(this);
        btn_table.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_liner_layout:
                startActivity(new Intent(MainActivity.this,Linear.class));
                break;
            case R.id.btn_Relative_layout:
                startActivity(new Intent(MainActivity.this,Relative.class));
                break;
            case R.id.btn_table_layout:
                startActivity(new Intent(MainActivity.this,Table.class));
                break;
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"I am onPause" ,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"I am onResume" ,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"I am onStop" ,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"I am onDestroy" ,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"I am onStart" ,Toast.LENGTH_SHORT).show();
    }
}
