
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Deduction from the price amount, made in advance of its payment.
 * 
 * <p>Java class for DiscountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiscountType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="DiscountAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         <element name="DiscountPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PercentType" minOccurs="0"/>
 *         <element name="PreDiscountedAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "appText",
    "descText",
    "discountAmount",
    "discountPercent",
    "preDiscountedAmount"
})
public class DiscountType {

    /**
     * Discount application, e.g. Bag.
     * 
     */
    @XmlElement(name = "AppText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String appText;
    /**
     * Discount Description.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String descText;
    /**
     * Discount amount applied to a price.
     * 
     */
    @XmlElement(name = "DiscountAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType discountAmount;
    /**
     * Discount percentage applied to the price.
     * 
     */
    @XmlElement(name = "DiscountPercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal discountPercent;
    /**
     * The original price on which the discount was applied to.
     * 
     */
    @XmlElement(name = "PreDiscountedAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType preDiscountedAmount;

    /**
     * Discount application, e.g. Bag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppText() {
        return appText;
    }

    /**
     * Sets the value of the appText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAppText()
     */
    public void setAppText(String value) {
        this.appText = value;
    }

    /**
     * Discount Description.
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
     * Discount amount applied to a price.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getDiscountAmount()
     */
    public void setDiscountAmount(AmountType value) {
        this.discountAmount = value;
    }

    /**
     * Discount percentage applied to the price.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDiscountPercent()
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * The original price on which the discount was applied to.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreDiscountedAmount() {
        return preDiscountedAmount;
    }

    /**
     * Sets the value of the preDiscountedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getPreDiscountedAmount()
     */
    public void setPreDiscountedAmount(AmountType value) {
        this.preDiscountedAmount = value;
    }

}
