
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CreationDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="LastModifiedDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OrderItemType" maxOccurs="unbounded"/>
 *         <element name="OrderVersionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OrderVersionNumberType" minOccurs="0"/>
 *         <element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OrderStatusCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "bookingRef",
    "commission",
    "creationDateTime",
    "depositTimeLimitDateTime",
    "lastModifiedDateTime",
    "namingTimeLimitDateTime",
    "orderItem",
    "orderVersionNumber",
    "statusCode"
})
public class OrderType {

    /**
     * Information related to a booking or reservation.
     * 
     */
    @XmlElement(name = "BookingRef", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<BookingRefType> bookingRef;
    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CommissionType> commission;
    /**
     * The date time by which the order is created. Examples: 2018-09-05T15:52:01Z
     * 
     */
    @XmlElement(name = "CreationDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType creationDateTime;
    /**
     * The date by which a deposit must be paid for an order Examples: 2015-01-13T13:59:38Z
     * 
     */
    @XmlElement(name = "DepositTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType depositTimeLimitDateTime;
    /**
     * The date time by which the order is modified. Examples: 2018-09-05T15:52:01Z
     * 
     */
    @XmlElement(name = "LastModifiedDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType lastModifiedDateTime;
    /**
     * The time by which an Order must be completed with individual passenger names. Examples: 2015-01-13T13:59:38Z
     * 
     */
    @XmlElement(name = "NamingTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType namingTimeLimitDateTime;
    /**
     * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
     * 
     */
    @XmlElement(name = "OrderItem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<OrderItemType> orderItem;
    /**
     * Version of the Order used to track the evolution of an Order and the changes made to it.
     * 
     */
    @XmlElement(name = "OrderVersionNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BigInteger orderVersionNumber;
    /**
     * Indicates the current status of an Order E.g. OK (Confirmed)
     * 
     */
    @XmlElement(name = "StatusCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected OrderStatusCodeContentType statusCode;

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
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     * Gets the value of the commission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the commission property.
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<>();
        }
        return this.commission;
    }

    /**
     * The date time by which the order is created. Examples: 2018-09-05T15:52:01Z
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getCreationDateTime()
     */
    public void setCreationDateTime(DateTimeType value) {
        this.creationDateTime = value;
    }

    /**
     * The date by which a deposit must be paid for an order Examples: 2015-01-13T13:59:38Z
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDepositTimeLimitDateTime() {
        return depositTimeLimitDateTime;
    }

    /**
     * Sets the value of the depositTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getDepositTimeLimitDateTime()
     */
    public void setDepositTimeLimitDateTime(DateTimeType value) {
        this.depositTimeLimitDateTime = value;
    }

    /**
     * The date time by which the order is modified. Examples: 2018-09-05T15:52:01Z
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getLastModifiedDateTime()
     */
    public void setLastModifiedDateTime(DateTimeType value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * The time by which an Order must be completed with individual passenger names. Examples: 2015-01-13T13:59:38Z
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getNamingTimeLimitDateTime() {
        return namingTimeLimitDateTime;
    }

    /**
     * Sets the value of the namingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getNamingTimeLimitDateTime()
     */
    public void setNamingTimeLimitDateTime(DateTimeType value) {
        this.namingTimeLimitDateTime = value;
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
     * Indicates the current status of an Order E.g. OK (Confirmed)
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusCodeContentType }
     *     
     */
    public OrderStatusCodeContentType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusCodeContentType }
     *     
     * @see #getStatusCode()
     */
    public void setStatusCode(OrderStatusCodeContentType value) {
        this.statusCode = value;
    }

}
