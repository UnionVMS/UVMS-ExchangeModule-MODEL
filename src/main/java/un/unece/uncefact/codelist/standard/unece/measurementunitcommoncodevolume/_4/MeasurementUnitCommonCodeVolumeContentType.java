
package un.unece.uncefact.codelist.standard.unece.measurementunitcommoncodevolume._4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementUnitCommonCodeVolumeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementUnitCommonCodeVolumeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CMQ"/>
 *     &lt;enumeration value="FTQ"/>
 *     &lt;enumeration value="MMQ"/>
 *     &lt;enumeration value="MTQ"/>
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementUnitCommonCodeVolumeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeVolume:4")
@XmlEnum
public enum MeasurementUnitCommonCodeVolumeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Volume="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeVolume:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;cubic centimetre&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    CMQ,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Volume="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeVolume:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;cubic foot&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    FTQ,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Volume="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeVolume:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;cubic millimetre&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 
     */
    MMQ,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Volume="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeVolume:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;cubic metre&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6Recommendation20Volume="urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeVolume:4" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Synonym: metre cubed&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    MTQ;

    public String value() {
        return name();
    }

    public static MeasurementUnitCommonCodeVolumeContentType fromValue(String v) {
        return valueOf(v);
    }

}
