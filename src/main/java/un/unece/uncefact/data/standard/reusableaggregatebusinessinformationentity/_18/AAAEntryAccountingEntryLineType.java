
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01009408&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry_ Accounting Entry Line. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An AAA (Accounting and Audit) line posted into an account as part of an accounting entry.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting Entry Line&lt;/ccts:ObjectClassTerm&gt;
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
 * <p>Java class for AAAEntryAccountingEntryLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAAEntryAccountingEntryLineType">
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
 *         &lt;element name="SpecifiedAAAEntryAccountingLineIndex" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryAccountingLineIndexType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RepeatedAAAEntryMonetaryAllocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryMonetaryAllocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RepeatedAAAEntryMonetaryInstalment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryMonetaryInstalmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedAAAEntryAccountingLineMonetaryValue" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryAccountingLineMonetaryValueType" maxOccurs="unbounded"/>
 *         &lt;element name="RelatedAAAEntryTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryTaxType" minOccurs="0"/>
 *         &lt;element name="RepeatedAAAEntryPayment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryPaymentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAAEntryAccountingEntryLineType", propOrder = {
    "comment",
    "categoryCode",
    "sourceCode",
    "lastChangeDateTime",
    "lastChangeResponsiblePersonName",
    "actualQuantity",
    "nature",
    "specifiedAAAEntryAccountingLineIndex",
    "repeatedAAAEntryMonetaryAllocation",
    "repeatedAAAEntryMonetaryInstalment",
    "relatedAAAEntryAccountingLineMonetaryValue",
    "relatedAAAEntryTax",
    "repeatedAAAEntryPayment"
})
public class AAAEntryAccountingEntryLineType
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
    @XmlElement(name = "SpecifiedAAAEntryAccountingLineIndex")
    protected List<AAAEntryAccountingLineIndexType> specifiedAAAEntryAccountingLineIndex;
    @XmlElement(name = "RepeatedAAAEntryMonetaryAllocation")
    protected List<AAAEntryMonetaryAllocationType> repeatedAAAEntryMonetaryAllocation;
    @XmlElement(name = "RepeatedAAAEntryMonetaryInstalment")
    protected List<AAAEntryMonetaryInstalmentType> repeatedAAAEntryMonetaryInstalment;
    @XmlElement(name = "RelatedAAAEntryAccountingLineMonetaryValue", required = true)
    protected List<AAAEntryAccountingLineMonetaryValueType> relatedAAAEntryAccountingLineMonetaryValue;
    @XmlElement(name = "RelatedAAAEntryTax")
    protected AAAEntryTaxType relatedAAAEntryTax;
    @XmlElement(name = "RepeatedAAAEntryPayment")
    protected List<AAAEntryPaymentType> repeatedAAAEntryPayment;

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
     * Gets the value of the specifiedAAAEntryAccountingLineIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedAAAEntryAccountingLineIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedAAAEntryAccountingLineIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryAccountingLineIndexType }
     * 
     * 
     */
    public List<AAAEntryAccountingLineIndexType> getSpecifiedAAAEntryAccountingLineIndex() {
        if (specifiedAAAEntryAccountingLineIndex == null) {
            specifiedAAAEntryAccountingLineIndex = new ArrayList<AAAEntryAccountingLineIndexType>();
        }
        return this.specifiedAAAEntryAccountingLineIndex;
    }

    /**
     * Gets the value of the repeatedAAAEntryMonetaryAllocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repeatedAAAEntryMonetaryAllocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatedAAAEntryMonetaryAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryMonetaryAllocationType }
     * 
     * 
     */
    public List<AAAEntryMonetaryAllocationType> getRepeatedAAAEntryMonetaryAllocation() {
        if (repeatedAAAEntryMonetaryAllocation == null) {
            repeatedAAAEntryMonetaryAllocation = new ArrayList<AAAEntryMonetaryAllocationType>();
        }
        return this.repeatedAAAEntryMonetaryAllocation;
    }

    /**
     * Gets the value of the repeatedAAAEntryMonetaryInstalment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repeatedAAAEntryMonetaryInstalment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatedAAAEntryMonetaryInstalment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryMonetaryInstalmentType }
     * 
     * 
     */
    public List<AAAEntryMonetaryInstalmentType> getRepeatedAAAEntryMonetaryInstalment() {
        if (repeatedAAAEntryMonetaryInstalment == null) {
            repeatedAAAEntryMonetaryInstalment = new ArrayList<AAAEntryMonetaryInstalmentType>();
        }
        return this.repeatedAAAEntryMonetaryInstalment;
    }

    /**
     * Gets the value of the relatedAAAEntryAccountingLineMonetaryValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedAAAEntryAccountingLineMonetaryValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedAAAEntryAccountingLineMonetaryValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryAccountingLineMonetaryValueType }
     * 
     * 
     */
    public List<AAAEntryAccountingLineMonetaryValueType> getRelatedAAAEntryAccountingLineMonetaryValue() {
        if (relatedAAAEntryAccountingLineMonetaryValue == null) {
            relatedAAAEntryAccountingLineMonetaryValue = new ArrayList<AAAEntryAccountingLineMonetaryValueType>();
        }
        return this.relatedAAAEntryAccountingLineMonetaryValue;
    }

    /**
     * Gets the value of the relatedAAAEntryTax property.
     * 
     * @return
     *     possible object is
     *     {@link AAAEntryTaxType }
     *     
     */
    public AAAEntryTaxType getRelatedAAAEntryTax() {
        return relatedAAAEntryTax;
    }

    /**
     * Sets the value of the relatedAAAEntryTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAEntryTaxType }
     *     
     */
    public void setRelatedAAAEntryTax(AAAEntryTaxType value) {
        this.relatedAAAEntryTax = value;
    }

    /**
     * Gets the value of the repeatedAAAEntryPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repeatedAAAEntryPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepeatedAAAEntryPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryPaymentType }
     * 
     * 
     */
    public List<AAAEntryPaymentType> getRepeatedAAAEntryPayment() {
        if (repeatedAAAEntryPayment == null) {
            repeatedAAAEntryPayment = new ArrayList<AAAEntryPaymentType>();
        }
        return this.repeatedAAAEntryPayment;
    }

}
