
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Total segment travel time preferences.
 * 
 * <p>Java class for SegmentDurationCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SegmentDurationCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaximumTimeMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         <element name="PrefCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDurationCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "maximumTimeMeasure",
    "prefCode"
})
public class SegmentDurationCriteriaType {

    /**
     * Preferred maximum time for any Segment.
     * 
     */
    @XmlElement(name = "MaximumTimeMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MeasureType maximumTimeMeasure;
    /**
     * Level of preference requested. Examples: Preferred, Required, or Exclude.
     * 
     */
    @XmlElement(name = "PrefCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String prefCode;

    /**
     * Preferred maximum time for any Segment.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumTimeMeasure() {
        return maximumTimeMeasure;
    }

    /**
     * Sets the value of the maximumTimeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getMaximumTimeMeasure()
     */
    public void setMaximumTimeMeasure(MeasureType value) {
        this.maximumTimeMeasure = value;
    }

    /**
     * Level of preference requested. Examples: Preferred, Required, or Exclude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefCode() {
        return prefCode;
    }

    /**
     * Sets the value of the prefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrefCode()
     */
    public void setPrefCode(String value) {
        this.prefCode = value;
    }

}