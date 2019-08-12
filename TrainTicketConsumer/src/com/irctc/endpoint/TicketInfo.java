
package com.irctc.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticketInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ticketInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="train-number" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="train-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger-age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pan-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adhar-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticket-fare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticketInfo", propOrder = {
    "trainNumber",
    "trainName",
    "passengerName",
    "passengerAge",
    "panNumber",
    "adharNumber",
    "from",
    "to",
    "ticketFare",
    "status"
})
public class TicketInfo {

    @Override
	public String toString() {
		return "TicketInfo [trainNumber=" + trainNumber + ", trainName=" + trainName + ", passengerName="
				+ passengerName + ", passengerAge=" + passengerAge + ", panNumber=" + panNumber + ", adharNumber="
				+ adharNumber + ", from=" + from + ", to=" + to + ", ticketFare=" + ticketFare + ", status=" + status
				+ "]";
	}

	@XmlElement(name = "train-number")
    protected Long trainNumber;
    @XmlElement(name = "train-name")
    protected String trainName;
    @XmlElement(name = "passenger-name")
    protected String passengerName;
    @XmlElement(name = "passenger-age")
    protected Integer passengerAge;
    @XmlElement(name = "pan-number")
    protected String panNumber;
    @XmlElement(name = "adhar-number")
    protected String adharNumber;
    protected String from;
    protected String to;
    @XmlElement(name = "ticket-fare")
    protected Double ticketFare;
    protected String status;

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrainNumber(Long value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the trainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainName() {
        return trainName;
    }

    /**
     * Sets the value of the trainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainName(String value) {
        this.trainName = value;
    }

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerAge() {
        return passengerAge;
    }

    /**
     * Sets the value of the passengerAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerAge(Integer value) {
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

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the ticketFare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTicketFare() {
        return ticketFare;
    }

    /**
     * Sets the value of the ticketFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTicketFare(Double value) {
        this.ticketFare = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
