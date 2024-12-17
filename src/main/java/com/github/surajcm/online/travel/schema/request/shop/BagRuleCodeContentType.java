
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration set for the currency application code Type BDT. {codeListAgencyIdentifier}PADIS 7365{/codeListAgencyIdentifier} {codeListAgencyName}PADIS{/codeListAgencyName}
 * 
 * <p>Java class for BagRuleCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BagRuleCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="D"/>
 *     <enumeration value="N"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Y"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BagRuleCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum BagRuleCodeContentType {


    /**
     * Disclosure with NO US DOT Reservation
     * 
     */
    D("D"),

    /**
     * No Disclosure or US DOT Reservation
     * 
     */
    N("N"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Disclosure and US DOT Reservation
     * 
     */
    Y("Y");
    private final String value;

    BagRuleCodeContentType(String v) {
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
    public static BagRuleCodeContentType fromValue(String v) {
        for (BagRuleCodeContentType c: BagRuleCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
