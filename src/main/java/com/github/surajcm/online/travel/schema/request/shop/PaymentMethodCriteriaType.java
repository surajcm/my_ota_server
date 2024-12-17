
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Criteria for: A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
 * 
 * <p>Java class for PaymentMethodCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentMethodCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IATA_EasyPayCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_EasyPayType" minOccurs="0"/>
 *         <element name="PaymentCardCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaymentCardCriteriaType" minOccurs="0"/>
 *         <element name="PaymentInstrumentOwnershipCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OwnershipTypeCodeType" minOccurs="0"/>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaymentMethodCodeType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "iataEasyPayCriteria",
    "paymentCardCriteria",
    "paymentInstrumentOwnershipCode",
    "prefLevel",
    "typeCode"
})
public class PaymentMethodCriteriaType {

    /**
     * IATA EasyPay is a payment instrument with a specific remittance mechanism. This FOP is not limited to BSP.
     * 
     */
    @XmlElement(name = "IATA_EasyPayCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected IATAEasyPayType iataEasyPayCriteria;
    /**
     * Payment card specific filter criteria for shopping requests, including card issuer type and identification number.
     * 
     */
    @XmlElement(name = "PaymentCardCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PaymentCardCriteriaType paymentCardCriteria;
    /**
     * indicated the owner of a payment instrument (e.g. SL-Seller, CS-Customer)
     * 
     */
    @XmlElement(name = "PaymentInstrumentOwnershipCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected OwnershipTypeCodeContentType paymentInstrumentOwnershipCode;
    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PrefLevelType prefLevel;
    /**
     * The payment method type. Examples: Credit Card, Cash.
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * IATA EasyPay is a payment instrument with a specific remittance mechanism. This FOP is not limited to BSP.
     * 
     * @return
     *     possible object is
     *     {@link IATAEasyPayType }
     *     
     */
    public IATAEasyPayType getIATAEasyPayCriteria() {
        return iataEasyPayCriteria;
    }

    /**
     * Sets the value of the iataEasyPayCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAEasyPayType }
     *     
     * @see #getIATAEasyPayCriteria()
     */
    public void setIATAEasyPayCriteria(IATAEasyPayType value) {
        this.iataEasyPayCriteria = value;
    }

    /**
     * Payment card specific filter criteria for shopping requests, including card issuer type and identification number.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardCriteriaType }
     *     
     */
    public PaymentCardCriteriaType getPaymentCardCriteria() {
        return paymentCardCriteria;
    }

    /**
     * Sets the value of the paymentCardCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardCriteriaType }
     *     
     * @see #getPaymentCardCriteria()
     */
    public void setPaymentCardCriteria(PaymentCardCriteriaType value) {
        this.paymentCardCriteria = value;
    }

    /**
     * indicated the owner of a payment instrument (e.g. SL-Seller, CS-Customer)
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     */
    public OwnershipTypeCodeContentType getPaymentInstrumentOwnershipCode() {
        return paymentInstrumentOwnershipCode;
    }

    /**
     * Sets the value of the paymentInstrumentOwnershipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypeCodeContentType }
     *     
     * @see #getPaymentInstrumentOwnershipCode()
     */
    public void setPaymentInstrumentOwnershipCode(OwnershipTypeCodeContentType value) {
        this.paymentInstrumentOwnershipCode = value;
    }

    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     * @see #getPrefLevel()
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
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
