
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used PADIS Codeset FAT Fare or application penalty type. BUT this is used generically to indicate stages of a journey  Contains list of Stages of a flight journey NO SHOW PRIOR TO DEPARTURE AFTER DEPARTURE {codeListAgencyIdentifier}3{/codeListAgencyIdentifier} {codeListAgencyName}IATA{/codeListAgencyName} {codeListName}Journey Stage  Code List{/codeListName} {codeListIdentifier}BCL20062{/codeListIdentifier}
 * 
 * <p>Java class for JourneyStageTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="JourneyStageTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="After Departure"/>
 *     <enumeration value="No Show"/>
 *     <enumeration value="Prior To Departure"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "JourneyStageTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
@XmlEnum
public enum JourneyStageTypeCodeContentType {


    /**
     * After Departure  any time after a journey segment which was included in the offer/order item  has taken place irrespective of whether the segment was flown or not.
     * 
     */
    @XmlEnumValue("After Departure")
    AFTER_DEPARTURE("After Departure"),

    /**
     * No Show when passenger(s)  have not turned up for any of the flights in the itinerary.
     * 
     */
    @XmlEnumValue("No Show")
    NO_SHOW("No Show"),

    /**
     * Prior to Departure  any time before the first flight segment but after payment received.
     * 
     */
    @XmlEnumValue("Prior To Departure")
    PRIOR_TO_DEPARTURE("Prior To Departure");
    private final String value;

    JourneyStageTypeCodeContentType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static JourneyStageTypeCodeContentType fromValue(String v) {
        for (JourneyStageTypeCodeContentType c: JourneyStageTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
