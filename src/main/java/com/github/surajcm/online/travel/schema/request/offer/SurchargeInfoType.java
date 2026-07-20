
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about surcharges for payment methods.
 * 
 * <p>Java class for SurchargeInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurchargeInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentFeeAmountRangeMaximumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="PaymentFeeAmountRangeMinimumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="PaymentFeePercentageRangeMaximumPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PercentType"/>
 *         <element name="PaymentFeePercentageRangeMinimumPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PercentType" minOccurs="0"/>
 *         <element name="PaymentFeeRoundingNumberOfDecimalsNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NumberType" minOccurs="0"/>
 *         <element name="PaymentFeeRoundingPrecisionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RoundingPrecisionCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeInfoType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "paymentFeeAmountRangeMaximumAmount",
    "paymentFeeAmountRangeMinimumAmount",
    "paymentFeePercentageRangeMaximumPercent",
    "paymentFeePercentageRangeMinimumPercent",
    "paymentFeeRoundingNumberOfDecimalsNumber",
    "paymentFeeRoundingPrecisionCode"
})
public class SurchargeInfoType {

    /**
     * Maximum Amount of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "PaymentFeeAmountRangeMaximumAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType paymentFeeAmountRangeMaximumAmount;
    /**
     * Minimum Amount of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "PaymentFeeAmountRangeMinimumAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType paymentFeeAmountRangeMinimumAmount;
    /**
     * Maximum Percentage value of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "PaymentFeePercentageRangeMaximumPercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected BigDecimal paymentFeePercentageRangeMaximumPercent;
    /**
     * Minimum Percentage value of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "PaymentFeePercentageRangeMinimumPercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BigDecimal paymentFeePercentageRangeMinimumPercent;
    /**
     * Number of decimals of fee rounding
     * 
     */
    @XmlElement(name = "PaymentFeeRoundingNumberOfDecimalsNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BigDecimal paymentFeeRoundingNumberOfDecimalsNumber;
    /**
     * precision of fee rounding
     * 
     */
    @XmlElement(name = "PaymentFeeRoundingPrecisionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected RoundingPrecisionCodeContentType paymentFeeRoundingPrecisionCode;

    /**
     * Maximum Amount of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentFeeAmountRangeMaximumAmount() {
        return paymentFeeAmountRangeMaximumAmount;
    }

    /**
     * Sets the value of the paymentFeeAmountRangeMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getPaymentFeeAmountRangeMaximumAmount()
     */
    public void setPaymentFeeAmountRangeMaximumAmount(AmountType value) {
        this.paymentFeeAmountRangeMaximumAmount = value;
    }

    /**
     * Minimum Amount of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentFeeAmountRangeMinimumAmount() {
        return paymentFeeAmountRangeMinimumAmount;
    }

    /**
     * Sets the value of the paymentFeeAmountRangeMinimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getPaymentFeeAmountRangeMinimumAmount()
     */
    public void setPaymentFeeAmountRangeMinimumAmount(AmountType value) {
        this.paymentFeeAmountRangeMinimumAmount = value;
    }

    /**
     * Maximum Percentage value of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentFeePercentageRangeMaximumPercent() {
        return paymentFeePercentageRangeMaximumPercent;
    }

    /**
     * Sets the value of the paymentFeePercentageRangeMaximumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaymentFeePercentageRangeMaximumPercent()
     */
    public void setPaymentFeePercentageRangeMaximumPercent(BigDecimal value) {
        this.paymentFeePercentageRangeMaximumPercent = value;
    }

    /**
     * Minimum Percentage value of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentFeePercentageRangeMinimumPercent() {
        return paymentFeePercentageRangeMinimumPercent;
    }

    /**
     * Sets the value of the paymentFeePercentageRangeMinimumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaymentFeePercentageRangeMinimumPercent()
     */
    public void setPaymentFeePercentageRangeMinimumPercent(BigDecimal value) {
        this.paymentFeePercentageRangeMinimumPercent = value;
    }

    /**
     * Number of decimals of fee rounding
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentFeeRoundingNumberOfDecimalsNumber() {
        return paymentFeeRoundingNumberOfDecimalsNumber;
    }

    /**
     * Sets the value of the paymentFeeRoundingNumberOfDecimalsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaymentFeeRoundingNumberOfDecimalsNumber()
     */
    public void setPaymentFeeRoundingNumberOfDecimalsNumber(BigDecimal value) {
        this.paymentFeeRoundingNumberOfDecimalsNumber = value;
    }

    /**
     * precision of fee rounding
     * 
     * @return
     *     possible object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     */
    public RoundingPrecisionCodeContentType getPaymentFeeRoundingPrecisionCode() {
        return paymentFeeRoundingPrecisionCode;
    }

    /**
     * Sets the value of the paymentFeeRoundingPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     * @see #getPaymentFeeRoundingPrecisionCode()
     */
    public void setPaymentFeeRoundingPrecisionCode(RoundingPrecisionCodeContentType value) {
        this.paymentFeeRoundingPrecisionCode = value;
    }

}
