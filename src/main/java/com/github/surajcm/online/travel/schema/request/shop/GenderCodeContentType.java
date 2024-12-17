
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration set for Gender Code. {codeListAgencyName}ICAO{/codeListAgencyName} {codeListName}Document 9303 Sex of the holder{/codeListName}
 * 
 * <p>Java class for GenderCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GenderCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="F"/>
 *     <enumeration value="M"/>
 *     <enumeration value="X"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GenderCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum GenderCodeContentType {


    /**
     * Female
     * 
     */
    F,

    /**
     * Male
     * 
     */
    M,

    /**
     * Unspecified
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static GenderCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
