
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
 * 
 * <p>Java class for PhoneType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PhoneType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AreaCodeNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="ContactTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="CountryDialingCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryDialingCodeType" minOccurs="0"/>
 *         <element name="ExtensionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="PhoneNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "areaCodeNumber",
    "contactTypeText",
    "countryDialingCode",
    "extensionNumber",
    "phoneNumber"
})
public class PhoneType {

    /**
     * Phone number area code. Example: 813 Note: The phone number can be put unstructured into the phone element or can be put structured into country dialing code, area code, phone number and extension.
     * 
     */
    @XmlElement(name = "AreaCodeNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String areaCodeNumber;
    /**
     * PADIS code list: Contact Type (to identify the technical contact type information)
     * 
     */
    @XmlElement(name = "ContactTypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String contactTypeText;
    /**
     * Numeric telephone dialingÂ prefixes for the memberÂ countries of the International Telecommunication Union (ITU).
     * 
     */
    @XmlElement(name = "CountryDialingCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryDialingCode;
    /**
     * Phone extension number. Example: 1234 Note: The phone number can be put unstructured into the phone element or can be put structured into countrydialing code, area code, phone number and extension.
     * 
     */
    @XmlElement(name = "ExtensionNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String extensionNumber;
    /**
     * Phone number text. Examples: +1 999-999-9999 ext 1234,  617-9976 Note: This may be a simple, un-structured phone number, such as +01 999-999-9999 ext 1234 or combined with the additional attributes to create a structured phone number.
     * 
     */
    @XmlElement(name = "PhoneNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String phoneNumber;

    /**
     * Phone number area code. Example: 813 Note: The phone number can be put unstructured into the phone element or can be put structured into country dialing code, area code, phone number and extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCodeNumber() {
        return areaCodeNumber;
    }

    /**
     * Sets the value of the areaCodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAreaCodeNumber()
     */
    public void setAreaCodeNumber(String value) {
        this.areaCodeNumber = value;
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
     * Phone extension number. Example: 1234 Note: The phone number can be put unstructured into the phone element or can be put structured into countrydialing code, area code, phone number and extension.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Sets the value of the extensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExtensionNumber()
     */
    public void setExtensionNumber(String value) {
        this.extensionNumber = value;
    }

    /**
     * Phone number text. Examples: +1 999-999-9999 ext 1234,  617-9976 Note: This may be a simple, un-structured phone number, such as +01 999-999-9999 ext 1234 or combined with the additional attributes to create a structured phone number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPhoneNumber()
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}
