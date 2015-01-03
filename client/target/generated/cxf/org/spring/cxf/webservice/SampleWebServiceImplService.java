
/*
 * 
 */

package org.spring.cxf.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.12
 * Sat Jan 03 15:59:41 NZDT 2015
 * Generated source version: 2.2.12
 * 
 */


@WebServiceClient(name = "SampleWebServiceImplService", 
                  wsdlLocation = "http://localhost:8089/webservice/SampleService?wsdl",
                  targetNamespace = "http://webservice.cxf.spring.org/") 
public class SampleWebServiceImplService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://webservice.cxf.spring.org/", "SampleWebServiceImplService");
    public final static QName SampleWebServiceImplPort = new QName("http://webservice.cxf.spring.org/", "SampleWebServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8089/webservice/SampleService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:8089/webservice/SampleService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public SampleWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SampleWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SampleWebServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SampleWebServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public SampleWebServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SampleWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SampleWebService
     */
    @WebEndpoint(name = "SampleWebServiceImplPort")
    public SampleWebService getSampleWebServiceImplPort() {
        return super.getPort(SampleWebServiceImplPort, SampleWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SampleWebService
     */
    @WebEndpoint(name = "SampleWebServiceImplPort")
    public SampleWebService getSampleWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(SampleWebServiceImplPort, SampleWebService.class, features);
    }

}