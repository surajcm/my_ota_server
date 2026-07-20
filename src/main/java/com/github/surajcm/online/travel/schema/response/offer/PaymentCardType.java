
package com.github.surajcm.online.travel.schema.response.offer;

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
 * <p>Java class for PaymentCardType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentCardType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CreditCardVendorCodeType" minOccurs="0"/>
 *         <element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CountryCodeType" minOccurs="0"/>
 *         <element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CryptographyKeyType" minOccurs="0"/>
 *         <element name="VerificationInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "cardBrandCode",
    "cardIssuingCountryCode",
    "cryptographyKey",
    "verificationInd"
})
public class PaymentCardType {

    /**
     * A two-letter code assigned according to IATA Resolution 728. Example: VI for Visa
     * 
     */
    @XmlElement(name = "CardBrandCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String cardBrandCode;
    /**
     * Payment Card issuing country code.
     * 
     */
    @XmlElement(name = "CardIssuingCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuingCountryCode;
    @XmlElement(name = "CryptographyKey", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected CryptographyKeyType cryptographyKey;
    /**
     * When 'true', this payment requires additional authentication.
     * 
     */
    @XmlElement(name = "VerificationInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
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
