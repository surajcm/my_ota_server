
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
 * A single human being as distinct from a group, class, or family.
 * 
 * <p>Java class for IndividualType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IndividualType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="BirthplaceText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="GenderCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}GenderCodeType" minOccurs="0"/>
 *         <element name="GivenName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" maxOccurs="5" minOccurs="0"/>
 *         <element name="IndividualID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="MiddleName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" maxOccurs="3" minOccurs="0"/>
 *         <element name="SuffixName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SupplementNameType" minOccurs="0"/>
 *         <element name="Surname" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType"/>
 *         <element name="TitleName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SupplementNameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "birthdate",
    "birthplaceText",
    "genderCode",
    "givenName",
    "individualID",
    "middleName",
    "suffixName",
    "surname",
    "titleName"
})
public class IndividualType {

    /**
     * The date on which an individual was born.
     * 
     */
    @XmlElement(name = "Birthdate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate birthdate;
    /**
     * Country Code where the Passenger was born (ISO 3166). For example: DE
     * 
     */
    @XmlElement(name = "BirthplaceText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String birthplaceText;
    /**
     * Gender of the individual (M, F, or X for unspecified).
     * 
     */
    @XmlElement(name = "GenderCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected GenderCodeContentType genderCode;
    /**
     * A personal name given to the individual at birthÂ and used before aÂ family name. Also called first name. E.g. JOHN.
     * 
     */
    @XmlElement(name = "GivenName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> givenName;
    /**
     * Uniquely Identifies an Individual within the context of one message.
     * 
     */
    @XmlElement(name = "IndividualID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String individualID;
    /**
     * Individual's middle name or initial. E.g. G, GEORGE.
     * 
     */
    @XmlElement(name = "MiddleName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> middleName;
    /**
     * Individual's name suffixes and letters. Examples: Jr., Sr., III, Ret., Esq.
     * 
     */
    @XmlElement(name = "SuffixName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String suffixName;
    /**
     * Individual's hereditaryÂ name(s) common to all members of a family. Also known as family name or last name. E.g. SMITH. Excludes any potential suffix.
     * 
     */
    @XmlElement(name = "Surname", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String surname;
    /**
     * A word such as Mr., Mrs., Miss or Dr that is used before an individual's name to indicate the gender, profession or marital status.
     * 
     */
    @XmlElement(name = "TitleName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String titleName;

    /**
     * The date on which an individual was born.
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
     * Country Code where the Passenger was born (ISO 3166). For example: DE
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
     * Gender of the individual (M, F, or X for unspecified).
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
     * A personal name given to the individual at birthÂ and used before aÂ family name. Also called first name. E.g. JOHN.
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
     * Uniquely Identifies an Individual within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualID() {
        return individualID;
    }

    /**
     * Sets the value of the individualID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIndividualID()
     */
    public void setIndividualID(String value) {
        this.individualID = value;
    }

    /**
     * Individual's middle name or initial. E.g. G, GEORGE.
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
     * Individual's name suffixes and letters. Examples: Jr., Sr., III, Ret., Esq.
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
     * Individual's hereditaryÂ name(s) common to all members of a family. Also known as family name or last name. E.g. SMITH. Excludes any potential suffix.
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
     * A word such as Mr., Mrs., Miss or Dr that is used before an individual's name to indicate the gender, profession or marital status.
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

}
