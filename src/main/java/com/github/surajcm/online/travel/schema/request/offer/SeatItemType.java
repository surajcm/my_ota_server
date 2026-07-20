
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
 * Seat service information used for long sells.
 * 
 * <p>Java class for SeatItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ColumnID_Type" minOccurs="0"/>
 *         <element name="DatedOperatingLegRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         <element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="Price" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PriceType" minOccurs="0"/>
 *         <element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NaturalNumberType" minOccurs="0"/>
 *         <element name="SeatProfileRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "columnID",
    "datedOperatingLegRefID",
    "paxSegmentRefID",
    "price",
    "rowNumber",
    "seatProfileRefID"
})
public class SeatItemType {

    /**
     * Alphabetic character identifying a seat within a row.
     * 
     */
    @XmlElement(name = "ColumnID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;
    /**
     * Reference to a Dated Operating Leg within this message.
     * 
     */
    @XmlElement(name = "DatedOperatingLegRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegRefID;
    /**
     * Reference to a Passenger Segment within this message.
     * 
     */
    @XmlElement(name = "PaxSegmentRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentRefID;
    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     */
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PriceType price;
    /**
     * Ordinal number identifying a seat row in an aircraft.
     * 
     */
    @XmlElement(name = "RowNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BigInteger rowNumber;
    /**
     * Reference to a Seat Profile definition within this message.
     * 
     */
    @XmlElement(name = "SeatProfileRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> seatProfileRefID;

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
     * Reference to a Dated Operating Leg within this message.
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
     * Reference to a Passenger Segment within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentRefID() {
        return paxSegmentRefID;
    }

    /**
     * Sets the value of the paxSegmentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxSegmentRefID()
     */
    public void setPaxSegmentRefID(String value) {
        this.paxSegmentRefID = value;
    }

    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     * @see #getPrice()
     */
    public void setPrice(PriceType value) {
        this.price = value;
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
     * Reference to a Seat Profile definition within this message.
     * 
     * Gets the value of the seatProfileRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfileRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatProfileRefID().add(newItem);
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
     *     The value of the seatProfileRefID property.
     */
    public List<String> getSeatProfileRefID() {
        if (seatProfileRefID == null) {
            seatProfileRefID = new ArrayList<>();
        }
        return this.seatProfileRefID;
    }

}
