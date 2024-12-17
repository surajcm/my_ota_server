
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrePaidCertificateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PrePaidCertificateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="EffectiveDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *         <element name="ExpiryDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *         <element name="Number" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrePaidCertificateType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "appText",
    "effectiveDateTime",
    "expiryDateTime",
    "number"
})
public class PrePaidCertificateType {

    @XmlElement(name = "AppText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String appText;
    @XmlElement(name = "EffectiveDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType effectiveDateTime;
    @XmlElement(name = "ExpiryDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType expiryDateTime;
    @XmlElement(name = "Number", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal number;

    /**
     * Gets the value of the appText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppText() {
        return appText;
    }

    /**
     * Sets the value of the appText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppText(String value) {
        this.appText = value;
    }

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setEffectiveDateTime(DateTimeType value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the expiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Sets the value of the expiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setExpiryDateTime(DateTimeType value) {
        this.expiryDateTime = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber(BigDecimal value) {
        this.number = value;
    }

}
