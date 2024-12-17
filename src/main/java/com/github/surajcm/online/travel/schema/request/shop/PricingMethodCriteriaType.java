
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains information to identify how reservation was re-priced to obtain best published fare (Eg. best fare in same cabin, best fare in all cabins, other parameters to select best fare).
 * 
 * <p>Java class for PricingMethodCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PricingMethodCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BestPricingOptionText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingMethodCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "bestPricingOptionText"
})
public class PricingMethodCriteriaType {

    /**
     * Best Available Fare Pricing Method. Examples: Y (BEST FARE IN SAME CABIN CLASS) C (BEST FARE ACROSS ALL CABIN CLASSES) N (PRICE ACCORDINGLY TO OTHER DESIGNATED PRICING PARAMETERS)
     * 
     */
    @XmlElement(name = "BestPricingOptionText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String bestPricingOptionText;

    /**
     * Best Available Fare Pricing Method. Examples: Y (BEST FARE IN SAME CABIN CLASS) C (BEST FARE ACROSS ALL CABIN CLASSES) N (PRICE ACCORDINGLY TO OTHER DESIGNATED PRICING PARAMETERS)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestPricingOptionText() {
        return bestPricingOptionText;
    }

    /**
     * Sets the value of the bestPricingOptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBestPricingOptionText()
     */
    public void setBestPricingOptionText(String value) {
        this.bestPricingOptionText = value;
    }

}
