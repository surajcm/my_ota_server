
package com.github.surajcm.online.travel.schema.request.shop;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import com.github.surajcm.online.travel.dataaccess.serialization.ZonedDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A Customer's requested Origin departure time and location.
 * 
 * <p>Java class for OriginDepCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OriginDepCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BoardingGateID_Type" minOccurs="0"/>
 *         <element name="Date" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType"/>
 *         <element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_LocationCodeType"/>
 *         <element name="StationName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="Time" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *         <element name="TimeAfterMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         <element name="TimeBeforeMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDepCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "boardingGateID",
    "date",
    "iataLocationCode",
    "stationName",
    "terminalName",
    "time",
    "timeAfterMeasure",
    "timeBeforeMeasure"
})
public class OriginDepCriteriaType {

    /**
     * Identifier of the gate. E.g. 'A5'.
     * 
     */
    @XmlElement(name = "BoardingGateID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;
    /**
     * The customer's requested departure date.
     * 
     */
    @XmlElement(name = "Date", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    /**
     * IATA defined code identifying a city or station.
     * 
     */
    @XmlElement(name = "IATA_LocationCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iataLocationCode;
    /**
     * Name of the station. E.g. George Bush Intercontinental Airport
     * 
     */
    @XmlElement(name = "StationName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String stationName;
    /**
     * The name of the terminal.
     * 
     */
    @XmlElement(name = "TerminalName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String terminalName;
    /**
     * The customer's requested departure time.
     * 
     */
    @XmlElement(name = "Time", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime time;
    /**
     * Time tolerance measured in hours or days.
     * 
     */
    @XmlElement(name = "TimeAfterMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MeasureType timeAfterMeasure;
    /**
     * Time tolerance measured in hours or days.
     * 
     */
    @XmlElement(name = "TimeBeforeMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MeasureType timeBeforeMeasure;

    /**
     * Identifier of the gate. E.g. 'A5'.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingGateID() {
        return boardingGateID;
    }

    /**
     * Sets the value of the boardingGateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBoardingGateID()
     */
    public void setBoardingGateID(String value) {
        this.boardingGateID = value;
    }

    /**
     * The customer's requested departure date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDate()
     */
    public void setDate(LocalDate value) {
        this.date = value;
    }

    /**
     * IATA defined code identifying a city or station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATALocationCode() {
        return iataLocationCode;
    }

    /**
     * Sets the value of the iataLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIATALocationCode()
     */
    public void setIATALocationCode(String value) {
        this.iataLocationCode = value;
    }

    /**
     * Name of the station. E.g. George Bush Intercontinental Airport
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStationName()
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * The name of the terminal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTerminalName()
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
    }

    /**
     * The customer's requested departure time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTime()
     */
    public void setTime(ZonedDateTime value) {
        this.time = value;
    }

    /**
     * Time tolerance measured in hours or days.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeAfterMeasure() {
        return timeAfterMeasure;
    }

    /**
     * Sets the value of the timeAfterMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getTimeAfterMeasure()
     */
    public void setTimeAfterMeasure(MeasureType value) {
        this.timeAfterMeasure = value;
    }

    /**
     * Time tolerance measured in hours or days.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeBeforeMeasure() {
        return timeBeforeMeasure;
    }

    /**
     * Sets the value of the timeBeforeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getTimeBeforeMeasure()
     */
    public void setTimeBeforeMeasure(MeasureType value) {
        this.timeBeforeMeasure = value;
    }

}
