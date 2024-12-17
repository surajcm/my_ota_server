
package com.github.surajcm.online.travel.schema.request.shop;

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
 * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
 * 
 * <p>Java class for OriginDestCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OriginDestCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CalendarDateCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CalendarDateCriteriaType" minOccurs="0"/>
 *         <element name="ConnectionPrefRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="DestArrivalCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DestArrivalCriteriaType"/>
 *         <element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}JourneyDurationCriteriaType" minOccurs="0"/>
 *         <element name="OriginDepCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OriginDepCriteriaType"/>
 *         <element name="OriginDestID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="PreferredCabinType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "calendarDateCriteria",
    "connectionPrefRefID",
    "destArrivalCriteria",
    "journeyDurationCriteria",
    "originDepCriteria",
    "originDestID",
    "preferredCabinType"
})
public class OriginDestCriteriaType {

    /**
     * Requests the airline to additionally include a preview of the Offer price for the same Shopping Criteria for the specified date range.
     * 
     */
    @XmlElement(name = "CalendarDateCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CalendarDateCriteriaType calendarDateCriteria;
    /**
     * Reference to a transfer preference ID.
     * 
     */
    @XmlElement(name = "ConnectionPrefRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionPrefRefID;
    /**
     * A Customer's requested Destination arrival time and location.
     * 
     */
    @XmlElement(name = "DestArrivalCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected DestArrivalCriteriaType destArrivalCriteria;
    /**
     * Total journey travel time preferences. This includes the sum of all flight durations as well as connection times.
     * 
     */
    @XmlElement(name = "JourneyDurationCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    /**
     * A Customer's requested Origin departure time and location.
     * 
     */
    @XmlElement(name = "OriginDepCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected OriginDepCriteriaType originDepCriteria;
    /**
     * Uniquely identifies an Origin Destination within the context of one message.
     * 
     */
    @XmlElement(name = "OriginDestID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;
    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "PreferredCabinType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<CabinTypeType> preferredCabinType;

    /**
     * Requests the airline to additionally include a preview of the Offer price for the same Shopping Criteria for the specified date range.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDateCriteriaType }
     *     
     */
    public CalendarDateCriteriaType getCalendarDateCriteria() {
        return calendarDateCriteria;
    }

    /**
     * Sets the value of the calendarDateCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDateCriteriaType }
     *     
     * @see #getCalendarDateCriteria()
     */
    public void setCalendarDateCriteria(CalendarDateCriteriaType value) {
        this.calendarDateCriteria = value;
    }

    /**
     * Reference to a transfer preference ID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPrefRefID() {
        return connectionPrefRefID;
    }

    /**
     * Sets the value of the connectionPrefRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConnectionPrefRefID()
     */
    public void setConnectionPrefRefID(String value) {
        this.connectionPrefRefID = value;
    }

    /**
     * A Customer's requested Destination arrival time and location.
     * 
     * @return
     *     possible object is
     *     {@link DestArrivalCriteriaType }
     *     
     */
    public DestArrivalCriteriaType getDestArrivalCriteria() {
        return destArrivalCriteria;
    }

    /**
     * Sets the value of the destArrivalCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestArrivalCriteriaType }
     *     
     * @see #getDestArrivalCriteria()
     */
    public void setDestArrivalCriteria(DestArrivalCriteriaType value) {
        this.destArrivalCriteria = value;
    }

    /**
     * Total journey travel time preferences. This includes the sum of all flight durations as well as connection times.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     * @see #getJourneyDurationCriteria()
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * A Customer's requested Origin departure time and location.
     * 
     * @return
     *     possible object is
     *     {@link OriginDepCriteriaType }
     *     
     */
    public OriginDepCriteriaType getOriginDepCriteria() {
        return originDepCriteria;
    }

    /**
     * Sets the value of the originDepCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDepCriteriaType }
     *     
     * @see #getOriginDepCriteria()
     */
    public void setOriginDepCriteria(OriginDepCriteriaType value) {
        this.originDepCriteria = value;
    }

    /**
     * Uniquely identifies an Origin Destination within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestID() {
        return originDestID;
    }

    /**
     * Sets the value of the originDestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginDestID()
     */
    public void setOriginDestID(String value) {
        this.originDestID = value;
    }

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     * Gets the value of the preferredCabinType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredCabinType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreferredCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the preferredCabinType property.
     */
    public List<CabinTypeType> getPreferredCabinType() {
        if (preferredCabinType == null) {
            preferredCabinType = new ArrayList<>();
        }
        return this.preferredCabinType;
    }

}
