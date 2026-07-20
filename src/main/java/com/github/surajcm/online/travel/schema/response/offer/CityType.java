
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * City (e.g., Dublin), town, or postal station (i.e., a postal service territory, often used in a military address, or metropolitan area)
 * 
 * <p>Java class for CityType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CityName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}NameType" minOccurs="0"/>
 *         <element name="CountrySubDivision" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CountrySubDivisionType" minOccurs="0"/>
 *         <element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IATA_LocationCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "cityName",
    "countrySubDivision",
    "iataLocationCode"
})
public class CityType {

    /**
     * The name, expressed as text, of the city, town or village.
     * 
     */
    @XmlElement(name = "CityName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    /**
     * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
     * 
     */
    @XmlElement(name = "CountrySubDivision", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected CountrySubDivisionType countrySubDivision;
    /**
     * IATA defined code identifying a city or station.
     * 
     */
    @XmlElement(name = "IATA_LocationCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iataLocationCode;

    /**
     * The name, expressed as text, of the city, town or village.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCityName()
     */
    public void setCityName(String value) {
        this.cityName = value;
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
     * IATA defined code identifying a city or station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATALocationCode() {
        return iataLocationCode;
    }

    /**
     * Sets the value of the iataLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATALocationCode()
     */
    public void setIATALocationCode(String value) {
        this.iataLocationCode = value;
    }

}
