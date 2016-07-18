package com.example.bs148.weather.Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Sys {

@SerializedName("message")
@Expose
private Double message;
@SerializedName("country")
@Expose
private String country;
@SerializedName("sunrise")
@Expose
private Long sunrise;
@SerializedName("sunset")
@Expose
private Long sunset;

/**
* 
* @return
* The message
*/
public Double getMessage() {
return message;
}

/**
* 
* @param message
* The message
*/
public void setMessage(Double message) {
this.message = message;
}

/**
* 
* @return
* The country
*/
public String getCountry() {
return country;
}

/**
* 
* @param country
* The country
*/
public void setCountry(String country) {
this.country = country;
}

/**
* 
* @return
* The sunrise
*/
public Long getSunrise() {
return sunrise;
}

/**
* 
* @param sunrise
* The sunrise
*/
public void setSunrise(Long sunrise) {
this.sunrise = sunrise;
}

/**
* 
* @return
* The sunset
*/
public Long getSunset() {
return sunset;
}

/**
* 
* @param sunset
* The sunset
*/
public void setSunset(Long sunset) {
this.sunset = sunset;
}

}