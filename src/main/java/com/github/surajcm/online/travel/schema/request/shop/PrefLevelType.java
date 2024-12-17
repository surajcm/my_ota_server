
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
 * 
 * <p>Java class for PrefLevelType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PrefLevelType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrefContextText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="PrefLevelCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefLevelType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "prefContextText",
    "prefLevelCode"
})
public class PrefLevelType {

    /**
     * Preference level context. E.g. MyContext
     * 
     */
    @XmlElement(name = "PrefContextText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String prefContextText;
    /**
     * Preference level code (e.g. Preferred, Required, Exclude, Other).
     * 
     */
    @XmlElement(name = "PrefLevelCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String prefLevelCode;

    /**
     * Preference level context. E.g. MyContext
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefContextText() {
        return prefContextText;
    }

    /**
     * Sets the value of the prefContextText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrefContextText()
     */
    public void setPrefContextText(String value) {
        this.prefContextText = value;
    }

    /**
     * Preference level code (e.g. Preferred, Required, Exclude, Other).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefLevelCode() {
        return prefLevelCode;
    }

    /**
     * Sets the value of the prefLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrefLevelCode()
     */
    public void setPrefLevelCode(String value) {
        this.prefLevelCode = value;
    }

}
