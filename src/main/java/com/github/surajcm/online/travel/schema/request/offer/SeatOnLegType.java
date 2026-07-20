
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A sitting place for a passenger or crew in a cabin compartment on a Dated Operating Leg.
 * 
 * <p>Java class for SeatOnLegType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatOnLegType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatedOperatingLegRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatStatusCodeType" minOccurs="0"/>
 *         <element name="Seat" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatType"/>
 *         <element name="SeatRow" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatRowType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatOnLegType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "datedOperatingLegRefID",
    "occupationStatusCode",
    "seat",
    "seatRow"
})
public class SeatOnLegType {

    /**
     * Reference to a Leg ID within this message.
     * 
     */
    @XmlElement(name = "DatedOperatingLegRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegRefID;
    /**
     * Information related to the availability of a particular Seat on Leg.
     * 
     */
    @XmlElement(name = "OccupationStatusCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;
    /**
     * A sitting place for a passenger located in the cabin.
     * 
     */
    @XmlElement(name = "Seat", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected SeatType seat;
    /**
     * Row of passenger seats located in the cabin.
     * 
     */
    @XmlElement(name = "SeatRow", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected SeatRowType seatRow;

    /**
     * Reference to a Leg ID within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedOperatingLegRefID() {
        return datedOperatingLegRefID;
    }

    /**
     * Sets the value of the datedOperatingLegRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDatedOperatingLegRefID()
     */
    public void setDatedOperatingLegRefID(String value) {
        this.datedOperatingLegRefID = value;
    }

    /**
     * Information related to the availability of a particular Seat on Leg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationStatusCode() {
        return occupationStatusCode;
    }

    /**
     * Sets the value of the occupationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOccupationStatusCode()
     */
    public void setOccupationStatusCode(String value) {
        this.occupationStatusCode = value;
    }

    /**
     * A sitting place for a passenger located in the cabin.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     * @see #getSeat()
     */
    public void setSeat(SeatType value) {
        this.seat = value;
    }

    /**
     * Row of passenger seats located in the cabin.
     * 
     * @return
     *     possible object is
     *     {@link SeatRowType }
     *     
     */
    public SeatRowType getSeatRow() {
        return seatRow;
    }

    /**
     * Sets the value of the seatRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRowType }
     *     
     * @see #getSeatRow()
     */
    public void setSeatRow(SeatRowType value) {
        this.seatRow = value;
    }

}
