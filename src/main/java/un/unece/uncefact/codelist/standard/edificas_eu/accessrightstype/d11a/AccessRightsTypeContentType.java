
package un.unece.uncefact.codelist.standard.edificas_eu.accessrightstype.d11a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessRightsTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessRightsTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessRightsTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AccessRightsType:D11A")
@XmlEnum
public enum AccessRightsTypeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE704="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AccessRightsType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Prohibited&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE704="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AccessRightsType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates prohibited access rights.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    P,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE704="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AccessRightsType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Restricted&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE704="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AccessRightsType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates restricted access rights.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    R,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE704="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AccessRightsType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unlimited&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE704="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AccessRightsType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates unlimited access rights.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static AccessRightsTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
