
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="ApprovalCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         <element name="IATA_EasyPayEncryptedData" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IATA_EasyPayEncryptedDataType" minOccurs="0"/>
 *         <element name="SettlementData" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}SettlementDataType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_EasyPayType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "approvalCode",
    "iataEasyPayEncryptedData",
    "settlementData"
})
public class IATAEasyPayType {

    /**
     * Authorization result Approval code
     * 
     */
    @XmlElement(name = "ApprovalCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String approvalCode;
    /**
     * container for the encrypted Easy Pay data
     * 
     */
    @XmlElement(name = "IATA_EasyPayEncryptedData", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected IATAEasyPayEncryptedDataType iataEasyPayEncryptedData;
    /**
     * Amounts that define the funds to be cleared as a result of the payment commitment and the selected payment method, and the date when the funds must be remitted.
     * 
     */
    @XmlElement(name = "SettlementData", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected SettlementDataType settlementData;

    /**
     * Authorization result Approval code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApprovalCode()
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
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
