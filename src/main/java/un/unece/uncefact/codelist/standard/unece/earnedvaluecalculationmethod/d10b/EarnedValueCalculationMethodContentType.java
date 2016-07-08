
package un.unece.uncefact.codelist.standard.unece.earnedvaluecalculationmethod.d10b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EarnedValueCalculationMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EarnedValueCalculationMethodContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="APF"/>
 *     &lt;enumeration value="LOE"/>
 *     &lt;enumeration value="MTN"/>
 *     &lt;enumeration value="P01"/>
 *     &lt;enumeration value="P10"/>
 *     &lt;enumeration value="P50"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PTC"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="UNT"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EarnedValueCalculationMethodContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B")
@XmlEnum
public enum EarnedValueCalculationMethodContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Apportioned effort&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earned value dependent on other discrete tasks being completed.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    APF("APF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Level of effort&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earned value is based on the level of effort in the absence of specific end results or deliverables, such as management and other non discrete work tasks.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    LOE("LOE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Milestone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earn a specified percent complete (of the total budget) when a milestone is complete.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    MTN("MTN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Work complete&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earn 100% of the budget value when the work effort is complete.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("P01")
    P_01("P01"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Work start&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earn 100% of the budget value when the work effort begins.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("P10")
    P_10("P10"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Half start&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earn 50% of the budget value when work begins, earn remaining 50% when work completes.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("P50")
    P_50("P50"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Package planning&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Not an earned value method per se, but used to identify a task or work package that must be broken down into discrete work effort at a later time.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    PLN("PLN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Percent complete&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earned value is based on the percent complete (between 0 and 100).&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    PTC("PTC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Standards&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earned value is based on a set standard defined for the type of product being produced.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    STD("STD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Units&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Earned value is based on quantity of material units or manufactured components.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    UNT("UNT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually defined&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69657="urn:un:unece:uncefact:codelist:standard:UNECE:EarnedValueCalculationMethod:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually agreed upon earned value calculation method.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    ZZZ("ZZZ");
    private final String value;

    EarnedValueCalculationMethodContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EarnedValueCalculationMethodContentType fromValue(String v) {
        for (EarnedValueCalculationMethodContentType c: EarnedValueCalculationMethodContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
