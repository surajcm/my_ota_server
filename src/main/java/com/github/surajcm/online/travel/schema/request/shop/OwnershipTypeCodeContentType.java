
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ownership Type Code
 * 
 * <p>Java class for OwnershipTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OwnershipTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="CS"/>
 *     <enumeration value="SL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OwnershipTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum OwnershipTypeCodeContentType {


    /**
     * Customer
     * 
     */
    CS,

    /**
     * Seller
     * 
     */
    SL;

    public String value() {
        return name();
    }

    public static OwnershipTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
