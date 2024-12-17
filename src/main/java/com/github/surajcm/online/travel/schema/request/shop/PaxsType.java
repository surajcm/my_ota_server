
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Passenger and Passenger Group information.
 * 
 * <p>Java class for PaxsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pax" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaxType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "pax"
})
public class PaxsType {

    /**
     * Any person except members of the crew carried or to be carried with the consent of the carrier, on board of any transport vehicle such as aircraft, train, bus, ship. Holds the attributes specific to a one booking, from shopping to fulfillment.
     * 
     */
    @XmlElement(name = "Pax", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected List<PaxType> pax;

    /**
     * Any person except members of the crew carried or to be carried with the consent of the carrier, on board of any transport vehicle such as aircraft, train, bus, ship. Holds the attributes specific to a one booking, from shopping to fulfillment.
     * 
     * Gets the value of the pax property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pax property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxType }
     * </p>
     * 
     * 
     * @return
     *     The value of the pax property.
     */
    public List<PaxType> getPax() {
        if (pax == null) {
            pax = new ArrayList<>();
        }
        return this.pax;
    }

}
