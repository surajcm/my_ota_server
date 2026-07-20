
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration values for Owner Type BDT. {codeListAgencyName}IATA AIDM{/codeListAgencyName}
 * 
 * <p>Java class for MatchTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MatchTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Full"/>
 *     <enumeration value="None"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Partial"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MatchTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
@XmlEnum
public enum MatchTypeCodeContentType {


    /**
     * Full
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * None
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Partial
     * 
     */
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    MatchTypeCodeContentType(String v) {
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
    public static MatchTypeCodeContentType fromValue(String v) {
        for (MatchTypeCodeContentType c: MatchTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
