
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Flight characteristics filter criteria for shopping requests, including non-stop, red eye, etc.
 * 
 * <p>Java class for FlightCharacteristicsCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FlightCharacteristicsCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CharacteristicsCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightCharacteristicCodeType"/>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicsCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "characteristicsCode",
    "prefLevel"
})
public class FlightCharacteristicsCriteriaType {

    /**
     * Code to identify the type of flight characteristic (including non-stop, red eye, etc.)
     * 
     */
    @XmlElement(name = "CharacteristicsCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlSchemaType(name = "string")
    protected FlightCharacteristicCodeContentType characteristicsCode;
    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected PrefLevelType prefLevel;

    /**
     * Code to identify the type of flight characteristic (including non-stop, red eye, etc.)
     * 
     * @return
     *     possible object is
     *     {@link FlightCharacteristicCodeContentType }
     *     
     */
    public FlightCharacteristicCodeContentType getCharacteristicsCode() {
        return characteristicsCode;
    }

    /**
     * Sets the value of the characteristicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCharacteristicCodeContentType }
     *     
     * @see #getCharacteristicsCode()
     */
    public void setCharacteristicsCode(FlightCharacteristicCodeContentType value) {
        this.characteristicsCode = value;
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
