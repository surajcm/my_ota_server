
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A personâ€™s case of being registered with a countryâ€™s redress program, which can eliminate watch list misidentification and assist in identity verification.
 * 
 * <p>Java class for RedressCaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RedressCaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CountryType"/>
 *         <element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CountryCodeType"/>
 *         <element name="ProgramName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         <element name="RedressCaseID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}RedressID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedressCaseType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "country",
    "countryCode",
    "programName",
    "redressCaseID"
})
public class RedressCaseType {

    /**
     * A nation with its own government, occupying a particular territory.
     * 
     */
    @XmlElement(name = "Country", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected CountryType country;
    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     */
    @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    /**
     * The name of the redress program (e.g. Secure Flight Program).
     * 
     */
    @XmlElement(name = "ProgramName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    /**
     * A unique government-issued identifier assigned to a redress case.
     * 
     */
    @XmlElement(name = "RedressCaseID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String redressCaseID;

    /**
     * A nation with its own government, occupying a particular territory.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     * @see #getCountry()
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * ISO Country Code (can be extended by bilateral agreement in case of exceptions, e.g. Kosovo). Examples: US, FR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountryCode()
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * The name of the redress program (e.g. Secure Flight Program).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramName()
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * A unique government-issued identifier assigned to a redress case.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedressCaseID() {
        return redressCaseID;
    }

    /**
     * Sets the value of the redressCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRedressCaseID()
     */
    public void setRedressCaseID(String value) {
        this.redressCaseID = value;
    }

}
