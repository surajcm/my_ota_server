
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
 * OfferItem selected by the Passenger for inclusion in the requested Order. Repeat occurrence of OfferItem (once per passenger) if different passengers want to select different service options, different quantities of a-la-carte items or different seat locations.   As a minimum, all mandatory OfferItems from a desired Offer should be explicitly defined within these selections and should repeat the same Passenger and Flight Segment associations defined in the originating OfferItems. Optional OfferItems may then be appended as further items selected by the Passenger.   OfferItems from the originating Offers may take on two different forms, which in turn drives how the ALaCarteSelection element is to be used - If the OfferItem referenced comes originally from an a-la-carte Offer, then the use of the ALaCarteSelection element should be used to defined the Quantity of said OfferItem. On the other hand, if the OfferItem comes from a standard type of Offer in the previous shopping response, the ALaCarteSelection element should not be used, as the quantity is explicitly driven by what is defined in that OfferItemâ€™s associations (to passengers and/or flight segments).
 * 
 * <p>Java class for SelectedOfferItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SelectedOfferItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferItemRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded"/>
 *         <element name="SelectedALaCarteOfferItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SelectedALaCarteOfferItemType" minOccurs="0"/>
 *         <element name="SelectedBundleServices" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SelectedBundleServicesType" minOccurs="0"/>
 *         <element name="SelectedSeat" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SelectedSeatType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedOfferItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "offerItemRefID",
    "paxRefID",
    "selectedALaCarteOfferItem",
    "selectedBundleServices",
    "selectedSeat"
})
public class SelectedOfferItemType {

    /**
     * Reference to the OfferItemID of the selected OfferItem (contained in either a standard Offer or an a-la-carte Offer) returned in a previous shopping response.
     * 
     */
    @XmlElement(name = "OfferItemRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemRefID;
    /**
     * Reference to passenger(s) for which this OfferItem and selected Services (in case of Service Bundles) applies.
     * 
     */
    @XmlElement(name = "PaxRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    /**
     * Use to select the quantity of Offer Items from the A La Carte Offer Items.
     * 
     */
    @XmlElement(name = "SelectedALaCarteOfferItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SelectedALaCarteOfferItemType selectedALaCarteOfferItem;
    /**
     * For service bundle selection - only to be used for bundles with optional choices (e.g. pick 2 out of 4)
     * 
     */
    @XmlElement(name = "SelectedBundleServices", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SelectedBundleServicesType selectedBundleServices;
    /**
     * Selection of specific seat location, as provided in seat availability messages.  When used, only a single Passenger must be referenced for a single Segment.
     * 
     */
    @XmlElement(name = "SelectedSeat", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SelectedSeatType selectedSeat;

    /**
     * Reference to the OfferItemID of the selected OfferItem (contained in either a standard Offer or an a-la-carte Offer) returned in a previous shopping response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemRefID() {
        return offerItemRefID;
    }

    /**
     * Sets the value of the offerItemRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferItemRefID()
     */
    public void setOfferItemRefID(String value) {
        this.offerItemRefID = value;
    }

    /**
     * Reference to passenger(s) for which this OfferItem and selected Services (in case of Service Bundles) applies.
     * 
     * Gets the value of the paxRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the paxRefID property.
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<>();
        }
        return this.paxRefID;
    }

    /**
     * Use to select the quantity of Offer Items from the A La Carte Offer Items.
     * 
     * @return
     *     possible object is
     *     {@link SelectedALaCarteOfferItemType }
     *     
     */
    public SelectedALaCarteOfferItemType getSelectedALaCarteOfferItem() {
        return selectedALaCarteOfferItem;
    }

    /**
     * Sets the value of the selectedALaCarteOfferItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedALaCarteOfferItemType }
     *     
     * @see #getSelectedALaCarteOfferItem()
     */
    public void setSelectedALaCarteOfferItem(SelectedALaCarteOfferItemType value) {
        this.selectedALaCarteOfferItem = value;
    }

    /**
     * For service bundle selection - only to be used for bundles with optional choices (e.g. pick 2 out of 4)
     * 
     * @return
     *     possible object is
     *     {@link SelectedBundleServicesType }
     *     
     */
    public SelectedBundleServicesType getSelectedBundleServices() {
        return selectedBundleServices;
    }

    /**
     * Sets the value of the selectedBundleServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedBundleServicesType }
     *     
     * @see #getSelectedBundleServices()
     */
    public void setSelectedBundleServices(SelectedBundleServicesType value) {
        this.selectedBundleServices = value;
    }

    /**
     * Selection of specific seat location, as provided in seat availability messages.  When used, only a single Passenger must be referenced for a single Segment.
     * 
     * @return
     *     possible object is
     *     {@link SelectedSeatType }
     *     
     */
    public SelectedSeatType getSelectedSeat() {
        return selectedSeat;
    }

    /**
     * Sets the value of the selectedSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedSeatType }
     *     
     * @see #getSelectedSeat()
     */
    public void setSelectedSeat(SelectedSeatType value) {
        this.selectedSeat = value;
    }

}
