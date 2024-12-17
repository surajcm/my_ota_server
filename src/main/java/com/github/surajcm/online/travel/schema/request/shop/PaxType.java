
package com.github.surajcm.online.travel.schema.request.shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Any person except members of the crew carried or to be carried with the consent of the carrier, on board of any transport vehicle such as aircraft, train, bus, ship. Holds the attributes specific to a one booking, from shopping to fulfillment.
 * 
 * <p>Java class for PaxType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaxType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgeMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MeasureType" minOccurs="0"/>
 *         <element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FOID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FOID_Type" minOccurs="0"/>
 *         <element name="IdentityDoc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IdentityDocType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Individual" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndividualType" minOccurs="0"/>
 *         <element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}LangUsageType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}LoyaltyProgramAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PaxID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="ProfileConsentInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="ProfileID_Text" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="PTC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_PTC_CodeType" minOccurs="0"/>
 *         <element name="RedressCase" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RedressCaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Remark" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "ageMeasure",
    "birthdate",
    "citizenshipCountryCode",
    "contactInfo",
    "foid",
    "identityDoc",
    "individual",
    "langUsage",
    "loyaltyProgramAccount",
    "paxID",
    "paxRefID",
    "profileConsentInd",
    "profileIDText",
    "ptc",
    "redressCase",
    "remark",
    "residenceCountryCode"
})
public class PaxType {

    /**
     * The Age of the Passenger. To be used in NDC Anonymous Shopping requests or when the birthdate (in Individual) is not known.
     * 
     */
    @XmlElement(name = "AgeMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MeasureType ageMeasure;
    /**
     * The Date of Birth of the Passenger. Intended to be used in NDC Anonymous Shopping requests. Example: 2017-01-13
     * 
     */
    @XmlElement(name = "Birthdate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate birthdate;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "CitizenshipCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String citizenshipCountryCode;
    /**
     * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
     * 
     */
    @XmlElement(name = "ContactInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ContactInfoType> contactInfo;
    /**
     * Form of identification. Typically used to identify that the passenger is who he says he is.  This is the type of FOID as defined in AIRIMP (FF Number, Credit Card Number, etc.).
     * 
     */
    @XmlElement(name = "FOID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected FOIDType foid;
    /**
     * Any document which may be used to identify a person or verify aspects of a person's personal identity. If issued in a small, standard credit card size form, it is usually called an identity card. Some countries issue formal identity documents, while others may require identity verification using informal documents. When the identity document incorporates a person's photograph, it may be called photo ID.  In the absence of a formal identity document, a driver's license may be accepted in many countries for identity verification. Most countries accept passports as a form of identification.
     * 
     */
    @XmlElement(name = "IdentityDoc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<IdentityDocType> identityDoc;
    /**
     * A single human being as distinct from a group, class, or family.
     * 
     */
    @XmlElement(name = "Individual", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected IndividualType individual;
    /**
     * Language Code representation.
     * 
     */
    @XmlElement(name = "LangUsage", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<LangUsageType> langUsage;
    /**
     * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
     * 
     */
    @XmlElement(name = "LoyaltyProgramAccount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<LoyaltyProgramAccountType> loyaltyProgramAccount;
    /**
     * Uniquely identifies a Passenger within the context of one message.
     * 
     */
    @XmlElement(name = "PaxID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxID;
    /**
     * Reference to a Passenger ID within this message, associating an infant on lap to this adult Passenger.
     * 
     */
    @XmlElement(name = "PaxRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    /**
     * When TRUE, passenger authorizes the airline to share his/her profile information or send promotional emails.
     * 
     */
    @XmlElement(name = "ProfileConsentInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean profileConsentInd;
    /**
     * Passenger Profile ID
     * 
     */
    @XmlElement(name = "ProfileID_Text", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String profileIDText;
    /**
     * Type code applying to the Passenger which typically drives pricing (e.g. ADT, CHD, etc).
     * 
     */
    @XmlElement(name = "PTC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String ptc;
    /**
     * A personâ€™s case of being registered with a countryâ€™s redress program, which can eliminate watch list misidentification and assist in identity verification.
     * 
     */
    @XmlElement(name = "RedressCase", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<RedressCaseType> redressCase;
    /**
     * Additional, supplementary information about the document or service.
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<RemarkType> remark;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "ResidenceCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String residenceCountryCode;

    /**
     * The Age of the Passenger. To be used in NDC Anonymous Shopping requests or when the birthdate (in Individual) is not known.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAgeMeasure() {
        return ageMeasure;
    }

    /**
     * Sets the value of the ageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getAgeMeasure()
     */
    public void setAgeMeasure(MeasureType value) {
        this.ageMeasure = value;
    }

    /**
     * The Date of Birth of the Passenger. Intended to be used in NDC Anonymous Shopping requests. Example: 2017-01-13
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBirthdate()
     */
    public void setBirthdate(LocalDate value) {
        this.birthdate = value;
    }

    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCitizenshipCountryCode()
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
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
     * Form of identification. Typically used to identify that the passenger is who he says he is.  This is the type of FOID as defined in AIRIMP (FF Number, Credit Card Number, etc.).
     * 
     * @return
     *     possible object is
     *     {@link FOIDType }
     *     
     */
    public FOIDType getFOID() {
        return foid;
    }

    /**
     * Sets the value of the foid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOIDType }
     *     
     * @see #getFOID()
     */
    public void setFOID(FOIDType value) {
        this.foid = value;
    }

    /**
     * Any document which may be used to identify a person or verify aspects of a person's personal identity. If issued in a small, standard credit card size form, it is usually called an identity card. Some countries issue formal identity documents, while others may require identity verification using informal documents. When the identity document incorporates a person's photograph, it may be called photo ID.  In the absence of a formal identity document, a driver's license may be accepted in many countries for identity verification. Most countries accept passports as a form of identification.
     * 
     * Gets the value of the identityDoc property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDoc property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIdentityDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityDocType }
     * </p>
     * 
     * 
     * @return
     *     The value of the identityDoc property.
     */
    public List<IdentityDocType> getIdentityDoc() {
        if (identityDoc == null) {
            identityDoc = new ArrayList<>();
        }
        return this.identityDoc;
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
     * Language Code representation.
     * 
     * Gets the value of the langUsage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the langUsage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLangUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangUsageType }
     * </p>
     * 
     * 
     * @return
     *     The value of the langUsage property.
     */
    public List<LangUsageType> getLangUsage() {
        if (langUsage == null) {
            langUsage = new ArrayList<>();
        }
        return this.langUsage;
    }

    /**
     * An account set up for a customer within a rewards program which holds funds on behalf of that customer.
     * 
     * Gets the value of the loyaltyProgramAccount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgramAccount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLoyaltyProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramAccountType }
     * </p>
     * 
     * 
     * @return
     *     The value of the loyaltyProgramAccount property.
     */
    public List<LoyaltyProgramAccountType> getLoyaltyProgramAccount() {
        if (loyaltyProgramAccount == null) {
            loyaltyProgramAccount = new ArrayList<>();
        }
        return this.loyaltyProgramAccount;
    }

    /**
     * Uniquely identifies a Passenger within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxID() {
        return paxID;
    }

    /**
     * Sets the value of the paxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxID()
     */
    public void setPaxID(String value) {
        this.paxID = value;
    }

    /**
     * Reference to a Passenger ID within this message, associating an infant on lap to this adult Passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxRefID()
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * When TRUE, passenger authorizes the airline to share his/her profile information or send promotional emails.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfileConsentInd() {
        return profileConsentInd;
    }

    /**
     * Sets the value of the profileConsentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isProfileConsentInd()
     */
    public void setProfileConsentInd(Boolean value) {
        this.profileConsentInd = value;
    }

    /**
     * Passenger Profile ID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileIDText() {
        return profileIDText;
    }

    /**
     * Sets the value of the profileIDText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProfileIDText()
     */
    public void setProfileIDText(String value) {
        this.profileIDText = value;
    }

    /**
     * Type code applying to the Passenger which typically drives pricing (e.g. ADT, CHD, etc).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPTC()
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * A personâ€™s case of being registered with a countryâ€™s redress program, which can eliminate watch list misidentification and assist in identity verification.
     * 
     * Gets the value of the redressCase property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redressCase property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRedressCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedressCaseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the redressCase property.
     */
    public List<RedressCaseType> getRedressCase() {
        if (redressCase == null) {
            redressCase = new ArrayList<>();
        }
        return this.redressCase;
    }

    /**
     * Additional, supplementary information about the document or service.
     * 
     * Gets the value of the remark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * </p>
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
    }

    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResidenceCountryCode()
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

}
