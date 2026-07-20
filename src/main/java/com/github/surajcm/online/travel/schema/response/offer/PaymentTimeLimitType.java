
package com.github.surajcm.online.travel.schema.response.offer;

import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * This node is used to indicate by when payment commitment must be received for confirmed Order Item in an Order.  To indicate instant payment, the duration field should be populated with a value of 0.  If no value is returned, then no advice has been given.
 * 
 * <p>Java class for PaymentTimeLimitType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentTimeLimitType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DateTimeType" minOccurs="0"/>
 *         <element name="PaymentTimeLimitDuration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DurationType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTimeLimitType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "paymentTimeLimitDateTime",
    "paymentTimeLimitDuration"
})
public class PaymentTimeLimitType {

    /**
     * A date/time by which payment commitment is required for a given Order Item.  For example: PaymentTimeLimitDateTime: '2018-01-01T12:00:00Z' shows a static payment commitment date/time for a given Order Item.
     * 
     */
    @XmlElement(name = "PaymentTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected DateTimeType paymentTimeLimitDateTime;
    /**
     * Duration from the Order creation date by which payment commitment is required for a given Order Item.  For example: PaymentTimeLimitDuration: 'PT48H3M6S' shows the amount of time after Order is created/changed that payment commitment must be made for a given Order Item. PaymentTimeLimitDuration: 'PT0H0M0S' indicates instant payment is required for a given Order Item.
     * 
     */
    @XmlElement(name = "PaymentTimeLimitDuration", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Duration paymentTimeLimitDuration;

    /**
     * A date/time by which payment commitment is required for a given Order Item.  For example: PaymentTimeLimitDateTime: '2018-01-01T12:00:00Z' shows a static payment commitment date/time for a given Order Item.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPaymentTimeLimitDateTime() {
        return paymentTimeLimitDateTime;
    }

    /**
     * Sets the value of the paymentTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getPaymentTimeLimitDateTime()
     */
    public void setPaymentTimeLimitDateTime(DateTimeType value) {
        this.paymentTimeLimitDateTime = value;
    }

    /**
     * Duration from the Order creation date by which payment commitment is required for a given Order Item.  For example: PaymentTimeLimitDuration: 'PT48H3M6S' shows the amount of time after Order is created/changed that payment commitment must be made for a given Order Item. PaymentTimeLimitDuration: 'PT0H0M0S' indicates instant payment is required for a given Order Item.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPaymentTimeLimitDuration() {
        return paymentTimeLimitDuration;
    }

    /**
     * Sets the value of the paymentTimeLimitDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getPaymentTimeLimitDuration()
     */
    public void setPaymentTimeLimitDuration(Duration value) {
        this.paymentTimeLimitDuration = value;
    }

}
