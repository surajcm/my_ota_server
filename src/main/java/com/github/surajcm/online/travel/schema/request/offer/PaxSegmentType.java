
package com.github.surajcm.online.travel.schema.request.offer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Transportation of a passenger on a Dated Operating Segment.
 * 
 * <p>Java class for PaxSegmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxSegmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ARNK_Ind" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TransportArrivalType"/>
 *         <element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CabinTypeType" minOccurs="0"/>
 *         <element name="DatedOperatingLeg" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DatedOperatingLegType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dep" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TransportDepType"/>
 *         <element name="Duration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DurationType" minOccurs="0"/>
 *         <element name="InterlineSettlementInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}InterlineSettlementInfoType" minOccurs="0"/>
 *         <element name="MarketingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DatedMarketingSegmentType"/>
 *         <element name="MarketingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RBD_CodeType" minOccurs="0"/>
 *         <element name="OperatingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DatedOperatingSegmentType" minOccurs="0"/>
 *         <element name="OperatingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RBD_CodeType" minOccurs="0"/>
 *         <element name="PaxSegmentID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="SecureFlightInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="SegmentTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SegmentTypeCodeType" minOccurs="0"/>
 *         <element name="TicketlessInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "arnkInd",
    "arrival",
    "cabinType",
    "datedOperatingLeg",
    "dep",
    "duration",
    "interlineSettlementInfo",
    "marketingCarrierInfo",
    "marketingCarrierRBDCode",
    "operatingCarrierInfo",
    "operatingCarrierRBDCode",
    "paxSegmentID",
    "secureFlightInd",
    "segmentTypeCode",
    "ticketlessInd"
})
public class PaxSegmentType {

    /**
     * When TRUE, indicates an ARNK (ARrival uNKown) condition, i.e. a gap between current segment departure and previous segment arrival location, implying an unknown passenger movement.
     * 
     */
    @XmlElement(name = "ARNK_Ind", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean arnkInd;
    /**
     * The action or process of arriving of a transport vehicle in any place or location.
     * 
     */
    @XmlElement(name = "Arrival", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected TransportArrivalType arrival;
    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "CabinType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected CabinTypeType cabinType;
    /**
     * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc.
     * 
     */
    @XmlElement(name = "DatedOperatingLeg", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<DatedOperatingLegType> datedOperatingLeg;
    /**
     * The action or process of leaving of a transport vehicle from any place or location.
     * 
     */
    @XmlElement(name = "Dep", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected TransportDepType dep;
    /**
     * Total segment time including the combined air time and connection times of any legs.
     * 
     */
    @XmlElement(name = "Duration", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Duration duration;
    /**
     * Information related to the value of a product or service as it pertains to interline transactions.
     * 
     */
    @XmlElement(name = "InterlineSettlementInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected InterlineSettlementInfoType interlineSettlementInfo;
    /**
     * The commercial designation under which a Dated Operating Segment can be booked, either under the operating carrier's designator or that of another carrier (codeshare).
     * 
     */
    @XmlElement(name = "MarketingCarrierInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected DatedMarketingSegmentType marketingCarrierInfo;
    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     */
    @XmlElement(name = "MarketingCarrierRBD_Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String marketingCarrierRBDCode;
    /**
     * An operation between board point and any subsequent off point within the same flight designator. Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc.
     * 
     */
    @XmlElement(name = "OperatingCarrierInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DatedOperatingSegmentType operatingCarrierInfo;
    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     */
    @XmlElement(name = "OperatingCarrierRBD_Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operatingCarrierRBDCode;
    /**
     * Uniquely identifies a Passenger Segment within the context of one message.
     * 
     */
    @XmlElement(name = "PaxSegmentID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentID;
    /**
     * When TRUE, this segment is subject to US TSA 'Secure Flight' passenger prescreening program.
     * 
     */
    @XmlElement(name = "SecureFlightInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean secureFlightInd;
    /**
     * Defines the operational flight segment type (e.g. Open, Passive, Service).  Encoding Scheme: IATA PADIS 1.4 Codeset FST - Flight Segment Type
     * 
     */
    @XmlElement(name = "SegmentTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String segmentTypeCode;
    /**
     * When TRUE, there are no ticket records, as defined by IATA Resolutions, expected to be issued for this segment.
     * 
     */
    @XmlElement(name = "TicketlessInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean ticketlessInd;

    /**
     * When TRUE, indicates an ARNK (ARrival uNKown) condition, i.e. a gap between current segment departure and previous segment arrival location, implying an unknown passenger movement.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isARNKInd() {
        return arnkInd;
    }

    /**
     * Sets the value of the arnkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isARNKInd()
     */
    public void setARNKInd(Boolean value) {
        this.arnkInd = value;
    }

    /**
     * The action or process of arriving of a transport vehicle in any place or location.
     * 
     * @return
     *     possible object is
     *     {@link TransportArrivalType }
     *     
     */
    public TransportArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportArrivalType }
     *     
     * @see #getArrival()
     */
    public void setArrival(TransportArrivalType value) {
        this.arrival = value;
    }

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     * @see #getCabinType()
     */
    public void setCabinType(CabinTypeType value) {
        this.cabinType = value;
    }

    /**
     * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc.
     * 
     * Gets the value of the datedOperatingLeg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedOperatingLeg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDatedOperatingLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedOperatingLegType }
     * </p>
     * 
     * 
     * @return
     *     The value of the datedOperatingLeg property.
     */
    public List<DatedOperatingLegType> getDatedOperatingLeg() {
        if (datedOperatingLeg == null) {
            datedOperatingLeg = new ArrayList<>();
        }
        return this.datedOperatingLeg;
    }

    /**
     * The action or process of leaving of a transport vehicle from any place or location.
     * 
     * @return
     *     possible object is
     *     {@link TransportDepType }
     *     
     */
    public TransportDepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDepType }
     *     
     * @see #getDep()
     */
    public void setDep(TransportDepType value) {
        this.dep = value;
    }

    /**
     * Total segment time including the combined air time and connection times of any legs.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getDuration()
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Information related to the value of a product or service as it pertains to interline transactions.
     * 
     * @return
     *     possible object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    public InterlineSettlementInfoType getInterlineSettlementInfo() {
        return interlineSettlementInfo;
    }

    /**
     * Sets the value of the interlineSettlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineSettlementInfoType }
     *     
     * @see #getInterlineSettlementInfo()
     */
    public void setInterlineSettlementInfo(InterlineSettlementInfoType value) {
        this.interlineSettlementInfo = value;
    }

    /**
     * The commercial designation under which a Dated Operating Segment can be booked, either under the operating carrier's designator or that of another carrier (codeshare).
     * 
     * @return
     *     possible object is
     *     {@link DatedMarketingSegmentType }
     *     
     */
    public DatedMarketingSegmentType getMarketingCarrierInfo() {
        return marketingCarrierInfo;
    }

    /**
     * Sets the value of the marketingCarrierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedMarketingSegmentType }
     *     
     * @see #getMarketingCarrierInfo()
     */
    public void setMarketingCarrierInfo(DatedMarketingSegmentType value) {
        this.marketingCarrierInfo = value;
    }

    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrierRBDCode() {
        return marketingCarrierRBDCode;
    }

    /**
     * Sets the value of the marketingCarrierRBDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMarketingCarrierRBDCode()
     */
    public void setMarketingCarrierRBDCode(String value) {
        this.marketingCarrierRBDCode = value;
    }

    /**
     * An operation between board point and any subsequent off point within the same flight designator. Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingSegmentType }
     *     
     */
    public DatedOperatingSegmentType getOperatingCarrierInfo() {
        return operatingCarrierInfo;
    }

    /**
     * Sets the value of the operatingCarrierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingSegmentType }
     *     
     * @see #getOperatingCarrierInfo()
     */
    public void setOperatingCarrierInfo(DatedOperatingSegmentType value) {
        this.operatingCarrierInfo = value;
    }

    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierRBDCode() {
        return operatingCarrierRBDCode;
    }

    /**
     * Sets the value of the operatingCarrierRBDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingCarrierRBDCode()
     */
    public void setOperatingCarrierRBDCode(String value) {
        this.operatingCarrierRBDCode = value;
    }

    /**
     * Uniquely identifies a Passenger Segment within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentID() {
        return paxSegmentID;
    }

    /**
     * Sets the value of the paxSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxSegmentID()
     */
    public void setPaxSegmentID(String value) {
        this.paxSegmentID = value;
    }

    /**
     * When TRUE, this segment is subject to US TSA 'Secure Flight' passenger prescreening program.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecureFlightInd() {
        return secureFlightInd;
    }

    /**
     * Sets the value of the secureFlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSecureFlightInd()
     */
    public void setSecureFlightInd(Boolean value) {
        this.secureFlightInd = value;
    }

    /**
     * Defines the operational flight segment type (e.g. Open, Passive, Service).  Encoding Scheme: IATA PADIS 1.4 Codeset FST - Flight Segment Type
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentTypeCode() {
        return segmentTypeCode;
    }

    /**
     * Sets the value of the segmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSegmentTypeCode()
     */
    public void setSegmentTypeCode(String value) {
        this.segmentTypeCode = value;
    }

    /**
     * When TRUE, there are no ticket records, as defined by IATA Resolutions, expected to be issued for this segment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketlessInd() {
        return ticketlessInd;
    }

    /**
     * Sets the value of the ticketlessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTicketlessInd()
     */
    public void setTicketlessInd(Boolean value) {
        this.ticketlessInd = value;
    }

}
