
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Additional disclosure and allowance information for Bag Items used in Long Sells.
 * 
 * <p>Java class for BagItemDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BagItemDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="BaggageDisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         <element name="Price" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PriceType" minOccurs="0"/>
 *         <element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AirlineDesigCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagItemDetailsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "baggageAllowanceRefID",
    "baggageDisclosureRefID",
    "price",
    "validatingCarrierCode"
})
public class BagItemDetailsType {

    /**
     * Reference to a Baggage Allowance instance within this message.
     * 
     */
    @XmlElement(name = "BaggageAllowanceRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceRefID;
    /**
     * Reference to a Baggage Disclosure instance within this message.
     * 
     */
    @XmlElement(name = "BaggageDisclosureRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageDisclosureRefID;
    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     */
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PriceType price;
    /**
     * Airline designator or CRS code of the owner/ assigner of the Offer ID, typically used for offer ordering purposes. Example: UA, BA  Encoding Scheme: IATA/ A4A (two or three character) Airline or CRS Designator Code
     * 
     */
    @XmlElement(name = "ValidatingCarrierCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatingCarrierCode;

    /**
     * Reference to a Baggage Allowance instance within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceRefID() {
        return baggageAllowanceRefID;
    }

    /**
     * Sets the value of the baggageAllowanceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaggageAllowanceRefID()
     */
    public void setBaggageAllowanceRefID(String value) {
        this.baggageAllowanceRefID = value;
    }

    /**
     * Reference to a Baggage Disclosure instance within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageDisclosureRefID() {
        return baggageDisclosureRefID;
    }

    /**
     * Sets the value of the baggageDisclosureRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaggageDisclosureRefID()
     */
    public void setBaggageDisclosureRefID(String value) {
        this.baggageDisclosureRefID = value;
    }

    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     * @see #getPrice()
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Airline designator or CRS code of the owner/ assigner of the Offer ID, typically used for offer ordering purposes. Example: UA, BA  Encoding Scheme: IATA/ A4A (two or three character) Airline or CRS Designator Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValidatingCarrierCode()
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

}
