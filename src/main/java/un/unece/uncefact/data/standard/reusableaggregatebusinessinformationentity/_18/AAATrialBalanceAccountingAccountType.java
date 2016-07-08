
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountNatureTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountStatusCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingAccountTypeCodeType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.AccountingDebitCreditStatusCodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.CodeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.DateTimeType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.IDType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.TextType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01009228&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Trial Balance_ Accounting Account. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An AAA (Accounting And Audit) trial balance specific account for recording debits and credits to general accounting, cost accounting or budget accounting.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting Account&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;AAA Trial Balance&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ProductContextValue xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accounting, audit and reporting&lt;/ccts:ProductContextValue&gt;
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
 * <p>Java class for AAATrialBalanceAccountingAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AAATrialBalanceAccountingAccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountTypeCodeType" minOccurs="0"/>
 *         &lt;element name="SubAccountID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="AbbreviatedName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountStatusCodeType" minOccurs="0"/>
 *         &lt;element name="GroupRankCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}CodeType" minOccurs="0"/>
 *         &lt;element name="OpeningDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="OpeningResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="AggregationNomenclatureID" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}IDType" minOccurs="0"/>
 *         &lt;element name="BalanceNormalSignCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingDebitCreditStatusCodeType" minOccurs="0"/>
 *         &lt;element name="LockingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LockingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="ClosingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ClosingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="NatureCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}AccountingAccountNatureTypeCodeType" minOccurs="0"/>
 *         &lt;element name="LatestDebitPostingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LatestDebitPostingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="LatestCreditPostingDateTime" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LatestCreditPostingResponsiblePerson" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="LatestMatchingMark" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="LatestTickingMark" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}TextType" minOccurs="0"/>
 *         &lt;element name="LinkedAAATrialBalanceAccountingAccount" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAATrialBalanceAccountingAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DerivedAAATrialBalanceReport" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAATrialBalanceReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedAAATrialBalanceAccountingAccountClassification" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAATrialBalanceAccountingAccountClassificationType" minOccurs="0"/>
 *         &lt;element name="RelatedAAATrialBalanceAccountingLineMonetaryValue" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}AAATrialBalanceAccountingLineMonetaryValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AAATrialBalanceAccountingAccountType", propOrder = {
    "id",
    "typeCode",
    "subAccountID",
    "name",
    "abbreviatedName",
    "statusCode",
    "groupRankCode",
    "openingDateTime",
    "openingResponsiblePerson",
    "aggregationNomenclatureID",
    "balanceNormalSignCode",
    "lockingDateTime",
    "lockingResponsiblePerson",
    "closingDateTime",
    "closingResponsiblePerson",
    "natureCode",
    "latestDebitPostingDateTime",
    "latestDebitPostingResponsiblePerson",
    "latestCreditPostingDateTime",
    "latestCreditPostingResponsiblePerson",
    "latestMatchingMark",
    "latestTickingMark",
    "linkedAAATrialBalanceAccountingAccount",
    "derivedAAATrialBalanceReport",
    "relatedAAATrialBalanceAccountingAccountClassification",
    "relatedAAATrialBalanceAccountingLineMonetaryValue"
})
public class AAATrialBalanceAccountingAccountType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "TypeCode")
    protected AccountingAccountTypeCodeType typeCode;
    @XmlElement(name = "SubAccountID")
    protected List<IDType> subAccountID;
    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "AbbreviatedName")
    protected TextType abbreviatedName;
    @XmlElement(name = "StatusCode")
    protected AccountingAccountStatusCodeType statusCode;
    @XmlElement(name = "GroupRankCode")
    protected CodeType groupRankCode;
    @XmlElement(name = "OpeningDateTime")
    protected DateTimeType openingDateTime;
    @XmlElement(name = "OpeningResponsiblePerson")
    protected TextType openingResponsiblePerson;
    @XmlElement(name = "AggregationNomenclatureID")
    protected IDType aggregationNomenclatureID;
    @XmlElement(name = "BalanceNormalSignCode")
    protected AccountingDebitCreditStatusCodeType balanceNormalSignCode;
    @XmlElement(name = "LockingDateTime")
    protected DateTimeType lockingDateTime;
    @XmlElement(name = "LockingResponsiblePerson")
    protected TextType lockingResponsiblePerson;
    @XmlElement(name = "ClosingDateTime")
    protected DateTimeType closingDateTime;
    @XmlElement(name = "ClosingResponsiblePerson")
    protected TextType closingResponsiblePerson;
    @XmlElement(name = "NatureCode")
    protected AccountingAccountNatureTypeCodeType natureCode;
    @XmlElement(name = "LatestDebitPostingDateTime")
    protected DateTimeType latestDebitPostingDateTime;
    @XmlElement(name = "LatestDebitPostingResponsiblePerson")
    protected TextType latestDebitPostingResponsiblePerson;
    @XmlElement(name = "LatestCreditPostingDateTime")
    protected DateTimeType latestCreditPostingDateTime;
    @XmlElement(name = "LatestCreditPostingResponsiblePerson")
    protected TextType latestCreditPostingResponsiblePerson;
    @XmlElement(name = "LatestMatchingMark")
    protected TextType latestMatchingMark;
    @XmlElement(name = "LatestTickingMark")
    protected TextType latestTickingMark;
    @XmlElement(name = "LinkedAAATrialBalanceAccountingAccount")
    protected List<AAATrialBalanceAccountingAccountType> linkedAAATrialBalanceAccountingAccount;
    @XmlElement(name = "DerivedAAATrialBalanceReport")
    protected List<AAATrialBalanceReportType> derivedAAATrialBalanceReport;
    @XmlElement(name = "RelatedAAATrialBalanceAccountingAccountClassification")
    protected AAATrialBalanceAccountingAccountClassificationType relatedAAATrialBalanceAccountingAccountClassification;
    @XmlElement(name = "RelatedAAATrialBalanceAccountingLineMonetaryValue")
    protected List<AAATrialBalanceAccountingLineMonetaryValueType> relatedAAATrialBalanceAccountingLineMonetaryValue;

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
     * @return
     *     possible object is
     *     {@link AccountingAccountTypeCodeType }
     *     
     */
    public AccountingAccountTypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAccountTypeCodeType }
     *     
     */
    public void setTypeCode(AccountingAccountTypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the subAccountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subAccountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAccountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getSubAccountID() {
        if (subAccountID == null) {
            subAccountID = new ArrayList<IDType>();
        }
        return this.subAccountID;
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
     * Gets the value of the abbreviatedName property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAbbreviatedName() {
        return abbreviatedName;
    }

    /**
     * Sets the value of the abbreviatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAbbreviatedName(TextType value) {
        this.abbreviatedName = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAccountStatusCodeType }
     *     
     */
    public AccountingAccountStatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAccountStatusCodeType }
     *     
     */
    public void setStatusCode(AccountingAccountStatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the groupRankCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getGroupRankCode() {
        return groupRankCode;
    }

    /**
     * Sets the value of the groupRankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setGroupRankCode(CodeType value) {
        this.groupRankCode = value;
    }

    /**
     * Gets the value of the openingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOpeningDateTime() {
        return openingDateTime;
    }

    /**
     * Sets the value of the openingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOpeningDateTime(DateTimeType value) {
        this.openingDateTime = value;
    }

    /**
     * Gets the value of the openingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getOpeningResponsiblePerson() {
        return openingResponsiblePerson;
    }

    /**
     * Sets the value of the openingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setOpeningResponsiblePerson(TextType value) {
        this.openingResponsiblePerson = value;
    }

    /**
     * Gets the value of the aggregationNomenclatureID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getAggregationNomenclatureID() {
        return aggregationNomenclatureID;
    }

    /**
     * Sets the value of the aggregationNomenclatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setAggregationNomenclatureID(IDType value) {
        this.aggregationNomenclatureID = value;
    }

    /**
     * Gets the value of the balanceNormalSignCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingDebitCreditStatusCodeType }
     *     
     */
    public AccountingDebitCreditStatusCodeType getBalanceNormalSignCode() {
        return balanceNormalSignCode;
    }

    /**
     * Sets the value of the balanceNormalSignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingDebitCreditStatusCodeType }
     *     
     */
    public void setBalanceNormalSignCode(AccountingDebitCreditStatusCodeType value) {
        this.balanceNormalSignCode = value;
    }

    /**
     * Gets the value of the lockingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLockingDateTime() {
        return lockingDateTime;
    }

    /**
     * Sets the value of the lockingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLockingDateTime(DateTimeType value) {
        this.lockingDateTime = value;
    }

    /**
     * Gets the value of the lockingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLockingResponsiblePerson() {
        return lockingResponsiblePerson;
    }

    /**
     * Sets the value of the lockingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLockingResponsiblePerson(TextType value) {
        this.lockingResponsiblePerson = value;
    }

    /**
     * Gets the value of the closingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getClosingDateTime() {
        return closingDateTime;
    }

    /**
     * Sets the value of the closingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setClosingDateTime(DateTimeType value) {
        this.closingDateTime = value;
    }

    /**
     * Gets the value of the closingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getClosingResponsiblePerson() {
        return closingResponsiblePerson;
    }

    /**
     * Sets the value of the closingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setClosingResponsiblePerson(TextType value) {
        this.closingResponsiblePerson = value;
    }

    /**
     * Gets the value of the natureCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAccountNatureTypeCodeType }
     *     
     */
    public AccountingAccountNatureTypeCodeType getNatureCode() {
        return natureCode;
    }

    /**
     * Sets the value of the natureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAccountNatureTypeCodeType }
     *     
     */
    public void setNatureCode(AccountingAccountNatureTypeCodeType value) {
        this.natureCode = value;
    }

    /**
     * Gets the value of the latestDebitPostingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLatestDebitPostingDateTime() {
        return latestDebitPostingDateTime;
    }

    /**
     * Sets the value of the latestDebitPostingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLatestDebitPostingDateTime(DateTimeType value) {
        this.latestDebitPostingDateTime = value;
    }

    /**
     * Gets the value of the latestDebitPostingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestDebitPostingResponsiblePerson() {
        return latestDebitPostingResponsiblePerson;
    }

    /**
     * Sets the value of the latestDebitPostingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestDebitPostingResponsiblePerson(TextType value) {
        this.latestDebitPostingResponsiblePerson = value;
    }

    /**
     * Gets the value of the latestCreditPostingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLatestCreditPostingDateTime() {
        return latestCreditPostingDateTime;
    }

    /**
     * Sets the value of the latestCreditPostingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setLatestCreditPostingDateTime(DateTimeType value) {
        this.latestCreditPostingDateTime = value;
    }

    /**
     * Gets the value of the latestCreditPostingResponsiblePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestCreditPostingResponsiblePerson() {
        return latestCreditPostingResponsiblePerson;
    }

    /**
     * Sets the value of the latestCreditPostingResponsiblePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestCreditPostingResponsiblePerson(TextType value) {
        this.latestCreditPostingResponsiblePerson = value;
    }

    /**
     * Gets the value of the latestMatchingMark property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestMatchingMark() {
        return latestMatchingMark;
    }

    /**
     * Sets the value of the latestMatchingMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestMatchingMark(TextType value) {
        this.latestMatchingMark = value;
    }

    /**
     * Gets the value of the latestTickingMark property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLatestTickingMark() {
        return latestTickingMark;
    }

    /**
     * Sets the value of the latestTickingMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLatestTickingMark(TextType value) {
        this.latestTickingMark = value;
    }

    /**
     * Gets the value of the linkedAAATrialBalanceAccountingAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedAAATrialBalanceAccountingAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedAAATrialBalanceAccountingAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAATrialBalanceAccountingAccountType }
     * 
     * 
     */
    public List<AAATrialBalanceAccountingAccountType> getLinkedAAATrialBalanceAccountingAccount() {
        if (linkedAAATrialBalanceAccountingAccount == null) {
            linkedAAATrialBalanceAccountingAccount = new ArrayList<AAATrialBalanceAccountingAccountType>();
        }
        return this.linkedAAATrialBalanceAccountingAccount;
    }

    /**
     * Gets the value of the derivedAAATrialBalanceReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivedAAATrialBalanceReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivedAAATrialBalanceReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAATrialBalanceReportType }
     * 
     * 
     */
    public List<AAATrialBalanceReportType> getDerivedAAATrialBalanceReport() {
        if (derivedAAATrialBalanceReport == null) {
            derivedAAATrialBalanceReport = new ArrayList<AAATrialBalanceReportType>();
        }
        return this.derivedAAATrialBalanceReport;
    }

    /**
     * Gets the value of the relatedAAATrialBalanceAccountingAccountClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AAATrialBalanceAccountingAccountClassificationType }
     *     
     */
    public AAATrialBalanceAccountingAccountClassificationType getRelatedAAATrialBalanceAccountingAccountClassification() {
        return relatedAAATrialBalanceAccountingAccountClassification;
    }

    /**
     * Sets the value of the relatedAAATrialBalanceAccountingAccountClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AAATrialBalanceAccountingAccountClassificationType }
     *     
     */
    public void setRelatedAAATrialBalanceAccountingAccountClassification(AAATrialBalanceAccountingAccountClassificationType value) {
        this.relatedAAATrialBalanceAccountingAccountClassification = value;
    }

    /**
     * Gets the value of the relatedAAATrialBalanceAccountingLineMonetaryValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedAAATrialBalanceAccountingLineMonetaryValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedAAATrialBalanceAccountingLineMonetaryValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AAATrialBalanceAccountingLineMonetaryValueType }
     * 
     * 
     */
    public List<AAATrialBalanceAccountingLineMonetaryValueType> getRelatedAAATrialBalanceAccountingLineMonetaryValue() {
        if (relatedAAATrialBalanceAccountingLineMonetaryValue == null) {
            relatedAAATrialBalanceAccountingLineMonetaryValue = new ArrayList<AAATrialBalanceAccountingLineMonetaryValueType>();
        }
        return this.relatedAAATrialBalanceAccountingLineMonetaryValue;
    }

}
