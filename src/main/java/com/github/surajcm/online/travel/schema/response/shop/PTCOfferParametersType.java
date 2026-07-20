
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Passenger Type summary information for an offer.
 * 
 * <p>Java class for PTC_OfferParametersType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PTC_OfferParametersType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PricedPaxNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *         <element name="PTC_PricedCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IATA_PTC_CodeType" minOccurs="0"/>
 *         <element name="PTC_RequestedCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IATA_PTC_CodeType" minOccurs="0"/>
 *         <element name="RequestedPaxNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_OfferParametersType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "pricedPaxNumber",
    "ptcPricedCode",
    "ptcRequestedCode",
    "requestedPaxNumber"
})
public class PTCOfferParametersType {

    /**
     * Number of Passenger(s) for associated passenger type. Example: 2
     * 
     */
    @XmlElement(name = "PricedPaxNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal pricedPaxNumber;
    /**
     * Actual passenger type code used for pricing. Example: ADT
     * 
     */
    @XmlElement(name = "PTC_PricedCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String ptcPricedCode;
    /**
     * Requested passenger type code for pricing. Example: CHD  Encoding scheme: IATA (three character) Passenger Type Code
     * 
     */
    @XmlElement(name = "PTC_RequestedCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String ptcRequestedCode;
    /**
     * Number of Passenger(s) for associated passenger type. Example: 2
     * 
     */
    @XmlElement(name = "RequestedPaxNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal requestedPaxNumber;

    /**
     * Number of Passenger(s) for associated passenger type. Example: 2
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricedPaxNumber() {
        return pricedPaxNumber;
    }

    /**
     * Sets the value of the pricedPaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPricedPaxNumber()
     */
    public void setPricedPaxNumber(BigDecimal value) {
        this.pricedPaxNumber = value;
    }

    /**
     * Actual passenger type code used for pricing. Example: ADT
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTCPricedCode() {
        return ptcPricedCode;
    }

    /**
     * Sets the value of the ptcPricedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPTCPricedCode()
     */
    public void setPTCPricedCode(String value) {
        this.ptcPricedCode = value;
    }

    /**
     * Requested passenger type code for pricing. Example: CHD  Encoding scheme: IATA (three character) Passenger Type Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTCRequestedCode() {
        return ptcRequestedCode;
    }

    /**
     * Sets the value of the ptcRequestedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPTCRequestedCode()
     */
    public void setPTCRequestedCode(String value) {
        this.ptcRequestedCode = value;
    }

    /**
     * Number of Passenger(s) for associated passenger type. Example: 2
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedPaxNumber() {
        return requestedPaxNumber;
    }

    /**
     * Sets the value of the requestedPaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRequestedPaxNumber()
     */
    public void setRequestedPaxNumber(BigDecimal value) {
        this.requestedPaxNumber = value;
    }

}
