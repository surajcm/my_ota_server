
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Currency related parameters intended to influence which currency the shopping results are displayed in.
 * 
 * <p>Java class for CurParameterType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CurParameterType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CurAppCodeType" minOccurs="0"/>
 *         <element name="CurCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CurCodeType" minOccurs="0"/>
 *         <element name="DecimalsAllowedNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurParameterType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "appCode",
    "curCode",
    "decimalsAllowedNumber",
    "name"
})
public class CurParameterType {

    /**
     * Currency code application. Examples: Actual, Display, Requested, Conversion, Other
     * 
     */
    @XmlElement(name = "AppCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "string")
    protected CurAppCodeContentType appCode;
    /**
     * Currency Code as per ISO 4217.
     * 
     */
    @XmlElement(name = "CurCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String curCode;
    /**
     * Specifies how many numbers to be specified after the decimal in case of currency amounts.
     * 
     */
    @XmlElement(name = "DecimalsAllowedNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal decimalsAllowedNumber;
    /**
     * Currency name, e.g. US Dollars.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Currency code application. Examples: Actual, Display, Requested, Conversion, Other
     * 
     * @return
     *     possible object is
     *     {@link CurAppCodeContentType }
     *     
     */
    public CurAppCodeContentType getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAppCodeContentType }
     *     
     * @see #getAppCode()
     */
    public void setAppCode(CurAppCodeContentType value) {
        this.appCode = value;
    }

    /**
     * Currency Code as per ISO 4217.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCurCode()
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Specifies how many numbers to be specified after the decimal in case of currency amounts.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalsAllowedNumber() {
        return decimalsAllowedNumber;
    }

    /**
     * Sets the value of the decimalsAllowedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDecimalsAllowedNumber()
     */
    public void setDecimalsAllowedNumber(BigDecimal value) {
        this.decimalsAllowedNumber = value;
    }

    /**
     * Currency name, e.g. US Dollars.
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

}
