
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferItemTimeLimitsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OfferItemTimeLimitsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemTimeLimitsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "priceGuaranteeTimeLimitDateTime"
})
public class OfferItemTimeLimitsType {

    /**
     * The date beyond which a price is no longer guaranteed. Examples: 2015-01-13T13:59:38Z
     * 
     */
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType priceGuaranteeTimeLimitDateTime;

    /**
     * The date beyond which a price is no longer guaranteed. Examples: 2015-01-13T13:59:38Z
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getPriceGuaranteeTimeLimitDateTime()
     */
    public void setPriceGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

}
