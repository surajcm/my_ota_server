
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
 * Refers to the Passengers, Price class or segments for which this offer item is eligible.
 * 
 * <p>Java class for EligibilityType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EligibilityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FlightAssociations" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}FlightAssociationsType" minOccurs="0"/>
 *         <element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibilityType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "flightAssociations",
    "paxRefID",
    "priceClassRefID"
})
public class EligibilityType {

    /**
     * Eligiibility of this offer item to the following segments or journeys.
     * 
     */
    @XmlElement(name = "FlightAssociations", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected FlightAssociationsType flightAssociations;
    /**
     * Reference to the passengers who are elibigle for this Offer Item
     * 
     */
    @XmlElement(name = "PaxRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    /**
     * Reference to the Price Class for which this Offer Item can be provided.
     * 
     */
    @XmlElement(name = "PriceClassRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> priceClassRefID;

    /**
     * Eligiibility of this offer item to the following segments or journeys.
     * 
     * @return
     *     possible object is
     *     {@link FlightAssociationsType }
     *     
     */
    public FlightAssociationsType getFlightAssociations() {
        return flightAssociations;
    }

    /**
     * Sets the value of the flightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightAssociationsType }
     *     
     * @see #getFlightAssociations()
     */
    public void setFlightAssociations(FlightAssociationsType value) {
        this.flightAssociations = value;
    }

    /**
     * Reference to the passengers who are elibigle for this Offer Item
     * 
     * Gets the value of the paxRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxRefID().add(newItem);
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
     *     The value of the paxRefID property.
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<>();
        }
        return this.paxRefID;
    }

    /**
     * Reference to the Price Class for which this Offer Item can be provided.
     * 
     * Gets the value of the priceClassRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceClassRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceClassRefID().add(newItem);
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
     *     The value of the priceClassRefID property.
     */
    public List<String> getPriceClassRefID() {
        if (priceClassRefID == null) {
            priceClassRefID = new ArrayList<>();
        }
        return this.priceClassRefID;
    }

}
