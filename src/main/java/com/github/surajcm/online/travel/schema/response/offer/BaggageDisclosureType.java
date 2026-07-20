
package com.github.surajcm.online.travel.schema.response.offer;

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
 * Disclosure information specifically related to baggage.
 * 
 * <p>Java class for BaggageDisclosureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaggageDisclosureType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageDisclosureID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *         <element name="BDC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}BDC_Type" minOccurs="0"/>
 *         <element name="CheckInChargesInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="CommercialAgreementID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *         <element name="DeferralInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FixedPrePaidInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="RuleTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}BagDisclosureRuleTypeCodeType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDisclosureType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "baggageDisclosureID",
    "bdc",
    "checkInChargesInd",
    "commercialAgreementID",
    "deferralInd",
    "desc",
    "descText",
    "fixedPrePaidInd",
    "ruleTypeCode"
})
public class BaggageDisclosureType {

    /**
     * Uniquely identifies a Bag Disclosure within the message.
     * 
     */
    @XmlElement(name = "BaggageDisclosureID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageDisclosureID;
    /**
     * The carrier whose baggage allowances and charges apply.
     * 
     */
    @XmlElement(name = "BDC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BDCType bdc;
    /**
     * If TRUE, additional taxes, fees and charges may be collected at check-in (regionally determined).
     * 
     */
    @XmlElement(name = "CheckInChargesInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean checkInChargesInd;
    /**
     * Bilateral agreement identifier E.g. baggage cost, Baggage Determining Carrier, etc.
     * 
     */
    @XmlElement(name = "CommercialAgreementID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commercialAgreementID;
    /**
     * If TRUE, The ORA advises the POA that the POA is given the Baggage Determining Carrier designation
     * 
     */
    @XmlElement(name = "DeferralInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean deferralInd;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<DescType> desc;
    /**
     * Description text value.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<String> descText;
    /**
     * Allows POA to tell the ORA if the ORA may alter the POAâ€™s pre-paid baggage charges.  If TRUE, prepaid charge may NOT be altered If FALSE, prepaid charge MAY be altered
     * 
     */
    @XmlElement(name = "FixedPrePaidInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean fixedPrePaidInd;
    /**
     * US Department of Transportation (DOT) Reservation or Disclosure baggage rule. Examples: Y, Disclosure AND US DOT Reservation
     * 
     */
    @XmlElement(name = "RuleTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    @XmlSchemaType(name = "string")
    protected BagDisclosureRuleTypeCodeContentType ruleTypeCode;

    /**
     * Uniquely identifies a Bag Disclosure within the message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageDisclosureID() {
        return baggageDisclosureID;
    }

    /**
     * Sets the value of the baggageDisclosureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaggageDisclosureID()
     */
    public void setBaggageDisclosureID(String value) {
        this.baggageDisclosureID = value;
    }

    /**
     * The carrier whose baggage allowances and charges apply.
     * 
     * @return
     *     possible object is
     *     {@link BDCType }
     *     
     */
    public BDCType getBDC() {
        return bdc;
    }

    /**
     * Sets the value of the bdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDCType }
     *     
     * @see #getBDC()
     */
    public void setBDC(BDCType value) {
        this.bdc = value;
    }

    /**
     * If TRUE, additional taxes, fees and charges may be collected at check-in (regionally determined).
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckInChargesInd() {
        return checkInChargesInd;
    }

    /**
     * Sets the value of the checkInChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCheckInChargesInd()
     */
    public void setCheckInChargesInd(Boolean value) {
        this.checkInChargesInd = value;
    }

    /**
     * Bilateral agreement identifier E.g. baggage cost, Baggage Determining Carrier, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAgreementID() {
        return commercialAgreementID;
    }

    /**
     * Sets the value of the commercialAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCommercialAgreementID()
     */
    public void setCommercialAgreementID(String value) {
        this.commercialAgreementID = value;
    }

    /**
     * If TRUE, The ORA advises the POA that the POA is given the Baggage Determining Carrier designation
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferralInd() {
        return deferralInd;
    }

    /**
     * Sets the value of the deferralInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDeferralInd()
     */
    public void setDeferralInd(Boolean value) {
        this.deferralInd = value;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     * Gets the value of the desc property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * </p>
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Description text value.
     * 
     * Gets the value of the descText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the descText property.
     */
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<>();
        }
        return this.descText;
    }

    /**
     * Allows POA to tell the ORA if the ORA may alter the POAâ€™s pre-paid baggage charges.  If TRUE, prepaid charge may NOT be altered If FALSE, prepaid charge MAY be altered
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedPrePaidInd() {
        return fixedPrePaidInd;
    }

    /**
     * Sets the value of the fixedPrePaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFixedPrePaidInd()
     */
    public void setFixedPrePaidInd(Boolean value) {
        this.fixedPrePaidInd = value;
    }

    /**
     * US Department of Transportation (DOT) Reservation or Disclosure baggage rule. Examples: Y, Disclosure AND US DOT Reservation
     * 
     * @return
     *     possible object is
     *     {@link BagDisclosureRuleTypeCodeContentType }
     *     
     */
    public BagDisclosureRuleTypeCodeContentType getRuleTypeCode() {
        return ruleTypeCode;
    }

    /**
     * Sets the value of the ruleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDisclosureRuleTypeCodeContentType }
     *     
     * @see #getRuleTypeCode()
     */
    public void setRuleTypeCode(BagDisclosureRuleTypeCodeContentType value) {
        this.ruleTypeCode = value;
    }

}
