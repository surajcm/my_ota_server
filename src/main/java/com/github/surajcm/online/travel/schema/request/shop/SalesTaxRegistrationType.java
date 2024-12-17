
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
 * The Identification and contact information of a party purchasing goods or services as registered with a Purchase Tax.
 * 
 * <p>Java class for SalesTaxRegistrationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SalesTaxRegistrationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CityName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="CountryDialingCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryDialingCodeType" minOccurs="0"/>
 *         <element name="CountrySubDivisionName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="EmailAddressText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="PhoneNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" maxOccurs="2" minOccurs="0"/>
 *         <element name="PostalCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="SalesTaxRegistrationID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
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
@XmlType(name = "SalesTaxRegistrationType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "cityName",
    "countryCode",
    "countryDialingCode",
    "countrySubDivisionName",
    "emailAddressText",
    "phoneNumber",
    "postalCode",
    "salesTaxRegistrationID",
    "streetText"
})
public class SalesTaxRegistrationType {

    /**
     * The name, expressed as text, of the city, town or village.
     * 
     */
    @XmlElement(name = "CityName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    /**
     * Numeric telephone dialingÂ prefixes for the memberÂ countries of the International Telecommunication Union (ITU).
     * 
     */
    @XmlElement(name = "CountryDialingCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryDialingCode;
    /**
     * The name, expressed as text, of the sub-division of a country.
     * 
     */
    @XmlElement(name = "CountrySubDivisionName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countrySubDivisionName;
    /**
     * The email address which should be used for contact purposes.
     * 
     */
    @XmlElement(name = "EmailAddressText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String emailAddressText;
    /**
     * Phone number text. Examples: +1 999-999-9999 ext 1234,  617-9976 Note: This may be a simple, un-structured phone number, such as +01 999-999-9999 ext 1234 or combined with the additional attributes to create a structured phone number.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<String> phoneNumber;
    /**
     * Postal code. Examples: 11001, 11001-2345
     * 
     */
    @XmlElement(name = "PostalCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    /**
     * Registered identifier of the business purchasing the goods and services. For example, a GST number in India XX.
     * 
     */
    @XmlElement(name = "SalesTaxRegistrationID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesTaxRegistrationID;
    /**
     * Street name and number. Examples: Main Street, 100 Main Street
     * 
     */
    @XmlElement(name = "StreetText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<String> streetText;

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
     * Numeric telephone dialingÂ prefixes for the memberÂ countries of the International Telecommunication Union (ITU).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Sets the value of the countryDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountryDialingCode()
     */
    public void setCountryDialingCode(String value) {
        this.countryDialingCode = value;
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
     * The email address which should be used for contact purposes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddressText() {
        return emailAddressText;
    }

    /**
     * Sets the value of the emailAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEmailAddressText()
     */
    public void setEmailAddressText(String value) {
        this.emailAddressText = value;
    }

    /**
     * Phone number text. Examples: +1 999-999-9999 ext 1234,  617-9976 Note: This may be a simple, un-structured phone number, such as +01 999-999-9999 ext 1234 or combined with the additional attributes to create a structured phone number.
     * 
     * Gets the value of the phoneNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPhoneNumber().add(newItem);
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
     *     The value of the phoneNumber property.
     */
    public List<String> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<>();
        }
        return this.phoneNumber;
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
     * Registered identifier of the business purchasing the goods and services. For example, a GST number in India XX.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTaxRegistrationID() {
        return salesTaxRegistrationID;
    }

    /**
     * Sets the value of the salesTaxRegistrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSalesTaxRegistrationID()
     */
    public void setSalesTaxRegistrationID(String value) {
        this.salesTaxRegistrationID = value;
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
