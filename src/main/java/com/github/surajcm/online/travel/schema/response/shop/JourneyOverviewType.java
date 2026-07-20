
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
 * Summary of proposed Journey information in the context of this specific Offer.
 * 
 * <p>Java class for JourneyOverviewType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="JourneyOverviewType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="JourneyPriceClass" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}JourneyPriceClassType" maxOccurs="unbounded"/>
 *         <element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyOverviewType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "journeyPriceClass",
    "priceClassRefID"
})
public class JourneyOverviewType {

    /**
     * Price class information per Journey.
     * 
     */
    @XmlElement(name = "JourneyPriceClass", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected List<JourneyPriceClassType> journeyPriceClass;
    /**
     * Itinerary level Price Class ref
     * 
     */
    @XmlElement(name = "PriceClassRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassRefID;

    /**
     * Price class information per Journey.
     * 
     * Gets the value of the journeyPriceClass property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyPriceClass property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getJourneyPriceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyPriceClassType }
     * </p>
     * 
     * 
     * @return
     *     The value of the journeyPriceClass property.
     */
    public List<JourneyPriceClassType> getJourneyPriceClass() {
        if (journeyPriceClass == null) {
            journeyPriceClass = new ArrayList<>();
        }
        return this.journeyPriceClass;
    }

    /**
     * Itinerary level Price Class ref
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClassRefID() {
        return priceClassRefID;
    }

    /**
     * Sets the value of the priceClassRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPriceClassRefID()
     */
    public void setPriceClassRefID(String value) {
        this.priceClassRefID = value;
    }

}
