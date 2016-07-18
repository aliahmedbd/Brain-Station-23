package com.example.bs148.weather.Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Main {

@SerializedName("temp")
@Expose
private Double temp;
@SerializedName("pressure")
@Expose
private Double pressure;
@SerializedName("humidity")
@Expose
private Long humidity;
@SerializedName("temp_min")
@Expose
private Double tempMin;
@SerializedName("temp_max")
@Expose
private Double tempMax;
@SerializedName("sea_level")
@Expose
private Double seaLevel;
@SerializedName("grnd_level")
@Expose
private Double grndLevel;

/**
* 
* @return
* The temp
*/
public Double getTemp() {
return temp;
}

/**
* 
* @param temp
* The temp
*/
public void setTemp(Double temp) {
this.temp = temp;
}

/**
* 
* @return
* The pressure
*/
public Double getPressure() {
return pressure;
}

/**
* 
* @param pressure
* The pressure
*/
public void setPressure(Double pressure) {
this.pressure = pressure;
}

/**
* 
* @return
* The humidity
*/
public Long getHumidity() {
return humidity;
}

/**
* 
* @param humidity
* The humidity
*/
public void setHumidity(Long humidity) {
this.humidity = humidity;
}

/**
* 
* @return
* The tempMin
*/
public Double getTempMin() {
return tempMin;
}

/**
* 
* @param tempMin
* The temp_min
*/
public void setTempMin(Double tempMin) {
this.tempMin = tempMin;
}

/**
* 
* @return
* The tempMax
*/
public Double getTempMax() {
return tempMax;
}

/**
* 
* @param tempMax
* The temp_max
*/
public void setTempMax(Double tempMax) {
this.tempMax = tempMax;
}

/**
* 
* @return
* The seaLevel
*/
public Double getSeaLevel() {
return seaLevel;
}

/**
* 
* @param seaLevel
* The sea_level
*/
public void setSeaLevel(Double seaLevel) {
this.seaLevel = seaLevel;
}

/**
* 
* @return
* The grndLevel
*/
public Double getGrndLevel() {
return grndLevel;
}

/**
* 
* @param grndLevel
* The grnd_level
*/
public void setGrndLevel(Double grndLevel) {
this.grndLevel = grndLevel;
}

}