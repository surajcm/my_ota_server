
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
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
 * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
 * 
 * <p>Java class for OfferType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OfferType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}BaggageAssociationsType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BaggageDisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="JourneyOverview" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}JourneyOverviewType" minOccurs="0"/>
 *         <element name="MatchAppText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="MatchPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PercentType" minOccurs="0"/>
 *         <element name="MatchTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MatchTypeCodeType" minOccurs="0"/>
 *         <element name="OfferExpirationTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         <element name="OfferID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type"/>
 *         <element name="OfferItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OfferItemType" maxOccurs="unbounded"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AirlineDesigCodeType"/>
 *         <element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OwnerTypeCodeType" minOccurs="0"/>
 *         <element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PTC_OfferParameters" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PTC_OfferParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RedemptionInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="RequestedDateInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="TotalPrice" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PriceType" minOccurs="0"/>
 *         <element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="WebAddressURL" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "baggageAllowance",
    "baggageDisclosureRefID",
    "desc",
    "disclosureRefID",
    "journeyOverview",
    "matchAppText",
    "matchPercent",
    "matchTypeCode",
    "offerExpirationTimeLimitDateTime",
    "offerID",
    "offerItem",
    "ownerCode",
    "ownerTypeCode",
    "penaltyRefID",
    "ptcOfferParameters",
    "redemptionInd",
    "requestedDateInd",
    "totalPrice",
    "validatingCarrierCode",
    "webAddressURL"
})
public class OfferType {

    @XmlElement(name = "BaggageAllowance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<BaggageAssociationsType> baggageAllowance;
    /**
     * Reference to a Bag Disclosure ID within this message.
     * 
     */
    @XmlElement(name = "BaggageDisclosureRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> baggageDisclosureRefID;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<DescType> desc;
    /**
     * Reference to a Disclosure ID within this message.
     * 
     */
    @XmlElement(name = "DisclosureRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disclosureRefID;
    /**
     * Summary of proposed Journey information in the context of this specific Offer.
     * 
     */
    @XmlElement(name = "JourneyOverview", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected JourneyOverviewType journeyOverview;
    /**
     * Specifies which type of flight request the match information relate to (examples: Attribute, Affinity, Other).
     * 
     */
    @XmlElement(name = "MatchAppText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String matchAppText;
    /**
     * Offer match percentage to shopping criteria type. This information should be populated when there is a partial match of the initial shopping criteria. Example: 60
     * 
     */
    @XmlElement(name = "MatchPercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal matchPercent;
    /**
     * Offer match to shopping criteria type. Examples: Full, None, Partial, Other Note: An additional percentage qualifier, such as 50%, may be specified for a Partial match.
     * 
     */
    @XmlElement(name = "MatchTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "token")
    protected MatchTypeCodeContentType matchTypeCode;
    /**
     * The length of time an offer will persist in an airlineâ€™s offer management system for use in subsequent transactions. Upon expiry, the expectation is that the offer is no longer retrievable and the shopping process must begin again. Note the presence of an Offer Time Limit does not indicate either a guarantee of price or inventory against a given Offer item within the Offer.  Should the offer time limit expire, any other time limit also expires unless an Order has been created or changed.
     * 
     */
    @XmlElement(name = "OfferExpirationTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType offerExpirationTimeLimitDateTime;
    /**
     * Carrier assigned ID which uniquely identifies a specific Offer across several messages.
     * 
     */
    @XmlElement(name = "OfferID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerID;
    /**
     * A priced grouping of one or more services within an Offer.
     * 
     */
    @XmlElement(name = "OfferItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected List<OfferItemType> offerItem;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * Indicates whether or not the owner of this Offer is the ORA or POA.
     * 
     */
    @XmlElement(name = "OwnerTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    /**
     * Reference to a Penalty ID.
     * 
     */
    @XmlElement(name = "PenaltyRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    /**
     * Passenger Type summary information for an offer.
     * 
     */
    @XmlElement(name = "PTC_OfferParameters", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<PTCOfferParametersType> ptcOfferParameters;
    /**
     * When TRUE, this Offer must be redeemed, e.g. it cannot be purchased. Note: Taxes may still apply.
     * 
     */
    @XmlElement(name = "RedemptionInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean redemptionInd;
    /**
     * Indicator to specify if the offer relates to a requested date. For example in calendar search, this indicator will be set to 'true' if this airline offer is for a requested date and will not be present (or will be set to 'false' if airline offer is for another date than requested one.
     * 
     */
    @XmlElement(name = "RequestedDateInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean requestedDateInd;
    /**
     * The amount of money expected, required, or given in payment for something  .
     * 
     */
    @XmlElement(name = "TotalPrice", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PriceType totalPrice;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "ValidatingCarrierCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatingCarrierCode;
    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     */
    @XmlElement(name = "WebAddressURL", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURL;

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAssociationsType }
     * </p>
     * 
     * 
     * @return
     *     The value of the baggageAllowance property.
     */
    public List<BaggageAssociationsType> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<>();
        }
        return this.baggageAllowance;
    }

    /**
     * Reference to a Bag Disclosure ID within this message.
     * 
     * Gets the value of the baggageDisclosureRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDisclosureRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaggageDisclosureRefID().add(newItem);
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
     *     The value of the baggageDisclosureRefID property.
     */
    public List<String> getBaggageDisclosureRefID() {
        if (baggageDisclosureRefID == null) {
            baggageDisclosureRefID = new ArrayList<>();
        }
        return this.baggageDisclosureRefID;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
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
     * {@link DescType }
     * </p>
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Reference to a Disclosure ID within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureRefID() {
        return disclosureRefID;
    }

    /**
     * Sets the value of the disclosureRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDisclosureRefID()
     */
    public void setDisclosureRefID(String value) {
        this.disclosureRefID = value;
    }

    /**
     * Summary of proposed Journey information in the context of this specific Offer.
     * 
     * @return
     *     possible object is
     *     {@link JourneyOverviewType }
     *     
     */
    public JourneyOverviewType getJourneyOverview() {
        return journeyOverview;
    }

    /**
     * Sets the value of the journeyOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyOverviewType }
     *     
     * @see #getJourneyOverview()
     */
    public void setJourneyOverview(JourneyOverviewType value) {
        this.journeyOverview = value;
    }

    /**
     * Specifies which type of flight request the match information relate to (examples: Attribute, Affinity, Other).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchAppText() {
        return matchAppText;
    }

    /**
     * Sets the value of the matchAppText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMatchAppText()
     */
    public void setMatchAppText(String value) {
        this.matchAppText = value;
    }

    /**
     * Offer match percentage to shopping criteria type. This information should be populated when there is a partial match of the initial shopping criteria. Example: 60
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchPercent() {
        return matchPercent;
    }

    /**
     * Sets the value of the matchPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMatchPercent()
     */
    public void setMatchPercent(BigDecimal value) {
        this.matchPercent = value;
    }

    /**
     * Offer match to shopping criteria type. Examples: Full, None, Partial, Other Note: An additional percentage qualifier, such as 50%, may be specified for a Partial match.
     * 
     * @return
     *     possible object is
     *     {@link MatchTypeCodeContentType }
     *     
     */
    public MatchTypeCodeContentType getMatchTypeCode() {
        return matchTypeCode;
    }

    /**
     * Sets the value of the matchTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchTypeCodeContentType }
     *     
     * @see #getMatchTypeCode()
     */
    public void setMatchTypeCode(MatchTypeCodeContentType value) {
        this.matchTypeCode = value;
    }

    /**
     * The length of time an offer will persist in an airlineâ€™s offer management system for use in subsequent transactions. Upon expiry, the expectation is that the offer is no longer retrievable and the shopping process must begin again. Note the presence of an Offer Time Limit does not indicate either a guarantee of price or inventory against a given Offer item within the Offer.  Should the offer time limit expire, any other time limit also expires unless an Order has been created or changed.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOfferExpirationTimeLimitDateTime() {
        return offerExpirationTimeLimitDateTime;
    }

    /**
     * Sets the value of the offerExpirationTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getOfferExpirationTimeLimitDateTime()
     */
    public void setOfferExpirationTimeLimitDateTime(DateTimeType value) {
        this.offerExpirationTimeLimitDateTime = value;
    }

    /**
     * Carrier assigned ID which uniquely identifies a specific Offer across several messages.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferID()
     */
    public void setOfferID(String value) {
        this.offerID = value;
    }

    /**
     * A priced grouping of one or more services within an Offer.
     * 
     * Gets the value of the offerItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the offerItem property.
     */
    public List<OfferItemType> getOfferItem() {
        if (offerItem == null) {
            offerItem = new ArrayList<>();
        }
        return this.offerItem;
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
     * Indicates whether or not the owner of this Offer is the ORA or POA.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     * @see #getOwnerTypeCode()
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Reference to a Penalty ID.
     * 
     * Gets the value of the penaltyRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPenaltyRefID().add(newItem);
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
     *     The value of the penaltyRefID property.
     */
    public List<String> getPenaltyRefID() {
        if (penaltyRefID == null) {
            penaltyRefID = new ArrayList<>();
        }
        return this.penaltyRefID;
    }

    /**
     * Passenger Type summary information for an offer.
     * 
     * Gets the value of the ptcOfferParameters property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcOfferParameters property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPTCOfferParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCOfferParametersType }
     * </p>
     * 
     * 
     * @return
     *     The value of the ptcOfferParameters property.
     */
    public List<PTCOfferParametersType> getPTCOfferParameters() {
        if (ptcOfferParameters == null) {
            ptcOfferParameters = new ArrayList<>();
        }
        return this.ptcOfferParameters;
    }

    /**
     * When TRUE, this Offer must be redeemed, e.g. it cannot be purchased. Note: Taxes may still apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedemptionInd() {
        return redemptionInd;
    }

    /**
     * Sets the value of the redemptionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRedemptionInd()
     */
    public void setRedemptionInd(Boolean value) {
        this.redemptionInd = value;
    }

    /**
     * Indicator to specify if the offer relates to a requested date. For example in calendar search, this indicator will be set to 'true' if this airline offer is for a requested date and will not be present (or will be set to 'false' if airline offer is for another date than requested one.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRequestedDateInd()
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
    }

    /**
     * The amount of money expected, required, or given in payment for something  .
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     * @see #getTotalPrice()
     */
    public void setTotalPrice(PriceType value) {
        this.totalPrice = value;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValidatingCarrierCode()
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURL() {
        return webAddressURL;
    }

    /**
     * Sets the value of the webAddressURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWebAddressURL()
     */
    public void setWebAddressURL(String value) {
        this.webAddressURL = value;
    }

}
