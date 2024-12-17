
package com.github.surajcm.online.travel.schema.request.shop;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import com.github.surajcm.online.travel.dataaccess.serialization.ZonedDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Departure information for affinity shopping requests.
 * 
 * <p>Java class for AffinityDepRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AffinityDepRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryType" minOccurs="0"/>
 *         <element name="CountrySubDivision" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountrySubDivisionType" minOccurs="0"/>
 *         <element name="Date" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="ProximityDistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         <element name="Station" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}StationType" minOccurs="0"/>
 *         <element name="Time" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityDepRequestType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "country",
    "countrySubDivision",
    "date",
    "proximityDistanceMeasure",
    "station",
    "time"
})
public class AffinityDepRequestType {

    /**
     * A nation with its own government, occupying a particular territory.
     * 
     */
    @XmlElement(name = "Country", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CountryType country;
    /**
     * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
     * 
     */
    @XmlElement(name = "CountrySubDivision", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CountrySubDivisionType countrySubDivision;
    /**
     * The customer's requested departure date.
     * 
     */
    @XmlElement(name = "Date", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    /**
     * Departure information for affinity shopping requests.
     * 
     */
    @XmlElement(name = "ProximityDistanceMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MeasureType proximityDistanceMeasure;
    /**
     * Location or facility where air or surface transportation originates, stops and/or terminates, and where passengers and/or cargo can be taken on or off.
     * 
     */
    @XmlElement(name = "Station", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected StationType station;
    /**
     * The customer's requested departure time.
     * 
     */
    @XmlElement(name = "Time", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime time;

    /**
     * A nation with its own government, occupying a particular territory.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     * @see #getCountry()
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public CountrySubDivisionType getCountrySubDivision() {
        return countrySubDivision;
    }

    /**
     * Sets the value of the countrySubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionType }
     *     
     * @see #getCountrySubDivision()
     */
    public void setCountrySubDivision(CountrySubDivisionType value) {
        this.countrySubDivision = value;
    }

    /**
     * The customer's requested departure date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDate()
     */
    public void setDate(LocalDate value) {
        this.date = value;
    }

    /**
     * Departure information for affinity shopping requests.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getProximityDistanceMeasure() {
        return proximityDistanceMeasure;
    }

    /**
     * Sets the value of the proximityDistanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getProximityDistanceMeasure()
     */
    public void setProximityDistanceMeasure(MeasureType value) {
        this.proximityDistanceMeasure = value;
    }

    /**
     * Location or facility where air or surface transportation originates, stops and/or terminates, and where passengers and/or cargo can be taken on or off.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     * @see #getStation()
     */
    public void setStation(StationType value) {
        this.station = value;
    }

    /**
     * The customer's requested departure time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTime()
     */
    public void setTime(ZonedDateTime value) {
        this.time = value;
    }

}
