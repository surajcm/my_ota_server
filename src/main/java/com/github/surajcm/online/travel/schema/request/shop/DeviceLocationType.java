
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Location of device
 * 
 * <p>Java class for DeviceLocationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceLocationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="City" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CityType" minOccurs="0"/>
 *         <element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryType" minOccurs="0"/>
 *         <element name="GeospatialLocation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}GeospatialLocationType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLocationType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "city",
    "country",
    "geospatialLocation"
})
public class DeviceLocationType {

    /**
     * City (e.g., Dublin), town, or postal station (i.e., a postal service territory, often used in a military address, or metropolitan area)
     * 
     */
    @XmlElement(name = "City", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CityType city;
    /**
     * A nation with its own government, occupying a particular territory.
     * 
     */
    @XmlElement(name = "Country", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CountryType country;
    /**
     * A location with a spatial attribute, probably on the surface of the earth. For example: Longitude and Latitude
     * 
     */
    @XmlElement(name = "GeospatialLocation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected GeospatialLocationType geospatialLocation;

    /**
     * City (e.g., Dublin), town, or postal station (i.e., a postal service territory, often used in a military address, or metropolitan area)
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     * @see #getCity()
     */
    public void setCity(CityType value) {
        this.city = value;
    }

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
     * A location with a spatial attribute, probably on the surface of the earth. For example: Longitude and Latitude
     * 
     * @return
     *     possible object is
     *     {@link GeospatialLocationType }
     *     
     */
    public GeospatialLocationType getGeospatialLocation() {
        return geospatialLocation;
    }

    /**
     * Sets the value of the geospatialLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeospatialLocationType }
     *     
     * @see #getGeospatialLocation()
     */
    public void setGeospatialLocation(GeospatialLocationType value) {
        this.geospatialLocation = value;
    }

}
