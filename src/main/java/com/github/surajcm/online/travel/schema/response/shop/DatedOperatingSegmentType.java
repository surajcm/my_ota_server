
package com.github.surajcm.online.travel.schema.response.shop;

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
 *         <element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CountryCodeType" minOccurs="0"/>
 *         <element name="DisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="OperatingCarrierFlightNumberText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}FlightNumberTextType" minOccurs="0"/>
 *         <element name="OperationalSuffixText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OperationalSuffixTextType" minOccurs="0"/>
 *         <element name="RBD_Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}RBD_CodeType" minOccurs="0"/>
 *         <element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedOperatingSegmentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "carrierDesigCode",
    "carrierName",
    "disclosureRefID",
    "operatingCarrierFlightNumberText",
    "operationalSuffixText",
    "rbdCode",
    "statusCode"
})
public class DatedOperatingSegmentType {

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "CarrierDesigCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierDesigCode;
    /**
     * Commercial name of the carrier.
     * 
     */
    @XmlElement(name = "CarrierName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;
    /**
     * References a Disclosure ID.
     * 
     */
    @XmlElement(name = "DisclosureRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disclosureRefID;
    /**
     * The numerical designation of a flight as it is operated by a carrier.
     * 
     */
    @XmlElement(name = "OperatingCarrierFlightNumberText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String operatingCarrierFlightNumberText;
    /**
     * Used to distinguish two flights having the same flight number and departing from their respective Origin Stations on the same date.
     * 
     */
    @XmlElement(name = "OperationalSuffixText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String operationalSuffixText;
    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     */
    @XmlElement(name = "RBD_Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String rbdCode;
    /**
     * Flight Status, examples: SO, Flight Canceled. Refer PADIS codeset  1245.
     * 
     */
    @XmlElement(name = "StatusCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCode;

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
     * References a Disclosure ID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureRefID() {
        return disclosureRefID;
    }

    /**
     * Sets the value of the disclosureRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDisclosureRefID()
     */
    public void setDisclosureRefID(String value) {
        this.disclosureRefID = value;
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

    /**
     * Flight Status, examples: SO, Flight Canceled. Refer PADIS codeset  1245.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusCode()
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
