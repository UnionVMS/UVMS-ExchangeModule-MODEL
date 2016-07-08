
package un.unece.uncefact.codelist.standard.edificas_eu.financialinstitutionrole.d11a;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.codelist.standard.edificas_eu.financialinstitutionrole.d11a package. 
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

    private final static QName _FinancialInstitutionRole_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:FinancialInstitutionRole:D11A", "FinancialInstitutionRole");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.codelist.standard.edificas_eu.financialinstitutionrole.d11a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitutionRoleContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:FinancialInstitutionRole:D11A", name = "FinancialInstitutionRole")
    public JAXBElement<FinancialInstitutionRoleContentType> createFinancialInstitutionRole(FinancialInstitutionRoleContentType value) {
        return new JAXBElement<FinancialInstitutionRoleContentType>(_FinancialInstitutionRole_QNAME, FinancialInstitutionRoleContentType.class, null, value);
    }

}
