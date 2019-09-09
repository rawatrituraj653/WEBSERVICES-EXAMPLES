
package org.payments.paytm.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoice-info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoice-gen-date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="denial-rsn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tx-no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceInfo", propOrder = {
    "invoiceInfo",
    "invoiceGenDate",
    "status",
    "denialRsn",
    "txNo"
})
public class InvoiceInfo {

    @XmlElement(name = "invoice-info", required = true)
    protected String invoiceInfo;
    @XmlElement(name = "invoice-gen-date", required = true)
    protected String invoiceGenDate;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "denial-rsn", required = true)
    protected String denialRsn;
    @XmlElement(name = "tx-no", required = true)
    protected String txNo;

    /**
     * Gets the value of the invoiceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceInfo() {
        return invoiceInfo;
    }

    /**
     * Sets the value of the invoiceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceInfo(String value) {
        this.invoiceInfo = value;
    }

    /**
     * Gets the value of the invoiceGenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceGenDate() {
        return invoiceGenDate;
    }

    /**
     * Sets the value of the invoiceGenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceGenDate(String value) {
        this.invoiceGenDate = value;
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

    /**
     * Gets the value of the denialRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialRsn() {
        return denialRsn;
    }

    /**
     * Sets the value of the denialRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenialRsn(String value) {
        this.denialRsn = value;
    }

    /**
     * Gets the value of the txNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxNo() {
        return txNo;
    }

    /**
     * Sets the value of the txNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxNo(String value) {
        this.txNo = value;
    }

	@Override
	public String toString() {
		return "InvoiceInfo [invoiceInfo=" + invoiceInfo + ", invoiceGenDate=" + invoiceGenDate + ", status=" + status
				+ ", denialRsn=" + denialRsn + ", txNo=" + txNo + "]";
	}

    
}
