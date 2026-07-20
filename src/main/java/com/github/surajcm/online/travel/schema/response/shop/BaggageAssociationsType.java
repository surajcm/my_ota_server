
package com.github.surajcm.online.travel.schema.response.shop;

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
 * <p>Java class for BaggageAssociationsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaggageAssociationsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type"/>
 *         <element name="BaggageFlightAssociations" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}BaggageFlightAssociationsType" minOccurs="0"/>
 *         <element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageAssociationsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "baggageAllowanceRefID",
    "baggageFlightAssociations",
    "paxRefID"
})
public class BaggageAssociationsType {

    /**
     * Reference to a Bag Allowance ID within this message.
     * 
     */
    @XmlElement(name = "BaggageAllowanceRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceRefID;
    @XmlElement(name = "BaggageFlightAssociations", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BaggageFlightAssociationsType baggageFlightAssociations;
    /**
     * Reference to a Passenger ID within this message.
     * 
     */
    @XmlElement(name = "PaxRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;

    /**
     * Reference to a Bag Allowance ID within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceRefID() {
        return baggageAllowanceRefID;
    }

    /**
     * Sets the value of the baggageAllowanceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaggageAllowanceRefID()
     */
    public void setBaggageAllowanceRefID(String value) {
        this.baggageAllowanceRefID = value;
    }

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
     * Reference to a Passenger ID within this message.
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

}
