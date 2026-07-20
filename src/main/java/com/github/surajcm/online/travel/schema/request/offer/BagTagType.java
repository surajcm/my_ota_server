
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A small piece of paper, fabric, plastic or similar material attached to an bag and giving information about it.
 * 
 * <p>Java class for BagTagType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BagTagType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BagTagID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BagTagID_Type" minOccurs="0"/>
 *         <element name="IssuingCarrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CarrierType" minOccurs="0"/>
 *         <element name="TagExpediteInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="TagFallbackInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="TagInterlineInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagTagType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "bagTagID",
    "issuingCarrier",
    "tagExpediteInd",
    "tagFallbackInd",
    "tagInterlineInd"
})
public class BagTagType {

    /**
     * The identifier of bag tag.
     * 
     */
    @XmlElement(name = "BagTagID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bagTagID;
    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     */
    @XmlElement(name = "IssuingCarrier", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected CarrierType issuingCarrier;
    /**
     * The indicator of whether this is a expedite tag.
     * 
     */
    @XmlElement(name = "TagExpediteInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean tagExpediteInd;
    /**
     * The indicator of whether this is a fallback tag.
     * 
     */
    @XmlElement(name = "TagFallbackInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean tagFallbackInd;
    /**
     * The indicator of whether this is a interline tag.
     * 
     */
    @XmlElement(name = "TagInterlineInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean tagInterlineInd;

    /**
     * The identifier of bag tag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagID() {
        return bagTagID;
    }

    /**
     * Sets the value of the bagTagID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBagTagID()
     */
    public void setBagTagID(String value) {
        this.bagTagID = value;
    }

    /**
     * The organization which carries the passenger, baggage, or goods, and/or commits to delivering the carriage as well as any related services such as issuance of ticket, creation of Order, etc.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getIssuingCarrier() {
        return issuingCarrier;
    }

    /**
     * Sets the value of the issuingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     * @see #getIssuingCarrier()
     */
    public void setIssuingCarrier(CarrierType value) {
        this.issuingCarrier = value;
    }

    /**
     * The indicator of whether this is a expedite tag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagExpediteInd() {
        return tagExpediteInd;
    }

    /**
     * Sets the value of the tagExpediteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTagExpediteInd()
     */
    public void setTagExpediteInd(Boolean value) {
        this.tagExpediteInd = value;
    }

    /**
     * The indicator of whether this is a fallback tag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagFallbackInd() {
        return tagFallbackInd;
    }

    /**
     * Sets the value of the tagFallbackInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTagFallbackInd()
     */
    public void setTagFallbackInd(Boolean value) {
        this.tagFallbackInd = value;
    }

    /**
     * The indicator of whether this is a interline tag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagInterlineInd() {
        return tagInterlineInd;
    }

    /**
     * Sets the value of the tagInterlineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTagInterlineInd()
     */
    public void setTagInterlineInd(Boolean value) {
        this.tagInterlineInd = value;
    }

}
