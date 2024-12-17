
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Airline preferences for a shopping request.
 * 
 * <p>Java class for CarrierCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CarrierCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType"/>
 *         <element name="FlightHaulTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightHaulCodeType" minOccurs="0"/>
 *         <element name="GeographicalIndTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProductDetailsCodeType" minOccurs="0"/>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "carrier",
    "flightHaulTypeCode",
    "geographicalIndTypeCode",
    "prefLevel"
})
public class CarrierCriteriaType {

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "Carrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected CarrierType carrier;
    /**
     * Flight haul length type. Example: LH (long haul 6 hrs plus).
     * 
     */
    @XmlElement(name = "FlightHaulTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String flightHaulTypeCode;
    /**
     * Geographical indicator type. Example: DOM (Domestic)
     * 
     */
    @XmlElement(name = "GeographicalIndTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String geographicalIndTypeCode;
    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PrefLevelType prefLevel;

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * Flight haul length type. Example: LH (long haul 6 hrs plus).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightHaulTypeCode() {
        return flightHaulTypeCode;
    }

    /**
     * Sets the value of the flightHaulTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightHaulTypeCode()
     */
    public void setFlightHaulTypeCode(String value) {
        this.flightHaulTypeCode = value;
    }

    /**
     * Geographical indicator type. Example: DOM (Domestic)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicalIndTypeCode() {
        return geographicalIndTypeCode;
    }

    /**
     * Sets the value of the geographicalIndTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGeographicalIndTypeCode()
     */
    public void setGeographicalIndTypeCode(String value) {
        this.geographicalIndTypeCode = value;
    }

    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     * @see #getPrefLevel()
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
