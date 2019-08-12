
package com.irctc.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookTrainTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookTrainTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonData" type="{http://endpoint.irctc.com/}passengerInfo" minOccurs="0"/>
 *         &lt;element name="journeyData" type="{http://endpoint.irctc.com/}journeyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookTrainTicket", propOrder = {
    "personData",
    "journeyData"
})
public class BookTrainTicket {

    @XmlElement(name = "PersonData")
    protected PassengerInfo personData;
    protected JourneyInfo journeyData;

    /**
     * Gets the value of the personData property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfo }
     *     
     */
    public PassengerInfo getPersonData() {
        return personData;
    }

    /**
     * Sets the value of the personData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfo }
     *     
     */
    public void setPersonData(PassengerInfo value) {
        this.personData = value;
    }

    /**
     * Gets the value of the journeyData property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyInfo }
     *     
     */
    public JourneyInfo getJourneyData() {
        return journeyData;
    }

    /**
     * Sets the value of the journeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyInfo }
     *     
     */
    public void setJourneyData(JourneyInfo value) {
        this.journeyData = value;
    }

}
