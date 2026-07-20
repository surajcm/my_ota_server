
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * contains all the instructions for the Seller on how to redirect the Payer to their hosted payment page.
 * 
 * <p>Java class for PaymentRedirectionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentRedirectionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         <element name="PaymentRedirectionInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="PaymentRedirectionURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRedirectionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "expirationDateTime",
    "paymentRedirectionInd",
    "paymentRedirectionURI"
})
public class PaymentRedirectionType {

    /**
     * The Airline can also specify how long the pre-constructed hosted payment page will be valid until (ExpirationDateTime).
     * 
     */
    @XmlElement(name = "ExpirationDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType expirationDateTime;
    /**
     * Used in case the Airline plans to capture payment details via a separate hosted payment page.
     * 
     */
    @XmlElement(name = "PaymentRedirectionInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean paymentRedirectionInd;
    @XmlElement(name = "PaymentRedirectionURI", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "anyURI")
    protected String paymentRedirectionURI;

    /**
     * The Airline can also specify how long the pre-constructed hosted payment page will be valid until (ExpirationDateTime).
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getExpirationDateTime()
     */
    public void setExpirationDateTime(DateTimeType value) {
        this.expirationDateTime = value;
    }

    /**
     * Used in case the Airline plans to capture payment details via a separate hosted payment page.
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
     * Gets the value of the paymentRedirectionURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRedirectionURI() {
        return paymentRedirectionURI;
    }

    /**
     * Sets the value of the paymentRedirectionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRedirectionURI(String value) {
        this.paymentRedirectionURI = value;
    }

}
