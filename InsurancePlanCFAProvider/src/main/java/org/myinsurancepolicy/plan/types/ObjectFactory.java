
package org.myinsurancepolicy.plan.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.myinsurancepolicy.plan.types package. 
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

    private final static QName _PlanInfo_QNAME = new QName("http://myinsurancepolicy.org/plan/types", "plan-info");
    private final static QName _PlanType_QNAME = new QName("http://myinsurancepolicy.org/plan/types", "plan-type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.myinsurancepolicy.plan.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlanInfoType }
     * 
     */
    public PlanInfoType createPlanInfoType() {
        return new PlanInfoType();
    }

    /**
     * Create an instance of {@link PlanType }
     * 
     */
    public PlanType createPlanType() {
        return new PlanType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myinsurancepolicy.org/plan/types", name = "plan-info")
    public JAXBElement<PlanInfoType> createPlanInfo(PlanInfoType value) {
        return new JAXBElement<PlanInfoType>(_PlanInfo_QNAME, PlanInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://myinsurancepolicy.org/plan/types", name = "plan-type")
    public JAXBElement<PlanType> createPlanType(PlanType value) {
        return new JAXBElement<PlanType>(_PlanType_QNAME, PlanType.class, null, value);
    }

}
