
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).   Each Offer selected could reference (via the OfferID) either standard Offers from an AirShoppingRS message (potentially with Flight-related services) or A-La-Carte Offers (containing optional ancillary services). These standard Offers and 'a-la-carte' Offers would need to be consistent with the applicability rules defined by their relations (passengers or segments eligible for the enclosed OfferItems) and would be combined to produce a single Order, returned by the OrderViewRS message.
 * 
 * <p>Java class for PricedOfferType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PricedOfferType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CreateOrderItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CreateOrderItemType" maxOccurs="unbounded"/>
 *         <element name="SelectedOffer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SelectedOfferType" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedOfferType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "createOrderItem",
    "selectedOffer"
})
public class PricedOfferType {

    /**
     * Used for selling by value (long sells) rather than selling by reference.
     * 
     */
    @XmlElement(name = "CreateOrderItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CreateOrderItemType> createOrderItem;
    /**
     * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).   Each Offer selected could reference (via the OfferID) either standard Offers from an AirShoppingRS message (potentially with Flight-related services) or A-La-Carte Offers (containing optional ancillary services). These standard Offers and 'a-la-carte' Offers would need to be consistent with the applicability rules defined by their relations (passengers or segments eligible for the enclosed OfferItems) and would be combined to produce a single Order, returned by the OrderViewRS message.
     * 
     */
    @XmlElement(name = "SelectedOffer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<SelectedOfferType> selectedOffer;

    /**
     * Used for selling by value (long sells) rather than selling by reference.
     * 
     * Gets the value of the createOrderItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createOrderItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCreateOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateOrderItemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the createOrderItem property.
     */
    public List<CreateOrderItemType> getCreateOrderItem() {
        if (createOrderItem == null) {
            createOrderItem = new ArrayList<>();
        }
        return this.createOrderItem;
    }

    /**
     * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).   Each Offer selected could reference (via the OfferID) either standard Offers from an AirShoppingRS message (potentially with Flight-related services) or A-La-Carte Offers (containing optional ancillary services). These standard Offers and 'a-la-carte' Offers would need to be consistent with the applicability rules defined by their relations (passengers or segments eligible for the enclosed OfferItems) and would be combined to produce a single Order, returned by the OrderViewRS message.
     * 
     * Gets the value of the selectedOffer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOffer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSelectedOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOfferType }
     * </p>
     * 
     * 
     * @return
     *     The value of the selectedOffer property.
     */
    public List<SelectedOfferType> getSelectedOffer() {
        if (selectedOffer == null) {
            selectedOffer = new ArrayList<>();
        }
        return this.selectedOffer;
    }

}
