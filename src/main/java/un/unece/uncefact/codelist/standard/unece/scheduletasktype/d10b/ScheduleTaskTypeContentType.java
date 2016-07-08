
package un.unece.uncefact.codelist.standard.unece.scheduletasktype.d10b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleTaskTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScheduleTaskTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="HAM"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScheduleTaskTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B")
@XmlEnum
public enum ScheduleTaskTypeContentType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Contractual Milestone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A contractual goal that must be accomplished or a key event that must occur for a project.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    CM,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Activity&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An activity is a single atomic unit of work to be accomplished.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    AC,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Finish activity&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Last task in a networked schedule.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    FA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hammock&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This task type is used to create a pseudo-summary over detailed tasks that are not subordinate to this task.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    HAM,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Milestone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A milestone is a specific goal to be accomplished within a project.  Milestones typically have zero duration.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    MS,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Start activity&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;First task in a networked schedule.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    SA,

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Summary&lt;/ccts:Name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D10B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A summary task summarizes detailed subordinate activities.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 
     */
    SUM;

    public String value() {
        return name();
    }

    public static ScheduleTaskTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
