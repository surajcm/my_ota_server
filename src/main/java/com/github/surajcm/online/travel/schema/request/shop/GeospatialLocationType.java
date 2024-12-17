
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A location with a spatial attribute, probably on the surface of the earth. For example: Longitude and Latitude
 * 
 * <p>Java class for GeospatialLocationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeospatialLocationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NaturalAreaGeocode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="PointElevationNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="PointLatitudeNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="PointLongitudeNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeospatialLocationType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "naturalAreaGeocode",
    "pointElevationNumber",
    "pointLatitudeNumber",
    "pointLongitudeNumber"
})
public class GeospatialLocationType {

    /**
     * Natural Area Geocode as defined by NAC Geographic Products Inc. Ex: 8KDB PGFD
     * 
     */
    @XmlElement(name = "NaturalAreaGeocode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String naturalAreaGeocode;
    /**
     * The number of the spatial location point elevation.
     * 
     */
    @XmlElement(name = "PointElevationNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal pointElevationNumber;
    /**
     * The number of the spatial location point latitude.
     * 
     */
    @XmlElement(name = "PointLatitudeNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal pointLatitudeNumber;
    /**
     * The number of the spatial location point longitude.
     * 
     */
    @XmlElement(name = "PointLongitudeNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal pointLongitudeNumber;

    /**
     * Natural Area Geocode as defined by NAC Geographic Products Inc. Ex: 8KDB PGFD
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalAreaGeocode() {
        return naturalAreaGeocode;
    }

    /**
     * Sets the value of the naturalAreaGeocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNaturalAreaGeocode()
     */
    public void setNaturalAreaGeocode(String value) {
        this.naturalAreaGeocode = value;
    }

    /**
     * The number of the spatial location point elevation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointElevationNumber() {
        return pointElevationNumber;
    }

    /**
     * Sets the value of the pointElevationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPointElevationNumber()
     */
    public void setPointElevationNumber(BigDecimal value) {
        this.pointElevationNumber = value;
    }

    /**
     * The number of the spatial location point latitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointLatitudeNumber() {
        return pointLatitudeNumber;
    }

    /**
     * Sets the value of the pointLatitudeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPointLatitudeNumber()
     */
    public void setPointLatitudeNumber(BigDecimal value) {
        this.pointLatitudeNumber = value;
    }

    /**
     * The number of the spatial location point longitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointLongitudeNumber() {
        return pointLongitudeNumber;
    }

    /**
     * Sets the value of the pointLongitudeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPointLongitudeNumber()
     */
    public void setPointLongitudeNumber(BigDecimal value) {
        this.pointLongitudeNumber = value;
    }

}
