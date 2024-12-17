
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
 * 
 * <p>Java class for PromotionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PromotionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProperNameType" minOccurs="0"/>
 *         <element name="PromotionID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="PromotionIssuer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PromotionIssuerType" minOccurs="0"/>
 *         <element name="Remark" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="URL" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "ownerName",
    "promotionID",
    "promotionIssuer",
    "remark",
    "url"
})
public class PromotionType {

    /**
     * Name of the Individual to which this Promotion applies.
     * 
     */
    @XmlElement(name = "OwnerName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    /**
     * Promotion code ID or number. Example: PROMO123. Used in conjunction with Link (Promotion URL), Issuer (Promotion Owner or Sponsor) and Remarks (Promotion remarks).
     * 
     */
    @XmlElement(name = "PromotionID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String promotionID;
    /**
     * Promotion Issuer or Sponsor.
     * 
     */
    @XmlElement(name = "PromotionIssuer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PromotionIssuerType promotionIssuer;
    /**
     * Additional, supplementary information about the document or service.
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<RemarkType> remark;
    /**
     * Promotion URL. Example: http://promos.site.com
     * 
     */
    @XmlElement(name = "URL", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Name of the Individual to which this Promotion applies.
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
     * Promotion code ID or number. Example: PROMO123. Used in conjunction with Link (Promotion URL), Issuer (Promotion Owner or Sponsor) and Remarks (Promotion remarks).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionID() {
        return promotionID;
    }

    /**
     * Sets the value of the promotionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPromotionID()
     */
    public void setPromotionID(String value) {
        this.promotionID = value;
    }

    /**
     * Promotion Issuer or Sponsor.
     * 
     * @return
     *     possible object is
     *     {@link PromotionIssuerType }
     *     
     */
    public PromotionIssuerType getPromotionIssuer() {
        return promotionIssuer;
    }

    /**
     * Sets the value of the promotionIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionIssuerType }
     *     
     * @see #getPromotionIssuer()
     */
    public void setPromotionIssuer(PromotionIssuerType value) {
        this.promotionIssuer = value;
    }

    /**
     * Additional, supplementary information about the document or service.
     * 
     * Gets the value of the remark property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * </p>
     * 
     * 
     * @return
     *     The value of the remark property.
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<>();
        }
        return this.remark;
    }

    /**
     * Promotion URL. Example: http://promos.site.com
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
