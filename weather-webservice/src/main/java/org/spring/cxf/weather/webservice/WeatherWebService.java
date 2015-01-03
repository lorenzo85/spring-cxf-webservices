package org.spring.cxf.weather.webservice;

import javax.jws.WebService;

@WebService
public interface WeatherWebService {

    public Weather getWeather();
}
