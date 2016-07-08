
package un.unece.uncefact.codelist.standard.unece.costmanagementcode.d10b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostManagementCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostManagementCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ABC"/>
 *     &lt;enumeration value="TBR"/>
 *     &lt;enumeration value="ACP"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="BCP"/>
 *     &lt;enumeration value="BCS"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="DAW"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="FC"/>
 *     &lt;enumeration value="FOB"/>
 *     &lt;enumeration value="NAF"/>
 *     &lt;enumeration value="NDW"/>
 *     &lt;enumeration value="NRC"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="OCC"/>
 *     &lt;enumeration value="OCN"/>
 *     &lt;enumeration value="OF"/>
 *     &lt;enumeration value="REC"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TOT"/>
 *     &lt;enumeration value="VCA"/>
 *     &lt;enumeration value="VSA"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostManagementCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B")
@XmlEnum
public enum CostManagementCodeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Authorized Baseline Changes&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The amount that was authorized for baseline changes.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    ABC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total Budget Reprogramming&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The total of all budget reprogramming&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    TBR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Actual cost of work performed&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The actual cost of work performed to accomplish a task, whether or not the task itself is complete.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    ACP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accrued expenditures&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Expenditures for which it is known that payment will be made, but for which payment has not actually been made.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AE,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Funding authorized to date&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Funding amount which has been authorized to be expended.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Budgeted cost of work performed&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The cost that was budgeted for tasks that have been completed, regardless of the actual cost of completing those tasks.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    BCP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Budgeted cost of work scheduled&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The amount budgeted for completion of a task or tasks.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    BCS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Cost adjustment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An adjustment to an existing cost.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    CA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contract work authorized and defined&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The cost of contract work that has been both authorized and defined by the contractee.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    DAW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Estimated amount&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An amount that has been estimated.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    EST,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Funds carry-over&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Funds that have been authorized for use within a prior fiscal period that had not been spent and are being added to the existing fiscal period.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    FC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Forecast of billings&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An estimate of costs that will be billed to the contractee at a future date.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    FOB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Forecast of not yet authorized funding&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An estimate of future funding that has not yet been authorized by the contractee.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    NAF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contract work authorized but not definitized&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Work on a contract that has been authorized by the contractee but for which the scope has been fully determined.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    NDW,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Non-recurring&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs that are single occurrence.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    NRC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Open contract commitment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An estimate of costs that the contractor is obligated to pay.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    OC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Open contract commitment, cancellable&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An estimate of costs, excluding accrued expenditures, that the contractor can make void if the contract does not continue to completion.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    OCC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Open contract commitment, non-cancellable&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An estimate of costs, excluding accrued expenditures, that the contractor cannot make void if the contract does not continue to completion.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    OCN,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Forecast of funding for all other work&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An estimate of future funding for all work not otherwise defined.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    OF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Recurring&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs that recurr on a periodic basis.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    REC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Schedule adjustment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An adjustment to a schedule.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    SA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs to terminate the contract&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The amount contractually defined to be paid by the parties of the contract in the event of contract termination.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    TC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total costs.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    TOT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Reprogram variance cost adjustment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An adjustment to cost variance in the event of reprogramming the budget baseline of a project.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    VCA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Reprogram variance schedule adjustment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An adjustment to schedule variance in the event of reprogramming the budget baseline of a project.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    VSA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually defined&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69653="urn:un:unece:uncefact:codelist:standard:UNECE:CostManagementCode:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually agreed upon cost management code.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    ZZZ;

    public String value() {
        return name();
    }

    public static CostManagementCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
