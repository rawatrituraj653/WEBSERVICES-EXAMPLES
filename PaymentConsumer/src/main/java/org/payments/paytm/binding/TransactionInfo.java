
package org.payments.paytm.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atm-id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInfo", propOrder = {
    "atmId",
    "pin",
    "amount"
})
public class TransactionInfo {

    @XmlElement(name = "atm-id")
    protected long atmId;
    protected int pin;
    protected double amount;

    /**
     * Gets the value of the atmId property.
     * 
     */
    public long getAtmId() {
        return atmId;
    }

    /**
     * Sets the value of the atmId property.
     * 
     */
    public void setAtmId(long value) {
        this.atmId = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     */
    public int getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     */
    public void setPin(int value) {
        this.pin = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

}
