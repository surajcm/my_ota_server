
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AirShoppingRQ payload information.
 * 
 * <p>Java class for RequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FlightCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightRequestType"/>
 *         <element name="Paxs" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaxsType" minOccurs="0"/>
 *         <element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ResponseParametersType" minOccurs="0"/>
 *         <element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ShoppingCriteriaType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "flightCriteria",
    "paxs",
    "responseParameters",
    "shoppingCriteria"
})
public class RequestType {

    /**
     * Choice of Affinity, Origin Destination, or Journey flight information for this shopping request.
     * 
     */
    @XmlElement(name = "FlightCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected FlightRequestType flightCriteria;
    /**
     * Passenger and Passenger Group information.
     * 
     */
    @XmlElement(name = "Paxs", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PaxsType paxs;
    /**
     * Information related to how shopping results should be returned in the response.
     * 
     */
    @XmlElement(name = "ResponseParameters", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected ResponseParametersType responseParameters;
    /**
     * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
     * 
     */
    @XmlElement(name = "ShoppingCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected ShoppingCriteriaType shoppingCriteria;

    /**
     * Choice of Affinity, Origin Destination, or Journey flight information for this shopping request.
     * 
     * @return
     *     possible object is
     *     {@link FlightRequestType }
     *     
     */
    public FlightRequestType getFlightCriteria() {
        return flightCriteria;
    }

    /**
     * Sets the value of the flightCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRequestType }
     *     
     * @see #getFlightCriteria()
     */
    public void setFlightCriteria(FlightRequestType value) {
        this.flightCriteria = value;
    }

    /**
     * Passenger and Passenger Group information.
     * 
     * @return
     *     possible object is
     *     {@link PaxsType }
     *     
     */
    public PaxsType getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxsType }
     *     
     * @see #getPaxs()
     */
    public void setPaxs(PaxsType value) {
        this.paxs = value;
    }

    /**
     * Information related to how shopping results should be returned in the response.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     * @see #getResponseParameters()
     */
    public void setResponseParameters(ResponseParametersType value) {
        this.responseParameters = value;
    }

    /**
     * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public ShoppingCriteriaType getShoppingCriteria() {
        return shoppingCriteria;
    }

    /**
     * Sets the value of the shoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCriteriaType }
     *     
     * @see #getShoppingCriteria()
     */
    public void setShoppingCriteria(ShoppingCriteriaType value) {
        this.shoppingCriteria = value;
    }

}
