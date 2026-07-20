
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Calendar based Flight Price. This capability supports multi-day calendar shopping, e.g. returning priced flight offers for a specified period before and/or after the actual requested date.
 * 
 * <p>Java class for PriceCalendarType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceCalendarType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LeadPriceInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="PriceCalendarDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PriceCalendarDateType" maxOccurs="unbounded"/>
 *         <element name="PricedPTC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PTC_OfferParametersType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TotalPriceAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceCalendarType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "leadPriceInd",
    "priceCalendarDate",
    "pricedPTC",
    "totalPriceAmount"
})
public class PriceCalendarType {

    /**
     * When true, this is a lead calendar shopping price for a date that is prior to or after the required travel date.
     * 
     */
    @XmlElement(name = "LeadPriceInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean leadPriceInd;
    /**
     * Price Calendar Date
     * 
     */
    @XmlElement(name = "PriceCalendarDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected List<PriceCalendarDateType> priceCalendarDate;
    /**
     * Passenger Type summary information for an offer.
     * 
     */
    @XmlElement(name = "PricedPTC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<PTCOfferParametersType> pricedPTC;
    /**
     * The total Offer price for all passengers associated with the specified Origin Destination and Date.
     * 
     */
    @XmlElement(name = "TotalPriceAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType totalPriceAmount;

    /**
     * When true, this is a lead calendar shopping price for a date that is prior to or after the required travel date.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPriceInd() {
        return leadPriceInd;
    }

    /**
     * Sets the value of the leadPriceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLeadPriceInd()
     */
    public void setLeadPriceInd(Boolean value) {
        this.leadPriceInd = value;
    }

    /**
     * Price Calendar Date
     * 
     * Gets the value of the priceCalendarDate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceCalendarDate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceCalendarDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalendarDateType }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceCalendarDate property.
     */
    public List<PriceCalendarDateType> getPriceCalendarDate() {
        if (priceCalendarDate == null) {
            priceCalendarDate = new ArrayList<>();
        }
        return this.priceCalendarDate;
    }

    /**
     * Passenger Type summary information for an offer.
     * 
     * Gets the value of the pricedPTC property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedPTC property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPricedPTC().add(newItem);
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
     *     The value of the pricedPTC property.
     */
    public List<PTCOfferParametersType> getPricedPTC() {
        if (pricedPTC == null) {
            pricedPTC = new ArrayList<>();
        }
        return this.pricedPTC;
    }

    /**
     * The total Offer price for all passengers associated with the specified Origin Destination and Date.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalPriceAmount() {
        return totalPriceAmount;
    }

    /**
     * Sets the value of the totalPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getTotalPriceAmount()
     */
    public void setTotalPriceAmount(AmountType value) {
        this.totalPriceAmount = value;
    }

}
