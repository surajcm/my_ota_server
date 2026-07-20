
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A piece of luggage associated with a passenger, packed for traveling, and necessary or appropriate in connection with a journey.
 * 
 * <p>Java class for BagType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BagType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BagDimension" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BagDimensionType" minOccurs="0"/>
 *         <element name="BagTag" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BagTagType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "bagDimension",
    "bagTag"
})
public class BagType {

    /**
     * A measurable extent of a particular bag, such as length, or height.
     * 
     */
    @XmlElement(name = "BagDimension", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BagDimensionType bagDimension;
    /**
     * A small piece of paper, fabric, plastic or similar material attached to an bag and giving information about it.
     * 
     */
    @XmlElement(name = "BagTag", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BagTagType bagTag;

    /**
     * A measurable extent of a particular bag, such as length, or height.
     * 
     * @return
     *     possible object is
     *     {@link BagDimensionType }
     *     
     */
    public BagDimensionType getBagDimension() {
        return bagDimension;
    }

    /**
     * Sets the value of the bagDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDimensionType }
     *     
     * @see #getBagDimension()
     */
    public void setBagDimension(BagDimensionType value) {
        this.bagDimension = value;
    }

    /**
     * A small piece of paper, fabric, plastic or similar material attached to an bag and giving information about it.
     * 
     * @return
     *     possible object is
     *     {@link BagTagType }
     *     
     */
    public BagTagType getBagTag() {
        return bagTag;
    }

    /**
     * Sets the value of the bagTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagTagType }
     *     
     * @see #getBagTag()
     */
    public void setBagTag(BagTagType value) {
        this.bagTag = value;
    }

}
