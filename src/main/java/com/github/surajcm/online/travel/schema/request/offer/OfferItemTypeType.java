
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Offer Item Type used for long sell transactions.
 * 
 * <p>Java class for OfferItemTypeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OfferItemTypeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="BaggageItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BaggageItemType"/>
 *         <element name="FlightItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}FlightItemType"/>
 *         <element name="OtherItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OtherItemType"/>
 *         <element name="SeatItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatItemType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemTypeType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "baggageItem",
    "flightItem",
    "otherItem",
    "seatItem"
})
public class OfferItemTypeType {

    /**
     * Baggage service information used for long sells.
     * 
     */
    @XmlElement(name = "BaggageItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BaggageItemType baggageItem;
    /**
     * Flight service information used for long sells.
     * 
     */
    @XmlElement(name = "FlightItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected FlightItemType flightItem;
    /**
     * Other service information used for long sells.
     * 
     */
    @XmlElement(name = "OtherItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected OtherItemType otherItem;
    /**
     * Seat service information used for long sells.
     * 
     */
    @XmlElement(name = "SeatItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SeatItemType seatItem;

    /**
     * Baggage service information used for long sells.
     * 
     * @return
     *     possible object is
     *     {@link BaggageItemType }
     *     
     */
    public BaggageItemType getBaggageItem() {
        return baggageItem;
    }

    /**
     * Sets the value of the baggageItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageItemType }
     *     
     * @see #getBaggageItem()
     */
    public void setBaggageItem(BaggageItemType value) {
        this.baggageItem = value;
    }

    /**
     * Flight service information used for long sells.
     * 
     * @return
     *     possible object is
     *     {@link FlightItemType }
     *     
     */
    public FlightItemType getFlightItem() {
        return flightItem;
    }

    /**
     * Sets the value of the flightItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightItemType }
     *     
     * @see #getFlightItem()
     */
    public void setFlightItem(FlightItemType value) {
        this.flightItem = value;
    }

    /**
     * Other service information used for long sells.
     * 
     * @return
     *     possible object is
     *     {@link OtherItemType }
     *     
     */
    public OtherItemType getOtherItem() {
        return otherItem;
    }

    /**
     * Sets the value of the otherItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherItemType }
     *     
     * @see #getOtherItem()
     */
    public void setOtherItem(OtherItemType value) {
        this.otherItem = value;
    }

    /**
     * Seat service information used for long sells.
     * 
     * @return
     *     possible object is
     *     {@link SeatItemType }
     *     
     */
    public SeatItemType getSeatItem() {
        return seatItem;
    }

    /**
     * Sets the value of the seatItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatItemType }
     *     
     * @see #getSeatItem()
     */
    public void setSeatItem(SeatItemType value) {
        this.seatItem = value;
    }

}
