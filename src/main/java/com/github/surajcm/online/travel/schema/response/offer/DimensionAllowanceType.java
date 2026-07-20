
package com.github.surajcm.online.travel.schema.response.offer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Baggage dimension allowance with application information.
 * 
 * <p>Java class for DimensionAllowanceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DimensionAllowanceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="BaggageDimensionCategory" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         <element name="MaxMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MeasureType"/>
 *         <element name="MinMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MeasureType" minOccurs="0"/>
 *         <element name="Qty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}QtyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionAllowanceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "applicableBagText",
    "applicablePartyText",
    "baggageDimensionCategory",
    "descText",
    "maxMeasure",
    "minMeasure",
    "qty"
})
public class DimensionAllowanceType {

    /**
     * Applicable bag type. Examples: Carry-On, 1st Checked Bag, 2nd Checked Bag
     * 
     */
    @XmlElement(name = "ApplicableBagText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String applicableBagText;
    /**
     * Baggage weight restriction application. Examples: Party, Traveler. Party applies to all Travelers.
     * 
     */
    @XmlElement(name = "ApplicablePartyText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String applicablePartyText;
    /**
     * Baggage dimensions category. Examples: Length, Height, Width, Total Linear
     * 
     */
    @XmlElement(name = "BaggageDimensionCategory", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected String baggageDimensionCategory;
    /**
     * Baggage Allowance description and additional information.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<String> descText;
    /**
     * Maximum dimensions value. Example: 62 Notes: Linear measurement = length + width + height
     * 
     */
    @XmlElement(name = "MaxMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected MeasureType maxMeasure;
    /**
     * Minimum dimensions value. Example: 62 Notes: Linear measurement = length + width + height
     * 
     */
    @XmlElement(name = "MinMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MeasureType minMeasure;
    /**
     * Quantity of pieces allowed with these measurements.
     * 
     */
    @XmlElement(name = "Qty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal qty;

    /**
     * Applicable bag type. Examples: Carry-On, 1st Checked Bag, 2nd Checked Bag
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBagText() {
        return applicableBagText;
    }

    /**
     * Sets the value of the applicableBagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApplicableBagText()
     */
    public void setApplicableBagText(String value) {
        this.applicableBagText = value;
    }

    /**
     * Baggage weight restriction application. Examples: Party, Traveler. Party applies to all Travelers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicablePartyText() {
        return applicablePartyText;
    }

    /**
     * Sets the value of the applicablePartyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApplicablePartyText()
     */
    public void setApplicablePartyText(String value) {
        this.applicablePartyText = value;
    }

    /**
     * Baggage dimensions category. Examples: Length, Height, Width, Total Linear
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageDimensionCategory() {
        return baggageDimensionCategory;
    }

    /**
     * Sets the value of the baggageDimensionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaggageDimensionCategory()
     */
    public void setBaggageDimensionCategory(String value) {
        this.baggageDimensionCategory = value;
    }

    /**
     * Baggage Allowance description and additional information.
     * 
     * Gets the value of the descText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the descText property.
     */
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<>();
        }
        return this.descText;
    }

    /**
     * Maximum dimensions value. Example: 62 Notes: Linear measurement = length + width + height
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaxMeasure() {
        return maxMeasure;
    }

    /**
     * Sets the value of the maxMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getMaxMeasure()
     */
    public void setMaxMeasure(MeasureType value) {
        this.maxMeasure = value;
    }

    /**
     * Minimum dimensions value. Example: 62 Notes: Linear measurement = length + width + height
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinMeasure() {
        return minMeasure;
    }

    /**
     * Sets the value of the minMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getMinMeasure()
     */
    public void setMinMeasure(MeasureType value) {
        this.minMeasure = value;
    }

    /**
     * Quantity of pieces allowed with these measurements.
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

}
