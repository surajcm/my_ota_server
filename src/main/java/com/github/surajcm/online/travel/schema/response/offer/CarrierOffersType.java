
package com.github.surajcm.online.travel.schema.response.offer;

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
 *         <element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}Offer1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Offer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}OfferType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierOffersType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "aLaCarteOffer",
    "offer"
})
public class CarrierOffersType {

    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
     * 
     */
    @XmlElement(name = "ALaCarteOffer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<Offer1Type> aLaCarteOffer;
    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
     * 
     */
    @XmlElement(name = "Offer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<OfferType> offer;

    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
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

}
