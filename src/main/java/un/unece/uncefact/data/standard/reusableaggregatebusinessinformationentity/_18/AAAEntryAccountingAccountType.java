
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAmountTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingDocumentCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01009435&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry_ Accounting Account. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A specific AAA (Accounting and Audit) account for booking debits and credits for general accounting, cost accounting or budget accounting.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting Account&lt;/ccts:ObjectClassTerm&gt;
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
 * <p>Java class for AAAEntryAccountingAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAAEntryAccountingAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType"/>
 *         &lt;element name="SubAccountID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="AbbreviatedName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="SetTriggerCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingDocumentCodeType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountTypeCodeType" minOccurs="0"/>
 *         &lt;element name="AmountTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAmountTypeCodeType" minOccurs="0"/>
 *         &lt;element name="MainAccountsChartID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="MainAccountsChartReferenceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="AccountingYearEndDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DerivedAAAEntryReport" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FiscalAAAEntryCapitalAsset" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryCapitalAssetType" minOccurs="0"/>
 *         &lt;element name="EconomicAAAEntryCapitalAsset" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryCapitalAssetType" minOccurs="0"/>
 *         &lt;element name="IFRSAAAEntryCapitalAsset" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryCapitalAssetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAAEntryAccountingAccountType", propOrder = {
    "id",
    "subAccountID",
    "name",
    "abbreviatedName",
    "setTriggerCode",
    "typeCode",
    "amountTypeCode",
    "mainAccountsChartID",
    "mainAccountsChartReferenceID",
    "accountingYearEndDateTime",
    "derivedAAAEntryReport",
    "fiscalAAAEntryCapitalAsset",
    "economicAAAEntryCapitalAsset",
    "ifrsaaaEntryCapitalAsset"
})
public class AAAEntryAccountingAccountType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "SubAccountID")
    protected IDType subAccountID;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "AbbreviatedName")
    protected TextType abbreviatedName;
    @XmlElement(name = "SetTriggerCode")
    protected AccountingDocumentCodeType setTriggerCode;
    @XmlElement(name = "TypeCode")
    protected AccountingAccountTypeCodeType typeCode;
    @XmlElement(name = "AmountTypeCode")
    protected AccountingAmountTypeCodeType amountTypeCode;
    @XmlElement(name = "MainAccountsChartID")
    protected IDType mainAccountsChartID;
    @XmlElement(name = "MainAccountsChartReferenceID")
    protected IDType mainAccountsChartReferenceID;
    @XmlElement(name = "AccountingYearEndDateTime")
    protected DateTimeType accountingYearEndDateTime;
    @XmlElement(name = "DerivedAAAEntryReport")
    protected List<AAAEntryReportType> derivedAAAEntryReport;
    @XmlElement(name = "FiscalAAAEntryCapitalAsset")
    protected AAAEntryCapitalAssetType fiscalAAAEntryCapitalAsset;
    @XmlElement(name = "EconomicAAAEntryCapitalAsset")
    protected AAAEntryCapitalAssetType economicAAAEntryCapitalAsset;
    @XmlElement(name = "IFRSAAAEntryCapitalAsset")
    protected AAAEntryCapitalAssetType ifrsaaaEntryCapitalAsset;

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
     * Gets the value of the subAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSubAccountID() {
        return subAccountID;
    }

    /**
     * Sets the value of the subAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSubAccountID(IDType value) {
        this.subAccountID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setName(TextType value) {
        this.name = value;
    }

    /**
     * Gets the value of the abbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAbbreviatedName() {
        return abbreviatedName;
    }

    /**
     * Sets the value of the abbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAbbreviatedName(TextType value) {
        this.abbreviatedName = value;
    }

    /**
     * Gets the value of the setTriggerCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingDocumentCodeType }
     *     
     */
    public AccountingDocumentCodeType getSetTriggerCode() {
        return setTriggerCode;
    }

    /**
     * Sets the value of the setTriggerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingDocumentCodeType }
     *     
     */
    public void setSetTriggerCode(AccountingDocumentCodeType value) {
        this.setTriggerCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAccountTypeCodeType }
     *     
     */
    public AccountingAccountTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAccountTypeCodeType }
     *     
     */
    public void setTypeCode(AccountingAccountTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the amountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAmountTypeCodeType }
     *     
     */
    public AccountingAmountTypeCodeType getAmountTypeCode() {
        return amountTypeCode;
    }

    /**
     * Sets the value of the amountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAmountTypeCodeType }
     *     
     */
    public void setAmountTypeCode(AccountingAmountTypeCodeType value) {
        this.amountTypeCode = value;
    }

    /**
     * Gets the value of the mainAccountsChartID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMainAccountsChartID() {
        return mainAccountsChartID;
    }

    /**
     * Sets the value of the mainAccountsChartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMainAccountsChartID(IDType value) {
        this.mainAccountsChartID = value;
    }

    /**
     * Gets the value of the mainAccountsChartReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMainAccountsChartReferenceID() {
        return mainAccountsChartReferenceID;
    }

    /**
     * Sets the value of the mainAccountsChartReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMainAccountsChartReferenceID(IDType value) {
        this.mainAccountsChartReferenceID = value;
    }

    /**
     * Gets the value of the accountingYearEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getAccountingYearEndDateTime() {
        return accountingYearEndDateTime;
    }

    /**
     * Sets the value of the accountingYearEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setAccountingYearEndDateTime(DateTimeType value) {
        this.accountingYearEndDateTime = value;
    }

    /**
     * Gets the value of the derivedAAAEntryReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedAAAEntryReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedAAAEntryReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryReportType }
     * 
     * 
     */
    public List<AAAEntryReportType> getDerivedAAAEntryReport() {
        if (derivedAAAEntryReport == null) {
            derivedAAAEntryReport = new ArrayList<AAAEntryReportType>();
        }
        return this.derivedAAAEntryReport;
    }

    /**
     * Gets the value of the fiscalAAAEntryCapitalAsset property.
     * 
     * @return
     *     possible object is
     *     {@link AAAEntryCapitalAssetType }
     *     
     */
    public AAAEntryCapitalAssetType getFiscalAAAEntryCapitalAsset() {
        return fiscalAAAEntryCapitalAsset;
    }

    /**
     * Sets the value of the fiscalAAAEntryCapitalAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAEntryCapitalAssetType }
     *     
     */
    public void setFiscalAAAEntryCapitalAsset(AAAEntryCapitalAssetType value) {
        this.fiscalAAAEntryCapitalAsset = value;
    }

    /**
     * Gets the value of the economicAAAEntryCapitalAsset property.
     * 
     * @return
     *     possible object is
     *     {@link AAAEntryCapitalAssetType }
     *     
     */
    public AAAEntryCapitalAssetType getEconomicAAAEntryCapitalAsset() {
        return economicAAAEntryCapitalAsset;
    }

    /**
     * Sets the value of the economicAAAEntryCapitalAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAEntryCapitalAssetType }
     *     
     */
    public void setEconomicAAAEntryCapitalAsset(AAAEntryCapitalAssetType value) {
        this.economicAAAEntryCapitalAsset = value;
    }

    /**
     * Gets the value of the ifrsaaaEntryCapitalAsset property.
     * 
     * @return
     *     possible object is
     *     {@link AAAEntryCapitalAssetType }
     *     
     */
    public AAAEntryCapitalAssetType getIFRSAAAEntryCapitalAsset() {
        return ifrsaaaEntryCapitalAsset;
    }

    /**
     * Sets the value of the ifrsaaaEntryCapitalAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAEntryCapitalAssetType }
     *     
     */
    public void setIFRSAAAEntryCapitalAsset(AAAEntryCapitalAssetType value) {
        this.ifrsaaaEntryCapitalAsset = value;
    }

}
