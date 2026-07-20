
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
 * Order Create request.
 * 
 * <p>Java class for RequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DataListsType" minOccurs="0"/>
 *         <element name="InExchForTicket" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PenaltyRefType" minOccurs="0"/>
 *         <element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}MetadataType" minOccurs="0"/>
 *         <element name="OfferPriceParameters" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ResponseParametersType" minOccurs="0"/>
 *         <element name="OriginDestRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Policy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PricedOffer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PricedOfferType" minOccurs="0"/>
 *         <element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ShoppingCriteriaType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "dataLists",
    "inExchForTicket",
    "metadata",
    "offerPriceParameters",
    "originDestRefID",
    "policy",
    "pricedOffer",
    "shoppingCriteria"
})
public class RequestType {

    /**
     * Data List definition for this message.
     * 
     */
    @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DataListsType dataLists;
    /**
     * Penalty reference information.
     * 
     */
    @XmlElement(name = "InExchForTicket", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PenaltyRefType inExchForTicket;
    /**
     * Message wide metadata information.
     * 
     */
    @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected MetadataType metadata;
    /**
     * Information related to how response results should be returned.
     * 
     */
    @XmlElement(name = "OfferPriceParameters", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ResponseParametersType offerPriceParameters;
    /**
     * Existing flight itinerary information.
     * 
     */
    @XmlElement(name = "OriginDestRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> originDestRefID;
    /**
     * Message policy information, including PCI, PII information.
     * 
     */
    @XmlElement(name = "Policy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<PolicyType> policy;
    /**
     * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).   Each Offer selected could reference (via the OfferID) either standard Offers from an AirShoppingRS message (potentially with Flight-related services) or A-La-Carte Offers (containing optional ancillary services). These standard Offers and 'a-la-carte' Offers would need to be consistent with the applicability rules defined by their relations (passengers or segments eligible for the enclosed OfferItems) and would be combined to produce a single Order, returned by the OrderViewRS message.
     * 
     */
    @XmlElement(name = "PricedOffer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PricedOfferType pricedOffer;
    /**
     * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
     * 
     */
    @XmlElement(name = "ShoppingCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ShoppingCriteriaType shoppingCriteria;

    /**
     * Data List definition for this message.
     * 
     * @return
     *     possible object is
     *     {@link DataListsType }
     *     
     */
    public DataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListsType }
     *     
     * @see #getDataLists()
     */
    public void setDataLists(DataListsType value) {
        this.dataLists = value;
    }

    /**
     * Penalty reference information.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRefType }
     *     
     */
    public PenaltyRefType getInExchForTicket() {
        return inExchForTicket;
    }

    /**
     * Sets the value of the inExchForTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRefType }
     *     
     * @see #getInExchForTicket()
     */
    public void setInExchForTicket(PenaltyRefType value) {
        this.inExchForTicket = value;
    }

    /**
     * Message wide metadata information.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     * @see #getMetadata()
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Information related to how response results should be returned.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getOfferPriceParameters() {
        return offerPriceParameters;
    }

    /**
     * Sets the value of the offerPriceParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     * @see #getOfferPriceParameters()
     */
    public void setOfferPriceParameters(ResponseParametersType value) {
        this.offerPriceParameters = value;
    }

    /**
     * Existing flight itinerary information.
     * 
     * Gets the value of the originDestRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOriginDestRefID().add(newItem);
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
     *     The value of the originDestRefID property.
     */
    public List<String> getOriginDestRefID() {
        if (originDestRefID == null) {
            originDestRefID = new ArrayList<>();
        }
        return this.originDestRefID;
    }

    /**
     * Message policy information, including PCI, PII information.
     * 
     * Gets the value of the policy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the policy property.
     */
    public List<PolicyType> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<>();
        }
        return this.policy;
    }

    /**
     * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).   Each Offer selected could reference (via the OfferID) either standard Offers from an AirShoppingRS message (potentially with Flight-related services) or A-La-Carte Offers (containing optional ancillary services). These standard Offers and 'a-la-carte' Offers would need to be consistent with the applicability rules defined by their relations (passengers or segments eligible for the enclosed OfferItems) and would be combined to produce a single Order, returned by the OrderViewRS message.
     * 
     * @return
     *     possible object is
     *     {@link PricedOfferType }
     *     
     */
    public PricedOfferType getPricedOffer() {
        return pricedOffer;
    }

    /**
     * Sets the value of the pricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedOfferType }
     *     
     * @see #getPricedOffer()
     */
    public void setPricedOffer(PricedOfferType value) {
        this.pricedOffer = value;
    }

    /**
     * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public ShoppingCriteriaType getShoppingCriteria() {
        return shoppingCriteria;
    }

    /**
     * Sets the value of the shoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCriteriaType }
     *     
     * @see #getShoppingCriteria()
     */
    public void setShoppingCriteria(ShoppingCriteriaType value) {
        this.shoppingCriteria = value;
    }

}
