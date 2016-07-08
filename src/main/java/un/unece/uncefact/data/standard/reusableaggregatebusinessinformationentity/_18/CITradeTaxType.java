
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.CurrencyCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.TaxCategoryCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.TaxTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.TimeReferenceCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IndicatorType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.NumericType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.PercentType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.QuantityType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.RateType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005832&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Trade_ Tax. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A Cross Industry (CI) trade related fiscal tax, duty or levy.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tax&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * <p>Java class for CITradeTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CITradeTaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculatedAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}TaxTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ExemptionReason" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="CalculatedRate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}RateType" minOccurs="0"/>
 *         &lt;element name="CalculationSequenceNumeric" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}NumericType" minOccurs="0"/>
 *         &lt;element name="BasisQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="BasisAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitBasisAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}TaxCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="Jurisdiction" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomsDutyIndicator" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IndicatorType" minOccurs="0"/>
 *         &lt;element name="ExemptionReasonCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="TaxBasisAllowanceRate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}RateType" minOccurs="0"/>
 *         &lt;element name="TaxPointDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateType" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="InformationAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DueDateTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}TimeReferenceCodeType" minOccurs="0"/>
 *         &lt;element name="RateApplicablePercent" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}PercentType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BuyerDeductibleTaxSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" minOccurs="0"/>
 *         &lt;element name="BuyerNonDeductibleTaxSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" minOccurs="0"/>
 *         &lt;element name="BuyerRepayableTaxSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" minOccurs="0"/>
 *         &lt;element name="SellerPayableTaxSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" minOccurs="0"/>
 *         &lt;element name="SellerRefundableTaxSpecifiedCITradeAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeAccountingAccountType" minOccurs="0"/>
 *         &lt;element name="ServiceSupplyCITradeCountry" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeCountryType" minOccurs="0"/>
 *         &lt;element name="PlaceApplicableCITradeLocation" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradeLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CITradeTaxType", propOrder = {
    "calculatedAmount",
    "typeCode",
    "exemptionReason",
    "calculatedRate",
    "calculationSequenceNumeric",
    "basisQuantity",
    "basisAmount",
    "unitBasisAmount",
    "categoryCode",
    "currencyCode",
    "jurisdiction",
    "customsDutyIndicator",
    "exemptionReasonCode",
    "taxBasisAllowanceRate",
    "taxPointDate",
    "type",
    "informationAmount",
    "categoryName",
    "dueDateTypeCode",
    "rateApplicablePercent",
    "specifiedCITradeAccountingAccount",
    "buyerDeductibleTaxSpecifiedCITradeAccountingAccount",
    "buyerNonDeductibleTaxSpecifiedCITradeAccountingAccount",
    "buyerRepayableTaxSpecifiedCITradeAccountingAccount",
    "sellerPayableTaxSpecifiedCITradeAccountingAccount",
    "sellerRefundableTaxSpecifiedCITradeAccountingAccount",
    "serviceSupplyCITradeCountry",
    "placeApplicableCITradeLocation"
})
public class CITradeTaxType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CalculatedAmount")
    protected List<AmountType> calculatedAmount;
    @XmlElement(name = "TypeCode")
    protected TaxTypeCodeType typeCode;
    @XmlElement(name = "ExemptionReason")
    protected TextType exemptionReason;
    @XmlElement(name = "CalculatedRate")
    protected RateType calculatedRate;
    @XmlElement(name = "CalculationSequenceNumeric")
    protected NumericType calculationSequenceNumeric;
    @XmlElement(name = "BasisQuantity")
    protected QuantityType basisQuantity;
    @XmlElement(name = "BasisAmount")
    protected List<AmountType> basisAmount;
    @XmlElement(name = "UnitBasisAmount")
    protected List<AmountType> unitBasisAmount;
    @XmlElement(name = "CategoryCode")
    protected TaxCategoryCodeType categoryCode;
    @XmlElement(name = "CurrencyCode")
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "Jurisdiction")
    protected List<TextType> jurisdiction;
    @XmlElement(name = "CustomsDutyIndicator")
    protected IndicatorType customsDutyIndicator;
    @XmlElement(name = "ExemptionReasonCode")
    protected CodeType exemptionReasonCode;
    @XmlElement(name = "TaxBasisAllowanceRate")
    protected RateType taxBasisAllowanceRate;
    @XmlElement(name = "TaxPointDate")
    protected DateType taxPointDate;
    @XmlElement(name = "Type")
    protected TextType type;
    @XmlElement(name = "InformationAmount")
    protected List<AmountType> informationAmount;
    @XmlElement(name = "CategoryName")
    protected List<TextType> categoryName;
    @XmlElement(name = "DueDateTypeCode")
    protected TimeReferenceCodeType dueDateTypeCode;
    @XmlElement(name = "RateApplicablePercent")
    protected PercentType rateApplicablePercent;
    @XmlElement(name = "SpecifiedCITradeAccountingAccount")
    protected List<CITradeAccountingAccountType> specifiedCITradeAccountingAccount;
    @XmlElement(name = "BuyerDeductibleTaxSpecifiedCITradeAccountingAccount")
    protected CITradeAccountingAccountType buyerDeductibleTaxSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "BuyerNonDeductibleTaxSpecifiedCITradeAccountingAccount")
    protected CITradeAccountingAccountType buyerNonDeductibleTaxSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "BuyerRepayableTaxSpecifiedCITradeAccountingAccount")
    protected CITradeAccountingAccountType buyerRepayableTaxSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "SellerPayableTaxSpecifiedCITradeAccountingAccount")
    protected CITradeAccountingAccountType sellerPayableTaxSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "SellerRefundableTaxSpecifiedCITradeAccountingAccount")
    protected CITradeAccountingAccountType sellerRefundableTaxSpecifiedCITradeAccountingAccount;
    @XmlElement(name = "ServiceSupplyCITradeCountry")
    protected CITradeCountryType serviceSupplyCITradeCountry;
    @XmlElement(name = "PlaceApplicableCITradeLocation")
    protected List<CITradeLocationType> placeApplicableCITradeLocation;

    /**
     * Gets the value of the calculatedAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculatedAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculatedAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getCalculatedAmount() {
        if (calculatedAmount == null) {
            calculatedAmount = new ArrayList<AmountType>();
        }
        return this.calculatedAmount;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public TaxTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeType }
     *     
     */
    public void setTypeCode(TaxTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the exemptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getExemptionReason() {
        return exemptionReason;
    }

    /**
     * Sets the value of the exemptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setExemptionReason(TextType value) {
        this.exemptionReason = value;
    }

    /**
     * Gets the value of the calculatedRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getCalculatedRate() {
        return calculatedRate;
    }

    /**
     * Sets the value of the calculatedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setCalculatedRate(RateType value) {
        this.calculatedRate = value;
    }

    /**
     * Gets the value of the calculationSequenceNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getCalculationSequenceNumeric() {
        return calculationSequenceNumeric;
    }

    /**
     * Sets the value of the calculationSequenceNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setCalculationSequenceNumeric(NumericType value) {
        this.calculationSequenceNumeric = value;
    }

    /**
     * Gets the value of the basisQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getBasisQuantity() {
        return basisQuantity;
    }

    /**
     * Sets the value of the basisQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setBasisQuantity(QuantityType value) {
        this.basisQuantity = value;
    }

    /**
     * Gets the value of the basisAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basisAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasisAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getBasisAmount() {
        if (basisAmount == null) {
            basisAmount = new ArrayList<AmountType>();
        }
        return this.basisAmount;
    }

    /**
     * Gets the value of the unitBasisAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitBasisAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitBasisAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getUnitBasisAmount() {
        if (unitBasisAmount == null) {
            unitBasisAmount = new ArrayList<AmountType>();
        }
        return this.unitBasisAmount;
    }

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryCodeType }
     *     
     */
    public TaxCategoryCodeType getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryCodeType }
     *     
     */
    public void setCategoryCode(TaxCategoryCodeType value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getJurisdiction() {
        if (jurisdiction == null) {
            jurisdiction = new ArrayList<TextType>();
        }
        return this.jurisdiction;
    }

    /**
     * Gets the value of the customsDutyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getCustomsDutyIndicator() {
        return customsDutyIndicator;
    }

    /**
     * Sets the value of the customsDutyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setCustomsDutyIndicator(IndicatorType value) {
        this.customsDutyIndicator = value;
    }

    /**
     * Gets the value of the exemptionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getExemptionReasonCode() {
        return exemptionReasonCode;
    }

    /**
     * Sets the value of the exemptionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setExemptionReasonCode(CodeType value) {
        this.exemptionReasonCode = value;
    }

    /**
     * Gets the value of the taxBasisAllowanceRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getTaxBasisAllowanceRate() {
        return taxBasisAllowanceRate;
    }

    /**
     * Sets the value of the taxBasisAllowanceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setTaxBasisAllowanceRate(RateType value) {
        this.taxBasisAllowanceRate = value;
    }

    /**
     * Gets the value of the taxPointDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Sets the value of the taxPointDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setTaxPointDate(DateType value) {
        this.taxPointDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setType(TextType value) {
        this.type = value;
    }

    /**
     * Gets the value of the informationAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getInformationAmount() {
        if (informationAmount == null) {
            informationAmount = new ArrayList<AmountType>();
        }
        return this.informationAmount;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getCategoryName() {
        if (categoryName == null) {
            categoryName = new ArrayList<TextType>();
        }
        return this.categoryName;
    }

    /**
     * Gets the value of the dueDateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TimeReferenceCodeType }
     *     
     */
    public TimeReferenceCodeType getDueDateTypeCode() {
        return dueDateTypeCode;
    }

    /**
     * Sets the value of the dueDateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeReferenceCodeType }
     *     
     */
    public void setDueDateTypeCode(TimeReferenceCodeType value) {
        this.dueDateTypeCode = value;
    }

    /**
     * Gets the value of the rateApplicablePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getRateApplicablePercent() {
        return rateApplicablePercent;
    }

    /**
     * Sets the value of the rateApplicablePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setRateApplicablePercent(PercentType value) {
        this.rateApplicablePercent = value;
    }

    /**
     * Gets the value of the specifiedCITradeAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCITradeAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCITradeAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeAccountingAccountType }
     * 
     * 
     */
    public List<CITradeAccountingAccountType> getSpecifiedCITradeAccountingAccount() {
        if (specifiedCITradeAccountingAccount == null) {
            specifiedCITradeAccountingAccount = new ArrayList<CITradeAccountingAccountType>();
        }
        return this.specifiedCITradeAccountingAccount;
    }

    /**
     * Gets the value of the buyerDeductibleTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public CITradeAccountingAccountType getBuyerDeductibleTaxSpecifiedCITradeAccountingAccount() {
        return buyerDeductibleTaxSpecifiedCITradeAccountingAccount;
    }

    /**
     * Sets the value of the buyerDeductibleTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public void setBuyerDeductibleTaxSpecifiedCITradeAccountingAccount(CITradeAccountingAccountType value) {
        this.buyerDeductibleTaxSpecifiedCITradeAccountingAccount = value;
    }

    /**
     * Gets the value of the buyerNonDeductibleTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public CITradeAccountingAccountType getBuyerNonDeductibleTaxSpecifiedCITradeAccountingAccount() {
        return buyerNonDeductibleTaxSpecifiedCITradeAccountingAccount;
    }

    /**
     * Sets the value of the buyerNonDeductibleTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public void setBuyerNonDeductibleTaxSpecifiedCITradeAccountingAccount(CITradeAccountingAccountType value) {
        this.buyerNonDeductibleTaxSpecifiedCITradeAccountingAccount = value;
    }

    /**
     * Gets the value of the buyerRepayableTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public CITradeAccountingAccountType getBuyerRepayableTaxSpecifiedCITradeAccountingAccount() {
        return buyerRepayableTaxSpecifiedCITradeAccountingAccount;
    }

    /**
     * Sets the value of the buyerRepayableTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public void setBuyerRepayableTaxSpecifiedCITradeAccountingAccount(CITradeAccountingAccountType value) {
        this.buyerRepayableTaxSpecifiedCITradeAccountingAccount = value;
    }

    /**
     * Gets the value of the sellerPayableTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public CITradeAccountingAccountType getSellerPayableTaxSpecifiedCITradeAccountingAccount() {
        return sellerPayableTaxSpecifiedCITradeAccountingAccount;
    }

    /**
     * Sets the value of the sellerPayableTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public void setSellerPayableTaxSpecifiedCITradeAccountingAccount(CITradeAccountingAccountType value) {
        this.sellerPayableTaxSpecifiedCITradeAccountingAccount = value;
    }

    /**
     * Gets the value of the sellerRefundableTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public CITradeAccountingAccountType getSellerRefundableTaxSpecifiedCITradeAccountingAccount() {
        return sellerRefundableTaxSpecifiedCITradeAccountingAccount;
    }

    /**
     * Sets the value of the sellerRefundableTaxSpecifiedCITradeAccountingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeAccountingAccountType }
     *     
     */
    public void setSellerRefundableTaxSpecifiedCITradeAccountingAccount(CITradeAccountingAccountType value) {
        this.sellerRefundableTaxSpecifiedCITradeAccountingAccount = value;
    }

    /**
     * Gets the value of the serviceSupplyCITradeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CITradeCountryType }
     *     
     */
    public CITradeCountryType getServiceSupplyCITradeCountry() {
        return serviceSupplyCITradeCountry;
    }

    /**
     * Sets the value of the serviceSupplyCITradeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradeCountryType }
     *     
     */
    public void setServiceSupplyCITradeCountry(CITradeCountryType value) {
        this.serviceSupplyCITradeCountry = value;
    }

    /**
     * Gets the value of the placeApplicableCITradeLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeApplicableCITradeLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceApplicableCITradeLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradeLocationType }
     * 
     * 
     */
    public List<CITradeLocationType> getPlaceApplicableCITradeLocation() {
        if (placeApplicableCITradeLocation == null) {
            placeApplicableCITradeLocation = new ArrayList<CITradeLocationType>();
        }
        return this.placeApplicableCITradeLocation;
    }

}
