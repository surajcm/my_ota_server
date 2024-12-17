
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
 * 
 * <p>Java class for OriginDestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OriginDestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_LocationCodeType"/>
 *         <element name="OriginDestID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_LocationCodeType"/>
 *         <element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaxJourneyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "destStationCode",
    "originDestID",
    "originStationCode",
    "paxJourney"
})
public class OriginDestType {

    /**
     * IATA defined code identifying a city or station.
     * 
     */
    @XmlElement(name = "DestStationCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String destStationCode;
    /**
     * Uniquely identifies an Origin Destination within the context of one message.
     * 
     */
    @XmlElement(name = "OriginDestID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;
    /**
     * IATA defined code identifying a city or station.
     * 
     */
    @XmlElement(name = "OriginStationCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originStationCode;
    /**
     * A collection of segments which satisfies transportation of a passenger for a given origin and destination.
     * 
     */
    @XmlElement(name = "PaxJourney", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<PaxJourneyType> paxJourney;

    /**
     * IATA defined code identifying a city or station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestStationCode() {
        return destStationCode;
    }

    /**
     * Sets the value of the destStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestStationCode()
     */
    public void setDestStationCode(String value) {
        this.destStationCode = value;
    }

    /**
     * Uniquely identifies an Origin Destination within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestID() {
        return originDestID;
    }

    /**
     * Sets the value of the originDestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginDestID()
     */
    public void setOriginDestID(String value) {
        this.originDestID = value;
    }

    /**
     * IATA defined code identifying a city or station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationCode() {
        return originStationCode;
    }

    /**
     * Sets the value of the originStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginStationCode()
     */
    public void setOriginStationCode(String value) {
        this.originStationCode = value;
    }

    /**
     * A collection of segments which satisfies transportation of a passenger for a given origin and destination.
     * 
     * Gets the value of the paxJourney property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourney property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxJourneyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paxJourney property.
     */
    public List<PaxJourneyType> getPaxJourney() {
        if (paxJourney == null) {
            paxJourney = new ArrayList<>();
        }
        return this.paxJourney;
    }

}
