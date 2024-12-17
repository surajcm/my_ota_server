
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Pricing Parameters, including Simple Pricing, Award Travel, Auto Exchange, Override Currency and Tax Exemption.
 * 
 * <p>Java class for PricingParameterType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PricingParameterType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AutoExchInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="AwardIncludedInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="AwardOnlyInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="OverrideCurCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CurCodeType" minOccurs="0"/>
 *         <element name="SimplePricingInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="TaxExemption" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingParameterType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "autoExchInd",
    "awardIncludedInd",
    "awardOnlyInd",
    "overrideCurCode",
    "simplePricingInd",
    "taxExemption"
})
public class PricingParameterType {

    /**
     * When TRUE, this request is to be handled by an auto-exchange process.
     * 
     */
    @XmlElement(name = "AutoExchInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean autoExchInd;
    /**
     * When TRUE, award eligible offers to be returned in addition to priced offers.
     * 
     */
    @XmlElement(name = "AwardIncludedInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean awardIncludedInd;
    /**
     * When TRUE, only award eligible offers are requested.
     * 
     */
    @XmlElement(name = "AwardOnlyInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean awardOnlyInd;
    @XmlElement(name = "OverrideCurCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String overrideCurCode;
    /**
     * When TRUE, simple pricing is requested for returned offers.
     * 
     */
    @XmlElement(name = "SimplePricingInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean simplePricingInd;
    /**
     * Tax summary information.
     * 
     */
    @XmlElement(name = "TaxExemption", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<TaxSummaryType> taxExemption;

    /**
     * When TRUE, this request is to be handled by an auto-exchange process.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExchInd() {
        return autoExchInd;
    }

    /**
     * Sets the value of the autoExchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutoExchInd()
     */
    public void setAutoExchInd(Boolean value) {
        this.autoExchInd = value;
    }

    /**
     * When TRUE, award eligible offers to be returned in addition to priced offers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwardIncludedInd() {
        return awardIncludedInd;
    }

    /**
     * Sets the value of the awardIncludedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAwardIncludedInd()
     */
    public void setAwardIncludedInd(Boolean value) {
        this.awardIncludedInd = value;
    }

    /**
     * When TRUE, only award eligible offers are requested.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwardOnlyInd() {
        return awardOnlyInd;
    }

    /**
     * Sets the value of the awardOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAwardOnlyInd()
     */
    public void setAwardOnlyInd(Boolean value) {
        this.awardOnlyInd = value;
    }

    /**
     * Gets the value of the overrideCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCurCode() {
        return overrideCurCode;
    }

    /**
     * Sets the value of the overrideCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCurCode(String value) {
        this.overrideCurCode = value;
    }

    /**
     * When TRUE, simple pricing is requested for returned offers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSimplePricingInd() {
        return simplePricingInd;
    }

    /**
     * Sets the value of the simplePricingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSimplePricingInd()
     */
    public void setSimplePricingInd(Boolean value) {
        this.simplePricingInd = value;
    }

    /**
     * Tax summary information.
     * 
     * Gets the value of the taxExemption property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemption property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxExemption().add(newItem);
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
     *     The value of the taxExemption property.
     */
    public List<TaxSummaryType> getTaxExemption() {
        if (taxExemption == null) {
            taxExemption = new ArrayList<>();
        }
        return this.taxExemption;
    }

}
