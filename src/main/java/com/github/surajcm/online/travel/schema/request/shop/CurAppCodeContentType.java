
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Currency Application Code enumeration information.
 * 
 * <p>Java class for CurAppCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CurAppCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Actual"/>
 *     <enumeration value="Conversion"/>
 *     <enumeration value="Display"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Requested"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CurAppCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum CurAppCodeContentType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested");
    private final String value;

    CurAppCodeContentType(String v) {
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
    public static CurAppCodeContentType fromValue(String v) {
        for (CurAppCodeContentType c: CurAppCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
