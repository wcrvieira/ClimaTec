package br.com.climatec.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherCurrent {
    @SerializedName("temperature_2m")
    @Expose
    private double temperature_2m;

    @SerializedName("relative_Humidity_2m")
    @Expose
    private int relative_Humidity_2m;

    @SerializedName("windSpeed_10m")
    @Expose
    private double windSpeed_10m;

    public double getTemperature_2m() {
        return temperature_2m;
    }

    public int getRelative_Humidity_2m() {
        return relative_Humidity_2m;
    }

    public double getWindSpeed_10m() {
        return windSpeed_10m;
    }

}
