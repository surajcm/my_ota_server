
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
 * 
 * <p>Java class for ServiceDefinitionRefType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceDefinitionRefType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageFlightAssociations" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}BaggageFlightAssociationsType" minOccurs="0"/>
 *         <element name="ServiceDefinitionRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionRefType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "baggageFlightAssociations",
    "serviceDefinitionRefID"
})
public class ServiceDefinitionRefType {

    @XmlElement(name = "BaggageFlightAssociations", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BaggageFlightAssociationsType baggageFlightAssociations;
    /**
     * References a Service Definition ID within this message.
     * 
     */
    @XmlElement(name = "ServiceDefinitionRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDefinitionRefID;

    /**
     * Gets the value of the baggageFlightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageFlightAssociationsType }
     *     
     */
    public BaggageFlightAssociationsType getBaggageFlightAssociations() {
        return baggageFlightAssociations;
    }

    /**
     * Sets the value of the baggageFlightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageFlightAssociationsType }
     *     
     */
    public void setBaggageFlightAssociations(BaggageFlightAssociationsType value) {
        this.baggageFlightAssociations = value;
    }

    /**
     * References a Service Definition ID within this message.
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
