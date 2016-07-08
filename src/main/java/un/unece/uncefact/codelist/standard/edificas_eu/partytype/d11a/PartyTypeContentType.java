
package un.unece.uncefact.codelist.standard.edificas_eu.partytype.d11a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BRA"/>
 *     &lt;enumeration value="DEP"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="SEC"/>
 *     &lt;enumeration value="SER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartyTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A")
@XmlEnum
public enum PartyTypeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Branch&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a Branch.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    BRA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Department&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a Department.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    DEP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direction&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a Direction.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    DIR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Section&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a Section.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    SEC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Service&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210PartyTypeE705="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:PartyType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a Service.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    SER;

    public String value() {
        return name();
    }

    public static PartyTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
