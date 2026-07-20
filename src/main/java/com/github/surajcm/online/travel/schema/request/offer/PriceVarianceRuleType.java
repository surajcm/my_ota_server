
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Price Variance supports specifying Payment Processing Rules, including payment failure. Acceptable amount and/or percentage of the total amount by which the Order item price can vary. Example: 20 USD, 2 Percent
 * 
 * <p>Java class for PriceVarianceRuleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceVarianceRuleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcceptableVarianceAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType"/>
 *         <element name="AcceptableVariancePercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PercentType" minOccurs="0"/>
 *         <element name="EffectivePeriodDuration" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DurationType" minOccurs="0"/>
 *         <element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ProperNameType" minOccurs="0"/>
 *         <element name="Remark" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RuleID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="RuleName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ProperNameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceVarianceRuleType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "acceptableVarianceAmount",
    "acceptableVariancePercent",
    "effectivePeriodDuration",
    "ownerName",
    "remark",
    "ruleID",
    "ruleName"
})
public class PriceVarianceRuleType {

    /**
     * Acceptable amount by which the price at time of payment can vary. Example: 20 USD
     * 
     */
    @XmlElement(name = "AcceptableVarianceAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected AmountType acceptableVarianceAmount;
    /**
     * Acceptable percent by which the price at time of payment can vary. Example: 2 percent
     * 
     */
    @XmlElement(name = "AcceptableVariancePercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BigDecimal acceptableVariancePercent;
    /**
     * Rule Effective Period.
     * 
     */
    @XmlElement(name = "EffectivePeriodDuration", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Duration effectivePeriodDuration;
    /**
     * Entity that owns/ assigned this Rule. If this is an airline, the IATA Airline Designator Code should be used.
     * 
     */
    @XmlElement(name = "OwnerName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    /**
     * Additional, supplementary information about the document or service.
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<RemarkType> remark;
    /**
     * Rule ID assigned by the owner. Example: PRICERULE001.
     * 
     */
    @XmlElement(name = "RuleID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ruleID;
    /**
     * Rule Name. Example: Acceptable Price variance
     * 
     */
    @XmlElement(name = "RuleName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ruleName;

    /**
     * Acceptable amount by which the price at time of payment can vary. Example: 20 USD
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcceptableVarianceAmount() {
        return acceptableVarianceAmount;
    }

    /**
     * Sets the value of the acceptableVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAcceptableVarianceAmount()
     */
    public void setAcceptableVarianceAmount(AmountType value) {
        this.acceptableVarianceAmount = value;
    }

    /**
     * Acceptable percent by which the price at time of payment can vary. Example: 2 percent
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcceptableVariancePercent() {
        return acceptableVariancePercent;
    }

    /**
     * Sets the value of the acceptableVariancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAcceptableVariancePercent()
     */
    public void setAcceptableVariancePercent(BigDecimal value) {
        this.acceptableVariancePercent = value;
    }

    /**
     * Rule Effective Period.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEffectivePeriodDuration() {
        return effectivePeriodDuration;
    }

    /**
     * Sets the value of the effectivePeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     * @see #getEffectivePeriodDuration()
     */
    public void setEffectivePeriodDuration(Duration value) {
        this.effectivePeriodDuration = value;
    }

    /**
     * Entity that owns/ assigned this Rule. If this is an airline, the IATA Airline Designator Code should be used.
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
     * Rule ID assigned by the owner. Example: PRICERULE001.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRuleID()
     */
    public void setRuleID(String value) {
        this.ruleID = value;
    }

    /**
     * Rule Name. Example: Acceptable Price variance
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Sets the value of the ruleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRuleName()
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

}
