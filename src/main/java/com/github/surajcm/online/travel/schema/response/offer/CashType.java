
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Any payment that is collected by the agent and settled between the Airline and the agent. Refer to IATA Resolution 728 Attachment A for full details.
 * 
 * <p>Java class for CashType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CashType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollectionAddress" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PostalAddressType" minOccurs="0"/>
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
@XmlType(name = "CashType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "collectionAddress",
    "settlementData"
})
public class CashType {

    /**
     * Natural or physical address used for postal service. May be a building address, airport address, etc.
     * 
     */
    @XmlElement(name = "CollectionAddress", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected PostalAddressType collectionAddress;
    /**
     * Amounts that define the funds to be cleared as a result of the payment commitment and the selected payment method, and the date when the funds must be remitted.
     * 
     */
    @XmlElement(name = "SettlementData", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected SettlementDataType settlementData;

    /**
     * Natural or physical address used for postal service. May be a building address, airport address, etc.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     * @see #getCollectionAddress()
     */
    public void setCollectionAddress(PostalAddressType value) {
        this.collectionAddress = value;
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
