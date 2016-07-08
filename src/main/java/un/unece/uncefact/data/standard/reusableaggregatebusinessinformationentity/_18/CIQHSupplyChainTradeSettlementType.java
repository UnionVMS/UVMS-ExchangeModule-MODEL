
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.CurrencyCodeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01008775&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIQH_ Supply Chain_ Trade Settlement. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Cross Industry Quotation Header (CIQH) information that enables the financial reconciliation of a supply chain transaction.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Settlement&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIQH&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Supply Chain&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quotation&lt;/ccts:BusinessProcessContextValue&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;In All Contexts&lt;/ccts:ProductContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:IndustryContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry&lt;/ccts:IndustryContextValue&gt;
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
 * <p>Java class for CIQHSupplyChainTradeSettlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIQHSupplyChainTradeSettlementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="QuotationCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="InvoiceeCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="PayerCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeAllowanceCharge" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriceApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="QuotationApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="TaxApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCIQHTradeSettlementMonetarySummation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIQHTradeSettlementMonetarySummationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeSettlementPaymentMeans" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeSettlementPaymentMeansType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradePaymentTerms" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePaymentTermsType" minOccurs="0"/>
 *         &lt;element name="ApplicableCITradeTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIQHSupplyChainTradeSettlementType", propOrder = {
    "priceCurrencyCode",
    "quotationCurrencyCode",
    "invoiceeCITradeParty",
    "payerCITradeParty",
    "specifiedCITradeAllowanceCharge",
    "priceApplicableCITradeCurrencyExchange",
    "quotationApplicableCITradeCurrencyExchange",
    "taxApplicableCITradeCurrencyExchange",
    "specifiedCIQHTradeSettlementMonetarySummation",
    "specifiedCITradeSettlementPaymentMeans",
    "specifiedCITradePaymentTerms",
    "applicableCITradeTax"
})
public class CIQHSupplyChainTradeSettlementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PriceCurrencyCode")
    protected CurrencyCodeType priceCurrencyCode;
    @XmlElement(name = "QuotationCurrencyCode")
    protected CurrencyCodeType quotationCurrencyCode;
    @XmlElement(name = "InvoiceeCITradeParty")
    protected CITradePartyType invoiceeCITradeParty;
    @XmlElement(name = "PayerCITradeParty")
    protected CITradePartyType payerCITradeParty;
    @XmlElement(name = "SpecifiedCITradeAllowanceCharge")
    protected List<CITradeAllowanceChargeType> specifiedCITradeAllowanceCharge;
    @XmlElement(name = "PriceApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType priceApplicableCITradeCurrencyExchange;
    @XmlElement(name = "QuotationApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType quotationApplicableCITradeCurrencyExchange;
    @XmlElement(name = "TaxApplicableCITradeCurrencyExchange")
    protected List<CITradeCurrencyExchangeType> taxApplicableCITradeCurrencyExchange;
    @XmlElement(name = "SpecifiedCIQHTradeSettlementMonetarySummation")
    protected CIQHTradeSettlementMonetarySummationType specifiedCIQHTradeSettlementMonetarySummation;
    @XmlElement(name = "SpecifiedCITradeSettlementPaymentMeans")
    protected List<CITradeSettlementPaymentMeansType> specifiedCITradeSettlementPaymentMeans;
    @XmlElement(name = "SpecifiedCITradePaymentTerms")
    protected CITradePaymentTermsType specifiedCITradePaymentTerms;
    @XmlElement(name = "ApplicableCITradeTax")
    protected List<CITradeTaxType> applicableCITradeTax;

    /**
     * Gets the value of the priceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getPriceCurrencyCode() {
        return priceCurrencyCode;
    }

    /**
     * Sets the value of the priceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setPriceCurrencyCode(CurrencyCodeType value) {
        this.priceCurrencyCode = value;
    }

    /**
     * Gets the value of the quotationCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getQuotationCurrencyCode() {
        return quotationCurrencyCode;
    }

    /**
     * Sets the value of the quotationCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setQuotationCurrencyCode(CurrencyCodeType value) {
        this.quotationCurrencyCode = value;
    }

    /**
     * Gets the value of the invoiceeCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getInvoiceeCITradeParty() {
        return invoiceeCITradeParty;
    }

    /**
     * Sets the value of the invoiceeCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setInvoiceeCITradeParty(CITradePartyType value) {
        this.invoiceeCITradeParty = value;
    }

    /**
     * Gets the value of the payerCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getPayerCITradeParty() {
        return payerCITradeParty;
    }

    /**
     * Sets the value of the payerCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setPayerCITradeParty(CITradePartyType value) {
        this.payerCITradeParty = value;
    }

    /**
     * Gets the value of the specifiedCITradeAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCITradeAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCITradeAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeAllowanceChargeType }
     * 
     * 
     */
    public List<CITradeAllowanceChargeType> getSpecifiedCITradeAllowanceCharge() {
        if (specifiedCITradeAllowanceCharge == null) {
            specifiedCITradeAllowanceCharge = new ArrayList<CITradeAllowanceChargeType>();
        }
        return this.specifiedCITradeAllowanceCharge;
    }

    /**
     * Gets the value of the priceApplicableCITradeCurrencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public CITradeCurrencyExchangeType getPriceApplicableCITradeCurrencyExchange() {
        return priceApplicableCITradeCurrencyExchange;
    }

    /**
     * Sets the value of the priceApplicableCITradeCurrencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public void setPriceApplicableCITradeCurrencyExchange(CITradeCurrencyExchangeType value) {
        this.priceApplicableCITradeCurrencyExchange = value;
    }

    /**
     * Gets the value of the quotationApplicableCITradeCurrencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public CITradeCurrencyExchangeType getQuotationApplicableCITradeCurrencyExchange() {
        return quotationApplicableCITradeCurrencyExchange;
    }

    /**
     * Sets the value of the quotationApplicableCITradeCurrencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public void setQuotationApplicableCITradeCurrencyExchange(CITradeCurrencyExchangeType value) {
        this.quotationApplicableCITradeCurrencyExchange = value;
    }

    /**
     * Gets the value of the taxApplicableCITradeCurrencyExchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxApplicableCITradeCurrencyExchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxApplicableCITradeCurrencyExchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeCurrencyExchangeType }
     * 
     * 
     */
    public List<CITradeCurrencyExchangeType> getTaxApplicableCITradeCurrencyExchange() {
        if (taxApplicableCITradeCurrencyExchange == null) {
            taxApplicableCITradeCurrencyExchange = new ArrayList<CITradeCurrencyExchangeType>();
        }
        return this.taxApplicableCITradeCurrencyExchange;
    }

    /**
     * Gets the value of the specifiedCIQHTradeSettlementMonetarySummation property.
     * 
     * @return
     *     possible object is
     *     {@link CIQHTradeSettlementMonetarySummationType }
     *     
     */
    public CIQHTradeSettlementMonetarySummationType getSpecifiedCIQHTradeSettlementMonetarySummation() {
        return specifiedCIQHTradeSettlementMonetarySummation;
    }

    /**
     * Sets the value of the specifiedCIQHTradeSettlementMonetarySummation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIQHTradeSettlementMonetarySummationType }
     *     
     */
    public void setSpecifiedCIQHTradeSettlementMonetarySummation(CIQHTradeSettlementMonetarySummationType value) {
        this.specifiedCIQHTradeSettlementMonetarySummation = value;
    }

    /**
     * Gets the value of the specifiedCITradeSettlementPaymentMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCITradeSettlementPaymentMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCITradeSettlementPaymentMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeSettlementPaymentMeansType }
     * 
     * 
     */
    public List<CITradeSettlementPaymentMeansType> getSpecifiedCITradeSettlementPaymentMeans() {
        if (specifiedCITradeSettlementPaymentMeans == null) {
            specifiedCITradeSettlementPaymentMeans = new ArrayList<CITradeSettlementPaymentMeansType>();
        }
        return this.specifiedCITradeSettlementPaymentMeans;
    }

    /**
     * Gets the value of the specifiedCITradePaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePaymentTermsType }
     *     
     */
    public CITradePaymentTermsType getSpecifiedCITradePaymentTerms() {
        return specifiedCITradePaymentTerms;
    }

    /**
     * Sets the value of the specifiedCITradePaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePaymentTermsType }
     *     
     */
    public void setSpecifiedCITradePaymentTerms(CITradePaymentTermsType value) {
        this.specifiedCITradePaymentTerms = value;
    }

    /**
     * Gets the value of the applicableCITradeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableCITradeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableCITradeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeTaxType }
     * 
     * 
     */
    public List<CITradeTaxType> getApplicableCITradeTax() {
        if (applicableCITradeTax == null) {
            applicableCITradeTax = new ArrayList<CITradeTaxType>();
        }
        return this.applicableCITradeTax;
    }

}
