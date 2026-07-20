
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Seat Profile data list definition.
 * 
 * <p>Java class for SeatProfileListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeatProfileListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SeatProfile" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatProfileType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatProfileListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "seatProfile"
})
public class SeatProfileListType {

    /**
     * Airline defined characteristics shared by a group of seats.
     * 
     */
    @XmlElement(name = "SeatProfile", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<SeatProfileType> seatProfile;

    /**
     * Airline defined characteristics shared by a group of seats.
     * 
     * Gets the value of the seatProfile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSeatProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatProfileType }
     * </p>
     * 
     * 
     * @return
     *     The value of the seatProfile property.
     */
    public List<SeatProfileType> getSeatProfile() {
        if (seatProfile == null) {
            seatProfile = new ArrayList<>();
        }
        return this.seatProfile;
    }

}
