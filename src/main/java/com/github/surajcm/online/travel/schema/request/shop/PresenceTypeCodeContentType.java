
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Presence Type Code
 * 
 * <p>Java class for PresenceTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PresenceTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="CN"/>
 *     <enumeration value="CP"/>
 *     <enumeration value="CPCN"/>
 *     <enumeration value="CPCP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PresenceTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum PresenceTypeCodeContentType {


    /**
     * Customer not present
     * 
     */
    CN,

    /**
     * Customer present -> (e.g. for non-PaymentCard payment methods)
     * 
     */
    CP,

    /**
     * Customer present and card not present
     * 
     */
    CPCN,

    /**
     * Customer present and card present
     * 
     */
    CPCP;

    public String value() {
        return name();
    }

    public static PresenceTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
