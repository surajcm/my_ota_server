
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Additional, supplementary information about the document or service.
 * 
 * <p>Java class for RemarkType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RemarkType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DisplayInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="RemarkText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="Timestamp" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarkType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "displayInd",
    "remarkText",
    "timestamp"
})
public class RemarkType {

    /**
     * When TRUE, this remark should be displayed.  Notes: 1. This capability may not be supported by all NDC-enabled systems or may be supported by bilateral agreement only. The technical implementation of this capability is not dictated by this specification.
     * 
     */
    @XmlElement(name = "DisplayInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean displayInd;
    /**
     * Additional, supplementary information about the document or service.
     * 
     */
    @XmlElement(name = "RemarkText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String remarkText;
    /**
     * Remark creation timestamp.
     * 
     */
    @XmlElement(name = "Timestamp", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType timestamp;

    /**
     * When TRUE, this remark should be displayed.  Notes: 1. This capability may not be supported by all NDC-enabled systems or may be supported by bilateral agreement only. The technical implementation of this capability is not dictated by this specification.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayInd() {
        return displayInd;
    }

    /**
     * Sets the value of the displayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDisplayInd()
     */
    public void setDisplayInd(Boolean value) {
        this.displayInd = value;
    }

    /**
     * Additional, supplementary information about the document or service.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkText() {
        return remarkText;
    }

    /**
     * Sets the value of the remarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRemarkText()
     */
    public void setRemarkText(String value) {
        this.remarkText = value;
    }

    /**
     * Remark creation timestamp.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getTimestamp()
     */
    public void setTimestamp(DateTimeType value) {
        this.timestamp = value;
    }

}
