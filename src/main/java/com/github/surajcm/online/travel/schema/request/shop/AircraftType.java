
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Any machine that can derive support in the atmosphere from the reactions of the air other than the reactions of the air against the earthâ€™s surface. It must be certified as airworthy by a competent aeronautical authority.
 * 
 * <p>Java class for AircraftType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AircraftType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AircraftRegistrationID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AircraftRegistrationID_Type" minOccurs="0"/>
 *         <element name="TailNumberText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "aircraftRegistrationID",
    "tailNumberText"
})
public class AircraftType {

    /**
     * The complete alphanumeric identification assigned by the appropriate licensing authority to an individual aircraft. Hyphens contained within the registration shall not be included. E.g. GBOAC, N46573, ZZ123.
     * 
     */
    @XmlElement(name = "AircraftRegistrationID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String aircraftRegistrationID;
    /**
     * Abbreviated version of the unique aircraft registration code, such as without country code. Also called 'Tail Number'
     * 
     */
    @XmlElement(name = "TailNumberText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String tailNumberText;

    /**
     * The complete alphanumeric identification assigned by the appropriate licensing authority to an individual aircraft. Hyphens contained within the registration shall not be included. E.g. GBOAC, N46573, ZZ123.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftRegistrationID() {
        return aircraftRegistrationID;
    }

    /**
     * Sets the value of the aircraftRegistrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAircraftRegistrationID()
     */
    public void setAircraftRegistrationID(String value) {
        this.aircraftRegistrationID = value;
    }

    /**
     * Abbreviated version of the unique aircraft registration code, such as without country code. Also called 'Tail Number'
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumberText() {
        return tailNumberText;
    }

    /**
     * Sets the value of the tailNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTailNumberText()
     */
    public void setTailNumberText(String value) {
        this.tailNumberText = value;
    }

}
