
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
 * Special service information
 * 
 * <p>Java class for SpecialServiceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SpecialServiceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddlDataMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         <element name="FreeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="Qty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}QtyType" minOccurs="0"/>
 *         <element name="SpecialServiceCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "addlDataMeasure",
    "freeText",
    "qty",
    "specialServiceCode"
})
public class SpecialServiceType {

    /**
     * Provides additional supporting measurement information in case the Special Service requires it.
     * 
     */
    @XmlElement(name = "AddlDataMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MeasureType addlDataMeasure;
    /**
     * Free text
     * 
     */
    @XmlElement(name = "FreeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String freeText;
    /**
     * A quantity is a counted number of non-monetary units, possibly including fractions.
     * 
     */
    @XmlElement(name = "Qty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal qty;
    /**
     * Code that identifies the special service.
     * 
     */
    @XmlElement(name = "SpecialServiceCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialServiceCode;

    /**
     * Provides additional supporting measurement information in case the Special Service requires it.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAddlDataMeasure() {
        return addlDataMeasure;
    }

    /**
     * Sets the value of the addlDataMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getAddlDataMeasure()
     */
    public void setAddlDataMeasure(MeasureType value) {
        this.addlDataMeasure = value;
    }

    /**
     * Free text
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFreeText()
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * A quantity is a counted number of non-monetary units, possibly including fractions.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getQty()
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Code that identifies the special service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServiceCode() {
        return specialServiceCode;
    }

    /**
     * Sets the value of the specialServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSpecialServiceCode()
     */
    public void setSpecialServiceCode(String value) {
        this.specialServiceCode = value;
    }

}
