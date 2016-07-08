
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.DurationUnitMeasureType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.EarnedValueCalculationMethodCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.PlanningLevelCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.ScheduleTaskTypeCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IndicatorType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.NumericType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.PercentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01001953&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Project_ Schedule Task. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A cohesive activity, collection of activities, or milestone with a definite duration or date which is required to create a deliverable within a project.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Schedule Task&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Project&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * <p>Java class for ProjectScheduleTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectScheduleTaskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType"/>
 *         &lt;element name="DataNodeID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="RiskLevelDescription" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="CalculatedCompletionPercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="AssessedCompletionPercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="PriorityRankingNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}NumericType" minOccurs="0"/>
 *         &lt;element name="EarnedValueMethodCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}EarnedValueCalculationMethodCodeType" minOccurs="0"/>
 *         &lt;element name="ScheduleLevelNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}NumericType" minOccurs="0"/>
 *         &lt;element name="FreeFloatDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="TotalFloatDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="MilestoneWeightNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}NumericType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}ScheduleTaskTypeCodeType" minOccurs="0"/>
 *         &lt;element name="TotalDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="RemainingDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="CriticalPathIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ReserveIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="CompletionDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LagTimeMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="ControlAccountID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="ScheduleLevel" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="OriginalDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="BaselineDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="BestCaseDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="MostLikelyDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="WorstCaseDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="FinishVarianceDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="StartVarianceDurationMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}DurationUnitMeasureType" minOccurs="0"/>
 *         &lt;element name="WorkPackageID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="SourceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="ProjectID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="AssociatedCostID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlanningLevelCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}PlanningLevelCodeType" minOccurs="0"/>
 *         &lt;element name="ScheduleProjectScheduleCalendar" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectScheduleCalendarType" minOccurs="0"/>
 *         &lt;element name="CurrentScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="EarliestScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" minOccurs="0"/>
 *         &lt;element name="LatestScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" minOccurs="0"/>
 *         &lt;element name="ActualScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" minOccurs="0"/>
 *         &lt;element name="TargetScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" minOccurs="0"/>
 *         &lt;element name="ResourceScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="BestCaseScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="MostLikelyScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="WorstCaseScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="EstimatedScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" minOccurs="0"/>
 *         &lt;element name="BaselineScheduledBasePeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}BasePeriodType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ReportingProjectPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectPeriodType" minOccurs="0"/>
 *         &lt;element name="RequiredProjectResourceAssignment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectResourceAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LimitingScheduleTaskTimingConstraint" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ScheduleTaskTimingConstraintType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedProjectNote" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ProjectNoteType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectScheduleTaskType", propOrder = {
    "id",
    "dataNodeID",
    "name",
    "description",
    "riskLevelDescription",
    "calculatedCompletionPercent",
    "assessedCompletionPercent",
    "priorityRankingNumeric",
    "earnedValueMethodCode",
    "scheduleLevelNumeric",
    "freeFloatDurationMeasure",
    "totalFloatDurationMeasure",
    "milestoneWeightNumeric",
    "typeCode",
    "totalDurationMeasure",
    "remainingDurationMeasure",
    "criticalPathIndicator",
    "reserveIndicator",
    "completionDateTime",
    "lagTimeMeasure",
    "controlAccountID",
    "scheduleLevel",
    "originalDurationMeasure",
    "baselineDurationMeasure",
    "bestCaseDurationMeasure",
    "mostLikelyDurationMeasure",
    "worstCaseDurationMeasure",
    "finishVarianceDurationMeasure",
    "startVarianceDurationMeasure",
    "workPackageID",
    "sourceID",
    "projectID",
    "associatedCostID",
    "planningLevelCode",
    "scheduleProjectScheduleCalendar",
    "currentScheduledBasePeriod",
    "earliestScheduledBasePeriod",
    "latestScheduledBasePeriod",
    "actualScheduledBasePeriod",
    "targetScheduledBasePeriod",
    "resourceScheduledBasePeriod",
    "bestCaseScheduledBasePeriod",
    "mostLikelyScheduledBasePeriod",
    "worstCaseScheduledBasePeriod",
    "estimatedScheduledBasePeriod",
    "baselineScheduledBasePeriod",
    "reportingProjectPeriod",
    "requiredProjectResourceAssignment",
    "limitingScheduleTaskTimingConstraint",
    "userDefinedProjectNote"
})
public class ProjectScheduleTaskType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "DataNodeID")
    protected List<IDType> dataNodeID;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "Description")
    protected TextType description;
    @XmlElement(name = "RiskLevelDescription")
    protected TextType riskLevelDescription;
    @XmlElement(name = "CalculatedCompletionPercent")
    protected PercentType calculatedCompletionPercent;
    @XmlElement(name = "AssessedCompletionPercent")
    protected PercentType assessedCompletionPercent;
    @XmlElement(name = "PriorityRankingNumeric")
    protected NumericType priorityRankingNumeric;
    @XmlElement(name = "EarnedValueMethodCode")
    protected EarnedValueCalculationMethodCodeType earnedValueMethodCode;
    @XmlElement(name = "ScheduleLevelNumeric")
    protected NumericType scheduleLevelNumeric;
    @XmlElement(name = "FreeFloatDurationMeasure")
    protected DurationUnitMeasureType freeFloatDurationMeasure;
    @XmlElement(name = "TotalFloatDurationMeasure")
    protected DurationUnitMeasureType totalFloatDurationMeasure;
    @XmlElement(name = "MilestoneWeightNumeric")
    protected NumericType milestoneWeightNumeric;
    @XmlElement(name = "TypeCode")
    protected ScheduleTaskTypeCodeType typeCode;
    @XmlElement(name = "TotalDurationMeasure")
    protected DurationUnitMeasureType totalDurationMeasure;
    @XmlElement(name = "RemainingDurationMeasure")
    protected DurationUnitMeasureType remainingDurationMeasure;
    @XmlElement(name = "CriticalPathIndicator")
    protected IndicatorType criticalPathIndicator;
    @XmlElement(name = "ReserveIndicator")
    protected IndicatorType reserveIndicator;
    @XmlElement(name = "CompletionDateTime")
    protected DateTimeType completionDateTime;
    @XmlElement(name = "LagTimeMeasure")
    protected DurationUnitMeasureType lagTimeMeasure;
    @XmlElement(name = "ControlAccountID")
    protected IDType controlAccountID;
    @XmlElement(name = "ScheduleLevel")
    protected TextType scheduleLevel;
    @XmlElement(name = "OriginalDurationMeasure")
    protected DurationUnitMeasureType originalDurationMeasure;
    @XmlElement(name = "BaselineDurationMeasure")
    protected DurationUnitMeasureType baselineDurationMeasure;
    @XmlElement(name = "BestCaseDurationMeasure")
    protected DurationUnitMeasureType bestCaseDurationMeasure;
    @XmlElement(name = "MostLikelyDurationMeasure")
    protected DurationUnitMeasureType mostLikelyDurationMeasure;
    @XmlElement(name = "WorstCaseDurationMeasure")
    protected DurationUnitMeasureType worstCaseDurationMeasure;
    @XmlElement(name = "FinishVarianceDurationMeasure")
    protected DurationUnitMeasureType finishVarianceDurationMeasure;
    @XmlElement(name = "StartVarianceDurationMeasure")
    protected DurationUnitMeasureType startVarianceDurationMeasure;
    @XmlElement(name = "WorkPackageID")
    protected IDType workPackageID;
    @XmlElement(name = "SourceID")
    protected IDType sourceID;
    @XmlElement(name = "ProjectID")
    protected IDType projectID;
    @XmlElement(name = "AssociatedCostID")
    protected List<IDType> associatedCostID;
    @XmlElement(name = "PlanningLevelCode")
    protected PlanningLevelCodeType planningLevelCode;
    @XmlElement(name = "ScheduleProjectScheduleCalendar")
    protected ProjectScheduleCalendarType scheduleProjectScheduleCalendar;
    @XmlElement(name = "CurrentScheduledBasePeriod")
    protected List<BasePeriodType> currentScheduledBasePeriod;
    @XmlElement(name = "EarliestScheduledBasePeriod")
    protected BasePeriodType earliestScheduledBasePeriod;
    @XmlElement(name = "LatestScheduledBasePeriod")
    protected BasePeriodType latestScheduledBasePeriod;
    @XmlElement(name = "ActualScheduledBasePeriod")
    protected BasePeriodType actualScheduledBasePeriod;
    @XmlElement(name = "TargetScheduledBasePeriod")
    protected BasePeriodType targetScheduledBasePeriod;
    @XmlElement(name = "ResourceScheduledBasePeriod")
    protected List<BasePeriodType> resourceScheduledBasePeriod;
    @XmlElement(name = "BestCaseScheduledBasePeriod")
    protected List<BasePeriodType> bestCaseScheduledBasePeriod;
    @XmlElement(name = "MostLikelyScheduledBasePeriod")
    protected List<BasePeriodType> mostLikelyScheduledBasePeriod;
    @XmlElement(name = "WorstCaseScheduledBasePeriod")
    protected List<BasePeriodType> worstCaseScheduledBasePeriod;
    @XmlElement(name = "EstimatedScheduledBasePeriod")
    protected BasePeriodType estimatedScheduledBasePeriod;
    @XmlElement(name = "BaselineScheduledBasePeriod")
    protected List<BasePeriodType> baselineScheduledBasePeriod;
    @XmlElement(name = "ReportingProjectPeriod")
    protected ProjectPeriodType reportingProjectPeriod;
    @XmlElement(name = "RequiredProjectResourceAssignment")
    protected List<ProjectResourceAssignmentType> requiredProjectResourceAssignment;
    @XmlElement(name = "LimitingScheduleTaskTimingConstraint")
    protected List<ScheduleTaskTimingConstraintType> limitingScheduleTaskTimingConstraint;
    @XmlElement(name = "UserDefinedProjectNote")
    protected List<ProjectNoteType> userDefinedProjectNote;

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
     * Gets the value of the dataNodeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataNodeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataNodeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getDataNodeID() {
        if (dataNodeID == null) {
            dataNodeID = new ArrayList<IDType>();
        }
        return this.dataNodeID;
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
     * Gets the value of the riskLevelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getRiskLevelDescription() {
        return riskLevelDescription;
    }

    /**
     * Sets the value of the riskLevelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setRiskLevelDescription(TextType value) {
        this.riskLevelDescription = value;
    }

    /**
     * Gets the value of the calculatedCompletionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCalculatedCompletionPercent() {
        return calculatedCompletionPercent;
    }

    /**
     * Sets the value of the calculatedCompletionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCalculatedCompletionPercent(PercentType value) {
        this.calculatedCompletionPercent = value;
    }

    /**
     * Gets the value of the assessedCompletionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getAssessedCompletionPercent() {
        return assessedCompletionPercent;
    }

    /**
     * Sets the value of the assessedCompletionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setAssessedCompletionPercent(PercentType value) {
        this.assessedCompletionPercent = value;
    }

    /**
     * Gets the value of the priorityRankingNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getPriorityRankingNumeric() {
        return priorityRankingNumeric;
    }

    /**
     * Sets the value of the priorityRankingNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setPriorityRankingNumeric(NumericType value) {
        this.priorityRankingNumeric = value;
    }

    /**
     * Gets the value of the earnedValueMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link EarnedValueCalculationMethodCodeType }
     *     
     */
    public EarnedValueCalculationMethodCodeType getEarnedValueMethodCode() {
        return earnedValueMethodCode;
    }

    /**
     * Sets the value of the earnedValueMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarnedValueCalculationMethodCodeType }
     *     
     */
    public void setEarnedValueMethodCode(EarnedValueCalculationMethodCodeType value) {
        this.earnedValueMethodCode = value;
    }

    /**
     * Gets the value of the scheduleLevelNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getScheduleLevelNumeric() {
        return scheduleLevelNumeric;
    }

    /**
     * Sets the value of the scheduleLevelNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setScheduleLevelNumeric(NumericType value) {
        this.scheduleLevelNumeric = value;
    }

    /**
     * Gets the value of the freeFloatDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getFreeFloatDurationMeasure() {
        return freeFloatDurationMeasure;
    }

    /**
     * Sets the value of the freeFloatDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setFreeFloatDurationMeasure(DurationUnitMeasureType value) {
        this.freeFloatDurationMeasure = value;
    }

    /**
     * Gets the value of the totalFloatDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getTotalFloatDurationMeasure() {
        return totalFloatDurationMeasure;
    }

    /**
     * Sets the value of the totalFloatDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setTotalFloatDurationMeasure(DurationUnitMeasureType value) {
        this.totalFloatDurationMeasure = value;
    }

    /**
     * Gets the value of the milestoneWeightNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getMilestoneWeightNumeric() {
        return milestoneWeightNumeric;
    }

    /**
     * Sets the value of the milestoneWeightNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setMilestoneWeightNumeric(NumericType value) {
        this.milestoneWeightNumeric = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleTaskTypeCodeType }
     *     
     */
    public ScheduleTaskTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleTaskTypeCodeType }
     *     
     */
    public void setTypeCode(ScheduleTaskTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the totalDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getTotalDurationMeasure() {
        return totalDurationMeasure;
    }

    /**
     * Sets the value of the totalDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setTotalDurationMeasure(DurationUnitMeasureType value) {
        this.totalDurationMeasure = value;
    }

    /**
     * Gets the value of the remainingDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getRemainingDurationMeasure() {
        return remainingDurationMeasure;
    }

    /**
     * Sets the value of the remainingDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setRemainingDurationMeasure(DurationUnitMeasureType value) {
        this.remainingDurationMeasure = value;
    }

    /**
     * Gets the value of the criticalPathIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getCriticalPathIndicator() {
        return criticalPathIndicator;
    }

    /**
     * Sets the value of the criticalPathIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setCriticalPathIndicator(IndicatorType value) {
        this.criticalPathIndicator = value;
    }

    /**
     * Gets the value of the reserveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getReserveIndicator() {
        return reserveIndicator;
    }

    /**
     * Sets the value of the reserveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setReserveIndicator(IndicatorType value) {
        this.reserveIndicator = value;
    }

    /**
     * Gets the value of the completionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCompletionDateTime() {
        return completionDateTime;
    }

    /**
     * Sets the value of the completionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCompletionDateTime(DateTimeType value) {
        this.completionDateTime = value;
    }

    /**
     * Gets the value of the lagTimeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getLagTimeMeasure() {
        return lagTimeMeasure;
    }

    /**
     * Sets the value of the lagTimeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setLagTimeMeasure(DurationUnitMeasureType value) {
        this.lagTimeMeasure = value;
    }

    /**
     * Gets the value of the controlAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getControlAccountID() {
        return controlAccountID;
    }

    /**
     * Sets the value of the controlAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setControlAccountID(IDType value) {
        this.controlAccountID = value;
    }

    /**
     * Gets the value of the scheduleLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getScheduleLevel() {
        return scheduleLevel;
    }

    /**
     * Sets the value of the scheduleLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setScheduleLevel(TextType value) {
        this.scheduleLevel = value;
    }

    /**
     * Gets the value of the originalDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getOriginalDurationMeasure() {
        return originalDurationMeasure;
    }

    /**
     * Sets the value of the originalDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setOriginalDurationMeasure(DurationUnitMeasureType value) {
        this.originalDurationMeasure = value;
    }

    /**
     * Gets the value of the baselineDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getBaselineDurationMeasure() {
        return baselineDurationMeasure;
    }

    /**
     * Sets the value of the baselineDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setBaselineDurationMeasure(DurationUnitMeasureType value) {
        this.baselineDurationMeasure = value;
    }

    /**
     * Gets the value of the bestCaseDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getBestCaseDurationMeasure() {
        return bestCaseDurationMeasure;
    }

    /**
     * Sets the value of the bestCaseDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setBestCaseDurationMeasure(DurationUnitMeasureType value) {
        this.bestCaseDurationMeasure = value;
    }

    /**
     * Gets the value of the mostLikelyDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getMostLikelyDurationMeasure() {
        return mostLikelyDurationMeasure;
    }

    /**
     * Sets the value of the mostLikelyDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setMostLikelyDurationMeasure(DurationUnitMeasureType value) {
        this.mostLikelyDurationMeasure = value;
    }

    /**
     * Gets the value of the worstCaseDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getWorstCaseDurationMeasure() {
        return worstCaseDurationMeasure;
    }

    /**
     * Sets the value of the worstCaseDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setWorstCaseDurationMeasure(DurationUnitMeasureType value) {
        this.worstCaseDurationMeasure = value;
    }

    /**
     * Gets the value of the finishVarianceDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getFinishVarianceDurationMeasure() {
        return finishVarianceDurationMeasure;
    }

    /**
     * Sets the value of the finishVarianceDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setFinishVarianceDurationMeasure(DurationUnitMeasureType value) {
        this.finishVarianceDurationMeasure = value;
    }

    /**
     * Gets the value of the startVarianceDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public DurationUnitMeasureType getStartVarianceDurationMeasure() {
        return startVarianceDurationMeasure;
    }

    /**
     * Sets the value of the startVarianceDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationUnitMeasureType }
     *     
     */
    public void setStartVarianceDurationMeasure(DurationUnitMeasureType value) {
        this.startVarianceDurationMeasure = value;
    }

    /**
     * Gets the value of the workPackageID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getWorkPackageID() {
        return workPackageID;
    }

    /**
     * Sets the value of the workPackageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setWorkPackageID(IDType value) {
        this.workPackageID = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSourceID(IDType value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the projectID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getProjectID() {
        return projectID;
    }

    /**
     * Sets the value of the projectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setProjectID(IDType value) {
        this.projectID = value;
    }

    /**
     * Gets the value of the associatedCostID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedCostID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedCostID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getAssociatedCostID() {
        if (associatedCostID == null) {
            associatedCostID = new ArrayList<IDType>();
        }
        return this.associatedCostID;
    }

    /**
     * Gets the value of the planningLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlanningLevelCodeType }
     *     
     */
    public PlanningLevelCodeType getPlanningLevelCode() {
        return planningLevelCode;
    }

    /**
     * Sets the value of the planningLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningLevelCodeType }
     *     
     */
    public void setPlanningLevelCode(PlanningLevelCodeType value) {
        this.planningLevelCode = value;
    }

    /**
     * Gets the value of the scheduleProjectScheduleCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectScheduleCalendarType }
     *     
     */
    public ProjectScheduleCalendarType getScheduleProjectScheduleCalendar() {
        return scheduleProjectScheduleCalendar;
    }

    /**
     * Sets the value of the scheduleProjectScheduleCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectScheduleCalendarType }
     *     
     */
    public void setScheduleProjectScheduleCalendar(ProjectScheduleCalendarType value) {
        this.scheduleProjectScheduleCalendar = value;
    }

    /**
     * Gets the value of the currentScheduledBasePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentScheduledBasePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentScheduledBasePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasePeriodType }
     * 
     * 
     */
    public List<BasePeriodType> getCurrentScheduledBasePeriod() {
        if (currentScheduledBasePeriod == null) {
            currentScheduledBasePeriod = new ArrayList<BasePeriodType>();
        }
        return this.currentScheduledBasePeriod;
    }

    /**
     * Gets the value of the earliestScheduledBasePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BasePeriodType }
     *     
     */
    public BasePeriodType getEarliestScheduledBasePeriod() {
        return earliestScheduledBasePeriod;
    }

    /**
     * Sets the value of the earliestScheduledBasePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePeriodType }
     *     
     */
    public void setEarliestScheduledBasePeriod(BasePeriodType value) {
        this.earliestScheduledBasePeriod = value;
    }

    /**
     * Gets the value of the latestScheduledBasePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BasePeriodType }
     *     
     */
    public BasePeriodType getLatestScheduledBasePeriod() {
        return latestScheduledBasePeriod;
    }

    /**
     * Sets the value of the latestScheduledBasePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePeriodType }
     *     
     */
    public void setLatestScheduledBasePeriod(BasePeriodType value) {
        this.latestScheduledBasePeriod = value;
    }

    /**
     * Gets the value of the actualScheduledBasePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BasePeriodType }
     *     
     */
    public BasePeriodType getActualScheduledBasePeriod() {
        return actualScheduledBasePeriod;
    }

    /**
     * Sets the value of the actualScheduledBasePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePeriodType }
     *     
     */
    public void setActualScheduledBasePeriod(BasePeriodType value) {
        this.actualScheduledBasePeriod = value;
    }

    /**
     * Gets the value of the targetScheduledBasePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BasePeriodType }
     *     
     */
    public BasePeriodType getTargetScheduledBasePeriod() {
        return targetScheduledBasePeriod;
    }

    /**
     * Sets the value of the targetScheduledBasePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePeriodType }
     *     
     */
    public void setTargetScheduledBasePeriod(BasePeriodType value) {
        this.targetScheduledBasePeriod = value;
    }

    /**
     * Gets the value of the resourceScheduledBasePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceScheduledBasePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceScheduledBasePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasePeriodType }
     * 
     * 
     */
    public List<BasePeriodType> getResourceScheduledBasePeriod() {
        if (resourceScheduledBasePeriod == null) {
            resourceScheduledBasePeriod = new ArrayList<BasePeriodType>();
        }
        return this.resourceScheduledBasePeriod;
    }

    /**
     * Gets the value of the bestCaseScheduledBasePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestCaseScheduledBasePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestCaseScheduledBasePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasePeriodType }
     * 
     * 
     */
    public List<BasePeriodType> getBestCaseScheduledBasePeriod() {
        if (bestCaseScheduledBasePeriod == null) {
            bestCaseScheduledBasePeriod = new ArrayList<BasePeriodType>();
        }
        return this.bestCaseScheduledBasePeriod;
    }

    /**
     * Gets the value of the mostLikelyScheduledBasePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mostLikelyScheduledBasePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMostLikelyScheduledBasePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasePeriodType }
     * 
     * 
     */
    public List<BasePeriodType> getMostLikelyScheduledBasePeriod() {
        if (mostLikelyScheduledBasePeriod == null) {
            mostLikelyScheduledBasePeriod = new ArrayList<BasePeriodType>();
        }
        return this.mostLikelyScheduledBasePeriod;
    }

    /**
     * Gets the value of the worstCaseScheduledBasePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worstCaseScheduledBasePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorstCaseScheduledBasePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasePeriodType }
     * 
     * 
     */
    public List<BasePeriodType> getWorstCaseScheduledBasePeriod() {
        if (worstCaseScheduledBasePeriod == null) {
            worstCaseScheduledBasePeriod = new ArrayList<BasePeriodType>();
        }
        return this.worstCaseScheduledBasePeriod;
    }

    /**
     * Gets the value of the estimatedScheduledBasePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BasePeriodType }
     *     
     */
    public BasePeriodType getEstimatedScheduledBasePeriod() {
        return estimatedScheduledBasePeriod;
    }

    /**
     * Sets the value of the estimatedScheduledBasePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasePeriodType }
     *     
     */
    public void setEstimatedScheduledBasePeriod(BasePeriodType value) {
        this.estimatedScheduledBasePeriod = value;
    }

    /**
     * Gets the value of the baselineScheduledBasePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baselineScheduledBasePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaselineScheduledBasePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasePeriodType }
     * 
     * 
     */
    public List<BasePeriodType> getBaselineScheduledBasePeriod() {
        if (baselineScheduledBasePeriod == null) {
            baselineScheduledBasePeriod = new ArrayList<BasePeriodType>();
        }
        return this.baselineScheduledBasePeriod;
    }

    /**
     * Gets the value of the reportingProjectPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectPeriodType }
     *     
     */
    public ProjectPeriodType getReportingProjectPeriod() {
        return reportingProjectPeriod;
    }

    /**
     * Sets the value of the reportingProjectPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectPeriodType }
     *     
     */
    public void setReportingProjectPeriod(ProjectPeriodType value) {
        this.reportingProjectPeriod = value;
    }

    /**
     * Gets the value of the requiredProjectResourceAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredProjectResourceAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredProjectResourceAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectResourceAssignmentType }
     * 
     * 
     */
    public List<ProjectResourceAssignmentType> getRequiredProjectResourceAssignment() {
        if (requiredProjectResourceAssignment == null) {
            requiredProjectResourceAssignment = new ArrayList<ProjectResourceAssignmentType>();
        }
        return this.requiredProjectResourceAssignment;
    }

    /**
     * Gets the value of the limitingScheduleTaskTimingConstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitingScheduleTaskTimingConstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitingScheduleTaskTimingConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScheduleTaskTimingConstraintType }
     * 
     * 
     */
    public List<ScheduleTaskTimingConstraintType> getLimitingScheduleTaskTimingConstraint() {
        if (limitingScheduleTaskTimingConstraint == null) {
            limitingScheduleTaskTimingConstraint = new ArrayList<ScheduleTaskTimingConstraintType>();
        }
        return this.limitingScheduleTaskTimingConstraint;
    }

    /**
     * Gets the value of the userDefinedProjectNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedProjectNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedProjectNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectNoteType }
     * 
     * 
     */
    public List<ProjectNoteType> getUserDefinedProjectNote() {
        if (userDefinedProjectNote == null) {
            userDefinedProjectNote = new ArrayList<ProjectNoteType>();
        }
        return this.userDefinedProjectNote;
    }

}
