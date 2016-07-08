
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.CurrencyCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01006570&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIOH_ Supply Chain_ Trade Settlement. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Cross Industry Ordering Header (CIOH) information that enables the financial reconciliation of a supply chain transaction.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Settlement&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIOH&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Supply Chain&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Ordering&lt;/ccts:BusinessProcessContextValue&gt;
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
 * <p>Java class for CIOHSupplyChainTradeSettlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIOHSupplyChainTradeSettlementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="OrderCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="InvoiceCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="PriceCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="DuePayableAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceeCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="PayerCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="TaxApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="OrderApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="InvoiceApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="PriceApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeSettlementPaymentMeans" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeSettlementPaymentMeansType" minOccurs="0"/>
 *         &lt;element name="ApplicableCITradeTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeAllowanceCharge" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradePaymentTerms" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePaymentTermsType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCIOHTradeSettlementMonetarySummation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIOHTradeSettlementMonetarySummationType" minOccurs="0"/>
 *         &lt;element name="PayableSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaseSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIOHSupplyChainTradeSettlementType", propOrder = {
    "taxCurrencyCode",
    "orderCurrencyCode",
    "invoiceCurrencyCode",
    "priceCurrencyCode",
    "duePayableAmount",
    "invoiceeCITradeParty",
    "payerCITradeParty",
    "taxApplicableCITradeCurrencyExchange",
    "orderApplicableCITradeCurrencyExchange",
    "invoiceApplicableCITradeCurrencyExchange",
    "priceApplicableCITradeCurrencyExchange",
    "specifiedCITradeSettlementPaymentMeans",
    "applicableCITradeTax",
    "specifiedCITradeAllowanceCharge",
    "specifiedCITradePaymentTerms",
    "specifiedCIOHTradeSettlementMonetarySummation",
    "payableSpecifiedCITradeAccountingAccount",
    "purchaseSpecifiedCITradeAccountingAccount"
})
public class CIOHSupplyChainTradeSettlementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TaxCurrencyCode")
    protected CurrencyCodeType taxCurrencyCode;
    @XmlElement(name = "OrderCurrencyCode")
    protected CurrencyCodeType orderCurrencyCode;
    @XmlElement(name = "InvoiceCurrencyCode")
    protected CurrencyCodeType invoiceCurrencyCode;
    @XmlElement(name = "PriceCurrencyCode")
    protected CurrencyCodeType priceCurrencyCode;
    @XmlElement(name = "DuePayableAmount")
    protected List<AmountType> duePayableAmount;
    @XmlElement(name = "InvoiceeCITradeParty")
    protected CITradePartyType invoiceeCITradeParty;
    @XmlElement(name = "PayerCITradeParty")
    protected CITradePartyType payerCITradeParty;
    @XmlElement(name = "TaxApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType taxApplicableCITradeCurrencyExchange;
    @XmlElement(name = "OrderApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType orderApplicableCITradeCurrencyExchange;
    @XmlElement(name = "InvoiceApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType invoiceApplicableCITradeCurrencyExchange;
    @XmlElement(name = "PriceApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType priceApplicableCITradeCurrencyExchange;
    @XmlElement(name = "SpecifiedCITradeSettlementPaymentMeans")
    protected CITradeSettlementPaymentMeansType specifiedCITradeSettlementPaymentMeans;
    @XmlElement(name = "ApplicableCITradeTax")
    protected List<CITradeTaxType> applicableCITradeTax;
    @XmlElement(name = "SpecifiedCITradeAllowanceCharge")
    protected List<CITradeAllowanceChargeType> specifiedCITradeAllowanceCharge;
    @XmlElement(name = "SpecifiedCITradePaymentTerms")
    protected CITradePaymentTermsType specifiedCITradePaymentTerms;
    @XmlElement(name = "SpecifiedCIOHTradeSettlementMonetarySummation")
    protected CIOHTradeSettlementMonetarySummationType specifiedCIOHTradeSettlementMonetarySummation;
    @XmlElement(name = "PayableSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> payableSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "PurchaseSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> purchaseSpecifiedCITradeAccountingAccount;

    /**
     * Gets the value of the taxCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Sets the value of the taxCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTaxCurrencyCode(CurrencyCodeType value) {
        this.taxCurrencyCode = value;
    }

    /**
     * Gets the value of the orderCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    /**
     * Sets the value of the orderCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setOrderCurrencyCode(CurrencyCodeType value) {
        this.orderCurrencyCode = value;
    }

    /**
     * Gets the value of the invoiceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /**
     * Sets the value of the invoiceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setInvoiceCurrencyCode(CurrencyCodeType value) {
        this.invoiceCurrencyCode = value;
    }

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
     * Gets the value of the duePayableAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duePayableAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuePayableAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDuePayableAmount() {
        if (duePayableAmount == null) {
            duePayableAmount = new ArrayList<AmountType>();
        }
        return this.duePayableAmount;
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
     * Gets the value of the taxApplicableCITradeCurrencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public CITradeCurrencyExchangeType getTaxApplicableCITradeCurrencyExchange() {
        return taxApplicableCITradeCurrencyExchange;
    }

    /**
     * Sets the value of the taxApplicableCITradeCurrencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public void setTaxApplicableCITradeCurrencyExchange(CITradeCurrencyExchangeType value) {
        this.taxApplicableCITradeCurrencyExchange = value;
    }

    /**
     * Gets the value of the orderApplicableCITradeCurrencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public CITradeCurrencyExchangeType getOrderApplicableCITradeCurrencyExchange() {
        return orderApplicableCITradeCurrencyExchange;
    }

    /**
     * Sets the value of the orderApplicableCITradeCurrencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public void setOrderApplicableCITradeCurrencyExchange(CITradeCurrencyExchangeType value) {
        this.orderApplicableCITradeCurrencyExchange = value;
    }

    /**
     * Gets the value of the invoiceApplicableCITradeCurrencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public CITradeCurrencyExchangeType getInvoiceApplicableCITradeCurrencyExchange() {
        return invoiceApplicableCITradeCurrencyExchange;
    }

    /**
     * Sets the value of the invoiceApplicableCITradeCurrencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public void setInvoiceApplicableCITradeCurrencyExchange(CITradeCurrencyExchangeType value) {
        this.invoiceApplicableCITradeCurrencyExchange = value;
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
     * Gets the value of the specifiedCITradeSettlementPaymentMeans property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeSettlementPaymentMeansType }
     *     
     */
    public CITradeSettlementPaymentMeansType getSpecifiedCITradeSettlementPaymentMeans() {
        return specifiedCITradeSettlementPaymentMeans;
    }

    /**
     * Sets the value of the specifiedCITradeSettlementPaymentMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeSettlementPaymentMeansType }
     *     
     */
    public void setSpecifiedCITradeSettlementPaymentMeans(CITradeSettlementPaymentMeansType value) {
        this.specifiedCITradeSettlementPaymentMeans = value;
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
     * Gets the value of the specifiedCIOHTradeSettlementMonetarySummation property.
     * 
     * @return
     *     possible object is
     *     {@link CIOHTradeSettlementMonetarySummationType }
     *     
     */
    public CIOHTradeSettlementMonetarySummationType getSpecifiedCIOHTradeSettlementMonetarySummation() {
        return specifiedCIOHTradeSettlementMonetarySummation;
    }

    /**
     * Sets the value of the specifiedCIOHTradeSettlementMonetarySummation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOHTradeSettlementMonetarySummationType }
     *     
     */
    public void setSpecifiedCIOHTradeSettlementMonetarySummation(CIOHTradeSettlementMonetarySummationType value) {
        this.specifiedCIOHTradeSettlementMonetarySummation = value;
    }

    /**
     * Gets the value of the payableSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payableSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayableSpecifiedCITradeAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeAccountingAccountType }
     * 
     * 
     */
    public List<CITradeAccountingAccountType> getPayableSpecifiedCITradeAccountingAccount() {
        if (payableSpecifiedCITradeAccountingAccount == null) {
            payableSpecifiedCITradeAccountingAccount = new ArrayList<CITradeAccountingAccountType>();
        }
        return this.payableSpecifiedCITradeAccountingAccount;
    }

    /**
     * Gets the value of the purchaseSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseSpecifiedCITradeAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeAccountingAccountType }
     * 
     * 
     */
    public List<CITradeAccountingAccountType> getPurchaseSpecifiedCITradeAccountingAccount() {
        if (purchaseSpecifiedCITradeAccountingAccount == null) {
            purchaseSpecifiedCITradeAccountingAccount = new ArrayList<CITradeAccountingAccountType>();
        }
        return this.purchaseSpecifiedCITradeAccountingAccount;
    }

}
