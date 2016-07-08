
package un.unece.uncefact.data.standard.reusableaggregatebusinessinformationentity._18;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.VolumeUnitMeasureType;
import un.unece.uncefact.data.standard.qualifieddatatype._17.WeightUnitMeasureType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.AmountType;
import un.unece.uncefact.data.standard.unqualifieddatatype._18.QuantityType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UN01005621&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;ABIE&lt;/ccts:Acronym&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI_ Supply Chain_ Consignment. Details&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A separately identifiable collection of goods items to be transported or available to be transported from one consignor to one consignee in a Cross Industry (CI) supply chain via one or more modes of transport under a single transport contract.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Consignment&lt;/ccts:ObjectClassTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CI&lt;/ccts:ObjectClassQualifierTerm&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:ObjectClassQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:qdt="urn:un:unece:uncefact:data:standard:QualifiedDataType:17" xmlns:ram="urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18" xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Supply Chain&lt;/ccts:ObjectClassQualifierTerm&gt;
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
 * <p>Java class for CISupplyChainConsignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CISupplyChainConsignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssociatedInvoiceAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeclaredValueForCustomsAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalChargeAmount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}AmountType" minOccurs="0"/>
 *         &lt;element name="PackageQuantity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:18}QuantityType" minOccurs="0"/>
 *         &lt;element name="GrossWeightMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}WeightUnitMeasureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetWeightMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}WeightUnitMeasureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GrossVolumeMeasure" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:17}VolumeUnitMeasureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsignorCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="ConsigneeCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="DeliveryCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="SpecifiedCILogisticsTransportMovement" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CILogisticsTransportMovementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomsImportAgentCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="CustomsExportAgentCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="CarrierCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="TransportContractCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" minOccurs="0"/>
 *         &lt;element name="UtilizedCILogisticsTransportEquipment" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CILogisticsTransportEquipmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreightForwarderCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" minOccurs="0"/>
 *         &lt;element name="GroupingCentreCITradeParty" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CITradePartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IncludedCISupplyChainConsignmentItem" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CISupplyChainConsignmentItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociatedCIReferencedDocument" type="{urn:un:unece:uncefact:data:standard:ReusableAggregateBusinessInformationEntity:18}CIReferencedDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CISupplyChainConsignmentType", propOrder = {
    "associatedInvoiceAmount",
    "declaredValueForCustomsAmount",
    "totalChargeAmount",
    "packageQuantity",
    "grossWeightMeasure",
    "netWeightMeasure",
    "grossVolumeMeasure",
    "consignorCITradeParty",
    "consigneeCITradeParty",
    "deliveryCITradeParty",
    "specifiedCILogisticsTransportMovement",
    "customsImportAgentCITradeParty",
    "customsExportAgentCITradeParty",
    "carrierCITradeParty",
    "transportContractCIReferencedDocument",
    "utilizedCILogisticsTransportEquipment",
    "freightForwarderCITradeParty",
    "groupingCentreCITradeParty",
    "includedCISupplyChainConsignmentItem",
    "associatedCIReferencedDocument"
})
public class CISupplyChainConsignmentType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AssociatedInvoiceAmount")
    protected List<AmountType> associatedInvoiceAmount;
    @XmlElement(name = "DeclaredValueForCustomsAmount")
    protected AmountType declaredValueForCustomsAmount;
    @XmlElement(name = "TotalChargeAmount")
    protected AmountType totalChargeAmount;
    @XmlElement(name = "PackageQuantity")
    protected QuantityType packageQuantity;
    @XmlElement(name = "GrossWeightMeasure")
    protected List<WeightUnitMeasureType> grossWeightMeasure;
    @XmlElement(name = "NetWeightMeasure")
    protected List<WeightUnitMeasureType> netWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure")
    protected List<VolumeUnitMeasureType> grossVolumeMeasure;
    @XmlElement(name = "ConsignorCITradeParty")
    protected CITradePartyType consignorCITradeParty;
    @XmlElement(name = "ConsigneeCITradeParty")
    protected CITradePartyType consigneeCITradeParty;
    @XmlElement(name = "DeliveryCITradeParty")
    protected CITradePartyType deliveryCITradeParty;
    @XmlElement(name = "SpecifiedCILogisticsTransportMovement")
    protected List<CILogisticsTransportMovementType> specifiedCILogisticsTransportMovement;
    @XmlElement(name = "CustomsImportAgentCITradeParty")
    protected CITradePartyType customsImportAgentCITradeParty;
    @XmlElement(name = "CustomsExportAgentCITradeParty")
    protected CITradePartyType customsExportAgentCITradeParty;
    @XmlElement(name = "CarrierCITradeParty")
    protected CITradePartyType carrierCITradeParty;
    @XmlElement(name = "TransportContractCIReferencedDocument")
    protected CIReferencedDocumentType transportContractCIReferencedDocument;
    @XmlElement(name = "UtilizedCILogisticsTransportEquipment")
    protected List<CILogisticsTransportEquipmentType> utilizedCILogisticsTransportEquipment;
    @XmlElement(name = "FreightForwarderCITradeParty")
    protected CITradePartyType freightForwarderCITradeParty;
    @XmlElement(name = "GroupingCentreCITradeParty")
    protected List<CITradePartyType> groupingCentreCITradeParty;
    @XmlElement(name = "IncludedCISupplyChainConsignmentItem")
    protected List<CISupplyChainConsignmentItemType> includedCISupplyChainConsignmentItem;
    @XmlElement(name = "AssociatedCIReferencedDocument")
    protected List<CIReferencedDocumentType> associatedCIReferencedDocument;

    /**
     * Gets the value of the associatedInvoiceAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedInvoiceAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedInvoiceAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAssociatedInvoiceAmount() {
        if (associatedInvoiceAmount == null) {
            associatedInvoiceAmount = new ArrayList<AmountType>();
        }
        return this.associatedInvoiceAmount;
    }

    /**
     * Gets the value of the declaredValueForCustomsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeclaredValueForCustomsAmount() {
        return declaredValueForCustomsAmount;
    }

    /**
     * Sets the value of the declaredValueForCustomsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeclaredValueForCustomsAmount(AmountType value) {
        this.declaredValueForCustomsAmount = value;
    }

    /**
     * Gets the value of the totalChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalChargeAmount() {
        return totalChargeAmount;
    }

    /**
     * Sets the value of the totalChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalChargeAmount(AmountType value) {
        this.totalChargeAmount = value;
    }

    /**
     * Gets the value of the packageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * Sets the value of the packageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setPackageQuantity(QuantityType value) {
        this.packageQuantity = value;
    }

    /**
     * Gets the value of the grossWeightMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossWeightMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossWeightMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightUnitMeasureType }
     * 
     * 
     */
    public List<WeightUnitMeasureType> getGrossWeightMeasure() {
        if (grossWeightMeasure == null) {
            grossWeightMeasure = new ArrayList<WeightUnitMeasureType>();
        }
        return this.grossWeightMeasure;
    }

    /**
     * Gets the value of the netWeightMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netWeightMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetWeightMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightUnitMeasureType }
     * 
     * 
     */
    public List<WeightUnitMeasureType> getNetWeightMeasure() {
        if (netWeightMeasure == null) {
            netWeightMeasure = new ArrayList<WeightUnitMeasureType>();
        }
        return this.netWeightMeasure;
    }

    /**
     * Gets the value of the grossVolumeMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossVolumeMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossVolumeMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolumeUnitMeasureType }
     * 
     * 
     */
    public List<VolumeUnitMeasureType> getGrossVolumeMeasure() {
        if (grossVolumeMeasure == null) {
            grossVolumeMeasure = new ArrayList<VolumeUnitMeasureType>();
        }
        return this.grossVolumeMeasure;
    }

    /**
     * Gets the value of the consignorCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getConsignorCITradeParty() {
        return consignorCITradeParty;
    }

    /**
     * Sets the value of the consignorCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setConsignorCITradeParty(CITradePartyType value) {
        this.consignorCITradeParty = value;
    }

    /**
     * Gets the value of the consigneeCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getConsigneeCITradeParty() {
        return consigneeCITradeParty;
    }

    /**
     * Sets the value of the consigneeCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setConsigneeCITradeParty(CITradePartyType value) {
        this.consigneeCITradeParty = value;
    }

    /**
     * Gets the value of the deliveryCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getDeliveryCITradeParty() {
        return deliveryCITradeParty;
    }

    /**
     * Sets the value of the deliveryCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setDeliveryCITradeParty(CITradePartyType value) {
        this.deliveryCITradeParty = value;
    }

    /**
     * Gets the value of the specifiedCILogisticsTransportMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedCILogisticsTransportMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedCILogisticsTransportMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CILogisticsTransportMovementType }
     * 
     * 
     */
    public List<CILogisticsTransportMovementType> getSpecifiedCILogisticsTransportMovement() {
        if (specifiedCILogisticsTransportMovement == null) {
            specifiedCILogisticsTransportMovement = new ArrayList<CILogisticsTransportMovementType>();
        }
        return this.specifiedCILogisticsTransportMovement;
    }

    /**
     * Gets the value of the customsImportAgentCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getCustomsImportAgentCITradeParty() {
        return customsImportAgentCITradeParty;
    }

    /**
     * Sets the value of the customsImportAgentCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setCustomsImportAgentCITradeParty(CITradePartyType value) {
        this.customsImportAgentCITradeParty = value;
    }

    /**
     * Gets the value of the customsExportAgentCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getCustomsExportAgentCITradeParty() {
        return customsExportAgentCITradeParty;
    }

    /**
     * Sets the value of the customsExportAgentCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setCustomsExportAgentCITradeParty(CITradePartyType value) {
        this.customsExportAgentCITradeParty = value;
    }

    /**
     * Gets the value of the carrierCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getCarrierCITradeParty() {
        return carrierCITradeParty;
    }

    /**
     * Sets the value of the carrierCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setCarrierCITradeParty(CITradePartyType value) {
        this.carrierCITradeParty = value;
    }

    /**
     * Gets the value of the transportContractCIReferencedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public CIReferencedDocumentType getTransportContractCIReferencedDocument() {
        return transportContractCIReferencedDocument;
    }

    /**
     * Sets the value of the transportContractCIReferencedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIReferencedDocumentType }
     *     
     */
    public void setTransportContractCIReferencedDocument(CIReferencedDocumentType value) {
        this.transportContractCIReferencedDocument = value;
    }

    /**
     * Gets the value of the utilizedCILogisticsTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilizedCILogisticsTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilizedCILogisticsTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CILogisticsTransportEquipmentType }
     * 
     * 
     */
    public List<CILogisticsTransportEquipmentType> getUtilizedCILogisticsTransportEquipment() {
        if (utilizedCILogisticsTransportEquipment == null) {
            utilizedCILogisticsTransportEquipment = new ArrayList<CILogisticsTransportEquipmentType>();
        }
        return this.utilizedCILogisticsTransportEquipment;
    }

    /**
     * Gets the value of the freightForwarderCITradeParty property.
     * 
     * @return
     *     possible object is
     *     {@link CITradePartyType }
     *     
     */
    public CITradePartyType getFreightForwarderCITradeParty() {
        return freightForwarderCITradeParty;
    }

    /**
     * Sets the value of the freightForwarderCITradeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CITradePartyType }
     *     
     */
    public void setFreightForwarderCITradeParty(CITradePartyType value) {
        this.freightForwarderCITradeParty = value;
    }

    /**
     * Gets the value of the groupingCentreCITradeParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingCentreCITradeParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingCentreCITradeParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CITradePartyType }
     * 
     * 
     */
    public List<CITradePartyType> getGroupingCentreCITradeParty() {
        if (groupingCentreCITradeParty == null) {
            groupingCentreCITradeParty = new ArrayList<CITradePartyType>();
        }
        return this.groupingCentreCITradeParty;
    }

    /**
     * Gets the value of the includedCISupplyChainConsignmentItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includedCISupplyChainConsignmentItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludedCISupplyChainConsignmentItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CISupplyChainConsignmentItemType }
     * 
     * 
     */
    public List<CISupplyChainConsignmentItemType> getIncludedCISupplyChainConsignmentItem() {
        if (includedCISupplyChainConsignmentItem == null) {
            includedCISupplyChainConsignmentItem = new ArrayList<CISupplyChainConsignmentItemType>();
        }
        return this.includedCISupplyChainConsignmentItem;
    }

    /**
     * Gets the value of the associatedCIReferencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedCIReferencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedCIReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIReferencedDocumentType }
     * 
     * 
     */
    public List<CIReferencedDocumentType> getAssociatedCIReferencedDocument() {
        if (associatedCIReferencedDocument == null) {
            associatedCIReferencedDocument = new ArrayList<CIReferencedDocumentType>();
        }
        return this.associatedCIReferencedDocument;
    }

}
