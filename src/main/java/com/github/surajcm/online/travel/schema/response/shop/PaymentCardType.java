
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
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
 * <p>Java class for PaymentCardType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentCardType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardBrandCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CreditCardVendorCodeType"/>
 *         <element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CountryCodeType" minOccurs="0"/>
 *         <element name="CardNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentCardNumberType" minOccurs="0"/>
 *         <element name="CardProductTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="CardSecurityCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="CardSeqNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *         <element name="CardTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="CryptographyKey" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CryptographyKeyType" minOccurs="0"/>
 *         <element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PayCardDateTextType" minOccurs="0"/>
 *         <element name="PaymentRedirectionInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="ProtectedCardID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="ReconciliationID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="SecurePayerAuthenticationVersion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SecurePayerAuthenticationVersionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SecurePaymentAuthenticationInstructionsVersion2" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SecurePaymentAuthenticationInstructionsVersion2Type" minOccurs="0"/>
 *         <element name="SecurePaymentVersion2" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SecurePaymentVersion2Type" minOccurs="0"/>
 *         <element name="SellerOwnCardInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
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
@XmlType(name = "PaymentCardType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "cardBrandCode",
    "cardIssuingCountryCode",
    "cardNumber",
    "cardProductTypeCode",
    "cardSecurityCode",
    "cardSeqNumber",
    "cardTypeText",
    "cryptographyKey",
    "expirationDate",
    "paymentRedirectionInd",
    "protectedCardID",
    "reconciliationID",
    "securePayerAuthenticationVersion",
    "securePaymentAuthenticationInstructionsVersion2",
    "securePaymentVersion2",
    "sellerOwnCardInd",
    "verificationInd"
})
public class PaymentCardType {

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
     * The card number indicated on the payment card.
     * 
     */
    @XmlElement(name = "CardNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String cardNumber;
    /**
     * Used to specify whether the card is a Consumer (personal) or Commercial (corporate) card.
     * 
     */
    @XmlElement(name = "CardProductTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardProductTypeCode;
    /**
     * The verification digits printed on the card following the embossed number. Example: 123
     * 
     */
    @XmlElement(name = "CardSecurityCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardSecurityCode;
    /**
     * Number displayed on a payment card following the card number which indicates if the card is an original or if it was re-issued with the same card number.
     * 
     */
    @XmlElement(name = "CardSeqNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal cardSeqNumber;
    /**
     * Additional description for the magnetic stripe card type (debit card, credit card, prepaid card, etc.)
     * 
     */
    @XmlElement(name = "CardTypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String cardTypeText;
    @XmlElement(name = "CryptographyKey", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected CryptographyKeyType cryptographyKey;
    /**
     * The last month of validity Example: 0119
     * 
     */
    @XmlElement(name = "ExpirationDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String expirationDate;
    /**
     * Used in case the Airline plans to capture payment details via a separate hosted payment page. E.g. payment card details captured by Airline's own payment gateway or Payment Service Provider. At time of payment commitment, the Airline will provide Seller with a redirection URL to the hosted site.  NB. If used, Seller must not provide payment details at time of payment (as these will be captured separately on the payment page provided).
     * 
     */
    @XmlElement(name = "PaymentRedirectionInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean paymentRedirectionInd;
    /**
     * Payment card number protected in a non format preserving fashion.
     * 
     */
    @XmlElement(name = "ProtectedCardID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String protectedCardID;
    /**
     * Identifies the individual for this specific transaction when the card is shared (for example, corporate card). This ID is typically used for payment reconciliation.
     * 
     */
    @XmlElement(name = "ReconciliationID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reconciliationID;
    /**
     * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
     * 
     */
    @XmlElement(name = "SecurePayerAuthenticationVersion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<SecurePayerAuthenticationVersionType> securePayerAuthenticationVersion;
    /**
     * Data returned from the Directory Server/ACS containing the PAReq and the ACS URL that enable the cardholder to authenticate. Applicable for 3D-Secure.
     * 
     */
    @XmlElement(name = "SecurePaymentAuthenticationInstructionsVersion2", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected SecurePaymentAuthenticationInstructionsVersion2Type securePaymentAuthenticationInstructionsVersion2;
    /**
     * contains all information for the result of 3D-Secure authentication process.
     * 
     */
    @XmlElement(name = "SecurePaymentVersion2", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected SecurePaymentVersion2Type securePaymentVersion2;
    /**
     * When TRUE, indicates the seller is using their own card. If FALSE, customer card is being used.
     * 
     */
    @XmlElement(name = "SellerOwnCardInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean sellerOwnCardInd;
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
     * The card number indicated on the payment card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCardNumber()
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
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
     * The verification digits printed on the card following the embossed number. Example: 123
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSecurityCode() {
        return cardSecurityCode;
    }

    /**
     * Sets the value of the cardSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCardSecurityCode()
     */
    public void setCardSecurityCode(String value) {
        this.cardSecurityCode = value;
    }

    /**
     * Number displayed on a payment card following the card number which indicates if the card is an original or if it was re-issued with the same card number.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCardSeqNumber() {
        return cardSeqNumber;
    }

    /**
     * Sets the value of the cardSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCardSeqNumber()
     */
    public void setCardSeqNumber(BigDecimal value) {
        this.cardSeqNumber = value;
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
     * The last month of validity Example: 0119
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExpirationDate()
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Used in case the Airline plans to capture payment details via a separate hosted payment page. E.g. payment card details captured by Airline's own payment gateway or Payment Service Provider. At time of payment commitment, the Airline will provide Seller with a redirection URL to the hosted site.  NB. If used, Seller must not provide payment details at time of payment (as these will be captured separately on the payment page provided).
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentRedirectionInd() {
        return paymentRedirectionInd;
    }

    /**
     * Sets the value of the paymentRedirectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPaymentRedirectionInd()
     */
    public void setPaymentRedirectionInd(Boolean value) {
        this.paymentRedirectionInd = value;
    }

    /**
     * Payment card number protected in a non format preserving fashion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedCardID() {
        return protectedCardID;
    }

    /**
     * Sets the value of the protectedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProtectedCardID()
     */
    public void setProtectedCardID(String value) {
        this.protectedCardID = value;
    }

    /**
     * Identifies the individual for this specific transaction when the card is shared (for example, corporate card). This ID is typically used for payment reconciliation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReconciliationID()
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
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
     * Data returned from the Directory Server/ACS containing the PAReq and the ACS URL that enable the cardholder to authenticate. Applicable for 3D-Secure.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion2Type }
     *     
     */
    public SecurePaymentAuthenticationInstructionsVersion2Type getSecurePaymentAuthenticationInstructionsVersion2() {
        return securePaymentAuthenticationInstructionsVersion2;
    }

    /**
     * Sets the value of the securePaymentAuthenticationInstructionsVersion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAuthenticationInstructionsVersion2Type }
     *     
     * @see #getSecurePaymentAuthenticationInstructionsVersion2()
     */
    public void setSecurePaymentAuthenticationInstructionsVersion2(SecurePaymentAuthenticationInstructionsVersion2Type value) {
        this.securePaymentAuthenticationInstructionsVersion2 = value;
    }

    /**
     * contains all information for the result of 3D-Secure authentication process.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentVersion2Type }
     *     
     */
    public SecurePaymentVersion2Type getSecurePaymentVersion2() {
        return securePaymentVersion2;
    }

    /**
     * Sets the value of the securePaymentVersion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentVersion2Type }
     *     
     * @see #getSecurePaymentVersion2()
     */
    public void setSecurePaymentVersion2(SecurePaymentVersion2Type value) {
        this.securePaymentVersion2 = value;
    }

    /**
     * When TRUE, indicates the seller is using their own card. If FALSE, customer card is being used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellerOwnCardInd() {
        return sellerOwnCardInd;
    }

    /**
     * Sets the value of the sellerOwnCardInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSellerOwnCardInd()
     */
    public void setSellerOwnCardInd(Boolean value) {
        this.sellerOwnCardInd = value;
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
