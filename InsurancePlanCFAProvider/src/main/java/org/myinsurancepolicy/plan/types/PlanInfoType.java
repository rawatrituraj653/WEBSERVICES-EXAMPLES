
package org.myinsurancepolicy.plan.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plan-status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="benefit-amt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="credit-amt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pending-amt" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanInfoType", propOrder = {
    "personName",
    "planStatus",
    "benefitAmt",
    "creditAmt",
    "pendingAmt"
})
public class PlanInfoType {

    @XmlElement(name = "person-name", required = true)
    protected String personName;
    @XmlElement(name = "plan-status")
    protected boolean planStatus;
    @XmlElement(name = "benefit-amt")
    protected double benefitAmt;
    @XmlElement(name = "credit-amt")
    protected double creditAmt;
    @XmlElement(name = "pending-amt")
    protected double pendingAmt;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Gets the value of the planStatus property.
     * 
     */
    public boolean isPlanStatus() {
        return planStatus;
    }

    /**
     * Sets the value of the planStatus property.
     * 
     */
    public void setPlanStatus(boolean value) {
        this.planStatus = value;
    }

    /**
     * Gets the value of the benefitAmt property.
     * 
     */
    public double getBenefitAmt() {
        return benefitAmt;
    }

    /**
     * Sets the value of the benefitAmt property.
     * 
     */
    public void setBenefitAmt(double value) {
        this.benefitAmt = value;
    }

    /**
     * Gets the value of the creditAmt property.
     * 
     */
    public double getCreditAmt() {
        return creditAmt;
    }

    /**
     * Sets the value of the creditAmt property.
     * 
     */
    public void setCreditAmt(double value) {
        this.creditAmt = value;
    }

    /**
     * Gets the value of the pendingAmt property.
     * 
     */
    public double getPendingAmt() {
        return pendingAmt;
    }

    /**
     * Sets the value of the pendingAmt property.
     * 
     */
    public void setPendingAmt(double value) {
        this.pendingAmt = value;
    }

}
