package com.example.bs148.playerprofile.PlayersPojo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Player {

    @SerializedName("info")
    @Expose
    private List<Info> info = new ArrayList<Info>();

    /**
     *
     * @return
     * The info
     */
    public List<Info> getInfo() {
        return info;
    }

    /**
     *
     * @param info
     * The info
     */
    public void setInfo(List<Info> info) {
        this.info = info;
    }

}