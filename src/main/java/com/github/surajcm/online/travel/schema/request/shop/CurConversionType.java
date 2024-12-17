
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The result of converting one currency into another currency. E.g. local currency to USD, air miles to monetary.
 * 
 * <p>Java class for CurConversionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CurConversionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType"/>
 *         <element name="ConversionRate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RateType"/>
 *         <element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurConversionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "amount",
    "conversionRate",
    "localAmount"
})
public class CurConversionType {

    /**
     * Amount and currency specified in the converted currency. Example: 15000 USD
     * 
     */
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected AmountType amount;
    /**
     * Defines the rate used to convert the local currency into the billing currency.  Do we want to define an official name for the Billing Currency?
     * 
     */
    @XmlElement(name = "ConversionRate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected RateType conversionRate;
    /**
     * Amount and currency as specified by the local Country.
     * 
     */
    @XmlElement(name = "LocalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected AmountType localAmount;

    /**
     * Amount and currency specified in the converted currency. Example: 15000 USD
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
     * Defines the rate used to convert the local currency into the billing currency.  Do we want to define an official name for the Billing Currency?
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     * @see #getConversionRate()
     */
    public void setConversionRate(RateType value) {
        this.conversionRate = value;
    }

    /**
     * Amount and currency as specified by the local Country.
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

}
