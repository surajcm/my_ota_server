
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Individual agent who solicits and procures business from potential customers on behalf of one or more principals, usually against payment of a percentage of the realized sales revenue as commission.
 * 
 * <p>Java class for TravelAgentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TravelAgentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TravelAgentID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TravelAgencyTypeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "travelAgentID",
    "typeCode"
})
public class TravelAgentType {

    /**
     * Booking and Servicing Agent information. ID. Example: 98417900 Note: The ID correlates to the specified ID Type.
     * 
     */
    @XmlElement(name = "TravelAgentID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String travelAgentID;
    /**
     * Agency/ Agent Identification Type. Example: B - Booking Agent
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected TravelAgencyTypeCodeContentType typeCode;

    /**
     * Booking and Servicing Agent information. ID. Example: 98417900 Note: The ID correlates to the specified ID Type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgentID() {
        return travelAgentID;
    }

    /**
     * Sets the value of the travelAgentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTravelAgentID()
     */
    public void setTravelAgentID(String value) {
        this.travelAgentID = value;
    }

    /**
     * Agency/ Agent Identification Type. Example: B - Booking Agent
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    public TravelAgencyTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     * @see #getTypeCode()
     */
    public void setTypeCode(TravelAgencyTypeCodeContentType value) {
        this.typeCode = value;
    }

}
