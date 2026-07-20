
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
 * 
 * <p>Java class for DescType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DescType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="MarkupStyleText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="MediaObject" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MediaObjectType" minOccurs="0"/>
 *         <element name="URL" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "descText",
    "markupStyleText",
    "mediaObject",
    "url"
})
public class DescType {

    /**
     * Description text value.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String descText;
    /**
     * Mark-up Style of the Description Text. Example: HTML
     * 
     */
    @XmlElement(name = "MarkupStyleText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String markupStyleText;
    /**
     * Electronic documents, images, and other files which accompany and support some information.
     * 
     */
    @XmlElement(name = "MediaObject", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MediaObjectType mediaObject;
    /**
     * URL to description information source.
     * 
     */
    @XmlElement(name = "URL", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Description text value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescText()
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Mark-up Style of the Description Text. Example: HTML
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkupStyleText() {
        return markupStyleText;
    }

    /**
     * Sets the value of the markupStyleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMarkupStyleText()
     */
    public void setMarkupStyleText(String value) {
        this.markupStyleText = value;
    }

    /**
     * Electronic documents, images, and other files which accompany and support some information.
     * 
     * @return
     *     possible object is
     *     {@link MediaObjectType }
     *     
     */
    public MediaObjectType getMediaObject() {
        return mediaObject;
    }

    /**
     * Sets the value of the mediaObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaObjectType }
     *     
     * @see #getMediaObject()
     */
    public void setMediaObject(MediaObjectType value) {
        this.mediaObject = value;
    }

    /**
     * URL to description information source.
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
