package org.example.singleton;

public class City {

    private String name;

    private String osadki;

    private String temp;

    private String cloudy;

    public String getName() {
        return name;
    }

    public String getOsadki() {
        return osadki;
    }

    public String getTemp() {
        return temp;
    }

    public String getCloudy() {
        return cloudy;
    }

    public City(String name, String osadki, String temp, String cloudy) {
        this.name = name;
        this.osadki = osadki;
        this.temp = temp;
        this.cloudy = cloudy;
    }
}
