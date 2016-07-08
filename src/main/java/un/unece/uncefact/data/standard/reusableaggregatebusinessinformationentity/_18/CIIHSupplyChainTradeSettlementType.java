
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
import un.unece.uncefact.data.standard.unqualifieddatatype._18.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005909&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIIH_ Supply Chain_ Trade Settlement. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The information that enables the financial reconciliation of the Cross Industry Invoice Header (CIIH) of a supply chain transaction with the item(s) that the financial transaction is intended to settle.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Settlement&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CIIH&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * <p>Java class for CIIHSupplyChainTradeSettlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIIHSupplyChainTradeSettlementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DuePayableAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditorReferenceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="PaymentReference" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="InvoiceCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="CreditorReferenceTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditorReferenceType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditorReferenceIssuerID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceIssuerReference" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="InvoiceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="NextInvoiceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditReasonCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="CreditReason" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoicerCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="InvoiceeCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="PayeeCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="PayerCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="TaxApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="InvoiceApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="PaymentApplicableCITradeCurrencyExchange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCurrencyExchangeType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeSettlementPaymentMeans" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeSettlementPaymentMeansType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicableCITradeTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillingCISpecifiedPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CISpecifiedPeriodType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeAllowanceCharge" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAllowanceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubtotalCalculatedCITradeTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCILogisticsServiceCharge" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CILogisticsServiceChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradePaymentTerms" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePaymentTermsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedCIIHTradeSettlementMonetarySummation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIIHTradeSettlementMonetarySummationType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCIFinancialAdjustment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIFinancialAdjustmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceReferencedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" minOccurs="0"/>
 *         &lt;element name="ProFormaInvoiceReferencedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" minOccurs="0"/>
 *         &lt;element name="LetterOfCreditReferencedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" minOccurs="0"/>
 *         &lt;element name="SpecifiedTradeSettlementFinancialCard" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TradeSettlementFinancialCardType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PayableSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReceivableSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaseSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FactoringAgreementReferencedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FactoringListReferencedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UltimatePayeeCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="SpecifiedAdvancePayment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AdvancePaymentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIIHSupplyChainTradeSettlementType", propOrder = {
    "duePayableAmount",
    "creditorReferenceID",
    "paymentReference",
    "taxCurrencyCode",
    "invoiceCurrencyCode",
    "paymentCurrencyCode",
    "creditorReferenceTypeCode",
    "creditorReferenceType",
    "creditorReferenceIssuerID",
    "invoiceIssuerReference",
    "invoiceDateTime",
    "nextInvoiceDateTime",
    "creditReasonCode",
    "creditReason",
    "invoicerCITradeParty",
    "invoiceeCITradeParty",
    "payeeCITradeParty",
    "payerCITradeParty",
    "taxApplicableCITradeCurrencyExchange",
    "invoiceApplicableCITradeCurrencyExchange",
    "paymentApplicableCITradeCurrencyExchange",
    "specifiedCITradeSettlementPaymentMeans",
    "applicableCITradeTax",
    "billingCISpecifiedPeriod",
    "specifiedCITradeAllowanceCharge",
    "subtotalCalculatedCITradeTax",
    "specifiedCILogisticsServiceCharge",
    "specifiedCITradePaymentTerms",
    "specifiedCIIHTradeSettlementMonetarySummation",
    "specifiedCIFinancialAdjustment",
    "invoiceReferencedCIReferencedDocument",
    "proFormaInvoiceReferencedCIReferencedDocument",
    "letterOfCreditReferencedCIReferencedDocument",
    "specifiedTradeSettlementFinancialCard",
    "payableSpecifiedCITradeAccountingAccount",
    "receivableSpecifiedCITradeAccountingAccount",
    "purchaseSpecifiedCITradeAccountingAccount",
    "salesSpecifiedCITradeAccountingAccount",
    "factoringAgreementReferencedCIReferencedDocument",
    "factoringListReferencedCIReferencedDocument",
    "ultimatePayeeCITradeParty",
    "specifiedAdvancePayment"
})
public class CIIHSupplyChainTradeSettlementType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DuePayableAmount")
    protected List<AmountType> duePayableAmount;
    @XmlElement(name = "CreditorReferenceID")
    protected IDType creditorReferenceID;
    @XmlElement(name = "PaymentReference")
    protected List<TextType> paymentReference;
    @XmlElement(name = "TaxCurrencyCode")
    protected CurrencyCodeType taxCurrencyCode;
    @XmlElement(name = "InvoiceCurrencyCode")
    protected CurrencyCodeType invoiceCurrencyCode;
    @XmlElement(name = "PaymentCurrencyCode")
    protected CurrencyCodeType paymentCurrencyCode;
    @XmlElement(name = "CreditorReferenceTypeCode")
    protected List<CodeType> creditorReferenceTypeCode;
    @XmlElement(name = "CreditorReferenceType")
    protected List<TextType> creditorReferenceType;
    @XmlElement(name = "CreditorReferenceIssuerID")
    protected List<IDType> creditorReferenceIssuerID;
    @XmlElement(name = "InvoiceIssuerReference")
    protected TextType invoiceIssuerReference;
    @XmlElement(name = "InvoiceDateTime")
    protected DateTimeType invoiceDateTime;
    @XmlElement(name = "NextInvoiceDateTime")
    protected List<DateTimeType> nextInvoiceDateTime;
    @XmlElement(name = "CreditReasonCode")
    protected CodeType creditReasonCode;
    @XmlElement(name = "CreditReason")
    protected List<TextType> creditReason;
    @XmlElement(name = "InvoicerCITradeParty")
    protected CITradePartyType invoicerCITradeParty;
    @XmlElement(name = "InvoiceeCITradeParty")
    protected CITradePartyType invoiceeCITradeParty;
    @XmlElement(name = "PayeeCITradeParty")
    protected CITradePartyType payeeCITradeParty;
    @XmlElement(name = "PayerCITradeParty")
    protected CITradePartyType payerCITradeParty;
    @XmlElement(name = "TaxApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType taxApplicableCITradeCurrencyExchange;
    @XmlElement(name = "InvoiceApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType invoiceApplicableCITradeCurrencyExchange;
    @XmlElement(name = "PaymentApplicableCITradeCurrencyExchange")
    protected CITradeCurrencyExchangeType paymentApplicableCITradeCurrencyExchange;
    @XmlElement(name = "SpecifiedCITradeSettlementPaymentMeans")
    protected List<CITradeSettlementPaymentMeansType> specifiedCITradeSettlementPaymentMeans;
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
    @XmlElement(name = "SpecifiedCIIHTradeSettlementMonetarySummation")
    protected CIIHTradeSettlementMonetarySummationType specifiedCIIHTradeSettlementMonetarySummation;
    @XmlElement(name = "SpecifiedCIFinancialAdjustment")
    protected List<CIFinancialAdjustmentType> specifiedCIFinancialAdjustment;
    @XmlElement(name = "InvoiceReferencedCIReferencedDocument")
    protected CIReferencedDocumentType invoiceReferencedCIReferencedDocument;
    @XmlElement(name = "ProFormaInvoiceReferencedCIReferencedDocument")
    protected CIReferencedDocumentType proFormaInvoiceReferencedCIReferencedDocument;
    @XmlElement(name = "LetterOfCreditReferencedCIReferencedDocument")
    protected CIReferencedDocumentType letterOfCreditReferencedCIReferencedDocument;
    @XmlElement(name = "SpecifiedTradeSettlementFinancialCard")
    protected List<TradeSettlementFinancialCardType> specifiedTradeSettlementFinancialCard;
    @XmlElement(name = "PayableSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> payableSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "ReceivableSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> receivableSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "PurchaseSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> purchaseSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "SalesSpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> salesSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "FactoringAgreementReferencedCIReferencedDocument")
    protected List<CIReferencedDocumentType> factoringAgreementReferencedCIReferencedDocument;
    @XmlElement(name = "FactoringListReferencedCIReferencedDocument")
    protected List<CIReferencedDocumentType> factoringListReferencedCIReferencedDocument;
    @XmlElement(name = "UltimatePayeeCITradeParty")
    protected CITradePartyType ultimatePayeeCITradeParty;
    @XmlElement(name = "SpecifiedAdvancePayment")
    protected List<AdvancePaymentType> specifiedAdvancePayment;

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
     * Gets the value of the creditorReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getCreditorReferenceID() {
        return creditorReferenceID;
    }

    /**
     * Sets the value of the creditorReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setCreditorReferenceID(IDType value) {
        this.creditorReferenceID = value;
    }

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
     * Gets the value of the paymentCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /**
     * Sets the value of the paymentCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setPaymentCurrencyCode(CurrencyCodeType value) {
        this.paymentCurrencyCode = value;
    }

    /**
     * Gets the value of the creditorReferenceTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditorReferenceTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditorReferenceTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getCreditorReferenceTypeCode() {
        if (creditorReferenceTypeCode == null) {
            creditorReferenceTypeCode = new ArrayList<CodeType>();
        }
        return this.creditorReferenceTypeCode;
    }

    /**
     * Gets the value of the creditorReferenceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditorReferenceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditorReferenceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getCreditorReferenceType() {
        if (creditorReferenceType == null) {
            creditorReferenceType = new ArrayList<TextType>();
        }
        return this.creditorReferenceType;
    }

    /**
     * Gets the value of the creditorReferenceIssuerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditorReferenceIssuerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditorReferenceIssuerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getCreditorReferenceIssuerID() {
        if (creditorReferenceIssuerID == null) {
            creditorReferenceIssuerID = new ArrayList<IDType>();
        }
        return this.creditorReferenceIssuerID;
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
     * Gets the value of the invoiceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getInvoiceDateTime() {
        return invoiceDateTime;
    }

    /**
     * Sets the value of the invoiceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setInvoiceDateTime(DateTimeType value) {
        this.invoiceDateTime = value;
    }

    /**
     * Gets the value of the nextInvoiceDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextInvoiceDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextInvoiceDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeType }
     * 
     * 
     */
    public List<DateTimeType> getNextInvoiceDateTime() {
        if (nextInvoiceDateTime == null) {
            nextInvoiceDateTime = new ArrayList<DateTimeType>();
        }
        return this.nextInvoiceDateTime;
    }

    /**
     * Gets the value of the creditReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCreditReasonCode() {
        return creditReasonCode;
    }

    /**
     * Sets the value of the creditReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCreditReasonCode(CodeType value) {
        this.creditReasonCode = value;
    }

    /**
     * Gets the value of the creditReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getCreditReason() {
        if (creditReason == null) {
            creditReason = new ArrayList<TextType>();
        }
        return this.creditReason;
    }

    /**
     * Gets the value of the invoicerCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getInvoicerCITradeParty() {
        return invoicerCITradeParty;
    }

    /**
     * Sets the value of the invoicerCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setInvoicerCITradeParty(CITradePartyType value) {
        this.invoicerCITradeParty = value;
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
     * Gets the value of the payeeCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getPayeeCITradeParty() {
        return payeeCITradeParty;
    }

    /**
     * Sets the value of the payeeCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setPayeeCITradeParty(CITradePartyType value) {
        this.payeeCITradeParty = value;
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
     * Gets the value of the paymentApplicableCITradeCurrencyExchange property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public CITradeCurrencyExchangeType getPaymentApplicableCITradeCurrencyExchange() {
        return paymentApplicableCITradeCurrencyExchange;
    }

    /**
     * Sets the value of the paymentApplicableCITradeCurrencyExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeCurrencyExchangeType }
     *     
     */
    public void setPaymentApplicableCITradeCurrencyExchange(CITradeCurrencyExchangeType value) {
        this.paymentApplicableCITradeCurrencyExchange = value;
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
     * Gets the value of the specifiedCIIHTradeSettlementMonetarySummation property.
     * 
     * @return
     *     possible object is
     *     {@link CIIHTradeSettlementMonetarySummationType }
     *     
     */
    public CIIHTradeSettlementMonetarySummationType getSpecifiedCIIHTradeSettlementMonetarySummation() {
        return specifiedCIIHTradeSettlementMonetarySummation;
    }

    /**
     * Sets the value of the specifiedCIIHTradeSettlementMonetarySummation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIIHTradeSettlementMonetarySummationType }
     *     
     */
    public void setSpecifiedCIIHTradeSettlementMonetarySummation(CIIHTradeSettlementMonetarySummationType value) {
        this.specifiedCIIHTradeSettlementMonetarySummation = value;
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
     * Gets the value of the proFormaInvoiceReferencedCIReferencedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public CIReferencedDocumentType getProFormaInvoiceReferencedCIReferencedDocument() {
        return proFormaInvoiceReferencedCIReferencedDocument;
    }

    /**
     * Sets the value of the proFormaInvoiceReferencedCIReferencedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public void setProFormaInvoiceReferencedCIReferencedDocument(CIReferencedDocumentType value) {
        this.proFormaInvoiceReferencedCIReferencedDocument = value;
    }

    /**
     * Gets the value of the letterOfCreditReferencedCIReferencedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public CIReferencedDocumentType getLetterOfCreditReferencedCIReferencedDocument() {
        return letterOfCreditReferencedCIReferencedDocument;
    }

    /**
     * Sets the value of the letterOfCreditReferencedCIReferencedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public void setLetterOfCreditReferencedCIReferencedDocument(CIReferencedDocumentType value) {
        this.letterOfCreditReferencedCIReferencedDocument = value;
    }

    /**
     * Gets the value of the specifiedTradeSettlementFinancialCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedTradeSettlementFinancialCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedTradeSettlementFinancialCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeSettlementFinancialCardType }
     * 
     * 
     */
    public List<TradeSettlementFinancialCardType> getSpecifiedTradeSettlementFinancialCard() {
        if (specifiedTradeSettlementFinancialCard == null) {
            specifiedTradeSettlementFinancialCard = new ArrayList<TradeSettlementFinancialCardType>();
        }
        return this.specifiedTradeSettlementFinancialCard;
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

    /**
     * Gets the value of the factoringAgreementReferencedCIReferencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factoringAgreementReferencedCIReferencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactoringAgreementReferencedCIReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIReferencedDocumentType }
     * 
     * 
     */
    public List<CIReferencedDocumentType> getFactoringAgreementReferencedCIReferencedDocument() {
        if (factoringAgreementReferencedCIReferencedDocument == null) {
            factoringAgreementReferencedCIReferencedDocument = new ArrayList<CIReferencedDocumentType>();
        }
        return this.factoringAgreementReferencedCIReferencedDocument;
    }

    /**
     * Gets the value of the factoringListReferencedCIReferencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factoringListReferencedCIReferencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactoringListReferencedCIReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIReferencedDocumentType }
     * 
     * 
     */
    public List<CIReferencedDocumentType> getFactoringListReferencedCIReferencedDocument() {
        if (factoringListReferencedCIReferencedDocument == null) {
            factoringListReferencedCIReferencedDocument = new ArrayList<CIReferencedDocumentType>();
        }
        return this.factoringListReferencedCIReferencedDocument;
    }

    /**
     * Gets the value of the ultimatePayeeCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getUltimatePayeeCITradeParty() {
        return ultimatePayeeCITradeParty;
    }

    /**
     * Sets the value of the ultimatePayeeCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setUltimatePayeeCITradeParty(CITradePartyType value) {
        this.ultimatePayeeCITradeParty = value;
    }

    /**
     * Gets the value of the specifiedAdvancePayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedAdvancePayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedAdvancePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvancePaymentType }
     * 
     * 
     */
    public List<AdvancePaymentType> getSpecifiedAdvancePayment() {
        if (specifiedAdvancePayment == null) {
            specifiedAdvancePayment = new ArrayList<AdvancePaymentType>();
        }
        return this.specifiedAdvancePayment;
    }

}
