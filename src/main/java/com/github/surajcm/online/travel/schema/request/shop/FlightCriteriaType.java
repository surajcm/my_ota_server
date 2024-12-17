
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Flight filter criteria including aircraft features, Cabin Type, RBD, and Tail Number.
 * 
 * <p>Java class for FlightCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Aircraft" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AircraftType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FlightCharacteristicsCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightCharacteristicsCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IATA_AircraftType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_AircraftTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RBD" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RBD_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WaitListCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "aircraft",
    "cabinType",
    "flightCharacteristicsCriteria",
    "iataAircraftType",
    "rbd",
    "waitListCriteria"
})
public class FlightCriteriaType {

    /**
     * Any machine that can derive support in the atmosphere from the reactions of the air other than the reactions of the air against the earthâ€™s surface. It must be certified as airworthy by a competent aeronautical authority.
     * 
     */
    @XmlElement(name = "Aircraft", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<AircraftType> aircraft;
    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "CabinType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<CabinTypeType> cabinType;
    /**
     * Flight characteristics filter criteria for shopping requests, including non-stop, red eye, etc.
     * 
     */
    @XmlElement(name = "FlightCharacteristicsCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<FlightCharacteristicsCriteriaType> flightCharacteristicsCriteria;
    /**
     * Grouping of aircrafts with the same form, function and specification, currently flown, or soon to be flown. Possible types are defined in the IATA SSIM.
     * 
     */
    @XmlElement(name = "IATA_AircraftType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<IATAAircraftTypeType> iataAircraftType;
    /**
     * Reservation Booking Designator. A categorization used to facilitate access to inventory, application of filed fares, and to identify cabin entitlement. Identified using a single alpha character. E.g. 'J' for Business Class Premium, 'D' for Business Discounted.
     * 
     */
    @XmlElement(name = "RBD", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<RBDType> rbd;
    /**
     * Wait listing shopping preference information.
     * 
     */
    @XmlElement(name = "WaitListCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PrefLevelType waitListCriteria;

    /**
     * Any machine that can derive support in the atmosphere from the reactions of the air other than the reactions of the air against the earthâ€™s surface. It must be certified as airworthy by a competent aeronautical authority.
     * 
     * Gets the value of the aircraft property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraft property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftType }
     * </p>
     * 
     * 
     * @return
     *     The value of the aircraft property.
     */
    public List<AircraftType> getAircraft() {
        if (aircraft == null) {
            aircraft = new ArrayList<>();
        }
        return this.aircraft;
    }

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     * Gets the value of the cabinType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCabinType().add(newItem);
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
     *     The value of the cabinType property.
     */
    public List<CabinTypeType> getCabinType() {
        if (cabinType == null) {
            cabinType = new ArrayList<>();
        }
        return this.cabinType;
    }

    /**
     * Flight characteristics filter criteria for shopping requests, including non-stop, red eye, etc.
     * 
     * Gets the value of the flightCharacteristicsCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightCharacteristicsCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFlightCharacteristicsCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightCharacteristicsCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the flightCharacteristicsCriteria property.
     */
    public List<FlightCharacteristicsCriteriaType> getFlightCharacteristicsCriteria() {
        if (flightCharacteristicsCriteria == null) {
            flightCharacteristicsCriteria = new ArrayList<>();
        }
        return this.flightCharacteristicsCriteria;
    }

    /**
     * Grouping of aircrafts with the same form, function and specification, currently flown, or soon to be flown. Possible types are defined in the IATA SSIM.
     * 
     * Gets the value of the iataAircraftType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iataAircraftType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIATAAircraftType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATAAircraftTypeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the iataAircraftType property.
     */
    public List<IATAAircraftTypeType> getIATAAircraftType() {
        if (iataAircraftType == null) {
            iataAircraftType = new ArrayList<>();
        }
        return this.iataAircraftType;
    }

    /**
     * Reservation Booking Designator. A categorization used to facilitate access to inventory, application of filed fares, and to identify cabin entitlement. Identified using a single alpha character. E.g. 'J' for Business Class Premium, 'D' for Business Discounted.
     * 
     * Gets the value of the rbd property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rbd property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRBD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RBDType }
     * </p>
     * 
     * 
     * @return
     *     The value of the rbd property.
     */
    public List<RBDType> getRBD() {
        if (rbd == null) {
            rbd = new ArrayList<>();
        }
        return this.rbd;
    }

    /**
     * Wait listing shopping preference information.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getWaitListCriteria() {
        return waitListCriteria;
    }

    /**
     * Sets the value of the waitListCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     * @see #getWaitListCriteria()
     */
    public void setWaitListCriteria(PrefLevelType value) {
        this.waitListCriteria = value;
    }

}
