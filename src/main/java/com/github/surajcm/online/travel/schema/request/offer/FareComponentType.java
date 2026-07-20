
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
 * A portion of an itinerary between two consecutive fare construction points. If the journey has only one fare component, the points of origin and destination are the only fare construction points
 * 
 * <p>Java class for FareComponentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FareComponentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CabinTypeType" minOccurs="0"/>
 *         <element name="FareBasisAppCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="FareBasisCityPairText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/>
 *         <element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="FareRule" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}FareRuleType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FareTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="NegotiatedCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Price" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PriceType" minOccurs="0"/>
 *         <element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         <element name="RBD" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RBD_Type" minOccurs="0"/>
 *         <element name="TicketDesigCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "cabinType",
    "fareBasisAppCode",
    "fareBasisCityPairText",
    "fareBasisCode",
    "fareRule",
    "fareTypeCode",
    "negotiatedCode",
    "paxSegmentRefID",
    "price",
    "priceClassRefID",
    "rbd",
    "ticketDesigCode"
})
public class FareComponentType {

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "CabinType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected CabinTypeType cabinType;
    /**
     * Indicates how the fare basis was applied. E.g. Requested, Ticketed, Other.
     * 
     */
    @XmlElement(name = "FareBasisAppCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisAppCode;
    /**
     * Identified published fare. Origin and destination city codes and two character designator of fare owning airline associated with Fare Basis Code. Example: MIANCEDL
     * 
     */
    @XmlElement(name = "FareBasisCityPairText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String fareBasisCityPairText;
    /**
     * Fare basis code. Example: Y26
     * 
     */
    @XmlElement(name = "FareBasisCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisCode;
    /**
     * Special purchasing rules and restrictions used to differentiate fare levels from one another.
     * 
     */
    @XmlElement(name = "FareRule", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<FareRuleType> fareRule;
    /**
     * Fare Amount Type Code, ex: ADC (Additional Charge), IT (Tour Inclusive), NOADC (No additional charge).
     * 
     */
    @XmlElement(name = "FareTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareTypeCode;
    /**
     * Identifies the Negotiated code/fare qualifier PADIS codeset 9910
     * 
     */
    @XmlElement(name = "NegotiatedCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String negotiatedCode;
    /**
     * Reference to a Pax Segment ID.
     * 
     */
    @XmlElement(name = "PaxSegmentRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxSegmentRefID;
    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     */
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PriceType price;
    /**
     * A price point within a particular Cabin Type (sometimes referred to as 'Fare Families').
     * 
     */
    @XmlElement(name = "PriceClassRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassRefID;
    /**
     * Reservation Booking Designator. A categorization used to facilitate access to inventory, application of filed fares, and to identify cabin entitlement. Identified using a single alpha character. E.g. 'J' for Business Class Premium, 'D' for Business Discounted.
     * 
     */
    @XmlElement(name = "RBD", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected RBDType rbd;
    /**
     * The Fare Basis Code Designator shall be placed within this element and removed from the Fare Basis Code element. For example, if the Airline has a fare basis code with a designator like 'JFBC/WO'. The Fare basis Code element should contain 'JFBC' and this element should contain'WO'.
     * 
     */
    @XmlElement(name = "TicketDesigCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String ticketDesigCode;

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     * @see #getCabinType()
     */
    public void setCabinType(CabinTypeType value) {
        this.cabinType = value;
    }

    /**
     * Indicates how the fare basis was applied. E.g. Requested, Ticketed, Other.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisAppCode() {
        return fareBasisAppCode;
    }

    /**
     * Sets the value of the fareBasisAppCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasisAppCode()
     */
    public void setFareBasisAppCode(String value) {
        this.fareBasisAppCode = value;
    }

    /**
     * Identified published fare. Origin and destination city codes and two character designator of fare owning airline associated with Fare Basis Code. Example: MIANCEDL
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCityPairText() {
        return fareBasisCityPairText;
    }

    /**
     * Sets the value of the fareBasisCityPairText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasisCityPairText()
     */
    public void setFareBasisCityPairText(String value) {
        this.fareBasisCityPairText = value;
    }

    /**
     * Fare basis code. Example: Y26
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasisCode()
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Special purchasing rules and restrictions used to differentiate fare levels from one another.
     * 
     * Gets the value of the fareRule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRuleType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareRule property.
     */
    public List<FareRuleType> getFareRule() {
        if (fareRule == null) {
            fareRule = new ArrayList<>();
        }
        return this.fareRule;
    }

    /**
     * Fare Amount Type Code, ex: ADC (Additional Charge), IT (Tour Inclusive), NOADC (No additional charge).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareTypeCode() {
        return fareTypeCode;
    }

    /**
     * Sets the value of the fareTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareTypeCode()
     */
    public void setFareTypeCode(String value) {
        this.fareTypeCode = value;
    }

    /**
     * Identifies the Negotiated code/fare qualifier PADIS codeset 9910
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotiatedCode() {
        return negotiatedCode;
    }

    /**
     * Sets the value of the negotiatedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNegotiatedCode()
     */
    public void setNegotiatedCode(String value) {
        this.negotiatedCode = value;
    }

    /**
     * Reference to a Pax Segment ID.
     * 
     * Gets the value of the paxSegmentRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegmentRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxSegmentRefID().add(newItem);
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
     *     The value of the paxSegmentRefID property.
     */
    public List<String> getPaxSegmentRefID() {
        if (paxSegmentRefID == null) {
            paxSegmentRefID = new ArrayList<>();
        }
        return this.paxSegmentRefID;
    }

    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     * @see #getPrice()
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * A price point within a particular Cabin Type (sometimes referred to as 'Fare Families').
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClassRefID() {
        return priceClassRefID;
    }

    /**
     * Sets the value of the priceClassRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPriceClassRefID()
     */
    public void setPriceClassRefID(String value) {
        this.priceClassRefID = value;
    }

    /**
     * Reservation Booking Designator. A categorization used to facilitate access to inventory, application of filed fares, and to identify cabin entitlement. Identified using a single alpha character. E.g. 'J' for Business Class Premium, 'D' for Business Discounted.
     * 
     * @return
     *     possible object is
     *     {@link RBDType }
     *     
     */
    public RBDType getRBD() {
        return rbd;
    }

    /**
     * Sets the value of the rbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RBDType }
     *     
     * @see #getRBD()
     */
    public void setRBD(RBDType value) {
        this.rbd = value;
    }

    /**
     * The Fare Basis Code Designator shall be placed within this element and removed from the Fare Basis Code element. For example, if the Airline has a fare basis code with a designator like 'JFBC/WO'. The Fare basis Code element should contain 'JFBC' and this element should contain'WO'.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesigCode() {
        return ticketDesigCode;
    }

    /**
     * Sets the value of the ticketDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketDesigCode()
     */
    public void setTicketDesigCode(String value) {
        this.ticketDesigCode = value;
    }

}
