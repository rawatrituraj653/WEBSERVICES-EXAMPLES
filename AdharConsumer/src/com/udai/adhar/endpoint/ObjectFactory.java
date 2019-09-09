
package com.udai.adhar.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.udai.adhar.endpoint package. 
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

    private final static QName _GetAdharDataResponse_QNAME = new QName("http://endpoint.adhar.udai.com/", "getAdharDataResponse");
    private final static QName _GetAdharData_QNAME = new QName("http://endpoint.adhar.udai.com/", "getAdharData");
    private final static QName _AdharEnrollResponse_QNAME = new QName("http://endpoint.adhar.udai.com/", "adharEnrollResponse");
    private final static QName _AdharEnroll_QNAME = new QName("http://endpoint.adhar.udai.com/", "adharEnroll");
    private final static QName _Person_QNAME = new QName("http://endpoint.adhar.udai.com/", "person");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.udai.adhar.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdharEnrollResponse }
     * 
     */
    public AdharEnrollResponse createAdharEnrollResponse() {
        return new AdharEnrollResponse();
    }

    /**
     * Create an instance of {@link AdharEnroll }
     * 
     */
    public AdharEnroll createAdharEnroll() {
        return new AdharEnroll();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GetAdharDataResponse }
     * 
     */
    public GetAdharDataResponse createGetAdharDataResponse() {
        return new GetAdharDataResponse();
    }

    /**
     * Create an instance of {@link GetAdharData }
     * 
     */
    public GetAdharData createGetAdharData() {
        return new GetAdharData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdharDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.adhar.udai.com/", name = "getAdharDataResponse")
    public JAXBElement<GetAdharDataResponse> createGetAdharDataResponse(GetAdharDataResponse value) {
        return new JAXBElement<GetAdharDataResponse>(_GetAdharDataResponse_QNAME, GetAdharDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdharData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.adhar.udai.com/", name = "getAdharData")
    public JAXBElement<GetAdharData> createGetAdharData(GetAdharData value) {
        return new JAXBElement<GetAdharData>(_GetAdharData_QNAME, GetAdharData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdharEnrollResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.adhar.udai.com/", name = "adharEnrollResponse")
    public JAXBElement<AdharEnrollResponse> createAdharEnrollResponse(AdharEnrollResponse value) {
        return new JAXBElement<AdharEnrollResponse>(_AdharEnrollResponse_QNAME, AdharEnrollResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdharEnroll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.adhar.udai.com/", name = "adharEnroll")
    public JAXBElement<AdharEnroll> createAdharEnroll(AdharEnroll value) {
        return new JAXBElement<AdharEnroll>(_AdharEnroll_QNAME, AdharEnroll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.adhar.udai.com/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

}
