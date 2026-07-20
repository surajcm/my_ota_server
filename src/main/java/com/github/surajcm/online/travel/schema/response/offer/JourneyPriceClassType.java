
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Price class information per Journey.
 * 
 * <p>Java class for JourneyPriceClassType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="JourneyPriceClassType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type"/>
 *         <element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyPriceClassType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "paxJourneyRefID",
    "priceClassRefID"
})
public class JourneyPriceClassType {

    /**
     * Reference to a Passenger Journey within the context of this message.
     * 
     */
    @XmlElement(name = "PaxJourneyRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxJourneyRefID;
    /**
     * Itinerary level Price Class ref
     * 
     */
    @XmlElement(name = "PriceClassRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassRefID;

    /**
     * Reference to a Passenger Journey within the context of this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxJourneyRefID() {
        return paxJourneyRefID;
    }

    /**
     * Sets the value of the paxJourneyRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxJourneyRefID()
     */
    public void setPaxJourneyRefID(String value) {
        this.paxJourneyRefID = value;
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
