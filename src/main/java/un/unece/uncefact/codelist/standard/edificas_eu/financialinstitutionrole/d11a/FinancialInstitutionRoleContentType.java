
package un.unece.uncefact.codelist.standard.edificas_eu.financialinstitutionrole.d11a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstitutionRoleContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialInstitutionRoleContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FinancialInstitutionRoleContentType", namespace = "urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:FinancialInstitutionRole:D11A")
@XmlEnum
public enum FinancialInstitutionRoleContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE015="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:FinancialInstitutionRole:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Intermediary&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE015="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:FinancialInstitutionRole:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code is an intermediary.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    I,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE015="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:FinancialInstitutionRole:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Settlement agent&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE015="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:FinancialInstitutionRole:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code is a settlement agent.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static FinancialInstitutionRoleContentType fromValue(String v) {
        return valueOf(v);
    }

}
