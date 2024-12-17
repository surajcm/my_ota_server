
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The customer's requested Station criteria.
 * 
 * <p>Java class for StationCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StationCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType" minOccurs="0"/>
 *         <element name="Station" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}StationType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "prefLevel",
    "station"
})
public class StationCriteriaType {

    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PrefLevelType prefLevel;
    /**
     * Location or facility where air or surface transportation originates, stops and/or terminates, and where passengers and/or cargo can be taken on or off.
     * 
     */
    @XmlElement(name = "Station", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<StationType> station;

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

    /**
     * Location or facility where air or surface transportation originates, stops and/or terminates, and where passengers and/or cargo can be taken on or off.
     * 
     * Gets the value of the station property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the station property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the station property.
     */
    public List<StationType> getStation() {
        if (station == null) {
            station = new ArrayList<>();
        }
        return this.station;
    }

}
