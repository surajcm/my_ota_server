
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
 * Choice to determine if the information of this ServiceDefinition needs to be extended with specific Bag or Seat characteristics, or whether the ServiceDefinition is used as a bundle of further ServiceDefinitions.
 * 
 * <p>Java class for ServiceDefinitionAssociationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceDefinitionAssociationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type"/>
 *         <element name="SeatProfileRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" maxOccurs="unbounded"/>
 *         <element name="ServiceBundle" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ServiceBundleType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionAssociationType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "baggageAllowanceRefID",
    "seatProfileRefID",
    "serviceBundle"
})
public class ServiceDefinitionAssociationType {

    /**
     * Reference to a Baggage Allowance ID within this message.
     * 
     */
    @XmlElement(name = "BaggageAllowanceRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceRefID;
    /**
     * Reference to a Seat Profile ID within this message.
     * 
     */
    @XmlElement(name = "SeatProfileRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> seatProfileRefID;
    /**
     * Where several services are offered for sale as one service.
     * 
     */
    @XmlElement(name = "ServiceBundle", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected ServiceBundleType serviceBundle;

    /**
     * Reference to a Baggage Allowance ID within this message.
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
     * Reference to a Seat Profile ID within this message.
     * 
     * Gets the value of the seatProfileRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfileRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatProfileRefID().add(newItem);
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
     *     The value of the seatProfileRefID property.
     */
    public List<String> getSeatProfileRefID() {
        if (seatProfileRefID == null) {
            seatProfileRefID = new ArrayList<>();
        }
        return this.seatProfileRefID;
    }

    /**
     * Where several services are offered for sale as one service.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundleType }
     *     
     */
    public ServiceBundleType getServiceBundle() {
        return serviceBundle;
    }

    /**
     * Sets the value of the serviceBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundleType }
     *     
     * @see #getServiceBundle()
     */
    public void setServiceBundle(ServiceBundleType value) {
        this.serviceBundle = value;
    }

}
