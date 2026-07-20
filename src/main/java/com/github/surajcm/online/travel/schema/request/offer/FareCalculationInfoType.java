
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to the calculation of the Fare amount by applying various rules to determine a final fare for an airline ticket.
 * 
 * <p>Java class for FareCalculationInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FareCalculationInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddlInfoText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType"/>
 *         <element name="PricingCodeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType"/>
 *         <element name="ReportingCodeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCalculationInfoType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "addlInfoText",
    "pricingCodeText",
    "reportingCodeText"
})
public class FareCalculationInfoType {

    /**
     * The fare calculation text required in the fare calculation area of an electronic ticket.
     * 
     */
    @XmlElement(name = "AddlInfoText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected String addlInfoText;
    /**
     * Primary identifier reflecting the method of pricing for a transaction.
     * 
     */
    @XmlElement(name = "PricingCodeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected String pricingCodeText;
    /**
     * Secondary identifier reflecting the method of pricing for a transaction used in the reporting process.
     * 
     */
    @XmlElement(name = "ReportingCodeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected String reportingCodeText;

    /**
     * The fare calculation text required in the fare calculation area of an electronic ticket.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlInfoText() {
        return addlInfoText;
    }

    /**
     * Sets the value of the addlInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddlInfoText()
     */
    public void setAddlInfoText(String value) {
        this.addlInfoText = value;
    }

    /**
     * Primary identifier reflecting the method of pricing for a transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCodeText() {
        return pricingCodeText;
    }

    /**
     * Sets the value of the pricingCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPricingCodeText()
     */
    public void setPricingCodeText(String value) {
        this.pricingCodeText = value;
    }

    /**
     * Secondary identifier reflecting the method of pricing for a transaction used in the reporting process.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCodeText() {
        return reportingCodeText;
    }

    /**
     * Sets the value of the reportingCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReportingCodeText()
     */
    public void setReportingCodeText(String value) {
        this.reportingCodeText = value;
    }

}
