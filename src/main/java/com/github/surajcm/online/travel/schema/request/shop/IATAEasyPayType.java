
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * IATA EasyPay is a payment instrument with a specific remittance mechanism. This FOP is not limited to BSP.
 * 
 * <p>Java class for IATA_EasyPayType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IATA_EasyPayType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaymentCardNumberType" minOccurs="0"/>
 *         <element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PayCardDateTextType" minOccurs="0"/>
 *         <element name="IATA_EasyPayEncryptedData" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_EasyPayEncryptedDataType" minOccurs="0"/>
 *         <element name="SettlementData" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SettlementDataType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_EasyPayType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "accountNumber",
    "expirationDate",
    "iataEasyPayEncryptedData",
    "settlementData"
})
public class IATAEasyPayType {

    /**
     * The 16-digit EasyPay account number.
     * 
     */
    @XmlElement(name = "AccountNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String accountNumber;
    /**
     * The last month of validity Example: 0119
     * 
     */
    @XmlElement(name = "ExpirationDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String expirationDate;
    /**
     * container for the encrypted Easy Pay data
     * 
     */
    @XmlElement(name = "IATA_EasyPayEncryptedData", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected IATAEasyPayEncryptedDataType iataEasyPayEncryptedData;
    /**
     * Amounts that define the funds to be cleared as a result of the payment commitment and the selected payment method, and the date when the funds must be remitted.
     * 
     */
    @XmlElement(name = "SettlementData", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected SettlementDataType settlementData;

    /**
     * The 16-digit EasyPay account number.
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
     * container for the encrypted Easy Pay data
     * 
     * @return
     *     possible object is
     *     {@link IATAEasyPayEncryptedDataType }
     *     
     */
    public IATAEasyPayEncryptedDataType getIATAEasyPayEncryptedData() {
        return iataEasyPayEncryptedData;
    }

    /**
     * Sets the value of the iataEasyPayEncryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAEasyPayEncryptedDataType }
     *     
     * @see #getIATAEasyPayEncryptedData()
     */
    public void setIATAEasyPayEncryptedData(IATAEasyPayEncryptedDataType value) {
        this.iataEasyPayEncryptedData = value;
    }

    /**
     * Amounts that define the funds to be cleared as a result of the payment commitment and the selected payment method, and the date when the funds must be remitted.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataType }
     *     
     */
    public SettlementDataType getSettlementData() {
        return settlementData;
    }

    /**
     * Sets the value of the settlementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataType }
     *     
     * @see #getSettlementData()
     */
    public void setSettlementData(SettlementDataType value) {
        this.settlementData = value;
    }

}
