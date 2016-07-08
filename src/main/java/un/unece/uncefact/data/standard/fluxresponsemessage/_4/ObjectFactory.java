
package un.unece.uncefact.data.standard.fluxresponsemessage._4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.data.standard.fluxresponsemessage._4 package. 
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

    private final static QName _FLUXResponseMessage_QNAME = new QName("urn:un:unece:uncefact:data:standard:FLUXResponseMessage:4", "FLUXResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.data.standard.fluxresponsemessage._4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FLUXResponseMessageType }
     * 
     */
    public FLUXResponseMessageType createFLUXResponseMessageType() {
        return new FLUXResponseMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FLUXResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:data:standard:FLUXResponseMessage:4", name = "FLUXResponseMessage")
    public JAXBElement<FLUXResponseMessageType> createFLUXResponseMessage(FLUXResponseMessageType value) {
        return new JAXBElement<FLUXResponseMessageType>(_FLUXResponseMessage_QNAME, FLUXResponseMessageType.class, null, value);
    }

}
