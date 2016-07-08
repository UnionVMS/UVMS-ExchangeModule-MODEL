
package un.unece.uncefact.codelist.standard.iso.iso3alphacurrencycode._2012_08_31;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.codelist.standard.iso.iso3alphacurrencycode._2012_08_31 package. 
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

    private final static QName _ISO3AlphaCurrencyCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:ISO:ISO3AlphaCurrencyCode:2012-08-31", "ISO3AlphaCurrencyCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.codelist.standard.iso.iso3alphacurrencycode._2012_08_31
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISO3AlphaCurrencyCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:ISO:ISO3AlphaCurrencyCode:2012-08-31", name = "ISO3AlphaCurrencyCode")
    public JAXBElement<ISO3AlphaCurrencyCodeContentType> createISO3AlphaCurrencyCode(ISO3AlphaCurrencyCodeContentType value) {
        return new JAXBElement<ISO3AlphaCurrencyCodeContentType>(_ISO3AlphaCurrencyCode_QNAME, ISO3AlphaCurrencyCodeContentType.class, null, value);
    }

}
