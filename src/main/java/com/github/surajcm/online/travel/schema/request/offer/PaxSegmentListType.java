
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Segment data list definition.
 * 
 * <p>Java class for PaxSegmentListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxSegmentListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaxSegment" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaxSegmentType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "paxSegment"
})
public class PaxSegmentListType {

    /**
     * Transportation of a passenger on a Dated Operating Segment.
     * 
     */
    @XmlElement(name = "PaxSegment", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<PaxSegmentType> paxSegment;

    /**
     * Transportation of a passenger on a Dated Operating Segment.
     * 
     * Gets the value of the paxSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paxSegment property.
     */
    public List<PaxSegmentType> getPaxSegment() {
        if (paxSegment == null) {
            paxSegment = new ArrayList<>();
        }
        return this.paxSegment;
    }

}
