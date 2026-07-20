
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grouping of Offers returned by a single ORA.
 * 
 * <p>Java class for CarrierOffersType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CarrierOffersType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}Offer1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CarrierOffersSummary" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OffersSummaryType" minOccurs="0"/>
 *         <element name="Offer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OfferType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PriceCalendar" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PriceCalendarType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierOffersType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "aLaCarteOffer",
    "carrierOffersSummary",
    "offer",
    "priceCalendar"
})
public class CarrierOffersType {

    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request .
     * 
     */
    @XmlElement(name = "ALaCarteOffer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<Offer1Type> aLaCarteOffer;
    /**
     * Offer summary that includes highest, lowest, and number of matched offers included in the response.
     * 
     */
    @XmlElement(name = "CarrierOffersSummary", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected OffersSummaryType carrierOffersSummary;
    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
     * 
     */
    @XmlElement(name = "Offer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<OfferType> offer;
    /**
     * Calendar based Flight Price. This capability supports multi-day calendar shopping, e.g. returning priced flight offers for a specified period before and/or after the actual requested date.
     * 
     */
    @XmlElement(name = "PriceCalendar", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<PriceCalendarType> priceCalendar;

    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request .
     * 
     * Gets the value of the aLaCarteOffer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aLaCarteOffer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getALaCarteOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offer1Type }
     * </p>
     * 
     * 
     * @return
     *     The value of the aLaCarteOffer property.
     */
    public List<Offer1Type> getALaCarteOffer() {
        if (aLaCarteOffer == null) {
            aLaCarteOffer = new ArrayList<>();
        }
        return this.aLaCarteOffer;
    }

    /**
     * Offer summary that includes highest, lowest, and number of matched offers included in the response.
     * 
     * @return
     *     possible object is
     *     {@link OffersSummaryType }
     *     
     */
    public OffersSummaryType getCarrierOffersSummary() {
        return carrierOffersSummary;
    }

    /**
     * Sets the value of the carrierOffersSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffersSummaryType }
     *     
     * @see #getCarrierOffersSummary()
     */
    public void setCarrierOffersSummary(OffersSummaryType value) {
        this.carrierOffersSummary = value;
    }

    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
     * 
     * Gets the value of the offer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferType }
     * </p>
     * 
     * 
     * @return
     *     The value of the offer property.
     */
    public List<OfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<>();
        }
        return this.offer;
    }

    /**
     * Calendar based Flight Price. This capability supports multi-day calendar shopping, e.g. returning priced flight offers for a specified period before and/or after the actual requested date.
     * 
     * Gets the value of the priceCalendar property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceCalendar property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalendarType }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceCalendar property.
     */
    public List<PriceCalendarType> getPriceCalendar() {
        if (priceCalendar == null) {
            priceCalendar = new ArrayList<>();
        }
        return this.priceCalendar;
    }

}
