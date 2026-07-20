
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
 * 
 * <p>Java class for PaymentMethodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentMethodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AccountableDoc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AccountableDocType"/>
 *         <element name="BankTransfer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}BankTransferType"/>
 *         <element name="Cash" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CashType"/>
 *         <element name="Check" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CheckType"/>
 *         <element name="DirectBill" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DirectBillType"/>
 *         <element name="LoyaltyRedemption" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}LoyaltyRedemptionType"/>
 *         <element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OtherPaymentMethodType"/>
 *         <element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentCardType"/>
 *         <element name="PaymentRedirection" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentRedirectionType" minOccurs="0"/>
 *         <element name="Voucher" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}VoucherType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "accountableDoc",
    "bankTransfer",
    "cash",
    "check",
    "directBill",
    "loyaltyRedemption",
    "otherPaymentMethod",
    "paymentCard",
    "paymentRedirection",
    "voucher"
})
public class PaymentMethodType {

    /**
     * Form of payment which utilizes a previously issued accountable travel document (ticket, EMD, coupon, etc.) which has an outstanding credit value.
     * 
     */
    @XmlElement(name = "AccountableDoc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AccountableDocType accountableDoc;
    /**
     * Bank Account payment method definition. Customer bank accounts for payments, either for paper checks or electronic funds transfer.
     * 
     */
    @XmlElement(name = "BankTransfer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BankTransferType bankTransfer;
    /**
     * Any payment that is collected by the agent and settled between the Airline and the agent. Refer to IATA Resolution 728 Attachment A for full details.
     * 
     */
    @XmlElement(name = "Cash", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected CashType cash;
    /**
     * A written order instructing a financial institution to pay immediately on demand a specified amount of money from the check writer's account to the person named on the check or, if a specific person is not named, to whoever bears the check to the institution for payment.
     * 
     */
    @XmlElement(name = "Check", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected CheckType check;
    /**
     * System in which a corporation's travel agency bills employees for their business travel. The employee must then submit an expense accounting and be reimbursed by the corporation.
     * 
     */
    @XmlElement(name = "DirectBill", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DirectBillType directBill;
    /**
     * A form of payment by which the customer uses a virtual currency of a Loyalty Program Account (such as air miles) in exchange for goods or services.
     * 
     */
    @XmlElement(name = "LoyaltyRedemption", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected LoyaltyRedemptionType loyaltyRedemption;
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
    protected PaymentCardType paymentCard;
    /**
     * contains all the instructions for the Seller on how to redirect the Payer to their hosted payment page.
     * 
     */
    @XmlElement(name = "PaymentRedirection", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PaymentRedirectionType paymentRedirection;
    /**
     * A document that entitles the holder to a discount or that may be exchanged for goods or services.
     * 
     */
    @XmlElement(name = "Voucher", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected VoucherType voucher;

    /**
     * Form of payment which utilizes a previously issued accountable travel document (ticket, EMD, coupon, etc.) which has an outstanding credit value.
     * 
     * @return
     *     possible object is
     *     {@link AccountableDocType }
     *     
     */
    public AccountableDocType getAccountableDoc() {
        return accountableDoc;
    }

    /**
     * Sets the value of the accountableDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountableDocType }
     *     
     * @see #getAccountableDoc()
     */
    public void setAccountableDoc(AccountableDocType value) {
        this.accountableDoc = value;
    }

    /**
     * Bank Account payment method definition. Customer bank accounts for payments, either for paper checks or electronic funds transfer.
     * 
     * @return
     *     possible object is
     *     {@link BankTransferType }
     *     
     */
    public BankTransferType getBankTransfer() {
        return bankTransfer;
    }

    /**
     * Sets the value of the bankTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransferType }
     *     
     * @see #getBankTransfer()
     */
    public void setBankTransfer(BankTransferType value) {
        this.bankTransfer = value;
    }

    /**
     * Any payment that is collected by the agent and settled between the Airline and the agent. Refer to IATA Resolution 728 Attachment A for full details.
     * 
     * @return
     *     possible object is
     *     {@link CashType }
     *     
     */
    public CashType getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashType }
     *     
     * @see #getCash()
     */
    public void setCash(CashType value) {
        this.cash = value;
    }

    /**
     * A written order instructing a financial institution to pay immediately on demand a specified amount of money from the check writer's account to the person named on the check or, if a specific person is not named, to whoever bears the check to the institution for payment.
     * 
     * @return
     *     possible object is
     *     {@link CheckType }
     *     
     */
    public CheckType getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType }
     *     
     * @see #getCheck()
     */
    public void setCheck(CheckType value) {
        this.check = value;
    }

    /**
     * System in which a corporation's travel agency bills employees for their business travel. The employee must then submit an expense accounting and be reimbursed by the corporation.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     * @see #getDirectBill()
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * A form of payment by which the customer uses a virtual currency of a Loyalty Program Account (such as air miles) in exchange for goods or services.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRedemptionType }
     *     
     */
    public LoyaltyRedemptionType getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRedemptionType }
     *     
     * @see #getLoyaltyRedemption()
     */
    public void setLoyaltyRedemption(LoyaltyRedemptionType value) {
        this.loyaltyRedemption = value;
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
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     * @see #getPaymentCard()
     */
    public void setPaymentCard(PaymentCardType value) {
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
     * A document that entitles the holder to a discount or that may be exchanged for goods or services.
     * 
     * @return
     *     possible object is
     *     {@link VoucherType }
     *     
     */
    public VoucherType getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherType }
     *     
     * @see #getVoucher()
     */
    public void setVoucher(VoucherType value) {
        this.voucher = value;
    }

}
