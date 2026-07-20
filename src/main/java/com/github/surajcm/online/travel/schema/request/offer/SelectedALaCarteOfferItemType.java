
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Use to select the quantity of Offer Items from the A La Carte Offer Items.
 * 
 * <p>Java class for SelectedALaCarteOfferItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SelectedALaCarteOfferItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FlightAssociations" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}FlightAssociationsType" minOccurs="0"/>
 *         <element name="Qty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}QtyType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedALaCarteOfferItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "flightAssociations",
    "qty"
})
public class SelectedALaCarteOfferItemType {

    @XmlElement(name = "FlightAssociations", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected FlightAssociationsType flightAssociations;
    /**
     * Quantity to allow the ordering of more than one instances of the related a la carte OfferItem.
     * 
     */
    @XmlElement(name = "Qty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected BigDecimal qty;

    /**
     * Gets the value of the flightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link FlightAssociationsType }
     *     
     */
    public FlightAssociationsType getFlightAssociations() {
        return flightAssociations;
    }

    /**
     * Sets the value of the flightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightAssociationsType }
     *     
     */
    public void setFlightAssociations(FlightAssociationsType value) {
        this.flightAssociations = value;
    }

    /**
     * Quantity to allow the ordering of more than one instances of the related a la carte OfferItem.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getQty()
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

}
