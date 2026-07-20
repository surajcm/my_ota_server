
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Baggage disclosure data list definition.
 * 
 * <p>Java class for BaggageDisclosureListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaggageDisclosureListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageDisclosure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BaggageDisclosureType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDisclosureListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "baggageDisclosure"
})
public class BaggageDisclosureListType {

    /**
     * Disclosure information specifically related to baggage.
     * 
     */
    @XmlElement(name = "BaggageDisclosure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<BaggageDisclosureType> baggageDisclosure;

    /**
     * Disclosure information specifically related to baggage.
     * 
     * Gets the value of the baggageDisclosure property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDisclosure property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaggageDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageDisclosureType }
     * </p>
     * 
     * 
     * @return
     *     The value of the baggageDisclosure property.
     */
    public List<BaggageDisclosureType> getBaggageDisclosure() {
        if (baggageDisclosure == null) {
            baggageDisclosure = new ArrayList<>();
        }
        return this.baggageDisclosure;
    }

}
