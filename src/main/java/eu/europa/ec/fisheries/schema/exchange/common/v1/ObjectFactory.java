
package eu.europa.ec.fisheries.schema.exchange.common.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.ec.fisheries.schema.exchange.common.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.ec.fisheries.schema.exchange.common.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExchangeFault }
     * 
     */
    public ExchangeFault createExchangeFault() {
        return new ExchangeFault();
    }

    /**
     * Create an instance of {@link KeyValueType }
     * 
     */
    public KeyValueType createKeyValueType() {
        return new KeyValueType();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link CommandType }
     * 
     */
    public CommandType createCommandType() {
        return new CommandType();
    }

    /**
     * Create an instance of {@link AcknowledgeType }
     * 
     */
    public AcknowledgeType createAcknowledgeType() {
        return new AcknowledgeType();
    }

    /**
     * Create an instance of {@link PollStatusAcknowledgeType }
     * 
     */
    public PollStatusAcknowledgeType createPollStatusAcknowledgeType() {
        return new PollStatusAcknowledgeType();
    }

}
