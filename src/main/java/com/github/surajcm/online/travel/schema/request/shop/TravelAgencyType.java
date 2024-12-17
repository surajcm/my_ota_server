
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
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
 * A private retailer or public service that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
 * 
 * <p>Java class for TravelAgencyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TravelAgencyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgencyID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IATA_Number" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="PseudoCityID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="TravelAgent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TravelAgentType" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TravelAgencyTypeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgencyType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "agencyID",
    "contactInfo",
    "iataNumber",
    "name",
    "pseudoCityID",
    "travelAgent",
    "typeCode"
})
public class TravelAgencyType {

    /**
     * Unique Agency Seller ID. Example: CTRV
     * 
     */
    @XmlElement(name = "AgencyID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String agencyID;
    /**
     * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
     * 
     */
    @XmlElement(name = "ContactInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ContactInfoType> contactInfo;
    /**
     * IATA-assigned agency number. Example: 98417900
     * 
     */
    @XmlElement(name = "IATA_Number", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal iataNumber;
    /**
     * Agency name. Example: Carson Travel
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    /**
     * An identifier for a corporate user of a computer reservation system (CRS) or global distribution system (GDS), typically a travel agency. Also known as Office ID.
     * 
     */
    @XmlElement(name = "PseudoCityID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pseudoCityID;
    /**
     * Individual agent who solicits and procures business from potential customers on behalf of one or more principals, usually against payment of a percentage of the realized sales revenue as commission.
     * 
     */
    @XmlElement(name = "TravelAgent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected TravelAgentType travelAgent;
    /**
     * Agency type code. Examples TravelAgency, OnlineTravelAgency, or TravelManagementCompany.
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected TravelAgencyTypeCodeContentType typeCode;

    /**
     * Unique Agency Seller ID. Example: CTRV
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgencyID()
     */
    public void setAgencyID(String value) {
        this.agencyID = value;
    }

    /**
     * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
     * 
     * Gets the value of the contactInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the contactInfo property.
     */
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<>();
        }
        return this.contactInfo;
    }

    /**
     * IATA-assigned agency number. Example: 98417900
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIATANumber()
     */
    public void setIATANumber(BigDecimal value) {
        this.iataNumber = value;
    }

    /**
     * Agency name. Example: Carson Travel
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * An identifier for a corporate user of a computer reservation system (CRS) or global distribution system (GDS), typically a travel agency. Also known as Office ID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityID() {
        return pseudoCityID;
    }

    /**
     * Sets the value of the pseudoCityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPseudoCityID()
     */
    public void setPseudoCityID(String value) {
        this.pseudoCityID = value;
    }

    /**
     * Individual agent who solicits and procures business from potential customers on behalf of one or more principals, usually against payment of a percentage of the realized sales revenue as commission.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgentType }
     *     
     */
    public TravelAgentType getTravelAgent() {
        return travelAgent;
    }

    /**
     * Sets the value of the travelAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgentType }
     *     
     * @see #getTravelAgent()
     */
    public void setTravelAgent(TravelAgentType value) {
        this.travelAgent = value;
    }

    /**
     * Agency type code. Examples TravelAgency, OnlineTravelAgency, or TravelManagementCompany.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    public TravelAgencyTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     * @see #getTypeCode()
     */
    public void setTypeCode(TravelAgencyTypeCodeContentType value) {
        this.typeCode = value;
    }

}
