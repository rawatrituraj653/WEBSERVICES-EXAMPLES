
package com.irctc.endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for journeyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="journeyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journey-date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="train-num" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="train-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "journeyInfo", propOrder = {
    "journeyDate",
    "from",
    "to",
    "trainNum",
    "trainName"
})
public class JourneyInfo {

    @XmlElement(name = "journey-date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar journeyDate;
    protected String from;
    protected String to;
    @XmlElement(name = "train-num")
    protected Long trainNum;
    @XmlElement(name = "train-name")
    protected String trainName;

    /**
     * Gets the value of the journeyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJourneyDate() {
        return journeyDate;
    }

    /**
     * Sets the value of the journeyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJourneyDate(XMLGregorianCalendar value) {
        this.journeyDate = value;
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
     * Gets the value of the trainNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrainNum() {
        return trainNum;
    }

    /**
     * Sets the value of the trainNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrainNum(Long value) {
        this.trainNum = value;
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

}
