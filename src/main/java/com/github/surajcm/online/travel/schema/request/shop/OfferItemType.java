
package com.github.surajcm.online.travel.schema.request.shop;

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
 * A priced grouping of one or more services within an Offer.
 * 
 * <p>Java class for OfferItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OfferItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="OfferItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *         <element name="relatedtoexistingOrderItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OrderItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Service" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "offerItemID",
    "offerItemTypeCode",
    "ownerCode",
    "priceGuaranteeTimeLimitDateTime",
    "relatedtoexistingOrderItem",
    "service",
    "serviceTaxonomy"
})
public class OfferItemType {

    /**
     * Carrier assigned ID which exists uniquely within an Offer.
     * 
     */
    @XmlElement(name = "OfferItemID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    /**
     * Specify the type of Offer Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     */
    @XmlElement(name = "OfferItemTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemTypeCode;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * The length of time the price of an offer item is guaranteed. In the absence of the price guarantee time limit, the price is not guaranteed. Upon expiry, the price may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.   Should the price guarantee time limit extend beyond Order creation (or change), the remaining length of time persists into the corresponding Order Item. At Order creation (or change) the airline can increase the remaining length of time beyond the original time limit should they wish to.  Note: Where a price guarantee time limit is applied, there is no guarantee that related inventory is guaranteed by the airline.
     * 
     */
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    /**
     * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
     * 
     */
    @XmlElement(namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<OrderItemType> relatedtoexistingOrderItem;
    /**
     * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
     * 
     */
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ServiceType> service;
    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     */
    @XmlElement(name = "ServiceTaxonomy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ServiceTaxonomyType> serviceTaxonomy;

    /**
     * Carrier assigned ID which exists uniquely within an Offer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferItemID()
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Specify the type of Offer Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemTypeCode() {
        return offerItemTypeCode;
    }

    /**
     * Sets the value of the offerItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferItemTypeCode()
     */
    public void setOfferItemTypeCode(String value) {
        this.offerItemTypeCode = value;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
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
     * The length of time the price of an offer item is guaranteed. In the absence of the price guarantee time limit, the price is not guaranteed. Upon expiry, the price may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.   Should the price guarantee time limit extend beyond Order creation (or change), the remaining length of time persists into the corresponding Order Item. At Order creation (or change) the airline can increase the remaining length of time beyond the original time limit should they wish to.  Note: Where a price guarantee time limit is applied, there is no guarantee that related inventory is guaranteed by the airline.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getPriceGuaranteeTimeLimitDateTime()
     */
    public void setPriceGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
     * 
     * Gets the value of the relatedtoexistingOrderItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedtoexistingOrderItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRelatedtoexistingOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the relatedtoexistingOrderItem property.
     */
    public List<OrderItemType> getRelatedtoexistingOrderItem() {
        if (relatedtoexistingOrderItem == null) {
            relatedtoexistingOrderItem = new ArrayList<>();
        }
        return this.relatedtoexistingOrderItem;
    }

    /**
     * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
     * 
     * Gets the value of the service property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the service property.
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<>();
        }
        return this.service;
    }

    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     * Gets the value of the serviceTaxonomy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTaxonomy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceTaxonomy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTaxonomyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceTaxonomy property.
     */
    public List<ServiceTaxonomyType> getServiceTaxonomy() {
        if (serviceTaxonomy == null) {
            serviceTaxonomy = new ArrayList<>();
        }
        return this.serviceTaxonomy;
    }

}
