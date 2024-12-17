
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Two or more airlines participating in a commercial relationship or joint venture, where a joint and commonly identifiable product is marketed under a single commercial name or brand.
 * 
 * <p>Java class for AllianceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AllianceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllianceCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AllianceCodeType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="URL" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllianceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "allianceCode",
    "name",
    "url"
})
public class AllianceType {

    /**
     * Used to specify the alliance based on PADIS Code List (code list defined in BDT).
     * 
     */
    @XmlElement(name = "AllianceCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String allianceCode;
    /**
     * Alliance name. Example: One World Alliance
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    /**
     * Alliance information URL. Example: http://www.oneworld.com/home
     * 
     */
    @XmlElement(name = "URL", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Used to specify the alliance based on PADIS Code List (code list defined in BDT).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllianceCode() {
        return allianceCode;
    }

    /**
     * Sets the value of the allianceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAllianceCode()
     */
    public void setAllianceCode(String value) {
        this.allianceCode = value;
    }

    /**
     * Alliance name. Example: One World Alliance
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
     * Alliance information URL. Example: http://www.oneworld.com/home
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getURL()
     */
    public void setURL(String value) {
        this.url = value;
    }

}
