
package com.github.surajcm.online.travel.schema.response.shop;

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
 * Contains one Service (excluding flights) or Service Bundle which is priced per unit. A La Carte Offer Items are optional, and the quantities of these can be selected for any of the eligible passengers and segments.
 * 
 * <p>Java class for ALaCarteOfferItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ALaCarteOfferItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CancelRestrictions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CancelRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChangeRestrictions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ChangeRestrictionsType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Eligibility" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}EligibilityType"/>
 *         <element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type"/>
 *         <element name="PaymentTimeLimit" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentTimeLimitType" minOccurs="0"/>
 *         <element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         <element name="Service" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}Service1Type"/>
 *         <element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UnitPrice" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}Price2Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALaCarteOfferItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "cancelRestrictions",
    "changeRestrictions",
    "commission",
    "eligibility",
    "offerItemID",
    "paymentTimeLimit",
    "priceGuaranteeTimeLimitDateTime",
    "service",
    "serviceTaxonomy",
    "unitPrice"
})
public class ALaCarteOfferItemType {

    /**
     * These are a set of qualifying conditions/rules/restrictions that are related to a constrained priced grouping of services for the  Cancellation action.
     * 
     */
    @XmlElement(name = "CancelRestrictions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<CancelRestrictionsType> cancelRestrictions;
    /**
     * These are a set of qualifying conditions/rules/restriction  that are related to a constrained priced grouping of services for a Change/modification action.
     * 
     */
    @XmlElement(name = "ChangeRestrictions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<ChangeRestrictionsType> changeRestrictions;
    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<CommissionType> commission;
    /**
     * Refers to the Passengers, Price class or segments for which this offer item is eligible.
     * 
     */
    @XmlElement(name = "Eligibility", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected EligibilityType eligibility;
    /**
     * Uniquely Identifies an Offer within the context of one message.
     * 
     */
    @XmlElement(name = "OfferItemID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    /**
     * This node is used to indicate by when payment commitment must be received for confirmed Order Item in an Order.  To indicate instant payment, the duration field should be populated with a value of 0.  If no value is returned, then no advice has been given.
     * 
     */
    @XmlElement(name = "PaymentTimeLimit", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PaymentTimeLimitType paymentTimeLimit;
    /**
     * The length of time the price of an offer item is guaranteed. In the absence of the price guarantee time limit, the price is not guaranteed. Upon expiry, the price may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.   Should the price guarantee time limit extend beyond Order creation (or change), the remaining length of time persists into the corresponding Order Item. At Order creation (or change) the airline can increase the remaining length of time beyond the original time limit should they wish to.  Note: Where a price guarantee time limit is applied, there is no guarantee that related inventory is guaranteed by the airline.
     * 
     */
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    /**
     * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
     * 
     */
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected Service1Type service;
    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     */
    @XmlElement(name = "ServiceTaxonomy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     */
    @XmlElement(name = "UnitPrice", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected Price2Type unitPrice;

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
     * Refers to the Passengers, Price class or segments for which this offer item is eligible.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityType }
     *     
     */
    public EligibilityType getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityType }
     *     
     * @see #getEligibility()
     */
    public void setEligibility(EligibilityType value) {
        this.eligibility = value;
    }

    /**
     * Uniquely Identifies an Offer within the context of one message.
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
     * @return
     *     possible object is
     *     {@link Service1Type }
     *     
     */
    public Service1Type getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service1Type }
     *     
     * @see #getService()
     */
    public void setService(Service1Type value) {
        this.service = value;
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
     * The amount of money expected, required, or given in payment for something.
     * 
     * @return
     *     possible object is
     *     {@link Price2Type }
     *     
     */
    public Price2Type getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2Type }
     *     
     * @see #getUnitPrice()
     */
    public void setUnitPrice(Price2Type value) {
        this.unitPrice = value;
    }

}
