
package un.unece.uncefact.codelist.standard.unece.measurementunitcommoncode_filesize._4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.codelist.standard.unece.measurementunitcommoncode_filesize._4 package. 
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

    private final static QName _MeasurementUnitCommonCodeFileSize_QNAME = new QName("urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCode_FileSize:4", "MeasurementUnitCommonCodeFileSize");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.codelist.standard.unece.measurementunitcommoncode_filesize._4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCode_FileSize:4", name = "MeasurementUnitCommonCodeFileSize")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMeasurementUnitCommonCodeFileSize(String value) {
        return new JAXBElement<String>(_MeasurementUnitCommonCodeFileSize_QNAME, String.class, null, value);
    }

}
