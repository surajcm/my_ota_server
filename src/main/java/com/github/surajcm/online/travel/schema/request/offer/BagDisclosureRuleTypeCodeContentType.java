
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration values for Bag Disclosure Rule Type.
 * 
 * <p>Java class for BagDisclosureRuleTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BagDisclosureRuleTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="D"/>
 *     <enumeration value="N"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Y"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BagDisclosureRuleTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
@XmlEnum
public enum BagDisclosureRuleTypeCodeContentType {


    /**
     * Disclosure with no US DOT Reservation
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

    BagDisclosureRuleTypeCodeContentType(String v) {
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
    public static BagDisclosureRuleTypeCodeContentType fromValue(String v) {
        for (BagDisclosureRuleTypeCodeContentType c: BagDisclosureRuleTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
