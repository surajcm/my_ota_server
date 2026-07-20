
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
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
 * Additional information supplied by the Airline for the current Itinerary to advise the Seller that additional options could be available (if the Seller changes the request) to add Stop Overs within the itinerary.
 * 
 * <p>Java class for StopOverRestrictionsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StopOverRestrictionsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AvailInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="ChargeableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="MaximumStopOversPermittedQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}QtyType" minOccurs="0"/>
 *         <element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="StopOverLocation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}StopOverLocationType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopOverRestrictionsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "availInd",
    "chargeableInd",
    "maximumStopOversPermittedQty",
    "paxRefID",
    "stopOverLocation"
})
public class StopOverRestrictionsType {

    /**
     * Boolean to signify that Stop Overs are possible, and could be searched for on this itinerary.
     * 
     */
    @XmlElement(name = "AvailInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean availInd;
    /**
     * An indicator to identify if the Stopover has an associated fee.
     * 
     */
    @XmlElement(name = "ChargeableInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean chargeableInd;
    /**
     * If Stop overs are available, this element places an optional limit to the number of stopovers that can be added to the itinerary.
     * 
     */
    @XmlElement(name = "MaximumStopOversPermittedQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal maximumStopOversPermittedQty;
    /**
     * Used to store a ref to the passenger.
     * 
     */
    @XmlElement(name = "PaxRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    /**
     * Container to describe where a Stop Over can be added into an Itinerary. The Stop Over location is tied to the Arrival Port of the referenced Pax Segment (or Pax Leg) referenced and contains the maximum time permitted at that stop.
     * 
     */
    @XmlElement(name = "StopOverLocation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<StopOverLocationType> stopOverLocation;

    /**
     * Boolean to signify that Stop Overs are possible, and could be searched for on this itinerary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailInd() {
        return availInd;
    }

    /**
     * Sets the value of the availInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAvailInd()
     */
    public void setAvailInd(Boolean value) {
        this.availInd = value;
    }

    /**
     * An indicator to identify if the Stopover has an associated fee.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChargeableInd() {
        return chargeableInd;
    }

    /**
     * Sets the value of the chargeableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isChargeableInd()
     */
    public void setChargeableInd(Boolean value) {
        this.chargeableInd = value;
    }

    /**
     * If Stop overs are available, this element places an optional limit to the number of stopovers that can be added to the itinerary.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumStopOversPermittedQty() {
        return maximumStopOversPermittedQty;
    }

    /**
     * Sets the value of the maximumStopOversPermittedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaximumStopOversPermittedQty()
     */
    public void setMaximumStopOversPermittedQty(BigDecimal value) {
        this.maximumStopOversPermittedQty = value;
    }

    /**
     * Used to store a ref to the passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxRefID()
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Container to describe where a Stop Over can be added into an Itinerary. The Stop Over location is tied to the Arrival Port of the referenced Pax Segment (or Pax Leg) referenced and contains the maximum time permitted at that stop.
     * 
     * Gets the value of the stopOverLocation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopOverLocation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStopOverLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopOverLocationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the stopOverLocation property.
     */
    public List<StopOverLocationType> getStopOverLocation() {
        if (stopOverLocation == null) {
            stopOverLocation = new ArrayList<>();
        }
        return this.stopOverLocation;
    }

}
