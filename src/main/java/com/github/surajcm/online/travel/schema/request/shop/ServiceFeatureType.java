
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Bilaterally agreed mechanism to deliver service specific information to the Seller as defined by the Airline. This defines a further level of definition for a service taxonomy code.   e.g meal (TC 03F0)    ->  breakfast(03F1)  - eggs(03F2),toast(03F3)
 * 
 * <p>Java class for ServiceFeatureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceFeatureType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CodesetCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="CodesetNameCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="ValueText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeatureType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "codesetCode",
    "codesetNameCode",
    "valueText"
})
public class ServiceFeatureType {

    /**
     * Defines the codeset code that is being used in each entry related to the specified codeset defined.
     * 
     */
    @XmlElement(name = "CodesetCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetCode;
    /**
     * Defines the codeset that is being used in each entry to define the codeset code and the associated value text.
     * 
     */
    @XmlElement(name = "CodesetNameCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetNameCode;
    /**
     * The textural description associated to the codeset code for a given defined codeset.
     * 
     */
    @XmlElement(name = "ValueText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String valueText;

    /**
     * Defines the codeset code that is being used in each entry related to the specified codeset defined.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetCode() {
        return codesetCode;
    }

    /**
     * Sets the value of the codesetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCodesetCode()
     */
    public void setCodesetCode(String value) {
        this.codesetCode = value;
    }

    /**
     * Defines the codeset that is being used in each entry to define the codeset code and the associated value text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetNameCode() {
        return codesetNameCode;
    }

    /**
     * Sets the value of the codesetNameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCodesetNameCode()
     */
    public void setCodesetNameCode(String value) {
        this.codesetNameCode = value;
    }

    /**
     * The textural description associated to the codeset code for a given defined codeset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueText() {
        return valueText;
    }

    /**
     * Sets the value of the valueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValueText()
     */
    public void setValueText(String value) {
        this.valueText = value;
    }

}
