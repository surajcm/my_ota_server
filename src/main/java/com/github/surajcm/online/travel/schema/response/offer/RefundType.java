
package com.github.surajcm.online.travel.schema.response.offer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains refund type, payment type and amount attributes for a specific product, purpose, or service.
 * 
 * <p>Java class for RefundType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RefundType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="FixedAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         <element name="LevelTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}RefundLevelTypeCodeType" minOccurs="0"/>
 *         <element name="MaximumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         <element name="MinimumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         <element name="PaymentTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PaymentMethodCodeType" minOccurs="0"/>
 *         <element name="Percent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PercentType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "descText",
    "fixedAmount",
    "levelTypeCode",
    "maximumAmount",
    "minimumAmount",
    "paymentTypeCode",
    "percent"
})
public class RefundType {

    /**
     * Description. Example: 'Full refund within 30 days of departure'.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String descText;
    /**
     * Stores an exact fixed fee amount relating to this condition.
     * 
     */
    @XmlElement(name = "FixedAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected AmountType fixedAmount;
    /**
     * This will identify the type of re fundability for the condition.   This will be one of the following. Fully Refundable    Partly Refundable Non Refundable
     * 
     */
    @XmlElement(name = "LevelTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlSchemaType(name = "token")
    protected RefundLevelTypeCodeContentType levelTypeCode;
    /**
     * Stores an Maximum refund amount which will be applied when a variable fee amount is effective.
     * 
     */
    @XmlElement(name = "MaximumAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected AmountType maximumAmount;
    /**
     * Stores an Minimum refund amount which will be applied  when a variable refund amount is effective.
     * 
     */
    @XmlElement(name = "MinimumAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected AmountType minimumAmount;
    /**
     * This stores a code to represent the form of payment to be used to reimburse the customer/passenger.
     * 
     */
    @XmlElement(name = "PaymentTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentTypeCode;
    /**
     * Stores a percentage which will be used to determine the refund to be applied  in conjunction or not with minimum and maximum amounts.
     * 
     */
    @XmlElement(name = "Percent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal percent;

    /**
     * Description. Example: 'Full refund within 30 days of departure'.
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
     * Stores an exact fixed fee amount relating to this condition.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedAmount() {
        return fixedAmount;
    }

    /**
     * Sets the value of the fixedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getFixedAmount()
     */
    public void setFixedAmount(AmountType value) {
        this.fixedAmount = value;
    }

    /**
     * This will identify the type of re fundability for the condition.   This will be one of the following. Fully Refundable    Partly Refundable Non Refundable
     * 
     * @return
     *     possible object is
     *     {@link RefundLevelTypeCodeContentType }
     *     
     */
    public RefundLevelTypeCodeContentType getLevelTypeCode() {
        return levelTypeCode;
    }

    /**
     * Sets the value of the levelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundLevelTypeCodeContentType }
     *     
     * @see #getLevelTypeCode()
     */
    public void setLevelTypeCode(RefundLevelTypeCodeContentType value) {
        this.levelTypeCode = value;
    }

    /**
     * Stores an Maximum refund amount which will be applied when a variable fee amount is effective.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getMaximumAmount()
     */
    public void setMaximumAmount(AmountType value) {
        this.maximumAmount = value;
    }

    /**
     * Stores an Minimum refund amount which will be applied  when a variable refund amount is effective.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getMinimumAmount()
     */
    public void setMinimumAmount(AmountType value) {
        this.minimumAmount = value;
    }

    /**
     * This stores a code to represent the form of payment to be used to reimburse the customer/passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentTypeCode()
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

    /**
     * Stores a percentage which will be used to determine the refund to be applied  in conjunction or not with minimum and maximum amounts.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPercent()
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}
