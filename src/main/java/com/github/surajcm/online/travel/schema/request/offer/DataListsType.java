
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data List definition for this message.
 * 
 * <p>Java class for DataListsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DataListsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageAllowanceList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BaggageAllowanceListType" minOccurs="0"/>
 *         <element name="BaggageDisclosureList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BaggageDisclosureListType" minOccurs="0"/>
 *         <element name="ContactInfoList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ContactInfoListType" minOccurs="0"/>
 *         <element name="DisclosureList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DisclosureListType" minOccurs="0"/>
 *         <element name="FareList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}FareListType" minOccurs="0"/>
 *         <element name="MediaList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}MediaListType" minOccurs="0"/>
 *         <element name="OriginDestList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OriginDestListType" minOccurs="0"/>
 *         <element name="PaxJourneyList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaxJourneyListType" minOccurs="0"/>
 *         <element name="PaxList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaxListType" minOccurs="0"/>
 *         <element name="PaxSegmentList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaxSegmentListType" minOccurs="0"/>
 *         <element name="PenaltyList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PenaltyListType" minOccurs="0"/>
 *         <element name="PriceClassList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PriceClassListType" minOccurs="0"/>
 *         <element name="SeatProfileList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatProfileListType" minOccurs="0"/>
 *         <element name="ServiceDefinitionList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceDefinitionListType" minOccurs="0"/>
 *         <element name="TermsList" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TermsListType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataListsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "baggageAllowanceList",
    "baggageDisclosureList",
    "contactInfoList",
    "disclosureList",
    "fareList",
    "mediaList",
    "originDestList",
    "paxJourneyList",
    "paxList",
    "paxSegmentList",
    "penaltyList",
    "priceClassList",
    "seatProfileList",
    "serviceDefinitionList",
    "termsList"
})
public class DataListsType {

    /**
     * Baggage allowance data list definition
     * 
     */
    @XmlElement(name = "BaggageAllowanceList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BaggageAllowanceListType baggageAllowanceList;
    /**
     * Baggage disclosure data list definition.
     * 
     */
    @XmlElement(name = "BaggageDisclosureList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BaggageDisclosureListType baggageDisclosureList;
    /**
     * Contact info data list definition.
     * 
     */
    @XmlElement(name = "ContactInfoList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ContactInfoListType contactInfoList;
    /**
     * Disclosure data list definition.
     * 
     */
    @XmlElement(name = "DisclosureList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DisclosureListType disclosureList;
    /**
     * Fare List definition
     * 
     */
    @XmlElement(name = "FareList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected FareListType fareList;
    /**
     * Media data list definition.
     * 
     */
    @XmlElement(name = "MediaList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected MediaListType mediaList;
    /**
     * Origin Destination data list definition.
     * 
     */
    @XmlElement(name = "OriginDestList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected OriginDestListType originDestList;
    /**
     * Journey data list definition.
     * 
     */
    @XmlElement(name = "PaxJourneyList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PaxJourneyListType paxJourneyList;
    /**
     * Passenger data list definition.
     * 
     */
    @XmlElement(name = "PaxList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PaxListType paxList;
    /**
     * Segment data list definition.
     * 
     */
    @XmlElement(name = "PaxSegmentList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PaxSegmentListType paxSegmentList;
    /**
     * Penalty data list definition.
     * 
     */
    @XmlElement(name = "PenaltyList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PenaltyListType penaltyList;
    /**
     * Price Class data list definition.
     * 
     */
    @XmlElement(name = "PriceClassList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PriceClassListType priceClassList;
    /**
     * Seat Profile data list definition.
     * 
     */
    @XmlElement(name = "SeatProfileList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SeatProfileListType seatProfileList;
    /**
     * Service Definition data list definition.
     * 
     */
    @XmlElement(name = "ServiceDefinitionList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ServiceDefinitionListType serviceDefinitionList;
    /**
     * Offer/Order Terms list
     * 
     */
    @XmlElement(name = "TermsList", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected TermsListType termsList;

    /**
     * Baggage allowance data list definition
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceListType }
     *     
     */
    public BaggageAllowanceListType getBaggageAllowanceList() {
        return baggageAllowanceList;
    }

    /**
     * Sets the value of the baggageAllowanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceListType }
     *     
     * @see #getBaggageAllowanceList()
     */
    public void setBaggageAllowanceList(BaggageAllowanceListType value) {
        this.baggageAllowanceList = value;
    }

    /**
     * Baggage disclosure data list definition.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDisclosureListType }
     *     
     */
    public BaggageDisclosureListType getBaggageDisclosureList() {
        return baggageDisclosureList;
    }

    /**
     * Sets the value of the baggageDisclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDisclosureListType }
     *     
     * @see #getBaggageDisclosureList()
     */
    public void setBaggageDisclosureList(BaggageDisclosureListType value) {
        this.baggageDisclosureList = value;
    }

    /**
     * Contact info data list definition.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoListType }
     *     
     */
    public ContactInfoListType getContactInfoList() {
        return contactInfoList;
    }

    /**
     * Sets the value of the contactInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoListType }
     *     
     * @see #getContactInfoList()
     */
    public void setContactInfoList(ContactInfoListType value) {
        this.contactInfoList = value;
    }

    /**
     * Disclosure data list definition.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureListType }
     *     
     */
    public DisclosureListType getDisclosureList() {
        return disclosureList;
    }

    /**
     * Sets the value of the disclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureListType }
     *     
     * @see #getDisclosureList()
     */
    public void setDisclosureList(DisclosureListType value) {
        this.disclosureList = value;
    }

    /**
     * Fare List definition
     * 
     * @return
     *     possible object is
     *     {@link FareListType }
     *     
     */
    public FareListType getFareList() {
        return fareList;
    }

    /**
     * Sets the value of the fareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareListType }
     *     
     * @see #getFareList()
     */
    public void setFareList(FareListType value) {
        this.fareList = value;
    }

    /**
     * Media data list definition.
     * 
     * @return
     *     possible object is
     *     {@link MediaListType }
     *     
     */
    public MediaListType getMediaList() {
        return mediaList;
    }

    /**
     * Sets the value of the mediaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaListType }
     *     
     * @see #getMediaList()
     */
    public void setMediaList(MediaListType value) {
        this.mediaList = value;
    }

    /**
     * Origin Destination data list definition.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestListType }
     *     
     */
    public OriginDestListType getOriginDestList() {
        return originDestList;
    }

    /**
     * Sets the value of the originDestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestListType }
     *     
     * @see #getOriginDestList()
     */
    public void setOriginDestList(OriginDestListType value) {
        this.originDestList = value;
    }

    /**
     * Journey data list definition.
     * 
     * @return
     *     possible object is
     *     {@link PaxJourneyListType }
     *     
     */
    public PaxJourneyListType getPaxJourneyList() {
        return paxJourneyList;
    }

    /**
     * Sets the value of the paxJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxJourneyListType }
     *     
     * @see #getPaxJourneyList()
     */
    public void setPaxJourneyList(PaxJourneyListType value) {
        this.paxJourneyList = value;
    }

    /**
     * Passenger data list definition.
     * 
     * @return
     *     possible object is
     *     {@link PaxListType }
     *     
     */
    public PaxListType getPaxList() {
        return paxList;
    }

    /**
     * Sets the value of the paxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxListType }
     *     
     * @see #getPaxList()
     */
    public void setPaxList(PaxListType value) {
        this.paxList = value;
    }

    /**
     * Segment data list definition.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentListType }
     *     
     */
    public PaxSegmentListType getPaxSegmentList() {
        return paxSegmentList;
    }

    /**
     * Sets the value of the paxSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentListType }
     *     
     * @see #getPaxSegmentList()
     */
    public void setPaxSegmentList(PaxSegmentListType value) {
        this.paxSegmentList = value;
    }

    /**
     * Penalty data list definition.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyListType }
     *     
     */
    public PenaltyListType getPenaltyList() {
        return penaltyList;
    }

    /**
     * Sets the value of the penaltyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyListType }
     *     
     * @see #getPenaltyList()
     */
    public void setPenaltyList(PenaltyListType value) {
        this.penaltyList = value;
    }

    /**
     * Price Class data list definition.
     * 
     * @return
     *     possible object is
     *     {@link PriceClassListType }
     *     
     */
    public PriceClassListType getPriceClassList() {
        return priceClassList;
    }

    /**
     * Sets the value of the priceClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceClassListType }
     *     
     * @see #getPriceClassList()
     */
    public void setPriceClassList(PriceClassListType value) {
        this.priceClassList = value;
    }

    /**
     * Seat Profile data list definition.
     * 
     * @return
     *     possible object is
     *     {@link SeatProfileListType }
     *     
     */
    public SeatProfileListType getSeatProfileList() {
        return seatProfileList;
    }

    /**
     * Sets the value of the seatProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatProfileListType }
     *     
     * @see #getSeatProfileList()
     */
    public void setSeatProfileList(SeatProfileListType value) {
        this.seatProfileList = value;
    }

    /**
     * Service Definition data list definition.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionListType }
     *     
     */
    public ServiceDefinitionListType getServiceDefinitionList() {
        return serviceDefinitionList;
    }

    /**
     * Sets the value of the serviceDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionListType }
     *     
     * @see #getServiceDefinitionList()
     */
    public void setServiceDefinitionList(ServiceDefinitionListType value) {
        this.serviceDefinitionList = value;
    }

    /**
     * Offer/Order Terms list
     * 
     * @return
     *     possible object is
     *     {@link TermsListType }
     *     
     */
    public TermsListType getTermsList() {
        return termsList;
    }

    /**
     * Sets the value of the termsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsListType }
     *     
     * @see #getTermsList()
     */
    public void setTermsList(TermsListType value) {
        this.termsList = value;
    }

}
