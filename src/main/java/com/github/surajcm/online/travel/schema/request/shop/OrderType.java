
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigInteger;
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
 * A uniquely identified record of the agreement of one party with another to receive products and services under specified terms and conditions. Order supports the sale of a flexible range of airline products and services that are not necessarily Journey based (e.g. subscription services).
 * 
 * <p>Java class for OrderType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrderID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OrderItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrderVersionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OrderVersionNumberType" minOccurs="0"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OwnerTypeCodeType" minOccurs="0"/>
 *         <element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "bookingRef",
    "orderID",
    "orderItem",
    "orderVersionNumber",
    "ownerCode",
    "ownerTypeCode",
    "webAddressURI"
})
public class OrderType {

    /**
     * Information related to a booking or reservation.
     * 
     */
    @XmlElement(name = "BookingRef", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<BookingRefType> bookingRef;
    /**
     * Carrier assigned ID which uniquely identifies a specific Order across several messages.
     * 
     */
    @XmlElement(name = "OrderID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderID;
    /**
     * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
     * 
     */
    @XmlElement(name = "OrderItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<OrderItemType> orderItem;
    /**
     * Version of the Order used to track the evolution of an Order and the changes made to it.
     * 
     */
    @XmlElement(name = "OrderVersionNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigInteger orderVersionNumber;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * Indicates whether the owner is the ORA or POA.
     * 
     */
    @XmlElement(name = "OwnerTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     */
    @XmlElement(name = "WebAddressURI", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;

    /**
     * Information related to a booking or reservation.
     * 
     * Gets the value of the bookingRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBookingRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the bookingRef property.
     */
    public List<BookingRefType> getBookingRef() {
        if (bookingRef == null) {
            bookingRef = new ArrayList<>();
        }
        return this.bookingRef;
    }

    /**
     * Carrier assigned ID which uniquely identifies a specific Order across several messages.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderID()
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
     * 
     * Gets the value of the orderItem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the orderItem property.
     */
    public List<OrderItemType> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<>();
        }
        return this.orderItem;
    }

    /**
     * Version of the Order used to track the evolution of an Order and the changes made to it.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderVersionNumber() {
        return orderVersionNumber;
    }

    /**
     * Sets the value of the orderVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getOrderVersionNumber()
     */
    public void setOrderVersionNumber(BigInteger value) {
        this.orderVersionNumber = value;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerCode()
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Indicates whether the owner is the ORA or POA.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     * @see #getOwnerTypeCode()
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURI() {
        return webAddressURI;
    }

    /**
     * Sets the value of the webAddressURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWebAddressURI()
     */
    public void setWebAddressURI(String value) {
        this.webAddressURI = value;
    }

}
