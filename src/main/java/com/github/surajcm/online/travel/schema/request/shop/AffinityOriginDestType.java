
package com.github.surajcm.online.travel.schema.request.shop;

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
 * Origin and Destination information for affinity shopping requests.
 * 
 * <p>Java class for AffinityOriginDestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AffinityOriginDestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AffinityArrivalRequest" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AffinityArrivalRequestType" minOccurs="0"/>
 *         <element name="AffinityDepRequest" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AffinityDepRequestType" minOccurs="0"/>
 *         <element name="ConnectionPrefRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="PreferredCabinType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityOriginDestType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "affinityArrivalRequest",
    "affinityDepRequest",
    "connectionPrefRefID",
    "preferredCabinType"
})
public class AffinityOriginDestType {

    /**
     * Arrival information for affinity shopping requests.
     * 
     */
    @XmlElement(name = "AffinityArrivalRequest", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AffinityArrivalRequestType affinityArrivalRequest;
    /**
     * Departure information for affinity shopping requests.
     * 
     */
    @XmlElement(name = "AffinityDepRequest", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AffinityDepRequestType affinityDepRequest;
    /**
     * Reference to a transfer preference ID.
     * 
     */
    @XmlElement(name = "ConnectionPrefRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionPrefRefID;
    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "PreferredCabinType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<CabinTypeType> preferredCabinType;

    /**
     * Arrival information for affinity shopping requests.
     * 
     * @return
     *     possible object is
     *     {@link AffinityArrivalRequestType }
     *     
     */
    public AffinityArrivalRequestType getAffinityArrivalRequest() {
        return affinityArrivalRequest;
    }

    /**
     * Sets the value of the affinityArrivalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityArrivalRequestType }
     *     
     * @see #getAffinityArrivalRequest()
     */
    public void setAffinityArrivalRequest(AffinityArrivalRequestType value) {
        this.affinityArrivalRequest = value;
    }

    /**
     * Departure information for affinity shopping requests.
     * 
     * @return
     *     possible object is
     *     {@link AffinityDepRequestType }
     *     
     */
    public AffinityDepRequestType getAffinityDepRequest() {
        return affinityDepRequest;
    }

    /**
     * Sets the value of the affinityDepRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityDepRequestType }
     *     
     * @see #getAffinityDepRequest()
     */
    public void setAffinityDepRequest(AffinityDepRequestType value) {
        this.affinityDepRequest = value;
    }

    /**
     * Reference to a transfer preference ID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPrefRefID() {
        return connectionPrefRefID;
    }

    /**
     * Sets the value of the connectionPrefRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConnectionPrefRefID()
     */
    public void setConnectionPrefRefID(String value) {
        this.connectionPrefRefID = value;
    }

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     * Gets the value of the preferredCabinType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredCabinType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreferredCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the preferredCabinType property.
     */
    public List<CabinTypeType> getPreferredCabinType() {
        if (preferredCabinType == null) {
            preferredCabinType = new ArrayList<>();
        }
        return this.preferredCabinType;
    }

}
