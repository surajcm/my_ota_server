
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to a booking or reservation.
 * 
 * <p>Java class for BookingRefType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BookingRefType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BookingEntity" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BookingEntityType"/>
 *         <element name="BookingID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="BookingRefTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BookingRefTypeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingRefType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "bookingEntity",
    "bookingID",
    "bookingRefTypeCode"
})
public class BookingRefType {

    /**
     * Airline or Organization assigning the booking information.
     * 
     */
    @XmlElement(name = "BookingEntity", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected BookingEntityType bookingEntity;
    /**
     * Existing booking reference Identifier.
     * 
     */
    @XmlElement(name = "BookingID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bookingID;
    /**
     * Booking Reference Type. Example: 6 (Passenger confirmation number) Encoding Scheme: IATA Padis Codeset - List for data element [1153] Reference Qualifier
     * 
     */
    @XmlElement(name = "BookingRefTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bookingRefTypeCode;

    /**
     * Airline or Organization assigning the booking information.
     * 
     * @return
     *     possible object is
     *     {@link BookingEntityType }
     *     
     */
    public BookingEntityType getBookingEntity() {
        return bookingEntity;
    }

    /**
     * Sets the value of the bookingEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingEntityType }
     *     
     * @see #getBookingEntity()
     */
    public void setBookingEntity(BookingEntityType value) {
        this.bookingEntity = value;
    }

    /**
     * Existing booking reference Identifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingID()
     */
    public void setBookingID(String value) {
        this.bookingID = value;
    }

    /**
     * Booking Reference Type. Example: 6 (Passenger confirmation number) Encoding Scheme: IATA Padis Codeset - List for data element [1153] Reference Qualifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingRefTypeCode() {
        return bookingRefTypeCode;
    }

    /**
     * Sets the value of the bookingRefTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBookingRefTypeCode()
     */
    public void setBookingRefTypeCode(String value) {
        this.bookingRefTypeCode = value;
    }

}
