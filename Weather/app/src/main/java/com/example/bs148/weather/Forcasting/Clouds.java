package com.example.bs148.weather.Forcasting;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Clouds {

    @SerializedName("all")
    @Expose
    private long all;

    /**
     *
     * @return
     * The all
     */
    public long getAll() {
        return all;
    }

    /**
     *
     * @param all
     * The all
     */
    public void setAll(long all) {
        this.all = all;
    }

}