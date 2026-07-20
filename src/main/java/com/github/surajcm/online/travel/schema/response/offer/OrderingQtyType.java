
package com.github.surajcm.online.travel.schema.response.offer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Minimum/Maximum Option Ordering Quantities.
 * 
 * <p>Java class for OrderingQtyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrderingQtyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaximumQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}QtyType" minOccurs="0"/>
 *         <element name="MinimumQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}QtyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderingQtyType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "maximumQty",
    "minimumQty"
})
public class OrderingQtyType {

    /**
     * The MAXIMUM Quantity of the Option that may be ordered. Example: 4
     * 
     */
    @XmlElement(name = "MaximumQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal maximumQty;
    /**
     * The MINIMUM Quantity of the Option that may be ordered. Example: 2
     * 
     */
    @XmlElement(name = "MinimumQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal minimumQty;

    /**
     * The MAXIMUM Quantity of the Option that may be ordered. Example: 4
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumQty() {
        return maximumQty;
    }

    /**
     * Sets the value of the maximumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaximumQty()
     */
    public void setMaximumQty(BigDecimal value) {
        this.maximumQty = value;
    }

    /**
     * The MINIMUM Quantity of the Option that may be ordered. Example: 2
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumQty() {
        return minimumQty;
    }

    /**
     * Sets the value of the minimumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMinimumQty()
     */
    public void setMinimumQty(BigDecimal value) {
        this.minimumQty = value;
    }

}
