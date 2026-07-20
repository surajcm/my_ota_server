
package com.github.surajcm.online.travel.schema.response.shop;

import java.time.ZonedDateTime;
import com.github.surajcm.online.travel.dataaccess.serialization.ZonedDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc.
 * 
 * <p>Java class for DatedOperatingLegType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatedOperatingLegType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TransportArrivalType"/>
 *         <element name="CarrierAircraftType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CarrierAircraftTypeType" minOccurs="0"/>
 *         <element name="ChangeofGaugeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="DatedOperatingLegID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="Dep" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TransportDepType"/>
 *         <element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MeasureType" minOccurs="0"/>
 *         <element name="IATA_AircraftType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IATA_AircraftTypeType" minOccurs="0"/>
 *         <element name="OnGroundDuration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TimeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedOperatingLegType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "arrival",
    "carrierAircraftType",
    "changeofGaugeInd",
    "datedOperatingLegID",
    "dep",
    "distanceMeasure",
    "iataAircraftType",
    "onGroundDuration"
})
public class DatedOperatingLegType {

    /**
     * The action or process of arriving of a transport vehicle in any place or location.
     * 
     */
    @XmlElement(name = "Arrival", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected TransportArrivalType arrival;
    /**
     * Carrier defined internal grouping of aircrafts with the same form, function and specification.
     * 
     */
    @XmlElement(name = "CarrierAircraftType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected CarrierAircraftTypeType carrierAircraftType;
    /**
     * When TRUE, indicates a Change of Gauge will take place between the current leg and that which immediately precedes it.
     * 
     */
    @XmlElement(name = "ChangeofGaugeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean changeofGaugeInd;
    /**
     * Uniquely identifies a leg within the context of one message.
     * 
     */
    @XmlElement(name = "DatedOperatingLegID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegID;
    /**
     * The action or process of leaving of a transport vehicle from any place or location.
     * 
     */
    @XmlElement(name = "Dep", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected TransportDepType dep;
    /**
     * Total distance between the beginning and end stations of a leg, measured by the great circle of the earth.
     * 
     */
    @XmlElement(name = "DistanceMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected MeasureType distanceMeasure;
    /**
     * Grouping of aircrafts with the same form, function and specification, currently flown, or soon to be flown. Possible types are defined in the IATA SSIM.
     * 
     */
    @XmlElement(name = "IATA_AircraftType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected IATAAircraftTypeType iataAircraftType;
    /**
     * Total time the aircraft remains on the Ground between this leg and the leg which immediately precedes it.
     * 
     */
    @XmlElement(name = "OnGroundDuration", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime onGroundDuration;

    /**
     * The action or process of arriving of a transport vehicle in any place or location.
     * 
     * @return
     *     possible object is
     *     {@link TransportArrivalType }
     *     
     */
    public TransportArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportArrivalType }
     *     
     * @see #getArrival()
     */
    public void setArrival(TransportArrivalType value) {
        this.arrival = value;
    }

    /**
     * Carrier defined internal grouping of aircrafts with the same form, function and specification.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAircraftTypeType }
     *     
     */
    public CarrierAircraftTypeType getCarrierAircraftType() {
        return carrierAircraftType;
    }

    /**
     * Sets the value of the carrierAircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAircraftTypeType }
     *     
     * @see #getCarrierAircraftType()
     */
    public void setCarrierAircraftType(CarrierAircraftTypeType value) {
        this.carrierAircraftType = value;
    }

    /**
     * When TRUE, indicates a Change of Gauge will take place between the current leg and that which immediately precedes it.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeofGaugeInd() {
        return changeofGaugeInd;
    }

    /**
     * Sets the value of the changeofGaugeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isChangeofGaugeInd()
     */
    public void setChangeofGaugeInd(Boolean value) {
        this.changeofGaugeInd = value;
    }

    /**
     * Uniquely identifies a leg within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedOperatingLegID() {
        return datedOperatingLegID;
    }

    /**
     * Sets the value of the datedOperatingLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDatedOperatingLegID()
     */
    public void setDatedOperatingLegID(String value) {
        this.datedOperatingLegID = value;
    }

    /**
     * The action or process of leaving of a transport vehicle from any place or location.
     * 
     * @return
     *     possible object is
     *     {@link TransportDepType }
     *     
     */
    public TransportDepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDepType }
     *     
     * @see #getDep()
     */
    public void setDep(TransportDepType value) {
        this.dep = value;
    }

    /**
     * Total distance between the beginning and end stations of a leg, measured by the great circle of the earth.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDistanceMeasure() {
        return distanceMeasure;
    }

    /**
     * Sets the value of the distanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getDistanceMeasure()
     */
    public void setDistanceMeasure(MeasureType value) {
        this.distanceMeasure = value;
    }

    /**
     * Grouping of aircrafts with the same form, function and specification, currently flown, or soon to be flown. Possible types are defined in the IATA SSIM.
     * 
     * @return
     *     possible object is
     *     {@link IATAAircraftTypeType }
     *     
     */
    public IATAAircraftTypeType getIATAAircraftType() {
        return iataAircraftType;
    }

    /**
     * Sets the value of the iataAircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAircraftTypeType }
     *     
     * @see #getIATAAircraftType()
     */
    public void setIATAAircraftType(IATAAircraftTypeType value) {
        this.iataAircraftType = value;
    }

    /**
     * Total time the aircraft remains on the Ground between this leg and the leg which immediately precedes it.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getOnGroundDuration() {
        return onGroundDuration;
    }

    /**
     * Sets the value of the onGroundDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOnGroundDuration()
     */
    public void setOnGroundDuration(ZonedDateTime value) {
        this.onGroundDuration = value;
    }

}
