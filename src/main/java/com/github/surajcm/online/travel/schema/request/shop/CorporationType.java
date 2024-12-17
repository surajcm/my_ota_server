
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A company or group of people authorized to act as a single entity (legally a person) and recognized as such in law.
 * 
 * <p>Java class for CorporationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CorporationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CorporateCodeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="CorporateID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="IATA_Number" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
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
@XmlType(name = "CorporationType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "corporateCodeText",
    "corporateID",
    "iataNumber",
    "name"
})
public class CorporationType {

    /**
     * Corporate code assigned to a corporate buyer used for accessing special fares.
     * 
     */
    @XmlElement(name = "CorporateCodeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String corporateCodeText;
    /**
     * Unique identifier of this corporation.
     * 
     */
    @XmlElement(name = "CorporateID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String corporateID;
    /**
     * IATA issued identification number.
     * 
     */
    @XmlElement(name = "IATA_Number", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal iataNumber;
    /**
     * Corporation name
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Corporate code assigned to a corporate buyer used for accessing special fares.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCodeText() {
        return corporateCodeText;
    }

    /**
     * Sets the value of the corporateCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCorporateCodeText()
     */
    public void setCorporateCodeText(String value) {
        this.corporateCodeText = value;
    }

    /**
     * Unique identifier of this corporation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateID() {
        return corporateID;
    }

    /**
     * Sets the value of the corporateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCorporateID()
     */
    public void setCorporateID(String value) {
        this.corporateID = value;
    }

    /**
     * IATA issued identification number.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIATANumber()
     */
    public void setIATANumber(BigDecimal value) {
        this.iataNumber = value;
    }

    /**
     * Corporation name
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
