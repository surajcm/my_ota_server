
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Amount added on to a charge for a specific product, purpose, or service.
 * 
 * <p>Java class for FeeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FeeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType"/>
 *         <element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="DesigText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodesetValueTextType" minOccurs="0"/>
 *         <element name="GuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DateTimeType" minOccurs="0"/>
 *         <element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         <element name="RefundInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "amount",
    "approximateInd",
    "descText",
    "desigText",
    "guaranteeTimeLimitDateTime",
    "localAmount",
    "refundInd"
})
public class FeeType {

    /**
     * Fee Amount. Example: 500 USD
     * 
     */
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected AmountType amount;
    /**
     * When true, this fee is approximate.
     * 
     */
    @XmlElement(name = "ApproximateInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean approximateInd;
    /**
     * Fee/ surcharge Description. Example: U.S Customs User Fee
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String descText;
    /**
     * Fee designator code. Example: USC
     * 
     */
    @XmlElement(name = "DesigText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String desigText;
    /**
     * The length of time the fee of an offer item is guaranteed.  In the absence of the fee guarantee time limit, the fee is not guaranteed.  Upon expiry, the fee may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.    Should the fee guarantee time limit extend beyond Order creation, the remaining length of time persists into the corresponding Order Item.  The airline can increase the remaining length of time beyond the original time limit should they wish to.  This field should only be used when the Airline indicates that a Price Guarantee is available.
     * 
     */
    @XmlElement(name = "GuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected DateTimeType guaranteeTimeLimitDateTime;
    /**
     * Fee amount specified in a local currency. Example: 7 CHF
     * 
     */
    @XmlElement(name = "LocalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected AmountType localAmount;
    /**
     * When true, fee amount is refundable.
     * 
     */
    @XmlElement(name = "RefundInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean refundInd;

    /**
     * Fee Amount. Example: 500 USD
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAmount()
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * When true, this fee is approximate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isApproximateInd()
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Fee/ surcharge Description. Example: U.S Customs User Fee
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescText()
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Fee designator code. Example: USC
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesigText() {
        return desigText;
    }

    /**
     * Sets the value of the desigText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDesigText()
     */
    public void setDesigText(String value) {
        this.desigText = value;
    }

    /**
     * The length of time the fee of an offer item is guaranteed.  In the absence of the fee guarantee time limit, the fee is not guaranteed.  Upon expiry, the fee may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.    Should the fee guarantee time limit extend beyond Order creation, the remaining length of time persists into the corresponding Order Item.  The airline can increase the remaining length of time beyond the original time limit should they wish to.  This field should only be used when the Airline indicates that a Price Guarantee is available.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getGuaranteeTimeLimitDateTime() {
        return guaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the guaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getGuaranteeTimeLimitDateTime()
     */
    public void setGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.guaranteeTimeLimitDateTime = value;
    }

    /**
     * Fee amount specified in a local currency. Example: 7 CHF
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLocalAmount() {
        return localAmount;
    }

    /**
     * Sets the value of the localAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getLocalAmount()
     */
    public void setLocalAmount(AmountType value) {
        this.localAmount = value;
    }

    /**
     * When true, fee amount is refundable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInd() {
        return refundInd;
    }

    /**
     * Sets the value of the refundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRefundInd()
     */
    public void setRefundInd(Boolean value) {
        this.refundInd = value;
    }

}
