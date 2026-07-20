
package com.github.surajcm.online.travel.schema.request.offer;

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
 * A set of services offered for sale as a single service.
 * 
 * <p>Java class for ServiceBundleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceBundleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaximumServiceQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}QtyType" minOccurs="0"/>
 *         <element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceDefinitionRefType" maxOccurs="unbounded"/>
 *         <element name="ServiceDefinitionRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBundleType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "maximumServiceQty",
    "serviceDefinitionRef",
    "serviceDefinitionRefID"
})
public class ServiceBundleType {

    /**
     * The maximum number of service definitions that may be selected from those in the bundle.
     * 
     */
    @XmlElement(name = "MaximumServiceQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BigDecimal maximumServiceQty;
    /**
     * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
     * 
     */
    @XmlElement(name = "ServiceDefinitionRef", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<ServiceDefinitionRefType> serviceDefinitionRef;
    /**
     * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
     * 
     */
    @XmlElement(name = "ServiceDefinitionRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> serviceDefinitionRefID;

    /**
     * The maximum number of service definitions that may be selected from those in the bundle.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumServiceQty() {
        return maximumServiceQty;
    }

    /**
     * Sets the value of the maximumServiceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaximumServiceQty()
     */
    public void setMaximumServiceQty(BigDecimal value) {
        this.maximumServiceQty = value;
    }

    /**
     * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
     * 
     * Gets the value of the serviceDefinitionRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDefinitionRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceDefinitionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDefinitionRefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceDefinitionRef property.
     */
    public List<ServiceDefinitionRefType> getServiceDefinitionRef() {
        if (serviceDefinitionRef == null) {
            serviceDefinitionRef = new ArrayList<>();
        }
        return this.serviceDefinitionRef;
    }

    /**
     * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
     * 
     * Gets the value of the serviceDefinitionRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDefinitionRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceDefinitionRefID().add(newItem);
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
     *     The value of the serviceDefinitionRefID property.
     */
    public List<String> getServiceDefinitionRefID() {
        if (serviceDefinitionRefID == null) {
            serviceDefinitionRefID = new ArrayList<>();
        }
        return this.serviceDefinitionRefID;
    }

}
