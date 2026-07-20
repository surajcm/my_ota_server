
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for RoundingPrecisionCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RoundingPrecisionCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Down"/>
 *     <enumeration value="Up"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoundingPrecisionCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
@XmlEnum
public enum RoundingPrecisionCodeContentType {


    /**
     * round down
     * 
     */
    @XmlEnumValue("Down")
    DOWN("Down"),

    /**
     * round up
     * 
     */
    @XmlEnumValue("Up")
    UP("Up");
    private final String value;

    RoundingPrecisionCodeContentType(String v) {
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
    public static RoundingPrecisionCodeContentType fromValue(String v) {
        for (RoundingPrecisionCodeContentType c: RoundingPrecisionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
