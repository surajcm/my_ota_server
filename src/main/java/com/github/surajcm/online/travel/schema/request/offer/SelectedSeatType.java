
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Selection of specific seat location, as provided in seat availability messages.  When used, only a single Passenger must be referenced for a single Segment.
 * 
 * <p>Java class for SelectedSeatType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SelectedSeatType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="SeatRowNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NumberType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedSeatType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "columnID",
    "seatRowNumber"
})
public class SelectedSeatType {

    /**
     * Seat column to identify a particular seat position on an aircraft.
     * 
     */
    @XmlElement(name = "ColumnID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    /**
     * Seat Row number. Example: 2
     * 
     */
    @XmlElement(name = "SeatRowNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected BigDecimal seatRowNumber;

    /**
     * Seat column to identify a particular seat position on an aircraft.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnID() {
        return columnID;
    }

    /**
     * Sets the value of the columnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getColumnID()
     */
    public void setColumnID(String value) {
        this.columnID = value;
    }

    /**
     * Seat Row number. Example: 2
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatRowNumber() {
        return seatRowNumber;
    }

    /**
     * Sets the value of the seatRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSeatRowNumber()
     */
    public void setSeatRowNumber(BigDecimal value) {
        this.seatRowNumber = value;
    }

}
