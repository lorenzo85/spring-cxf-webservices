package org.spring.cxf.weather.webservice;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.12
 * Sat Jan 03 15:59:41 NZDT 2015
 * Generated source version: 2.2.12
 * 
 */
 
@WebService(targetNamespace = "http://webservice.weather.cxf.spring.org/", name = "WeatherWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface WeatherWebService {

    @WebMethod
    @RequestWrapper(localName = "getWeather", targetNamespace = "http://webservice.weather.cxf.spring.org/", className = "org.spring.cxf.weather.webservice.GetWeather")
    @ResponseWrapper(localName = "getWeatherResponse", targetNamespace = "http://webservice.weather.cxf.spring.org/", className = "org.spring.cxf.weather.webservice.GetWeatherResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.spring.cxf.weather.webservice.Weather getWeather();
}