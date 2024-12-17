
package com.github.surajcm.online.travel.schema.request.shop;

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
 *         <element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TransportArrivalType"/>
 *         <element name="Dep" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TransportDepType"/>
 *         <element name="MarketingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DatedMarketingSegmentType"/>
 *         <element name="MarketingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RBD_CodeType" minOccurs="0"/>
 *         <element name="OperatingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DatedOperatingSegmentType" minOccurs="0"/>
 *         <element name="OperatingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RBD_CodeType" minOccurs="0"/>
 *         <element name="PaxSegmentID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "arrival",
    "dep",
    "marketingCarrierInfo",
    "marketingCarrierRBDCode",
    "operatingCarrierInfo",
    "operatingCarrierRBDCode",
    "paxSegmentID"
})
public class PaxSegmentType {

    /**
     * The action or process of arriving of a transport vehicle in any place or location.
     * 
     */
    @XmlElement(name = "Arrival", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected TransportArrivalType arrival;
    /**
     * The action or process of leaving of a transport vehicle from any place or location.
     * 
     */
    @XmlElement(name = "Dep", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected TransportDepType dep;
    /**
     * The commercial designation under which a Dated Operating Segment can be booked, either under the operating carrier's designator or that of another carrier (codeshare).
     * 
     */
    @XmlElement(name = "MarketingCarrierInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected DatedMarketingSegmentType marketingCarrierInfo;
    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     */
    @XmlElement(name = "MarketingCarrierRBD_Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String marketingCarrierRBDCode;
    /**
     * An operation between board point and any subsequent off point within the same flight designator. Could be one or more legs. Could also be used for other transport vehicles such as train or bus etc.
     * 
     */
    @XmlElement(name = "OperatingCarrierInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DatedOperatingSegmentType operatingCarrierInfo;
    /**
     * Code used to identify a particular RBD (e.g. P, J, W, M, etc.).
     * 
     */
    @XmlElement(name = "OperatingCarrierRBD_Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operatingCarrierRBDCode;
    /**
     * Uniquely identifies a Passenger Segment within the context of one message.
     * 
     */
    @XmlElement(name = "PaxSegmentID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentID;

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

}
