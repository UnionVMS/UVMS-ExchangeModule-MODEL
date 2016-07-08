
package un.unece.uncefact.identifierlist.standard.iso.isotwo_lettercountrycode.secondedition2006;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.identifierlist.standard.iso.isotwo_lettercountrycode.secondedition2006 package. 
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

    private final static QName _ISOTwoletterCountryCode_QNAME = new QName("urn:un:unece:uncefact:identifierlist:standard:ISO:ISOTwo-letterCountryCode:SecondEdition2006", "ISOTwoletterCountryCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.identifierlist.standard.iso.isotwo_lettercountrycode.secondedition2006
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISOTwoletterCountryCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:identifierlist:standard:ISO:ISOTwo-letterCountryCode:SecondEdition2006", name = "ISOTwoletterCountryCode")
    public JAXBElement<ISOTwoletterCountryCodeContentType> createISOTwoletterCountryCode(ISOTwoletterCountryCodeContentType value) {
        return new JAXBElement<ISOTwoletterCountryCodeContentType>(_ISOTwoletterCountryCode_QNAME, ISOTwoletterCountryCodeContentType.class, null, value);
    }

}
