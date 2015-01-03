package org.spring.cxf.webservice;

import javax.jws.WebService;

@WebService
public interface SampleWebService {

    Person getDataFromWebService();

}
