
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Requests the airline to additionally include a preview of the Offer price for the same Shopping Criteria for the specified date range.
 * 
 * <p>Java class for CalendarDateCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CalendarDateCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DaysAfterNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="DaysBeforeNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarDateCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "daysAfterNumber",
    "daysBeforeNumber"
})
public class CalendarDateCriteriaType {

    /**
     * Number of days after the Departure and Arrival dates for which the Calendar Date request should consider.
     * 
     */
    @XmlElement(name = "DaysAfterNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal daysAfterNumber;
    /**
     * Number of days prior to the Departure and Arrival dates for which the Calendar Date request should consider.
     * 
     */
    @XmlElement(name = "DaysBeforeNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal daysBeforeNumber;

    /**
     * Number of days after the Departure and Arrival dates for which the Calendar Date request should consider.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAfterNumber() {
        return daysAfterNumber;
    }

    /**
     * Sets the value of the daysAfterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDaysAfterNumber()
     */
    public void setDaysAfterNumber(BigDecimal value) {
        this.daysAfterNumber = value;
    }

    /**
     * Number of days prior to the Departure and Arrival dates for which the Calendar Date request should consider.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysBeforeNumber() {
        return daysBeforeNumber;
    }

    /**
     * Sets the value of the daysBeforeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDaysBeforeNumber()
     */
    public void setDaysBeforeNumber(BigDecimal value) {
        this.daysBeforeNumber = value;
    }

}
