
package com.github.surajcm.online.travel.schema.response.offer;

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
 *         <element name="CancelRestrictions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CancelRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChangeRestrictions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ChangeRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}Desc1Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MandatoryInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="ModificationProhibitedInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type"/>
 *         <element name="OfferItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         <element name="PaymentTimeLimit" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PaymentTimeLimitType" minOccurs="0"/>
 *         <element name="Price" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}Price2Type"/>
 *         <element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DateTimeType" minOccurs="0"/>
 *         <element name="Service" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ServiceType" maxOccurs="unbounded"/>
 *         <element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StopOverRestrictions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}StopOverRestrictionsType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "cancelRestrictions",
    "changeRestrictions",
    "commission",
    "desc",
    "fareDetail",
    "mandatoryInd",
    "modificationProhibitedInd",
    "offerItemID",
    "offerItemTypeCode",
    "paymentTimeLimit",
    "price",
    "priceGuaranteeTimeLimitDateTime",
    "service",
    "serviceTaxonomy",
    "stopOverRestrictions"
})
public class OfferItemType {

    /**
     * These are a set of qualifying conditions/rules/restrictions that are related to a constrained priced grouping of services for the  Cancellation action.
     * 
     */
    @XmlElement(name = "CancelRestrictions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<CancelRestrictionsType> cancelRestrictions;
    /**
     * These are a set of qualifying conditions/rules/restriction  that are related to a constrained priced grouping of services for a Change/modification action.
     * 
     */
    @XmlElement(name = "ChangeRestrictions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<ChangeRestrictionsType> changeRestrictions;
    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<CommissionType> commission;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<Desc1Type> desc;
    /**
     * The amount charged by the carrier for the carriage of a passenger and his allowable free baggage.
     * 
     */
    @XmlElement(name = "FareDetail", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<FareDetailType> fareDetail;
    /**
     * If set to 'true', indicates mandatory Offer Items which cannot be removed from the Offer.
     * 
     */
    @XmlElement(name = "MandatoryInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean mandatoryInd;
    /**
     * POA to ORA only: to indicate that the offer is non-modifiable. This indicates to ORA that its offer is non-modifiable (e.g. Regulatory or brand protection reasons). If indicator is set to TRUE, modifications to the POAâ€™s offer ARE NOT allowed.
     * 
     */
    @XmlElement(name = "ModificationProhibitedInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean modificationProhibitedInd;
    /**
     * Carrier assigned ID which exists uniquely within an Offer.
     * 
     */
    @XmlElement(name = "OfferItemID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    /**
     * Specify the type of Offer Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     */
    @XmlElement(name = "OfferItemTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemTypeCode;
    /**
     * This node is used to indicate by when payment commitment must be received for confirmed Order Item in an Order.  To indicate instant payment, the duration field should be populated with a value of 0.  If no value is returned, then no advice has been given.
     * 
     */
    @XmlElement(name = "PaymentTimeLimit", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected PaymentTimeLimitType paymentTimeLimit;
    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     */
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected Price2Type price;
    /**
     * The length of time the price of an offer item is guaranteed. In the absence of the price guarantee time limit, the price is not guaranteed. Upon expiry, the price may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.   Should the price guarantee time limit extend beyond Order creation (or change), the remaining length of time persists into the corresponding Order Item. At Order creation (or change) the airline can increase the remaining length of time beyond the original time limit should they wish to.  Note: Where a price guarantee time limit is applied, there is no guarantee that related inventory is guaranteed by the airline.
     * 
     */
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    /**
     * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
     * 
     */
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected List<ServiceType> service;
    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     */
    @XmlElement(name = "ServiceTaxonomy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
    /**
     * Additional information supplied by the Airline for the current Itinerary to advise the Seller that additional options could be available (if the Seller changes the request) to add Stop Overs within the itinerary.
     * 
     */
    @XmlElement(name = "StopOverRestrictions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected StopOverRestrictionsType stopOverRestrictions;

    /**
     * These are a set of qualifying conditions/rules/restrictions that are related to a constrained priced grouping of services for the  Cancellation action.
     * 
     * Gets the value of the cancelRestrictions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelRestrictions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCancelRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelRestrictionsType }
     * </p>
     * 
     * 
     * @return
     *     The value of the cancelRestrictions property.
     */
    public List<CancelRestrictionsType> getCancelRestrictions() {
        if (cancelRestrictions == null) {
            cancelRestrictions = new ArrayList<>();
        }
        return this.cancelRestrictions;
    }

    /**
     * These are a set of qualifying conditions/rules/restriction  that are related to a constrained priced grouping of services for a Change/modification action.
     * 
     * Gets the value of the changeRestrictions property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeRestrictions property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChangeRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeRestrictionsType }
     * </p>
     * 
     * 
     * @return
     *     The value of the changeRestrictions property.
     */
    public List<ChangeRestrictionsType> getChangeRestrictions() {
        if (changeRestrictions == null) {
            changeRestrictions = new ArrayList<>();
        }
        return this.changeRestrictions;
    }

    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     * Gets the value of the commission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the commission property.
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<>();
        }
        return this.commission;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     * Gets the value of the desc property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Desc1Type }
     * </p>
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<Desc1Type> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * The amount charged by the carrier for the carriage of a passenger and his allowable free baggage.
     * 
     * Gets the value of the fareDetail property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareDetail property.
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<>();
        }
        return this.fareDetail;
    }

    /**
     * If set to 'true', indicates mandatory Offer Items which cannot be removed from the Offer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMandatoryInd()
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * POA to ORA only: to indicate that the offer is non-modifiable. This indicates to ORA that its offer is non-modifiable (e.g. Regulatory or brand protection reasons). If indicator is set to TRUE, modifications to the POAâ€™s offer ARE NOT allowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isModificationProhibitedInd()
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
    }

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
     * This node is used to indicate by when payment commitment must be received for confirmed Order Item in an Order.  To indicate instant payment, the duration field should be populated with a value of 0.  If no value is returned, then no advice has been given.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTimeLimitType }
     *     
     */
    public PaymentTimeLimitType getPaymentTimeLimit() {
        return paymentTimeLimit;
    }

    /**
     * Sets the value of the paymentTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTimeLimitType }
     *     
     * @see #getPaymentTimeLimit()
     */
    public void setPaymentTimeLimit(PaymentTimeLimitType value) {
        this.paymentTimeLimit = value;
    }

    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     * @return
     *     possible object is
     *     {@link Price2Type }
     *     
     */
    public Price2Type getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2Type }
     *     
     * @see #getPrice()
     */
    public void setPrice(Price2Type value) {
        this.price = value;
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

    /**
     * Additional information supplied by the Airline for the current Itinerary to advise the Seller that additional options could be available (if the Seller changes the request) to add Stop Overs within the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link StopOverRestrictionsType }
     *     
     */
    public StopOverRestrictionsType getStopOverRestrictions() {
        return stopOverRestrictions;
    }

    /**
     * Sets the value of the stopOverRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopOverRestrictionsType }
     *     
     * @see #getStopOverRestrictions()
     */
    public void setStopOverRestrictions(StopOverRestrictionsType value) {
        this.stopOverRestrictions = value;
    }

}
