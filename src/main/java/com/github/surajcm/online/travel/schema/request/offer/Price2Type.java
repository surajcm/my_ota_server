
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The amount of money expected, required, or given in payment for something.
 * 
 * <p>Java class for Price2Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Price2Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="BaseAmountGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="EquivAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="LoyaltyUnitAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="LoyaltyUnitName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NameType" minOccurs="0"/>
 *         <element name="MaskedInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price2Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "baseAmount",
    "baseAmountGuaranteeTimeLimitDateTime",
    "equivAmount",
    "loyaltyUnitAmount",
    "loyaltyUnitName",
    "maskedInd",
    "totalAmount"
})
public class Price2Type {

    /**
     * Total Base Fare Amount. Example: 200000
     * 
     */
    @XmlElement(name = "BaseAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType baseAmount;
    /**
     * The length of time the Base Amount of an offer item is guaranteed.  In the absence of the Base Amount guarantee time limit, the Base Amount is not guaranteed.  Upon expiry, the Base Amount may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.    Should the Base Amount guarantee time limit extend beyond Order creation, the remaining length of time persists into the corresponding Order Item.  The airline can increase the remaining length of time beyond the original time limit should they wish to.  This field should only be used when the Airline indicates that a Price Guarantee is available.
     * 
     */
    @XmlElement(name = "BaseAmountGuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType baseAmountGuaranteeTimeLimitDateTime;
    /**
     * The entire amount of transaction stated in the local currency at the point of sale, or the currency as defined by the Currency Indicator Code.
     * 
     */
    @XmlElement(name = "EquivAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType equivAmount;
    /**
     * Amount specified in loyalty units. Note: the 'Currency Code' sup for this BDT should not be populated.
     * 
     */
    @XmlElement(name = "LoyaltyUnitAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType loyaltyUnitAmount;
    /**
     * The name of the loyalty unit used by the loyalty unit amount (e.g. miles or points).
     * 
     */
    @XmlElement(name = "LoyaltyUnitName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String loyaltyUnitName;
    /**
     * Indicator to advise the Seller if the price will be masked to the Customer
     * 
     */
    @XmlElement(name = "MaskedInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean maskedInd;
    /**
     * Total monetary price amount, including all tax, surcharge, and fee amounts.
     * 
     */
    @XmlElement(name = "TotalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType totalAmount;

    /**
     * Total Base Fare Amount. Example: 200000
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getBaseAmount()
     */
    public void setBaseAmount(AmountType value) {
        this.baseAmount = value;
    }

    /**
     * The length of time the Base Amount of an offer item is guaranteed.  In the absence of the Base Amount guarantee time limit, the Base Amount is not guaranteed.  Upon expiry, the Base Amount may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.    Should the Base Amount guarantee time limit extend beyond Order creation, the remaining length of time persists into the corresponding Order Item.  The airline can increase the remaining length of time beyond the original time limit should they wish to.  This field should only be used when the Airline indicates that a Price Guarantee is available.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getBaseAmountGuaranteeTimeLimitDateTime() {
        return baseAmountGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the baseAmountGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getBaseAmountGuaranteeTimeLimitDateTime()
     */
    public void setBaseAmountGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.baseAmountGuaranteeTimeLimitDateTime = value;
    }

    /**
     * The entire amount of transaction stated in the local currency at the point of sale, or the currency as defined by the Currency Indicator Code.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquivAmount() {
        return equivAmount;
    }

    /**
     * Sets the value of the equivAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getEquivAmount()
     */
    public void setEquivAmount(AmountType value) {
        this.equivAmount = value;
    }

    /**
     * Amount specified in loyalty units. Note: the 'Currency Code' sup for this BDT should not be populated.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoyaltyUnitAmount() {
        return loyaltyUnitAmount;
    }

    /**
     * Sets the value of the loyaltyUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getLoyaltyUnitAmount()
     */
    public void setLoyaltyUnitAmount(AmountType value) {
        this.loyaltyUnitAmount = value;
    }

    /**
     * The name of the loyalty unit used by the loyalty unit amount (e.g. miles or points).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyUnitName() {
        return loyaltyUnitName;
    }

    /**
     * Sets the value of the loyaltyUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLoyaltyUnitName()
     */
    public void setLoyaltyUnitName(String value) {
        this.loyaltyUnitName = value;
    }

    /**
     * Indicator to advise the Seller if the price will be masked to the Customer
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaskedInd() {
        return maskedInd;
    }

    /**
     * Sets the value of the maskedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMaskedInd()
     */
    public void setMaskedInd(Boolean value) {
        this.maskedInd = value;
    }

    /**
     * Total monetary price amount, including all tax, surcharge, and fee amounts.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getTotalAmount()
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

}
