
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration set values for Penalty Type. {codeListAgencyName}IATA AIDM{/codeListAgencyName}
 * 
 * <p>Java class for PenaltyTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PenaltyTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Cancellation"/>
 *     <enumeration value="Change"/>
 *     <enumeration value="NoShow"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Upgrade"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
@XmlEnum
public enum PenaltyTypeCodeContentType {


    /**
     * Cancellation
     * 
     */
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),

    /**
     * Change
     * 
     */
    @XmlEnumValue("Change")
    CHANGE("Change"),

    /**
     * NoShow
     * 
     */
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Upgrade
     * 
     */
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade");
    private final String value;

    PenaltyTypeCodeContentType(String v) {
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
    public static PenaltyTypeCodeContentType fromValue(String v) {
        for (PenaltyTypeCodeContentType c: PenaltyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
