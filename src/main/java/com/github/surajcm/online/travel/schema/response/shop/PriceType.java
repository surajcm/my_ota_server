
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
 * The amount of money expected, required, or given in payment for something  .
 * 
 * <p>Java class for PriceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         <element name="BaseAmountGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         <element name="CurConversion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CurConversionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Discount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DiscountType" minOccurs="0"/>
 *         <element name="EquivAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         <element name="Fee" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}FeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LoyaltyUnitAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         <element name="LoyaltyUnitName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         <element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SurchargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxSummary" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TaxSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "baseAmount",
    "baseAmountGuaranteeTimeLimitDateTime",
    "curConversion",
    "discount",
    "equivAmount",
    "fee",
    "loyaltyUnitAmount",
    "loyaltyUnitName",
    "surcharge",
    "taxSummary",
    "totalAmount"
})
public class PriceType {

    /**
     * Total Base Fare Amount. Example: 200000
     * 
     */
    @XmlElement(name = "BaseAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType baseAmount;
    /**
     * The length of time the Base Amount of an offer item is guaranteed.  In the absence of the Base Amount guarantee time limit, the Base Amount is not guaranteed.  Upon expiry, the Base Amount may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.    Should the Base Amount guarantee time limit extend beyond Order creation, the remaining length of time persists into the corresponding Order Item.  The airline can increase the remaining length of time beyond the original time limit should they wish to.  This field should only be used when the Airline indicates that a Price Guarantee is available.
     * 
     */
    @XmlElement(name = "BaseAmountGuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType baseAmountGuaranteeTimeLimitDateTime;
    /**
     * The result of converting one currency into another currency. E.g. local currency to USD, air miles to monetary.
     * 
     */
    @XmlElement(name = "CurConversion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<CurConversionType> curConversion;
    /**
     * Deduction from the price amount, made in advance of its payment.
     * 
     */
    @XmlElement(name = "Discount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DiscountType discount;
    /**
     * The entire amount of transaction stated in the local currency at the point of sale, or the currency as defined by the Currency Indicator Code.
     * 
     */
    @XmlElement(name = "EquivAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType equivAmount;
    /**
     * Amount added on to a charge for a specific product, purpose, or service .
     * 
     */
    @XmlElement(name = "Fee", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<FeeType> fee;
    /**
     * Amount specified in loyalty units. Note: the 'Currency Code' sup for this BDT should not be populated.
     * 
     */
    @XmlElement(name = "LoyaltyUnitAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType loyaltyUnitAmount;
    /**
     * The name of the loyalty unit used by the loyalty unit amount (e.g. miles or points).
     * 
     */
    @XmlElement(name = "LoyaltyUnitName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String loyaltyUnitName;
    /**
     * Amount added on to a usual charge for a specific product, purpose, or service.
     * 
     */
    @XmlElement(name = "Surcharge", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<SurchargeType> surcharge;
    /**
     * Tax summary information.
     * 
     */
    @XmlElement(name = "TaxSummary", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<TaxSummaryType> taxSummary;
    /**
     * Total monetary price amount, including all tax, surcharge, and fee amounts.
     * 
     */
    @XmlElement(name = "TotalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
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
     * The result of converting one currency into another currency. E.g. local currency to USD, air miles to monetary.
     * 
     * Gets the value of the curConversion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curConversion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCurConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurConversionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the curConversion property.
     */
    public List<CurConversionType> getCurConversion() {
        if (curConversion == null) {
            curConversion = new ArrayList<>();
        }
        return this.curConversion;
    }

    /**
     * Deduction from the price amount, made in advance of its payment.
     * 
     * @return
     *     possible object is
     *     {@link DiscountType }
     *     
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountType }
     *     
     * @see #getDiscount()
     */
    public void setDiscount(DiscountType value) {
        this.discount = value;
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
     * Amount added on to a charge for a specific product, purpose, or service .
     * 
     * Gets the value of the fee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fee property.
     */
    public List<FeeType> getFee() {
        if (fee == null) {
            fee = new ArrayList<>();
        }
        return this.fee;
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
     * Amount added on to a usual charge for a specific product, purpose, or service.
     * 
     * Gets the value of the surcharge property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surcharge property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurchargeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the surcharge property.
     */
    public List<SurchargeType> getSurcharge() {
        if (surcharge == null) {
            surcharge = new ArrayList<>();
        }
        return this.surcharge;
    }

    /**
     * Tax summary information.
     * 
     * Gets the value of the taxSummary property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSummary property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSummaryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxSummary property.
     */
    public List<TaxSummaryType> getTaxSummary() {
        if (taxSummary == null) {
            taxSummary = new ArrayList<>();
        }
        return this.taxSummary;
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
