
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).   Each Offer selected could reference (via the OfferID) either standard Offers from an AirShoppingRS message (potentially with Flight-related services) or A-La-Carte Offers (containing optional ancillary services). These standard Offers and 'a-la-carte' Offers would need to be consistent with the applicability rules defined by their relations (passengers or segments eligible for the enclosed OfferItems) and would be combined to produce a single Order, returned by the OrderViewRS message.
 * 
 * <p>Java class for SelectedOfferType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SelectedOfferType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AirlineDesigCodeType"/>
 *         <element name="SelectedOfferItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SelectedOfferItemType" maxOccurs="unbounded"/>
 *         <element name="ShoppingResponseRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         <element name="TotalOfferPriceAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedOfferType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "offerRefID",
    "ownerCode",
    "selectedOfferItem",
    "shoppingResponseRefID",
    "totalOfferPriceAmount"
})
public class SelectedOfferType {

    /**
     * Reference to the OfferID of the selected Offer (either a standard Offer or an a-la-carte Offer) returned in a previous shopping response.
     * 
     */
    @XmlElement(name = "OfferRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerRefID;
    /**
     * Designator of Airline that owns/ assigned these IDs. Examples: BA
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * OfferItem selected by the Passenger for inclusion in the requested Order. Repeat occurrence of OfferItem (once per passenger) if different passengers want to select different service options, different quantities of a-la-carte items or different seat locations.   As a minimum, all mandatory OfferItems from a desired Offer should be explicitly defined within these selections and should repeat the same Passenger and Flight Segment associations defined in the originating OfferItems. Optional OfferItems may then be appended as further items selected by the Passenger.   OfferItems from the originating Offers may take on two different forms, which in turn drives how the ALaCarteSelection element is to be used - If the OfferItem referenced comes originally from an a-la-carte Offer, then the use of the ALaCarteSelection element should be used to defined the Quantity of said OfferItem. On the other hand, if the OfferItem comes from a standard type of Offer in the previous shopping response, the ALaCarteSelection element should not be used, as the quantity is explicitly driven by what is defined in that OfferItemâ€™s associations (to passengers and/or flight segments).
     * 
     */
    @XmlElement(name = "SelectedOfferItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<SelectedOfferItemType> selectedOfferItem;
    /**
     * Reference to unique shopping session response ID, as provided in the airline's previous shopping response.
     * 
     */
    @XmlElement(name = "ShoppingResponseRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shoppingResponseRefID;
    /**
     * The total price for all selected Offer Items (and respective quantities) for all passengers and segments associated with the respective Offer(s), as calculated by the seller system. Without adding any optional Offer Items, the value of this TotalOfferPrice should be that of the TotalPrice of the Offer(s) being referenced.
     * 
     */
    @XmlElement(name = "TotalOfferPriceAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType totalOfferPriceAmount;

    /**
     * Reference to the OfferID of the selected Offer (either a standard Offer or an a-la-carte Offer) returned in a previous shopping response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRefID() {
        return offerRefID;
    }

    /**
     * Sets the value of the offerRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferRefID()
     */
    public void setOfferRefID(String value) {
        this.offerRefID = value;
    }

    /**
     * Designator of Airline that owns/ assigned these IDs. Examples: BA
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerCode()
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * OfferItem selected by the Passenger for inclusion in the requested Order. Repeat occurrence of OfferItem (once per passenger) if different passengers want to select different service options, different quantities of a-la-carte items or different seat locations.   As a minimum, all mandatory OfferItems from a desired Offer should be explicitly defined within these selections and should repeat the same Passenger and Flight Segment associations defined in the originating OfferItems. Optional OfferItems may then be appended as further items selected by the Passenger.   OfferItems from the originating Offers may take on two different forms, which in turn drives how the ALaCarteSelection element is to be used - If the OfferItem referenced comes originally from an a-la-carte Offer, then the use of the ALaCarteSelection element should be used to defined the Quantity of said OfferItem. On the other hand, if the OfferItem comes from a standard type of Offer in the previous shopping response, the ALaCarteSelection element should not be used, as the quantity is explicitly driven by what is defined in that OfferItemâ€™s associations (to passengers and/or flight segments).
     * 
     * Gets the value of the selectedOfferItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOfferItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSelectedOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOfferItemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the selectedOfferItem property.
     */
    public List<SelectedOfferItemType> getSelectedOfferItem() {
        if (selectedOfferItem == null) {
            selectedOfferItem = new ArrayList<>();
        }
        return this.selectedOfferItem;
    }

    /**
     * Reference to unique shopping session response ID, as provided in the airline's previous shopping response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingResponseRefID() {
        return shoppingResponseRefID;
    }

    /**
     * Sets the value of the shoppingResponseRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShoppingResponseRefID()
     */
    public void setShoppingResponseRefID(String value) {
        this.shoppingResponseRefID = value;
    }

    /**
     * The total price for all selected Offer Items (and respective quantities) for all passengers and segments associated with the respective Offer(s), as calculated by the seller system. Without adding any optional Offer Items, the value of this TotalOfferPrice should be that of the TotalPrice of the Offer(s) being referenced.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOfferPriceAmount() {
        return totalOfferPriceAmount;
    }

    /**
     * Sets the value of the totalOfferPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getTotalOfferPriceAmount()
     */
    public void setTotalOfferPriceAmount(AmountType value) {
        this.totalOfferPriceAmount = value;
    }

}
