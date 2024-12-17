
package com.github.surajcm.online.travel.schema.request.shop;

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
 *         <element name="ProgramName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="RedressCaseID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedressCaseType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "programName",
    "redressCaseID"
})
public class RedressCaseType {

    /**
     * The name of the redress program (e.g. Secure Flight Program).
     * 
     */
    @XmlElement(name = "ProgramName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    /**
     * A unique government-issued identifier assigned to a redress case.
     * 
     */
    @XmlElement(name = "RedressCaseID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String redressCaseID;

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
