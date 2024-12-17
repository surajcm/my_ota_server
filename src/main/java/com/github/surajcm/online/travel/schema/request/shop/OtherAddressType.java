
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Other Contact Method information. E.g. web site URL, social media handle.
 * 
 * <p>Java class for OtherAddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OtherAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContactTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="OtherAddressText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAddressType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "contactTypeText",
    "otherAddressText"
})
public class OtherAddressType {

    /**
     * PADIS code list: Contact Type (to identify the technical contact type information)
     * 
     */
    @XmlElement(name = "ContactTypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String contactTypeText;
    /**
     * Other Contact Method Value. Example: www.marketingsite.com
     * 
     */
    @XmlElement(name = "OtherAddressText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected String otherAddressText;

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
     * Other Contact Method Value. Example: www.marketingsite.com
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddressText() {
        return otherAddressText;
    }

    /**
     * Sets the value of the otherAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOtherAddressText()
     */
    public void setOtherAddressText(String value) {
        this.otherAddressText = value;
    }

}
