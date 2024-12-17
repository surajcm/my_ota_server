
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The place at which a retail transaction is carried out.
 * 
 * <p>Java class for POS_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="POS_Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgentDutyText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="City" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CityType" minOccurs="0"/>
 *         <element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryType" minOccurs="0"/>
 *         <element name="RequestTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS_Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "agentDutyText",
    "city",
    "country",
    "requestTime"
})
public class POSType {

    /**
     * Internally defined agent authority to request changes.
     * 
     */
    @XmlElement(name = "AgentDutyText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String agentDutyText;
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
     * Point of sale timestamp value. Example: 2017-01-13T13:59:38Z  Note: This may be used if the point of sale time zone differs from the message creation timestamp.
     * 
     */
    @XmlElement(name = "RequestTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType requestTime;

    /**
     * Internally defined agent authority to request changes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyText() {
        return agentDutyText;
    }

    /**
     * Sets the value of the agentDutyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgentDutyText()
     */
    public void setAgentDutyText(String value) {
        this.agentDutyText = value;
    }

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
     * Point of sale timestamp value. Example: 2017-01-13T13:59:38Z  Note: This may be used if the point of sale time zone differs from the message creation timestamp.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getRequestTime()
     */
    public void setRequestTime(DateTimeType value) {
        this.requestTime = value;
    }

}
