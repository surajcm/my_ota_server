
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Journey data list definition.
 * 
 * <p>Java class for PaxJourneyListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxJourneyListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaxJourneyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxJourneyListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "paxJourney"
})
public class PaxJourneyListType {

    /**
     * A collection of segments which satisfies transportation of a passenger for a given origin and destination.
     * 
     */
    @XmlElement(name = "PaxJourney", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<PaxJourneyType> paxJourney;

    /**
     * A collection of segments which satisfies transportation of a passenger for a given origin and destination.
     * 
     * Gets the value of the paxJourney property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourney property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxJourneyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paxJourney property.
     */
    public List<PaxJourneyType> getPaxJourney() {
        if (paxJourney == null) {
            paxJourney = new ArrayList<>();
        }
        return this.paxJourney;
    }

}
