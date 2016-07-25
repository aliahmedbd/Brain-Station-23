package com.example.bs151.fragmentwithlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsFragment extends AppCompatActivity {
    String[] versionName,apiName,releaseData;
    TextView versionNameTextView,apiTextView,releaseDateTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_fragment);
        versionNameTextView= (TextView) findViewById(R.id.versionNameTextView);
        apiTextView= (TextView) findViewById(R.id.apiTextView);
        releaseDateTextView= (TextView) findViewById(R.id.releaseDateTextView);
        int position=getIntent().getIntExtra("pos",0);
        versionName=getResources().getStringArray(R.array.version_name);
        apiName=getResources().getStringArray(R.array.api);
        releaseData=getResources().getStringArray(R.array.release_date);
        setData(versionName[position],apiName[position],releaseData[position]);
    }

    public void setData(String versionName,String api,String releaseDate){
        versionNameTextView.setText(versionName);
        apiTextView.setText(api);
        releaseDateTextView.setText(releaseDate);
    }
}
