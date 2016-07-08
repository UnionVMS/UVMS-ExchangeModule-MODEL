
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.CostReportingCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.ReportingThresholdTriggerTypeCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.PercentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01002052&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Variance_ Reporting Threshold. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A trigger point for initiating a reporting action about variances.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Reporting Threshold&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Variance&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * <p>Java class for VarianceReportingThresholdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarianceReportingThresholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="TriggerTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}ReportingThresholdTriggerTypeCodeType" minOccurs="0"/>
 *         &lt;element name="CostReportingCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CostReportingCodeType" minOccurs="0"/>
 *         &lt;element name="CurrentCostMinimumVarianceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentScheduleMinimumVarianceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CumulativeScheduleMinimumVarianceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CumulativeCostMinimumVarianceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="AtCompleteMinimumVarianceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentCostMinimumVariancePercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="CurrentScheduleMinimumVariancePercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="CumulativeCostMinimumVariancePercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="CumulativeScheduleMinimumVariancePercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="AtCompleteMinimumVariancePercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="AppliedReportingDataNode" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}ReportingDataNodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarianceReportingThresholdType", propOrder = {
    "id",
    "name",
    "description",
    "triggerTypeCode",
    "costReportingCode",
    "currentCostMinimumVarianceAmount",
    "currentScheduleMinimumVarianceAmount",
    "cumulativeScheduleMinimumVarianceAmount",
    "cumulativeCostMinimumVarianceAmount",
    "atCompleteMinimumVarianceAmount",
    "currentCostMinimumVariancePercent",
    "currentScheduleMinimumVariancePercent",
    "cumulativeCostMinimumVariancePercent",
    "cumulativeScheduleMinimumVariancePercent",
    "atCompleteMinimumVariancePercent",
    "appliedReportingDataNode"
})
public class VarianceReportingThresholdType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID", required = true)
    protected IDType id;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "Description")
    protected TextType description;
    @XmlElement(name = "TriggerTypeCode")
    protected ReportingThresholdTriggerTypeCodeType triggerTypeCode;
    @XmlElement(name = "CostReportingCode")
    protected CostReportingCodeType costReportingCode;
    @XmlElement(name = "CurrentCostMinimumVarianceAmount")
    protected AmountType currentCostMinimumVarianceAmount;
    @XmlElement(name = "CurrentScheduleMinimumVarianceAmount")
    protected AmountType currentScheduleMinimumVarianceAmount;
    @XmlElement(name = "CumulativeScheduleMinimumVarianceAmount")
    protected AmountType cumulativeScheduleMinimumVarianceAmount;
    @XmlElement(name = "CumulativeCostMinimumVarianceAmount")
    protected AmountType cumulativeCostMinimumVarianceAmount;
    @XmlElement(name = "AtCompleteMinimumVarianceAmount")
    protected AmountType atCompleteMinimumVarianceAmount;
    @XmlElement(name = "CurrentCostMinimumVariancePercent")
    protected PercentType currentCostMinimumVariancePercent;
    @XmlElement(name = "CurrentScheduleMinimumVariancePercent")
    protected PercentType currentScheduleMinimumVariancePercent;
    @XmlElement(name = "CumulativeCostMinimumVariancePercent")
    protected PercentType cumulativeCostMinimumVariancePercent;
    @XmlElement(name = "CumulativeScheduleMinimumVariancePercent")
    protected PercentType cumulativeScheduleMinimumVariancePercent;
    @XmlElement(name = "AtCompleteMinimumVariancePercent")
    protected PercentType atCompleteMinimumVariancePercent;
    @XmlElement(name = "AppliedReportingDataNode")
    protected List<ReportingDataNodeType> appliedReportingDataNode;

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
     * Gets the value of the triggerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingThresholdTriggerTypeCodeType }
     *     
     */
    public ReportingThresholdTriggerTypeCodeType getTriggerTypeCode() {
        return triggerTypeCode;
    }

    /**
     * Sets the value of the triggerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingThresholdTriggerTypeCodeType }
     *     
     */
    public void setTriggerTypeCode(ReportingThresholdTriggerTypeCodeType value) {
        this.triggerTypeCode = value;
    }

    /**
     * Gets the value of the costReportingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CostReportingCodeType }
     *     
     */
    public CostReportingCodeType getCostReportingCode() {
        return costReportingCode;
    }

    /**
     * Sets the value of the costReportingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostReportingCodeType }
     *     
     */
    public void setCostReportingCode(CostReportingCodeType value) {
        this.costReportingCode = value;
    }

    /**
     * Gets the value of the currentCostMinimumVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentCostMinimumVarianceAmount() {
        return currentCostMinimumVarianceAmount;
    }

    /**
     * Sets the value of the currentCostMinimumVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentCostMinimumVarianceAmount(AmountType value) {
        this.currentCostMinimumVarianceAmount = value;
    }

    /**
     * Gets the value of the currentScheduleMinimumVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentScheduleMinimumVarianceAmount() {
        return currentScheduleMinimumVarianceAmount;
    }

    /**
     * Sets the value of the currentScheduleMinimumVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentScheduleMinimumVarianceAmount(AmountType value) {
        this.currentScheduleMinimumVarianceAmount = value;
    }

    /**
     * Gets the value of the cumulativeScheduleMinimumVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCumulativeScheduleMinimumVarianceAmount() {
        return cumulativeScheduleMinimumVarianceAmount;
    }

    /**
     * Sets the value of the cumulativeScheduleMinimumVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCumulativeScheduleMinimumVarianceAmount(AmountType value) {
        this.cumulativeScheduleMinimumVarianceAmount = value;
    }

    /**
     * Gets the value of the cumulativeCostMinimumVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCumulativeCostMinimumVarianceAmount() {
        return cumulativeCostMinimumVarianceAmount;
    }

    /**
     * Sets the value of the cumulativeCostMinimumVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCumulativeCostMinimumVarianceAmount(AmountType value) {
        this.cumulativeCostMinimumVarianceAmount = value;
    }

    /**
     * Gets the value of the atCompleteMinimumVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAtCompleteMinimumVarianceAmount() {
        return atCompleteMinimumVarianceAmount;
    }

    /**
     * Sets the value of the atCompleteMinimumVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAtCompleteMinimumVarianceAmount(AmountType value) {
        this.atCompleteMinimumVarianceAmount = value;
    }

    /**
     * Gets the value of the currentCostMinimumVariancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCurrentCostMinimumVariancePercent() {
        return currentCostMinimumVariancePercent;
    }

    /**
     * Sets the value of the currentCostMinimumVariancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCurrentCostMinimumVariancePercent(PercentType value) {
        this.currentCostMinimumVariancePercent = value;
    }

    /**
     * Gets the value of the currentScheduleMinimumVariancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCurrentScheduleMinimumVariancePercent() {
        return currentScheduleMinimumVariancePercent;
    }

    /**
     * Sets the value of the currentScheduleMinimumVariancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCurrentScheduleMinimumVariancePercent(PercentType value) {
        this.currentScheduleMinimumVariancePercent = value;
    }

    /**
     * Gets the value of the cumulativeCostMinimumVariancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCumulativeCostMinimumVariancePercent() {
        return cumulativeCostMinimumVariancePercent;
    }

    /**
     * Sets the value of the cumulativeCostMinimumVariancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCumulativeCostMinimumVariancePercent(PercentType value) {
        this.cumulativeCostMinimumVariancePercent = value;
    }

    /**
     * Gets the value of the cumulativeScheduleMinimumVariancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCumulativeScheduleMinimumVariancePercent() {
        return cumulativeScheduleMinimumVariancePercent;
    }

    /**
     * Sets the value of the cumulativeScheduleMinimumVariancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCumulativeScheduleMinimumVariancePercent(PercentType value) {
        this.cumulativeScheduleMinimumVariancePercent = value;
    }

    /**
     * Gets the value of the atCompleteMinimumVariancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getAtCompleteMinimumVariancePercent() {
        return atCompleteMinimumVariancePercent;
    }

    /**
     * Sets the value of the atCompleteMinimumVariancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setAtCompleteMinimumVariancePercent(PercentType value) {
        this.atCompleteMinimumVariancePercent = value;
    }

    /**
     * Gets the value of the appliedReportingDataNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedReportingDataNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedReportingDataNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingDataNodeType }
     * 
     * 
     */
    public List<ReportingDataNodeType> getAppliedReportingDataNode() {
        if (appliedReportingDataNode == null) {
            appliedReportingDataNode = new ArrayList<ReportingDataNodeType>();
        }
        return this.appliedReportingDataNode;
    }

}
