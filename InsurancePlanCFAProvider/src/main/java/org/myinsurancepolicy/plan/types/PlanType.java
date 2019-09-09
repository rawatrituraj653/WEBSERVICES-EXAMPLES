
package org.myinsurancepolicy.plan.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plan-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plan-duration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="installment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="person-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanType", propOrder = {
    "planName",
    "planDuration",
    "installment",
    "personName",
    "age"
})
public class PlanType {

    @XmlElement(name = "plan-name", required = true)
    protected String planName;
    @XmlElement(name = "plan-duration")
    protected double planDuration;
    protected int installment;
    @XmlElement(name = "person-name", required = true)
    protected String personName;
    protected int age;

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Gets the value of the planDuration property.
     * 
     */
    public double getPlanDuration() {
        return planDuration;
    }

    /**
     * Sets the value of the planDuration property.
     * 
     */
    public void setPlanDuration(double value) {
        this.planDuration = value;
    }

    /**
     * Gets the value of the installment property.
     * 
     */
    public int getInstallment() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     */
    public void setInstallment(int value) {
        this.installment = value;
    }

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
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

}
