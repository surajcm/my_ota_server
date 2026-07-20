
package com.github.surajcm.online.travel.schema.response.offer;

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
 *         <element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" maxOccurs="unbounded"/>
 *         <element name="SeatAssignment" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}SeatAssignmentType"/>
 *         <element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ServiceDefinitionRefType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAssociationsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "paxJourneyRefID",
    "seatAssignment",
    "serviceDefinitionRef"
})
public class ServiceAssociationsType {

    /**
     * Reference to one Journey in the Datalists that are being sold as part of this OfferItem/Service.
     * 
     */
    @XmlElement(name = "PaxJourneyRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxJourneyRefID;
    /**
     * The Seat Location selected by the Passenger (via SeatAvailability) or assigned tot he Passenger by the Airline for a given segment. When used, only a single Passenger must be referenced within the Service.
     * 
     */
    @XmlElement(name = "SeatAssignment", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected SeatAssignmentType seatAssignment;
    /**
     * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
     * 
     */
    @XmlElement(name = "ServiceDefinitionRef", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected ServiceDefinitionRefType serviceDefinitionRef;

    /**
     * Reference to one Journey in the Datalists that are being sold as part of this OfferItem/Service.
     * 
     * Gets the value of the paxJourneyRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourneyRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxJourneyRefID().add(newItem);
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
     *     The value of the paxJourneyRefID property.
     */
    public List<String> getPaxJourneyRefID() {
        if (paxJourneyRefID == null) {
            paxJourneyRefID = new ArrayList<>();
        }
        return this.paxJourneyRefID;
    }

    /**
     * The Seat Location selected by the Passenger (via SeatAvailability) or assigned tot he Passenger by the Airline for a given segment. When used, only a single Passenger must be referenced within the Service.
     * 
     * @return
     *     possible object is
     *     {@link SeatAssignmentType }
     *     
     */
    public SeatAssignmentType getSeatAssignment() {
        return seatAssignment;
    }

    /**
     * Sets the value of the seatAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAssignmentType }
     *     
     * @see #getSeatAssignment()
     */
    public void setSeatAssignment(SeatAssignmentType value) {
        this.seatAssignment = value;
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
