
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Condition under which an agreement is reached.
 * 
 * <p>Java class for TermType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TermType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AvailPeriod" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AvailPeriodType"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DescType" minOccurs="0"/>
 *         <element name="OrderingQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OrderingQtyType" minOccurs="0"/>
 *         <element name="TermID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "availPeriod",
    "desc",
    "orderingQty",
    "termID"
})
public class TermType {

    /**
     * Earliest and Latest Period than an option is available or may be used.
     * 
     */
    @XmlElement(name = "AvailPeriod", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected AvailPeriodType availPeriod;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DescType desc;
    /**
     * Minimum/Maximum Option Ordering Quantities.
     * 
     */
    @XmlElement(name = "OrderingQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected OrderingQtyType orderingQty;
    /**
     * Unique identifier associated to a term instance.
     * 
     */
    @XmlElement(name = "TermID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String termID;

    /**
     * Earliest and Latest Period than an option is available or may be used.
     * 
     * @return
     *     possible object is
     *     {@link AvailPeriodType }
     *     
     */
    public AvailPeriodType getAvailPeriod() {
        return availPeriod;
    }

    /**
     * Sets the value of the availPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailPeriodType }
     *     
     * @see #getAvailPeriod()
     */
    public void setAvailPeriod(AvailPeriodType value) {
        this.availPeriod = value;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     * @see #getDesc()
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Minimum/Maximum Option Ordering Quantities.
     * 
     * @return
     *     possible object is
     *     {@link OrderingQtyType }
     *     
     */
    public OrderingQtyType getOrderingQty() {
        return orderingQty;
    }

    /**
     * Sets the value of the orderingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderingQtyType }
     *     
     * @see #getOrderingQty()
     */
    public void setOrderingQty(OrderingQtyType value) {
        this.orderingQty = value;
    }

    /**
     * Unique identifier associated to a term instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTermID()
     */
    public void setTermID(String value) {
        this.termID = value;
    }

}
