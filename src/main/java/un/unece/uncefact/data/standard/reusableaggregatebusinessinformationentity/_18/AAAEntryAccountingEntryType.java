
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingEntryCategoryCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingEntryProcessingCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IndicatorType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01009394&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry_ Accounting Entry. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An AAA (Accounting and Audit) entry into accounting books.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting Entry&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting, audit&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:OfficialConstraintContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;None&lt;/ccts:OfficialConstraintContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting, audit&lt;/ccts:ProductContextValue&gt;
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
 * <p>Java class for AAAEntryAccountingEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAAEntryAccountingEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="ProcessingStatusCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingEntryProcessingCodeType"/>
 *         &lt;element name="ValueDateDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType"/>
 *         &lt;element name="RemovalIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="UnbalancedIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="RelatedEntryID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingEntryCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="CaptureDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ReversalDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ValidationDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DetailedAAAEntryAccountingEntryLine" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryAccountingEntryLineType" maxOccurs="unbounded"/>
 *         &lt;element name="SpecifiedAAAEntryAccountingJournal" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryAccountingJournalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAAEntryAccountingEntryType", propOrder = {
    "id",
    "processingStatusCode",
    "valueDateDateTime",
    "removalIndicator",
    "unbalancedIndicator",
    "relatedEntryID",
    "categoryCode",
    "purpose",
    "captureDateTime",
    "reversalDateTime",
    "validationDateTime",
    "detailedAAAEntryAccountingEntryLine",
    "specifiedAAAEntryAccountingJournal"
})
public class AAAEntryAccountingEntryType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "ProcessingStatusCode", required = true)
    protected AccountingEntryProcessingCodeType processingStatusCode;
    @XmlElement(name = "ValueDateDateTime", required = true)
    protected DateTimeType valueDateDateTime;
    @XmlElement(name = "RemovalIndicator")
    protected IndicatorType removalIndicator;
    @XmlElement(name = "UnbalancedIndicator")
    protected IndicatorType unbalancedIndicator;
    @XmlElement(name = "RelatedEntryID")
    protected IDType relatedEntryID;
    @XmlElement(name = "CategoryCode")
    protected AccountingEntryCategoryCodeType categoryCode;
    @XmlElement(name = "Purpose")
    protected TextType purpose;
    @XmlElement(name = "CaptureDateTime")
    protected DateTimeType captureDateTime;
    @XmlElement(name = "ReversalDateTime")
    protected DateTimeType reversalDateTime;
    @XmlElement(name = "ValidationDateTime")
    protected DateTimeType validationDateTime;
    @XmlElement(name = "DetailedAAAEntryAccountingEntryLine", required = true)
    protected List<AAAEntryAccountingEntryLineType> detailedAAAEntryAccountingEntryLine;
    @XmlElement(name = "SpecifiedAAAEntryAccountingJournal", required = true)
    protected AAAEntryAccountingJournalType specifiedAAAEntryAccountingJournal;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the processingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryProcessingCodeType }
     *     
     */
    public AccountingEntryProcessingCodeType getProcessingStatusCode() {
        return processingStatusCode;
    }

    /**
     * Sets the value of the processingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryProcessingCodeType }
     *     
     */
    public void setProcessingStatusCode(AccountingEntryProcessingCodeType value) {
        this.processingStatusCode = value;
    }

    /**
     * Gets the value of the valueDateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getValueDateDateTime() {
        return valueDateDateTime;
    }

    /**
     * Sets the value of the valueDateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setValueDateDateTime(DateTimeType value) {
        this.valueDateDateTime = value;
    }

    /**
     * Gets the value of the removalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getRemovalIndicator() {
        return removalIndicator;
    }

    /**
     * Sets the value of the removalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setRemovalIndicator(IndicatorType value) {
        this.removalIndicator = value;
    }

    /**
     * Gets the value of the unbalancedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getUnbalancedIndicator() {
        return unbalancedIndicator;
    }

    /**
     * Sets the value of the unbalancedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setUnbalancedIndicator(IndicatorType value) {
        this.unbalancedIndicator = value;
    }

    /**
     * Gets the value of the relatedEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRelatedEntryID() {
        return relatedEntryID;
    }

    /**
     * Sets the value of the relatedEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRelatedEntryID(IDType value) {
        this.relatedEntryID = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryCategoryCodeType }
     *     
     */
    public AccountingEntryCategoryCodeType getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryCategoryCodeType }
     *     
     */
    public void setCategoryCode(AccountingEntryCategoryCodeType value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPurpose(TextType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the captureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCaptureDateTime() {
        return captureDateTime;
    }

    /**
     * Sets the value of the captureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCaptureDateTime(DateTimeType value) {
        this.captureDateTime = value;
    }

    /**
     * Gets the value of the reversalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getReversalDateTime() {
        return reversalDateTime;
    }

    /**
     * Sets the value of the reversalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setReversalDateTime(DateTimeType value) {
        this.reversalDateTime = value;
    }

    /**
     * Gets the value of the validationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getValidationDateTime() {
        return validationDateTime;
    }

    /**
     * Sets the value of the validationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setValidationDateTime(DateTimeType value) {
        this.validationDateTime = value;
    }

    /**
     * Gets the value of the detailedAAAEntryAccountingEntryLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedAAAEntryAccountingEntryLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedAAAEntryAccountingEntryLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryAccountingEntryLineType }
     * 
     * 
     */
    public List<AAAEntryAccountingEntryLineType> getDetailedAAAEntryAccountingEntryLine() {
        if (detailedAAAEntryAccountingEntryLine == null) {
            detailedAAAEntryAccountingEntryLine = new ArrayList<AAAEntryAccountingEntryLineType>();
        }
        return this.detailedAAAEntryAccountingEntryLine;
    }

    /**
     * Gets the value of the specifiedAAAEntryAccountingJournal property.
     * 
     * @return
     *     possible object is
     *     {@link AAAEntryAccountingJournalType }
     *     
     */
    public AAAEntryAccountingJournalType getSpecifiedAAAEntryAccountingJournal() {
        return specifiedAAAEntryAccountingJournal;
    }

    /**
     * Sets the value of the specifiedAAAEntryAccountingJournal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAEntryAccountingJournalType }
     *     
     */
    public void setSpecifiedAAAEntryAccountingJournal(AAAEntryAccountingJournalType value) {
        this.specifiedAAAEntryAccountingJournal = value;
    }

}
