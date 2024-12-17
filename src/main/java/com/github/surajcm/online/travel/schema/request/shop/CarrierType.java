
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
 * 
 * <p>Java class for CarrierType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CarrierType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AirlineDesigCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AirlineDesigCodeType"/>
 *         <element name="DuplicateDesigInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "airlineDesigCode",
    "duplicateDesigInd",
    "name"
})
public class CarrierType {

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "AirlineDesigCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airlineDesigCode;
    /**
     * Indicates that the IATA Airline Designator is a duplicate code shared by multiple airlines. To identify the airline - in this case - its name must be specified in addition to the designator.
     * 
     */
    @XmlElement(name = "DuplicateDesigInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean duplicateDesigInd;
    /**
     * Commercial name of the carrier.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesigCode() {
        return airlineDesigCode;
    }

    /**
     * Sets the value of the airlineDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAirlineDesigCode()
     */
    public void setAirlineDesigCode(String value) {
        this.airlineDesigCode = value;
    }

    /**
     * Indicates that the IATA Airline Designator is a duplicate code shared by multiple airlines. To identify the airline - in this case - its name must be specified in addition to the designator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateDesigInd() {
        return duplicateDesigInd;
    }

    /**
     * Sets the value of the duplicateDesigInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDuplicateDesigInd()
     */
    public void setDuplicateDesigInd(Boolean value) {
        this.duplicateDesigInd = value;
    }

    /**
     * Commercial name of the carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

}
