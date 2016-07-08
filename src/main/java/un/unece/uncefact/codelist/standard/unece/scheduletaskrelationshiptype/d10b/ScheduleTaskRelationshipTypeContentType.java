
package un.unece.uncefact.codelist.standard.unece.scheduletaskrelationshiptype.d10b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleTaskRelationshipTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScheduleTaskRelationshipTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="F2F"/>
 *     &lt;enumeration value="F2S"/>
 *     &lt;enumeration value="S2F"/>
 *     &lt;enumeration value="S2S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScheduleTaskRelationshipTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B")
@XmlEnum
public enum ScheduleTaskRelationshipTypeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Finish to finish&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Predecessor and successor tasks must finish at the same time.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("F2F")
    F_2_F("F2F"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Finish to start&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The predecessor task must finish before the successor task may start.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("F2S")
    F_2_S("F2S"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Start to finish&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The predecessor task must start before the successor task may finish.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("S2F")
    S_2_F("S2F"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Start to start&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69673="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskRelationshipType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Predecessor and successor tasks must start at the same time.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("S2S")
    S_2_S("S2S");
    private final String value;

    ScheduleTaskRelationshipTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScheduleTaskRelationshipTypeContentType fromValue(String v) {
        for (ScheduleTaskRelationshipTypeContentType c: ScheduleTaskRelationshipTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
