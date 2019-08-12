
package com.irctc.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passengerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passengerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passenger-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger-age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pan-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adhar-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerInfo", propOrder = {
    "passengerName",
    "passengerAge",
    "panNumber",
    "adharNumber"
})
public class PassengerInfo {

    @XmlElement(name = "passenger-name")
    protected String passengerName;
    @XmlElement(name = "passenger-age")
    protected int passengerAge;
    @XmlElement(name = "pan-number")
    protected String panNumber;
    @XmlElement(name = "adhar-number")
    protected String adharNumber;

    /**
     * Gets the value of the passengerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * Sets the value of the passengerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerName(String value) {
        this.passengerName = value;
    }

    /**
     * Gets the value of the passengerAge property.
     * 
     */
    public int getPassengerAge() {
        return passengerAge;
    }

    /**
     * Sets the value of the passengerAge property.
     * 
     */
    public void setPassengerAge(int value) {
        this.passengerAge = value;
    }

    /**
     * Gets the value of the panNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanNumber() {
        return panNumber;
    }

    /**
     * Sets the value of the panNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanNumber(String value) {
        this.panNumber = value;
    }

    /**
     * Gets the value of the adharNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdharNumber() {
        return adharNumber;
    }

    /**
     * Sets the value of the adharNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdharNumber(String value) {
        this.adharNumber = value;
    }

}
