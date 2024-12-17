
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Form of identification. Typically used to identify that the passenger is who he says he is.  This is the type of FOID as defined in AIRIMP (FF Number, Credit Card Number, etc.).
 * 
 * <p>Java class for FOID_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FOID_Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CreditCardIssuerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CreditCardVendorCodeType" minOccurs="0"/>
 *         <element name="FOID_ID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="FOID_TypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOID_Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "creditCardIssuerCode",
    "foidid",
    "foidTypeText"
})
public class FOIDType {

    /**
     * The CC Issuer code in case FOID is a Credit Card.
     * 
     */
    @XmlElement(name = "CreditCardIssuerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String creditCardIssuerCode;
    /**
     * FOID ID value. Example: NY122345
     * 
     */
    @XmlElement(name = "FOID_ID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String foidid;
    /**
     * Form of identification type code used for booking/ticketing. Examples: PP (passport), CC (credit card), FF (frequent flyer), DL (drivers license)
     * 
     */
    @XmlElement(name = "FOID_TypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected String foidTypeText;

    /**
     * The CC Issuer code in case FOID is a Credit Card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardIssuerCode() {
        return creditCardIssuerCode;
    }

    /**
     * Sets the value of the creditCardIssuerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCreditCardIssuerCode()
     */
    public void setCreditCardIssuerCode(String value) {
        this.creditCardIssuerCode = value;
    }

    /**
     * FOID ID value. Example: NY122345
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDID() {
        return foidid;
    }

    /**
     * Sets the value of the foidid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFOIDID()
     */
    public void setFOIDID(String value) {
        this.foidid = value;
    }

    /**
     * Form of identification type code used for booking/ticketing. Examples: PP (passport), CC (credit card), FF (frequent flyer), DL (drivers license)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDTypeText() {
        return foidTypeText;
    }

    /**
     * Sets the value of the foidTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFOIDTypeText()
     */
    public void setFOIDTypeText(String value) {
        this.foidTypeText = value;
    }

}
