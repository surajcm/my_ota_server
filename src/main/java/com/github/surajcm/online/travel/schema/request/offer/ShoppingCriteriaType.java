
package com.github.surajcm.online.travel.schema.request.offer;

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
 *         <element name="AllianceCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AllianceCriteriaType" minOccurs="0"/>
 *         <element name="BaggagePricingCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BaggagePricingCriteriaType" minOccurs="0"/>
 *         <element name="CabinTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CabinTypeType" minOccurs="0"/>
 *         <element name="ConnectionCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ConnectionCriteriaType" minOccurs="0"/>
 *         <element name="ExistingOrderCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ExistingOrderCriteriaType" minOccurs="0"/>
 *         <element name="FareCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}FareCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FlightCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}FlightCriteriaType" minOccurs="0"/>
 *         <element name="PaymentMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaymentMethodCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ProgramCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ProgramCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PromotionCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PromotionType" minOccurs="0"/>
 *         <element name="SeatCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceCriteriaType" minOccurs="0"/>
 *         <element name="SpecialNeedsCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SpecialServiceType" minOccurs="0"/>
 *         <element name="TripPurposeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TripPurposeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "allianceCriteria",
    "baggagePricingCriteria",
    "cabinTypeCriteria",
    "connectionCriteria",
    "existingOrderCriteria",
    "fareCriteria",
    "flightCriteria",
    "paymentMethodCriteria",
    "programCriteria",
    "promotionCriteria",
    "seatCriteria",
    "serviceCriteria",
    "specialNeedsCriteria",
    "tripPurposeCode"
})
public class ShoppingCriteriaType {

    /**
     * Alliance specific filter criteria for shopping requests.
     * 
     */
    @XmlElement(name = "AllianceCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AllianceCriteriaType allianceCriteria;
    /**
     * Baggage pricing specific filter criteria for shopping requests, including baggage type, charges, and settlement information.
     * 
     */
    @XmlElement(name = "BaggagePricingCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BaggagePricingCriteriaType baggagePricingCriteria;
    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "CabinTypeCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected CabinTypeType cabinTypeCriteria;
    /**
     * Transfer location specific filter criteria for shopping requests.
     * 
     */
    @XmlElement(name = "ConnectionCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ConnectionCriteriaType connectionCriteria;
    /**
     * References to Orders that were created from Offers that have already been purchased, booked and/or are being held for a Passenger.
     * 
     */
    @XmlElement(name = "ExistingOrderCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ExistingOrderCriteriaType existingOrderCriteria;
    /**
     * Fare criteria used to filter shopping results.
     * 
     */
    @XmlElement(name = "FareCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<FareCriteriaType> fareCriteria;
    /**
     * Flight filter criteria including aircraft features, Cabin Type, RBD, and Tail Number.
     * 
     */
    @XmlElement(name = "FlightCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected FlightCriteriaType flightCriteria;
    /**
     * Criteria for: A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
     * 
     */
    @XmlElement(name = "PaymentMethodCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<PaymentMethodCriteriaType> paymentMethodCriteria;
    /**
     * Discount program specific filter criteria for shopping requests.
     * 
     */
    @XmlElement(name = "ProgramCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<ProgramCriteriaType> programCriteria;
    /**
     * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
     * 
     */
    @XmlElement(name = "PromotionCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PromotionType promotionCriteria;
    /**
     * A sitting place for a passenger located in the cabin.
     * 
     */
    @XmlElement(name = "SeatCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<SeatType> seatCriteria;
    /**
     * Reason for Issuance Group and Subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
     * 
     */
    @XmlElement(name = "ServiceCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ServiceCriteriaType serviceCriteria;
    /**
     * Special service information
     * 
     */
    @XmlElement(name = "SpecialNeedsCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SpecialServiceType specialNeedsCriteria;
    /**
     * Trip purpose information (e.g. Business, Leisure, etc.).
     * 
     */
    @XmlElement(name = "TripPurposeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "string")
    protected TripPurposeCodeContentType tripPurposeCode;

    /**
     * Alliance specific filter criteria for shopping requests.
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
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinTypeCriteria() {
        return cabinTypeCriteria;
    }

    /**
     * Sets the value of the cabinTypeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     * @see #getCabinTypeCriteria()
     */
    public void setCabinTypeCriteria(CabinTypeType value) {
        this.cabinTypeCriteria = value;
    }

    /**
     * Transfer location specific filter criteria for shopping requests.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCriteriaType }
     *     
     */
    public ConnectionCriteriaType getConnectionCriteria() {
        return connectionCriteria;
    }

    /**
     * Sets the value of the connectionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCriteriaType }
     *     
     * @see #getConnectionCriteria()
     */
    public void setConnectionCriteria(ConnectionCriteriaType value) {
        this.connectionCriteria = value;
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
     * Discount program specific filter criteria for shopping requests.
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
     * A sitting place for a passenger located in the cabin.
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
     * Reason for Issuance Group and Subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
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
     * Special service information
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
