
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
 * Any document which may be used to identify a person or verify aspects of a person's personal identity. If issued in a small, standard credit card size form, it is usually called an identity card. Some countries issue formal identity documents, while others may require identity verification using informal documents. When the identity document incorporates a person's photograph, it may be called photo ID.  In the absence of a formal identity document, a driver's license may be accepted in many countries for identity verification. Most countries accept passports as a form of identification.
 * 
 * <p>Java class for IdentityDocType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IdentityDocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="BirthplaceText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="ExpiryDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="GenderCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}GenderCodeType" minOccurs="0"/>
 *         <element name="GivenName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" maxOccurs="5" minOccurs="0"/>
 *         <element name="IdentityDocID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="IdentityDocTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IdentityDocTypeCodeType"/>
 *         <element name="IssueDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="IssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="MiddleName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" maxOccurs="3" minOccurs="0"/>
 *         <element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="SuffixName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SupplementNameType" minOccurs="0"/>
 *         <element name="Surname" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="TitleName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SupplementNameType" minOccurs="0"/>
 *         <element name="Visa" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}VisaType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "birthdate",
    "birthplaceText",
    "citizenshipCountryCode",
    "expiryDate",
    "genderCode",
    "givenName",
    "identityDocID",
    "identityDocTypeCode",
    "issueDate",
    "issuingCountryCode",
    "middleName",
    "residenceCountryCode",
    "suffixName",
    "surname",
    "titleName",
    "visa"
})
public class IdentityDocType {

    /**
     * Holderâ€™s date of birth as written on the document.
     * 
     */
    @XmlElement(name = "Birthdate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate birthdate;
    /**
     * Holder's birth location (e.g. city and/or country) as written on the document.
     * 
     */
    @XmlElement(name = "BirthplaceText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String birthplaceText;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "CitizenshipCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String citizenshipCountryCode;
    /**
     * The date the identity document expires.
     * 
     */
    @XmlElement(name = "ExpiryDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate expiryDate;
    /**
     * Holderâ€™s gender as specified on the document (M, F, or X for unspecified).
     * 
     */
    @XmlElement(name = "GenderCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected GenderCodeContentType genderCode;
    /**
     * Holder's first or given name, as written on the document. E.g. JOHN.
     * 
     */
    @XmlElement(name = "GivenName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> givenName;
    /**
     * Uniquely identifies the document from all other identity documents issued by the state or organization. e.g. passport number, drivers license number.
     * 
     */
    @XmlElement(name = "IdentityDocID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocID;
    /**
     * The type of passenger document.  Examples: PT (Passport)
     * 
     */
    @XmlElement(name = "IdentityDocTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocTypeCode;
    /**
     * The date the identity document was issued.
     * 
     */
    @XmlElement(name = "IssueDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate issueDate;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "IssuingCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String issuingCountryCode;
    /**
     * Holder's middle name or initial, as written on the document. E.g. G, GEORGE.
     * 
     */
    @XmlElement(name = "MiddleName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> middleName;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "ResidenceCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String residenceCountryCode;
    /**
     * Holder's name suffixes and letters, as written on the document. E.g. Jr., Sr., III, Ret., Esq.
     * 
     */
    @XmlElement(name = "SuffixName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String suffixName;
    /**
     * Holder's family name or last name, as written on the document. E.g. SMITH. Excludes any potential suffix.
     * 
     */
    @XmlElement(name = "Surname", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String surname;
    /**
     * Holder's title as written on the document. E.g. Mr., Mrs., Miss, Dr.
     * 
     */
    @XmlElement(name = "TitleName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String titleName;
    /**
     * An official entry in a Passport or other Travel Document made by an official of a government to indicate that the bearer has been granted authority to enter or re-enter the country or region concerned.
     * 
     */
    @XmlElement(name = "Visa", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<VisaType> visa;

    /**
     * Holderâ€™s date of birth as written on the document.
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
     * Holder's birth location (e.g. city and/or country) as written on the document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplaceText() {
        return birthplaceText;
    }

    /**
     * Sets the value of the birthplaceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBirthplaceText()
     */
    public void setBirthplaceText(String value) {
        this.birthplaceText = value;
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
     * The date the identity document expires.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExpiryDate()
     */
    public void setExpiryDate(LocalDate value) {
        this.expiryDate = value;
    }

    /**
     * Holderâ€™s gender as specified on the document (M, F, or X for unspecified).
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeContentType }
     *     
     */
    public GenderCodeContentType getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeContentType }
     *     
     * @see #getGenderCode()
     */
    public void setGenderCode(GenderCodeContentType value) {
        this.genderCode = value;
    }

    /**
     * Holder's first or given name, as written on the document. E.g. JOHN.
     * 
     * Gets the value of the givenName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGivenName().add(newItem);
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
     *     The value of the givenName property.
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<>();
        }
        return this.givenName;
    }

    /**
     * Uniquely identifies the document from all other identity documents issued by the state or organization. e.g. passport number, drivers license number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocID() {
        return identityDocID;
    }

    /**
     * Sets the value of the identityDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIdentityDocID()
     */
    public void setIdentityDocID(String value) {
        this.identityDocID = value;
    }

    /**
     * The type of passenger document.  Examples: PT (Passport)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocTypeCode() {
        return identityDocTypeCode;
    }

    /**
     * Sets the value of the identityDocTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIdentityDocTypeCode()
     */
    public void setIdentityDocTypeCode(String value) {
        this.identityDocTypeCode = value;
    }

    /**
     * The date the identity document was issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssueDate()
     */
    public void setIssueDate(LocalDate value) {
        this.issueDate = value;
    }

    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountryCode() {
        return issuingCountryCode;
    }

    /**
     * Sets the value of the issuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIssuingCountryCode()
     */
    public void setIssuingCountryCode(String value) {
        this.issuingCountryCode = value;
    }

    /**
     * Holder's middle name or initial, as written on the document. E.g. G, GEORGE.
     * 
     * Gets the value of the middleName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMiddleName().add(newItem);
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
     *     The value of the middleName property.
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<>();
        }
        return this.middleName;
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

    /**
     * Holder's name suffixes and letters, as written on the document. E.g. Jr., Sr., III, Ret., Esq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the value of the suffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSuffixName()
     */
    public void setSuffixName(String value) {
        this.suffixName = value;
    }

    /**
     * Holder's family name or last name, as written on the document. E.g. SMITH. Excludes any potential suffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSurname()
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Holder's title as written on the document. E.g. Mr., Mrs., Miss, Dr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * Sets the value of the titleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTitleName()
     */
    public void setTitleName(String value) {
        this.titleName = value;
    }

    /**
     * An official entry in a Passport or other Travel Document made by an official of a government to indicate that the bearer has been granted authority to enter or re-enter the country or region concerned.
     * 
     * Gets the value of the visa property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visa property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the visa property.
     */
    public List<VisaType> getVisa() {
        if (visa == null) {
            visa = new ArrayList<>();
        }
        return this.visa;
    }

}
