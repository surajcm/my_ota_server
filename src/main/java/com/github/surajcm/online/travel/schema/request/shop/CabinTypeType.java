
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
 * 
 * <p>Java class for CabinTypeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CabinTypeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CabinTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CabinTypeCodeType" minOccurs="0"/>
 *         <element name="CabinTypeName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinTypeType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "cabinTypeCode",
    "cabinTypeName"
})
public class CabinTypeType {

    /**
     * Cabin Type Code as defined by PADIS codeset (e.g. 1, 2, 3, etc.)
     * 
     */
    @XmlElement(name = "CabinTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeCode;
    /**
     * Name given to a cabin compartment (e.g. Business, First, Economy).
     * 
     */
    @XmlElement(name = "CabinTypeName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeName;

    /**
     * Cabin Type Code as defined by PADIS codeset (e.g. 1, 2, 3, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeCode() {
        return cabinTypeCode;
    }

    /**
     * Sets the value of the cabinTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCabinTypeCode()
     */
    public void setCabinTypeCode(String value) {
        this.cabinTypeCode = value;
    }

    /**
     * Name given to a cabin compartment (e.g. Business, First, Economy).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeName() {
        return cabinTypeName;
    }

    /**
     * Sets the value of the cabinTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCabinTypeName()
     */
    public void setCabinTypeName(String value) {
        this.cabinTypeName = value;
    }

}
