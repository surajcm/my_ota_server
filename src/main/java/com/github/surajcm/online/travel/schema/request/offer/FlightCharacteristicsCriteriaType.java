
package com.github.surajcm.online.travel.schema.request.offer;

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
 *         <element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}FlightCharacteristicCodeType" minOccurs="0"/>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PrefLevelType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicsCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "characteristicCode",
    "prefLevel"
})
public class FlightCharacteristicsCriteriaType {

    /**
     * Code to identify the type of flight characteristic (including non-stop, red eye, etc.)
     * 
     */
    @XmlElement(name = "CharacteristicCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "string")
    protected FlightCharacteristicCodeContentType characteristicCode;
    /**
     * Information supporting some shopping filter criteria, including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected PrefLevelType prefLevel;

    /**
     * Code to identify the type of flight characteristic (including non-stop, red eye, etc.)
     * 
     * @return
     *     possible object is
     *     {@link FlightCharacteristicCodeContentType }
     *     
     */
    public FlightCharacteristicCodeContentType getCharacteristicCode() {
        return characteristicCode;
    }

    /**
     * Sets the value of the characteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCharacteristicCodeContentType }
     *     
     * @see #getCharacteristicCode()
     */
    public void setCharacteristicCode(FlightCharacteristicCodeContentType value) {
        this.characteristicCode = value;
    }

    /**
     * Information supporting some shopping filter criteria, including preference level code (e.g. Preferred, Exclude, etc.).
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
