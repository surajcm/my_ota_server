
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The amount of money expected, required, or given in payment for something.
 * 
 * <p>Java class for Price1Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Price1Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *         <element name="TaxSummary" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TaxSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price1Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "baseAmount",
    "taxSummary",
    "totalAmount"
})
public class Price1Type {

    /**
     * Total Base Fare Amount. Example: 200000
     * 
     */
    @XmlElement(name = "BaseAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType baseAmount;
    /**
     * Tax summary information.
     * 
     */
    @XmlElement(name = "TaxSummary", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<TaxSummaryType> taxSummary;
    /**
     * Total monetary price amount, including all tax, surcharge, and fee amounts.
     * 
     */
    @XmlElement(name = "TotalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected AmountType totalAmount;

    /**
     * Total Base Fare Amount. Example: 200000
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getBaseAmount()
     */
    public void setBaseAmount(AmountType value) {
        this.baseAmount = value;
    }

    /**
     * Tax summary information.
     * 
     * Gets the value of the taxSummary property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSummary property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSummaryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the taxSummary property.
     */
    public List<TaxSummaryType> getTaxSummary() {
        if (taxSummary == null) {
            taxSummary = new ArrayList<>();
        }
        return this.taxSummary;
    }

    /**
     * Total monetary price amount, including all tax, surcharge, and fee amounts.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getTotalAmount()
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

}
