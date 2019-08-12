
package com.irctc.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.irctc.endpoint package. 
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

    private final static QName _BookTrainTicketResponse_QNAME = new QName("http://endpoint.irctc.com/", "bookTrainTicketResponse");
    private final static QName _PersonInfo_QNAME = new QName("http://endpoint.irctc.com/", "person-info");
    private final static QName _BookTrainTicket_QNAME = new QName("http://endpoint.irctc.com/", "bookTrainTicket");
    private final static QName _TicketInfo_QNAME = new QName("http://endpoint.irctc.com/", "ticket-info");
    private final static QName _JourneyInfo_QNAME = new QName("http://endpoint.irctc.com/", "journey-info");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.irctc.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JourneyInfo }
     * 
     */
    public JourneyInfo createJourneyInfo() {
        return new JourneyInfo();
    }

    /**
     * Create an instance of {@link BookTrainTicket }
     * 
     */
    public BookTrainTicket createBookTrainTicket() {
        return new BookTrainTicket();
    }

    /**
     * Create an instance of {@link TicketInfo }
     * 
     */
    public TicketInfo createTicketInfo() {
        return new TicketInfo();
    }

    /**
     * Create an instance of {@link PassengerInfo }
     * 
     */
    public PassengerInfo createPassengerInfo() {
        return new PassengerInfo();
    }

    /**
     * Create an instance of {@link BookTrainTicketResponse }
     * 
     */
    public BookTrainTicketResponse createBookTrainTicketResponse() {
        return new BookTrainTicketResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTrainTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.irctc.com/", name = "bookTrainTicketResponse")
    public JAXBElement<BookTrainTicketResponse> createBookTrainTicketResponse(BookTrainTicketResponse value) {
        return new JAXBElement<BookTrainTicketResponse>(_BookTrainTicketResponse_QNAME, BookTrainTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.irctc.com/", name = "person-info")
    public JAXBElement<PassengerInfo> createPersonInfo(PassengerInfo value) {
        return new JAXBElement<PassengerInfo>(_PersonInfo_QNAME, PassengerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTrainTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.irctc.com/", name = "bookTrainTicket")
    public JAXBElement<BookTrainTicket> createBookTrainTicket(BookTrainTicket value) {
        return new JAXBElement<BookTrainTicket>(_BookTrainTicket_QNAME, BookTrainTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.irctc.com/", name = "ticket-info")
    public JAXBElement<TicketInfo> createTicketInfo(TicketInfo value) {
        return new JAXBElement<TicketInfo>(_TicketInfo_QNAME, TicketInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.irctc.com/", name = "journey-info")
    public JAXBElement<JourneyInfo> createJourneyInfo(JourneyInfo value) {
        return new JAXBElement<JourneyInfo>(_JourneyInfo_QNAME, JourneyInfo.class, null, value);
    }

}
