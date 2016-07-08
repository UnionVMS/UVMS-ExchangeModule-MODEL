
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingDebitCreditStatusCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingPerquisiteCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AlternateCurrencyAmountTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.RefundMethodCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01009420&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry_ Accounting Line Monetary Value. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The material or monetary worth of a thing that is associated with an entry line that is a part of an AAA (Accounting and Audit) accounting entry.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting Line Monetary Value&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Entry&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:BusinessProcessContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting, audit&lt;/ccts:BusinessProcessContextValue&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting, audit&lt;/ccts:ProductContextValue&gt;
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
 * <p>Java class for AAAEntryAccountingLineMonetaryValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAAEntryAccountingLineMonetaryValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalAccountingCurrencyAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType"/>
 *         &lt;element name="VoucherCurrencyAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="AlternateCurrencyAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="AlternateCurrencyAmountTypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AlternateCurrencyAmountTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DebitCreditCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingDebitCreditStatusCodeType"/>
 *         &lt;element name="MatchingID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="TickingID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="ApplicationNumberID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="AchievedWorkCategoryID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="DistributionKeyID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="PerquisiteCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingPerquisiteCodeType" minOccurs="0"/>
 *         &lt;element name="RefundMethodCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}RefundMethodCodeType" minOccurs="0"/>
 *         &lt;element name="RemunerationTypeID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="MatchingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BookingAAAEntryAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAAEntryAccountingAccountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAAEntryAccountingLineMonetaryValueType", propOrder = {
    "localAccountingCurrencyAmount",
    "voucherCurrencyAmount",
    "alternateCurrencyAmount",
    "alternateCurrencyAmountTypeCode",
    "debitCreditCode",
    "matchingID",
    "tickingID",
    "applicationNumberID",
    "achievedWorkCategoryID",
    "distributionKeyID",
    "perquisiteCode",
    "refundMethodCode",
    "remunerationTypeID",
    "matchingDateTime",
    "bookingAAAEntryAccountingAccount"
})
public class AAAEntryAccountingLineMonetaryValueType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LocalAccountingCurrencyAmount", required = true)
    protected AmountType localAccountingCurrencyAmount;
    @XmlElement(name = "VoucherCurrencyAmount")
    protected AmountType voucherCurrencyAmount;
    @XmlElement(name = "AlternateCurrencyAmount")
    protected AmountType alternateCurrencyAmount;
    @XmlElement(name = "AlternateCurrencyAmountTypeCode")
    protected AlternateCurrencyAmountTypeCodeType alternateCurrencyAmountTypeCode;
    @XmlElement(name = "DebitCreditCode", required = true)
    protected AccountingDebitCreditStatusCodeType debitCreditCode;
    @XmlElement(name = "MatchingID")
    protected IDType matchingID;
    @XmlElement(name = "TickingID")
    protected IDType tickingID;
    @XmlElement(name = "ApplicationNumberID")
    protected IDType applicationNumberID;
    @XmlElement(name = "AchievedWorkCategoryID")
    protected IDType achievedWorkCategoryID;
    @XmlElement(name = "DistributionKeyID")
    protected IDType distributionKeyID;
    @XmlElement(name = "PerquisiteCode")
    protected AccountingPerquisiteCodeType perquisiteCode;
    @XmlElement(name = "RefundMethodCode")
    protected RefundMethodCodeType refundMethodCode;
    @XmlElement(name = "RemunerationTypeID")
    protected IDType remunerationTypeID;
    @XmlElement(name = "MatchingDateTime")
    protected DateTimeType matchingDateTime;
    @XmlElement(name = "BookingAAAEntryAccountingAccount", required = true)
    protected List<AAAEntryAccountingAccountType> bookingAAAEntryAccountingAccount;

    /**
     * Gets the value of the localAccountingCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLocalAccountingCurrencyAmount() {
        return localAccountingCurrencyAmount;
    }

    /**
     * Sets the value of the localAccountingCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLocalAccountingCurrencyAmount(AmountType value) {
        this.localAccountingCurrencyAmount = value;
    }

    /**
     * Gets the value of the voucherCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getVoucherCurrencyAmount() {
        return voucherCurrencyAmount;
    }

    /**
     * Sets the value of the voucherCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setVoucherCurrencyAmount(AmountType value) {
        this.voucherCurrencyAmount = value;
    }

    /**
     * Gets the value of the alternateCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAlternateCurrencyAmount() {
        return alternateCurrencyAmount;
    }

    /**
     * Sets the value of the alternateCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAlternateCurrencyAmount(AmountType value) {
        this.alternateCurrencyAmount = value;
    }

    /**
     * Gets the value of the alternateCurrencyAmountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateCurrencyAmountTypeCodeType }
     *     
     */
    public AlternateCurrencyAmountTypeCodeType getAlternateCurrencyAmountTypeCode() {
        return alternateCurrencyAmountTypeCode;
    }

    /**
     * Sets the value of the alternateCurrencyAmountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateCurrencyAmountTypeCodeType }
     *     
     */
    public void setAlternateCurrencyAmountTypeCode(AlternateCurrencyAmountTypeCodeType value) {
        this.alternateCurrencyAmountTypeCode = value;
    }

    /**
     * Gets the value of the debitCreditCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingDebitCreditStatusCodeType }
     *     
     */
    public AccountingDebitCreditStatusCodeType getDebitCreditCode() {
        return debitCreditCode;
    }

    /**
     * Sets the value of the debitCreditCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingDebitCreditStatusCodeType }
     *     
     */
    public void setDebitCreditCode(AccountingDebitCreditStatusCodeType value) {
        this.debitCreditCode = value;
    }

    /**
     * Gets the value of the matchingID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMatchingID() {
        return matchingID;
    }

    /**
     * Sets the value of the matchingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMatchingID(IDType value) {
        this.matchingID = value;
    }

    /**
     * Gets the value of the tickingID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getTickingID() {
        return tickingID;
    }

    /**
     * Sets the value of the tickingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setTickingID(IDType value) {
        this.tickingID = value;
    }

    /**
     * Gets the value of the applicationNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getApplicationNumberID() {
        return applicationNumberID;
    }

    /**
     * Sets the value of the applicationNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setApplicationNumberID(IDType value) {
        this.applicationNumberID = value;
    }

    /**
     * Gets the value of the achievedWorkCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAchievedWorkCategoryID() {
        return achievedWorkCategoryID;
    }

    /**
     * Sets the value of the achievedWorkCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAchievedWorkCategoryID(IDType value) {
        this.achievedWorkCategoryID = value;
    }

    /**
     * Gets the value of the distributionKeyID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getDistributionKeyID() {
        return distributionKeyID;
    }

    /**
     * Sets the value of the distributionKeyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setDistributionKeyID(IDType value) {
        this.distributionKeyID = value;
    }

    /**
     * Gets the value of the perquisiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPerquisiteCodeType }
     *     
     */
    public AccountingPerquisiteCodeType getPerquisiteCode() {
        return perquisiteCode;
    }

    /**
     * Sets the value of the perquisiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPerquisiteCodeType }
     *     
     */
    public void setPerquisiteCode(AccountingPerquisiteCodeType value) {
        this.perquisiteCode = value;
    }

    /**
     * Gets the value of the refundMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link RefundMethodCodeType }
     *     
     */
    public RefundMethodCodeType getRefundMethodCode() {
        return refundMethodCode;
    }

    /**
     * Sets the value of the refundMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundMethodCodeType }
     *     
     */
    public void setRefundMethodCode(RefundMethodCodeType value) {
        this.refundMethodCode = value;
    }

    /**
     * Gets the value of the remunerationTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRemunerationTypeID() {
        return remunerationTypeID;
    }

    /**
     * Sets the value of the remunerationTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRemunerationTypeID(IDType value) {
        this.remunerationTypeID = value;
    }

    /**
     * Gets the value of the matchingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getMatchingDateTime() {
        return matchingDateTime;
    }

    /**
     * Sets the value of the matchingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setMatchingDateTime(DateTimeType value) {
        this.matchingDateTime = value;
    }

    /**
     * Gets the value of the bookingAAAEntryAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingAAAEntryAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingAAAEntryAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAAEntryAccountingAccountType }
     * 
     * 
     */
    public List<AAAEntryAccountingAccountType> getBookingAAAEntryAccountingAccount() {
        if (bookingAAAEntryAccountingAccount == null) {
            bookingAAAEntryAccountingAccount = new ArrayList<AAAEntryAccountingAccountType>();
        }
        return this.bookingAAAEntryAccountingAccount;
    }

}
