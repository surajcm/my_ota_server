
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A form of payment by which the customer uses a virtual currency of a Loyalty Program Account (such as air miles) in exchange for goods or services.
 * 
 * <p>Java class for LoyaltyRedemptionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LoyaltyRedemptionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertificateNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LoyaltyCurAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         <element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}LoyaltyProgramAccountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRedemptionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "certificateNumber",
    "loyaltyCurAmount",
    "loyaltyProgramAccount"
})
public class LoyaltyRedemptionType {

    /**
     * The loyalty redemption certificate number.
     * 
     */
    @XmlElement(name = "CertificateNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<BigDecimal> certificateNumber;
    /**
     * The quantity of loyalty units redeemed. Example: 15000
     * 
     */
    @XmlElement(name = "LoyaltyCurAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType loyaltyCurAmount;
    /**
     * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
     * 
     */
    @XmlElement(name = "LoyaltyProgramAccount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected LoyaltyProgramAccountType loyaltyProgramAccount;

    /**
     * The loyalty redemption certificate number.
     * 
     * Gets the value of the certificateNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCertificateNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * </p>
     * 
     * 
     * @return
     *     The value of the certificateNumber property.
     */
    public List<BigDecimal> getCertificateNumber() {
        if (certificateNumber == null) {
            certificateNumber = new ArrayList<>();
        }
        return this.certificateNumber;
    }

    /**
     * The quantity of loyalty units redeemed. Example: 15000
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoyaltyCurAmount() {
        return loyaltyCurAmount;
    }

    /**
     * Sets the value of the loyaltyCurAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getLoyaltyCurAmount()
     */
    public void setLoyaltyCurAmount(AmountType value) {
        this.loyaltyCurAmount = value;
    }

    /**
     * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramAccountType }
     *     
     */
    public LoyaltyProgramAccountType getLoyaltyProgramAccount() {
        return loyaltyProgramAccount;
    }

    /**
     * Sets the value of the loyaltyProgramAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramAccountType }
     *     
     * @see #getLoyaltyProgramAccount()
     */
    public void setLoyaltyProgramAccount(LoyaltyProgramAccountType value) {
        this.loyaltyProgramAccount = value;
    }

}
