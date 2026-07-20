
package com.github.surajcm.online.travel.schema.response.offer;

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
 *         <element name="AmountRangeMaximumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         <element name="AmountRangeMinimumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         <element name="PercentageRangeMaximumPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PercentType" minOccurs="0"/>
 *         <element name="PercentageRangeMinimumPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PercentType" minOccurs="0"/>
 *         <element name="RoundingNumberOfDecimalsNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}NumberType" minOccurs="0"/>
 *         <element name="RoundingPrecisionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}RoundingPrecisionCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeInfoType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "amountRangeMaximumAmount",
    "amountRangeMinimumAmount",
    "percentageRangeMaximumPercent",
    "percentageRangeMinimumPercent",
    "roundingNumberOfDecimalsNumber",
    "roundingPrecisionCode"
})
public class SurchargeInfoType {

    /**
     * Maximum Amount of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "AmountRangeMaximumAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected AmountType amountRangeMaximumAmount;
    /**
     * Minimum Amount of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "AmountRangeMinimumAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected AmountType amountRangeMinimumAmount;
    /**
     * Maximum Percentage value of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "PercentageRangeMaximumPercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal percentageRangeMaximumPercent;
    /**
     * Minimum Percentage value of a Fee range of a payment method
     * 
     */
    @XmlElement(name = "PercentageRangeMinimumPercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal percentageRangeMinimumPercent;
    /**
     * Number of decimals of fee rounding
     * 
     */
    @XmlElement(name = "RoundingNumberOfDecimalsNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal roundingNumberOfDecimalsNumber;
    /**
     * precision of fee rounding
     * 
     */
    @XmlElement(name = "RoundingPrecisionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlSchemaType(name = "token")
    protected RoundingPrecisionCodeContentType roundingPrecisionCode;

    /**
     * Maximum Amount of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountRangeMaximumAmount() {
        return amountRangeMaximumAmount;
    }

    /**
     * Sets the value of the amountRangeMaximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAmountRangeMaximumAmount()
     */
    public void setAmountRangeMaximumAmount(AmountType value) {
        this.amountRangeMaximumAmount = value;
    }

    /**
     * Minimum Amount of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountRangeMinimumAmount() {
        return amountRangeMinimumAmount;
    }

    /**
     * Sets the value of the amountRangeMinimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAmountRangeMinimumAmount()
     */
    public void setAmountRangeMinimumAmount(AmountType value) {
        this.amountRangeMinimumAmount = value;
    }

    /**
     * Maximum Percentage value of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageRangeMaximumPercent() {
        return percentageRangeMaximumPercent;
    }

    /**
     * Sets the value of the percentageRangeMaximumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPercentageRangeMaximumPercent()
     */
    public void setPercentageRangeMaximumPercent(BigDecimal value) {
        this.percentageRangeMaximumPercent = value;
    }

    /**
     * Minimum Percentage value of a Fee range of a payment method
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageRangeMinimumPercent() {
        return percentageRangeMinimumPercent;
    }

    /**
     * Sets the value of the percentageRangeMinimumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPercentageRangeMinimumPercent()
     */
    public void setPercentageRangeMinimumPercent(BigDecimal value) {
        this.percentageRangeMinimumPercent = value;
    }

    /**
     * Number of decimals of fee rounding
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundingNumberOfDecimalsNumber() {
        return roundingNumberOfDecimalsNumber;
    }

    /**
     * Sets the value of the roundingNumberOfDecimalsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRoundingNumberOfDecimalsNumber()
     */
    public void setRoundingNumberOfDecimalsNumber(BigDecimal value) {
        this.roundingNumberOfDecimalsNumber = value;
    }

    /**
     * precision of fee rounding
     * 
     * @return
     *     possible object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     */
    public RoundingPrecisionCodeContentType getRoundingPrecisionCode() {
        return roundingPrecisionCode;
    }

    /**
     * Sets the value of the roundingPrecisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingPrecisionCodeContentType }
     *     
     * @see #getRoundingPrecisionCode()
     */
    public void setRoundingPrecisionCode(RoundingPrecisionCodeContentType value) {
        this.roundingPrecisionCode = value;
    }

}
