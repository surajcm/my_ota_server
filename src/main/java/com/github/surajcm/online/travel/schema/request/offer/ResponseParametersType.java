
package com.github.surajcm.online.travel.schema.request.offer;

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
 *         <element name="BDC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BDC_Type" minOccurs="0"/>
 *         <element name="CurParameter" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CurParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Device" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DeviceType" minOccurs="0"/>
 *         <element name="DeviceLocation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DeviceLocationType" minOccurs="0"/>
 *         <element name="InventoryGuaranteeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="MeasurementSystemCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}MeasurementSystemCodeType" minOccurs="0"/>
 *         <element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaxGroupType" minOccurs="0"/>
 *         <element name="PricingParameter" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PricingParameterType" minOccurs="0"/>
 *         <element name="Remark" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseParametersType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "bdc",
    "curParameter",
    "device",
    "deviceLocation",
    "inventoryGuaranteeInd",
    "measurementSystemCode",
    "paxGroup",
    "pricingParameter",
    "remark"
})
public class ResponseParametersType {

    /**
     * The carrier whose baggage allowances and charges apply.
     * 
     */
    @XmlElement(name = "BDC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BDCType bdc;
    /**
     * Currency related parameters intended to influence which currency the shopping results are displayed in.
     * 
     */
    @XmlElement(name = "CurParameter", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CurParameterType> curParameter;
    /**
     * Device upon which the secure transaction will occur.
     * 
     */
    @XmlElement(name = "Device", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DeviceType device;
    /**
     * Location of device
     * 
     */
    @XmlElement(name = "DeviceLocation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DeviceLocationType deviceLocation;
    /**
     * When TRUE, inventory guarantee is requested for applicable optional services.
     * 
     */
    @XmlElement(name = "InventoryGuaranteeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean inventoryGuaranteeInd;
    /**
     * Measurement system code. Examples: Imperial, Metric
     * 
     */
    @XmlElement(name = "MeasurementSystemCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected MeasurementSystemCodeContentType measurementSystemCode;
    /**
     * A number of individual passengers traveling under one commercial name that associates them. E.g. a Tour group or a group for sales allotment from airline to agency.
     * 
     */
    @XmlElement(name = "PaxGroup", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PaxGroupType paxGroup;
    /**
     * Pricing Parameters, including Simple Pricing, Award Travel, Auto Exchange, Override Currency and Tax Exemption.
     * 
     */
    @XmlElement(name = "PricingParameter", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PricingParameterType pricingParameter;
    /**
     * Additional, supplementary information about the document or service.
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<RemarkType> remark;

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

    /**
     * Additional, supplementary information about the document or service.
     * 
     * Gets the value of the remark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * </p>
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
    }

}
