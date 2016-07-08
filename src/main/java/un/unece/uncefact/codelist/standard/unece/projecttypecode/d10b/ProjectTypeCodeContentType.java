
package un.unece.uncefact.codelist.standard.unece.projecttypecode.d10b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="GCN"/>
 *     &lt;enumeration value="DEP"/>
 *     &lt;enumeration value="FRP"/>
 *     &lt;enumeration value="LRP"/>
 *     &lt;enumeration value="OS"/>
 *     &lt;enumeration value="PRC"/>
 *     &lt;enumeration value="PRD"/>
 *     &lt;enumeration value="RDT"/>
 *     &lt;enumeration value="SDD"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectTypeCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B")
@XmlEnum
public enum ProjectTypeCodeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Government Construction&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project involving construction activities for the government.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    GCN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Deployment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project intended to take an existing product and place it into operational use.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    DEP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Full rate production&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project geared to producing goods and/or services at an economic level. Also known as full scale development.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    FRP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Low rate initial production&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project serving as the first effort of the production and deployment phase, such as establishing an initial production base for the system and facilitating an orderly ramp-up, sufficient to lead to a smooth transition to full rate production.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    LRP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Operations and support&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project that provides a support program for operating and sustaining a system and/or service over its total life cycle.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    OS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Government Procurement&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project involving buying goods and/or services for the government.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    PRC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Production&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project producing goods and/or services, such as the process of converting raw materials into finished goods. It may include functions such as production scheduling, inspection, and quality control.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    PRD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Research, development, test and evaluation&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project geared to researching, developing, testing, and evaluating a new product or service.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    RDT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;System development and demonstration&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A project consisting of two efforts, development of a system, and the demonstration to the project sponsor that the system satisfies project requirements.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    SDD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually defined&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69665="urn:un:unece:uncefact:codelist:standard:UNECE:ProjectTypeCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually agreed upon project type.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    ZZZ;

    public String value() {
        return name();
    }

    public static ProjectTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
