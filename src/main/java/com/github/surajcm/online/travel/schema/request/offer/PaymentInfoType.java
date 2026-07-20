
package com.github.surajcm.online.travel.schema.request.offer;

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
 * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
 * 
 * <p>Java class for PaymentInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType"/>
 *         <element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DescType" minOccurs="0"/>
 *         <element name="OrderAssociation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OrderAssociationType" minOccurs="0"/>
 *         <element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Payer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PayerType" minOccurs="0"/>
 *         <element name="PaymentInfoID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         <element name="PaymentRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="PriceVarianceAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="PriceVarianceRule" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PriceVarianceRuleType" minOccurs="0"/>
 *         <element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PromotionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SurchargeAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaymentMethodCodeType"/>
 *         <element name="VerificationInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "amount",
    "contactInfoRefID",
    "desc",
    "orderAssociation",
    "orderItemRefID",
    "payer",
    "paymentInfoID",
    "paymentRefID",
    "priceVarianceAmount",
    "priceVarianceRule",
    "promotion",
    "surchargeAmount",
    "typeCode",
    "verificationInd"
})
public class PaymentInfoType {

    /**
     * The amount applied to the associated payment method. Example: 300 USD
     * 
     */
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected AmountType amount;
    /**
     * Reference to the Payer's Contact ID within this message.
     * 
     */
    @XmlElement(name = "ContactInfoRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoRefID;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DescType desc;
    /**
     * Reference to an Order  for which this payment method applies. if empty, the payment method is applicable to the entire order.
     * 
     */
    @XmlElement(name = "OrderAssociation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected OrderAssociationType orderAssociation;
    /**
     * Reference to an Order Item ID within this message.
     * 
     */
    @XmlElement(name = "OrderItemRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> orderItemRefID;
    /**
     * Provides Payment Card details and commits the payment for the Offer(s) they wish to purchase. The Payment can take place either before or after the Order has been created.
     * 
     */
    @XmlElement(name = "Payer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PayerType payer;
    /**
     * Uniquely identifies payment information within a message.
     * 
     */
    @XmlElement(name = "PaymentInfoID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentInfoID;
    /**
     * If creating the order after payment authorization it is a way of linking an order to an existing payment reference. not triggering the whole process again.
     * 
     */
    @XmlElement(name = "PaymentRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentRefID;
    /**
     * Price variance amount applied during Payment processing.
     * 
     */
    @XmlElement(name = "PriceVarianceAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType priceVarianceAmount;
    /**
     * Price Variance supports specifying Payment Processing Rules, including payment failure. Acceptable amount and/or percentage of the total amount by which the Order item price can vary. Example: 20 USD, 2 Percent
     * 
     */
    @XmlElement(name = "PriceVarianceRule", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PriceVarianceRuleType priceVarianceRule;
    /**
     * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
     * 
     */
    @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<PromotionType> promotion;
    /**
     * Amount added to the final Offer/Order price, depending on which payment method is used by the client.
     * 
     */
    @XmlElement(name = "SurchargeAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType surchargeAmount;
    /**
     * The payment method type. Examples: Credit Card, Cash.
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;
    /**
     * When true, this payment requires additional authentication.
     * 
     */
    @XmlElement(name = "VerificationInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean verificationInd;

    /**
     * The amount applied to the associated payment method. Example: 300 USD
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAmount()
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Reference to the Payer's Contact ID within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoRefID() {
        return contactInfoRefID;
    }

    /**
     * Sets the value of the contactInfoRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContactInfoRefID()
     */
    public void setContactInfoRefID(String value) {
        this.contactInfoRefID = value;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     * @see #getDesc()
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Reference to an Order  for which this payment method applies. if empty, the payment method is applicable to the entire order.
     * 
     * @return
     *     possible object is
     *     {@link OrderAssociationType }
     *     
     */
    public OrderAssociationType getOrderAssociation() {
        return orderAssociation;
    }

    /**
     * Sets the value of the orderAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAssociationType }
     *     
     * @see #getOrderAssociation()
     */
    public void setOrderAssociation(OrderAssociationType value) {
        this.orderAssociation = value;
    }

    /**
     * Reference to an Order Item ID within this message.
     * 
     * Gets the value of the orderItemRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrderItemRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the orderItemRefID property.
     */
    public List<String> getOrderItemRefID() {
        if (orderItemRefID == null) {
            orderItemRefID = new ArrayList<>();
        }
        return this.orderItemRefID;
    }

    /**
     * Provides Payment Card details and commits the payment for the Offer(s) they wish to purchase. The Payment can take place either before or after the Order has been created.
     * 
     * @return
     *     possible object is
     *     {@link PayerType }
     *     
     */
    public PayerType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerType }
     *     
     * @see #getPayer()
     */
    public void setPayer(PayerType value) {
        this.payer = value;
    }

    /**
     * Uniquely identifies payment information within a message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfoID() {
        return paymentInfoID;
    }

    /**
     * Sets the value of the paymentInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentInfoID()
     */
    public void setPaymentInfoID(String value) {
        this.paymentInfoID = value;
    }

    /**
     * If creating the order after payment authorization it is a way of linking an order to an existing payment reference. not triggering the whole process again.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRefID() {
        return paymentRefID;
    }

    /**
     * Sets the value of the paymentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentRefID()
     */
    public void setPaymentRefID(String value) {
        this.paymentRefID = value;
    }

    /**
     * Price variance amount applied during Payment processing.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPriceVarianceAmount() {
        return priceVarianceAmount;
    }

    /**
     * Sets the value of the priceVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getPriceVarianceAmount()
     */
    public void setPriceVarianceAmount(AmountType value) {
        this.priceVarianceAmount = value;
    }

    /**
     * Price Variance supports specifying Payment Processing Rules, including payment failure. Acceptable amount and/or percentage of the total amount by which the Order item price can vary. Example: 20 USD, 2 Percent
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleType }
     *     
     */
    public PriceVarianceRuleType getPriceVarianceRule() {
        return priceVarianceRule;
    }

    /**
     * Sets the value of the priceVarianceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleType }
     *     
     * @see #getPriceVarianceRule()
     */
    public void setPriceVarianceRule(PriceVarianceRuleType value) {
        this.priceVarianceRule = value;
    }

    /**
     * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
     * 
     * Gets the value of the promotion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the promotion property.
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<>();
        }
        return this.promotion;
    }

    /**
     * Amount added to the final Offer/Order price, depending on which payment method is used by the client.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getSurchargeAmount()
     */
    public void setSurchargeAmount(AmountType value) {
        this.surchargeAmount = value;
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

    /**
     * When true, this payment requires additional authentication.
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
