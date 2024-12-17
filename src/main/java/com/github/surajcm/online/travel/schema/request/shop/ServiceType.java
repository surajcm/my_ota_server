
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
 * 
 * <p>Java class for ServiceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InventoryGuaranteeDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *         <element name="ServiceID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="UnchangedInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "inventoryGuaranteeDateTime",
    "serviceID",
    "unchangedInd",
    "validatingCarrier"
})
public class ServiceType {

    /**
     * The length of time inventory against a given Service is guaranteed. If inventory is not guaranteed, the Order creation (or change) may fail. In the absence of a time limit, no inventory is guaranteed.   Notes:  The presence of an inventory guarantee does not assume a guarantee of price. For the price to be guaranteed against a given Offer Item, the Price Guarantee Time Limit must also be present.  The assumption is that inventory is held when an Order is created (or changed), so this time limit only applies in the context of an Offer.
     * 
     */
    @XmlElement(name = "InventoryGuaranteeDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType inventoryGuaranteeDateTime;
    /**
     * Uniquely Identifies a Service within the context of one message.
     * 
     */
    @XmlElement(name = "ServiceID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    /**
     * Indicated that this service is unchanged after reshopping.
     * 
     */
    @XmlElement(name = "UnchangedInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean unchangedInd;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "ValidatingCarrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CarrierType validatingCarrier;

    /**
     * The length of time inventory against a given Service is guaranteed. If inventory is not guaranteed, the Order creation (or change) may fail. In the absence of a time limit, no inventory is guaranteed.   Notes:  The presence of an inventory guarantee does not assume a guarantee of price. For the price to be guaranteed against a given Offer Item, the Price Guarantee Time Limit must also be present.  The assumption is that inventory is held when an Order is created (or changed), so this time limit only applies in the context of an Offer.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getInventoryGuaranteeDateTime() {
        return inventoryGuaranteeDateTime;
    }

    /**
     * Sets the value of the inventoryGuaranteeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getInventoryGuaranteeDateTime()
     */
    public void setInventoryGuaranteeDateTime(DateTimeType value) {
        this.inventoryGuaranteeDateTime = value;
    }

    /**
     * Uniquely Identifies a Service within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceID()
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Indicated that this service is unchanged after reshopping.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnchangedInd() {
        return unchangedInd;
    }

    /**
     * Sets the value of the unchangedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUnchangedInd()
     */
    public void setUnchangedInd(Boolean value) {
        this.unchangedInd = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getValidatingCarrier()
     */
    public void setValidatingCarrier(CarrierType value) {
        this.validatingCarrier = value;
    }

}
