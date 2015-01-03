package org.spring.cxf.weather.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "org.spring.cxf.weather.webservice.WeatherWebService")
public class WeatherWebServiceImpl implements WeatherWebService {

    @Override
    public Weather getWeather() {
        Weather weather = new Weather();
        weather.setCity("Auckland");
        weather.setTemperature(2);
        return weather;
    }
}
