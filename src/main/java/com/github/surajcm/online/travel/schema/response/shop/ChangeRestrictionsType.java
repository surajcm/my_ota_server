
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * These are a set of qualifying conditions/rules/restriction  that are related to a constrained priced grouping of services for a Change/modification action.
 * 
 * <p>Java class for ChangeRestrictionsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ChangeRestrictionsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllowedModificationInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="ChangeTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ChangeTypeCodeType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="EffectiveDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         <element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateTimeType" minOccurs="0"/>
 *         <element name="Fee" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}Fee1Type" minOccurs="0"/>
 *         <element name="JourneyStageCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}JourneyStageTypeCodeType" minOccurs="0"/>
 *         <element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="Refund" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}RefundType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeRestrictionsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "allowedModificationInd",
    "changeTypeCode",
    "descText",
    "effectiveDateTime",
    "expirationDateTime",
    "fee",
    "journeyStageCode",
    "paxRefID",
    "refund"
})
public class ChangeRestrictionsType {

    /**
     * This flags if this condition allows any modification. If this is set to FALSE then the condition further identified by the other attributes indicates that no Change is allowed.
     * 
     */
    @XmlElement(name = "AllowedModificationInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean allowedModificationInd;
    /**
     * This identifies using Change type Code ENUM the type of change that applies to the condition. valid examples are NAME       FLIGHT SERVICE
     * 
     */
    @XmlElement(name = "ChangeTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "token")
    protected ChangeTypeCodeContentType changeTypeCode;
    /**
     * Describes what this restriction is.   E.G  -Change allowed  within dates(1) specified with associated fee. --Change allowed  within dates(2) specified with associated fee. - No change allowed
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String descText;
    /**
     * This identifies the effective date used in conjunction with the Expiration date to qualify the applicability of this condition This date is relative to the first flight segment.
     * 
     */
    @XmlElement(name = "EffectiveDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType effectiveDateTime;
    /**
     * This identifies the Expiration date used in conjunction with the Effective date to qualify the applicability of this condition This date is relative to the first flight segment.
     * 
     */
    @XmlElement(name = "ExpirationDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected DateTimeType expirationDateTime;
    /**
     * Amount added on to a charge for a specific product, purpose, or service.
     * 
     */
    @XmlElement(name = "Fee", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Fee1Type fee;
    /**
     * Valid Stage Codes are defined in the Journey Stage Type Code ENUM PRIOR TO DEPARTURE NO SHOW AFTER DEPARTURE  This will be used either in addition to other BBIE's or individually to qualify a condition.
     * 
     */
    @XmlElement(name = "JourneyStageCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "token")
    protected JourneyStageTypeCodeContentType journeyStageCode;
    /**
     * Used to store a ref to the passenger.
     * 
     */
    @XmlElement(name = "PaxRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    /**
     * Contains refund type, payment type and amount attributes for a specific product, purpose, or service.
     * 
     */
    @XmlElement(name = "Refund", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected RefundType refund;

    /**
     * This flags if this condition allows any modification. If this is set to FALSE then the condition further identified by the other attributes indicates that no Change is allowed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowedModificationInd() {
        return allowedModificationInd;
    }

    /**
     * Sets the value of the allowedModificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllowedModificationInd()
     */
    public void setAllowedModificationInd(Boolean value) {
        this.allowedModificationInd = value;
    }

    /**
     * This identifies using Change type Code ENUM the type of change that applies to the condition. valid examples are NAME       FLIGHT SERVICE
     * 
     * @return
     *     possible object is
     *     {@link ChangeTypeCodeContentType }
     *     
     */
    public ChangeTypeCodeContentType getChangeTypeCode() {
        return changeTypeCode;
    }

    /**
     * Sets the value of the changeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeTypeCodeContentType }
     *     
     * @see #getChangeTypeCode()
     */
    public void setChangeTypeCode(ChangeTypeCodeContentType value) {
        this.changeTypeCode = value;
    }

    /**
     * Describes what this restriction is.   E.G  -Change allowed  within dates(1) specified with associated fee. --Change allowed  within dates(2) specified with associated fee. - No change allowed
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
     * This identifies the effective date used in conjunction with the Expiration date to qualify the applicability of this condition This date is relative to the first flight segment.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getEffectiveDateTime()
     */
    public void setEffectiveDateTime(DateTimeType value) {
        this.effectiveDateTime = value;
    }

    /**
     * This identifies the Expiration date used in conjunction with the Effective date to qualify the applicability of this condition This date is relative to the first flight segment.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getExpirationDateTime()
     */
    public void setExpirationDateTime(DateTimeType value) {
        this.expirationDateTime = value;
    }

    /**
     * Amount added on to a charge for a specific product, purpose, or service.
     * 
     * @return
     *     possible object is
     *     {@link Fee1Type }
     *     
     */
    public Fee1Type getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee1Type }
     *     
     * @see #getFee()
     */
    public void setFee(Fee1Type value) {
        this.fee = value;
    }

    /**
     * Valid Stage Codes are defined in the Journey Stage Type Code ENUM PRIOR TO DEPARTURE NO SHOW AFTER DEPARTURE  This will be used either in addition to other BBIE's or individually to qualify a condition.
     * 
     * @return
     *     possible object is
     *     {@link JourneyStageTypeCodeContentType }
     *     
     */
    public JourneyStageTypeCodeContentType getJourneyStageCode() {
        return journeyStageCode;
    }

    /**
     * Sets the value of the journeyStageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyStageTypeCodeContentType }
     *     
     * @see #getJourneyStageCode()
     */
    public void setJourneyStageCode(JourneyStageTypeCodeContentType value) {
        this.journeyStageCode = value;
    }

    /**
     * Used to store a ref to the passenger.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaxRefID()
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Contains refund type, payment type and amount attributes for a specific product, purpose, or service.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     * @see #getRefund()
     */
    public void setRefund(RefundType value) {
        this.refund = value;
    }

}
