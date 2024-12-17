
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A rewards program offered by a company to customers who frequently make purchases, which may give a customer advanced access to new products, special sales coupons or free merchandise.
 * 
 * <p>Java class for LoyaltyProgramType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LoyaltyProgramType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Alliance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AllianceType" minOccurs="0"/>
 *         <element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType" minOccurs="0"/>
 *         <element name="ProgramCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="ProgramName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="ProviderName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="URL" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "alliance",
    "carrier",
    "programCode",
    "programName",
    "providerName",
    "url"
})
public class LoyaltyProgramType {

    /**
     * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
     * 
     */
    @XmlElement(name = "Alliance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AllianceType alliance;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "Carrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CarrierType carrier;
    /**
     * Loyalty Program ID: Example: MAM
     * 
     */
    @XmlElement(name = "ProgramCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programCode;
    /**
     * Loyalty Program Name. Example: Miles and More
     * 
     */
    @XmlElement(name = "ProgramName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    /**
     * Name of the organization providing the Loyalty Program.
     * 
     */
    @XmlElement(name = "ProviderName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providerName;
    /**
     * Loyalty Program information URL. Example: https://www.britishairways.com/en-gb/executive-club/about-the-club
     * 
     */
    @XmlElement(name = "URL", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
     * 
     * @return
     *     possible object is
     *     {@link AllianceType }
     *     
     */
    public AllianceType getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceType }
     *     
     * @see #getAlliance()
     */
    public void setAlliance(AllianceType value) {
        this.alliance = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getCarrier()
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * Loyalty Program ID: Example: MAM
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramCode()
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Loyalty Program Name. Example: Miles and More
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramName()
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Name of the organization providing the Loyalty Program.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProviderName()
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Loyalty Program information URL. Example: https://www.britishairways.com/en-gb/executive-club/about-the-club
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getURL()
     */
    public void setURL(String value) {
        this.url = value;
    }

}
