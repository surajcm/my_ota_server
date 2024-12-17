
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to how shopping results should be returned in the response.
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
 *         <element name="BDC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BDC_Type" minOccurs="0"/>
 *         <element name="CurParameter" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CurParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Device" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DeviceType" minOccurs="0"/>
 *         <element name="DeviceLocation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DeviceLocationType" minOccurs="0"/>
 *         <element name="InventoryGuaranteeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}LangUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MeasurementSystemCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasurementSystemCodeType" minOccurs="0"/>
 *         <element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaxGroupType" minOccurs="0"/>
 *         <element name="PricingParameter" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PricingParameterType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseParametersType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "bdc",
    "curParameter",
    "device",
    "deviceLocation",
    "inventoryGuaranteeInd",
    "langUsage",
    "measurementSystemCode",
    "paxGroup",
    "pricingParameter"
})
public class ResponseParametersType {

    /**
     * The carrier whose baggage allowances and charges apply.
     * 
     */
    @XmlElement(name = "BDC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BDCType bdc;
    /**
     * Requested search processing and results currency information.
     * 
     */
    @XmlElement(name = "CurParameter", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<CurParameterType> curParameter;
    /**
     * Device upon which the secure transaction will occur.
     * 
     */
    @XmlElement(name = "Device", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DeviceType device;
    /**
     * Location of device
     * 
     */
    @XmlElement(name = "DeviceLocation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DeviceLocationType deviceLocation;
    /**
     * When TRUE, inventory guarantee is requested for applicable optional services.
     * 
     */
    @XmlElement(name = "InventoryGuaranteeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean inventoryGuaranteeInd;
    /**
     * Language Code representation.
     * 
     */
    @XmlElement(name = "LangUsage", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<LangUsageType> langUsage;
    /**
     * Measurement system code. Examples: Imperial, Metric
     * 
     */
    @XmlElement(name = "MeasurementSystemCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeContentType measurementSystemCode;
    /**
     * A number of individual passengers traveling under one commercial name that associates them. E.g. a Tour group or a group for sales allotment from airline to agency.
     * 
     */
    @XmlElement(name = "PaxGroup", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PaxGroupType paxGroup;
    /**
     * Pricing Parameters, including Simple Pricing, Award Travel, Auto Exchange, Override Currency and Tax Exemption.
     * 
     */
    @XmlElement(name = "PricingParameter", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PricingParameterType pricingParameter;

    /**
     * The carrier whose baggage allowances and charges apply.
     * 
     * @return
     *     possible object is
     *     {@link BDCType }
     *     
     */
    public BDCType getBDC() {
        return bdc;
    }

    /**
     * Sets the value of the bdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDCType }
     *     
     * @see #getBDC()
     */
    public void setBDC(BDCType value) {
        this.bdc = value;
    }

    /**
     * Requested search processing and results currency information.
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
     * Device upon which the secure transaction will occur.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     * @see #getDevice()
     */
    public void setDevice(DeviceType value) {
        this.device = value;
    }

    /**
     * Location of device
     * 
     * @return
     *     possible object is
     *     {@link DeviceLocationType }
     *     
     */
    public DeviceLocationType getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLocationType }
     *     
     * @see #getDeviceLocation()
     */
    public void setDeviceLocation(DeviceLocationType value) {
        this.deviceLocation = value;
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
     * A number of individual passengers traveling under one commercial name that associates them. E.g. a Tour group or a group for sales allotment from airline to agency.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroup() {
        return paxGroup;
    }

    /**
     * Sets the value of the paxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     * @see #getPaxGroup()
     */
    public void setPaxGroup(PaxGroupType value) {
        this.paxGroup = value;
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
