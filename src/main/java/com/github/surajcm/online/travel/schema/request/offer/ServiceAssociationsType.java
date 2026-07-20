
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * References to the details of this Service. May include either Passenger Journeys, a Service Definition, or a Selected Seat.
 * 
 * <p>Java class for ServiceAssociationsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceAssociationsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="SelectedSeat" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatOnLegType"/>
 *         <element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceDefinitionRefType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAssociationsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "paxSegmentRefID",
    "selectedSeat",
    "serviceDefinitionRef"
})
public class ServiceAssociationsType {

    /**
     * Reference to a Passenger Segment ID within this message.
     * 
     */
    @XmlElement(name = "PaxSegmentRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentRefID;
    /**
     * A sitting place for a passenger or crew in a cabin compartment on a Dated Operating Leg.
     * 
     */
    @XmlElement(name = "SelectedSeat", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SeatOnLegType selectedSeat;
    /**
     * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
     * 
     */
    @XmlElement(name = "ServiceDefinitionRef", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ServiceDefinitionRefType serviceDefinitionRef;

    /**
     * Reference to a Passenger Segment ID within this message.
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
     * A sitting place for a passenger or crew in a cabin compartment on a Dated Operating Leg.
     * 
     * @return
     *     possible object is
     *     {@link SeatOnLegType }
     *     
     */
    public SeatOnLegType getSelectedSeat() {
        return selectedSeat;
    }

    /**
     * Sets the value of the selectedSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatOnLegType }
     *     
     * @see #getSelectedSeat()
     */
    public void setSelectedSeat(SeatOnLegType value) {
        this.selectedSeat = value;
    }

    /**
     * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionRefType }
     *     
     */
    public ServiceDefinitionRefType getServiceDefinitionRef() {
        return serviceDefinitionRef;
    }

    /**
     * Sets the value of the serviceDefinitionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionRefType }
     *     
     * @see #getServiceDefinitionRef()
     */
    public void setServiceDefinitionRef(ServiceDefinitionRefType value) {
        this.serviceDefinitionRef = value;
    }

}
