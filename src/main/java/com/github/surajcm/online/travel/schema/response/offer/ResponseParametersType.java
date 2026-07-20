
package com.github.surajcm.online.travel.schema.response.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to how response results should be returned.
 * 
 * <p>Java class for ResponseParametersType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResponseParametersType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurParameter" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CurParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InventoryGuaranteeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}LangUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MeasurementSystemCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MeasurementSystemCodeType" minOccurs="0"/>
 *         <element name="PricingParameter" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PricingParameterType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseParametersType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "curParameter",
    "inventoryGuaranteeInd",
    "langUsage",
    "measurementSystemCode",
    "pricingParameter"
})
public class ResponseParametersType {

    /**
     * Currency related parameters intended to influence which currency the shopping results are displayed in.
     * 
     */
    @XmlElement(name = "CurParameter", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<CurParameterType> curParameter;
    /**
     * When TRUE, inventory guarantee is requested for applicable optional services.
     * 
     */
    @XmlElement(name = "InventoryGuaranteeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean inventoryGuaranteeInd;
    /**
     * Language Code representation.
     * 
     */
    @XmlElement(name = "LangUsage", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<LangUsageType> langUsage;
    /**
     * Measurement system code. Examples: Imperial, Metric
     * 
     */
    @XmlElement(name = "MeasurementSystemCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeContentType measurementSystemCode;
    /**
     * Pricing Parameters, including Simple Pricing, Award Travel, Auto Exchange, Override Currency and Tax Exemption.
     * 
     */
    @XmlElement(name = "PricingParameter", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected PricingParameterType pricingParameter;

    /**
     * Currency related parameters intended to influence which currency the shopping results are displayed in.
     * 
     * Gets the value of the curParameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curParameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCurParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurParameterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the curParameter property.
     */
    public List<CurParameterType> getCurParameter() {
        if (curParameter == null) {
            curParameter = new ArrayList<>();
        }
        return this.curParameter;
    }

    /**
     * When TRUE, inventory guarantee is requested for applicable optional services.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventoryGuaranteeInd() {
        return inventoryGuaranteeInd;
    }

    /**
     * Sets the value of the inventoryGuaranteeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInventoryGuaranteeInd()
     */
    public void setInventoryGuaranteeInd(Boolean value) {
        this.inventoryGuaranteeInd = value;
    }

    /**
     * Language Code representation.
     * 
     * Gets the value of the langUsage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the langUsage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLangUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangUsageType }
     * </p>
     * 
     * 
     * @return
     *     The value of the langUsage property.
     */
    public List<LangUsageType> getLangUsage() {
        if (langUsage == null) {
            langUsage = new ArrayList<>();
        }
        return this.langUsage;
    }

    /**
     * Measurement system code. Examples: Imperial, Metric
     * 
     * @return
     *     possible object is
     *     {@link MeasurementSystemCodeContentType }
     *     
     */
    public MeasurementSystemCodeContentType getMeasurementSystemCode() {
        return measurementSystemCode;
    }

    /**
     * Sets the value of the measurementSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementSystemCodeContentType }
     *     
     * @see #getMeasurementSystemCode()
     */
    public void setMeasurementSystemCode(MeasurementSystemCodeContentType value) {
        this.measurementSystemCode = value;
    }

    /**
     * Pricing Parameters, including Simple Pricing, Award Travel, Auto Exchange, Override Currency and Tax Exemption.
     * 
     * @return
     *     possible object is
     *     {@link PricingParameterType }
     *     
     */
    public PricingParameterType getPricingParameter() {
        return pricingParameter;
    }

    /**
     * Sets the value of the pricingParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingParameterType }
     *     
     * @see #getPricingParameter()
     */
    public void setPricingParameter(PricingParameterType value) {
        this.pricingParameter = value;
    }

}
