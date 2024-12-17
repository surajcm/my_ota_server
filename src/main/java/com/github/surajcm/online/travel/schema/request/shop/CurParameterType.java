
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Requested search processing and results currency information.
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
 *         <element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CurAppCodeType" minOccurs="0"/>
 *         <element name="DecimalsAllowedNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="RequestedCurCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CurCodeType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurParameterType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "appCode",
    "decimalsAllowedNumber",
    "name",
    "requestedCurCode"
})
public class CurParameterType {

    /**
     * Currency code application. Examples: Actual, Display, Requested, Conversion, Other
     * 
     */
    @XmlElement(name = "AppCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "string")
    protected CurAppCodeContentType appCode;
    /**
     * Specifies how many numbers to be specified after the decimal in case of currency amounts.
     * 
     */
    @XmlElement(name = "DecimalsAllowedNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal decimalsAllowedNumber;
    /**
     * Currency name, e.g. US Dollars.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    /**
     * Currency Code as per ISO 4217.
     * 
     */
    @XmlElement(name = "RequestedCurCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected String requestedCurCode;

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

    /**
     * Currency Code as per ISO 4217.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCurCode() {
        return requestedCurCode;
    }

    /**
     * Sets the value of the requestedCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequestedCurCode()
     */
    public void setRequestedCurCode(String value) {
        this.requestedCurCode = value;
    }

}
