
package com.github.surajcm.online.travel.schema.request.shop;

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
 * A collection of segments which satisfies transportation of a passenger for a given origin and destination.
 * 
 * <p>Java class for PaxJourneyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxJourneyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         <element name="Duration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DurationType" minOccurs="0"/>
 *         <element name="PaxJourneyID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="PaxSegment" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaxSegmentType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxJourneyType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "distanceMeasure",
    "duration",
    "paxJourneyID",
    "paxSegment"
})
public class PaxJourneyType {

    /**
     * Total distance between the beginning and end stations of a leg, measured by the great circle of the earth.
     * 
     */
    @XmlElement(name = "DistanceMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MeasureType distanceMeasure;
    /**
     * Total journey time including the combined air time and connection times. In case of stopover, this may or may not include stopover durations.
     * 
     */
    @XmlElement(name = "Duration", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Duration duration;
    /**
     * Uniquely identifies a Passenger Journey within the context of one message.
     * 
     */
    @XmlElement(name = "PaxJourneyID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxJourneyID;
    /**
     * Transportation of a passenger on a Dated Operating Segment.
     * 
     */
    @XmlElement(name = "PaxSegment", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected List<PaxSegmentType> paxSegment;

    /**
     * Total distance between the beginning and end stations of a leg, measured by the great circle of the earth.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDistanceMeasure() {
        return distanceMeasure;
    }

    /**
     * Sets the value of the distanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getDistanceMeasure()
     */
    public void setDistanceMeasure(MeasureType value) {
        this.distanceMeasure = value;
    }

    /**
     * Total journey time including the combined air time and connection times. In case of stopover, this may or may not include stopover durations.
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
     * Uniquely identifies a Passenger Journey within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxJourneyID() {
        return paxJourneyID;
    }

    /**
     * Sets the value of the paxJourneyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxJourneyID()
     */
    public void setPaxJourneyID(String value) {
        this.paxJourneyID = value;
    }

    /**
     * Transportation of a passenger on a Dated Operating Segment.
     * 
     * Gets the value of the paxSegment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxSegment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxSegmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paxSegment property.
     */
    public List<PaxSegmentType> getPaxSegment() {
        if (paxSegment == null) {
            paxSegment = new ArrayList<>();
        }
        return this.paxSegment;
    }

}
