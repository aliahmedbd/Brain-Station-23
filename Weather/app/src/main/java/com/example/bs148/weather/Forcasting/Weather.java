package com.example.bs148.weather.Forcasting;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Weather {

@SerializedName("id")
@Expose
private Long id;
@SerializedName("main")
@Expose
private String main;
@SerializedName("description")
@Expose
private String description;
@SerializedName("icon")
@Expose
private String icon;

/**
* 
* @return
* The id
*/
public Long getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(Long id) {
this.id = id;
}

/**
* 
* @return
* The main
*/
public String getMain() {
return main;
}

/**
* 
* @param main
* The main
*/
public void setMain(String main) {
this.main = main;
}

/**
* 
* @return
* The description
*/
public String getDescription() {
return description;
}

/**
* 
* @param description
* The description
*/
public void setDescription(String description) {
this.description = description;
}

/**
* 
* @return
* The icon
*/
public String getIcon() {
return icon;
}

/**
* 
* @param icon
* The icon
*/
public void setIcon(String icon) {
this.icon = icon;
}

}