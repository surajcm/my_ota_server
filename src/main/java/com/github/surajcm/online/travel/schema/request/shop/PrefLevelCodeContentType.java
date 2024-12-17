
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Level of preference requested. Examples: Preferred, Required, or Exclude.
 * 
 * <p>Java class for PrefLevelCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PrefLevelCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Exclude"/>
 *     <enumeration value="Preferred"/>
 *     <enumeration value="Required"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PrefLevelCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum PrefLevelCodeContentType {

    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),

    /**
     * female description
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required");
    private final String value;

    PrefLevelCodeContentType(String v) {
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
    public static PrefLevelCodeContentType fromValue(String v) {
        for (PrefLevelCodeContentType c: PrefLevelCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
