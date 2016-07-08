
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AmortizationMethodCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.LifetimeEndCostCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.MeasureType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.NumericType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.PercentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.QuantityType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01008895&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry_ Capital Asset Amortization. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The distribution of the cost of an AAA (Accounting And Audit) entry capital asset with respect to its lifetime duration.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Capital Asset Amortization&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * <p>Java class for AAAEntryCapitalAssetAmortizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAAEntryCapitalAssetAmortizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LifetimeDurationMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}MeasureType" minOccurs="0"/>
 *         &lt;element name="BasisAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="LifetimeProductionCapacityQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="MethodCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AmortizationMethodCodeType" minOccurs="0"/>
 *         &lt;element name="MethodLegalReferenceID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="MethodLegalReference" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="CalculationParameterAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="CalculationParameterNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}NumericType" minOccurs="0"/>
 *         &lt;element name="CalculationParameterPercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="ResidualValueAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="LifetimeEndCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="LifetimeEndCostTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}LifetimeEndCostCodeType" minOccurs="0"/>
 *         &lt;element name="BasisReductionAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="BasisReductionPercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="MaintenanceCostAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="PeriodProductionQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="SpecifiedAAAPeriod" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAPeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAAEntryCapitalAssetAmortizationType", propOrder = {
    "lifetimeDurationMeasure",
    "basisAmount",
    "lifetimeProductionCapacityQuantity",
    "methodCode",
    "methodLegalReferenceID",
    "methodLegalReference",
    "calculationParameterAmount",
    "calculationParameterNumeric",
    "calculationParameterPercent",
    "residualValueAmount",
    "lifetimeEndCostAmount",
    "lifetimeEndCostTypeCode",
    "basisReductionAmount",
    "basisReductionPercent",
    "maintenanceCostAmount",
    "periodProductionQuantity",
    "specifiedAAAPeriod"
})
public class AAAEntryCapitalAssetAmortizationType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LifetimeDurationMeasure")
    protected MeasureType lifetimeDurationMeasure;
    @XmlElement(name = "BasisAmount")
    protected AmountType basisAmount;
    @XmlElement(name = "LifetimeProductionCapacityQuantity")
    protected QuantityType lifetimeProductionCapacityQuantity;
    @XmlElement(name = "MethodCode")
    protected AmortizationMethodCodeType methodCode;
    @XmlElement(name = "MethodLegalReferenceID")
    protected IDType methodLegalReferenceID;
    @XmlElement(name = "MethodLegalReference")
    protected TextType methodLegalReference;
    @XmlElement(name = "CalculationParameterAmount")
    protected AmountType calculationParameterAmount;
    @XmlElement(name = "CalculationParameterNumeric")
    protected NumericType calculationParameterNumeric;
    @XmlElement(name = "CalculationParameterPercent")
    protected PercentType calculationParameterPercent;
    @XmlElement(name = "ResidualValueAmount")
    protected AmountType residualValueAmount;
    @XmlElement(name = "LifetimeEndCostAmount")
    protected AmountType lifetimeEndCostAmount;
    @XmlElement(name = "LifetimeEndCostTypeCode")
    protected LifetimeEndCostCodeType lifetimeEndCostTypeCode;
    @XmlElement(name = "BasisReductionAmount")
    protected AmountType basisReductionAmount;
    @XmlElement(name = "BasisReductionPercent")
    protected PercentType basisReductionPercent;
    @XmlElement(name = "MaintenanceCostAmount")
    protected AmountType maintenanceCostAmount;
    @XmlElement(name = "PeriodProductionQuantity")
    protected QuantityType periodProductionQuantity;
    @XmlElement(name = "SpecifiedAAAPeriod")
    protected AAAPeriodType specifiedAAAPeriod;

    /**
     * Gets the value of the lifetimeDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getLifetimeDurationMeasure() {
        return lifetimeDurationMeasure;
    }

    /**
     * Sets the value of the lifetimeDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setLifetimeDurationMeasure(MeasureType value) {
        this.lifetimeDurationMeasure = value;
    }

    /**
     * Gets the value of the basisAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBasisAmount() {
        return basisAmount;
    }

    /**
     * Sets the value of the basisAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBasisAmount(AmountType value) {
        this.basisAmount = value;
    }

    /**
     * Gets the value of the lifetimeProductionCapacityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getLifetimeProductionCapacityQuantity() {
        return lifetimeProductionCapacityQuantity;
    }

    /**
     * Sets the value of the lifetimeProductionCapacityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setLifetimeProductionCapacityQuantity(QuantityType value) {
        this.lifetimeProductionCapacityQuantity = value;
    }

    /**
     * Gets the value of the methodCode property.
     * 
     * @return
     *     possible object is
     *     {@link AmortizationMethodCodeType }
     *     
     */
    public AmortizationMethodCodeType getMethodCode() {
        return methodCode;
    }

    /**
     * Sets the value of the methodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmortizationMethodCodeType }
     *     
     */
    public void setMethodCode(AmortizationMethodCodeType value) {
        this.methodCode = value;
    }

    /**
     * Gets the value of the methodLegalReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMethodLegalReferenceID() {
        return methodLegalReferenceID;
    }

    /**
     * Sets the value of the methodLegalReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMethodLegalReferenceID(IDType value) {
        this.methodLegalReferenceID = value;
    }

    /**
     * Gets the value of the methodLegalReference property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMethodLegalReference() {
        return methodLegalReference;
    }

    /**
     * Sets the value of the methodLegalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMethodLegalReference(TextType value) {
        this.methodLegalReference = value;
    }

    /**
     * Gets the value of the calculationParameterAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCalculationParameterAmount() {
        return calculationParameterAmount;
    }

    /**
     * Sets the value of the calculationParameterAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCalculationParameterAmount(AmountType value) {
        this.calculationParameterAmount = value;
    }

    /**
     * Gets the value of the calculationParameterNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getCalculationParameterNumeric() {
        return calculationParameterNumeric;
    }

    /**
     * Sets the value of the calculationParameterNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setCalculationParameterNumeric(NumericType value) {
        this.calculationParameterNumeric = value;
    }

    /**
     * Gets the value of the calculationParameterPercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getCalculationParameterPercent() {
        return calculationParameterPercent;
    }

    /**
     * Sets the value of the calculationParameterPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setCalculationParameterPercent(PercentType value) {
        this.calculationParameterPercent = value;
    }

    /**
     * Gets the value of the residualValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResidualValueAmount() {
        return residualValueAmount;
    }

    /**
     * Sets the value of the residualValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResidualValueAmount(AmountType value) {
        this.residualValueAmount = value;
    }

    /**
     * Gets the value of the lifetimeEndCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifetimeEndCostAmount() {
        return lifetimeEndCostAmount;
    }

    /**
     * Sets the value of the lifetimeEndCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifetimeEndCostAmount(AmountType value) {
        this.lifetimeEndCostAmount = value;
    }

    /**
     * Gets the value of the lifetimeEndCostTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LifetimeEndCostCodeType }
     *     
     */
    public LifetimeEndCostCodeType getLifetimeEndCostTypeCode() {
        return lifetimeEndCostTypeCode;
    }

    /**
     * Sets the value of the lifetimeEndCostTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifetimeEndCostCodeType }
     *     
     */
    public void setLifetimeEndCostTypeCode(LifetimeEndCostCodeType value) {
        this.lifetimeEndCostTypeCode = value;
    }

    /**
     * Gets the value of the basisReductionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBasisReductionAmount() {
        return basisReductionAmount;
    }

    /**
     * Sets the value of the basisReductionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBasisReductionAmount(AmountType value) {
        this.basisReductionAmount = value;
    }

    /**
     * Gets the value of the basisReductionPercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getBasisReductionPercent() {
        return basisReductionPercent;
    }

    /**
     * Sets the value of the basisReductionPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setBasisReductionPercent(PercentType value) {
        this.basisReductionPercent = value;
    }

    /**
     * Gets the value of the maintenanceCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaintenanceCostAmount() {
        return maintenanceCostAmount;
    }

    /**
     * Sets the value of the maintenanceCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaintenanceCostAmount(AmountType value) {
        this.maintenanceCostAmount = value;
    }

    /**
     * Gets the value of the periodProductionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPeriodProductionQuantity() {
        return periodProductionQuantity;
    }

    /**
     * Sets the value of the periodProductionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPeriodProductionQuantity(QuantityType value) {
        this.periodProductionQuantity = value;
    }

    /**
     * Gets the value of the specifiedAAAPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AAAPeriodType }
     *     
     */
    public AAAPeriodType getSpecifiedAAAPeriod() {
        return specifiedAAAPeriod;
    }

    /**
     * Sets the value of the specifiedAAAPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAAPeriodType }
     *     
     */
    public void setSpecifiedAAAPeriod(AAAPeriodType value) {
        this.specifiedAAAPeriod = value;
    }

}
