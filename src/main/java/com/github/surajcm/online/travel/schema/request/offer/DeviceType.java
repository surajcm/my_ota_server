
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Device upon which the secure transaction will occur.
 * 
 * <p>Java class for DeviceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DeviceCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="DeviceOwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OwnershipTypeCodeType" minOccurs="0"/>
 *         <element name="Phone" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PhoneType" minOccurs="0"/>
 *         <element name="PresenceTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PresenceTypeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "deviceCode",
    "deviceOwnerTypeCode",
    "phone",
    "presenceTypeCode"
})
public class DeviceType {

    /**
     * The device code from which the request was initiated.
     * 
     */
    @XmlElement(name = "DeviceCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceCode;
    /**
     * Specifies the type of Owner.
     * 
     */
    @XmlElement(name = "DeviceOwnerTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected OwnershipTypeCodeContentType deviceOwnerTypeCode;
    /**
     * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
     * 
     */
    @XmlElement(name = "Phone", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PhoneType phone;
    /**
     * Specifies the Presence of a customer and its payment card.
     * 
     */
    @XmlElement(name = "PresenceTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected PresenceTypeCodeContentType presenceTypeCode;

    /**
     * The device code from which the request was initiated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeviceCode()
     */
    public void setDeviceCode(String value) {
        this.deviceCode = value;
    }

    /**
     * Specifies the type of Owner.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public OwnershipTypeCodeContentType getDeviceOwnerTypeCode() {
        return deviceOwnerTypeCode;
    }

    /**
     * Sets the value of the deviceOwnerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     * @see #getDeviceOwnerTypeCode()
     */
    public void setDeviceOwnerTypeCode(OwnershipTypeCodeContentType value) {
        this.deviceOwnerTypeCode = value;
    }

    /**
     * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    public PhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     * @see #getPhone()
     */
    public void setPhone(PhoneType value) {
        this.phone = value;
    }

    /**
     * Specifies the Presence of a customer and its payment card.
     * 
     * @return
     *     possible object is
     *     {@link PresenceTypeCodeContentType }
     *     
     */
    public PresenceTypeCodeContentType getPresenceTypeCode() {
        return presenceTypeCode;
    }

    /**
     * Sets the value of the presenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceTypeCodeContentType }
     *     
     * @see #getPresenceTypeCode()
     */
    public void setPresenceTypeCode(PresenceTypeCodeContentType value) {
        this.presenceTypeCode = value;
    }

}
