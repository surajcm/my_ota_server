
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
 * 
 * <p>Java class for ShoppingCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ShoppingCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllianceCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AllianceCriteriaType" minOccurs="0"/>
 *         <element name="BaggagePricingCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BaggagePricingCriteriaType" minOccurs="0"/>
 *         <element name="CabinTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CarrierCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ConnectionCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ConnectionCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ExistingOrderCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ExistingOrderCriteriaType" minOccurs="0"/>
 *         <element name="FareCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FareCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FlightCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightCriteriaType" minOccurs="0"/>
 *         <element name="OfferItemTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OfferItemTypeCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PaymentMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaymentMethodCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PricingMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PricingMethodCriteriaType" minOccurs="0"/>
 *         <element name="ProgramCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProgramCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PromotionCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PromotionType" minOccurs="0"/>
 *         <element name="SeatCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SeatType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SegmentDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SegmentDurationCriteriaType" minOccurs="0"/>
 *         <element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceCriteriaType" minOccurs="0"/>
 *         <element name="SpecialNeedsCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SpecialServiceType" minOccurs="0"/>
 *         <element name="TripPurposeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TripPurposeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "allianceCriteria",
    "baggagePricingCriteria",
    "cabinTypeCriteria",
    "carrierCriteria",
    "connectionCriteria",
    "existingOrderCriteria",
    "fareCriteria",
    "flightCriteria",
    "offerItemTypeCriteria",
    "paymentMethodCriteria",
    "pricingMethodCriteria",
    "programCriteria",
    "promotionCriteria",
    "seatCriteria",
    "segmentDurationCriteria",
    "serviceCriteria",
    "specialNeedsCriteria",
    "tripPurposeCode"
})
public class ShoppingCriteriaType {

    /**
     * Filtering criteria based on Alliance.
     * 
     */
    @XmlElement(name = "AllianceCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AllianceCriteriaType allianceCriteria;
    /**
     * Baggage pricing specific filter criteria for shopping requests, including baggage type, charges, and settlement information.
     * 
     */
    @XmlElement(name = "BaggagePricingCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BaggagePricingCriteriaType baggagePricingCriteria;
    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "CabinTypeCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<CabinTypeType> cabinTypeCriteria;
    /**
     * Airline preferences for a shopping request.
     * 
     */
    @XmlElement(name = "CarrierCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<CarrierCriteriaType> carrierCriteria;
    /**
     * Customer's requested connection information.
     * 
     */
    @XmlElement(name = "ConnectionCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ConnectionCriteriaType> connectionCriteria;
    /**
     * References to Orders that were created from Offers that have already been purchased, booked and/or are being held for a Passenger.
     * 
     */
    @XmlElement(name = "ExistingOrderCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected ExistingOrderCriteriaType existingOrderCriteria;
    /**
     * Fare criteria used to filter shopping results.
     * 
     */
    @XmlElement(name = "FareCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<FareCriteriaType> fareCriteria;
    /**
     * Flight filter criteria including aircraft features, Cabin Type, RBD, and Tail Number.
     * 
     */
    @XmlElement(name = "FlightCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected FlightCriteriaType flightCriteria;
    /**
     * there may be multiple offer item types associated with a shopping request.
     * 
     */
    @XmlElement(name = "OfferItemTypeCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<OfferItemTypeCriteriaType> offerItemTypeCriteria;
    /**
     * Criteria for: A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
     * 
     */
    @XmlElement(name = "PaymentMethodCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<PaymentMethodCriteriaType> paymentMethodCriteria;
    /**
     * Contains information to identify how reservation was re-priced to obtain best published fare (Eg. best fare in same cabin, best fare in all cabins, other parameters to select best fare).
     * 
     */
    @XmlElement(name = "PricingMethodCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PricingMethodCriteriaType pricingMethodCriteria;
    /**
     * Filtering criteria based on discount programs.
     * 
     */
    @XmlElement(name = "ProgramCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ProgramCriteriaType> programCriteria;
    /**
     * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
     * 
     */
    @XmlElement(name = "PromotionCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PromotionType promotionCriteria;
    /**
     * A sitting place for a passenger or crew in a cabin compartment on a transport vehicle.
     * 
     */
    @XmlElement(name = "SeatCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<SeatType> seatCriteria;
    /**
     * Total segment travel time preferences.
     * 
     */
    @XmlElement(name = "SegmentDurationCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected SegmentDurationCriteriaType segmentDurationCriteria;
    /**
     * Group and subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
     * 
     */
    @XmlElement(name = "ServiceCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected ServiceCriteriaType serviceCriteria;
    /**
     * Passenger Special Needs Attributes.
     * 
     * Notes:
     *  1. Supports specification of Traveler special needs in both IATA SSR encoding and non-IATA encoding.
     * 
     *  2. Special Needs may be associated to individual Travelers but will apply to ALL Travelers if no associations are specified.
     * 
     *  3. Special Needs may be associated to flight segments but will apply to ALL flight segments if no associations are specified.
     * 
     */
    @XmlElement(name = "SpecialNeedsCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected SpecialServiceType specialNeedsCriteria;
    /**
     * Trip purpose information (e.g. Business, Leisure, etc.).
     * 
     */
    @XmlElement(name = "TripPurposeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "string")
    protected TripPurposeCodeContentType tripPurposeCode;

    /**
     * Filtering criteria based on Alliance.
     * 
     * @return
     *     possible object is
     *     {@link AllianceCriteriaType }
     *     
     */
    public AllianceCriteriaType getAllianceCriteria() {
        return allianceCriteria;
    }

    /**
     * Sets the value of the allianceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceCriteriaType }
     *     
     * @see #getAllianceCriteria()
     */
    public void setAllianceCriteria(AllianceCriteriaType value) {
        this.allianceCriteria = value;
    }

    /**
     * Baggage pricing specific filter criteria for shopping requests, including baggage type, charges, and settlement information.
     * 
     * @return
     *     possible object is
     *     {@link BaggagePricingCriteriaType }
     *     
     */
    public BaggagePricingCriteriaType getBaggagePricingCriteria() {
        return baggagePricingCriteria;
    }

    /**
     * Sets the value of the baggagePricingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggagePricingCriteriaType }
     *     
     * @see #getBaggagePricingCriteria()
     */
    public void setBaggagePricingCriteria(BaggagePricingCriteriaType value) {
        this.baggagePricingCriteria = value;
    }

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     * Gets the value of the cabinTypeCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinTypeCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCabinTypeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the cabinTypeCriteria property.
     */
    public List<CabinTypeType> getCabinTypeCriteria() {
        if (cabinTypeCriteria == null) {
            cabinTypeCriteria = new ArrayList<>();
        }
        return this.cabinTypeCriteria;
    }

    /**
     * Airline preferences for a shopping request.
     * 
     * Gets the value of the carrierCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCarrierCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the carrierCriteria property.
     */
    public List<CarrierCriteriaType> getCarrierCriteria() {
        if (carrierCriteria == null) {
            carrierCriteria = new ArrayList<>();
        }
        return this.carrierCriteria;
    }

    /**
     * Customer's requested connection information.
     * 
     * Gets the value of the connectionCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConnectionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConnectionCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the connectionCriteria property.
     */
    public List<ConnectionCriteriaType> getConnectionCriteria() {
        if (connectionCriteria == null) {
            connectionCriteria = new ArrayList<>();
        }
        return this.connectionCriteria;
    }

    /**
     * References to Orders that were created from Offers that have already been purchased, booked and/or are being held for a Passenger.
     * 
     * @return
     *     possible object is
     *     {@link ExistingOrderCriteriaType }
     *     
     */
    public ExistingOrderCriteriaType getExistingOrderCriteria() {
        return existingOrderCriteria;
    }

    /**
     * Sets the value of the existingOrderCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingOrderCriteriaType }
     *     
     * @see #getExistingOrderCriteria()
     */
    public void setExistingOrderCriteria(ExistingOrderCriteriaType value) {
        this.existingOrderCriteria = value;
    }

    /**
     * Fare criteria used to filter shopping results.
     * 
     * Gets the value of the fareCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareCriteria property.
     */
    public List<FareCriteriaType> getFareCriteria() {
        if (fareCriteria == null) {
            fareCriteria = new ArrayList<>();
        }
        return this.fareCriteria;
    }

    /**
     * Flight filter criteria including aircraft features, Cabin Type, RBD, and Tail Number.
     * 
     * @return
     *     possible object is
     *     {@link FlightCriteriaType }
     *     
     */
    public FlightCriteriaType getFlightCriteria() {
        return flightCriteria;
    }

    /**
     * Sets the value of the flightCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCriteriaType }
     *     
     * @see #getFlightCriteria()
     */
    public void setFlightCriteria(FlightCriteriaType value) {
        this.flightCriteria = value;
    }

    /**
     * there may be multiple offer item types associated with a shopping request.
     * 
     * Gets the value of the offerItemTypeCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItemTypeCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOfferItemTypeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTypeCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the offerItemTypeCriteria property.
     */
    public List<OfferItemTypeCriteriaType> getOfferItemTypeCriteria() {
        if (offerItemTypeCriteria == null) {
            offerItemTypeCriteria = new ArrayList<>();
        }
        return this.offerItemTypeCriteria;
    }

    /**
     * Criteria for: A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
     * 
     * Gets the value of the paymentMethodCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentMethodCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentMethodCriteria property.
     */
    public List<PaymentMethodCriteriaType> getPaymentMethodCriteria() {
        if (paymentMethodCriteria == null) {
            paymentMethodCriteria = new ArrayList<>();
        }
        return this.paymentMethodCriteria;
    }

    /**
     * Contains information to identify how reservation was re-priced to obtain best published fare (Eg. best fare in same cabin, best fare in all cabins, other parameters to select best fare).
     * 
     * @return
     *     possible object is
     *     {@link PricingMethodCriteriaType }
     *     
     */
    public PricingMethodCriteriaType getPricingMethodCriteria() {
        return pricingMethodCriteria;
    }

    /**
     * Sets the value of the pricingMethodCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingMethodCriteriaType }
     *     
     * @see #getPricingMethodCriteria()
     */
    public void setPricingMethodCriteria(PricingMethodCriteriaType value) {
        this.pricingMethodCriteria = value;
    }

    /**
     * Filtering criteria based on discount programs.
     * 
     * Gets the value of the programCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProgramCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the programCriteria property.
     */
    public List<ProgramCriteriaType> getProgramCriteria() {
        if (programCriteria == null) {
            programCriteria = new ArrayList<>();
        }
        return this.programCriteria;
    }

    /**
     * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType }
     *     
     */
    public PromotionType getPromotionCriteria() {
        return promotionCriteria;
    }

    /**
     * Sets the value of the promotionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType }
     *     
     * @see #getPromotionCriteria()
     */
    public void setPromotionCriteria(PromotionType value) {
        this.promotionCriteria = value;
    }

    /**
     * A sitting place for a passenger or crew in a cabin compartment on a transport vehicle.
     * 
     * Gets the value of the seatCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatType }
     * </p>
     * 
     * 
     * @return
     *     The value of the seatCriteria property.
     */
    public List<SeatType> getSeatCriteria() {
        if (seatCriteria == null) {
            seatCriteria = new ArrayList<>();
        }
        return this.seatCriteria;
    }

    /**
     * Total segment travel time preferences.
     * 
     * @return
     *     possible object is
     *     {@link SegmentDurationCriteriaType }
     *     
     */
    public SegmentDurationCriteriaType getSegmentDurationCriteria() {
        return segmentDurationCriteria;
    }

    /**
     * Sets the value of the segmentDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentDurationCriteriaType }
     *     
     * @see #getSegmentDurationCriteria()
     */
    public void setSegmentDurationCriteria(SegmentDurationCriteriaType value) {
        this.segmentDurationCriteria = value;
    }

    /**
     * Group and subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCriteriaType }
     *     
     */
    public ServiceCriteriaType getServiceCriteria() {
        return serviceCriteria;
    }

    /**
     * Sets the value of the serviceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCriteriaType }
     *     
     * @see #getServiceCriteria()
     */
    public void setServiceCriteria(ServiceCriteriaType value) {
        this.serviceCriteria = value;
    }

    /**
     * Passenger Special Needs Attributes.
     * 
     * Notes:
     *  1. Supports specification of Traveler special needs in both IATA SSR encoding and non-IATA encoding.
     * 
     *  2. Special Needs may be associated to individual Travelers but will apply to ALL Travelers if no associations are specified.
     * 
     *  3. Special Needs may be associated to flight segments but will apply to ALL flight segments if no associations are specified.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServiceType }
     *     
     */
    public SpecialServiceType getSpecialNeedsCriteria() {
        return specialNeedsCriteria;
    }

    /**
     * Sets the value of the specialNeedsCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServiceType }
     *     
     * @see #getSpecialNeedsCriteria()
     */
    public void setSpecialNeedsCriteria(SpecialServiceType value) {
        this.specialNeedsCriteria = value;
    }

    /**
     * Trip purpose information (e.g. Business, Leisure, etc.).
     * 
     * @return
     *     possible object is
     *     {@link TripPurposeCodeContentType }
     *     
     */
    public TripPurposeCodeContentType getTripPurposeCode() {
        return tripPurposeCode;
    }

    /**
     * Sets the value of the tripPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPurposeCodeContentType }
     *     
     * @see #getTripPurposeCode()
     */
    public void setTripPurposeCode(TripPurposeCodeContentType value) {
        this.tripPurposeCode = value;
    }

}
