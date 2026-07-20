
package com.github.surajcm.online.travel.schema.response.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Penalty data list definition.
 * 
 * <p>Java class for PenaltyListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PenaltyListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PenaltyType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "penalty"
})
public class PenaltyListType {

    /**
     * Information related to a punishment imposed for breaking a law, rule, or contract.
     * 
     */
    @XmlElement(name = "Penalty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected List<PenaltyType> penalty;

    /**
     * Information related to a punishment imposed for breaking a law, rule, or contract.
     * 
     * Gets the value of the penalty property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalty property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the penalty property.
     */
    public List<PenaltyType> getPenalty() {
        if (penalty == null) {
            penalty = new ArrayList<>();
        }
        return this.penalty;
    }

}
