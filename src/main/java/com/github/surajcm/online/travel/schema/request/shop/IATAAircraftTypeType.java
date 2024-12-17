
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Grouping of aircrafts with the same form, function and specification, currently flown, or soon to be flown. Possible types are defined in the IATA SSIM.
 * 
 * <p>Java class for IATA_AircraftTypeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IATA_AircraftTypeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IATA_AircraftTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_AircraftTypeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_AircraftTypeType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "iataAircraftTypeCode"
})
public class IATAAircraftTypeType {

    /**
     * Code assigned to an aircraft type in IATA SSIM.
     * 
     */
    @XmlElement(name = "IATA_AircraftTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iataAircraftTypeCode;

    /**
     * Code assigned to an aircraft type in IATA SSIM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATAAircraftTypeCode() {
        return iataAircraftTypeCode;
    }

    /**
     * Sets the value of the iataAircraftTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATAAircraftTypeCode()
     */
    public void setIATAAircraftTypeCode(String value) {
        this.iataAircraftTypeCode = value;
    }

}
