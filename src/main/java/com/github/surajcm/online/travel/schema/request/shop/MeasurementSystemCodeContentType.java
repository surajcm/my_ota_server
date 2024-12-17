
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration set for the measurement system code BDT. {codeListAgencyName}PADIS{/codeListAgencyName}
 * 
 * <p>Java class for MeasurementSystemCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MeasurementSystemCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Imperial"/>
 *     <enumeration value="Metric"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MeasurementSystemCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
@XmlEnum
public enum MeasurementSystemCodeContentType {

    @XmlEnumValue("Imperial")
    IMPERIAL("Imperial"),
    @XmlEnumValue("Metric")
    METRIC("Metric");
    private final String value;

    MeasurementSystemCodeContentType(String v) {
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
    public static MeasurementSystemCodeContentType fromValue(String v) {
        for (MeasurementSystemCodeContentType c: MeasurementSystemCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
