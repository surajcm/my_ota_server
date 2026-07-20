
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
 * <p>Java class for FareGroupType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FareGroupType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FareCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodeType"/>
 *         <element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FareGroupID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareGroupType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "fareCode",
    "fareDetail",
    "fareGroupID"
})
public class FareGroupType {

    /**
     * Fare Type Code. Examples: 70J, Published Fares 70K, Dynamic Discounted Fares 749, Negotiated Fares 756, One Way Fare 758, Private Fares Encoding Scheme: PADIS codeset element 9910 - Fare Qualifier
     * 
     */
    @XmlElement(name = "FareCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareCode;
    /**
     * The amount charged by the carrier for the carriage of a passenger and his allowable free baggage.
     * 
     */
    @XmlElement(name = "FareDetail", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<FareDetailType> fareDetail;
    /**
     * Unique identifier for this Fare Group
     * 
     */
    @XmlElement(name = "FareGroupID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareGroupID;

    /**
     * Fare Type Code. Examples: 70J, Published Fares 70K, Dynamic Discounted Fares 749, Negotiated Fares 756, One Way Fare 758, Private Fares Encoding Scheme: PADIS codeset element 9910 - Fare Qualifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * Sets the value of the fareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareCode()
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * The amount charged by the carrier for the carriage of a passenger and his allowable free baggage.
     * 
     * Gets the value of the fareDetail property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareDetail property.
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<>();
        }
        return this.fareDetail;
    }

    /**
     * Unique identifier for this Fare Group
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareGroupID() {
        return fareGroupID;
    }

    /**
     * Sets the value of the fareGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareGroupID()
     */
    public void setFareGroupID(String value) {
        this.fareGroupID = value;
    }

}
