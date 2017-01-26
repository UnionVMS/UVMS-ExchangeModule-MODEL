
package eu.europa.ec.fisheries.schema.exchange.module.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.schema.exchange.plugin.types.v1.PluginType;


/**
 * <p>Java class for ExchangeBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeBaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="method" type="{urn:module.exchange.schema.fisheries.ec.europa.eu:v1}ExchangeModuleMethod"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pluginType" type="{urn:types.plugin.exchange.schema.fisheries.ec.europa.eu:v1}PluginType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeBaseRequest", propOrder = {
    "method",
    "username",
    "pluginType"
})
@XmlSeeAlso({
    ProcessedMovementResponse.class,
    SendMovementToPluginRequest.class,
    SetFLUXFAResponseMessageRequest.class,
    UpdatePluginSettingRequest.class,
    GetServiceListRequest.class,
    PingRequest.class,
    SetFLUXMDRSyncMessageExchangeResponse.class,
    SetFLUXMDRSyncMessageExchangeRequest.class,
    SetMovementReportRequest.class,
    SetFLUXFAReportMessageRequest.class,
    SetCommandRequest.class
})
public abstract class ExchangeBaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ExchangeModuleMethod method;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true, defaultValue = "OTHER")
    protected PluginType pluginType;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeModuleMethod }
     *     
     */
    public ExchangeModuleMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeModuleMethod }
     *     
     */
    public void setMethod(ExchangeModuleMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the pluginType property.
     * 
     * @return
     *     possible object is
     *     {@link PluginType }
     *     
     */
    public PluginType getPluginType() {
        return pluginType;
    }

    /**
     * Sets the value of the pluginType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginType }
     *     
     */
    public void setPluginType(PluginType value) {
        this.pluginType = value;
    }

}
