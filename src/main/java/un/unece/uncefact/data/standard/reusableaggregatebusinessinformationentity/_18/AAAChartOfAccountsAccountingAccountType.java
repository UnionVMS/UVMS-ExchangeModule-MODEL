
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountBalanceReopeningTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountNatureTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountStatusCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingDebitCreditStatusCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IndicatorType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01007768&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Chart Of Accounts_ Accounting Account. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A specific account for AAA (Accounting And Audit) chart of accounts debits and credits for general accounting, cost accounting or budget accounting.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting Account&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Chart Of Accounts&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting And Audit Chart Of Accounts&lt;/ccts:ProductContextValue&gt;
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
 * <p>Java class for AAAChartOfAccountsAccountingAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAAChartOfAccountsAccountingAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SubAccountID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="AbbreviatedName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountStatusCodeType" minOccurs="0"/>
 *         &lt;element name="GroupRankCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="OpeningDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OpeningResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="AggregationNomenclatureID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BalanceNormalSignCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingDebitCreditStatusCodeType" minOccurs="0"/>
 *         &lt;element name="BalanceReopeningModeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountBalanceReopeningTypeCodeType" minOccurs="0"/>
 *         &lt;element name="LockingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LockingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="ClosingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ClosingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="NatureCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountNatureTypeCodeType" minOccurs="0"/>
 *         &lt;element name="MandatorySecondaryAccountingIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="LatestDebitPostingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LatestDebitPostingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="LatestCreditPostingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LatestCreditPostingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="MatchingMarkIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="LatestMatchingMark" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="TickingMarkIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="LatestTickingMark" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="ElectronicInvoiceURIID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="UpdateAuthorizedAAAChartOfAccountsPerson" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedAAAChartOfAccountsAccountingAccountClassification" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsAccountingAccountClassificationType" minOccurs="0"/>
 *         &lt;element name="InclusiveAAAChartOfAccountsAccountingAccountBoundary" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsAccountingAccountBoundaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MainAAAChartOfAccountsAccountingAccountPattern" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsAccountingAccountPatternType" minOccurs="0"/>
 *         &lt;element name="SubordinateAAAChartOfAccountsAccountingAccountPattern" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsAccountingAccountPatternType" minOccurs="0"/>
 *         &lt;element name="SpecifiedAAAChartOfAccountsTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedAAAChartOfAccountsFinancialAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsFinancialAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedAAAChartOfAccountsPaymentInstruction" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsPaymentInstructionType" minOccurs="0"/>
 *         &lt;element name="RelatedAAAChartOfAccountsAccountingAccountCreditRisk" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsAccountingAccountCreditRiskType" minOccurs="0"/>
 *         &lt;element name="LinkedAAAChartOfAccountsAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DerivedAAAChartOfAccountsReport" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedAAAChartOfAccountsOrganization" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsOrganizationType" minOccurs="0"/>
 *         &lt;element name="ExclusiveAAAChartOfAccountsAccountingAccountBoundary" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAChartOfAccountsAccountingAccountBoundaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAAChartOfAccountsAccountingAccountType", propOrder = {
    "id",
    "typeCode",
    "subAccountID",
    "name",
    "abbreviatedName",
    "statusCode",
    "groupRankCode",
    "openingDateTime",
    "openingResponsiblePerson",
    "aggregationNomenclatureID",
    "balanceNormalSignCode",
    "balanceReopeningModeCode",
    "lockingDateTime",
    "lockingResponsiblePerson",
    "closingDateTime",
    "closingResponsiblePerson",
    "natureCode",
    "mandatorySecondaryAccountingIndicator",
    "latestDebitPostingDateTime",
    "latestDebitPostingResponsiblePerson",
    "latestCreditPostingDateTime",
    "latestCreditPostingResponsiblePerson",
    "matchingMarkIndicator",
    "latestMatchingMark",
    "tickingMarkIndicator",
    "latestTickingMark",
    "languageCode",
    "currencyCode",
    "electronicInvoiceURIID",
    "updateAuthorizedAAAChartOfAccountsPerson",
    "relatedAAAChartOfAccountsAccountingAccountClassification",
    "inclusiveAAAChartOfAccountsAccountingAccountBoundary",
    "mainAAAChartOfAccountsAccountingAccountPattern",
    "subordinateAAAChartOfAccountsAccountingAccountPattern",
    "specifiedAAAChartOfAccountsTax",
    "specifiedAAAChartOfAccountsFinancialAccount",
    "specifiedAAAChartOfAccountsPaymentInstruction",
    "relatedAAAChartOfAccountsAccountingAccountCreditRisk",
    "linkedAAAChartOfAccountsAccountingAccount",
    "derivedAAAChartOfAccountsReport",
    "relatedAAAChartOfAccountsOrganization",
    "exclusiveAAAChartOfAccountsAccountingAccountBoundary"
})
public class AAAChartOfAccountsAccountingAccountType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "TypeCode")
    protected AccountingAccountTypeCodeType typeCode;
    @XmlElement(name = "SubAccountID")
    protected IDType subAccountID;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "AbbreviatedName")
    protected TextType abbreviatedName;
    @XmlElement(name = "StatusCode")
    protected AccountingAccountStatusCodeType statusCode;
    @XmlElement(name = "GroupRankCode")
    protected CodeType groupRankCode;
    @XmlElement(name = "OpeningDateTime")
    protected DateTimeType openingDateTime;
    @XmlElement(name = "OpeningResponsiblePerson")
    protected TextType openingResponsiblePerson;
    @XmlElement(name = "AggregationNomenclatureID")
    protected List<IDType> aggregationNomenclatureID;
    @XmlElement(name = "BalanceNormalSignCode")
    protected AccountingDebitCreditStatusCodeType balanceNormalSignCode;
    @XmlElement(name = "BalanceReopeningModeCode")
    protected AccountingAccountBalanceReopeningTypeCodeType balanceReopeningModeCode;
    @XmlElement(name = "LockingDateTime")
    protected DateTimeType lockingDateTime;
    @XmlElement(name = "LockingResponsiblePerson")
    protected TextType lockingResponsiblePerson;
    @XmlElement(name = "ClosingDateTime")
    protected DateTimeType closingDateTime;
    @XmlElement(name = "ClosingResponsiblePerson")
    protected TextType closingResponsiblePerson;
    @XmlElement(name = "NatureCode")
    protected AccountingAccountNatureTypeCodeType natureCode;
    @XmlElement(name = "MandatorySecondaryAccountingIndicator")
    protected IndicatorType mandatorySecondaryAccountingIndicator;
    @XmlElement(name = "LatestDebitPostingDateTime")
    protected DateTimeType latestDebitPostingDateTime;
    @XmlElement(name = "LatestDebitPostingResponsiblePerson")
    protected TextType latestDebitPostingResponsiblePerson;
    @XmlElement(name = "LatestCreditPostingDateTime")
    protected DateTimeType latestCreditPostingDateTime;
    @XmlElement(name = "LatestCreditPostingResponsiblePerson")
    protected TextType latestCreditPostingResponsiblePerson;
    @XmlElement(name = "MatchingMarkIndicator")
    protected IndicatorType matchingMarkIndicator;
    @XmlElement(name = "LatestMatchingMark")
    protected TextType latestMatchingMark;
    @XmlElement(name = "TickingMarkIndicator")
    protected IndicatorType tickingMarkIndicator;
    @XmlElement(name = "LatestTickingMark")
    protected TextType latestTickingMark;
    @XmlElement(name = "LanguageCode")
    protected CodeType languageCode;
    @XmlElement(name = "CurrencyCode")
    protected CodeType currencyCode;
    @XmlElement(name = "ElectronicInvoiceURIID")
    protected IDType electronicInvoiceURIID;
    @XmlElement(name = "UpdateAuthorizedAAAChartOfAccountsPerson")
    protected List<AAAChartOfAccountsPersonType> updateAuthorizedAAAChartOfAccountsPerson;
    @XmlElement(name = "RelatedAAAChartOfAccountsAccountingAccountClassification")
    protected AAAChartOfAccountsAccountingAccountClassificationType relatedAAAChartOfAccountsAccountingAccountClassification;
    @XmlElement(name = "InclusiveAAAChartOfAccountsAccountingAccountBoundary")
    protected List<AAAChartOfAccountsAccountingAccountBoundaryType> inclusiveAAAChartOfAccountsAccountingAccountBoundary;
    @XmlElement(name = "MainAAAChartOfAccountsAccountingAccountPattern")
    protected AAAChartOfAccountsAccountingAccountPatternType mainAAAChartOfAccountsAccountingAccountPattern;
    @XmlElement(name = "SubordinateAAAChartOfAccountsAccountingAccountPattern")
    protected AAAChartOfAccountsAccountingAccountPatternType subordinateAAAChartOfAccountsAccountingAccountPattern;
    @XmlElement(name = "SpecifiedAAAChartOfAccountsTax")
    protected List<AAAChartOfAccountsTaxType> specifiedAAAChartOfAccountsTax;
    @XmlElement(name = "SpecifiedAAAChartOfAccountsFinancialAccount")
    protected List<AAAChartOfAccountsFinancialAccountType> specifiedAAAChartOfAccountsFinancialAccount;
    @XmlElement(name = "SpecifiedAAAChartOfAccountsPaymentInstruction")
    protected AAAChartOfAccountsPaymentInstructionType specifiedAAAChartOfAccountsPaymentInstruction;
    @XmlElement(name = "RelatedAAAChartOfAccountsAccountingAccountCreditRisk")
    protected AAAChartOfAccountsAccountingAccountCreditRiskType relatedAAAChartOfAccountsAccountingAccountCreditRisk;
    @XmlElement(name = "LinkedAAAChartOfAccountsAccountingAccount")
    protected List<AAAChartOfAccountsAccountingAccountType> linkedAAAChartOfAccountsAccountingAccount;
    @XmlElement(name = "DerivedAAAChartOfAccountsReport")
    protected List<AAAChartOfAccountsReportType> derivedAAAChartOfAccountsReport;
    @XmlElement(name = "RelatedAAAChartOfAccountsOrganization")
    protected AAAChartOfAccountsOrganizationType relatedAAAChartOfAccountsOrganization;
    @XmlElement(name = "ExclusiveAAAChartOfAccountsAccountingAccountBoundary")
    protected List<AAAChartOfAccountsAccountingAccountBoundaryType> exclusiveAAAChartOfAccountsAccountingAccountBoundary;

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
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAccountStatusCodeType }
     *     
     */
    public AccountingAccountStatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAccountStatusCodeType }
     *     
     */
    public void setStatusCode(AccountingAccountStatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the groupRankCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGroupRankCode() {
        return groupRankCode;
    }

    /**
     * Sets the value of the groupRankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGroupRankCode(CodeType value) {
        this.groupRankCode = value;
    }

    /**
     * Gets the value of the openingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOpeningDateTime() {
        return openingDateTime;
    }

    /**
     * Sets the value of the openingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOpeningDateTime(DateTimeType value) {
        this.openingDateTime = value;
    }

    /**
     * Gets the value of the openingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getOpeningResponsiblePerson() {
        return openingResponsiblePerson;
    }

    /**
     * Sets the value of the openingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setOpeningResponsiblePerson(TextType value) {
        this.openingResponsiblePerson = value;
    }

    /**
     * Gets the value of the aggregationNomenclatureID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregationNomenclatureID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregationNomenclatureID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getAggregationNomenclatureID() {
        if (aggregationNomenclatureID == null) {
            aggregationNomenclatureID = new ArrayList<IDType>();
        }
        return this.aggregationNomenclatureID;
    }

    /**
     * Gets the value of the balanceNormalSignCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingDebitCreditStatusCodeType }
     *     
     */
    public AccountingDebitCreditStatusCodeType getBalanceNormalSignCode() {
        return balanceNormalSignCode;
    }

    /**
     * Sets the value of the balanceNormalSignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingDebitCreditStatusCodeType }
     *     
     */
    public void setBalanceNormalSignCode(AccountingDebitCreditStatusCodeType value) {
        this.balanceNormalSignCode = value;
    }

    /**
     * Gets the value of the balanceReopeningModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAccountBalanceReopeningTypeCodeType }
     *     
     */
    public AccountingAccountBalanceReopeningTypeCodeType getBalanceReopeningModeCode() {
        return balanceReopeningModeCode;
    }

    /**
     * Sets the value of the balanceReopeningModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAccountBalanceReopeningTypeCodeType }
     *     
     */
    public void setBalanceReopeningModeCode(AccountingAccountBalanceReopeningTypeCodeType value) {
        this.balanceReopeningModeCode = value;
    }

    /**
     * Gets the value of the lockingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLockingDateTime() {
        return lockingDateTime;
    }

    /**
     * Sets the value of the lockingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLockingDateTime(DateTimeType value) {
        this.lockingDateTime = value;
    }

    /**
     * Gets the value of the lockingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLockingResponsiblePerson() {
        return lockingResponsiblePerson;
    }

    /**
     * Sets the value of the lockingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLockingResponsiblePerson(TextType value) {
        this.lockingResponsiblePerson = value;
    }

    /**
     * Gets the value of the closingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getClosingDateTime() {
        return closingDateTime;
    }

    /**
     * Sets the value of the closingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setClosingDateTime(DateTimeType value) {
        this.closingDateTime = value;
    }

    /**
     * Gets the value of the closingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getClosingResponsiblePerson() {
        return closingResponsiblePerson;
    }

    /**
     * Sets the value of the closingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setClosingResponsiblePerson(TextType value) {
        this.closingResponsiblePerson = value;
    }

    /**
     * Gets the value of the natureCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAccountNatureTypeCodeType }
     *     
     */
    public AccountingAccountNatureTypeCodeType getNatureCode() {
        return natureCode;
    }

    /**
     * Sets the value of the natureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAccountNatureTypeCodeType }
     *     
     */
    public void setNatureCode(AccountingAccountNatureTypeCodeType value) {
        this.natureCode = value;
    }

    /**
     * Gets the value of the mandatorySecondaryAccountingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getMandatorySecondaryAccountingIndicator() {
        return mandatorySecondaryAccountingIndicator;
    }

    /**
     * Sets the value of the mandatorySecondaryAccountingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setMandatorySecondaryAccountingIndicator(IndicatorType value) {
        this.mandatorySecondaryAccountingIndicator = value;
    }

    /**
     * Gets the value of the latestDebitPostingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLatestDebitPostingDateTime() {
        return latestDebitPostingDateTime;
    }

    /**
     * Sets the value of the latestDebitPostingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLatestDebitPostingDateTime(DateTimeType value) {
        this.latestDebitPostingDateTime = value;
    }

    /**
     * Gets the value of the latestDebitPostingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestDebitPostingResponsiblePerson() {
        return latestDebitPostingResponsiblePerson;
    }

    /**
     * Sets the value of the latestDebitPostingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestDebitPostingResponsiblePerson(TextType value) {
        this.latestDebitPostingResponsiblePerson = value;
    }

    /**
     * Gets the value of the latestCreditPostingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLatestCreditPostingDateTime() {
        return latestCreditPostingDateTime;
    }

    /**
     * Sets the value of the latestCreditPostingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLatestCreditPostingDateTime(DateTimeType value) {
        this.latestCreditPostingDateTime = value;
    }

    /**
     * Gets the value of the latestCreditPostingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestCreditPostingResponsiblePerson() {
        return latestCreditPostingResponsiblePerson;
    }

    /**
     * Sets the value of the latestCreditPostingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestCreditPostingResponsiblePerson(TextType value) {
        this.latestCreditPostingResponsiblePerson = value;
    }

    /**
     * Gets the value of the matchingMarkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getMatchingMarkIndicator() {
        return matchingMarkIndicator;
    }

    /**
     * Sets the value of the matchingMarkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setMatchingMarkIndicator(IndicatorType value) {
        this.matchingMarkIndicator = value;
    }

    /**
     * Gets the value of the latestMatchingMark property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestMatchingMark() {
        return latestMatchingMark;
    }

    /**
     * Sets the value of the latestMatchingMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestMatchingMark(TextType value) {
        this.latestMatchingMark = value;
    }

    /**
     * Gets the value of the tickingMarkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getTickingMarkIndicator() {
        return tickingMarkIndicator;
    }

    /**
     * Sets the value of the tickingMarkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setTickingMarkIndicator(IndicatorType value) {
        this.tickingMarkIndicator = value;
    }

    /**
     * Gets the value of the latestTickingMark property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestTickingMark() {
        return latestTickingMark;
    }

    /**
     * Sets the value of the latestTickingMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestTickingMark(TextType value) {
        this.latestTickingMark = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLanguageCode(CodeType value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCurrencyCode(CodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the electronicInvoiceURIID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getElectronicInvoiceURIID() {
        return electronicInvoiceURIID;
    }

    /**
     * Sets the value of the electronicInvoiceURIID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setElectronicInvoiceURIID(IDType value) {
        this.electronicInvoiceURIID = value;
    }

    /**
     * Gets the value of the updateAuthorizedAAAChartOfAccountsPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateAuthorizedAAAChartOfAccountsPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateAuthorizedAAAChartOfAccountsPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAChartOfAccountsPersonType }
     * 
     * 
     */
    public List<AAAChartOfAccountsPersonType> getUpdateAuthorizedAAAChartOfAccountsPerson() {
        if (updateAuthorizedAAAChartOfAccountsPerson == null) {
            updateAuthorizedAAAChartOfAccountsPerson = new ArrayList<AAAChartOfAccountsPersonType>();
        }
        return this.updateAuthorizedAAAChartOfAccountsPerson;
    }

    /**
     * Gets the value of the relatedAAAChartOfAccountsAccountingAccountClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AAAChartOfAccountsAccountingAccountClassificationType }
     *     
     */
    public AAAChartOfAccountsAccountingAccountClassificationType getRelatedAAAChartOfAccountsAccountingAccountClassification() {
        return relatedAAAChartOfAccountsAccountingAccountClassification;
    }

    /**
     * Sets the value of the relatedAAAChartOfAccountsAccountingAccountClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAChartOfAccountsAccountingAccountClassificationType }
     *     
     */
    public void setRelatedAAAChartOfAccountsAccountingAccountClassification(AAAChartOfAccountsAccountingAccountClassificationType value) {
        this.relatedAAAChartOfAccountsAccountingAccountClassification = value;
    }

    /**
     * Gets the value of the inclusiveAAAChartOfAccountsAccountingAccountBoundary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inclusiveAAAChartOfAccountsAccountingAccountBoundary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclusiveAAAChartOfAccountsAccountingAccountBoundary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAChartOfAccountsAccountingAccountBoundaryType }
     * 
     * 
     */
    public List<AAAChartOfAccountsAccountingAccountBoundaryType> getInclusiveAAAChartOfAccountsAccountingAccountBoundary() {
        if (inclusiveAAAChartOfAccountsAccountingAccountBoundary == null) {
            inclusiveAAAChartOfAccountsAccountingAccountBoundary = new ArrayList<AAAChartOfAccountsAccountingAccountBoundaryType>();
        }
        return this.inclusiveAAAChartOfAccountsAccountingAccountBoundary;
    }

    /**
     * Gets the value of the mainAAAChartOfAccountsAccountingAccountPattern property.
     * 
     * @return
     *     possible object is
     *     {@link AAAChartOfAccountsAccountingAccountPatternType }
     *     
     */
    public AAAChartOfAccountsAccountingAccountPatternType getMainAAAChartOfAccountsAccountingAccountPattern() {
        return mainAAAChartOfAccountsAccountingAccountPattern;
    }

    /**
     * Sets the value of the mainAAAChartOfAccountsAccountingAccountPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAChartOfAccountsAccountingAccountPatternType }
     *     
     */
    public void setMainAAAChartOfAccountsAccountingAccountPattern(AAAChartOfAccountsAccountingAccountPatternType value) {
        this.mainAAAChartOfAccountsAccountingAccountPattern = value;
    }

    /**
     * Gets the value of the subordinateAAAChartOfAccountsAccountingAccountPattern property.
     * 
     * @return
     *     possible object is
     *     {@link AAAChartOfAccountsAccountingAccountPatternType }
     *     
     */
    public AAAChartOfAccountsAccountingAccountPatternType getSubordinateAAAChartOfAccountsAccountingAccountPattern() {
        return subordinateAAAChartOfAccountsAccountingAccountPattern;
    }

    /**
     * Sets the value of the subordinateAAAChartOfAccountsAccountingAccountPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAChartOfAccountsAccountingAccountPatternType }
     *     
     */
    public void setSubordinateAAAChartOfAccountsAccountingAccountPattern(AAAChartOfAccountsAccountingAccountPatternType value) {
        this.subordinateAAAChartOfAccountsAccountingAccountPattern = value;
    }

    /**
     * Gets the value of the specifiedAAAChartOfAccountsTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedAAAChartOfAccountsTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedAAAChartOfAccountsTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAChartOfAccountsTaxType }
     * 
     * 
     */
    public List<AAAChartOfAccountsTaxType> getSpecifiedAAAChartOfAccountsTax() {
        if (specifiedAAAChartOfAccountsTax == null) {
            specifiedAAAChartOfAccountsTax = new ArrayList<AAAChartOfAccountsTaxType>();
        }
        return this.specifiedAAAChartOfAccountsTax;
    }

    /**
     * Gets the value of the specifiedAAAChartOfAccountsFinancialAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedAAAChartOfAccountsFinancialAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedAAAChartOfAccountsFinancialAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAChartOfAccountsFinancialAccountType }
     * 
     * 
     */
    public List<AAAChartOfAccountsFinancialAccountType> getSpecifiedAAAChartOfAccountsFinancialAccount() {
        if (specifiedAAAChartOfAccountsFinancialAccount == null) {
            specifiedAAAChartOfAccountsFinancialAccount = new ArrayList<AAAChartOfAccountsFinancialAccountType>();
        }
        return this.specifiedAAAChartOfAccountsFinancialAccount;
    }

    /**
     * Gets the value of the specifiedAAAChartOfAccountsPaymentInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link AAAChartOfAccountsPaymentInstructionType }
     *     
     */
    public AAAChartOfAccountsPaymentInstructionType getSpecifiedAAAChartOfAccountsPaymentInstruction() {
        return specifiedAAAChartOfAccountsPaymentInstruction;
    }

    /**
     * Sets the value of the specifiedAAAChartOfAccountsPaymentInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAChartOfAccountsPaymentInstructionType }
     *     
     */
    public void setSpecifiedAAAChartOfAccountsPaymentInstruction(AAAChartOfAccountsPaymentInstructionType value) {
        this.specifiedAAAChartOfAccountsPaymentInstruction = value;
    }

    /**
     * Gets the value of the relatedAAAChartOfAccountsAccountingAccountCreditRisk property.
     * 
     * @return
     *     possible object is
     *     {@link AAAChartOfAccountsAccountingAccountCreditRiskType }
     *     
     */
    public AAAChartOfAccountsAccountingAccountCreditRiskType getRelatedAAAChartOfAccountsAccountingAccountCreditRisk() {
        return relatedAAAChartOfAccountsAccountingAccountCreditRisk;
    }

    /**
     * Sets the value of the relatedAAAChartOfAccountsAccountingAccountCreditRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAChartOfAccountsAccountingAccountCreditRiskType }
     *     
     */
    public void setRelatedAAAChartOfAccountsAccountingAccountCreditRisk(AAAChartOfAccountsAccountingAccountCreditRiskType value) {
        this.relatedAAAChartOfAccountsAccountingAccountCreditRisk = value;
    }

    /**
     * Gets the value of the linkedAAAChartOfAccountsAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedAAAChartOfAccountsAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedAAAChartOfAccountsAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAChartOfAccountsAccountingAccountType }
     * 
     * 
     */
    public List<AAAChartOfAccountsAccountingAccountType> getLinkedAAAChartOfAccountsAccountingAccount() {
        if (linkedAAAChartOfAccountsAccountingAccount == null) {
            linkedAAAChartOfAccountsAccountingAccount = new ArrayList<AAAChartOfAccountsAccountingAccountType>();
        }
        return this.linkedAAAChartOfAccountsAccountingAccount;
    }

    /**
     * Gets the value of the derivedAAAChartOfAccountsReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedAAAChartOfAccountsReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedAAAChartOfAccountsReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAChartOfAccountsReportType }
     * 
     * 
     */
    public List<AAAChartOfAccountsReportType> getDerivedAAAChartOfAccountsReport() {
        if (derivedAAAChartOfAccountsReport == null) {
            derivedAAAChartOfAccountsReport = new ArrayList<AAAChartOfAccountsReportType>();
        }
        return this.derivedAAAChartOfAccountsReport;
    }

    /**
     * Gets the value of the relatedAAAChartOfAccountsOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link AAAChartOfAccountsOrganizationType }
     *     
     */
    public AAAChartOfAccountsOrganizationType getRelatedAAAChartOfAccountsOrganization() {
        return relatedAAAChartOfAccountsOrganization;
    }

    /**
     * Sets the value of the relatedAAAChartOfAccountsOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAChartOfAccountsOrganizationType }
     *     
     */
    public void setRelatedAAAChartOfAccountsOrganization(AAAChartOfAccountsOrganizationType value) {
        this.relatedAAAChartOfAccountsOrganization = value;
    }

    /**
     * Gets the value of the exclusiveAAAChartOfAccountsAccountingAccountBoundary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusiveAAAChartOfAccountsAccountingAccountBoundary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusiveAAAChartOfAccountsAccountingAccountBoundary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAChartOfAccountsAccountingAccountBoundaryType }
     * 
     * 
     */
    public List<AAAChartOfAccountsAccountingAccountBoundaryType> getExclusiveAAAChartOfAccountsAccountingAccountBoundary() {
        if (exclusiveAAAChartOfAccountsAccountingAccountBoundary == null) {
            exclusiveAAAChartOfAccountsAccountingAccountBoundary = new ArrayList<AAAChartOfAccountsAccountingAccountBoundaryType>();
        }
        return this.exclusiveAAAChartOfAccountsAccountingAccountBoundary;
    }

}
