
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Filters results based on offer Item Type code
 * 
 * <p>Java class for OfferItemTypeCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OfferItemTypeCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemTypeCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "offerItemTypeCode"
})
public class OfferItemTypeCriteriaType {

    /**
     * Specify the type of Offer Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     */
    @XmlElement(name = "OfferItemTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemTypeCode;

    /**
     * Specify the type of Offer Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemTypeCode() {
        return offerItemTypeCode;
    }

    /**
     * Sets the value of the offerItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferItemTypeCode()
     */
    public void setOfferItemTypeCode(String value) {
        this.offerItemTypeCode = value;
    }

}
