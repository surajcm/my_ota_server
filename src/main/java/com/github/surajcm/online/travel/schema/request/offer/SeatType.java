
package com.github.surajcm.online.travel.schema.request.offer;

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
 * A sitting place for a passenger located in the cabin.
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
 *         <element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ColumnID_Type"/>
 *         <element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NaturalNumberType"/>
 *         <element name="SeatCharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatCharacteristicCodeType" maxOccurs="99" minOccurs="0"/>
 *         <element name="SeatProfileRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "columnID",
    "rowNumber",
    "seatCharacteristicCode",
    "seatProfileRefID"
})
public class SeatType {

    /**
     * Alphabetic character identifying a seat within a row.
     * 
     */
    @XmlElement(name = "ColumnID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    /**
     * Ordinal number identifying a seat row in an aircraft.
     * 
     */
    @XmlElement(name = "RowNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected BigInteger rowNumber;
    /**
     * Characteristic of an aircraft seat e.g. A (Aisle seat), E (Exit and emergency exit),..., according to PADIS code list 9825.
     * 
     */
    @XmlElement(name = "SeatCharacteristicCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> seatCharacteristicCode;
    /**
     * Reference to a Seat Profile ID within this message.
     * 
     */
    @XmlElement(name = "SeatProfileRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seatProfileRefID;

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
     * Characteristic of an aircraft seat e.g. A (Aisle seat), E (Exit and emergency exit),..., according to PADIS code list 9825.
     * 
     * Gets the value of the seatCharacteristicCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatCharacteristicCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatCharacteristicCode().add(newItem);
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
     *     The value of the seatCharacteristicCode property.
     */
    public List<String> getSeatCharacteristicCode() {
        if (seatCharacteristicCode == null) {
            seatCharacteristicCode = new ArrayList<>();
        }
        return this.seatCharacteristicCode;
    }

    /**
     * Reference to a Seat Profile ID within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatProfileRefID() {
        return seatProfileRefID;
    }

    /**
     * Sets the value of the seatProfileRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatProfileRefID()
     */
    public void setSeatProfileRefID(String value) {
        this.seatProfileRefID = value;
    }

}
