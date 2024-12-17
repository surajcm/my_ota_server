
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Payment card specific filter criteria for shopping requests, including card issuer type and identification number.
 * 
 * <p>Java class for PaymentCardCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentCardCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CreditCardVendorCodeType"/>
 *         <element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="IssuerIdentificationNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IIN_NumberType" minOccurs="0"/>
 *         <element name="SecurePayerAuthenticationVersion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SecurePayerAuthenticationVersionType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "cardBrandCode",
    "cardIssuingCountryCode",
    "cardProductTypeCode",
    "issuerIdentificationNumber",
    "securePayerAuthenticationVersion"
})
public class PaymentCardCriteriaType {

    /**
     * A two-letter code assigned according to IATA Resolution 728. Example: VI for Visa
     * 
     */
    @XmlElement(name = "CardBrandCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected String cardBrandCode;
    /**
     * Payment Card issuing country code.
     * 
     */
    @XmlElement(name = "CardIssuingCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuingCountryCode;
    /**
     * Used to specify whether the card is a Consumer (personal) or Commercial (corporate) card.
     * 
     */
    @XmlElement(name = "CardProductTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardProductTypeCode;
    /**
     * Payment card IIN/BIN number. Example: 401123
     * 
     */
    @XmlElement(name = "IssuerIdentificationNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String issuerIdentificationNumber;
    /**
     * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
     * 
     */
    @XmlElement(name = "SecurePayerAuthenticationVersion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected SecurePayerAuthenticationVersionType securePayerAuthenticationVersion;

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
     * Payment card IIN/BIN number. Example: 401123
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    /**
     * Sets the value of the issuerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssuerIdentificationNumber()
     */
    public void setIssuerIdentificationNumber(String value) {
        this.issuerIdentificationNumber = value;
    }

    /**
     * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
     * 
     * @return
     *     possible object is
     *     {@link SecurePayerAuthenticationVersionType }
     *     
     */
    public SecurePayerAuthenticationVersionType getSecurePayerAuthenticationVersion() {
        return securePayerAuthenticationVersion;
    }

    /**
     * Sets the value of the securePayerAuthenticationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePayerAuthenticationVersionType }
     *     
     * @see #getSecurePayerAuthenticationVersion()
     */
    public void setSecurePayerAuthenticationVersion(SecurePayerAuthenticationVersionType value) {
        this.securePayerAuthenticationVersion = value;
    }

}
