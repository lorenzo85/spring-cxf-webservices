package org.spring.cxf.webservice.client;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;
import org.spring.cxf.weather.webservice.Weather;
import org.spring.cxf.weather.webservice.WeatherWebService;
import org.spring.cxf.weather.webservice.WeatherWebServiceImplService;
import org.spring.cxf.webservice.Person;
import org.spring.cxf.webservice.SampleWebService;
import org.spring.cxf.webservice.SampleWebServiceImplService;

import java.net.MalformedURLException;
import java.net.URL;

public class TheClient {

    public static void main(String args[]) throws MalformedURLException {
        callSampleWebService();
        callWeatherWebService();
        callWeatherWebService1();
    }

    private static void callSampleWebService() {
        SampleWebServiceImplService sampleWebServiceImplService = new SampleWebServiceImplService();
        SampleWebService port = sampleWebServiceImplService.getSampleWebServiceImplPort();
        Person resp = port.getDataFromWebService();
        System.out.println(resp.getName() + " " + resp.getDescription());
    }

    private static void callWeatherWebService() {
        WeatherWebServiceImplService weatherWebServiceImplService = new WeatherWebServiceImplService();
        WeatherWebService port = weatherWebServiceImplService.getWeatherWebServiceImplPort();
        Weather weather = port.getWeather();
        System.out.println(weather.getCity() + " temp: " + weather.getTemperature());
    }

    private static void callWeatherWebService1() throws MalformedURLException {
        GlobalWeather service = new GlobalWeather(new URL("http://www.webservicex.net/globalweather.asmx"));
        GlobalWeatherSoap weatherSoap = service.getGlobalWeatherSoap();
        System.out.println("Weather for New York");
        System.out.println(weatherSoap.getWeather("New York", "United States"));
    }
}