
package com.github.surajcm.online.travel.schema.response.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Baggage weight allowance with application information.
 * 
 * <p>Java class for WeightAllowanceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WeightAllowanceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         <element name="MaximumWeightMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MeasureType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightAllowanceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "applicableBagText",
    "applicablePartyText",
    "descText",
    "maximumWeightMeasure"
})
public class WeightAllowanceType {

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
     * Baggage Allowance description and additional information.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<String> descText;
    /**
     * Maximum weight value and unit of measure. Example: 50
     * 
     */
    @XmlElement(name = "MaximumWeightMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected MeasureType maximumWeightMeasure;

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
     * Maximum weight value and unit of measure. Example: 50
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumWeightMeasure() {
        return maximumWeightMeasure;
    }

    /**
     * Sets the value of the maximumWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getMaximumWeightMeasure()
     */
    public void setMaximumWeightMeasure(MeasureType value) {
        this.maximumWeightMeasure = value;
    }

}
