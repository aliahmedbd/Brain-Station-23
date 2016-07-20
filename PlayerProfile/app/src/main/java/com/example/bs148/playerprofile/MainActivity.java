package com.example.bs148.playerprofile;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.bs148.playerprofile.PlayersPojo.Info;
import com.example.bs148.playerprofile.PlayersPojo.Player;
import com.google.gson.Gson;
import com.example.bs148.playerprofile.CustomAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    String json_array="{\"info\":[{\"name\":\"Sakib AL Hasan\",\"test_high_score\":\"144\",\"odi_high_score\":\"134*\",\"test_average\":\"39.76\",\"odi_average\":\"35.18\",\"picture_location\":\"sakib\",\"type\":\"all\"},{\"name\":\"Sachin Tendulkar\",\"test_high_score\":\"248*\",\"odi_high_score\":\"200*\",\"test_average\":\"55\",\"odi_average\":\"44\",\"picture_location\":\"sachin\",\"type\":\"batsman\"},{\"name\":\"Sourav Ganguly\",\"test_high_score\":\"239\",\"odi_high_score\":\"183*\",\"test_average\":\"42\",\"odi_average\":\"41\",\"picture_location\":\"s\",\"type\":\"batsman\"},{\"name\":\"Shoib Akhter\",\"test_high_score\":\"144\",\"odi_high_score\":\"134*\",\"test_average\":\"39.76\",\"odi_average\":\"35.18\",\"picture_location\":\"akhter\",\"type\":\"bowler\"}]}";

    ///  @BindView(R.id.lst_player_info)
    ListView lst_player_info;
    Player player;
    ArrayList<Info> player_list=new ArrayList<Info>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst_player_info=(ListView)findViewById(R.id.lst_player_info);
        Gson gson=new Gson();
        try {
            player=gson.fromJson(json_array, Player.class);
        }catch (Exception e){
            e.printStackTrace();
        }

        int size=player.getInfo().size();
        for(int i=0;i<size;i++){
            player_list.add(player.getInfo().get(i));
        }
        Resources res=getResources();
        CustomAdapter adapter=new CustomAdapter(this,player_list,res);
        String name=player_list.get(0).getName();
        lst_player_info.setAdapter(adapter );
    }

    private File createFileFromInputStream(InputStream inputStream) {

        try{
            File f = new File("file.json");
            OutputStream outputStream = new FileOutputStream(f);
            byte buffer[] = new byte[1024];
            int length = 0;
            while((length=inputStream.read(buffer)) > 0) {
                outputStream.write(buffer,0,length);
            }
            outputStream.close();
            inputStream.close();
            return f;
        }catch (IOException e) {
            //Logging exception
        }
        return null;
    }
}
