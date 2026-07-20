
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Validating carrier-assigned fare rule modification or override information.
 * 
 * <p>Java class for FareWaiverType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FareWaiverType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FareRuleWaiverCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType"/>
 *         <element name="FareWaiverTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareWaiverType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "fareRuleWaiverCode",
    "fareWaiverTypeCode"
})
public class FareWaiverType {

    /**
     * Code assigned by the validating carrier that allows fare rule modification or override.
     * 
     */
    @XmlElement(name = "FareRuleWaiverCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareRuleWaiverCode;
    /**
     * Waiver type code. Examples: ExchangeReissued, FareComponent.
     * 
     */
    @XmlElement(name = "FareWaiverTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareWaiverTypeCode;

    /**
     * Code assigned by the validating carrier that allows fare rule modification or override.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRuleWaiverCode() {
        return fareRuleWaiverCode;
    }

    /**
     * Sets the value of the fareRuleWaiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareRuleWaiverCode()
     */
    public void setFareRuleWaiverCode(String value) {
        this.fareRuleWaiverCode = value;
    }

    /**
     * Waiver type code. Examples: ExchangeReissued, FareComponent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareWaiverTypeCode() {
        return fareWaiverTypeCode;
    }

    /**
     * Sets the value of the fareWaiverTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareWaiverTypeCode()
     */
    public void setFareWaiverTypeCode(String value) {
        this.fareWaiverTypeCode = value;
    }

}
