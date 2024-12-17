
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
 * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
 * 
 * <p>Java class for ContactInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContactInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContactInfoID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="ContactPurposeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" maxOccurs="99" minOccurs="0"/>
 *         <element name="ContactRefusedInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="EmailAddress" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}EmailAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Individual" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndividualType" minOccurs="0"/>
 *         <element name="IndividualRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="OtherAddress" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OtherAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="Phone" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PhoneType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PostalAddress" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PostalAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RelationshipToPax" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "contactInfoID",
    "contactPurposeText",
    "contactRefusedInd",
    "emailAddress",
    "individual",
    "individualRefID",
    "otherAddress",
    "paxSegmentRefID",
    "phone",
    "postalAddress",
    "relationshipToPax"
})
public class ContactInfoType {

    /**
     * Uniquely Identifies a set of Contact Information, within the context of one message.
     * 
     */
    @XmlElement(name = "ContactInfoID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoID;
    /**
     * to identify the contact purpose (PADIS code list 3299)
     * 
     */
    @XmlElement(name = "ContactPurposeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<String> contactPurposeText;
    /**
     * When TRUE, Contact Information was refused to be provided.
     * 
     */
    @XmlElement(name = "ContactRefusedInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean contactRefusedInd;
    /**
     * The email address which should be used for contact purposes.
     * 
     */
    @XmlElement(name = "EmailAddress", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<EmailAddressType> emailAddress;
    /**
     * A single human being as distinct from a group, class, or family.
     * 
     */
    @XmlElement(name = "Individual", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected IndividualType individual;
    /**
     * Reference to Individual instance(s)
     * 
     */
    @XmlElement(name = "IndividualRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String individualRefID;
    /**
     * Other Contact Method information. E.g. web site URL, social media handle.
     * 
     */
    @XmlElement(name = "OtherAddress", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<OtherAddressType> otherAddress;
    /**
     * Uniquely identifies a Passenger Segment within the context of one message.
     * 
     */
    @XmlElement(name = "PaxSegmentRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentRefID;
    /**
     * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
     * 
     */
    @XmlElement(name = "Phone", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<PhoneType> phone;
    /**
     * Natural or physical address used for postal service. May be a building address, airport address, etc.
     * 
     */
    @XmlElement(name = "PostalAddress", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<PostalAddressType> postalAddress;
    /**
     * Relationship to the passenger e.g. used for when this individual is an emergency contact
     * 
     */
    @XmlElement(name = "RelationshipToPax", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String relationshipToPax;

    /**
     * Uniquely Identifies a set of Contact Information, within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoID() {
        return contactInfoID;
    }

    /**
     * Sets the value of the contactInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContactInfoID()
     */
    public void setContactInfoID(String value) {
        this.contactInfoID = value;
    }

    /**
     * to identify the contact purpose (PADIS code list 3299)
     * 
     * Gets the value of the contactPurposeText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPurposeText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContactPurposeText().add(newItem);
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
     *     The value of the contactPurposeText property.
     */
    public List<String> getContactPurposeText() {
        if (contactPurposeText == null) {
            contactPurposeText = new ArrayList<>();
        }
        return this.contactPurposeText;
    }

    /**
     * When TRUE, Contact Information was refused to be provided.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactRefusedInd() {
        return contactRefusedInd;
    }

    /**
     * Sets the value of the contactRefusedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isContactRefusedInd()
     */
    public void setContactRefusedInd(Boolean value) {
        this.contactRefusedInd = value;
    }

    /**
     * The email address which should be used for contact purposes.
     * 
     * Gets the value of the emailAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddressType }
     * </p>
     * 
     * 
     * @return
     *     The value of the emailAddress property.
     */
    public List<EmailAddressType> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<>();
        }
        return this.emailAddress;
    }

    /**
     * A single human being as distinct from a group, class, or family.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     * @see #getIndividual()
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

    /**
     * Reference to Individual instance(s)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualRefID() {
        return individualRefID;
    }

    /**
     * Sets the value of the individualRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIndividualRefID()
     */
    public void setIndividualRefID(String value) {
        this.individualRefID = value;
    }

    /**
     * Other Contact Method information. E.g. web site URL, social media handle.
     * 
     * Gets the value of the otherAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAddressType }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherAddress property.
     */
    public List<OtherAddressType> getOtherAddress() {
        if (otherAddress == null) {
            otherAddress = new ArrayList<>();
        }
        return this.otherAddress;
    }

    /**
     * Uniquely identifies a Passenger Segment within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentRefID() {
        return paxSegmentRefID;
    }

    /**
     * Sets the value of the paxSegmentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxSegmentRefID()
     */
    public void setPaxSegmentRefID(String value) {
        this.paxSegmentRefID = value;
    }

    /**
     * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data transmission via the public switched telephone network (PSTN) or other private networks.
     * 
     * Gets the value of the phone property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * </p>
     * 
     * 
     * @return
     *     The value of the phone property.
     */
    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<>();
        }
        return this.phone;
    }

    /**
     * Natural or physical address used for postal service. May be a building address, airport address, etc.
     * 
     * Gets the value of the postalAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressType }
     * </p>
     * 
     * 
     * @return
     *     The value of the postalAddress property.
     */
    public List<PostalAddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<>();
        }
        return this.postalAddress;
    }

    /**
     * Relationship to the passenger e.g. used for when this individual is an emergency contact
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipToPax() {
        return relationshipToPax;
    }

    /**
     * Sets the value of the relationshipToPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRelationshipToPax()
     */
    public void setRelationshipToPax(String value) {
        this.relationshipToPax = value;
    }

}
