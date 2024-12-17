
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Choice of Affinity, Origin Destination, or Journey flight information for this shopping request.
 * 
 * <p>Java class for FlightRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AffinityShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AffinityShoppingCriteriaType"/>
 *         <element name="OriginDestCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OriginDestCriteriaType" maxOccurs="unbounded"/>
 *         <element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ShoppingResponseType"/>
 *         <element name="SpecificOriginDestCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OriginDestType" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRequestType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "affinityShoppingCriteria",
    "originDestCriteria",
    "shoppingResponse",
    "specificOriginDestCriteria"
})
public class FlightRequestType {

    /**
     * Affinity search includes a wide range of criteria including generic origin/destination information, trip time periods, as well as travel budget.
     * 
     */
    @XmlElement(name = "AffinityShoppingCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AffinityShoppingCriteriaType affinityShoppingCriteria;
    /**
     * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
     * 
     */
    @XmlElement(name = "OriginDestCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<OriginDestCriteriaType> originDestCriteria;
    /**
     * Shopping session (message response) ID.
     * 
     */
    @XmlElement(name = "ShoppingResponse", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected ShoppingResponseType shoppingResponse;
    /**
     * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
     * 
     */
    @XmlElement(name = "SpecificOriginDestCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<OriginDestType> specificOriginDestCriteria;

    /**
     * Affinity search includes a wide range of criteria including generic origin/destination information, trip time periods, as well as travel budget.
     * 
     * @return
     *     possible object is
     *     {@link AffinityShoppingCriteriaType }
     *     
     */
    public AffinityShoppingCriteriaType getAffinityShoppingCriteria() {
        return affinityShoppingCriteria;
    }

    /**
     * Sets the value of the affinityShoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityShoppingCriteriaType }
     *     
     * @see #getAffinityShoppingCriteria()
     */
    public void setAffinityShoppingCriteria(AffinityShoppingCriteriaType value) {
        this.affinityShoppingCriteria = value;
    }

    /**
     * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
     * 
     * Gets the value of the originDestCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOriginDestCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the originDestCriteria property.
     */
    public List<OriginDestCriteriaType> getOriginDestCriteria() {
        if (originDestCriteria == null) {
            originDestCriteria = new ArrayList<>();
        }
        return this.originDestCriteria;
    }

    /**
     * Shopping session (message response) ID.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     * @see #getShoppingResponse()
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
    }

    /**
     * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
     * 
     * Gets the value of the specificOriginDestCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificOriginDestCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpecificOriginDestCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestType }
     * </p>
     * 
     * 
     * @return
     *     The value of the specificOriginDestCriteria property.
     */
    public List<OriginDestType> getSpecificOriginDestCriteria() {
        if (specificOriginDestCriteria == null) {
            specificOriginDestCriteria = new ArrayList<>();
        }
        return this.specificOriginDestCriteria;
    }

}
