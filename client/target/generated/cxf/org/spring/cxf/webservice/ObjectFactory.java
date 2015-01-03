
package org.spring.cxf.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.spring.cxf.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDataFromWebServiceResponse_QNAME = new QName("http://webservice.cxf.spring.org/", "getDataFromWebServiceResponse");
    private final static QName _GetDataFromWebService_QNAME = new QName("http://webservice.cxf.spring.org/", "getDataFromWebService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.spring.cxf.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataFromWebService }
     * 
     */
    public GetDataFromWebService createGetDataFromWebService() {
        return new GetDataFromWebService();
    }

    /**
     * Create an instance of {@link GetDataFromWebServiceResponse }
     * 
     */
    public GetDataFromWebServiceResponse createGetDataFromWebServiceResponse() {
        return new GetDataFromWebServiceResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataFromWebServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cxf.spring.org/", name = "getDataFromWebServiceResponse")
    public JAXBElement<GetDataFromWebServiceResponse> createGetDataFromWebServiceResponse(GetDataFromWebServiceResponse value) {
        return new JAXBElement<GetDataFromWebServiceResponse>(_GetDataFromWebServiceResponse_QNAME, GetDataFromWebServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataFromWebService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cxf.spring.org/", name = "getDataFromWebService")
    public JAXBElement<GetDataFromWebService> createGetDataFromWebService(GetDataFromWebService value) {
        return new JAXBElement<GetDataFromWebService>(_GetDataFromWebService_QNAME, GetDataFromWebService.class, null, value);
    }

}
