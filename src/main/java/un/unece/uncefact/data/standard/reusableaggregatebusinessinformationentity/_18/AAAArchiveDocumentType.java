
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingDocumentCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.CurrencyCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.DocumentStatusCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IndicatorType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.NumericType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.QuantityType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01009087&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Archive_ Document. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A document or book intended to be stored in a usable form to conform with AAA (Accounting And Audit) archive requirements.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Document&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Archive&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting, audit and reporting, Accounting entry&lt;/ccts:ProductContextValue&gt;
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
 * <p>Java class for AAAArchiveDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAAArchiveDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultipleTypeIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingDocumentCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IssueDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="SubmissionDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ReceiptDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ControlRequirementIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DocumentStatusCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CopyIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ResponseDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ItemIdentificationID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LanguageID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineCountNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}NumericType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LineID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MultipleReferencesIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Revision" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Authorization" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="ChecksumNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}NumericType" minOccurs="0"/>
 *         &lt;element name="ItemQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcceptanceDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OriginalRequiredQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="CopyRequiredQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="OriginalIssuedQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="CopyIssuedQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="Information" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="AuthenticatedOriginalIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Disposition" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ElectronicPresentationIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="PageID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalPageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="RevisionDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RejectionReason" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CancellationReason" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CancellationDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="SequenceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SectionName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="FirstVersionIssueDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ExaminedIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="VerifiedIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="HandwrittenIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="PrintedIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="SignedIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="SignedDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RequestedDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="SignatureLocation" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludedAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludedQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RejectionDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="SpecifiedAAAArchiveArchiveParameter" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveArchiveParameterType" minOccurs="0"/>
 *         &lt;element name="OwnerAAAArchiveParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchivePartyType" minOccurs="0"/>
 *         &lt;element name="AgentAAAArchiveParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchivePartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SenderAAAArchiveParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchivePartyType" minOccurs="0"/>
 *         &lt;element name="IncludedAAAArchiveNote" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveNoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AttachedAAAArchiveBinaryFile" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveBinaryFileType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveAAAPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAPeriodType" minOccurs="0"/>
 *         &lt;element name="AcceptableAAAPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAPeriodType" minOccurs="0"/>
 *         &lt;element name="LodgementAAAArchiveLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IssueAAAArchiveLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContractualAAAArchiveClause" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveClauseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductionAAAArchiveSoftware" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveSoftwareType" minOccurs="0"/>
 *         &lt;element name="ReferenceAAAArchiveDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SignatoryAAAArchiveAuthentication" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAArchiveAuthenticationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAAArchiveDocumentType", propOrder = {
    "multipleTypeIndicator",
    "id",
    "typeCode",
    "name",
    "purpose",
    "description",
    "issueDateTime",
    "submissionDateTime",
    "receiptDateTime",
    "controlRequirementIndicator",
    "creationDateTime",
    "statusCode",
    "copyIndicator",
    "responseDateTime",
    "itemIdentificationID",
    "remarks",
    "languageID",
    "currencyCode",
    "lineCountNumeric",
    "lineID",
    "multipleReferencesIndicator",
    "revision",
    "authorization",
    "checksumNumeric",
    "itemQuantity",
    "acceptanceDateTime",
    "originalRequiredQuantity",
    "copyRequiredQuantity",
    "originalIssuedQuantity",
    "copyIssuedQuantity",
    "information",
    "authenticatedOriginalIndicator",
    "disposition",
    "electronicPresentationIndicator",
    "pageID",
    "totalPageQuantity",
    "revisionDateTime",
    "rejectionReason",
    "cancellationReason",
    "cancellationDateTime",
    "sequenceID",
    "sectionName",
    "externalID",
    "firstVersionIssueDateTime",
    "examinedIndicator",
    "verifiedIndicator",
    "handwrittenIndicator",
    "printedIndicator",
    "signedIndicator",
    "signedDateTime",
    "requestedDateTime",
    "signatureLocation",
    "status",
    "includedAmount",
    "includedQuantity",
    "rejectionDateTime",
    "specifiedAAAArchiveArchiveParameter",
    "ownerAAAArchiveParty",
    "agentAAAArchiveParty",
    "senderAAAArchiveParty",
    "includedAAAArchiveNote",
    "attachedAAAArchiveBinaryFile",
    "effectiveAAAPeriod",
    "acceptableAAAPeriod",
    "lodgementAAAArchiveLocation",
    "issueAAAArchiveLocation",
    "contractualAAAArchiveClause",
    "productionAAAArchiveSoftware",
    "referenceAAAArchiveDocument",
    "signatoryAAAArchiveAuthentication"
})
public class AAAArchiveDocumentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MultipleTypeIndicator")
    protected IndicatorType multipleTypeIndicator;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "TypeCode")
    protected List<AccountingDocumentCodeType> typeCode;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "Purpose")
    protected TextType purpose;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "IssueDateTime")
    protected DateTimeType issueDateTime;
    @XmlElement(name = "SubmissionDateTime")
    protected DateTimeType submissionDateTime;
    @XmlElement(name = "ReceiptDateTime")
    protected DateTimeType receiptDateTime;
    @XmlElement(name = "ControlRequirementIndicator")
    protected IndicatorType controlRequirementIndicator;
    @XmlElement(name = "CreationDateTime")
    protected DateTimeType creationDateTime;
    @XmlElement(name = "StatusCode")
    protected List<DocumentStatusCodeType> statusCode;
    @XmlElement(name = "CopyIndicator")
    protected IndicatorType copyIndicator;
    @XmlElement(name = "ResponseDateTime")
    protected DateTimeType responseDateTime;
    @XmlElement(name = "ItemIdentificationID")
    protected IDType itemIdentificationID;
    @XmlElement(name = "Remarks")
    protected List<TextType> remarks;
    @XmlElement(name = "LanguageID")
    protected List<IDType> languageID;
    @XmlElement(name = "CurrencyCode")
    protected List<CurrencyCodeType> currencyCode;
    @XmlElement(name = "LineCountNumeric")
    protected List<NumericType> lineCountNumeric;
    @XmlElement(name = "LineID")
    protected List<IDType> lineID;
    @XmlElement(name = "MultipleReferencesIndicator")
    protected IndicatorType multipleReferencesIndicator;
    @XmlElement(name = "Revision")
    protected List<TextType> revision;
    @XmlElement(name = "Authorization")
    protected TextType authorization;
    @XmlElement(name = "ChecksumNumeric")
    protected NumericType checksumNumeric;
    @XmlElement(name = "ItemQuantity")
    protected List<QuantityType> itemQuantity;
    @XmlElement(name = "AcceptanceDateTime")
    protected DateTimeType acceptanceDateTime;
    @XmlElement(name = "OriginalRequiredQuantity")
    protected QuantityType originalRequiredQuantity;
    @XmlElement(name = "CopyRequiredQuantity")
    protected QuantityType copyRequiredQuantity;
    @XmlElement(name = "OriginalIssuedQuantity")
    protected QuantityType originalIssuedQuantity;
    @XmlElement(name = "CopyIssuedQuantity")
    protected QuantityType copyIssuedQuantity;
    @XmlElement(name = "Information")
    protected TextType information;
    @XmlElement(name = "AuthenticatedOriginalIndicator")
    protected IndicatorType authenticatedOriginalIndicator;
    @XmlElement(name = "Disposition")
    protected List<TextType> disposition;
    @XmlElement(name = "ElectronicPresentationIndicator")
    protected IndicatorType electronicPresentationIndicator;
    @XmlElement(name = "PageID")
    protected List<IDType> pageID;
    @XmlElement(name = "TotalPageQuantity")
    protected QuantityType totalPageQuantity;
    @XmlElement(name = "RevisionDateTime")
    protected DateTimeType revisionDateTime;
    @XmlElement(name = "RejectionReason")
    protected List<TextType> rejectionReason;
    @XmlElement(name = "CancellationReason")
    protected List<TextType> cancellationReason;
    @XmlElement(name = "CancellationDateTime")
    protected DateTimeType cancellationDateTime;
    @XmlElement(name = "SequenceID")
    protected List<IDType> sequenceID;
    @XmlElement(name = "SectionName")
    protected List<TextType> sectionName;
    @XmlElement(name = "ExternalID")
    protected IDType externalID;
    @XmlElement(name = "FirstVersionIssueDateTime")
    protected DateTimeType firstVersionIssueDateTime;
    @XmlElement(name = "ExaminedIndicator")
    protected IndicatorType examinedIndicator;
    @XmlElement(name = "VerifiedIndicator")
    protected IndicatorType verifiedIndicator;
    @XmlElement(name = "HandwrittenIndicator")
    protected IndicatorType handwrittenIndicator;
    @XmlElement(name = "PrintedIndicator")
    protected IndicatorType printedIndicator;
    @XmlElement(name = "SignedIndicator")
    protected IndicatorType signedIndicator;
    @XmlElement(name = "SignedDateTime")
    protected DateTimeType signedDateTime;
    @XmlElement(name = "RequestedDateTime")
    protected DateTimeType requestedDateTime;
    @XmlElement(name = "SignatureLocation")
    protected List<TextType> signatureLocation;
    @XmlElement(name = "Status")
    protected List<TextType> status;
    @XmlElement(name = "IncludedAmount")
    protected List<AmountType> includedAmount;
    @XmlElement(name = "IncludedQuantity")
    protected List<QuantityType> includedQuantity;
    @XmlElement(name = "RejectionDateTime")
    protected DateTimeType rejectionDateTime;
    @XmlElement(name = "SpecifiedAAAArchiveArchiveParameter")
    protected AAAArchiveArchiveParameterType specifiedAAAArchiveArchiveParameter;
    @XmlElement(name = "OwnerAAAArchiveParty")
    protected AAAArchivePartyType ownerAAAArchiveParty;
    @XmlElement(name = "AgentAAAArchiveParty")
    protected List<AAAArchivePartyType> agentAAAArchiveParty;
    @XmlElement(name = "SenderAAAArchiveParty")
    protected AAAArchivePartyType senderAAAArchiveParty;
    @XmlElement(name = "IncludedAAAArchiveNote")
    protected List<AAAArchiveNoteType> includedAAAArchiveNote;
    @XmlElement(name = "AttachedAAAArchiveBinaryFile")
    protected List<AAAArchiveBinaryFileType> attachedAAAArchiveBinaryFile;
    @XmlElement(name = "EffectiveAAAPeriod")
    protected AAAPeriodType effectiveAAAPeriod;
    @XmlElement(name = "AcceptableAAAPeriod")
    protected AAAPeriodType acceptableAAAPeriod;
    @XmlElement(name = "LodgementAAAArchiveLocation")
    protected List<AAAArchiveLocationType> lodgementAAAArchiveLocation;
    @XmlElement(name = "IssueAAAArchiveLocation")
    protected List<AAAArchiveLocationType> issueAAAArchiveLocation;
    @XmlElement(name = "ContractualAAAArchiveClause")
    protected List<AAAArchiveClauseType> contractualAAAArchiveClause;
    @XmlElement(name = "ProductionAAAArchiveSoftware")
    protected AAAArchiveSoftwareType productionAAAArchiveSoftware;
    @XmlElement(name = "ReferenceAAAArchiveDocument")
    protected List<AAAArchiveDocumentType> referenceAAAArchiveDocument;
    @XmlElement(name = "SignatoryAAAArchiveAuthentication")
    protected List<AAAArchiveAuthenticationType> signatoryAAAArchiveAuthentication;

    /**
     * Gets the value of the multipleTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getMultipleTypeIndicator() {
        return multipleTypeIndicator;
    }

    /**
     * Sets the value of the multipleTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setMultipleTypeIndicator(IndicatorType value) {
        this.multipleTypeIndicator = value;
    }

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingDocumentCodeType }
     * 
     * 
     */
    public List<AccountingDocumentCodeType> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<AccountingDocumentCodeType>();
        }
        return this.typeCode;
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
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDescription() {
        if (description == null) {
            description = new ArrayList<TextType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the issueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getIssueDateTime() {
        return issueDateTime;
    }

    /**
     * Sets the value of the issueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setIssueDateTime(DateTimeType value) {
        this.issueDateTime = value;
    }

    /**
     * Gets the value of the submissionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getSubmissionDateTime() {
        return submissionDateTime;
    }

    /**
     * Sets the value of the submissionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setSubmissionDateTime(DateTimeType value) {
        this.submissionDateTime = value;
    }

    /**
     * Gets the value of the receiptDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getReceiptDateTime() {
        return receiptDateTime;
    }

    /**
     * Sets the value of the receiptDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setReceiptDateTime(DateTimeType value) {
        this.receiptDateTime = value;
    }

    /**
     * Gets the value of the controlRequirementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getControlRequirementIndicator() {
        return controlRequirementIndicator;
    }

    /**
     * Sets the value of the controlRequirementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setControlRequirementIndicator(IndicatorType value) {
        this.controlRequirementIndicator = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCreationDateTime(DateTimeType value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentStatusCodeType }
     * 
     * 
     */
    public List<DocumentStatusCodeType> getStatusCode() {
        if (statusCode == null) {
            statusCode = new ArrayList<DocumentStatusCodeType>();
        }
        return this.statusCode;
    }

    /**
     * Gets the value of the copyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Sets the value of the copyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setCopyIndicator(IndicatorType value) {
        this.copyIndicator = value;
    }

    /**
     * Gets the value of the responseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setResponseDateTime(DateTimeType value) {
        this.responseDateTime = value;
    }

    /**
     * Gets the value of the itemIdentificationID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getItemIdentificationID() {
        return itemIdentificationID;
    }

    /**
     * Sets the value of the itemIdentificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setItemIdentificationID(IDType value) {
        this.itemIdentificationID = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<TextType>();
        }
        return this.remarks;
    }

    /**
     * Gets the value of the languageID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getLanguageID() {
        if (languageID == null) {
            languageID = new ArrayList<IDType>();
        }
        return this.languageID;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyCodeType }
     * 
     * 
     */
    public List<CurrencyCodeType> getCurrencyCode() {
        if (currencyCode == null) {
            currencyCode = new ArrayList<CurrencyCodeType>();
        }
        return this.currencyCode;
    }

    /**
     * Gets the value of the lineCountNumeric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineCountNumeric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineCountNumeric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumericType }
     * 
     * 
     */
    public List<NumericType> getLineCountNumeric() {
        if (lineCountNumeric == null) {
            lineCountNumeric = new ArrayList<NumericType>();
        }
        return this.lineCountNumeric;
    }

    /**
     * Gets the value of the lineID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getLineID() {
        if (lineID == null) {
            lineID = new ArrayList<IDType>();
        }
        return this.lineID;
    }

    /**
     * Gets the value of the multipleReferencesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getMultipleReferencesIndicator() {
        return multipleReferencesIndicator;
    }

    /**
     * Sets the value of the multipleReferencesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setMultipleReferencesIndicator(IndicatorType value) {
        this.multipleReferencesIndicator = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getRevision() {
        if (revision == null) {
            revision = new ArrayList<TextType>();
        }
        return this.revision;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAuthorization(TextType value) {
        this.authorization = value;
    }

    /**
     * Gets the value of the checksumNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getChecksumNumeric() {
        return checksumNumeric;
    }

    /**
     * Sets the value of the checksumNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setChecksumNumeric(NumericType value) {
        this.checksumNumeric = value;
    }

    /**
     * Gets the value of the itemQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getItemQuantity() {
        if (itemQuantity == null) {
            itemQuantity = new ArrayList<QuantityType>();
        }
        return this.itemQuantity;
    }

    /**
     * Gets the value of the acceptanceDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getAcceptanceDateTime() {
        return acceptanceDateTime;
    }

    /**
     * Sets the value of the acceptanceDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setAcceptanceDateTime(DateTimeType value) {
        this.acceptanceDateTime = value;
    }

    /**
     * Gets the value of the originalRequiredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getOriginalRequiredQuantity() {
        return originalRequiredQuantity;
    }

    /**
     * Sets the value of the originalRequiredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setOriginalRequiredQuantity(QuantityType value) {
        this.originalRequiredQuantity = value;
    }

    /**
     * Gets the value of the copyRequiredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getCopyRequiredQuantity() {
        return copyRequiredQuantity;
    }

    /**
     * Sets the value of the copyRequiredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setCopyRequiredQuantity(QuantityType value) {
        this.copyRequiredQuantity = value;
    }

    /**
     * Gets the value of the originalIssuedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getOriginalIssuedQuantity() {
        return originalIssuedQuantity;
    }

    /**
     * Sets the value of the originalIssuedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setOriginalIssuedQuantity(QuantityType value) {
        this.originalIssuedQuantity = value;
    }

    /**
     * Gets the value of the copyIssuedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getCopyIssuedQuantity() {
        return copyIssuedQuantity;
    }

    /**
     * Sets the value of the copyIssuedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setCopyIssuedQuantity(QuantityType value) {
        this.copyIssuedQuantity = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInformation(TextType value) {
        this.information = value;
    }

    /**
     * Gets the value of the authenticatedOriginalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getAuthenticatedOriginalIndicator() {
        return authenticatedOriginalIndicator;
    }

    /**
     * Sets the value of the authenticatedOriginalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setAuthenticatedOriginalIndicator(IndicatorType value) {
        this.authenticatedOriginalIndicator = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getDisposition() {
        if (disposition == null) {
            disposition = new ArrayList<TextType>();
        }
        return this.disposition;
    }

    /**
     * Gets the value of the electronicPresentationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getElectronicPresentationIndicator() {
        return electronicPresentationIndicator;
    }

    /**
     * Sets the value of the electronicPresentationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setElectronicPresentationIndicator(IndicatorType value) {
        this.electronicPresentationIndicator = value;
    }

    /**
     * Gets the value of the pageID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getPageID() {
        if (pageID == null) {
            pageID = new ArrayList<IDType>();
        }
        return this.pageID;
    }

    /**
     * Gets the value of the totalPageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getTotalPageQuantity() {
        return totalPageQuantity;
    }

    /**
     * Sets the value of the totalPageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setTotalPageQuantity(QuantityType value) {
        this.totalPageQuantity = value;
    }

    /**
     * Gets the value of the revisionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRevisionDateTime() {
        return revisionDateTime;
    }

    /**
     * Sets the value of the revisionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setRevisionDateTime(DateTimeType value) {
        this.revisionDateTime = value;
    }

    /**
     * Gets the value of the rejectionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getRejectionReason() {
        if (rejectionReason == null) {
            rejectionReason = new ArrayList<TextType>();
        }
        return this.rejectionReason;
    }

    /**
     * Gets the value of the cancellationReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellationReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellationReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getCancellationReason() {
        if (cancellationReason == null) {
            cancellationReason = new ArrayList<TextType>();
        }
        return this.cancellationReason;
    }

    /**
     * Gets the value of the cancellationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCancellationDateTime() {
        return cancellationDateTime;
    }

    /**
     * Sets the value of the cancellationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCancellationDateTime(DateTimeType value) {
        this.cancellationDateTime = value;
    }

    /**
     * Gets the value of the sequenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getSequenceID() {
        if (sequenceID == null) {
            sequenceID = new ArrayList<IDType>();
        }
        return this.sequenceID;
    }

    /**
     * Gets the value of the sectionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getSectionName() {
        if (sectionName == null) {
            sectionName = new ArrayList<TextType>();
        }
        return this.sectionName;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setExternalID(IDType value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the firstVersionIssueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getFirstVersionIssueDateTime() {
        return firstVersionIssueDateTime;
    }

    /**
     * Sets the value of the firstVersionIssueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setFirstVersionIssueDateTime(DateTimeType value) {
        this.firstVersionIssueDateTime = value;
    }

    /**
     * Gets the value of the examinedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getExaminedIndicator() {
        return examinedIndicator;
    }

    /**
     * Sets the value of the examinedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setExaminedIndicator(IndicatorType value) {
        this.examinedIndicator = value;
    }

    /**
     * Gets the value of the verifiedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getVerifiedIndicator() {
        return verifiedIndicator;
    }

    /**
     * Sets the value of the verifiedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setVerifiedIndicator(IndicatorType value) {
        this.verifiedIndicator = value;
    }

    /**
     * Gets the value of the handwrittenIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getHandwrittenIndicator() {
        return handwrittenIndicator;
    }

    /**
     * Sets the value of the handwrittenIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setHandwrittenIndicator(IndicatorType value) {
        this.handwrittenIndicator = value;
    }

    /**
     * Gets the value of the printedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getPrintedIndicator() {
        return printedIndicator;
    }

    /**
     * Sets the value of the printedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setPrintedIndicator(IndicatorType value) {
        this.printedIndicator = value;
    }

    /**
     * Gets the value of the signedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getSignedIndicator() {
        return signedIndicator;
    }

    /**
     * Sets the value of the signedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setSignedIndicator(IndicatorType value) {
        this.signedIndicator = value;
    }

    /**
     * Gets the value of the signedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getSignedDateTime() {
        return signedDateTime;
    }

    /**
     * Sets the value of the signedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setSignedDateTime(DateTimeType value) {
        this.signedDateTime = value;
    }

    /**
     * Gets the value of the requestedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRequestedDateTime() {
        return requestedDateTime;
    }

    /**
     * Sets the value of the requestedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setRequestedDateTime(DateTimeType value) {
        this.requestedDateTime = value;
    }

    /**
     * Gets the value of the signatureLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getSignatureLocation() {
        if (signatureLocation == null) {
            signatureLocation = new ArrayList<TextType>();
        }
        return this.signatureLocation;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getStatus() {
        if (status == null) {
            status = new ArrayList<TextType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the includedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getIncludedAmount() {
        if (includedAmount == null) {
            includedAmount = new ArrayList<AmountType>();
        }
        return this.includedAmount;
    }

    /**
     * Gets the value of the includedQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityType }
     * 
     * 
     */
    public List<QuantityType> getIncludedQuantity() {
        if (includedQuantity == null) {
            includedQuantity = new ArrayList<QuantityType>();
        }
        return this.includedQuantity;
    }

    /**
     * Gets the value of the rejectionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRejectionDateTime() {
        return rejectionDateTime;
    }

    /**
     * Sets the value of the rejectionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setRejectionDateTime(DateTimeType value) {
        this.rejectionDateTime = value;
    }

    /**
     * Gets the value of the specifiedAAAArchiveArchiveParameter property.
     * 
     * @return
     *     possible object is
     *     {@link AAAArchiveArchiveParameterType }
     *     
     */
    public AAAArchiveArchiveParameterType getSpecifiedAAAArchiveArchiveParameter() {
        return specifiedAAAArchiveArchiveParameter;
    }

    /**
     * Sets the value of the specifiedAAAArchiveArchiveParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAArchiveArchiveParameterType }
     *     
     */
    public void setSpecifiedAAAArchiveArchiveParameter(AAAArchiveArchiveParameterType value) {
        this.specifiedAAAArchiveArchiveParameter = value;
    }

    /**
     * Gets the value of the ownerAAAArchiveParty property.
     * 
     * @return
     *     possible object is
     *     {@link AAAArchivePartyType }
     *     
     */
    public AAAArchivePartyType getOwnerAAAArchiveParty() {
        return ownerAAAArchiveParty;
    }

    /**
     * Sets the value of the ownerAAAArchiveParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAArchivePartyType }
     *     
     */
    public void setOwnerAAAArchiveParty(AAAArchivePartyType value) {
        this.ownerAAAArchiveParty = value;
    }

    /**
     * Gets the value of the agentAAAArchiveParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentAAAArchiveParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentAAAArchiveParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchivePartyType }
     * 
     * 
     */
    public List<AAAArchivePartyType> getAgentAAAArchiveParty() {
        if (agentAAAArchiveParty == null) {
            agentAAAArchiveParty = new ArrayList<AAAArchivePartyType>();
        }
        return this.agentAAAArchiveParty;
    }

    /**
     * Gets the value of the senderAAAArchiveParty property.
     * 
     * @return
     *     possible object is
     *     {@link AAAArchivePartyType }
     *     
     */
    public AAAArchivePartyType getSenderAAAArchiveParty() {
        return senderAAAArchiveParty;
    }

    /**
     * Sets the value of the senderAAAArchiveParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAArchivePartyType }
     *     
     */
    public void setSenderAAAArchiveParty(AAAArchivePartyType value) {
        this.senderAAAArchiveParty = value;
    }

    /**
     * Gets the value of the includedAAAArchiveNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedAAAArchiveNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedAAAArchiveNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchiveNoteType }
     * 
     * 
     */
    public List<AAAArchiveNoteType> getIncludedAAAArchiveNote() {
        if (includedAAAArchiveNote == null) {
            includedAAAArchiveNote = new ArrayList<AAAArchiveNoteType>();
        }
        return this.includedAAAArchiveNote;
    }

    /**
     * Gets the value of the attachedAAAArchiveBinaryFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedAAAArchiveBinaryFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedAAAArchiveBinaryFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchiveBinaryFileType }
     * 
     * 
     */
    public List<AAAArchiveBinaryFileType> getAttachedAAAArchiveBinaryFile() {
        if (attachedAAAArchiveBinaryFile == null) {
            attachedAAAArchiveBinaryFile = new ArrayList<AAAArchiveBinaryFileType>();
        }
        return this.attachedAAAArchiveBinaryFile;
    }

    /**
     * Gets the value of the effectiveAAAPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AAAPeriodType }
     *     
     */
    public AAAPeriodType getEffectiveAAAPeriod() {
        return effectiveAAAPeriod;
    }

    /**
     * Sets the value of the effectiveAAAPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAPeriodType }
     *     
     */
    public void setEffectiveAAAPeriod(AAAPeriodType value) {
        this.effectiveAAAPeriod = value;
    }

    /**
     * Gets the value of the acceptableAAAPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AAAPeriodType }
     *     
     */
    public AAAPeriodType getAcceptableAAAPeriod() {
        return acceptableAAAPeriod;
    }

    /**
     * Sets the value of the acceptableAAAPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAPeriodType }
     *     
     */
    public void setAcceptableAAAPeriod(AAAPeriodType value) {
        this.acceptableAAAPeriod = value;
    }

    /**
     * Gets the value of the lodgementAAAArchiveLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lodgementAAAArchiveLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLodgementAAAArchiveLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchiveLocationType }
     * 
     * 
     */
    public List<AAAArchiveLocationType> getLodgementAAAArchiveLocation() {
        if (lodgementAAAArchiveLocation == null) {
            lodgementAAAArchiveLocation = new ArrayList<AAAArchiveLocationType>();
        }
        return this.lodgementAAAArchiveLocation;
    }

    /**
     * Gets the value of the issueAAAArchiveLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueAAAArchiveLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueAAAArchiveLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchiveLocationType }
     * 
     * 
     */
    public List<AAAArchiveLocationType> getIssueAAAArchiveLocation() {
        if (issueAAAArchiveLocation == null) {
            issueAAAArchiveLocation = new ArrayList<AAAArchiveLocationType>();
        }
        return this.issueAAAArchiveLocation;
    }

    /**
     * Gets the value of the contractualAAAArchiveClause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualAAAArchiveClause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualAAAArchiveClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchiveClauseType }
     * 
     * 
     */
    public List<AAAArchiveClauseType> getContractualAAAArchiveClause() {
        if (contractualAAAArchiveClause == null) {
            contractualAAAArchiveClause = new ArrayList<AAAArchiveClauseType>();
        }
        return this.contractualAAAArchiveClause;
    }

    /**
     * Gets the value of the productionAAAArchiveSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link AAAArchiveSoftwareType }
     *     
     */
    public AAAArchiveSoftwareType getProductionAAAArchiveSoftware() {
        return productionAAAArchiveSoftware;
    }

    /**
     * Sets the value of the productionAAAArchiveSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAArchiveSoftwareType }
     *     
     */
    public void setProductionAAAArchiveSoftware(AAAArchiveSoftwareType value) {
        this.productionAAAArchiveSoftware = value;
    }

    /**
     * Gets the value of the referenceAAAArchiveDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceAAAArchiveDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceAAAArchiveDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchiveDocumentType }
     * 
     * 
     */
    public List<AAAArchiveDocumentType> getReferenceAAAArchiveDocument() {
        if (referenceAAAArchiveDocument == null) {
            referenceAAAArchiveDocument = new ArrayList<AAAArchiveDocumentType>();
        }
        return this.referenceAAAArchiveDocument;
    }

    /**
     * Gets the value of the signatoryAAAArchiveAuthentication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatoryAAAArchiveAuthentication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatoryAAAArchiveAuthentication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAArchiveAuthenticationType }
     * 
     * 
     */
    public List<AAAArchiveAuthenticationType> getSignatoryAAAArchiveAuthentication() {
        if (signatoryAAAArchiveAuthentication == null) {
            signatoryAAAArchiveAuthentication = new ArrayList<AAAArchiveAuthenticationType>();
        }
        return this.signatoryAAAArchiveAuthentication;
    }

}
