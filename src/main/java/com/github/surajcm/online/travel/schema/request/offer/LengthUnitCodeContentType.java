
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of Length Unit Codes. Subset of UN/CEFACT Recommendation 20. {codeListAgencyName}AIDM (extract from UN/CEFACT){/codeListAgencyName}
 * 
 * <p>Java class for LengthUnitCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LengthUnitCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="CMT"/>
 *     <enumeration value="FOT"/>
 *     <enumeration value="INH"/>
 *     <enumeration value="MTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LengthUnitCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
@XmlEnum
public enum LengthUnitCodeContentType {


    /**
     * Centimeter
     * 
     */
    CMT,

    /**
     * Foot
     * 
     */
    FOT,

    /**
     * Inch
     * 
     */
    INH,

    /**
     * Meter
     * 
     */
    MTR;

    public String value() {
        return name();
    }

    public static LengthUnitCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
