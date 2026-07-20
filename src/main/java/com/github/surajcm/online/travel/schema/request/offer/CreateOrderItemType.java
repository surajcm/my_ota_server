
package com.github.surajcm.online.travel.schema.request.offer;

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
 * Used for selling by value (long sells) rather than selling by reference.
 * 
 * <p>Java class for CreateOrderItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateOrderItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="OfferItemTimeLimits" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OfferItemTimeLimitsType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OfferItemType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OfferItemTypeType"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AirlineDesigCodeType"/>
 *         <element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}OwnerTypeCodeType" minOccurs="0"/>
 *         <element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "offerItemID",
    "offerItemTimeLimits",
    "offerItemType",
    "ownerCode",
    "ownerTypeCode",
    "webAddressURI"
})
public class CreateOrderItemType {

    /**
     * The airline-assigned unique Offer Item ID. Example: OFFER769-A850-4EC4-8F46-02293F72D7E6
     * 
     */
    @XmlElement(name = "OfferItemID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "OfferItemTimeLimits", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<OfferItemTimeLimitsType> offerItemTimeLimits;
    /**
     * Offer Item Type used for long sell transactions.
     * 
     */
    @XmlElement(name = "OfferItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected OfferItemTypeType offerItemType;
    /**
     * Airline designator or CRS code of the owner/ assigner of the Offer ID, typically used for offer ordering purposes. Example: UA, BA  Encoding Scheme: IATA/ A4A (two or three character) Airline or CRS Designator Code
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * Indicates whether the owner is the ORA or POA.
     * 
     */
    @XmlElement(name = "OwnerTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     */
    @XmlElement(name = "WebAddressURI", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;

    /**
     * The airline-assigned unique Offer Item ID. Example: OFFER769-A850-4EC4-8F46-02293F72D7E6
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOfferItemID()
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the offerItemTimeLimits property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItemTimeLimits property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOfferItemTimeLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTimeLimitsType }
     * </p>
     * 
     * 
     * @return
     *     The value of the offerItemTimeLimits property.
     */
    public List<OfferItemTimeLimitsType> getOfferItemTimeLimits() {
        if (offerItemTimeLimits == null) {
            offerItemTimeLimits = new ArrayList<>();
        }
        return this.offerItemTimeLimits;
    }

    /**
     * Offer Item Type used for long sell transactions.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemTypeType }
     *     
     */
    public OfferItemTypeType getOfferItemType() {
        return offerItemType;
    }

    /**
     * Sets the value of the offerItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemTypeType }
     *     
     * @see #getOfferItemType()
     */
    public void setOfferItemType(OfferItemTypeType value) {
        this.offerItemType = value;
    }

    /**
     * Airline designator or CRS code of the owner/ assigner of the Offer ID, typically used for offer ordering purposes. Example: UA, BA  Encoding Scheme: IATA/ A4A (two or three character) Airline or CRS Designator Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerCode()
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Indicates whether the owner is the ORA or POA.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     * @see #getOwnerTypeCode()
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURI() {
        return webAddressURI;
    }

    /**
     * Sets the value of the webAddressURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWebAddressURI()
     */
    public void setWebAddressURI(String value) {
        this.webAddressURI = value;
    }

}
