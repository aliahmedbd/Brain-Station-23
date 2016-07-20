
package com.example.bs148.playerprofile.PlayersPojo;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Info {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("test_high_score")
    @Expose
    private String testHighScore;
    @SerializedName("odi_high_score")
    @Expose
    private String odiHighScore;
    @SerializedName("test_average")
    @Expose
    private String testAverage;
    @SerializedName("odi_average")
    @Expose
    private String odiAverage;
    @SerializedName("picture_location")
    @Expose
    private String pictureLocation;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The testHighScore
     */
    public String getTestHighScore() {
        return testHighScore;
    }

    /**
     *
     * @param testHighScore
     * The test_high_score
     */
    public void setTestHighScore(String testHighScore) {
        this.testHighScore = testHighScore;
    }

    /**
     *
     * @return
     * The odiHighScore
     */
    public String getOdiHighScore() {
        return odiHighScore;
    }

    /**
     *
     * @param odiHighScore
     * The odi_high_score
     */
    public void setOdiHighScore(String odiHighScore) {
        this.odiHighScore = odiHighScore;
    }

    /**
     *
     * @return
     * The testAverage
     */
    public String getTestAverage() {
        return testAverage;
    }

    /**
     *
     * @param testAverage
     * The test_average
     */
    public void setTestAverage(String testAverage) {
        this.testAverage = testAverage;
    }

    /**
     *
     * @return
     * The odiAverage
     */
    public String getOdiAverage() {
        return odiAverage;
    }

    /**
     *
     * @param odiAverage
     * The odi_average
     */
    public void setOdiAverage(String odiAverage) {
        this.odiAverage = odiAverage;
    }

    /**
     *
     * @return
     * The pictureLocation
     */
    public String getPictureLocation() {
        return pictureLocation;
    }

    /**
     *
     * @param pictureLocation
     * The picture_location
     */
    public void setPictureLocation(String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

}