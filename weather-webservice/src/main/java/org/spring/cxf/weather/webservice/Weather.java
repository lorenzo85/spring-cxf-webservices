package org.spring.cxf.weather.webservice;

public class Weather {

    private String city;
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
