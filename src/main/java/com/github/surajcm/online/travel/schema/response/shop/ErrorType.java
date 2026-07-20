
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains information related to errors detected during processing of the preceding request.
 * 
 * <p>Java class for ErrorType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ErrorType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="ErrorID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="LangCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ProperNameType" minOccurs="0"/>
 *         <element name="StatusText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="TagText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="URL" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "code",
    "descText",
    "errorID",
    "langCode",
    "ownerName",
    "statusText",
    "tagText",
    "typeCode",
    "url"
})
public class ErrorType {

    /**
     * The code corresponding to the processing error as defined by PADIS 9321.
     * 
     */
    @XmlElement(name = "Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String code;
    /**
     * Free text description of the provided error.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String descText;
    /**
     * Unique identifier for this error instance.
     * 
     */
    @XmlElement(name = "ErrorID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorID;
    /**
     * Language code associated with the error response.
     * 
     */
    @XmlElement(name = "LangCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String langCode;
    /**
     * The name of the organization owning the error codelist.
     * 
     */
    @XmlElement(name = "OwnerName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    /**
     * Document processing status. Recommended values are NotProcessed, Incomplete, Complete, Unknown.
     * 
     */
    @XmlElement(name = "StatusText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String statusText;
    /**
     * Identifies the tag/XPath which relates to the provided Error.
     * 
     */
    @XmlElement(name = "TagText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String tagText;
    /**
     * Uses a bilaterally agreed set of values to indicate the error type. The validating XSD can expect to accept values that it has not been explicitly coded for and process them by using Type = 'unknown'.
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;
    /**
     * Link to an online description of the provided Error.
     * 
     */
    @XmlElement(name = "URL", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * The code corresponding to the processing error as defined by PADIS 9321.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Free text description of the provided error.
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
     * Unique identifier for this error instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorID() {
        return errorID;
    }

    /**
     * Sets the value of the errorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErrorID()
     */
    public void setErrorID(String value) {
        this.errorID = value;
    }

    /**
     * Language code associated with the error response.
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
     * The name of the organization owning the error codelist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerName()
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Document processing status. Recommended values are NotProcessed, Incomplete, Complete, Unknown.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusText()
     */
    public void setStatusText(String value) {
        this.statusText = value;
    }

    /**
     * Identifies the tag/XPath which relates to the provided Error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagText() {
        return tagText;
    }

    /**
     * Sets the value of the tagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTagText()
     */
    public void setTagText(String value) {
        this.tagText = value;
    }

    /**
     * Uses a bilaterally agreed set of values to indicate the error type. The validating XSD can expect to accept values that it has not been explicitly coded for and process them by using Type = 'unknown'.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTypeCode()
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Link to an online description of the provided Error.
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
