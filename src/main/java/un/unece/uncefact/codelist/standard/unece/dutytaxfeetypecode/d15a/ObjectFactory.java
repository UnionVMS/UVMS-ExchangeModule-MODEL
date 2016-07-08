
package un.unece.uncefact.codelist.standard.unece.dutytaxfeetypecode.d15a;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.codelist.standard.unece.dutytaxfeetypecode.d15a package. 
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

    private final static QName _DutyTaxFeeTypeCode_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:UNECE:DutyTaxFeeTypeCode:D15A", "DutyTaxFeeTypeCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.codelist.standard.unece.dutytaxfeetypecode.d15a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DutyTaxFeeTypeCodeContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:DutyTaxFeeTypeCode:D15A", name = "DutyTaxFeeTypeCode")
    public JAXBElement<DutyTaxFeeTypeCodeContentType> createDutyTaxFeeTypeCode(DutyTaxFeeTypeCodeContentType value) {
        return new JAXBElement<DutyTaxFeeTypeCodeContentType>(_DutyTaxFeeTypeCode_QNAME, DutyTaxFeeTypeCodeContentType.class, null, value);
    }

}
