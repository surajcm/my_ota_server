
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * container for the encrypted Easy Pay data
 * 
 * <p>Java class for IATA_EasyPayEncryptedDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IATA_EasyPayEncryptedDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EncryptedAccountBinary" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BinaryObjectType" minOccurs="0"/>
 *         <element name="KeyNameText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_EasyPayEncryptedDataType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "encryptedAccountBinary",
    "keyNameText"
})
public class IATAEasyPayEncryptedDataType {

    /**
     * Tokenized EasyPay Account number
     * 
     */
    @XmlElement(name = "EncryptedAccountBinary", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BinaryObjectType encryptedAccountBinary;
    /**
     * encryption key
     * 
     */
    @XmlElement(name = "KeyNameText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String keyNameText;

    /**
     * Tokenized EasyPay Account number
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getEncryptedAccountBinary() {
        return encryptedAccountBinary;
    }

    /**
     * Sets the value of the encryptedAccountBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     * @see #getEncryptedAccountBinary()
     */
    public void setEncryptedAccountBinary(BinaryObjectType value) {
        this.encryptedAccountBinary = value;
    }

    /**
     * encryption key
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyNameText() {
        return keyNameText;
    }

    /**
     * Sets the value of the keyNameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKeyNameText()
     */
    public void setKeyNameText(String value) {
        this.keyNameText = value;
    }

}
