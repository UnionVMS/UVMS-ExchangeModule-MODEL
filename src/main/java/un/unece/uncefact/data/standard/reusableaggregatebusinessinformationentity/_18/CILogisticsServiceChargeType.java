
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.ChargePayingPartyRoleCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.FreightChargeTariffClassCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.FreightChargeTypeIDType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.LogisticsChargeCalculationBasisCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005519&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Logistics_ Service Charge. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A charge made for a Cross Industry (CI) logistics related service.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Service Charge&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Logistics&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cross Industry Trade&lt;/ccts:BusinessProcessContextValue&gt;
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
 * <p>Java class for CILogisticsServiceChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CILogisticsServiceChargeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}FreightChargeTypeIDType" minOccurs="0"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentArrangementCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="TariffClassCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}FreightChargeTariffClassCodeType" minOccurs="0"/>
 *         &lt;element name="ChargeCategoryCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="ServiceCategoryCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="DisbursementAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AppliedAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllowanceCharge" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="PayingPartyRoleCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}ChargePayingPartyRoleCodeType" minOccurs="0"/>
 *         &lt;element name="CalculationBasisCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}LogisticsChargeCalculationBasisCodeType" minOccurs="0"/>
 *         &lt;element name="CalculationBasis" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="TransportPaymentMethodCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="PaymentPlaceCILogisticsLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CILogisticsLocationType" minOccurs="0"/>
 *         &lt;element name="AppliedFromCILogisticsLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CILogisticsLocationType" minOccurs="0"/>
 *         &lt;element name="AppliedToCILogisticsLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CILogisticsLocationType" minOccurs="0"/>
 *         &lt;element name="AppliedCITradeTax" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CILogisticsServiceChargeType", propOrder = {
    "id",
    "description",
    "paymentArrangementCode",
    "tariffClassCode",
    "chargeCategoryCode",
    "serviceCategoryCode",
    "disbursementAmount",
    "appliedAmount",
    "allowanceCharge",
    "payingPartyRoleCode",
    "calculationBasisCode",
    "calculationBasis",
    "transportPaymentMethodCode",
    "paymentPlaceCILogisticsLocation",
    "appliedFromCILogisticsLocation",
    "appliedToCILogisticsLocation",
    "appliedCITradeTax"
})
public class CILogisticsServiceChargeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected FreightChargeTypeIDType id;
    @XmlElement(name = "Description")
    protected List<TextType> description;
    @XmlElement(name = "PaymentArrangementCode")
    protected CodeType paymentArrangementCode;
    @XmlElement(name = "TariffClassCode")
    protected FreightChargeTariffClassCodeType tariffClassCode;
    @XmlElement(name = "ChargeCategoryCode")
    protected CodeType chargeCategoryCode;
    @XmlElement(name = "ServiceCategoryCode")
    protected CodeType serviceCategoryCode;
    @XmlElement(name = "DisbursementAmount")
    protected List<AmountType> disbursementAmount;
    @XmlElement(name = "AppliedAmount")
    protected List<AmountType> appliedAmount;
    @XmlElement(name = "AllowanceCharge")
    protected TextType allowanceCharge;
    @XmlElement(name = "PayingPartyRoleCode")
    protected ChargePayingPartyRoleCodeType payingPartyRoleCode;
    @XmlElement(name = "CalculationBasisCode")
    protected LogisticsChargeCalculationBasisCodeType calculationBasisCode;
    @XmlElement(name = "CalculationBasis")
    protected TextType calculationBasis;
    @XmlElement(name = "TransportPaymentMethodCode")
    protected CodeType transportPaymentMethodCode;
    @XmlElement(name = "PaymentPlaceCILogisticsLocation")
    protected CILogisticsLocationType paymentPlaceCILogisticsLocation;
    @XmlElement(name = "AppliedFromCILogisticsLocation")
    protected CILogisticsLocationType appliedFromCILogisticsLocation;
    @XmlElement(name = "AppliedToCILogisticsLocation")
    protected CILogisticsLocationType appliedToCILogisticsLocation;
    @XmlElement(name = "AppliedCITradeTax")
    protected List<CITradeTaxType> appliedCITradeTax;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link FreightChargeTypeIDType }
     *     
     */
    public FreightChargeTypeIDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightChargeTypeIDType }
     *     
     */
    public void setID(FreightChargeTypeIDType value) {
        this.id = value;
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
     * Gets the value of the paymentArrangementCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getPaymentArrangementCode() {
        return paymentArrangementCode;
    }

    /**
     * Sets the value of the paymentArrangementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setPaymentArrangementCode(CodeType value) {
        this.paymentArrangementCode = value;
    }

    /**
     * Gets the value of the tariffClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link FreightChargeTariffClassCodeType }
     *     
     */
    public FreightChargeTariffClassCodeType getTariffClassCode() {
        return tariffClassCode;
    }

    /**
     * Sets the value of the tariffClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightChargeTariffClassCodeType }
     *     
     */
    public void setTariffClassCode(FreightChargeTariffClassCodeType value) {
        this.tariffClassCode = value;
    }

    /**
     * Gets the value of the chargeCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getChargeCategoryCode() {
        return chargeCategoryCode;
    }

    /**
     * Sets the value of the chargeCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setChargeCategoryCode(CodeType value) {
        this.chargeCategoryCode = value;
    }

    /**
     * Gets the value of the serviceCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getServiceCategoryCode() {
        return serviceCategoryCode;
    }

    /**
     * Sets the value of the serviceCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setServiceCategoryCode(CodeType value) {
        this.serviceCategoryCode = value;
    }

    /**
     * Gets the value of the disbursementAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disbursementAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisbursementAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDisbursementAmount() {
        if (disbursementAmount == null) {
            disbursementAmount = new ArrayList<AmountType>();
        }
        return this.disbursementAmount;
    }

    /**
     * Gets the value of the appliedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAppliedAmount() {
        if (appliedAmount == null) {
            appliedAmount = new ArrayList<AmountType>();
        }
        return this.appliedAmount;
    }

    /**
     * Gets the value of the allowanceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Sets the value of the allowanceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAllowanceCharge(TextType value) {
        this.allowanceCharge = value;
    }

    /**
     * Gets the value of the payingPartyRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChargePayingPartyRoleCodeType }
     *     
     */
    public ChargePayingPartyRoleCodeType getPayingPartyRoleCode() {
        return payingPartyRoleCode;
    }

    /**
     * Sets the value of the payingPartyRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargePayingPartyRoleCodeType }
     *     
     */
    public void setPayingPartyRoleCode(ChargePayingPartyRoleCodeType value) {
        this.payingPartyRoleCode = value;
    }

    /**
     * Gets the value of the calculationBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link LogisticsChargeCalculationBasisCodeType }
     *     
     */
    public LogisticsChargeCalculationBasisCodeType getCalculationBasisCode() {
        return calculationBasisCode;
    }

    /**
     * Sets the value of the calculationBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogisticsChargeCalculationBasisCodeType }
     *     
     */
    public void setCalculationBasisCode(LogisticsChargeCalculationBasisCodeType value) {
        this.calculationBasisCode = value;
    }

    /**
     * Gets the value of the calculationBasis property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCalculationBasis() {
        return calculationBasis;
    }

    /**
     * Sets the value of the calculationBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCalculationBasis(TextType value) {
        this.calculationBasis = value;
    }

    /**
     * Gets the value of the transportPaymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransportPaymentMethodCode() {
        return transportPaymentMethodCode;
    }

    /**
     * Sets the value of the transportPaymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransportPaymentMethodCode(CodeType value) {
        this.transportPaymentMethodCode = value;
    }

    /**
     * Gets the value of the paymentPlaceCILogisticsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CILogisticsLocationType }
     *     
     */
    public CILogisticsLocationType getPaymentPlaceCILogisticsLocation() {
        return paymentPlaceCILogisticsLocation;
    }

    /**
     * Sets the value of the paymentPlaceCILogisticsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CILogisticsLocationType }
     *     
     */
    public void setPaymentPlaceCILogisticsLocation(CILogisticsLocationType value) {
        this.paymentPlaceCILogisticsLocation = value;
    }

    /**
     * Gets the value of the appliedFromCILogisticsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CILogisticsLocationType }
     *     
     */
    public CILogisticsLocationType getAppliedFromCILogisticsLocation() {
        return appliedFromCILogisticsLocation;
    }

    /**
     * Sets the value of the appliedFromCILogisticsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CILogisticsLocationType }
     *     
     */
    public void setAppliedFromCILogisticsLocation(CILogisticsLocationType value) {
        this.appliedFromCILogisticsLocation = value;
    }

    /**
     * Gets the value of the appliedToCILogisticsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CILogisticsLocationType }
     *     
     */
    public CILogisticsLocationType getAppliedToCILogisticsLocation() {
        return appliedToCILogisticsLocation;
    }

    /**
     * Sets the value of the appliedToCILogisticsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CILogisticsLocationType }
     *     
     */
    public void setAppliedToCILogisticsLocation(CILogisticsLocationType value) {
        this.appliedToCILogisticsLocation = value;
    }

    /**
     * Gets the value of the appliedCITradeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedCITradeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedCITradeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeTaxType }
     * 
     * 
     */
    public List<CITradeTaxType> getAppliedCITradeTax() {
        if (appliedCITradeTax == null) {
            appliedCITradeTax = new ArrayList<CITradeTaxType>();
        }
        return this.appliedCITradeTax;
    }

}
