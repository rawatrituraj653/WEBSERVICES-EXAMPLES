
package com.nit.calc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nit.calc package. 
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

    private final static QName _SubstractResponse_QNAME = new QName("http://calc.nit.com/", "substractResponse");
    private final static QName _DivisionResponse_QNAME = new QName("http://calc.nit.com/", "divisionResponse");
    private final static QName _RemaiderResponse_QNAME = new QName("http://calc.nit.com/", "remaiderResponse");
    private final static QName _Division_QNAME = new QName("http://calc.nit.com/", "division");
    private final static QName _AdditonResponse_QNAME = new QName("http://calc.nit.com/", "additonResponse");
    private final static QName _Substract_QNAME = new QName("http://calc.nit.com/", "substract");
    private final static QName _Remaider_QNAME = new QName("http://calc.nit.com/", "remaider");
    private final static QName _MultipleResponse_QNAME = new QName("http://calc.nit.com/", "multipleResponse");
    private final static QName _Additon_QNAME = new QName("http://calc.nit.com/", "additon");
    private final static QName _Multiple_QNAME = new QName("http://calc.nit.com/", "multiple");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nit.calc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link RemaiderResponse }
     * 
     */
    public RemaiderResponse createRemaiderResponse() {
        return new RemaiderResponse();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link SubstractResponse }
     * 
     */
    public SubstractResponse createSubstractResponse() {
        return new SubstractResponse();
    }

    /**
     * Create an instance of {@link Additon }
     * 
     */
    public Additon createAdditon() {
        return new Additon();
    }

    /**
     * Create an instance of {@link Multiple }
     * 
     */
    public Multiple createMultiple() {
        return new Multiple();
    }

    /**
     * Create an instance of {@link MultipleResponse }
     * 
     */
    public MultipleResponse createMultipleResponse() {
        return new MultipleResponse();
    }

    /**
     * Create an instance of {@link Remaider }
     * 
     */
    public Remaider createRemaider() {
        return new Remaider();
    }

    /**
     * Create an instance of {@link Substract }
     * 
     */
    public Substract createSubstract() {
        return new Substract();
    }

    /**
     * Create an instance of {@link AdditonResponse }
     * 
     */
    public AdditonResponse createAdditonResponse() {
        return new AdditonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "substractResponse")
    public JAXBElement<SubstractResponse> createSubstractResponse(SubstractResponse value) {
        return new JAXBElement<SubstractResponse>(_SubstractResponse_QNAME, SubstractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemaiderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "remaiderResponse")
    public JAXBElement<RemaiderResponse> createRemaiderResponse(RemaiderResponse value) {
        return new JAXBElement<RemaiderResponse>(_RemaiderResponse_QNAME, RemaiderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "additonResponse")
    public JAXBElement<AdditonResponse> createAdditonResponse(AdditonResponse value) {
        return new JAXBElement<AdditonResponse>(_AdditonResponse_QNAME, AdditonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "substract")
    public JAXBElement<Substract> createSubstract(Substract value) {
        return new JAXBElement<Substract>(_Substract_QNAME, Substract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remaider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "remaider")
    public JAXBElement<Remaider> createRemaider(Remaider value) {
        return new JAXBElement<Remaider>(_Remaider_QNAME, Remaider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "multipleResponse")
    public JAXBElement<MultipleResponse> createMultipleResponse(MultipleResponse value) {
        return new JAXBElement<MultipleResponse>(_MultipleResponse_QNAME, MultipleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Additon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "additon")
    public JAXBElement<Additon> createAdditon(Additon value) {
        return new JAXBElement<Additon>(_Additon_QNAME, Additon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calc.nit.com/", name = "multiple")
    public JAXBElement<Multiple> createMultiple(Multiple value) {
        return new JAXBElement<Multiple>(_Multiple_QNAME, Multiple.class, null, value);
    }

}
