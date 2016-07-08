
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IndicatorType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.MeasureType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01009880&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Sampled Object_ Crop. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A botanical item, such as a plant, flower or bulb, which is sampled.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Crop&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Sampled Object&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Laboratory Observation&lt;/ccts:BusinessProcessContextValue&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:GeopoliticalOrRegionContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Global&lt;/ccts:GeopoliticalOrRegionContextValue&gt;
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
 * <p>Java class for SampledObjectCropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampledObjectCropType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BotanicalIdentificationID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="BotanicalGenusCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="BotanicalSpeciesCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="BotanicalSpeciesVarietyCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="ClassificationCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DevelopmentStageCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="CultivationTypeCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="PropagationMaterialIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="SizeMeasure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}MeasureType" minOccurs="0"/>
 *         &lt;element name="BotanicalName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="CultivationCoverageCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="CultivationMediumCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="CultivationContainerCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="HarvestDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampledObjectCropType", propOrder = {
    "botanicalIdentificationID",
    "botanicalGenusCode",
    "botanicalSpeciesCode",
    "botanicalSpeciesVarietyCode",
    "classificationCode",
    "description",
    "developmentStageCode",
    "cultivationTypeCode",
    "propagationMaterialIndicator",
    "sizeMeasure",
    "botanicalName",
    "cultivationCoverageCode",
    "cultivationMediumCode",
    "cultivationContainerCode",
    "harvestDateTime"
})
public class SampledObjectCropType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BotanicalIdentificationID")
    protected IDType botanicalIdentificationID;
    @XmlElement(name = "BotanicalGenusCode")
    protected CodeType botanicalGenusCode;
    @XmlElement(name = "BotanicalSpeciesCode")
    protected CodeType botanicalSpeciesCode;
    @XmlElement(name = "BotanicalSpeciesVarietyCode")
    protected CodeType botanicalSpeciesVarietyCode;
    @XmlElement(name = "ClassificationCode")
    protected CodeType classificationCode;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "DevelopmentStageCode")
    protected CodeType developmentStageCode;
    @XmlElement(name = "CultivationTypeCode")
    protected CodeType cultivationTypeCode;
    @XmlElement(name = "PropagationMaterialIndicator")
    protected IndicatorType propagationMaterialIndicator;
    @XmlElement(name = "SizeMeasure")
    protected MeasureType sizeMeasure;
    @XmlElement(name = "BotanicalName")
    protected TextType botanicalName;
    @XmlElement(name = "CultivationCoverageCode")
    protected CodeType cultivationCoverageCode;
    @XmlElement(name = "CultivationMediumCode")
    protected CodeType cultivationMediumCode;
    @XmlElement(name = "CultivationContainerCode")
    protected CodeType cultivationContainerCode;
    @XmlElement(name = "HarvestDateTime")
    protected DateTimeType harvestDateTime;

    /**
     * Gets the value of the botanicalIdentificationID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getBotanicalIdentificationID() {
        return botanicalIdentificationID;
    }

    /**
     * Sets the value of the botanicalIdentificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setBotanicalIdentificationID(IDType value) {
        this.botanicalIdentificationID = value;
    }

    /**
     * Gets the value of the botanicalGenusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBotanicalGenusCode() {
        return botanicalGenusCode;
    }

    /**
     * Sets the value of the botanicalGenusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBotanicalGenusCode(CodeType value) {
        this.botanicalGenusCode = value;
    }

    /**
     * Gets the value of the botanicalSpeciesCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBotanicalSpeciesCode() {
        return botanicalSpeciesCode;
    }

    /**
     * Sets the value of the botanicalSpeciesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBotanicalSpeciesCode(CodeType value) {
        this.botanicalSpeciesCode = value;
    }

    /**
     * Gets the value of the botanicalSpeciesVarietyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getBotanicalSpeciesVarietyCode() {
        return botanicalSpeciesVarietyCode;
    }

    /**
     * Sets the value of the botanicalSpeciesVarietyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setBotanicalSpeciesVarietyCode(CodeType value) {
        this.botanicalSpeciesVarietyCode = value;
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClassificationCode(CodeType value) {
        this.classificationCode = value;
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
     * Gets the value of the developmentStageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDevelopmentStageCode() {
        return developmentStageCode;
    }

    /**
     * Sets the value of the developmentStageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDevelopmentStageCode(CodeType value) {
        this.developmentStageCode = value;
    }

    /**
     * Gets the value of the cultivationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCultivationTypeCode() {
        return cultivationTypeCode;
    }

    /**
     * Sets the value of the cultivationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCultivationTypeCode(CodeType value) {
        this.cultivationTypeCode = value;
    }

    /**
     * Gets the value of the propagationMaterialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getPropagationMaterialIndicator() {
        return propagationMaterialIndicator;
    }

    /**
     * Sets the value of the propagationMaterialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setPropagationMaterialIndicator(IndicatorType value) {
        this.propagationMaterialIndicator = value;
    }

    /**
     * Gets the value of the sizeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSizeMeasure() {
        return sizeMeasure;
    }

    /**
     * Sets the value of the sizeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSizeMeasure(MeasureType value) {
        this.sizeMeasure = value;
    }

    /**
     * Gets the value of the botanicalName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBotanicalName() {
        return botanicalName;
    }

    /**
     * Sets the value of the botanicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBotanicalName(TextType value) {
        this.botanicalName = value;
    }

    /**
     * Gets the value of the cultivationCoverageCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCultivationCoverageCode() {
        return cultivationCoverageCode;
    }

    /**
     * Sets the value of the cultivationCoverageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCultivationCoverageCode(CodeType value) {
        this.cultivationCoverageCode = value;
    }

    /**
     * Gets the value of the cultivationMediumCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCultivationMediumCode() {
        return cultivationMediumCode;
    }

    /**
     * Sets the value of the cultivationMediumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCultivationMediumCode(CodeType value) {
        this.cultivationMediumCode = value;
    }

    /**
     * Gets the value of the cultivationContainerCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCultivationContainerCode() {
        return cultivationContainerCode;
    }

    /**
     * Sets the value of the cultivationContainerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCultivationContainerCode(CodeType value) {
        this.cultivationContainerCode = value;
    }

    /**
     * Gets the value of the harvestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getHarvestDateTime() {
        return harvestDateTime;
    }

    /**
     * Sets the value of the harvestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setHarvestDateTime(DateTimeType value) {
        this.harvestDateTime = value;
    }

}
