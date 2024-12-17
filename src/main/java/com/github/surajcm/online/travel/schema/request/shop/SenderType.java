
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to the party sending this message.
 * 
 * <p>Java class for SenderType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SenderType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Aggregator" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AggregatorType"/>
 *         <element name="Corporation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CorporationType"/>
 *         <element name="EnabledSystem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}EnabledSystemType"/>
 *         <element name="MarketingCarrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType"/>
 *         <element name="OperatingCarrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType"/>
 *         <element name="ORA" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType"/>
 *         <element name="POA" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CarrierType"/>
 *         <element name="RetailPartner" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RetailPartnerType"/>
 *         <element name="TravelAgency" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TravelAgencyType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "aggregator",
    "corporation",
    "enabledSystem",
    "marketingCarrier",
    "operatingCarrier",
    "ora",
    "poa",
    "retailPartner",
    "travelAgency"
})
public class SenderType {

    /**
     * An entity who distributes a Sellerâ€™s shopping request to multiple Airlines and aggregates subsequent responses.
     * 
     */
    @XmlElement(name = "Aggregator", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AggregatorType aggregator;
    /**
     * A company or group of people authorized to act as a single entity (legally a person) and recognized as such in law.
     * 
     */
    @XmlElement(name = "Corporation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CorporationType corporation;
    /**
     * NDC-enabled system.
     * 
     */
    @XmlElement(name = "EnabledSystem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected EnabledSystemType enabledSystem;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "MarketingCarrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CarrierType marketingCarrier;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "OperatingCarrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CarrierType operatingCarrier;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "ORA", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CarrierType ora;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "POA", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CarrierType poa;
    /**
     * Retail Partner
     * 
     */
    @XmlElement(name = "RetailPartner", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected RetailPartnerType retailPartner;
    /**
     * A private retailer or public service that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
     * 
     */
    @XmlElement(name = "TravelAgency", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected TravelAgencyType travelAgency;

    /**
     * An entity who distributes a Sellerâ€™s shopping request to multiple Airlines and aggregates subsequent responses.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorType }
     *     
     */
    public AggregatorType getAggregator() {
        return aggregator;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorType }
     *     
     * @see #getAggregator()
     */
    public void setAggregator(AggregatorType value) {
        this.aggregator = value;
    }

    /**
     * A company or group of people authorized to act as a single entity (legally a person) and recognized as such in law.
     * 
     * @return
     *     possible object is
     *     {@link CorporationType }
     *     
     */
    public CorporationType getCorporation() {
        return corporation;
    }

    /**
     * Sets the value of the corporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporationType }
     *     
     * @see #getCorporation()
     */
    public void setCorporation(CorporationType value) {
        this.corporation = value;
    }

    /**
     * NDC-enabled system.
     * 
     * @return
     *     possible object is
     *     {@link EnabledSystemType }
     *     
     */
    public EnabledSystemType getEnabledSystem() {
        return enabledSystem;
    }

    /**
     * Sets the value of the enabledSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledSystemType }
     *     
     * @see #getEnabledSystem()
     */
    public void setEnabledSystem(EnabledSystemType value) {
        this.enabledSystem = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getMarketingCarrier()
     */
    public void setMarketingCarrier(CarrierType value) {
        this.marketingCarrier = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getOperatingCarrier()
     */
    public void setOperatingCarrier(CarrierType value) {
        this.operatingCarrier = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getORA() {
        return ora;
    }

    /**
     * Sets the value of the ora property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getORA()
     */
    public void setORA(CarrierType value) {
        this.ora = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getPOA() {
        return poa;
    }

    /**
     * Sets the value of the poa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getPOA()
     */
    public void setPOA(CarrierType value) {
        this.poa = value;
    }

    /**
     * Retail Partner
     * 
     * @return
     *     possible object is
     *     {@link RetailPartnerType }
     *     
     */
    public RetailPartnerType getRetailPartner() {
        return retailPartner;
    }

    /**
     * Sets the value of the retailPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailPartnerType }
     *     
     * @see #getRetailPartner()
     */
    public void setRetailPartner(RetailPartnerType value) {
        this.retailPartner = value;
    }

    /**
     * A private retailer or public service that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getTravelAgency() {
        return travelAgency;
    }

    /**
     * Sets the value of the travelAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     * @see #getTravelAgency()
     */
    public void setTravelAgency(TravelAgencyType value) {
        this.travelAgency = value;
    }

}
