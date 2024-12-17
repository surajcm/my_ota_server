
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration set for the flight characteristics code BDT.
 * 
 * <p>Java class for FlightCharacteristicCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FlightCharacteristicCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AirportChange"/>
 *     <enumeration value="Direct"/>
 *     <enumeration value="NonStop"/>
 *     <enumeration value="OvernightStop"/>
 *     <enumeration value="RedEye"/>
 *     <enumeration value="WaitList"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FlightCharacteristicCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum FlightCharacteristicCodeContentType {

    @XmlEnumValue("AirportChange")
    AIRPORT_CHANGE("AirportChange"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("NonStop")
    NON_STOP("NonStop"),
    @XmlEnumValue("OvernightStop")
    OVERNIGHT_STOP("OvernightStop"),
    @XmlEnumValue("RedEye")
    RED_EYE("RedEye"),
    @XmlEnumValue("WaitList")
    WAIT_LIST("WaitList");
    private final String value;

    FlightCharacteristicCodeContentType(String v) {
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
    public static FlightCharacteristicCodeContentType fromValue(String v) {
        for (FlightCharacteristicCodeContentType c: FlightCharacteristicCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
