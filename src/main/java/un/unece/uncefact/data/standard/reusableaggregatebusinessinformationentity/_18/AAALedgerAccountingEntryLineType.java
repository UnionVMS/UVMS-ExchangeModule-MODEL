
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingEntryLineCategoryCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingEntryLineSourceCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.QuantityType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01007945&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Ledger_ Accounting Entry Line. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A line of an AAA (Accounting And Audit) ledger accounting entry posted into a ledger accounting account.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting Entry Line&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Ledger&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting, audit and reporting&lt;/ccts:BusinessProcessContextValue&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting And Audit Ledger&lt;/ccts:ProductContextValue&gt;
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
 * <p>Java class for AAALedgerAccountingEntryLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAALedgerAccountingEntryLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingEntryLineCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="SourceCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingEntryLineSourceCodeType" minOccurs="0"/>
 *         &lt;element name="LastChangeDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LastChangeResponsiblePersonName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="ActualQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="Nature" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="ConnectedAAALedgerAccountingEntry" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAALedgerAccountingEntryType"/>
 *         &lt;element name="SpecifiedAAALedgerAccountingLineIndex" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAALedgerAccountingLineIndexType" minOccurs="0"/>
 *         &lt;element name="RelatedAAALedgerTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAALedgerTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RepeatedAAALedgerMonetaryAllocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAALedgerMonetaryAllocationType" minOccurs="0"/>
 *         &lt;element name="RepeatedAAALedgerMonetaryInstalment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAALedgerMonetaryInstalmentType" minOccurs="0"/>
 *         &lt;element name="RelatedAAALedgerAccountingLineMonetaryValue" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAALedgerAccountingLineMonetaryValueType"/>
 *         &lt;element name="RepeatedAAALedgerPayment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAALedgerPaymentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAALedgerAccountingEntryLineType", propOrder = {
    "comment",
    "categoryCode",
    "sourceCode",
    "lastChangeDateTime",
    "lastChangeResponsiblePersonName",
    "actualQuantity",
    "nature",
    "connectedAAALedgerAccountingEntry",
    "specifiedAAALedgerAccountingLineIndex",
    "relatedAAALedgerTax",
    "repeatedAAALedgerMonetaryAllocation",
    "repeatedAAALedgerMonetaryInstalment",
    "relatedAAALedgerAccountingLineMonetaryValue",
    "repeatedAAALedgerPayment"
})
public class AAALedgerAccountingEntryLineType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Comment")
    protected TextType comment;
    @XmlElement(name = "CategoryCode")
    protected AccountingEntryLineCategoryCodeType categoryCode;
    @XmlElement(name = "SourceCode")
    protected AccountingEntryLineSourceCodeType sourceCode;
    @XmlElement(name = "LastChangeDateTime")
    protected DateTimeType lastChangeDateTime;
    @XmlElement(name = "LastChangeResponsiblePersonName")
    protected TextType lastChangeResponsiblePersonName;
    @XmlElement(name = "ActualQuantity")
    protected QuantityType actualQuantity;
    @XmlElement(name = "Nature")
    protected TextType nature;
    @XmlElement(name = "ConnectedAAALedgerAccountingEntry", required = true)
    protected AAALedgerAccountingEntryType connectedAAALedgerAccountingEntry;
    @XmlElement(name = "SpecifiedAAALedgerAccountingLineIndex")
    protected AAALedgerAccountingLineIndexType specifiedAAALedgerAccountingLineIndex;
    @XmlElement(name = "RelatedAAALedgerTax")
    protected List<AAALedgerTaxType> relatedAAALedgerTax;
    @XmlElement(name = "RepeatedAAALedgerMonetaryAllocation")
    protected AAALedgerMonetaryAllocationType repeatedAAALedgerMonetaryAllocation;
    @XmlElement(name = "RepeatedAAALedgerMonetaryInstalment")
    protected AAALedgerMonetaryInstalmentType repeatedAAALedgerMonetaryInstalment;
    @XmlElement(name = "RelatedAAALedgerAccountingLineMonetaryValue", required = true)
    protected AAALedgerAccountingLineMonetaryValueType relatedAAALedgerAccountingLineMonetaryValue;
    @XmlElement(name = "RepeatedAAALedgerPayment")
    protected List<AAALedgerPaymentType> repeatedAAALedgerPayment;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setComment(TextType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryLineCategoryCodeType }
     *     
     */
    public AccountingEntryLineCategoryCodeType getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryLineCategoryCodeType }
     *     
     */
    public void setCategoryCode(AccountingEntryLineCategoryCodeType value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryLineSourceCodeType }
     *     
     */
    public AccountingEntryLineSourceCodeType getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryLineSourceCodeType }
     *     
     */
    public void setSourceCode(AccountingEntryLineSourceCodeType value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the lastChangeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLastChangeDateTime() {
        return lastChangeDateTime;
    }

    /**
     * Sets the value of the lastChangeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLastChangeDateTime(DateTimeType value) {
        this.lastChangeDateTime = value;
    }

    /**
     * Gets the value of the lastChangeResponsiblePersonName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLastChangeResponsiblePersonName() {
        return lastChangeResponsiblePersonName;
    }

    /**
     * Sets the value of the lastChangeResponsiblePersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLastChangeResponsiblePersonName(TextType value) {
        this.lastChangeResponsiblePersonName = value;
    }

    /**
     * Gets the value of the actualQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getActualQuantity() {
        return actualQuantity;
    }

    /**
     * Sets the value of the actualQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setActualQuantity(QuantityType value) {
        this.actualQuantity = value;
    }

    /**
     * Gets the value of the nature property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getNature() {
        return nature;
    }

    /**
     * Sets the value of the nature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setNature(TextType value) {
        this.nature = value;
    }

    /**
     * Gets the value of the connectedAAALedgerAccountingEntry property.
     * 
     * @return
     *     possible object is
     *     {@link AAALedgerAccountingEntryType }
     *     
     */
    public AAALedgerAccountingEntryType getConnectedAAALedgerAccountingEntry() {
        return connectedAAALedgerAccountingEntry;
    }

    /**
     * Sets the value of the connectedAAALedgerAccountingEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAALedgerAccountingEntryType }
     *     
     */
    public void setConnectedAAALedgerAccountingEntry(AAALedgerAccountingEntryType value) {
        this.connectedAAALedgerAccountingEntry = value;
    }

    /**
     * Gets the value of the specifiedAAALedgerAccountingLineIndex property.
     * 
     * @return
     *     possible object is
     *     {@link AAALedgerAccountingLineIndexType }
     *     
     */
    public AAALedgerAccountingLineIndexType getSpecifiedAAALedgerAccountingLineIndex() {
        return specifiedAAALedgerAccountingLineIndex;
    }

    /**
     * Sets the value of the specifiedAAALedgerAccountingLineIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAALedgerAccountingLineIndexType }
     *     
     */
    public void setSpecifiedAAALedgerAccountingLineIndex(AAALedgerAccountingLineIndexType value) {
        this.specifiedAAALedgerAccountingLineIndex = value;
    }

    /**
     * Gets the value of the relatedAAALedgerTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedAAALedgerTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedAAALedgerTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAALedgerTaxType }
     * 
     * 
     */
    public List<AAALedgerTaxType> getRelatedAAALedgerTax() {
        if (relatedAAALedgerTax == null) {
            relatedAAALedgerTax = new ArrayList<AAALedgerTaxType>();
        }
        return this.relatedAAALedgerTax;
    }

    /**
     * Gets the value of the repeatedAAALedgerMonetaryAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link AAALedgerMonetaryAllocationType }
     *     
     */
    public AAALedgerMonetaryAllocationType getRepeatedAAALedgerMonetaryAllocation() {
        return repeatedAAALedgerMonetaryAllocation;
    }

    /**
     * Sets the value of the repeatedAAALedgerMonetaryAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAALedgerMonetaryAllocationType }
     *     
     */
    public void setRepeatedAAALedgerMonetaryAllocation(AAALedgerMonetaryAllocationType value) {
        this.repeatedAAALedgerMonetaryAllocation = value;
    }

    /**
     * Gets the value of the repeatedAAALedgerMonetaryInstalment property.
     * 
     * @return
     *     possible object is
     *     {@link AAALedgerMonetaryInstalmentType }
     *     
     */
    public AAALedgerMonetaryInstalmentType getRepeatedAAALedgerMonetaryInstalment() {
        return repeatedAAALedgerMonetaryInstalment;
    }

    /**
     * Sets the value of the repeatedAAALedgerMonetaryInstalment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAALedgerMonetaryInstalmentType }
     *     
     */
    public void setRepeatedAAALedgerMonetaryInstalment(AAALedgerMonetaryInstalmentType value) {
        this.repeatedAAALedgerMonetaryInstalment = value;
    }

    /**
     * Gets the value of the relatedAAALedgerAccountingLineMonetaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link AAALedgerAccountingLineMonetaryValueType }
     *     
     */
    public AAALedgerAccountingLineMonetaryValueType getRelatedAAALedgerAccountingLineMonetaryValue() {
        return relatedAAALedgerAccountingLineMonetaryValue;
    }

    /**
     * Sets the value of the relatedAAALedgerAccountingLineMonetaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAALedgerAccountingLineMonetaryValueType }
     *     
     */
    public void setRelatedAAALedgerAccountingLineMonetaryValue(AAALedgerAccountingLineMonetaryValueType value) {
        this.relatedAAALedgerAccountingLineMonetaryValue = value;
    }

    /**
     * Gets the value of the repeatedAAALedgerPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repeatedAAALedgerPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatedAAALedgerPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAALedgerPaymentType }
     * 
     * 
     */
    public List<AAALedgerPaymentType> getRepeatedAAALedgerPayment() {
        if (repeatedAAALedgerPayment == null) {
            repeatedAAALedgerPayment = new ArrayList<AAALedgerPaymentType>();
        }
        return this.repeatedAAALedgerPayment;
    }

}
