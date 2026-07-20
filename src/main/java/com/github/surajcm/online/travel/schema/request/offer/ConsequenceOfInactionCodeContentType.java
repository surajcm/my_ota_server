
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Consequence Of Inaction
 * 
 * <p>Java class for ConsequenceOfInactionCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ConsequenceOfInactionCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="AutoAcceptance"/>
 *     <enumeration value="AutoCancellation"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConsequenceOfInactionCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
@XmlEnum
public enum ConsequenceOfInactionCodeContentType {


    /**
     * Auto-acceptance by airline
     * 
     */
    @XmlEnumValue("AutoAcceptance")
    AUTO_ACCEPTANCE("AutoAcceptance"),

    /**
     * Auto-cancellation by airline
     * 
     */
    @XmlEnumValue("AutoCancellation")
    AUTO_CANCELLATION("AutoCancellation");
    private final String value;

    ConsequenceOfInactionCodeContentType(String v) {
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
    public static ConsequenceOfInactionCodeContentType fromValue(String v) {
        for (ConsequenceOfInactionCodeContentType c: ConsequenceOfInactionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
