
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01011415&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;TT Transaction_ Event. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information about an event declaring that certain objects have been associated or disassociated with one or more Track and Trace (TT) trade transactions.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;TT Transaction&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Traceability&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Global&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:IndustryContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:BusinessProcessRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SupportingRoleContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SupportingRoleContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:SystemCapabilitiesContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:SystemCapabilitiesContextValue&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TTTransactionEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTTransactionEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OccurrenceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType"/>
 *         &lt;element name="RecordedDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType"/>
 *         &lt;element name="ParentObjectID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="ObjectInstanceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType"/>
 *         &lt;element name="BusinessStepCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="DispositionCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="ReadPointRelatedTTLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TTLocationType" minOccurs="0"/>
 *         &lt;element name="BusinessRelatedTTLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TTLocationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedTTTradeTransaction" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TTTradeTransactionType" maxOccurs="unbounded"/>
 *         &lt;element name="QuantitySpecifiedTTEventElement" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TTEventElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SourceRelatedTTParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TTPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DestinationRelatedTTParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TTPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTTransactionEventType", propOrder = {
    "occurrenceDateTime",
    "recordedDateTime",
    "parentObjectID",
    "objectInstanceID",
    "actionCode",
    "businessStepCode",
    "dispositionCode",
    "readPointRelatedTTLocation",
    "businessRelatedTTLocation",
    "specifiedTTTradeTransaction",
    "quantitySpecifiedTTEventElement",
    "sourceRelatedTTParty",
    "destinationRelatedTTParty"
})
public class TTTransactionEventType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OccurrenceDateTime", required = true)
    protected DateTimeType occurrenceDateTime;
    @XmlElement(name = "RecordedDateTime", required = true)
    protected DateTimeType recordedDateTime;
    @XmlElement(name = "ParentObjectID")
    protected IDType parentObjectID;
    @XmlElement(name = "ObjectInstanceID")
    protected List<IDType> objectInstanceID;
    @XmlElement(name = "ActionCode", required = true)
    protected CodeType actionCode;
    @XmlElement(name = "BusinessStepCode")
    protected CodeType businessStepCode;
    @XmlElement(name = "DispositionCode")
    protected CodeType dispositionCode;
    @XmlElement(name = "ReadPointRelatedTTLocation")
    protected TTLocationType readPointRelatedTTLocation;
    @XmlElement(name = "BusinessRelatedTTLocation")
    protected TTLocationType businessRelatedTTLocation;
    @XmlElement(name = "SpecifiedTTTradeTransaction", required = true)
    protected List<TTTradeTransactionType> specifiedTTTradeTransaction;
    @XmlElement(name = "QuantitySpecifiedTTEventElement")
    protected List<TTEventElementType> quantitySpecifiedTTEventElement;
    @XmlElement(name = "SourceRelatedTTParty")
    protected List<TTPartyType> sourceRelatedTTParty;
    @XmlElement(name = "DestinationRelatedTTParty")
    protected List<TTPartyType> destinationRelatedTTParty;

    /**
     * Gets the value of the occurrenceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOccurrenceDateTime() {
        return occurrenceDateTime;
    }

    /**
     * Sets the value of the occurrenceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOccurrenceDateTime(DateTimeType value) {
        this.occurrenceDateTime = value;
    }

    /**
     * Gets the value of the recordedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRecordedDateTime() {
        return recordedDateTime;
    }

    /**
     * Sets the value of the recordedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setRecordedDateTime(DateTimeType value) {
        this.recordedDateTime = value;
    }

    /**
     * Gets the value of the parentObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getParentObjectID() {
        return parentObjectID;
    }

    /**
     * Sets the value of the parentObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setParentObjectID(IDType value) {
        this.parentObjectID = value;
    }

    /**
     * Gets the value of the objectInstanceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectInstanceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectInstanceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getObjectInstanceID() {
        if (objectInstanceID == null) {
            objectInstanceID = new ArrayList<IDType>();
        }
        return this.objectInstanceID;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setActionCode(CodeType value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the businessStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBusinessStepCode() {
        return businessStepCode;
    }

    /**
     * Sets the value of the businessStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBusinessStepCode(CodeType value) {
        this.businessStepCode = value;
    }

    /**
     * Gets the value of the dispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Sets the value of the dispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDispositionCode(CodeType value) {
        this.dispositionCode = value;
    }

    /**
     * Gets the value of the readPointRelatedTTLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TTLocationType }
     *     
     */
    public TTLocationType getReadPointRelatedTTLocation() {
        return readPointRelatedTTLocation;
    }

    /**
     * Sets the value of the readPointRelatedTTLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTLocationType }
     *     
     */
    public void setReadPointRelatedTTLocation(TTLocationType value) {
        this.readPointRelatedTTLocation = value;
    }

    /**
     * Gets the value of the businessRelatedTTLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TTLocationType }
     *     
     */
    public TTLocationType getBusinessRelatedTTLocation() {
        return businessRelatedTTLocation;
    }

    /**
     * Sets the value of the businessRelatedTTLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTLocationType }
     *     
     */
    public void setBusinessRelatedTTLocation(TTLocationType value) {
        this.businessRelatedTTLocation = value;
    }

    /**
     * Gets the value of the specifiedTTTradeTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedTTTradeTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedTTTradeTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTTradeTransactionType }
     * 
     * 
     */
    public List<TTTradeTransactionType> getSpecifiedTTTradeTransaction() {
        if (specifiedTTTradeTransaction == null) {
            specifiedTTTradeTransaction = new ArrayList<TTTradeTransactionType>();
        }
        return this.specifiedTTTradeTransaction;
    }

    /**
     * Gets the value of the quantitySpecifiedTTEventElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantitySpecifiedTTEventElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantitySpecifiedTTEventElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTEventElementType }
     * 
     * 
     */
    public List<TTEventElementType> getQuantitySpecifiedTTEventElement() {
        if (quantitySpecifiedTTEventElement == null) {
            quantitySpecifiedTTEventElement = new ArrayList<TTEventElementType>();
        }
        return this.quantitySpecifiedTTEventElement;
    }

    /**
     * Gets the value of the sourceRelatedTTParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceRelatedTTParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceRelatedTTParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTPartyType }
     * 
     * 
     */
    public List<TTPartyType> getSourceRelatedTTParty() {
        if (sourceRelatedTTParty == null) {
            sourceRelatedTTParty = new ArrayList<TTPartyType>();
        }
        return this.sourceRelatedTTParty;
    }

    /**
     * Gets the value of the destinationRelatedTTParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationRelatedTTParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationRelatedTTParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TTPartyType }
     * 
     * 
     */
    public List<TTPartyType> getDestinationRelatedTTParty() {
        if (destinationRelatedTTParty == null) {
            destinationRelatedTTParty = new ArrayList<TTPartyType>();
        }
        return this.destinationRelatedTTParty;
    }

}
