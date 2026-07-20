
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Pricing history information for a given Order.
 * 
 * <p>Java class for PriceQuoteType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceQuoteType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType"/>
 *         <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CommissionType"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType"/>
 *         <element name="QuoteDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="SourceText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceQuoteType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "amount",
    "commission",
    "ownerCode",
    "priceGuaranteeTimeLimitDateTime",
    "quoteDateTime",
    "sourceText"
})
public class PriceQuoteType {

    /**
     * Quoted amount and currency information.
     * 
     */
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected AmountType amount;
    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected CommissionType commission;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * Time limit information for this price quote.
     * 
     */
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    /**
     * Date time information related to the Price Quote.
     * 
     */
    @XmlElement(name = "QuoteDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType quoteDateTime;
    /**
     * ID or name of the source of this Transaction ID. Examples: UA, ABC123. Note: If this is an Airline ID, please use 'Owner Code'.
     * 
     */
    @XmlElement(name = "SourceText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String sourceText;

    /**
     * Quoted amount and currency information.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAmount()
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     * @see #getCommission()
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
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
     * Time limit information for this price quote.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getPriceGuaranteeTimeLimitDateTime()
     */
    public void setPriceGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Date time information related to the Price Quote.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getQuoteDateTime() {
        return quoteDateTime;
    }

    /**
     * Sets the value of the quoteDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getQuoteDateTime()
     */
    public void setQuoteDateTime(DateTimeType value) {
        this.quoteDateTime = value;
    }

    /**
     * ID or name of the source of this Transaction ID. Examples: UA, ABC123. Note: If this is an Airline ID, please use 'Owner Code'.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Sets the value of the sourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSourceText()
     */
    public void setSourceText(String value) {
        this.sourceText = value;
    }

}
