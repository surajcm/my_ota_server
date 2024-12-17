
package com.github.surajcm.online.travel.schema.request.shop;

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
 *         <element name="LangCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodesetValueTextType"/>
 *         <element name="LangUsageText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LangUsageType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "langCode",
    "langUsageText"
})
public class LangUsageType {

    /**
     * Language Code representation.  Notes: 1. Language code. Example: en, en-US  2. Encoding Schemes: ISO 639-1 Code OR Microsoft National Language Support (NLS) Code  3. Supports ISO 639-1 (two alpha character) neutral language encoding indicated by a name such as 'en' for English.  4. Supports MNLS geographically specific language encoding indicated by a name that includes both locale and country/region information. For example, the locale English (United States) has the language name 'en-US'
     * 
     */
    @XmlElement(name = "LangCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected String langCode;
    /**
     * Written or Spoken language.
     * 
     */
    @XmlElement(name = "LangUsageText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String langUsageText;

    /**
     * Language Code representation.  Notes: 1. Language code. Example: en, en-US  2. Encoding Schemes: ISO 639-1 Code OR Microsoft National Language Support (NLS) Code  3. Supports ISO 639-1 (two alpha character) neutral language encoding indicated by a name such as 'en' for English.  4. Supports MNLS geographically specific language encoding indicated by a name that includes both locale and country/region information. For example, the locale English (United States) has the language name 'en-US'
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
