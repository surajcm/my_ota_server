
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Policy data node detail, including an XPATH and associated Tag Name.
 * 
 * <p>Java class for PolicyNodeInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PolicyNodeInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PathText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/>
 *         <element name="TagName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyNodeInfoType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "pathText",
    "tagName"
})
public class PolicyNodeInfoType {

    /**
     * Message property location using XPATH syntax.
     * 
     */
    @XmlElement(name = "PathText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String pathText;
    /**
     * Message property Tag name.
     * 
     */
    @XmlElement(name = "TagName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tagName;

    /**
     * Message property location using XPATH syntax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathText() {
        return pathText;
    }

    /**
     * Sets the value of the pathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPathText()
     */
    public void setPathText(String value) {
        this.pathText = value;
    }

    /**
     * Message property Tag name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTagName()
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

}
