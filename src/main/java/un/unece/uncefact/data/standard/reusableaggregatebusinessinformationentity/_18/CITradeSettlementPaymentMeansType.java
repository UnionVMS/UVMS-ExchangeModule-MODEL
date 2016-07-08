
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.PaymentGuaranteeMeansCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.PaymentMeansChannelCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.PaymentMeansCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.PaymentMethodCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005670&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Trade Settlement_ Payment Means. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The means by which a payment will be or has been made for Cross Industry (CI) trade settlement purposes.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Payment Means&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Trade Settlement&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * <p>Java class for CITradeSettlementPaymentMeansType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CITradeSettlementPaymentMeansType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentChannelCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}PaymentMeansChannelCodeType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}PaymentMeansCodeType" minOccurs="0"/>
 *         &lt;element name="GuaranteeMethodCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}PaymentGuaranteeMeansCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentMethodCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}PaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Information" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PayerPartyCIDebtorFinancialAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIDebtorFinancialAccountType" minOccurs="0"/>
 *         &lt;element name="PayeePartyCICreditorFinancialAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CICreditorFinancialAccountType" minOccurs="0"/>
 *         &lt;element name="PayerSpecifiedCIDebtorFinancialInstitution" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIDebtorFinancialInstitutionType" minOccurs="0"/>
 *         &lt;element name="PayeeSpecifiedCICreditorFinancialInstitution" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CICreditorFinancialInstitutionType" minOccurs="0"/>
 *         &lt;element name="ApplicableTradeSettlementFinancialCard" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}TradeSettlementFinancialCardType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CITradeSettlementPaymentMeansType", propOrder = {
    "paymentChannelCode",
    "typeCode",
    "guaranteeMethodCode",
    "paymentMethodCode",
    "id",
    "information",
    "payerPartyCIDebtorFinancialAccount",
    "payeePartyCICreditorFinancialAccount",
    "payerSpecifiedCIDebtorFinancialInstitution",
    "payeeSpecifiedCICreditorFinancialInstitution",
    "applicableTradeSettlementFinancialCard"
})
public class CITradeSettlementPaymentMeansType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PaymentChannelCode")
    protected PaymentMeansChannelCodeType paymentChannelCode;
    @XmlElement(name = "TypeCode")
    protected PaymentMeansCodeType typeCode;
    @XmlElement(name = "GuaranteeMethodCode")
    protected PaymentGuaranteeMeansCodeType guaranteeMethodCode;
    @XmlElement(name = "PaymentMethodCode")
    protected PaymentMethodCodeType paymentMethodCode;
    @XmlElement(name = "ID")
    protected List<IDType> id;
    @XmlElement(name = "Information")
    protected List<TextType> information;
    @XmlElement(name = "PayerPartyCIDebtorFinancialAccount")
    protected CIDebtorFinancialAccountType payerPartyCIDebtorFinancialAccount;
    @XmlElement(name = "PayeePartyCICreditorFinancialAccount")
    protected CICreditorFinancialAccountType payeePartyCICreditorFinancialAccount;
    @XmlElement(name = "PayerSpecifiedCIDebtorFinancialInstitution")
    protected CIDebtorFinancialInstitutionType payerSpecifiedCIDebtorFinancialInstitution;
    @XmlElement(name = "PayeeSpecifiedCICreditorFinancialInstitution")
    protected CICreditorFinancialInstitutionType payeeSpecifiedCICreditorFinancialInstitution;
    @XmlElement(name = "ApplicableTradeSettlementFinancialCard")
    protected TradeSettlementFinancialCardType applicableTradeSettlementFinancialCard;

    /**
     * Gets the value of the paymentChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeansChannelCodeType }
     *     
     */
    public PaymentMeansChannelCodeType getPaymentChannelCode() {
        return paymentChannelCode;
    }

    /**
     * Sets the value of the paymentChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeansChannelCodeType }
     *     
     */
    public void setPaymentChannelCode(PaymentMeansChannelCodeType value) {
        this.paymentChannelCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public PaymentMeansCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public void setTypeCode(PaymentMeansCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the guaranteeMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentGuaranteeMeansCodeType }
     *     
     */
    public PaymentGuaranteeMeansCodeType getGuaranteeMethodCode() {
        return guaranteeMethodCode;
    }

    /**
     * Sets the value of the guaranteeMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentGuaranteeMeansCodeType }
     *     
     */
    public void setGuaranteeMethodCode(PaymentGuaranteeMeansCodeType value) {
        this.guaranteeMethodCode = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public PaymentMethodCodeType getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public void setPaymentMethodCode(PaymentMethodCodeType value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getID() {
        if (id == null) {
            id = new ArrayList<IDType>();
        }
        return this.id;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getInformation() {
        if (information == null) {
            information = new ArrayList<TextType>();
        }
        return this.information;
    }

    /**
     * Gets the value of the payerPartyCIDebtorFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CIDebtorFinancialAccountType }
     *     
     */
    public CIDebtorFinancialAccountType getPayerPartyCIDebtorFinancialAccount() {
        return payerPartyCIDebtorFinancialAccount;
    }

    /**
     * Sets the value of the payerPartyCIDebtorFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIDebtorFinancialAccountType }
     *     
     */
    public void setPayerPartyCIDebtorFinancialAccount(CIDebtorFinancialAccountType value) {
        this.payerPartyCIDebtorFinancialAccount = value;
    }

    /**
     * Gets the value of the payeePartyCICreditorFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CICreditorFinancialAccountType }
     *     
     */
    public CICreditorFinancialAccountType getPayeePartyCICreditorFinancialAccount() {
        return payeePartyCICreditorFinancialAccount;
    }

    /**
     * Sets the value of the payeePartyCICreditorFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICreditorFinancialAccountType }
     *     
     */
    public void setPayeePartyCICreditorFinancialAccount(CICreditorFinancialAccountType value) {
        this.payeePartyCICreditorFinancialAccount = value;
    }

    /**
     * Gets the value of the payerSpecifiedCIDebtorFinancialInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link CIDebtorFinancialInstitutionType }
     *     
     */
    public CIDebtorFinancialInstitutionType getPayerSpecifiedCIDebtorFinancialInstitution() {
        return payerSpecifiedCIDebtorFinancialInstitution;
    }

    /**
     * Sets the value of the payerSpecifiedCIDebtorFinancialInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIDebtorFinancialInstitutionType }
     *     
     */
    public void setPayerSpecifiedCIDebtorFinancialInstitution(CIDebtorFinancialInstitutionType value) {
        this.payerSpecifiedCIDebtorFinancialInstitution = value;
    }

    /**
     * Gets the value of the payeeSpecifiedCICreditorFinancialInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link CICreditorFinancialInstitutionType }
     *     
     */
    public CICreditorFinancialInstitutionType getPayeeSpecifiedCICreditorFinancialInstitution() {
        return payeeSpecifiedCICreditorFinancialInstitution;
    }

    /**
     * Sets the value of the payeeSpecifiedCICreditorFinancialInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICreditorFinancialInstitutionType }
     *     
     */
    public void setPayeeSpecifiedCICreditorFinancialInstitution(CICreditorFinancialInstitutionType value) {
        this.payeeSpecifiedCICreditorFinancialInstitution = value;
    }

    /**
     * Gets the value of the applicableTradeSettlementFinancialCard property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSettlementFinancialCardType }
     *     
     */
    public TradeSettlementFinancialCardType getApplicableTradeSettlementFinancialCard() {
        return applicableTradeSettlementFinancialCard;
    }

    /**
     * Sets the value of the applicableTradeSettlementFinancialCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSettlementFinancialCardType }
     *     
     */
    public void setApplicableTradeSettlementFinancialCard(TradeSettlementFinancialCardType value) {
        this.applicableTradeSettlementFinancialCard = value;
    }

}
