
package com.github.surajcm.online.travel.schema.response.offer;

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
 *         <element name="DestCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IATA_LocationCodeType"/>
 *         <element name="OriginCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IATA_LocationCodeType"/>
 *         <element name="OriginDestID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *         <element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "destCode",
    "originCode",
    "originDestID",
    "paxJourneyRefID"
})
public class OriginDestType {

    /**
     * IATA defined code identifying a city or station.
     * 
     */
    @XmlElement(name = "DestCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String destCode;
    /**
     * IATA defined code identifying a city or station.
     * 
     */
    @XmlElement(name = "OriginCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originCode;
    /**
     * Uniquely identifies an Origin Destination within the context of one message.
     * 
     */
    @XmlElement(name = "OriginDestID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;
    /**
     * Uniquely identifies a Passenger Journey within the context of one message.
     * 
     */
    @XmlElement(name = "PaxJourneyRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxJourneyRefID;

    /**
     * IATA defined code identifying a city or station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCode() {
        return destCode;
    }

    /**
     * Sets the value of the destCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDestCode()
     */
    public void setDestCode(String value) {
        this.destCode = value;
    }

    /**
     * IATA defined code identifying a city or station.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Sets the value of the originCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginCode()
     */
    public void setOriginCode(String value) {
        this.originCode = value;
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
     * Uniquely identifies a Passenger Journey within the context of one message.
     * 
     * Gets the value of the paxJourneyRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourneyRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxJourneyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the paxJourneyRefID property.
     */
    public List<String> getPaxJourneyRefID() {
        if (paxJourneyRefID == null) {
            paxJourneyRefID = new ArrayList<>();
        }
        return this.paxJourneyRefID;
    }

}
