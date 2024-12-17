
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.datatype.Duration;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An official entry in a Passport or other Travel Document made by an official of a government to indicate that the bearer has been granted authority to enter or re-enter the country or region concerned.
 * 
 * <p>Java class for VisaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VisaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EnterBeforeDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="EntryQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}QtyType" minOccurs="0"/>
 *         <element name="HostCountryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryCodeType" minOccurs="0"/>
 *         <element name="StayDuration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DurationType" minOccurs="0"/>
 *         <element name="VisaID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="VisaTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "enterBeforeDate",
    "entryQty",
    "hostCountryCode",
    "stayDuration",
    "visaID",
    "visaTypeCode"
})
public class VisaType {

    /**
     * Date at which the visa expires and is no longer a valid entry document.
     * 
     */
    @XmlElement(name = "EnterBeforeDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate enterBeforeDate;
    /**
     * Number of entries permitted by the visa into the host country.
     * 
     */
    @XmlElement(name = "EntryQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal entryQty;
    /**
     * ISO Country Code where the visa is valid.
     * 
     */
    @XmlElement(name = "HostCountryCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hostCountryCode;
    /**
     * Duration permitted of the Passenger's stay in the visa host country (in days).
     * 
     */
    @XmlElement(name = "StayDuration", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Duration stayDuration;
    /**
     * Visa ID value. Example: NY122345.
     * 
     */
    @XmlElement(name = "VisaID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String visaID;
    /**
     * The type of visa.
     * 
     */
    @XmlElement(name = "VisaTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String visaTypeCode;

    /**
     * Date at which the visa expires and is no longer a valid entry document.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEnterBeforeDate() {
        return enterBeforeDate;
    }

    /**
     * Sets the value of the enterBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEnterBeforeDate()
     */
    public void setEnterBeforeDate(LocalDate value) {
        this.enterBeforeDate = value;
    }

    /**
     * Number of entries permitted by the visa into the host country.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntryQty() {
        return entryQty;
    }

    /**
     * Sets the value of the entryQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getEntryQty()
     */
    public void setEntryQty(BigDecimal value) {
        this.entryQty = value;
    }

    /**
     * ISO Country Code where the visa is valid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostCountryCode() {
        return hostCountryCode;
    }

    /**
     * Sets the value of the hostCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHostCountryCode()
     */
    public void setHostCountryCode(String value) {
        this.hostCountryCode = value;
    }

    /**
     * Duration permitted of the Passenger's stay in the visa host country (in days).
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getStayDuration() {
        return stayDuration;
    }

    /**
     * Sets the value of the stayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getStayDuration()
     */
    public void setStayDuration(Duration value) {
        this.stayDuration = value;
    }

    /**
     * Visa ID value. Example: NY122345.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaID() {
        return visaID;
    }

    /**
     * Sets the value of the visaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVisaID()
     */
    public void setVisaID(String value) {
        this.visaID = value;
    }

    /**
     * The type of visa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaTypeCode() {
        return visaTypeCode;
    }

    /**
     * Sets the value of the visaTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVisaTypeCode()
     */
    public void setVisaTypeCode(String value) {
        this.visaTypeCode = value;
    }

}
