
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Earliest and Latest Period than an option is available or may be used.
 * 
 * <p>Java class for AvailPeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AvailPeriodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EarliestAvailablePeriodDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         <element name="LatestAvailablePeriodDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailPeriodType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "earliestAvailablePeriodDateTime",
    "latestAvailablePeriodDateTime"
})
public class AvailPeriodType {

    /**
     * Offer/ Order term (condition) for the Earliest time an item is Available or May be Used.
     * 
     */
    @XmlElement(name = "EarliestAvailablePeriodDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType earliestAvailablePeriodDateTime;
    /**
     * Offer/ Order term (condition) for the Latest time an item is Available or May be Used.
     * 
     */
    @XmlElement(name = "LatestAvailablePeriodDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType latestAvailablePeriodDateTime;

    /**
     * Offer/ Order term (condition) for the Earliest time an item is Available or May be Used.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEarliestAvailablePeriodDateTime() {
        return earliestAvailablePeriodDateTime;
    }

    /**
     * Sets the value of the earliestAvailablePeriodDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getEarliestAvailablePeriodDateTime()
     */
    public void setEarliestAvailablePeriodDateTime(DateTimeType value) {
        this.earliestAvailablePeriodDateTime = value;
    }

    /**
     * Offer/ Order term (condition) for the Latest time an item is Available or May be Used.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLatestAvailablePeriodDateTime() {
        return latestAvailablePeriodDateTime;
    }

    /**
     * Sets the value of the latestAvailablePeriodDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getLatestAvailablePeriodDateTime()
     */
    public void setLatestAvailablePeriodDateTime(DateTimeType value) {
        this.latestAvailablePeriodDateTime = value;
    }

}
