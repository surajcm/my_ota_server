
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A numeric value determining a length (linear dimension) along with the specified unit of measure.
 * 
 * <p>Java class for LengthMeasureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LengthMeasureType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *       <attribute name="UnitCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}LengthUnitCodeContentType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthMeasureType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "value"
})
public class LengthMeasureType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "UnitCode")
    protected LengthUnitCodeContentType unitCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnitCodeContentType }
     *     
     */
    public LengthUnitCodeContentType getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnitCodeContentType }
     *     
     */
    public void setUnitCode(LengthUnitCodeContentType value) {
        this.unitCode = value;
    }

}
