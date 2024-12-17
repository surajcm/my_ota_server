
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Agency/ Agent Identification Type. {codeListAgencyName}PADIS{/codeListAgencyName} {codeListName}Identification type{/codeListName} {codeListIdentifier}9893{/codeListIdentifier}
 * 
 * <p>Java class for TravelAgencyTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TravelAgencyTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="OnlineTravelAgency"/>
 *     <enumeration value="TravelAgency"/>
 *     <enumeration value="TravelManagementCompany"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TravelAgencyTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum TravelAgencyTypeCodeContentType {

    @XmlEnumValue("OnlineTravelAgency")
    ONLINE_TRAVEL_AGENCY("OnlineTravelAgency"),
    @XmlEnumValue("TravelAgency")
    TRAVEL_AGENCY("TravelAgency"),
    @XmlEnumValue("TravelManagementCompany")
    TRAVEL_MANAGEMENT_COMPANY("TravelManagementCompany");
    private final String value;

    TravelAgencyTypeCodeContentType(String v) {
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
    public static TravelAgencyTypeCodeContentType fromValue(String v) {
        for (TravelAgencyTypeCodeContentType c: TravelAgencyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
