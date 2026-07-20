
package com.github.surajcm.online.travel.schema.response.offer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Pre-defined code set metadata.
 * 
 * <p>Java class for CodesetMetadataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CodesetMetadataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CodesetName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}NameType" minOccurs="0"/>
 *         <element name="CodesetVersionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}NumberType" minOccurs="0"/>
 *         <element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}LangUsageType" minOccurs="0"/>
 *         <element name="OwnerID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *         <element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodesetMetadataType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "codesetName",
    "codesetVersionNumber",
    "langUsage",
    "ownerID",
    "ownerName"
})
public class CodesetMetadataType {

    /**
     * Name of the codeset (e.g. PADIS Codeset)
     * 
     */
    @XmlElement(name = "CodesetName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetName;
    /**
     * Codeset version number. Ex: 14
     * 
     */
    @XmlElement(name = "CodesetVersionNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal codesetVersionNumber;
    /**
     * Language Code representation.
     * 
     */
    @XmlElement(name = "LangUsage", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected LangUsageType langUsage;
    /**
     * Owner entity ID. Example: BA
     * 
     */
    @XmlElement(name = "OwnerID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerID;
    /**
     * Owner Entity Name. Ex: British Airways
     * 
     */
    @XmlElement(name = "OwnerName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;

    /**
     * Name of the codeset (e.g. PADIS Codeset)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetName() {
        return codesetName;
    }

    /**
     * Sets the value of the codesetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCodesetName()
     */
    public void setCodesetName(String value) {
        this.codesetName = value;
    }

    /**
     * Codeset version number. Ex: 14
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodesetVersionNumber() {
        return codesetVersionNumber;
    }

    /**
     * Sets the value of the codesetVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCodesetVersionNumber()
     */
    public void setCodesetVersionNumber(BigDecimal value) {
        this.codesetVersionNumber = value;
    }

    /**
     * Language Code representation.
     * 
     * @return
     *     possible object is
     *     {@link LangUsageType }
     *     
     */
    public LangUsageType getLangUsage() {
        return langUsage;
    }

    /**
     * Sets the value of the langUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangUsageType }
     *     
     * @see #getLangUsage()
     */
    public void setLangUsage(LangUsageType value) {
        this.langUsage = value;
    }

    /**
     * Owner entity ID. Example: BA
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerID()
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Owner Entity Name. Ex: British Airways
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

}
