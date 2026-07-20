
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Bank Account payment method definition. Customer bank accounts for payments, either for paper checks or electronic funds transfer.
 * 
 * <p>Java class for BankTransferType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BankTransferType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="BankAccountID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="BankID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="CheckNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *         <element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ProperNameType" minOccurs="0"/>
 *         <element name="SubCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransferType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "accountTypeText",
    "bankAccountID",
    "bankID",
    "checkNumber",
    "ownerName",
    "subCode"
})
public class BankTransferType {

    /**
     * Account Type. Examples: Checking, Savings, Investment
     * 
     */
    @XmlElement(name = "AccountTypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String accountTypeText;
    /**
     * The bank account identifier.
     * 
     */
    @XmlElement(name = "BankAccountID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountID;
    /**
     * Routing Number. Example: 0260-0959-3 Note: This is the code assigned by authorities to financial institutions; sometimes called bank routing number.
     * 
     */
    @XmlElement(name = "BankID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankID;
    /**
     * Check or draft number. Example: 1234
     * 
     */
    @XmlElement(name = "CheckNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal checkNumber;
    /**
     * This is the name the bank account is held under. Example: JOHN SMITH
     * 
     */
    @XmlElement(name = "OwnerName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    /**
     * Defines what type of Bank Transfer is currently used for payment to provide a more detailed definition of what the payment actually is.
     * 
     */
    @XmlElement(name = "SubCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String subCode;

    /**
     * Account Type. Examples: Checking, Savings, Investment
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeText() {
        return accountTypeText;
    }

    /**
     * Sets the value of the accountTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountTypeText()
     */
    public void setAccountTypeText(String value) {
        this.accountTypeText = value;
    }

    /**
     * The bank account identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountID() {
        return bankAccountID;
    }

    /**
     * Sets the value of the bankAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankAccountID()
     */
    public void setBankAccountID(String value) {
        this.bankAccountID = value;
    }

    /**
     * Routing Number. Example: 0260-0959-3 Note: This is the code assigned by authorities to financial institutions; sometimes called bank routing number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * Sets the value of the bankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankID()
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

    /**
     * Check or draft number. Example: 1234
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCheckNumber()
     */
    public void setCheckNumber(BigDecimal value) {
        this.checkNumber = value;
    }

    /**
     * This is the name the bank account is held under. Example: JOHN SMITH
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerName()
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Defines what type of Bank Transfer is currently used for payment to provide a more detailed definition of what the payment actually is.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSubCode()
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

}
