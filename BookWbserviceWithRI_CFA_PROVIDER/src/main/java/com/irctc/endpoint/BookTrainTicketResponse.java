
package com.irctc.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookTrainTicketResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookTrainTicketResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnTicketinfo" type="{http://endpoint.irctc.com/}ticketInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookTrainTicketResponse", propOrder = {
    "returnTicketinfo"
})
public class BookTrainTicketResponse {

    @XmlElement(name = "ReturnTicketinfo")
    protected TicketInfo returnTicketinfo;

    /**
     * Gets the value of the returnTicketinfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketInfo }
     *     
     */
    public TicketInfo getReturnTicketinfo() {
        return returnTicketinfo;
    }

    /**
     * Sets the value of the returnTicketinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketInfo }
     *     
     */
    public void setReturnTicketinfo(TicketInfo value) {
        this.returnTicketinfo = value;
    }

}
