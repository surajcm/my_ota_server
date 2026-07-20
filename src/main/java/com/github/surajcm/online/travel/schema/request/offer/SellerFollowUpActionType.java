
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A seller followup action following involuntary change means a subsequent action required to an Order Item after a schedule change.
 * 
 * <p>Java class for SellerFollowUpActionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SellerFollowUpActionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SellerFollowupActionCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ActionInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType"/>
 *         <element name="ActionTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="AirlineContactURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}URI_Type" minOccurs="0"/>
 *         <element name="ConsequenceOfInactionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ConsequenceOfInactionCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerFollowUpActionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "actionCode",
    "actionInd",
    "actionTimeLimitDateTime",
    "airlineContactURI",
    "consequenceOfInactionCode"
})
public class SellerFollowUpActionType {

    /**
     * A seller followup action following involuntary change at OrderItem level.  Possible values: o	Accept o	Reshop, with ability to add optional FareWaiver o	Cancel, with ability to add optional FareWaiver o	Contact Airline with the ability to include an                option URL for the contact details.
     * 
     */
    @XmlElement(name = "ActionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected List<SellerFollowupActionCodeContentType> actionCode;
    /**
     * Action indicator at Order Item level with the following possible value. A â€˜trueâ€™ value is returned when the follow-up action has not been completed. Absense of the indicator (or blank) means that there is no pending action.
     * 
     */
    @XmlElement(name = "ActionInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected boolean actionInd;
    /**
     * Point in date and time until the seller is allowed to take any FollowUpAction regarding an Order Item after a schedule change.
     * 
     */
    @XmlElement(name = "ActionTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType actionTimeLimitDateTime;
    /**
     * Airline Contact URL
     * 
     */
    @XmlElement(name = "AirlineContactURI", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "anyURI")
    protected String airlineContactURI;
    /**
     * Impact of not taking any action by the seller after a schedule change by the airline.   Possible values: o	Auto-acceptance by airline o	Auto-cancellation by airline
     * 
     */
    @XmlElement(name = "ConsequenceOfInactionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected ConsequenceOfInactionCodeContentType consequenceOfInactionCode;

    /**
     * A seller followup action following involuntary change at OrderItem level.  Possible values: o	Accept o	Reshop, with ability to add optional FareWaiver o	Cancel, with ability to add optional FareWaiver o	Contact Airline with the ability to include an                option URL for the contact details.
     * 
     * Gets the value of the actionCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SellerFollowupActionCodeContentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the actionCode property.
     */
    public List<SellerFollowupActionCodeContentType> getActionCode() {
        if (actionCode == null) {
            actionCode = new ArrayList<>();
        }
        return this.actionCode;
    }

    /**
     * Action indicator at Order Item level with the following possible value. A â€˜trueâ€™ value is returned when the follow-up action has not been completed. Absense of the indicator (or blank) means that there is no pending action.
     * 
     */
    public boolean isActionInd() {
        return actionInd;
    }

    /**
     * Sets the value of the actionInd property.
     * 
     */
    public void setActionInd(boolean value) {
        this.actionInd = value;
    }

    /**
     * Point in date and time until the seller is allowed to take any FollowUpAction regarding an Order Item after a schedule change.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getActionTimeLimitDateTime() {
        return actionTimeLimitDateTime;
    }

    /**
     * Sets the value of the actionTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getActionTimeLimitDateTime()
     */
    public void setActionTimeLimitDateTime(DateTimeType value) {
        this.actionTimeLimitDateTime = value;
    }

    /**
     * Airline Contact URL
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineContactURI() {
        return airlineContactURI;
    }

    /**
     * Sets the value of the airlineContactURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirlineContactURI()
     */
    public void setAirlineContactURI(String value) {
        this.airlineContactURI = value;
    }

    /**
     * Impact of not taking any action by the seller after a schedule change by the airline.   Possible values: o	Auto-acceptance by airline o	Auto-cancellation by airline
     * 
     * @return
     *     possible object is
     *     {@link ConsequenceOfInactionCodeContentType }
     *     
     */
    public ConsequenceOfInactionCodeContentType getConsequenceOfInactionCode() {
        return consequenceOfInactionCode;
    }

    /**
     * Sets the value of the consequenceOfInactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsequenceOfInactionCodeContentType }
     *     
     * @see #getConsequenceOfInactionCode()
     */
    public void setConsequenceOfInactionCode(ConsequenceOfInactionCodeContentType value) {
        this.consequenceOfInactionCode = value;
    }

}
