
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains list of types of changes allowed Name, Flight Services {codeListAgencyIdentifier}3{/codeListAgencyIdentifier} {codeListAgencyName}IATA{/codeListAgencyName} {codeListName}RP 1745 Baggage Source Message Change Indicator Codes{/codeListName} {codeListIdentifier}BCL20062{/codeListIdentifier}
 * 
 * <p>Java class for ChangeTypeCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ChangeTypeCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Flight"/>
 *     <enumeration value="Name"/>
 *     <enumeration value="Service"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ChangeTypeCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
@XmlEnum
public enum ChangeTypeCodeContentType {


    /**
     * This identifies  Flight detail changes.  changes to the core flight details. departure and arrival points and airline.
     * 
     */
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),

    /**
     * Name based changes.    Changes to the passenger(s) names.
     * 
     */
    @XmlEnumValue("Name")
    NAME("Name"),

    /**
     * This identifies  Service non flight changes.   seat preferences/food/baggage etc.
     * 
     */
    @XmlEnumValue("Service")
    SERVICE("Service");
    private final String value;

    ChangeTypeCodeContentType(String v) {
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
    public static ChangeTypeCodeContentType fromValue(String v) {
        for (ChangeTypeCodeContentType c: ChangeTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
