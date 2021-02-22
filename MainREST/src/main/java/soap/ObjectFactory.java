
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
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

    private final static QName _CalculDeliveryFee_QNAME = new QName("http://server/", "calculDeliveryFee");
    private final static QName _CalculDeliveryFeeResponse_QNAME = new QName("http://server/", "calculDeliveryFeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculDeliveryFeeResponse }
     * 
     */
    public CalculDeliveryFeeResponse createCalculDeliveryFeeResponse() {
        return new CalculDeliveryFeeResponse();
    }

    /**
     * Create an instance of {@link CalculDeliveryFee }
     * 
     */
    public CalculDeliveryFee createCalculDeliveryFee() {
        return new CalculDeliveryFee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculDeliveryFee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "calculDeliveryFee")
    public JAXBElement<CalculDeliveryFee> createCalculDeliveryFee(CalculDeliveryFee value) {
        return new JAXBElement<CalculDeliveryFee>(_CalculDeliveryFee_QNAME, CalculDeliveryFee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculDeliveryFeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "calculDeliveryFeeResponse")
    public JAXBElement<CalculDeliveryFeeResponse> createCalculDeliveryFeeResponse(CalculDeliveryFeeResponse value) {
        return new JAXBElement<CalculDeliveryFeeResponse>(_CalculDeliveryFeeResponse_QNAME, CalculDeliveryFeeResponse.class, null, value);
    }

}
