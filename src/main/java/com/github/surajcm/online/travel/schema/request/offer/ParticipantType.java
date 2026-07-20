
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to parties relevant to the contents of this message.
 * 
 * <p>Java class for ParticipantType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ParticipantType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Aggregator" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AggregatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Corporation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CorporationType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EnabledSystem" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}EnabledSystemType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MarketingCarrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CarrierType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OperatingCarrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CarrierType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ORA" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CarrierType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="POA" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CarrierType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RetailPartner" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RetailPartnerType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TravelAgency" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TravelAgencyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
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
public class ParticipantType {

    /**
     * An entity who distributes a Sellerâ€™s shopping request to multiple Airlines and aggregates subsequent responses.
     * 
     */
    @XmlElement(name = "Aggregator", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<AggregatorType> aggregator;
    /**
     * A company or group of people authorized to act as a single entity (legally a person) and recognized as such in law.
     * 
     */
    @XmlElement(name = "Corporation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CorporationType> corporation;
    /**
     * NDC-enabled system.
     * 
     */
    @XmlElement(name = "EnabledSystem", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<EnabledSystemType> enabledSystem;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "MarketingCarrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CarrierType> marketingCarrier;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "OperatingCarrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CarrierType> operatingCarrier;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "ORA", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CarrierType> ora;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "POA", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CarrierType> poa;
    /**
     * A company that partners with a manufacturer or producer to market and sell the manufacturer's products, services, or technologies.
     * 
     */
    @XmlElement(name = "RetailPartner", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<RetailPartnerType> retailPartner;
    /**
     * A private retailer or public service that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
     * 
     */
    @XmlElement(name = "TravelAgency", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<TravelAgencyType> travelAgency;

    /**
     * An entity who distributes a Sellerâ€™s shopping request to multiple Airlines and aggregates subsequent responses.
     * 
     * Gets the value of the aggregator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAggregator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregatorType }
     * </p>
     * 
     * 
     * @return
     *     The value of the aggregator property.
     */
    public List<AggregatorType> getAggregator() {
        if (aggregator == null) {
            aggregator = new ArrayList<>();
        }
        return this.aggregator;
    }

    /**
     * A company or group of people authorized to act as a single entity (legally a person) and recognized as such in law.
     * 
     * Gets the value of the corporation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCorporation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the corporation property.
     */
    public List<CorporationType> getCorporation() {
        if (corporation == null) {
            corporation = new ArrayList<>();
        }
        return this.corporation;
    }

    /**
     * NDC-enabled system.
     * 
     * Gets the value of the enabledSystem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enabledSystem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnabledSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnabledSystemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the enabledSystem property.
     */
    public List<EnabledSystemType> getEnabledSystem() {
        if (enabledSystem == null) {
            enabledSystem = new ArrayList<>();
        }
        return this.enabledSystem;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * Gets the value of the marketingCarrier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingCarrier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMarketingCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * </p>
     * 
     * 
     * @return
     *     The value of the marketingCarrier property.
     */
    public List<CarrierType> getMarketingCarrier() {
        if (marketingCarrier == null) {
            marketingCarrier = new ArrayList<>();
        }
        return this.marketingCarrier;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * Gets the value of the operatingCarrier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingCarrier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperatingCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * </p>
     * 
     * 
     * @return
     *     The value of the operatingCarrier property.
     */
    public List<CarrierType> getOperatingCarrier() {
        if (operatingCarrier == null) {
            operatingCarrier = new ArrayList<>();
        }
        return this.operatingCarrier;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * Gets the value of the ora property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ora property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getORA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * </p>
     * 
     * 
     * @return
     *     The value of the ora property.
     */
    public List<CarrierType> getORA() {
        if (ora == null) {
            ora = new ArrayList<>();
        }
        return this.ora;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * Gets the value of the poa property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poa property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPOA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * </p>
     * 
     * 
     * @return
     *     The value of the poa property.
     */
    public List<CarrierType> getPOA() {
        if (poa == null) {
            poa = new ArrayList<>();
        }
        return this.poa;
    }

    /**
     * A company that partners with a manufacturer or producer to market and sell the manufacturer's products, services, or technologies.
     * 
     * Gets the value of the retailPartner property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPartner property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRetailPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPartnerType }
     * </p>
     * 
     * 
     * @return
     *     The value of the retailPartner property.
     */
    public List<RetailPartnerType> getRetailPartner() {
        if (retailPartner == null) {
            retailPartner = new ArrayList<>();
        }
        return this.retailPartner;
    }

    /**
     * A private retailer or public service that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
     * 
     * Gets the value of the travelAgency property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelAgency property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTravelAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelAgencyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the travelAgency property.
     */
    public List<TravelAgencyType> getTravelAgency() {
        if (travelAgency == null) {
            travelAgency = new ArrayList<>();
        }
        return this.travelAgency;
    }

}
