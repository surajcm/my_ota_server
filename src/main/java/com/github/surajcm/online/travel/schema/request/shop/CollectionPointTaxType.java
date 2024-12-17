
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tax data breakdown by collection point for XF(Passenger Facility Fee) and ZP(federal tax segment) taxes.
 * 
 * <p>Java class for CollectionPointTaxType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CollectionPointTaxType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AirportAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType"/>
 *         <element name="AirportCur" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="Station" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}StationType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionPointTaxType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "airportAmount",
    "airportCur",
    "station"
})
public class CollectionPointTaxType {

    /**
     * Amount filed by the airport in the currency applicable to the geographical location of the airport.
     * 
     */
    @XmlElement(name = "AirportAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected AmountType airportAmount;
    @XmlElement(name = "AirportCur", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airportCur;
    /**
     * Location or facility where air or surface transportation originates, stops and/or terminates, and where passengers and/or cargo can be taken on or off.
     * 
     */
    @XmlElement(name = "Station", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected StationType station;

    /**
     * Amount filed by the airport in the currency applicable to the geographical location of the airport.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAirportAmount() {
        return airportAmount;
    }

    /**
     * Sets the value of the airportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAirportAmount()
     */
    public void setAirportAmount(AmountType value) {
        this.airportAmount = value;
    }

    /**
     * Gets the value of the airportCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCur() {
        return airportCur;
    }

    /**
     * Sets the value of the airportCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCur(String value) {
        this.airportCur = value;
    }

    /**
     * Location or facility where air or surface transportation originates, stops and/or terminates, and where passengers and/or cargo can be taken on or off.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     * @see #getStation()
     */
    public void setStation(StationType value) {
        this.station = value;
    }

}
