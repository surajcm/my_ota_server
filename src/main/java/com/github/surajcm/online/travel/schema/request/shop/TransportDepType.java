
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The action or process of leaving of a transport vehicle from any place or location.
 * 
 * <p>Java class for TransportDepType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TransportDepType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AircraftScheduledDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *         <element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BoardingGateID_Type" minOccurs="0"/>
 *         <element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_LocationCodeType" minOccurs="0"/>
 *         <element name="StationName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDepType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "aircraftScheduledDateTime",
    "boardingGateID",
    "iataLocationCode",
    "stationName",
    "terminalName"
})
public class TransportDepType {

    /**
     * The Scheduled Date and Time of Departure of the aircraft at the terminal or departure gate at an airport.
     * 
     */
    @XmlElement(name = "AircraftScheduledDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType aircraftScheduledDateTime;
    /**
     * Identifier of the gate. E.g. 'A5'.
     * 
     */
    @XmlElement(name = "BoardingGateID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;
    /**
     * IATA defined code identifying a city or station.
     * 
     */
    @XmlElement(name = "IATA_LocationCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
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
     * The Scheduled Date and Time of Departure of the aircraft at the terminal or departure gate at an airport.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getAircraftScheduledDateTime() {
        return aircraftScheduledDateTime;
    }

    /**
     * Sets the value of the aircraftScheduledDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getAircraftScheduledDateTime()
     */
    public void setAircraftScheduledDateTime(DateTimeType value) {
        this.aircraftScheduledDateTime = value;
    }

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

}
