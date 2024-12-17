
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
 * 
 * <p>Java class for LoyaltyProgramAccountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LoyaltyProgramAccountType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="Alliance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AllianceType" minOccurs="0"/>
 *         <element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType" minOccurs="0"/>
 *         <element name="LoyaltyProgram" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}LoyaltyProgramType"/>
 *         <element name="SignInID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="TierCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="TierName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="TierPriority" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramAccountType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "accountNumber",
    "alliance",
    "carrier",
    "loyaltyProgram",
    "signInID",
    "tierCode",
    "tierName",
    "tierPriority"
})
public class LoyaltyProgramAccountType {

    /**
     * Loyalty Program account number. Example: ABC123456
     * 
     */
    @XmlElement(name = "AccountNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountNumber;
    /**
     * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
     * 
     */
    @XmlElement(name = "Alliance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AllianceType alliance;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "Carrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CarrierType carrier;
    /**
     * A rewards program offered by a company to customers who frequently make purchases, which may give a customer advanced access to new products, special sales coupons or free merchandise.
     * 
     */
    @XmlElement(name = "LoyaltyProgram", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected LoyaltyProgramType loyaltyProgram;
    /**
     * Loyalty Program sign-in ID (or username).
     * 
     */
    @XmlElement(name = "SignInID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String signInID;
    /**
     * Loyalty Program tier code.
     * 
     */
    @XmlElement(name = "TierCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tierCode;
    /**
     * Loyalty Program tier name.
     * 
     */
    @XmlElement(name = "TierName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String tierName;
    /**
     * Loyalty Program account priority within the tier (e.g. Platinum, executive, etc.)
     * 
     */
    @XmlElement(name = "TierPriority", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String tierPriority;

    /**
     * Loyalty Program account number. Example: ABC123456
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountNumber()
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
     * 
     * @return
     *     possible object is
     *     {@link AllianceType }
     *     
     */
    public AllianceType getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceType }
     *     
     * @see #getAlliance()
     */
    public void setAlliance(AllianceType value) {
        this.alliance = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * A rewards program offered by a company to customers who frequently make purchases, which may give a customer advanced access to new products, special sales coupons or free merchandise.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramType }
     *     
     */
    public LoyaltyProgramType getLoyaltyProgram() {
        return loyaltyProgram;
    }

    /**
     * Sets the value of the loyaltyProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramType }
     *     
     * @see #getLoyaltyProgram()
     */
    public void setLoyaltyProgram(LoyaltyProgramType value) {
        this.loyaltyProgram = value;
    }

    /**
     * Loyalty Program sign-in ID (or username).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignInID() {
        return signInID;
    }

    /**
     * Sets the value of the signInID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSignInID()
     */
    public void setSignInID(String value) {
        this.signInID = value;
    }

    /**
     * Loyalty Program tier code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierCode() {
        return tierCode;
    }

    /**
     * Sets the value of the tierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTierCode()
     */
    public void setTierCode(String value) {
        this.tierCode = value;
    }

    /**
     * Loyalty Program tier name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierName() {
        return tierName;
    }

    /**
     * Sets the value of the tierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTierName()
     */
    public void setTierName(String value) {
        this.tierName = value;
    }

    /**
     * Loyalty Program account priority within the tier (e.g. Platinum, executive, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierPriority() {
        return tierPriority;
    }

    /**
     * Sets the value of the tierPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTierPriority()
     */
    public void setTierPriority(String value) {
        this.tierPriority = value;
    }

}
