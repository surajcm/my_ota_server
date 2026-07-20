
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Seat Location selected by the Passenger (via SeatAvailability) or assigned tot he Passenger by the Airline for a given segment. When used, only a single Passenger must be referenced within the Service.
 * 
 * <p>Java class for SeatAssignmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatAssignmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatedOperatingLegRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type"/>
 *         <element name="Seat" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}SeatType"/>
 *         <element name="ServiceDefinitionRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatAssignmentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "datedOperatingLegRefID",
    "seat",
    "serviceDefinitionRefID"
})
public class SeatAssignmentType {

    /**
     * Reference to a Dated Operating Leg ID within this message.
     * 
     */
    @XmlElement(name = "DatedOperatingLegRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegRefID;
    /**
     * A sitting place for a passenger located in the cabin.
     * 
     */
    @XmlElement(name = "Seat", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected SeatType seat;
    /**
     * Reference to a Service Definition ID within this message.
     * 
     */
    @XmlElement(name = "ServiceDefinitionRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDefinitionRefID;

    /**
     * Reference to a Dated Operating Leg ID within this message.
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
     * A sitting place for a passenger located in the cabin.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeat() {
        return seat;
    }

    /**
     * Sets the value of the seat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     * @see #getSeat()
     */
    public void setSeat(SeatType value) {
        this.seat = value;
    }

    /**
     * Reference to a Service Definition ID within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionRefID() {
        return serviceDefinitionRefID;
    }

    /**
     * Sets the value of the serviceDefinitionRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceDefinitionRefID()
     */
    public void setServiceDefinitionRefID(String value) {
        this.serviceDefinitionRefID = value;
    }

}
