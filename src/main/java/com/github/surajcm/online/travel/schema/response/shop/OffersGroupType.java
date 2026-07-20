
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Offers grouped by Carrier.
 * 
 * <p>Java class for OffersGroupType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OffersGroupType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllOffersSummary" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OffersSummaryType" minOccurs="0"/>
 *         <element name="CarrierOffers" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CarrierOffersType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffersGroupType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "allOffersSummary",
    "carrierOffers"
})
public class OffersGroupType {

    /**
     * Offer summary that includes highest, lowest, and number of matched offers included in the response.
     * 
     */
    @XmlElement(name = "AllOffersSummary", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected OffersSummaryType allOffersSummary;
    /**
     * Grouping of Offers returned by a single ORA.
     * 
     */
    @XmlElement(name = "CarrierOffers", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected List<CarrierOffersType> carrierOffers;

    /**
     * Offer summary that includes highest, lowest, and number of matched offers included in the response.
     * 
     * @return
     *     possible object is
     *     {@link OffersSummaryType }
     *     
     */
    public OffersSummaryType getAllOffersSummary() {
        return allOffersSummary;
    }

    /**
     * Sets the value of the allOffersSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffersSummaryType }
     *     
     * @see #getAllOffersSummary()
     */
    public void setAllOffersSummary(OffersSummaryType value) {
        this.allOffersSummary = value;
    }

    /**
     * Grouping of Offers returned by a single ORA.
     * 
     * Gets the value of the carrierOffers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierOffers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCarrierOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierOffersType }
     * </p>
     * 
     * 
     * @return
     *     The value of the carrierOffers property.
     */
    public List<CarrierOffersType> getCarrierOffers() {
        if (carrierOffers == null) {
            carrierOffers = new ArrayList<>();
        }
        return this.carrierOffers;
    }

}
