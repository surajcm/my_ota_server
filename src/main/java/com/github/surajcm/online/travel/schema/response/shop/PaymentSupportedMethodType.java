
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentSupportedMethodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentSupportedMethodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferAssociation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OfferAssociationType" minOccurs="0"/>
 *         <element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OtherPaymentMethodType" minOccurs="0"/>
 *         <element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentCard2Type" minOccurs="0"/>
 *         <element name="PaymentRedirection" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentRedirectionType" minOccurs="0"/>
 *         <element name="SurchargeInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SurchargeInfoType" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentMethodCodeType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSupportedMethodType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "offerAssociation",
    "otherPaymentMethod",
    "paymentCard",
    "paymentRedirection",
    "surchargeInfo",
    "typeCode"
})
public class PaymentSupportedMethodType {

    /**
     * Associations to Offers and Offer Items.
     * 
     */
    @XmlElement(name = "OfferAssociation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected OfferAssociationType offerAssociation;
    /**
     * Information relating to non-standard forms of payment which may be used in exchange for goods or services.
     * 
     */
    @XmlElement(name = "OtherPaymentMethod", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected OtherPaymentMethodType otherPaymentMethod;
    /**
     * A device that enables its owner (the cardholder) to make a payment by electronic funds transfer.
     * 
     */
    @XmlElement(name = "PaymentCard", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PaymentCard2Type paymentCard;
    /**
     * contains all the instructions for the Seller on how to redirect the Payer to their hosted payment page.
     * 
     */
    @XmlElement(name = "PaymentRedirection", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PaymentRedirectionType paymentRedirection;
    /**
     * Information about surcharges for payment methods.
     * 
     */
    @XmlElement(name = "SurchargeInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected SurchargeInfoType surchargeInfo;
    /**
     * The payment method type. Examples: Credit Card, Cash.
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Associations to Offers and Offer Items.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociationType }
     *     
     */
    public OfferAssociationType getOfferAssociation() {
        return offerAssociation;
    }

    /**
     * Sets the value of the offerAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociationType }
     *     
     * @see #getOfferAssociation()
     */
    public void setOfferAssociation(OfferAssociationType value) {
        this.offerAssociation = value;
    }

    /**
     * Information relating to non-standard forms of payment which may be used in exchange for goods or services.
     * 
     * @return
     *     possible object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public OtherPaymentMethodType getOtherPaymentMethod() {
        return otherPaymentMethod;
    }

    /**
     * Sets the value of the otherPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPaymentMethodType }
     *     
     * @see #getOtherPaymentMethod()
     */
    public void setOtherPaymentMethod(OtherPaymentMethodType value) {
        this.otherPaymentMethod = value;
    }

    /**
     * A device that enables its owner (the cardholder) to make a payment by electronic funds transfer.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard2Type }
     *     
     */
    public PaymentCard2Type getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard2Type }
     *     
     * @see #getPaymentCard()
     */
    public void setPaymentCard(PaymentCard2Type value) {
        this.paymentCard = value;
    }

    /**
     * contains all the instructions for the Seller on how to redirect the Payer to their hosted payment page.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRedirectionType }
     *     
     */
    public PaymentRedirectionType getPaymentRedirection() {
        return paymentRedirection;
    }

    /**
     * Sets the value of the paymentRedirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRedirectionType }
     *     
     * @see #getPaymentRedirection()
     */
    public void setPaymentRedirection(PaymentRedirectionType value) {
        this.paymentRedirection = value;
    }

    /**
     * Information about surcharges for payment methods.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeInfoType }
     *     
     */
    public SurchargeInfoType getSurchargeInfo() {
        return surchargeInfo;
    }

    /**
     * Sets the value of the surchargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeInfoType }
     *     
     * @see #getSurchargeInfo()
     */
    public void setSurchargeInfo(SurchargeInfoType value) {
        this.surchargeInfo = value;
    }

    /**
     * The payment method type. Examples: Credit Card, Cash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTypeCode()
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
