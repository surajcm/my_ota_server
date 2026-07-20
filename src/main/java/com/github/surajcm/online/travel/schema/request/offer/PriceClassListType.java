
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Price Class data list definition.
 * 
 * <p>Java class for PriceClassListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceClassListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PriceClass" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PriceClassType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceClassListType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "priceClass"
})
public class PriceClassListType {

    /**
     * A price point within a particular Cabin Type (sometimes referred to as 'Fare Families').
     * 
     */
    @XmlElement(name = "PriceClass", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<PriceClassType> priceClass;

    /**
     * A price point within a particular Cabin Type (sometimes referred to as 'Fare Families').
     * 
     * Gets the value of the priceClass property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceClass property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceClassType }
     * </p>
     * 
     * 
     * @return
     *     The value of the priceClass property.
     */
    public List<PriceClassType> getPriceClass() {
        if (priceClass == null) {
            priceClass = new ArrayList<>();
        }
        return this.priceClass;
    }

}
