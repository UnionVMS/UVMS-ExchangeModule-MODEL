
package un.unece.uncefact.codelist.standard.edificas_eu.amountweighttype.d11a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountWeightTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountWeightTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="MDC"/>
 *     &lt;enumeration value="MNC"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="TC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountWeightTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A")
@XmlEnum
public enum AmountWeightTypeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Decimalized amount&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a decimalized amount.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    D,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Milliard currency amount&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a milliard currency amount.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    MDC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Million currency amount&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a million currency amount.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    MNC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rounded amount&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a rounded amount.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    R,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Truncated amount&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a truncated amount.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    T,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Thousand currency amount&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm210AccountingE702="urn:un:unece:uncefact:codelist:standard:EDIFICAS-EU:AmountWeightType:D11A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The code indicates a thousand currency amount.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    TC;

    public String value() {
        return name();
    }

    public static AmountWeightTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
