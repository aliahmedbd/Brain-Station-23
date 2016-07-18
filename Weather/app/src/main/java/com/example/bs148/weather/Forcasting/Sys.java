package com.example.bs148.weather.Forcasting;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Sys {

@SerializedName("population")
@Expose
private Long population;

/**
* 
* @return
* The population
*/
public Long getPopulation() {
return population;
}

/**
* 
* @param population
* The population
*/
public void setPopulation(Long population) {
this.population = population;
}

}