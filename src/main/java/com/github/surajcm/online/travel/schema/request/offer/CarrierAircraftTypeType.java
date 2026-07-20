
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Carrier defined internal grouping of aircrafts with the same form, function and specification.
 * 
 * <p>Java class for CarrierAircraftTypeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CarrierAircraftTypeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CarrierAircraftTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="CarrierAircraftTypeName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierAircraftTypeType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "carrierAircraftTypeCode",
    "carrierAircraftTypeName"
})
public class CarrierAircraftTypeType {

    /**
     * Internal code used by an carrier to identify the type of aircraft.
     * 
     */
    @XmlElement(name = "CarrierAircraftTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierAircraftTypeCode;
    /**
     * Internal name given by the carrier to this aircraft type.
     * 
     */
    @XmlElement(name = "CarrierAircraftTypeName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierAircraftTypeName;

    /**
     * Internal code used by an carrier to identify the type of aircraft.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierAircraftTypeCode() {
        return carrierAircraftTypeCode;
    }

    /**
     * Sets the value of the carrierAircraftTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierAircraftTypeCode()
     */
    public void setCarrierAircraftTypeCode(String value) {
        this.carrierAircraftTypeCode = value;
    }

    /**
     * Internal name given by the carrier to this aircraft type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierAircraftTypeName() {
        return carrierAircraftTypeName;
    }

    /**
     * Sets the value of the carrierAircraftTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierAircraftTypeName()
     */
    public void setCarrierAircraftTypeName(String value) {
        this.carrierAircraftTypeName = value;
    }

}
