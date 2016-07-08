
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005994&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIIL_ Supply Chain_ Trade Settlement. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The Cross Industry Invoice Line (CIIL) information that enables the financial reconciliation of a supply chain transaction with the item(s) that the financial transaction is intended to settle.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Settlement&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIIL&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Supply Chain&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Invoicing&lt;/ccts:BusinessProcessContextValue&gt;
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
 * <p>Java class for CIILSupplyChainTradeSettlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIILSupplyChainTradeSettlementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentReference" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceIssuerReference" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="ApplicableCITradeTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingCISpecifiedPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CISpecifiedPeriodType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeAllowanceCharge" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubtotalCalculatedCITradeTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCILogisticsServiceCharge" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CILogisticsServiceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradePaymentTerms" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePaymentTermsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCIILTradeSettlementMonetarySummation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIILTradeSettlementMonetarySummationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCIFinancialAdjustment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIFinancialAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceReferencedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" minOccurs="0"/>
 *         &lt;element name="AdditionalReferencedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedTradeSettlementFinancialCard" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TradeSettlementFinancialCardType" minOccurs="0"/>
 *         &lt;element name="PayableSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReceivableSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaseSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIILSupplyChainTradeSettlementType", propOrder = {
    "paymentReference",
    "invoiceIssuerReference",
    "applicableCITradeTax",
    "billingCISpecifiedPeriod",
    "specifiedCITradeAllowanceCharge",
    "subtotalCalculatedCITradeTax",
    "specifiedCILogisticsServiceCharge",
    "specifiedCITradePaymentTerms",
    "specifiedCIILTradeSettlementMonetarySummation",
    "specifiedCIFinancialAdjustment",
    "invoiceReferencedCIReferencedDocument",
    "additionalReferencedCIReferencedDocument",
    "specifiedTradeSettlementFinancialCard",
    "payableSpecifiedCITradeAccountingAccount",
    "receivableSpecifiedCITradeAccountingAccount",
    "purchaseSpecifiedCITradeAccountingAccount",
    "salesSpecifiedCITradeAccountingAccount"
})
public class CIILSupplyChainTradeSettlementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PaymentReference")
    protected List<TextType> paymentReference;
    @XmlElement(name = "InvoiceIssuerReference")
    protected TextType invoiceIssuerReference;
    @XmlElement(name = "ApplicableCITradeTax")
    protected List<CITradeTaxType> applicableCITradeTax;
    @XmlElement(name = "BillingCISpecifiedPeriod")
    protected CISpecifiedPeriodType billingCISpecifiedPeriod;
    @XmlElement(name = "SpecifiedCITradeAllowanceCharge")
    protected List<CITradeAllowanceChargeType> specifiedCITradeAllowanceCharge;
    @XmlElement(name = "SubtotalCalculatedCITradeTax")
    protected List<CITradeTaxType> subtotalCalculatedCITradeTax;
    @XmlElement(name = "SpecifiedCILogisticsServiceCharge")
    protected List<CILogisticsServiceChargeType> specifiedCILogisticsServiceCharge;
    @XmlElement(name = "SpecifiedCITradePaymentTerms")
    protected List<CITradePaymentTermsType> specifiedCITradePaymentTerms;
    @XmlElement(name = "SpecifiedCIILTradeSettlementMonetarySummation")
    protected CIILTradeSettlementMonetarySummationType specifiedCIILTradeSettlementMonetarySummation;
    @XmlElement(name = "SpecifiedCIFinancialAdjustment")
    protected List<CIFinancialAdjustmentType> specifiedCIFinancialAdjustment;
    @XmlElement(name = "InvoiceReferencedCIReferencedDocument")
    protected CIReferencedDocumentType invoiceReferencedCIReferencedDocument;
    @XmlElement(name = "AdditionalReferencedCIReferencedDocument")
    protected List<CIReferencedDocumentType> additionalReferencedCIReferencedDocument;
    @XmlElement(name = "SpecifiedTradeSettlementFinancialCard")
    protected TradeSettlementFinancialCardType specifiedTradeSettlementFinancialCard;
    @XmlElement(name = "PayableSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> payableSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "ReceivableSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> receivableSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "PurchaseSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> purchaseSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "SalesSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> salesSpecifiedCITradeAccountingAccount;

    /**
     * Gets the value of the paymentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getPaymentReference() {
        if (paymentReference == null) {
            paymentReference = new ArrayList<TextType>();
        }
        return this.paymentReference;
    }

    /**
     * Gets the value of the invoiceIssuerReference property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInvoiceIssuerReference() {
        return invoiceIssuerReference;
    }

    /**
     * Sets the value of the invoiceIssuerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInvoiceIssuerReference(TextType value) {
        this.invoiceIssuerReference = value;
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
     * Gets the value of the billingCISpecifiedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CISpecifiedPeriodType }
     *     
     */
    public CISpecifiedPeriodType getBillingCISpecifiedPeriod() {
        return billingCISpecifiedPeriod;
    }

    /**
     * Sets the value of the billingCISpecifiedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CISpecifiedPeriodType }
     *     
     */
    public void setBillingCISpecifiedPeriod(CISpecifiedPeriodType value) {
        this.billingCISpecifiedPeriod = value;
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
     * Gets the value of the subtotalCalculatedCITradeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtotalCalculatedCITradeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtotalCalculatedCITradeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeTaxType }
     * 
     * 
     */
    public List<CITradeTaxType> getSubtotalCalculatedCITradeTax() {
        if (subtotalCalculatedCITradeTax == null) {
            subtotalCalculatedCITradeTax = new ArrayList<CITradeTaxType>();
        }
        return this.subtotalCalculatedCITradeTax;
    }

    /**
     * Gets the value of the specifiedCILogisticsServiceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCILogisticsServiceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCILogisticsServiceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CILogisticsServiceChargeType }
     * 
     * 
     */
    public List<CILogisticsServiceChargeType> getSpecifiedCILogisticsServiceCharge() {
        if (specifiedCILogisticsServiceCharge == null) {
            specifiedCILogisticsServiceCharge = new ArrayList<CILogisticsServiceChargeType>();
        }
        return this.specifiedCILogisticsServiceCharge;
    }

    /**
     * Gets the value of the specifiedCITradePaymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCITradePaymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCITradePaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradePaymentTermsType }
     * 
     * 
     */
    public List<CITradePaymentTermsType> getSpecifiedCITradePaymentTerms() {
        if (specifiedCITradePaymentTerms == null) {
            specifiedCITradePaymentTerms = new ArrayList<CITradePaymentTermsType>();
        }
        return this.specifiedCITradePaymentTerms;
    }

    /**
     * Gets the value of the specifiedCIILTradeSettlementMonetarySummation property.
     * 
     * @return
     *     possible object is
     *     {@link CIILTradeSettlementMonetarySummationType }
     *     
     */
    public CIILTradeSettlementMonetarySummationType getSpecifiedCIILTradeSettlementMonetarySummation() {
        return specifiedCIILTradeSettlementMonetarySummation;
    }

    /**
     * Sets the value of the specifiedCIILTradeSettlementMonetarySummation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIILTradeSettlementMonetarySummationType }
     *     
     */
    public void setSpecifiedCIILTradeSettlementMonetarySummation(CIILTradeSettlementMonetarySummationType value) {
        this.specifiedCIILTradeSettlementMonetarySummation = value;
    }

    /**
     * Gets the value of the specifiedCIFinancialAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCIFinancialAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCIFinancialAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIFinancialAdjustmentType }
     * 
     * 
     */
    public List<CIFinancialAdjustmentType> getSpecifiedCIFinancialAdjustment() {
        if (specifiedCIFinancialAdjustment == null) {
            specifiedCIFinancialAdjustment = new ArrayList<CIFinancialAdjustmentType>();
        }
        return this.specifiedCIFinancialAdjustment;
    }

    /**
     * Gets the value of the invoiceReferencedCIReferencedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public CIReferencedDocumentType getInvoiceReferencedCIReferencedDocument() {
        return invoiceReferencedCIReferencedDocument;
    }

    /**
     * Sets the value of the invoiceReferencedCIReferencedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public void setInvoiceReferencedCIReferencedDocument(CIReferencedDocumentType value) {
        this.invoiceReferencedCIReferencedDocument = value;
    }

    /**
     * Gets the value of the additionalReferencedCIReferencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalReferencedCIReferencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalReferencedCIReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIReferencedDocumentType }
     * 
     * 
     */
    public List<CIReferencedDocumentType> getAdditionalReferencedCIReferencedDocument() {
        if (additionalReferencedCIReferencedDocument == null) {
            additionalReferencedCIReferencedDocument = new ArrayList<CIReferencedDocumentType>();
        }
        return this.additionalReferencedCIReferencedDocument;
    }

    /**
     * Gets the value of the specifiedTradeSettlementFinancialCard property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSettlementFinancialCardType }
     *     
     */
    public TradeSettlementFinancialCardType getSpecifiedTradeSettlementFinancialCard() {
        return specifiedTradeSettlementFinancialCard;
    }

    /**
     * Sets the value of the specifiedTradeSettlementFinancialCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSettlementFinancialCardType }
     *     
     */
    public void setSpecifiedTradeSettlementFinancialCard(TradeSettlementFinancialCardType value) {
        this.specifiedTradeSettlementFinancialCard = value;
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
     * Gets the value of the receivableSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableSpecifiedCITradeAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeAccountingAccountType }
     * 
     * 
     */
    public List<CITradeAccountingAccountType> getReceivableSpecifiedCITradeAccountingAccount() {
        if (receivableSpecifiedCITradeAccountingAccount == null) {
            receivableSpecifiedCITradeAccountingAccount = new ArrayList<CITradeAccountingAccountType>();
        }
        return this.receivableSpecifiedCITradeAccountingAccount;
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

    /**
     * Gets the value of the salesSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesSpecifiedCITradeAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesSpecifiedCITradeAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeAccountingAccountType }
     * 
     * 
     */
    public List<CITradeAccountingAccountType> getSalesSpecifiedCITradeAccountingAccount() {
        if (salesSpecifiedCITradeAccountingAccount == null) {
            salesSpecifiedCITradeAccountingAccount = new ArrayList<CITradeAccountingAccountType>();
        }
        return this.salesSpecifiedCITradeAccountingAccount;
    }

}
