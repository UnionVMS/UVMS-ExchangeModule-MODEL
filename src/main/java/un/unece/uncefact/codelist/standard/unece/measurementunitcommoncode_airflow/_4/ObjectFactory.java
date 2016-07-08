
package un.unece.uncefact.codelist.standard.unece.measurementunitcommoncode_airflow._4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.codelist.standard.unece.measurementunitcommoncode_airflow._4 package. 
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

    private final static QName _MeasurementUnitCommonCodeAirflow_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCode_Airflow:4", "MeasurementUnitCommonCodeAirflow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.codelist.standard.unece.measurementunitcommoncode_airflow._4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCode_Airflow:4", name = "MeasurementUnitCommonCodeAirflow")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMeasurementUnitCommonCodeAirflow(String value) {
        return new JAXBElement<String>(_MeasurementUnitCommonCodeAirflow_QNAME, String.class, null, value);
    }

}
