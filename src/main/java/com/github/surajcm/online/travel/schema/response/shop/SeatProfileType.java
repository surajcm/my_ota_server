
package com.github.surajcm.online.travel.schema.response.shop;

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
 * Airline defined characteristics shared by a group of seats.
 * 
 * <p>Java class for SeatProfileType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatProfileType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SeatCharacteristicCodeType" maxOccurs="99" minOccurs="0"/>
 *         <element name="MarketingInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SeatKeywords" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SeatPitchMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MeasureType" minOccurs="0"/>
 *         <element name="SeatProfileID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type"/>
 *         <element name="SeatWidthMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MeasureType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatProfileType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "characteristicCode",
    "marketingInfo",
    "seatKeywords",
    "seatPitchMeasure",
    "seatProfileID",
    "seatWidthMeasure"
})
public class SeatProfileType {

    /**
     * Seat characteristic/property code (e.g. A - Aisle Seat, W - Window Seat, etc.).
     * 
     */
    @XmlElement(name = "CharacteristicCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> characteristicCode;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
     * 
     */
    @XmlElement(name = "MarketingInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<DescType> marketingInfo;
    /**
     * Key value pair used by airlines to further describe seat characteristics.
     * 
     */
    @XmlElement(name = "SeatKeywords", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<KeyValuePropertyType> seatKeywords;
    /**
     * Measure of a given seat's pitch.
     * 
     */
    @XmlElement(name = "SeatPitchMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected MeasureType seatPitchMeasure;
    /**
     * Unique identifier associated to this Seat Profile.
     * 
     */
    @XmlElement(name = "SeatProfileID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seatProfileID;
    /**
     * Measure of a given seat's width.
     * 
     */
    @XmlElement(name = "SeatWidthMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected MeasureType seatWidthMeasure;

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
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
     * 
     * Gets the value of the marketingInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMarketingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * </p>
     * 
     * 
     * @return
     *     The value of the marketingInfo property.
     */
    public List<DescType> getMarketingInfo() {
        if (marketingInfo == null) {
            marketingInfo = new ArrayList<>();
        }
        return this.marketingInfo;
    }

    /**
     * Key value pair used by airlines to further describe seat characteristics.
     * 
     * Gets the value of the seatKeywords property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatKeywords property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the seatKeywords property.
     */
    public List<KeyValuePropertyType> getSeatKeywords() {
        if (seatKeywords == null) {
            seatKeywords = new ArrayList<>();
        }
        return this.seatKeywords;
    }

    /**
     * Measure of a given seat's pitch.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeatPitchMeasure() {
        return seatPitchMeasure;
    }

    /**
     * Sets the value of the seatPitchMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getSeatPitchMeasure()
     */
    public void setSeatPitchMeasure(MeasureType value) {
        this.seatPitchMeasure = value;
    }

    /**
     * Unique identifier associated to this Seat Profile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatProfileID() {
        return seatProfileID;
    }

    /**
     * Sets the value of the seatProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSeatProfileID()
     */
    public void setSeatProfileID(String value) {
        this.seatProfileID = value;
    }

    /**
     * Measure of a given seat's width.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeatWidthMeasure() {
        return seatWidthMeasure;
    }

    /**
     * Sets the value of the seatWidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getSeatWidthMeasure()
     */
    public void setSeatWidthMeasure(MeasureType value) {
        this.seatWidthMeasure = value;
    }

}
