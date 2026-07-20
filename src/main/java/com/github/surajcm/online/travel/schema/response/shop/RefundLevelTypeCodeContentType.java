
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains the levels of re fundability FULL PARTIAL NONE {codeListAgencyName}IATA AIDM{/codeListAgencyName}
 * 
 * <p>Java class for RefundLevelTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RefundLevelTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Full"/>
 *     <enumeration value="None"/>
 *     <enumeration value="Partial"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RefundLevelTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
@XmlEnum
public enum RefundLevelTypeCodeContentType {


    /**
     * Fully Refundable
     * 
     */
    @XmlEnumValue("Full")
    FULL("Full"),

    /**
     * Non Refundable
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    RefundLevelTypeCodeContentType(String v) {
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
    public static RefundLevelTypeCodeContentType fromValue(String v) {
        for (RefundLevelTypeCodeContentType c: RefundLevelTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
