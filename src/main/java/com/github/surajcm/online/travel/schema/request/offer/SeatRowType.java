
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Row of passenger seats located in the cabin.
 * 
 * <p>Java class for SeatRowType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatRowType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RowCharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatRowCharacteristicCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NaturalNumberType"/>
 *         <element name="Seat" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRowType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "rowCharacteristicCode",
    "rowNumber",
    "seat"
})
public class SeatRowType {

    /**
     * Information and characteristics applying to a row of Passenger Seats (examples: XC - Exit Row, N - No Smoking Row, etc.).
     * 
     */
    @XmlElement(name = "RowCharacteristicCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<String> rowCharacteristicCode;
    /**
     * Ordinal number identifying a seat row in an aircraft.
     * 
     */
    @XmlElement(name = "RowNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected BigInteger rowNumber;
    /**
     * A sitting place for a passenger located in the cabin.
     * 
     */
    @XmlElement(name = "Seat", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<SeatType> seat;

    /**
     * Information and characteristics applying to a row of Passenger Seats (examples: XC - Exit Row, N - No Smoking Row, etc.).
     * 
     * Gets the value of the rowCharacteristicCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rowCharacteristicCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRowCharacteristicCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the rowCharacteristicCode property.
     */
    public List<String> getRowCharacteristicCode() {
        if (rowCharacteristicCode == null) {
            rowCharacteristicCode = new ArrayList<>();
        }
        return this.rowCharacteristicCode;
    }

    /**
     * Ordinal number identifying a seat row in an aircraft.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getRowNumber()
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * A sitting place for a passenger located in the cabin.
     * 
     * Gets the value of the seat property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seat property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatType }
     * </p>
     * 
     * 
     * @return
     *     The value of the seat property.
     */
    public List<SeatType> getSeat() {
        if (seat == null) {
            seat = new ArrayList<>();
        }
        return this.seat;
    }

}
