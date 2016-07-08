
package un.unece.uncefact.codelist.standard.unece.responsetypecode.d15a;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="AH"/>
 *     &lt;enumeration value="AI"/>
 *     &lt;enumeration value="AJ"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AS"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="RE"/>
 *     &lt;enumeration value="UR"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UT"/>
 *     &lt;enumeration value="UU"/>
 *     &lt;enumeration value="UV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseTypeCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A")
@XmlEnum
public enum ResponseTypeCodeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Debit advice&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Receiver of the payment message needs to return a debit advice in response to the payment message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Message acknowledgement&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicates that an acknowledgement relating to receipt of message is required.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AB,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledge - with detail and change&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledge complete including changes.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledge - with detail, no change&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledge complete without changes.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AD,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Debit advice for each transaction&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A debit advice is requested for each transaction in the message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AE,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Debit advice/message acknowledgement&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The sender wishes to receive both a Debit Advice and an acknowledgement of receipt for a payment message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AF,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Authentication&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Authentication, by a party, of a document established for him by another party.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AG,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Debit advice/message acknowledgement for each transaction&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A debit advice and message acknowledgement are requested for each transaction in the message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AH,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledge only changes&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledgement of changes only is required.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AI,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Pending&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indication that the referenced offer or transaction (e.g. cargo booking or quotation request) is being dealt with.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AJ,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Accepted&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indication that the referenced offer or transaction (e.g., cargo booking or quotation request) has been accepted.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AP,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Response expected&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The sender of the message expects a response.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AQ,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct documentary credit collection&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Documentary credit collection forwarded directly.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Credit advice and message acknowledgement&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The receiver of the message is to acknowledge receipt of the message and sent a credit advice for each credit.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Conditionally accepted&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indication that the referenced offer or transaction (e.g., cargo booking or quotation request) has been accepted under conditions indicated in this message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    CA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Confirmation of measurements&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indication that the message contains the physical measurements on which the charges will be based.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    CO,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;No acknowledgement needed&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Specifies that no acknowledgement is needed in response to this message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    NA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Rejected&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indication that the referenced offer or transaction (e.g., cargo booking or quotation request) is not accepted.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    RE,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Credit advice&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The message recipient is to send a credit advice in response to the message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    UR,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledgement when error&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An acknowledgement is requested when an error occurred.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    US,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Acknowledgment due to error&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An acknowledgment is sent because an error was identified in the received message.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    UT,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Alternate date&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The solution proposed in the response applies to another date than the one requested.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    UU,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Alternate service&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm64343ResponseTypeCode="urn:un:unece:uncefact:codelist:standard:UNECE:ResponseTypeCode:D15A" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The solution proposed in the response applies to another service than the one requested.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    UV;

    public String value() {
        return name();
    }

    public static ResponseTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
