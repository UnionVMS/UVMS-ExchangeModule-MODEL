
package eu.europa.ec.fisheries.schema.exchange.v1;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for SendPollType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendPollType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:exchange.schema.fisheries.ec.europa.eu:v1}ExchangeLogType">
 *       &lt;sequence>
 *         &lt;element name="fwdRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recipient" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fwdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendPollType", propOrder = {
    "fwdRule",
    "recipient",
    "fwdDate"
})
public class SendPollType
    extends ExchangeLogType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String fwdRule;
    @XmlElement(required = true)
    protected String recipient;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date fwdDate;

    /**
     * Gets the value of the fwdRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFwdRule() {
        return fwdRule;
    }

    /**
     * Sets the value of the fwdRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdRule(String value) {
        this.fwdRule = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the fwdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFwdDate() {
        return fwdDate;
    }

    /**
     * Sets the value of the fwdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFwdDate(Date value) {
        this.fwdDate = value;
    }

}
