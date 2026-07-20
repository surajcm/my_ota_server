
package com.github.surajcm.online.travel.schema.response.shop;

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
 *         <element name="CollectionAddress" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PostalAddressType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "collectionAddress"
})
public class CashType {

    /**
     * Natural or physical address used for postal service. May be a building address, airport address, etc.
     * 
     */
    @XmlElement(name = "CollectionAddress", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected PostalAddressType collectionAddress;

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

}
