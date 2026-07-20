
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
 * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
 * 
 * <p>Java class for CommissionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CommissionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         <element name="CommissionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="Percentage" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PercentType" minOccurs="0"/>
 *         <element name="PercentageAppliedToAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *         <element name="TaxableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "amount",
    "commissionCode",
    "percentage",
    "percentageAppliedToAmount",
    "taxableInd"
})
public class CommissionType {

    /**
     * Commission amount and currency code. Example: 20 USD
     * 
     */
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType amount;
    /**
     * Commission code. Example: 1000, BFST
     * 
     */
    @XmlElement(name = "CommissionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commissionCode;
    /**
     * Commission percentage. Example: 20
     * 
     */
    @XmlElement(name = "Percentage", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal percentage;
    /**
     * The amount to which the percentage will be applied.    For Example: Net Amount Gross Amoun Difference between the Net and Gross amounts.
     * 
     */
    @XmlElement(name = "PercentageAppliedToAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType percentageAppliedToAmount;
    /**
     * When TRUE, the commission amount specified is subject to Tax/VAT.
     * 
     */
    @XmlElement(name = "TaxableInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean taxableInd;

    /**
     * Commission amount and currency code. Example: 20 USD
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
     * Commission code. Example: 1000, BFST
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionCode() {
        return commissionCode;
    }

    /**
     * Sets the value of the commissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCommissionCode()
     */
    public void setCommissionCode(String value) {
        this.commissionCode = value;
    }

    /**
     * Commission percentage. Example: 20
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPercentage()
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * The amount to which the percentage will be applied.    For Example: Net Amount Gross Amoun Difference between the Net and Gross amounts.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPercentageAppliedToAmount() {
        return percentageAppliedToAmount;
    }

    /**
     * Sets the value of the percentageAppliedToAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getPercentageAppliedToAmount()
     */
    public void setPercentageAppliedToAmount(AmountType value) {
        this.percentageAppliedToAmount = value;
    }

    /**
     * When TRUE, the commission amount specified is subject to Tax/VAT.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTaxableInd()
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

}
