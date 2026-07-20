
package com.github.surajcm.online.travel.schema.response.shop;

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
 * A device that enables its owner (the cardholder) to make a payment by electronic funds transfer.
 * 
 * <p>Java class for PaymentCard2Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentCard2Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CreditCardVendorCodeType"/>
 *         <element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CountryCodeType" minOccurs="0"/>
 *         <element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="CardTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CryptographyKeyType" minOccurs="0"/>
 *         <element name="SecurePayerAuthenticationVersion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SecurePayerAuthenticationVersionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="VerificationInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard2Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "cardBrandCode",
    "cardIssuingCountryCode",
    "cardProductTypeCode",
    "cardTypeText",
    "cryptographyKey",
    "securePayerAuthenticationVersion",
    "verificationInd"
})
public class PaymentCard2Type {

    /**
     * A two-letter code assigned according to IATA Resolution 728. Example: VI for Visa
     * 
     */
    @XmlElement(name = "CardBrandCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardBrandCode;
    /**
     * Payment Card issuing country code.
     * 
     */
    @XmlElement(name = "CardIssuingCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuingCountryCode;
    /**
     * Used to specify whether the card is a Consumer (personal) or Commercial (corporate) card.
     * 
     */
    @XmlElement(name = "CardProductTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardProductTypeCode;
    /**
     * Additional description for the magnetic stripe card type (debit card, credit card, prepaid card, etc.)
     * 
     */
    @XmlElement(name = "CardTypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String cardTypeText;
    @XmlElement(name = "CryptographyKey", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected CryptographyKeyType cryptographyKey;
    /**
     * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
     * 
     */
    @XmlElement(name = "SecurePayerAuthenticationVersion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<SecurePayerAuthenticationVersionType> securePayerAuthenticationVersion;
    /**
     * When 'true', this payment requires additional authentication.
     * 
     */
    @XmlElement(name = "VerificationInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean verificationInd;

    /**
     * A two-letter code assigned according to IATA Resolution 728. Example: VI for Visa
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrandCode() {
        return cardBrandCode;
    }

    /**
     * Sets the value of the cardBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCardBrandCode()
     */
    public void setCardBrandCode(String value) {
        this.cardBrandCode = value;
    }

    /**
     * Payment Card issuing country code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuingCountryCode() {
        return cardIssuingCountryCode;
    }

    /**
     * Sets the value of the cardIssuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCardIssuingCountryCode()
     */
    public void setCardIssuingCountryCode(String value) {
        this.cardIssuingCountryCode = value;
    }

    /**
     * Used to specify whether the card is a Consumer (personal) or Commercial (corporate) card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductTypeCode() {
        return cardProductTypeCode;
    }

    /**
     * Sets the value of the cardProductTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCardProductTypeCode()
     */
    public void setCardProductTypeCode(String value) {
        this.cardProductTypeCode = value;
    }

    /**
     * Additional description for the magnetic stripe card type (debit card, credit card, prepaid card, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeText() {
        return cardTypeText;
    }

    /**
     * Sets the value of the cardTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCardTypeText()
     */
    public void setCardTypeText(String value) {
        this.cardTypeText = value;
    }

    /**
     * Gets the value of the cryptographyKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographyKeyType }
     *     
     */
    public CryptographyKeyType getCryptographyKey() {
        return cryptographyKey;
    }

    /**
     * Sets the value of the cryptographyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographyKeyType }
     *     
     */
    public void setCryptographyKey(CryptographyKeyType value) {
        this.cryptographyKey = value;
    }

    /**
     * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
     * 
     * Gets the value of the securePayerAuthenticationVersion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securePayerAuthenticationVersion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSecurePayerAuthenticationVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurePayerAuthenticationVersionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the securePayerAuthenticationVersion property.
     */
    public List<SecurePayerAuthenticationVersionType> getSecurePayerAuthenticationVersion() {
        if (securePayerAuthenticationVersion == null) {
            securePayerAuthenticationVersion = new ArrayList<>();
        }
        return this.securePayerAuthenticationVersion;
    }

    /**
     * When 'true', this payment requires additional authentication.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationInd() {
        return verificationInd;
    }

    /**
     * Sets the value of the verificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isVerificationInd()
     */
    public void setVerificationInd(Boolean value) {
        this.verificationInd = value;
    }

}
