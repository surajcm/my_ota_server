
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A measurable extent of a particular bag, such as length, or height.
 * 
 * <p>Java class for BagDimensionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BagDimensionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HeightMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}LengthMeasureType" minOccurs="0"/>
 *         <element name="LengthMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}LengthMeasureType" minOccurs="0"/>
 *         <element name="WidthMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}LengthMeasureType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagDimensionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "heightMeasure",
    "lengthMeasure",
    "widthMeasure"
})
public class BagDimensionType {

    /**
     * A measurement of someone or something from head to foot or from base to top. Measure. Unit. Code must be CMT (centimeters).
     * 
     */
    @XmlElement(name = "HeightMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected LengthMeasureType heightMeasure;
    /**
     * A measurement or extent of something from end to end; the greater of two or the greatest of three dimensions of an object. Measure. Unit. Code must be CMT (centimeters).
     * 
     */
    @XmlElement(name = "LengthMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected LengthMeasureType lengthMeasure;
    /**
     * A measurement or extent of the bag from side to side; the lesser of two or the least of three dimensions of the bag. Unit must be CMT (centimeters).
     * 
     */
    @XmlElement(name = "WidthMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected LengthMeasureType widthMeasure;

    /**
     * A measurement of someone or something from head to foot or from base to top. Measure. Unit. Code must be CMT (centimeters).
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    public LengthMeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     * @see #getHeightMeasure()
     */
    public void setHeightMeasure(LengthMeasureType value) {
        this.heightMeasure = value;
    }

    /**
     * A measurement or extent of something from end to end; the greater of two or the greatest of three dimensions of an object. Measure. Unit. Code must be CMT (centimeters).
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    public LengthMeasureType getLengthMeasure() {
        return lengthMeasure;
    }

    /**
     * Sets the value of the lengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     * @see #getLengthMeasure()
     */
    public void setLengthMeasure(LengthMeasureType value) {
        this.lengthMeasure = value;
    }

    /**
     * A measurement or extent of the bag from side to side; the lesser of two or the least of three dimensions of the bag. Unit must be CMT (centimeters).
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    public LengthMeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Sets the value of the widthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     * @see #getWidthMeasure()
     */
    public void setWidthMeasure(LengthMeasureType value) {
        this.widthMeasure = value;
    }

}
