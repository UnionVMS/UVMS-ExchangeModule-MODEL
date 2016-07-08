
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.ContractTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.FundingTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.SecurityClassificationTypeCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IndicatorType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.PercentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01001714&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Progress Monitored_ Contract. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An agreement between two or more parties, especially one that is written or spoken and enforceable by law and whose progress is monitored on a regular basis.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contract&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Progress Monitored&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Project Management&lt;/ccts:BusinessProcessContextValue&gt;
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
 * <p>Java class for ProgressMonitoredContractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressMonitoredContractType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FixedFeeCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="NonFeeBearingCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="CompletionPercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}ContractTypeCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FundingTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}FundingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SecurityTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}SecurityClassificationTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="IssueDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PriceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="TargetPriceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedTotalPriceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="InitialFundingTargetPriceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustedFundingTargetPriceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CeilingPriceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedCeilingPriceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="ExtensionIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="WorkStartDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="DefinitizationStartDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="TargetFeePercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="ExpectedEndDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="EstimatedEndDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="PlannedEndDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="LastItemDeliveryDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="OverTargetBaselineDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="OriginalNegotiatedCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="TargetFeeCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="NegotiatedCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="AuthorizedUnpricedWorkEstimatedCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CumulativeNegotiatedChangesCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumAwardFeeCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumAwardFeeCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="OriginalAwardFeeCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentTargetCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAllocatedBudgetCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="InitialFundingCeilingCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustedFundingCeilingCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="FiscalFundingYearDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="PlanID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="ValidityProjectPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IdentifiedContractorParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ContractorPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IdentifiedAppropriatingParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AppropriatingPartyType" minOccurs="0"/>
 *         &lt;element name="ReferenceProjectDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FundsAuthorizationReferenceProjectDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectDocumentType" minOccurs="0"/>
 *         &lt;element name="AppropriationEffectiveProjectPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectPeriodType" minOccurs="0"/>
 *         &lt;element name="EffectiveProjectPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ModificationAwardedContractChange" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AwardedContractChangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociatedProjectCost" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BestCaseEstimateAtCompletionAssociatedProjectCost" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BudgetBaselineAssociatedProjectCost" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostLikelyEstimateAtCompletionAssociatedProjectCost" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WorstCaseEstimateAtCompletionAssociatedProjectCost" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectCostType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalSpecifiedProgramme" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}SpecifiedProgrammeType" minOccurs="0"/>
 *         &lt;element name="ContainedProgressMonitoredProjectPortfolio" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProgressMonitoredProjectPortfolioType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncentiveContractPerformanceMeasurement" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ContractPerformanceMeasurementType" minOccurs="0"/>
 *         &lt;element name="ContainedProgressMonitoredProject" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProgressMonitoredProjectType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecifiedProjectContractLineItem" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectContractLineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressMonitoredContractType", propOrder = {
    "fixedFeeCostAmount",
    "nonFeeBearingCostAmount",
    "id",
    "completionPercent",
    "typeCode",
    "fundingTypeCode",
    "securityTypeCode",
    "name",
    "description",
    "issueDateTime",
    "priceAmount",
    "targetPriceAmount",
    "estimatedTotalPriceAmount",
    "initialFundingTargetPriceAmount",
    "adjustedFundingTargetPriceAmount",
    "ceilingPriceAmount",
    "estimatedCeilingPriceAmount",
    "extensionIndicator",
    "startDate",
    "workStartDate",
    "definitizationStartDate",
    "targetFeePercent",
    "expectedEndDate",
    "estimatedEndDate",
    "plannedEndDate",
    "lastItemDeliveryDate",
    "overTargetBaselineDate",
    "originalNegotiatedCostAmount",
    "targetFeeCostAmount",
    "negotiatedCostAmount",
    "authorizedUnpricedWorkEstimatedCostAmount",
    "cumulativeNegotiatedChangesCostAmount",
    "minimumAwardFeeCostAmount",
    "maximumAwardFeeCostAmount",
    "originalAwardFeeCostAmount",
    "currentTargetCostAmount",
    "totalAllocatedBudgetCostAmount",
    "initialFundingCeilingCostAmount",
    "adjustedFundingCeilingCostAmount",
    "fiscalFundingYearDateTime",
    "customerName",
    "planID",
    "validityProjectPeriod",
    "identifiedContractorParty",
    "identifiedAppropriatingParty",
    "referenceProjectDocument",
    "fundsAuthorizationReferenceProjectDocument",
    "appropriationEffectiveProjectPeriod",
    "effectiveProjectPeriod",
    "modificationAwardedContractChange",
    "associatedProjectCost",
    "bestCaseEstimateAtCompletionAssociatedProjectCost",
    "budgetBaselineAssociatedProjectCost",
    "mostLikelyEstimateAtCompletionAssociatedProjectCost",
    "worstCaseEstimateAtCompletionAssociatedProjectCost",
    "principalSpecifiedProgramme",
    "containedProgressMonitoredProjectPortfolio",
    "incentiveContractPerformanceMeasurement",
    "containedProgressMonitoredProject",
    "specifiedProjectContractLineItem"
})
public class ProgressMonitoredContractType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FixedFeeCostAmount")
    protected AmountType fixedFeeCostAmount;
    @XmlElement(name = "NonFeeBearingCostAmount")
    protected AmountType nonFeeBearingCostAmount;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "CompletionPercent")
    protected PercentType completionPercent;
    @XmlElement(name = "TypeCode")
    protected List<ContractTypeCodeType> typeCode;
    @XmlElement(name = "FundingTypeCode")
    protected FundingTypeCodeType fundingTypeCode;
    @XmlElement(name = "SecurityTypeCode")
    protected SecurityClassificationTypeCodeType securityTypeCode;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "Description")
    protected TextType description;
    @XmlElement(name = "IssueDateTime")
    protected DateTimeType issueDateTime;
    @XmlElement(name = "PriceAmount")
    protected AmountType priceAmount;
    @XmlElement(name = "TargetPriceAmount")
    protected AmountType targetPriceAmount;
    @XmlElement(name = "EstimatedTotalPriceAmount")
    protected AmountType estimatedTotalPriceAmount;
    @XmlElement(name = "InitialFundingTargetPriceAmount")
    protected AmountType initialFundingTargetPriceAmount;
    @XmlElement(name = "AdjustedFundingTargetPriceAmount")
    protected AmountType adjustedFundingTargetPriceAmount;
    @XmlElement(name = "CeilingPriceAmount")
    protected AmountType ceilingPriceAmount;
    @XmlElement(name = "EstimatedCeilingPriceAmount")
    protected AmountType estimatedCeilingPriceAmount;
    @XmlElement(name = "ExtensionIndicator")
    protected IndicatorType extensionIndicator;
    @XmlElement(name = "StartDate")
    protected DateType startDate;
    @XmlElement(name = "WorkStartDate")
    protected DateType workStartDate;
    @XmlElement(name = "DefinitizationStartDate")
    protected DateType definitizationStartDate;
    @XmlElement(name = "TargetFeePercent")
    protected PercentType targetFeePercent;
    @XmlElement(name = "ExpectedEndDate")
    protected DateType expectedEndDate;
    @XmlElement(name = "EstimatedEndDate")
    protected DateType estimatedEndDate;
    @XmlElement(name = "PlannedEndDate")
    protected DateType plannedEndDate;
    @XmlElement(name = "LastItemDeliveryDate")
    protected DateType lastItemDeliveryDate;
    @XmlElement(name = "OverTargetBaselineDate")
    protected DateType overTargetBaselineDate;
    @XmlElement(name = "OriginalNegotiatedCostAmount")
    protected AmountType originalNegotiatedCostAmount;
    @XmlElement(name = "TargetFeeCostAmount")
    protected AmountType targetFeeCostAmount;
    @XmlElement(name = "NegotiatedCostAmount")
    protected AmountType negotiatedCostAmount;
    @XmlElement(name = "AuthorizedUnpricedWorkEstimatedCostAmount")
    protected AmountType authorizedUnpricedWorkEstimatedCostAmount;
    @XmlElement(name = "CumulativeNegotiatedChangesCostAmount")
    protected AmountType cumulativeNegotiatedChangesCostAmount;
    @XmlElement(name = "MinimumAwardFeeCostAmount")
    protected AmountType minimumAwardFeeCostAmount;
    @XmlElement(name = "MaximumAwardFeeCostAmount")
    protected AmountType maximumAwardFeeCostAmount;
    @XmlElement(name = "OriginalAwardFeeCostAmount")
    protected AmountType originalAwardFeeCostAmount;
    @XmlElement(name = "CurrentTargetCostAmount")
    protected AmountType currentTargetCostAmount;
    @XmlElement(name = "TotalAllocatedBudgetCostAmount")
    protected AmountType totalAllocatedBudgetCostAmount;
    @XmlElement(name = "InitialFundingCeilingCostAmount")
    protected AmountType initialFundingCeilingCostAmount;
    @XmlElement(name = "AdjustedFundingCeilingCostAmount")
    protected AmountType adjustedFundingCeilingCostAmount;
    @XmlElement(name = "FiscalFundingYearDateTime")
    protected List<DateTimeType> fiscalFundingYearDateTime;
    @XmlElement(name = "CustomerName")
    protected TextType customerName;
    @XmlElement(name = "PlanID")
    protected IDType planID;
    @XmlElement(name = "ValidityProjectPeriod")
    protected List<ProjectPeriodType> validityProjectPeriod;
    @XmlElement(name = "IdentifiedContractorParty")
    protected List<ContractorPartyType> identifiedContractorParty;
    @XmlElement(name = "IdentifiedAppropriatingParty")
    protected AppropriatingPartyType identifiedAppropriatingParty;
    @XmlElement(name = "ReferenceProjectDocument")
    protected List<ProjectDocumentType> referenceProjectDocument;
    @XmlElement(name = "FundsAuthorizationReferenceProjectDocument")
    protected ProjectDocumentType fundsAuthorizationReferenceProjectDocument;
    @XmlElement(name = "AppropriationEffectiveProjectPeriod")
    protected ProjectPeriodType appropriationEffectiveProjectPeriod;
    @XmlElement(name = "EffectiveProjectPeriod")
    protected List<ProjectPeriodType> effectiveProjectPeriod;
    @XmlElement(name = "ModificationAwardedContractChange")
    protected List<AwardedContractChangeType> modificationAwardedContractChange;
    @XmlElement(name = "AssociatedProjectCost")
    protected List<ProjectCostType> associatedProjectCost;
    @XmlElement(name = "BestCaseEstimateAtCompletionAssociatedProjectCost")
    protected List<ProjectCostType> bestCaseEstimateAtCompletionAssociatedProjectCost;
    @XmlElement(name = "BudgetBaselineAssociatedProjectCost")
    protected List<ProjectCostType> budgetBaselineAssociatedProjectCost;
    @XmlElement(name = "MostLikelyEstimateAtCompletionAssociatedProjectCost")
    protected List<ProjectCostType> mostLikelyEstimateAtCompletionAssociatedProjectCost;
    @XmlElement(name = "WorstCaseEstimateAtCompletionAssociatedProjectCost")
    protected List<ProjectCostType> worstCaseEstimateAtCompletionAssociatedProjectCost;
    @XmlElement(name = "PrincipalSpecifiedProgramme")
    protected SpecifiedProgrammeType principalSpecifiedProgramme;
    @XmlElement(name = "ContainedProgressMonitoredProjectPortfolio")
    protected List<ProgressMonitoredProjectPortfolioType> containedProgressMonitoredProjectPortfolio;
    @XmlElement(name = "IncentiveContractPerformanceMeasurement")
    protected ContractPerformanceMeasurementType incentiveContractPerformanceMeasurement;
    @XmlElement(name = "ContainedProgressMonitoredProject")
    protected List<ProgressMonitoredProjectType> containedProgressMonitoredProject;
    @XmlElement(name = "SpecifiedProjectContractLineItem")
    protected List<ProjectContractLineItemType> specifiedProjectContractLineItem;

    /**
     * Gets the value of the fixedFeeCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedFeeCostAmount() {
        return fixedFeeCostAmount;
    }

    /**
     * Sets the value of the fixedFeeCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedFeeCostAmount(AmountType value) {
        this.fixedFeeCostAmount = value;
    }

    /**
     * Gets the value of the nonFeeBearingCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonFeeBearingCostAmount() {
        return nonFeeBearingCostAmount;
    }

    /**
     * Sets the value of the nonFeeBearingCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonFeeBearingCostAmount(AmountType value) {
        this.nonFeeBearingCostAmount = value;
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
     * Gets the value of the completionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCompletionPercent() {
        return completionPercent;
    }

    /**
     * Sets the value of the completionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCompletionPercent(PercentType value) {
        this.completionPercent = value;
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
     * {@link ContractTypeCodeType }
     * 
     * 
     */
    public List<ContractTypeCodeType> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<ContractTypeCodeType>();
        }
        return this.typeCode;
    }

    /**
     * Gets the value of the fundingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundingTypeCodeType }
     *     
     */
    public FundingTypeCodeType getFundingTypeCode() {
        return fundingTypeCode;
    }

    /**
     * Sets the value of the fundingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingTypeCodeType }
     *     
     */
    public void setFundingTypeCode(FundingTypeCodeType value) {
        this.fundingTypeCode = value;
    }

    /**
     * Gets the value of the securityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationTypeCodeType }
     *     
     */
    public SecurityClassificationTypeCodeType getSecurityTypeCode() {
        return securityTypeCode;
    }

    /**
     * Sets the value of the securityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationTypeCodeType }
     *     
     */
    public void setSecurityTypeCode(SecurityClassificationTypeCodeType value) {
        this.securityTypeCode = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescription(TextType value) {
        this.description = value;
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
     * Gets the value of the priceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPriceAmount() {
        return priceAmount;
    }

    /**
     * Sets the value of the priceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPriceAmount(AmountType value) {
        this.priceAmount = value;
    }

    /**
     * Gets the value of the targetPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTargetPriceAmount() {
        return targetPriceAmount;
    }

    /**
     * Sets the value of the targetPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTargetPriceAmount(AmountType value) {
        this.targetPriceAmount = value;
    }

    /**
     * Gets the value of the estimatedTotalPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedTotalPriceAmount() {
        return estimatedTotalPriceAmount;
    }

    /**
     * Sets the value of the estimatedTotalPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedTotalPriceAmount(AmountType value) {
        this.estimatedTotalPriceAmount = value;
    }

    /**
     * Gets the value of the initialFundingTargetPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInitialFundingTargetPriceAmount() {
        return initialFundingTargetPriceAmount;
    }

    /**
     * Sets the value of the initialFundingTargetPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInitialFundingTargetPriceAmount(AmountType value) {
        this.initialFundingTargetPriceAmount = value;
    }

    /**
     * Gets the value of the adjustedFundingTargetPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustedFundingTargetPriceAmount() {
        return adjustedFundingTargetPriceAmount;
    }

    /**
     * Sets the value of the adjustedFundingTargetPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustedFundingTargetPriceAmount(AmountType value) {
        this.adjustedFundingTargetPriceAmount = value;
    }

    /**
     * Gets the value of the ceilingPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCeilingPriceAmount() {
        return ceilingPriceAmount;
    }

    /**
     * Sets the value of the ceilingPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCeilingPriceAmount(AmountType value) {
        this.ceilingPriceAmount = value;
    }

    /**
     * Gets the value of the estimatedCeilingPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedCeilingPriceAmount() {
        return estimatedCeilingPriceAmount;
    }

    /**
     * Sets the value of the estimatedCeilingPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedCeilingPriceAmount(AmountType value) {
        this.estimatedCeilingPriceAmount = value;
    }

    /**
     * Gets the value of the extensionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getExtensionIndicator() {
        return extensionIndicator;
    }

    /**
     * Sets the value of the extensionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setExtensionIndicator(IndicatorType value) {
        this.extensionIndicator = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setStartDate(DateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the workStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getWorkStartDate() {
        return workStartDate;
    }

    /**
     * Sets the value of the workStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setWorkStartDate(DateType value) {
        this.workStartDate = value;
    }

    /**
     * Gets the value of the definitizationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDefinitizationStartDate() {
        return definitizationStartDate;
    }

    /**
     * Sets the value of the definitizationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDefinitizationStartDate(DateType value) {
        this.definitizationStartDate = value;
    }

    /**
     * Gets the value of the targetFeePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getTargetFeePercent() {
        return targetFeePercent;
    }

    /**
     * Sets the value of the targetFeePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setTargetFeePercent(PercentType value) {
        this.targetFeePercent = value;
    }

    /**
     * Gets the value of the expectedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getExpectedEndDate() {
        return expectedEndDate;
    }

    /**
     * Sets the value of the expectedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setExpectedEndDate(DateType value) {
        this.expectedEndDate = value;
    }

    /**
     * Gets the value of the estimatedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEstimatedEndDate() {
        return estimatedEndDate;
    }

    /**
     * Sets the value of the estimatedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEstimatedEndDate(DateType value) {
        this.estimatedEndDate = value;
    }

    /**
     * Gets the value of the plannedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getPlannedEndDate() {
        return plannedEndDate;
    }

    /**
     * Sets the value of the plannedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setPlannedEndDate(DateType value) {
        this.plannedEndDate = value;
    }

    /**
     * Gets the value of the lastItemDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastItemDeliveryDate() {
        return lastItemDeliveryDate;
    }

    /**
     * Sets the value of the lastItemDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastItemDeliveryDate(DateType value) {
        this.lastItemDeliveryDate = value;
    }

    /**
     * Gets the value of the overTargetBaselineDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getOverTargetBaselineDate() {
        return overTargetBaselineDate;
    }

    /**
     * Sets the value of the overTargetBaselineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setOverTargetBaselineDate(DateType value) {
        this.overTargetBaselineDate = value;
    }

    /**
     * Gets the value of the originalNegotiatedCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalNegotiatedCostAmount() {
        return originalNegotiatedCostAmount;
    }

    /**
     * Sets the value of the originalNegotiatedCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalNegotiatedCostAmount(AmountType value) {
        this.originalNegotiatedCostAmount = value;
    }

    /**
     * Gets the value of the targetFeeCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTargetFeeCostAmount() {
        return targetFeeCostAmount;
    }

    /**
     * Sets the value of the targetFeeCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTargetFeeCostAmount(AmountType value) {
        this.targetFeeCostAmount = value;
    }

    /**
     * Gets the value of the negotiatedCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNegotiatedCostAmount() {
        return negotiatedCostAmount;
    }

    /**
     * Sets the value of the negotiatedCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNegotiatedCostAmount(AmountType value) {
        this.negotiatedCostAmount = value;
    }

    /**
     * Gets the value of the authorizedUnpricedWorkEstimatedCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuthorizedUnpricedWorkEstimatedCostAmount() {
        return authorizedUnpricedWorkEstimatedCostAmount;
    }

    /**
     * Sets the value of the authorizedUnpricedWorkEstimatedCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuthorizedUnpricedWorkEstimatedCostAmount(AmountType value) {
        this.authorizedUnpricedWorkEstimatedCostAmount = value;
    }

    /**
     * Gets the value of the cumulativeNegotiatedChangesCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCumulativeNegotiatedChangesCostAmount() {
        return cumulativeNegotiatedChangesCostAmount;
    }

    /**
     * Sets the value of the cumulativeNegotiatedChangesCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCumulativeNegotiatedChangesCostAmount(AmountType value) {
        this.cumulativeNegotiatedChangesCostAmount = value;
    }

    /**
     * Gets the value of the minimumAwardFeeCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumAwardFeeCostAmount() {
        return minimumAwardFeeCostAmount;
    }

    /**
     * Sets the value of the minimumAwardFeeCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumAwardFeeCostAmount(AmountType value) {
        this.minimumAwardFeeCostAmount = value;
    }

    /**
     * Gets the value of the maximumAwardFeeCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumAwardFeeCostAmount() {
        return maximumAwardFeeCostAmount;
    }

    /**
     * Sets the value of the maximumAwardFeeCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumAwardFeeCostAmount(AmountType value) {
        this.maximumAwardFeeCostAmount = value;
    }

    /**
     * Gets the value of the originalAwardFeeCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalAwardFeeCostAmount() {
        return originalAwardFeeCostAmount;
    }

    /**
     * Sets the value of the originalAwardFeeCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalAwardFeeCostAmount(AmountType value) {
        this.originalAwardFeeCostAmount = value;
    }

    /**
     * Gets the value of the currentTargetCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentTargetCostAmount() {
        return currentTargetCostAmount;
    }

    /**
     * Sets the value of the currentTargetCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentTargetCostAmount(AmountType value) {
        this.currentTargetCostAmount = value;
    }

    /**
     * Gets the value of the totalAllocatedBudgetCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAllocatedBudgetCostAmount() {
        return totalAllocatedBudgetCostAmount;
    }

    /**
     * Sets the value of the totalAllocatedBudgetCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAllocatedBudgetCostAmount(AmountType value) {
        this.totalAllocatedBudgetCostAmount = value;
    }

    /**
     * Gets the value of the initialFundingCeilingCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInitialFundingCeilingCostAmount() {
        return initialFundingCeilingCostAmount;
    }

    /**
     * Sets the value of the initialFundingCeilingCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInitialFundingCeilingCostAmount(AmountType value) {
        this.initialFundingCeilingCostAmount = value;
    }

    /**
     * Gets the value of the adjustedFundingCeilingCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustedFundingCeilingCostAmount() {
        return adjustedFundingCeilingCostAmount;
    }

    /**
     * Sets the value of the adjustedFundingCeilingCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustedFundingCeilingCostAmount(AmountType value) {
        this.adjustedFundingCeilingCostAmount = value;
    }

    /**
     * Gets the value of the fiscalFundingYearDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiscalFundingYearDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiscalFundingYearDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimeType }
     * 
     * 
     */
    public List<DateTimeType> getFiscalFundingYearDateTime() {
        if (fiscalFundingYearDateTime == null) {
            fiscalFundingYearDateTime = new ArrayList<DateTimeType>();
        }
        return this.fiscalFundingYearDateTime;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCustomerName(TextType value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the planID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPlanID() {
        return planID;
    }

    /**
     * Sets the value of the planID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPlanID(IDType value) {
        this.planID = value;
    }

    /**
     * Gets the value of the validityProjectPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityProjectPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityProjectPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectPeriodType }
     * 
     * 
     */
    public List<ProjectPeriodType> getValidityProjectPeriod() {
        if (validityProjectPeriod == null) {
            validityProjectPeriod = new ArrayList<ProjectPeriodType>();
        }
        return this.validityProjectPeriod;
    }

    /**
     * Gets the value of the identifiedContractorParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiedContractorParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiedContractorParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractorPartyType }
     * 
     * 
     */
    public List<ContractorPartyType> getIdentifiedContractorParty() {
        if (identifiedContractorParty == null) {
            identifiedContractorParty = new ArrayList<ContractorPartyType>();
        }
        return this.identifiedContractorParty;
    }

    /**
     * Gets the value of the identifiedAppropriatingParty property.
     * 
     * @return
     *     possible object is
     *     {@link AppropriatingPartyType }
     *     
     */
    public AppropriatingPartyType getIdentifiedAppropriatingParty() {
        return identifiedAppropriatingParty;
    }

    /**
     * Sets the value of the identifiedAppropriatingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppropriatingPartyType }
     *     
     */
    public void setIdentifiedAppropriatingParty(AppropriatingPartyType value) {
        this.identifiedAppropriatingParty = value;
    }

    /**
     * Gets the value of the referenceProjectDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceProjectDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceProjectDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectDocumentType }
     * 
     * 
     */
    public List<ProjectDocumentType> getReferenceProjectDocument() {
        if (referenceProjectDocument == null) {
            referenceProjectDocument = new ArrayList<ProjectDocumentType>();
        }
        return this.referenceProjectDocument;
    }

    /**
     * Gets the value of the fundsAuthorizationReferenceProjectDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectDocumentType }
     *     
     */
    public ProjectDocumentType getFundsAuthorizationReferenceProjectDocument() {
        return fundsAuthorizationReferenceProjectDocument;
    }

    /**
     * Sets the value of the fundsAuthorizationReferenceProjectDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectDocumentType }
     *     
     */
    public void setFundsAuthorizationReferenceProjectDocument(ProjectDocumentType value) {
        this.fundsAuthorizationReferenceProjectDocument = value;
    }

    /**
     * Gets the value of the appropriationEffectiveProjectPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectPeriodType }
     *     
     */
    public ProjectPeriodType getAppropriationEffectiveProjectPeriod() {
        return appropriationEffectiveProjectPeriod;
    }

    /**
     * Sets the value of the appropriationEffectiveProjectPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectPeriodType }
     *     
     */
    public void setAppropriationEffectiveProjectPeriod(ProjectPeriodType value) {
        this.appropriationEffectiveProjectPeriod = value;
    }

    /**
     * Gets the value of the effectiveProjectPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveProjectPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveProjectPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectPeriodType }
     * 
     * 
     */
    public List<ProjectPeriodType> getEffectiveProjectPeriod() {
        if (effectiveProjectPeriod == null) {
            effectiveProjectPeriod = new ArrayList<ProjectPeriodType>();
        }
        return this.effectiveProjectPeriod;
    }

    /**
     * Gets the value of the modificationAwardedContractChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modificationAwardedContractChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModificationAwardedContractChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardedContractChangeType }
     * 
     * 
     */
    public List<AwardedContractChangeType> getModificationAwardedContractChange() {
        if (modificationAwardedContractChange == null) {
            modificationAwardedContractChange = new ArrayList<AwardedContractChangeType>();
        }
        return this.modificationAwardedContractChange;
    }

    /**
     * Gets the value of the associatedProjectCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedProjectCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedProjectCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectCostType }
     * 
     * 
     */
    public List<ProjectCostType> getAssociatedProjectCost() {
        if (associatedProjectCost == null) {
            associatedProjectCost = new ArrayList<ProjectCostType>();
        }
        return this.associatedProjectCost;
    }

    /**
     * Gets the value of the bestCaseEstimateAtCompletionAssociatedProjectCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestCaseEstimateAtCompletionAssociatedProjectCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestCaseEstimateAtCompletionAssociatedProjectCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectCostType }
     * 
     * 
     */
    public List<ProjectCostType> getBestCaseEstimateAtCompletionAssociatedProjectCost() {
        if (bestCaseEstimateAtCompletionAssociatedProjectCost == null) {
            bestCaseEstimateAtCompletionAssociatedProjectCost = new ArrayList<ProjectCostType>();
        }
        return this.bestCaseEstimateAtCompletionAssociatedProjectCost;
    }

    /**
     * Gets the value of the budgetBaselineAssociatedProjectCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetBaselineAssociatedProjectCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetBaselineAssociatedProjectCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectCostType }
     * 
     * 
     */
    public List<ProjectCostType> getBudgetBaselineAssociatedProjectCost() {
        if (budgetBaselineAssociatedProjectCost == null) {
            budgetBaselineAssociatedProjectCost = new ArrayList<ProjectCostType>();
        }
        return this.budgetBaselineAssociatedProjectCost;
    }

    /**
     * Gets the value of the mostLikelyEstimateAtCompletionAssociatedProjectCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mostLikelyEstimateAtCompletionAssociatedProjectCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMostLikelyEstimateAtCompletionAssociatedProjectCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectCostType }
     * 
     * 
     */
    public List<ProjectCostType> getMostLikelyEstimateAtCompletionAssociatedProjectCost() {
        if (mostLikelyEstimateAtCompletionAssociatedProjectCost == null) {
            mostLikelyEstimateAtCompletionAssociatedProjectCost = new ArrayList<ProjectCostType>();
        }
        return this.mostLikelyEstimateAtCompletionAssociatedProjectCost;
    }

    /**
     * Gets the value of the worstCaseEstimateAtCompletionAssociatedProjectCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worstCaseEstimateAtCompletionAssociatedProjectCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorstCaseEstimateAtCompletionAssociatedProjectCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectCostType }
     * 
     * 
     */
    public List<ProjectCostType> getWorstCaseEstimateAtCompletionAssociatedProjectCost() {
        if (worstCaseEstimateAtCompletionAssociatedProjectCost == null) {
            worstCaseEstimateAtCompletionAssociatedProjectCost = new ArrayList<ProjectCostType>();
        }
        return this.worstCaseEstimateAtCompletionAssociatedProjectCost;
    }

    /**
     * Gets the value of the principalSpecifiedProgramme property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedProgrammeType }
     *     
     */
    public SpecifiedProgrammeType getPrincipalSpecifiedProgramme() {
        return principalSpecifiedProgramme;
    }

    /**
     * Sets the value of the principalSpecifiedProgramme property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedProgrammeType }
     *     
     */
    public void setPrincipalSpecifiedProgramme(SpecifiedProgrammeType value) {
        this.principalSpecifiedProgramme = value;
    }

    /**
     * Gets the value of the containedProgressMonitoredProjectPortfolio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedProgressMonitoredProjectPortfolio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedProgressMonitoredProjectPortfolio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgressMonitoredProjectPortfolioType }
     * 
     * 
     */
    public List<ProgressMonitoredProjectPortfolioType> getContainedProgressMonitoredProjectPortfolio() {
        if (containedProgressMonitoredProjectPortfolio == null) {
            containedProgressMonitoredProjectPortfolio = new ArrayList<ProgressMonitoredProjectPortfolioType>();
        }
        return this.containedProgressMonitoredProjectPortfolio;
    }

    /**
     * Gets the value of the incentiveContractPerformanceMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link ContractPerformanceMeasurementType }
     *     
     */
    public ContractPerformanceMeasurementType getIncentiveContractPerformanceMeasurement() {
        return incentiveContractPerformanceMeasurement;
    }

    /**
     * Sets the value of the incentiveContractPerformanceMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractPerformanceMeasurementType }
     *     
     */
    public void setIncentiveContractPerformanceMeasurement(ContractPerformanceMeasurementType value) {
        this.incentiveContractPerformanceMeasurement = value;
    }

    /**
     * Gets the value of the containedProgressMonitoredProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedProgressMonitoredProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedProgressMonitoredProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgressMonitoredProjectType }
     * 
     * 
     */
    public List<ProgressMonitoredProjectType> getContainedProgressMonitoredProject() {
        if (containedProgressMonitoredProject == null) {
            containedProgressMonitoredProject = new ArrayList<ProgressMonitoredProjectType>();
        }
        return this.containedProgressMonitoredProject;
    }

    /**
     * Gets the value of the specifiedProjectContractLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedProjectContractLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedProjectContractLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectContractLineItemType }
     * 
     * 
     */
    public List<ProjectContractLineItemType> getSpecifiedProjectContractLineItem() {
        if (specifiedProjectContractLineItem == null) {
            specifiedProjectContractLineItem = new ArrayList<ProjectContractLineItemType>();
        }
        return this.specifiedProjectContractLineItem;
    }

}
