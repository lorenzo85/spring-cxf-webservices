package org.spring.cxf.webservice;


import javax.jws.WebService;

@WebService(endpointInterface = "org.spring.cxf.webservice.SampleWebService")
public class SampleWebServiceImpl implements SampleWebService {

    @Override
    public Person getDataFromWebService() {
        Person a = new Person();
        a.setAge(1);
        a.setDescription("Description from Server!");
        a.setName("Name from Server");
        return a;
    }
}