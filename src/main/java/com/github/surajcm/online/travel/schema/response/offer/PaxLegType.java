
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Transportation of a passenger on a Dated Operating Leg.
 * 
 * <p>Java class for PaxLegType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxLegType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DatedOperatingLeg" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DatedOperatingLegType"/>
 *         <element name="PaxLegID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxLegType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "datedOperatingLeg",
    "paxLegID"
})
public class PaxLegType {

    /**
     * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc.
     * 
     */
    @XmlElement(name = "DatedOperatingLeg", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected DatedOperatingLegType datedOperatingLeg;
    /**
     * Uniquely identifies a Passenger Leg within the context of one message.
     * 
     */
    @XmlElement(name = "PaxLegID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxLegID;

    /**
     * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegType }
     *     
     */
    public DatedOperatingLegType getDatedOperatingLeg() {
        return datedOperatingLeg;
    }

    /**
     * Sets the value of the datedOperatingLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegType }
     *     
     * @see #getDatedOperatingLeg()
     */
    public void setDatedOperatingLeg(DatedOperatingLegType value) {
        this.datedOperatingLeg = value;
    }

    /**
     * Uniquely identifies a Passenger Leg within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxLegID() {
        return paxLegID;
    }

    /**
     * Sets the value of the paxLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxLegID()
     */
    public void setPaxLegID(String value) {
        this.paxLegID = value;
    }

}
