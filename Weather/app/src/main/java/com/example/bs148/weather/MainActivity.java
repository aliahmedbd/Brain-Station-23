package com.example.bs148.weather;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bs148.weather.Pojo.Example;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edt_cityName;
    Button btn_submit;
    TextView txt_current,txt_second,txt_fourth,txt_third,txt_first;
    public static String url="http://api.openweathermap.org/data/2.5/forecast?q=Dhaka,bd&mode=json&appid=641b7868daff7942be5edb1c07f345c9";

    public static String tesString;
    String myJson;

    public static final String TAG_RESULT = "result";
    public static final String TAG_MAIN = "main";

    JSONArray items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setInitialize();


    }

    protected void setInitialize(){
        txt_current=(TextView)findViewById(R.id.txt_current_weather);
        txt_first=(TextView)findViewById(R.id.txt_first_forecast);
        txt_second=(TextView)findViewById(R.id.txt_second_forecast);
        txt_third=(TextView)findViewById(R.id.txt_third_forecast);
        txt_fourth=(TextView)findViewById(R.id.txt_fourth_forecast);

        edt_cityName=(EditText)findViewById(R.id.edt_city_name);
        btn_submit=(Button)findViewById(R.id.btn_submit);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_submit:
                String cityName;
                //Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                if(edt_cityName.getText().toString() != ""){
                    cityName=edt_cityName.getText().toString();
                    url="http://api.openweathermap.org/data/2.5/forecast?q="+cityName+",bd&mode=json&appid=641b7868daff7942be5edb1c07f345c9";
                }
                getInformation(url,10000);
        }
    }

    protected void getInformation(final String url, int timeout){
        class GetWeatherInformation extends AsyncTask<String,Void,String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this,"Getting weather...","Please wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                getMain(s);
                myJson=tesString;
                loading.dismiss();



            }

            @Override
            protected String doInBackground(String... params) {
                try {
                    String result = null;
                    StringBuffer sb = new StringBuffer();
                    InputStream is = null;
                    String weather_url=url;
                    URL url = new URL(weather_url);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

                    is = new BufferedInputStream(httpURLConnection.getInputStream());
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String inputLine = "";
                    while ((inputLine = br.readLine()) != null) {
                        sb.append(inputLine);
                    }
                    result = sb.toString();
                    tesString = result;
                    return result;
                } catch (Exception e) {
                    e.printStackTrace();
                    // return "Not connected";
                    return null;
                }
            }
        }

        GetWeatherInformation getWeatherInformation = new GetWeatherInformation();
        getWeatherInformation.execute();
    }

    protected void getMain(String s){



        Gson gson=new Gson();
        com.example.bs148.weather.Forcasting.Example example=gson.fromJson(s, com.example.bs148.weather.Forcasting.Example.class);

        txt_current.setText("Today("+example.getList().get(0).getDtTxt().toString()+")\n\nTemperature: " +example.getList().get(0).getMain().getTemp()+"\nHumidity: "+example.getList().get(0).getMain().getHumidity()+"\nWeather: "+example.getList().get(0).getWeather().get(0).getMain().toString());
        txt_first.setText("Tomorrow ("+example.getList().get(1).getDtTxt().toString()+")\n\nTemperature will be: "+example.getList().get(1).getMain().getTemp()+"\nHumidity will be: "+example.getList().get(1).getMain().getHumidity());
        txt_second.setText("Day after Tomorrows ("+example.getList().get(0).getDtTxt().toString()+")\n\nTemperature will be: "+example.getList().get(2).getMain().getTemp()+"\nHumidity will be: "+example.getList().get(2).getMain().getHumidity());
      //  txt_third.setText(example.getList().get(3).getMain().getTemp().toString());


    }



}

