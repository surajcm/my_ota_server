
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Offer summary that includes highest, lowest, and number of matched offers included in the response.
 * 
 * <p>Java class for OffersSummaryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OffersSummaryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HighestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PriceSummaryType" minOccurs="0"/>
 *         <element name="LowestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PriceSummaryType" minOccurs="0"/>
 *         <element name="MatchedOfferQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}QtyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffersSummaryType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "highestOfferPrice",
    "lowestOfferPrice",
    "matchedOfferQty"
})
public class OffersSummaryType {

    /**
     * The amount of money expected, required, or given in payment for something .
     * 
     */
    @XmlElement(name = "HighestOfferPrice", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PriceSummaryType highestOfferPrice;
    /**
     * The amount of money expected, required, or given in payment for something .
     * 
     */
    @XmlElement(name = "LowestOfferPrice", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PriceSummaryType lowestOfferPrice;
    @XmlElement(name = "MatchedOfferQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal matchedOfferQty;

    /**
     * The amount of money expected, required, or given in payment for something .
     * 
     * @return
     *     possible object is
     *     {@link PriceSummaryType }
     *     
     */
    public PriceSummaryType getHighestOfferPrice() {
        return highestOfferPrice;
    }

    /**
     * Sets the value of the highestOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSummaryType }
     *     
     * @see #getHighestOfferPrice()
     */
    public void setHighestOfferPrice(PriceSummaryType value) {
        this.highestOfferPrice = value;
    }

    /**
     * The amount of money expected, required, or given in payment for something .
     * 
     * @return
     *     possible object is
     *     {@link PriceSummaryType }
     *     
     */
    public PriceSummaryType getLowestOfferPrice() {
        return lowestOfferPrice;
    }

    /**
     * Sets the value of the lowestOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSummaryType }
     *     
     * @see #getLowestOfferPrice()
     */
    public void setLowestOfferPrice(PriceSummaryType value) {
        this.lowestOfferPrice = value;
    }

    /**
     * Gets the value of the matchedOfferQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchedOfferQty() {
        return matchedOfferQty;
    }

    /**
     * Sets the value of the matchedOfferQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchedOfferQty(BigDecimal value) {
        this.matchedOfferQty = value;
    }

}
