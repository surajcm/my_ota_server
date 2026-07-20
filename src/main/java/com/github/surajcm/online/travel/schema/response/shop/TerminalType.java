
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A departure and/or arrival building for aircraft, passengers or freight at a station for any transport mode.
 * 
 * <p>Java class for TerminalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerminalType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "terminalName"
})
public class TerminalType {

    /**
     * The name of the terminal.
     * 
     */
    @XmlElement(name = "TerminalName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String terminalName;

    /**
     * The name of the terminal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTerminalName()
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
    }

}
