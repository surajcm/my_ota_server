
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Retail Partner
 * 
 * <p>Java class for RetailPartnerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RetailPartnerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ContactInfoType"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="RetailPartnerID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailPartnerType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "contactInfo",
    "name",
    "retailPartnerID"
})
public class RetailPartnerType {

    /**
     * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
     * 
     */
    @XmlElement(name = "ContactInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected ContactInfoType contactInfo;
    /**
     * Retail partner name.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    /**
     * Unique Retailer ID
     * 
     */
    @XmlElement(name = "RetailPartnerID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String retailPartnerID;

    /**
     * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     * @see #getContactInfo()
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Retail partner name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Unique Retailer ID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailPartnerID() {
        return retailPartnerID;
    }

    /**
     * Sets the value of the retailPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRetailPartnerID()
     */
    public void setRetailPartnerID(String value) {
        this.retailPartnerID = value;
    }

}
