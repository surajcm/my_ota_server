
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Origin Destination data list definition.
 * 
 * <p>Java class for OriginDestListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OriginDestListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OriginDest" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OriginDestType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "originDest"
})
public class OriginDestListType {

    /**
     * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
     * 
     */
    @XmlElement(name = "OriginDest", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected List<OriginDestType> originDest;

    /**
     * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
     * 
     * Gets the value of the originDest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOriginDest().add(newItem);
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
     *     The value of the originDest property.
     */
    public List<OriginDestType> getOriginDest() {
        if (originDest == null) {
            originDest = new ArrayList<>();
        }
        return this.originDest;
    }

}
