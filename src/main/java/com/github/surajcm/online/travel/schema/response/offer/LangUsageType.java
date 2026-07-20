
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Language Code representation.
 * 
 * <p>Java class for LangUsageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LangUsageType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LangCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}LangCodeType" minOccurs="0"/>
 *         <element name="LangUsageText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LangUsageType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "langCode",
    "langUsageText"
})
public class LangUsageType {

    /**
     * Language Code representation.
     * 
     */
    @XmlElement(name = "LangCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String langCode;
    /**
     * Written or Spoken language.
     * 
     */
    @XmlElement(name = "LangUsageText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String langUsageText;

    /**
     * Language Code representation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLangCode()
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * Written or Spoken language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangUsageText() {
        return langUsageText;
    }

    /**
     * Sets the value of the langUsageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLangUsageText()
     */
    public void setLangUsageText(String value) {
        this.langUsageText = value;
    }

}
