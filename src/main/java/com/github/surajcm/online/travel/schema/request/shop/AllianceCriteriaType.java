
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Filtering criteria based on Alliance.
 * 
 * <p>Java class for AllianceCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AllianceCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Alliance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AllianceType" minOccurs="0"/>
 *         <element name="FlightHaulTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightHaulCodeType" minOccurs="0"/>
 *         <element name="GeographicalIndTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProductDetailsCodeType" minOccurs="0"/>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllianceCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "alliance",
    "flightHaulTypeCode",
    "geographicalIndTypeCode",
    "prefLevel"
})
public class AllianceCriteriaType {

    /**
     * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
     * 
     */
    @XmlElement(name = "Alliance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AllianceType alliance;
    /**
     * Flight haul length type. Example: LH (long haul 6 hrs plus).
     * 
     */
    @XmlElement(name = "FlightHaulTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String flightHaulTypeCode;
    /**
     * Geographical indicator type. Example: DOM (Domestic)
     * 
     */
    @XmlElement(name = "GeographicalIndTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String geographicalIndTypeCode;
    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PrefLevelType prefLevel;

    /**
     * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
     * 
     * @return
     *     possible object is
     *     {@link AllianceType }
     *     
     */
    public AllianceType getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceType }
     *     
     * @see #getAlliance()
     */
    public void setAlliance(AllianceType value) {
        this.alliance = value;
    }

    /**
     * Flight haul length type. Example: LH (long haul 6 hrs plus).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightHaulTypeCode() {
        return flightHaulTypeCode;
    }

    /**
     * Sets the value of the flightHaulTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFlightHaulTypeCode()
     */
    public void setFlightHaulTypeCode(String value) {
        this.flightHaulTypeCode = value;
    }

    /**
     * Geographical indicator type. Example: DOM (Domestic)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicalIndTypeCode() {
        return geographicalIndTypeCode;
    }

    /**
     * Sets the value of the geographicalIndTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGeographicalIndTypeCode()
     */
    public void setGeographicalIndTypeCode(String value) {
        this.geographicalIndTypeCode = value;
    }

    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     * @see #getPrefLevel()
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
