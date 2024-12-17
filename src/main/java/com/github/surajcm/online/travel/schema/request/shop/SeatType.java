
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
 * A sitting place for a passenger or crew in a cabin compartment on a transport vehicle.
 * 
 * <p>Java class for SeatType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SeatCharacteristicCodeType" maxOccurs="99" minOccurs="0"/>
 *         <element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SeatStatusCodeType" minOccurs="0"/>
 *         <element name="SeatProfile" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SeatProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SeatRowNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NaturalNumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "characteristicCode",
    "columnID",
    "occupationStatusCode",
    "seatProfile",
    "seatRowNumber"
})
public class SeatType {

    /**
     * Seat characteristic/property code (e.g. A - Aisle Seat, W - Window Seat, etc.).
     * 
     */
    @XmlElement(name = "CharacteristicCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> characteristicCode;
    /**
     * Alphabetic character identifying a seat within a row.
     * 
     */
    @XmlElement(name = "ColumnID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    /**
     * Information related to the availability of a particular Seat on Leg.
     * 
     */
    @XmlElement(name = "OccupationStatusCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;
    /**
     * Airline defined group of seats sharing common characteristics.
     * 
     */
    @XmlElement(name = "SeatProfile", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<SeatProfileType> seatProfile;
    /**
     * Ordinal number identifying a seat row in an aircraft.
     * 
     */
    @XmlElement(name = "SeatRowNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigInteger seatRowNumber;

    /**
     * Seat characteristic/property code (e.g. A - Aisle Seat, W - Window Seat, etc.).
     * 
     * Gets the value of the characteristicCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCharacteristicCode().add(newItem);
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
     *     The value of the characteristicCode property.
     */
    public List<String> getCharacteristicCode() {
        if (characteristicCode == null) {
            characteristicCode = new ArrayList<>();
        }
        return this.characteristicCode;
    }

    /**
     * Alphabetic character identifying a seat within a row.
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
     * Airline defined group of seats sharing common characteristics.
     * 
     * Gets the value of the seatProfile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatProfileType }
     * </p>
     * 
     * 
     * @return
     *     The value of the seatProfile property.
     */
    public List<SeatProfileType> getSeatProfile() {
        if (seatProfile == null) {
            seatProfile = new ArrayList<>();
        }
        return this.seatProfile;
    }

    /**
     * Ordinal number identifying a seat row in an aircraft.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatRowNumber() {
        return seatRowNumber;
    }

    /**
     * Sets the value of the seatRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getSeatRowNumber()
     */
    public void setSeatRowNumber(BigInteger value) {
        this.seatRowNumber = value;
    }

}
