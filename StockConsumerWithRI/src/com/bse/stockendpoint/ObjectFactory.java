
package com.bse.stockendpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bse.stockendpoint package. 
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

    private final static QName _FindStockPriceResponse_QNAME = new QName("http://stockendpoint.bse.com/", "findStockPriceResponse");
    private final static QName _FindStockPrice_QNAME = new QName("http://stockendpoint.bse.com/", "findStockPrice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bse.stockendpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindStockPrice }
     * 
     */
    public FindStockPrice createFindStockPrice() {
        return new FindStockPrice();
    }

    /**
     * Create an instance of {@link FindStockPriceResponse }
     * 
     */
    public FindStockPriceResponse createFindStockPriceResponse() {
        return new FindStockPriceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStockPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://stockendpoint.bse.com/", name = "findStockPriceResponse")
    public JAXBElement<FindStockPriceResponse> createFindStockPriceResponse(FindStockPriceResponse value) {
        return new JAXBElement<FindStockPriceResponse>(_FindStockPriceResponse_QNAME, FindStockPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStockPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://stockendpoint.bse.com/", name = "findStockPrice")
    public JAXBElement<FindStockPrice> createFindStockPrice(FindStockPrice value) {
        return new JAXBElement<FindStockPrice>(_FindStockPrice_QNAME, FindStockPrice.class, null, value);
    }

}
