
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An operation between board point and any subsequent off point within the same flight designator. Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc.
 * 
 * <p>Java class for DatedOperatingSegmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DatedOperatingSegmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="OperatingCarrierFlightNumberText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightNumberTextType" minOccurs="0"/>
 *         <element name="OperationalSuffixText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OperationalSuffixTextType" minOccurs="0"/>
 *         <element name="RBD_Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RBD_CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedOperatingSegmentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "carrierDesigCode",
    "carrierName",
    "operatingCarrierFlightNumberText",
    "operationalSuffixText",
    "rbdCode"
})
public class DatedOperatingSegmentType {

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "CarrierDesigCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierDesigCode;
    /**
     * Commercial name of the carrier.
     * 
     */
    @XmlElement(name = "CarrierName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;
    /**
     * The numerical designation of a flight as it is operated by a carrier.
     * 
     */
    @XmlElement(name = "OperatingCarrierFlightNumberText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String operatingCarrierFlightNumberText;
    /**
     * Used to distinguish two flights having the same flight number and departing from their respective Origin Stations on the same date.
     * 
     */
    @XmlElement(name = "OperationalSuffixText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String operationalSuffixText;
    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     */
    @XmlElement(name = "RBD_Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rbdCode;

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDesigCode() {
        return carrierDesigCode;
    }

    /**
     * Sets the value of the carrierDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierDesigCode()
     */
    public void setCarrierDesigCode(String value) {
        this.carrierDesigCode = value;
    }

    /**
     * Commercial name of the carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierName()
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * The numerical designation of a flight as it is operated by a carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierFlightNumberText() {
        return operatingCarrierFlightNumberText;
    }

    /**
     * Sets the value of the operatingCarrierFlightNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingCarrierFlightNumberText()
     */
    public void setOperatingCarrierFlightNumberText(String value) {
        this.operatingCarrierFlightNumberText = value;
    }

    /**
     * Used to distinguish two flights having the same flight number and departing from their respective Origin Stations on the same date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalSuffixText() {
        return operationalSuffixText;
    }

    /**
     * Sets the value of the operationalSuffixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperationalSuffixText()
     */
    public void setOperationalSuffixText(String value) {
        this.operationalSuffixText = value;
    }

    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBDCode() {
        return rbdCode;
    }

    /**
     * Sets the value of the rbdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRBDCode()
     */
    public void setRBDCode(String value) {
        this.rbdCode = value;
    }

}
