
package org.payments.paytm.binding;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.payments.paytm.binding package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.payments.paytm.binding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountInfoRequest }
     * 
     */
    public AccountInfoRequest createAccountInfoRequest() {
        return new AccountInfoRequest();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link TransactionInfo }
     * 
     */
    public TransactionInfo createTransactionInfo() {
        return new TransactionInfo();
    }

    /**
     * Create an instance of {@link InvoiceInfoResponse }
     * 
     */
    public InvoiceInfoResponse createInvoiceInfoResponse() {
        return new InvoiceInfoResponse();
    }

    /**
     * Create an instance of {@link InvoiceInfo }
     * 
     */
    public InvoiceInfo createInvioceInfo() {
        return new InvoiceInfo();
    }

}
