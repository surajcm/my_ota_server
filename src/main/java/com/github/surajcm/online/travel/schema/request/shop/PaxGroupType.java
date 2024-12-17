
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
 * A number of individual passengers traveling under one commercial name that associates them. E.g. a Tour group or a group for sales allotment from airline to agency.
 * 
 * <p>Java class for PaxGroupType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxGroupType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntendedPaxQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}QtyType" minOccurs="0"/>
 *         <element name="PaxGroupID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="PaxGroupName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PaxGroupNameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxGroupType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "contactInfo",
    "intendedPaxQty",
    "paxGroupID",
    "paxGroupName"
})
public class PaxGroupType {

    /**
     * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
     * 
     */
    @XmlElement(name = "ContactInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ContactInfoType> contactInfo;
    /**
     * Intended number of passengers for this Group.
     * 
     */
    @XmlElement(name = "IntendedPaxQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal intendedPaxQty;
    /**
     * Uniquely identifies a Passenger Group.
     * 
     */
    @XmlElement(name = "PaxGroupID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxGroupID;
    /**
     * The name of the group.
     * 
     */
    @XmlElement(name = "PaxGroupName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxGroupName;

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
     * Intended number of passengers for this Group.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntendedPaxQty() {
        return intendedPaxQty;
    }

    /**
     * Sets the value of the intendedPaxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIntendedPaxQty()
     */
    public void setIntendedPaxQty(BigDecimal value) {
        this.intendedPaxQty = value;
    }

    /**
     * Uniquely identifies a Passenger Group.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxGroupID() {
        return paxGroupID;
    }

    /**
     * Sets the value of the paxGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxGroupID()
     */
    public void setPaxGroupID(String value) {
        this.paxGroupID = value;
    }

    /**
     * The name of the group.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxGroupName() {
        return paxGroupName;
    }

    /**
     * Sets the value of the paxGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxGroupName()
     */
    public void setPaxGroupName(String value) {
        this.paxGroupName = value;
    }

}
