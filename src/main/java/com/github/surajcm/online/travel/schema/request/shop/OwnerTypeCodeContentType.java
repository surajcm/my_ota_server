
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration values for Owner Type BDT. {codeListAgencyName}IATA AIDM{/codeListAgencyName}
 * 
 * <p>Java class for OwnerTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OwnerTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="ORA"/>
 *     <enumeration value="POA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OwnerTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum OwnerTypeCodeContentType {


    /**
     * Offer Responsible Airline
     * 
     */
    ORA,

    /**
     * Participating Offer Airline
     * 
     */
    POA;

    public String value() {
        return name();
    }

    public static OwnerTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
