
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
 * 
 * <p>Java class for CountrySubDivisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CountrySubDivisionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryType" minOccurs="0"/>
 *         <element name="CountrySubDivisionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountrySubDivisionCodeType" minOccurs="0"/>
 *         <element name="CountrySubDivisionName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySubDivisionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "country",
    "countrySubDivisionCode",
    "countrySubDivisionName"
})
public class CountrySubDivisionType {

    /**
     * A nation with its own government, occupying a particular territory.
     * 
     */
    @XmlElement(name = "Country", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CountryType country;
    /**
     * The ISO code identifying this country sub-division within a given country. E.g. 'AZ' for state of Arizona (US), 'BY' for region of Bavaria (Germany).
     * 
     */
    @XmlElement(name = "CountrySubDivisionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String countrySubDivisionCode;
    /**
     * The name, expressed as text, of the sub-division of a country.
     * 
     */
    @XmlElement(name = "CountrySubDivisionName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countrySubDivisionName;

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
     * The ISO code identifying this country sub-division within a given country. E.g. 'AZ' for state of Arizona (US), 'BY' for region of Bavaria (Germany).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    /**
     * Sets the value of the countrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountrySubDivisionCode()
     */
    public void setCountrySubDivisionCode(String value) {
        this.countrySubDivisionCode = value;
    }

    /**
     * The name, expressed as text, of the sub-division of a country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubDivisionName() {
        return countrySubDivisionName;
    }

    /**
     * Sets the value of the countrySubDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountrySubDivisionName()
     */
    public void setCountrySubDivisionName(String value) {
        this.countrySubDivisionName = value;
    }

}
