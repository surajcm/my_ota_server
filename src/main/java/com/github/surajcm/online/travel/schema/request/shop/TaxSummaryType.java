
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
 * Tax summary information.
 * 
 * <p>Java class for TaxSummaryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaxSummaryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllRefundableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="CollectionInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="GuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *         <element name="RefundMethodText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="Tax" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TotalRefundableTaxAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType" minOccurs="0"/>
 *         <element name="TotalTaxAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSummaryType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "allRefundableInd",
    "approximateInd",
    "collectionInd",
    "guaranteeTimeLimitDateTime",
    "refundMethodText",
    "tax",
    "totalRefundableTaxAmount",
    "totalTaxAmount"
})
public class TaxSummaryType {

    /**
     * When true, all tax breakdown amounts are refundable.
     * 
     */
    @XmlElement(name = "AllRefundableInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean allRefundableInd;
    /**
     * When true, this tax is approximate.
     * 
     */
    @XmlElement(name = "ApproximateInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean approximateInd;
    /**
     * When true, all specified tax breakdowns must be collected.
     * 
     */
    @XmlElement(name = "CollectionInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean collectionInd;
    /**
     * The length of time the Tax of an offer item is guaranteed.  In the absence of the Tax guarantee time limit, the Tax is not guaranteed.  Upon expiry, the Tax may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.    Should the Tax guarantee time limit extend beyond Order creation, the remaining length of time persists into the corresponding Order Item.  The airline can increase the remaining length of time beyond the original time limit should they wish to.  This field should only be used when the Airline indicates that a Price Guarantee is available.
     * 
     */
    @XmlElement(name = "GuaranteeTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType guaranteeTimeLimitDateTime;
    /**
     * Information from the Airline detailing to the Customer how the tax refund will be processed and what the Customer has to do for the refund.
     * 
     */
    @XmlElement(name = "RefundMethodText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String refundMethodText;
    /**
     * A compulsory contribution to state revenue, levied by the government on workers' income and business profits or added to the cost of some goods, services, and transactions.
     * 
     */
    @XmlElement(name = "Tax", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<TaxType> tax;
    /**
     * The total amount of all refundable taxes as calculated by the Airline.
     * 
     */
    @XmlElement(name = "TotalRefundableTaxAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AmountType totalRefundableTaxAmount;
    /**
     * Total of all applicable tax amounts included in the price. If tax breakdowns are provided, this amount should match the sum of the tax breakdown amounts.
     * 
     */
    @XmlElement(name = "TotalTaxAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AmountType totalTaxAmount;

    /**
     * When true, all tax breakdown amounts are refundable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllRefundableInd() {
        return allRefundableInd;
    }

    /**
     * Sets the value of the allRefundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllRefundableInd()
     */
    public void setAllRefundableInd(Boolean value) {
        this.allRefundableInd = value;
    }

    /**
     * When true, this tax is approximate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isApproximateInd()
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * When true, all specified tax breakdowns must be collected.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionInd() {
        return collectionInd;
    }

    /**
     * Sets the value of the collectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCollectionInd()
     */
    public void setCollectionInd(Boolean value) {
        this.collectionInd = value;
    }

    /**
     * The length of time the Tax of an offer item is guaranteed.  In the absence of the Tax guarantee time limit, the Tax is not guaranteed.  Upon expiry, the Tax may no longer be guaranteed and either a new shopping process should begin, or the offer should be repriced resulting in a new Offer.    Should the Tax guarantee time limit extend beyond Order creation, the remaining length of time persists into the corresponding Order Item.  The airline can increase the remaining length of time beyond the original time limit should they wish to.  This field should only be used when the Airline indicates that a Price Guarantee is available.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getGuaranteeTimeLimitDateTime() {
        return guaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the guaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getGuaranteeTimeLimitDateTime()
     */
    public void setGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.guaranteeTimeLimitDateTime = value;
    }

    /**
     * Information from the Airline detailing to the Customer how the tax refund will be processed and what the Customer has to do for the refund.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundMethodText() {
        return refundMethodText;
    }

    /**
     * Sets the value of the refundMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundMethodText()
     */
    public void setRefundMethodText(String value) {
        this.refundMethodText = value;
    }

    /**
     * A compulsory contribution to state revenue, levied by the government on workers' income and business profits or added to the cost of some goods, services, and transactions.
     * 
     * Gets the value of the tax property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxType }
     * </p>
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<TaxType> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * The total amount of all refundable taxes as calculated by the Airline.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalRefundableTaxAmount() {
        return totalRefundableTaxAmount;
    }

    /**
     * Sets the value of the totalRefundableTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getTotalRefundableTaxAmount()
     */
    public void setTotalRefundableTaxAmount(AmountType value) {
        this.totalRefundableTaxAmount = value;
    }

    /**
     * Total of all applicable tax amounts included in the price. If tax breakdowns are provided, this amount should match the sum of the tax breakdown amounts.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getTotalTaxAmount()
     */
    public void setTotalTaxAmount(AmountType value) {
        this.totalTaxAmount = value;
    }

}
