
package un.unece.uncefact.codelist.standard.unece.measurementunitcommoncodetemperature._4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementUnitCommonCodeTemperatureContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementUnitCommonCodeTemperatureContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CEL"/>
 *     &lt;enumeration value="FAH"/>
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementUnitCommonCodeTemperatureContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeTemperature:4")
@XmlEnum
public enum MeasurementUnitCommonCodeTemperatureContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Temperature="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeTemperature:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;degree Celsius&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Temperature="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeTemperature:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Refer ISO 80000-5 (Quantities and units — Part 5: Thermodynamics)&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    CEL,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Temperature="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeTemperature:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;degree Fahrenheit&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Temperature="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeTemperature:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Refer ISO 80000-5 (Quantities and units — Part 5: Thermodynamics)&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    FAH;

    public String value() {
        return name();
    }

    public static MeasurementUnitCommonCodeTemperatureContentType fromValue(String v) {
        return valueOf(v);
    }

}
