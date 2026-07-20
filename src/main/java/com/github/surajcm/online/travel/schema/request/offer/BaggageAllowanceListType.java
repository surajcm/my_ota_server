
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Baggage allowance data list definition
 * 
 * <p>Java class for BaggageAllowanceListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaggageAllowanceListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BaggageAllowanceType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageAllowanceListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "baggageAllowance"
})
public class BaggageAllowanceListType {

    /**
     * The amount of checked or carry-on luggage the airline will allow per passenger.
     * 
     */
    @XmlElement(name = "BaggageAllowance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<BaggageAllowanceType> baggageAllowance;

    /**
     * The amount of checked or carry-on luggage the airline will allow per passenger.
     * 
     * Gets the value of the baggageAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaggageAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageAllowanceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the baggageAllowance property.
     */
    public List<BaggageAllowanceType> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<>();
        }
        return this.baggageAllowance;
    }

}
