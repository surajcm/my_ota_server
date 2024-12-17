
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Natural or physical address used for postal service. May be a building address, airport address, etc.
 * 
 * <p>Java class for PostalAddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PostalAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BuildingRoomText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="CityName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="ContactTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="CountryName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="CountrySubDivisionName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="PO_BoxCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="PostalCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="StreetText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "buildingRoomText",
    "cityName",
    "contactTypeText",
    "countryCode",
    "countryName",
    "countrySubDivisionName",
    "poBoxCode",
    "postalCode",
    "streetText"
})
public class PostalAddressType {

    /**
     * Additional address information including building name, room, apartment, or suite number.
     * 
     */
    @XmlElement(name = "BuildingRoomText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String buildingRoomText;
    /**
     * The name, expressed as text, of the city, town or village.
     * 
     */
    @XmlElement(name = "CityName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    /**
     * PADIS code list: Contact Type (to identify the technical contact type information)
     * 
     */
    @XmlElement(name = "ContactTypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String contactTypeText;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    /**
     * The name, expressed as text, of the country.
     * 
     */
    @XmlElement(name = "CountryName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryName;
    /**
     * The name, expressed as text, of the sub-division of a country.
     * 
     */
    @XmlElement(name = "CountrySubDivisionName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countrySubDivisionName;
    /**
     * Post office box. Example: P.O. Box 21
     * 
     */
    @XmlElement(name = "PO_BoxCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxCode;
    /**
     * Postal code. Examples: 11001, 11001-2345
     * 
     */
    @XmlElement(name = "PostalCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    /**
     * Street name and number. Examples: Main Street, 100 Main Street
     * 
     */
    @XmlElement(name = "StreetText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<String> streetText;

    /**
     * Additional address information including building name, room, apartment, or suite number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingRoomText() {
        return buildingRoomText;
    }

    /**
     * Sets the value of the buildingRoomText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBuildingRoomText()
     */
    public void setBuildingRoomText(String value) {
        this.buildingRoomText = value;
    }

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
     * PADIS code list: Contact Type (to identify the technical contact type information)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeText() {
        return contactTypeText;
    }

    /**
     * Sets the value of the contactTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContactTypeText()
     */
    public void setContactTypeText(String value) {
        this.contactTypeText = value;
    }

    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountryCode()
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * The name, expressed as text, of the country.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountryName()
     */
    public void setCountryName(String value) {
        this.countryName = value;
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

    /**
     * Post office box. Example: P.O. Box 21
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxCode() {
        return poBoxCode;
    }

    /**
     * Sets the value of the poBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPOBoxCode()
     */
    public void setPOBoxCode(String value) {
        this.poBoxCode = value;
    }

    /**
     * Postal code. Examples: 11001, 11001-2345
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPostalCode()
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Street name and number. Examples: Main Street, 100 Main Street
     * 
     * Gets the value of the streetText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStreetText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the streetText property.
     */
    public List<String> getStreetText() {
        if (streetText == null) {
            streetText = new ArrayList<>();
        }
        return this.streetText;
    }

}
