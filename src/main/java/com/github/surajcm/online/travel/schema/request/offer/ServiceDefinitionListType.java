
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Service Definition data list definition.
 * 
 * <p>Java class for ServiceDefinitionListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceDefinitionListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceDefinition" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceDefinitionType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "serviceDefinition"
})
public class ServiceDefinitionListType {

    /**
     * Description and characteristics of a non-flight product or service that can be separately sold and delivered. E.g. bag, seat, meal on a flight.
     * 
     */
    @XmlElement(name = "ServiceDefinition", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<ServiceDefinitionType> serviceDefinition;

    /**
     * Description and characteristics of a non-flight product or service that can be separately sold and delivered. E.g. bag, seat, meal on a flight.
     * 
     * Gets the value of the serviceDefinition property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDefinition property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDefinitionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceDefinition property.
     */
    public List<ServiceDefinitionType> getServiceDefinition() {
        if (serviceDefinition == null) {
            serviceDefinition = new ArrayList<>();
        }
        return this.serviceDefinition;
    }

}
