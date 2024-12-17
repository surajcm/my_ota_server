
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
 * Baggage pricing specific filter criteria for shopping requests, including baggage type, charges, and settlement information.
 * 
 * <p>Java class for BaggagePricingCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaggagePricingCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BaggageOptionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BaggageTypeCodeType" maxOccurs="2" minOccurs="0"/>
 *         <element name="CommercialAgreementID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="DeferralInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="FixedPrepaidInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="IncludeSettlementInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="OptionalChargesCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="RequestedActionCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MessageFunctionCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggagePricingCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "baggageOptionCode",
    "commercialAgreementID",
    "deferralInd",
    "fixedPrepaidInd",
    "includeSettlementInd",
    "optionalChargesCode",
    "requestedActionCode"
})
public class BaggagePricingCriteriaType {

    /**
     * Specifies the type of baggage (e.g. CarryOnBag, CheckedBag).
     * 
     */
    @XmlElement(name = "BaggageOptionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "string")
    protected List<BaggageTypeCodeContentType> baggageOptionCode;
    /**
     * Bilateral agreement identifier.
     * 
     */
    @XmlElement(name = "CommercialAgreementID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commercialAgreementID;
    /**
     * When TRUE, the ORA advises that the POA is given BDC designation.
     * 
     */
    @XmlElement(name = "DeferralInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean deferralInd;
    /**
     * When TRUE, the ORA may alter the POA's prepaid baggage charges.
     * 
     */
    @XmlElement(name = "FixedPrepaidInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean fixedPrepaidInd;
    /**
     * When TRUE, the POA is requested to return the settlement value for the baggage.
     * 
     */
    @XmlElement(name = "IncludeSettlementInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean includeSettlementInd;
    /**
     * Allowance catalog requested. Example: C (Catalog Only).
     * 
     */
    @XmlElement(name = "OptionalChargesCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String optionalChargesCode;
    /**
     * Requested action to take for this information (example: 131 DISPLAY ONLY).
     * 
     */
    @XmlElement(name = "RequestedActionCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String requestedActionCode;

    /**
     * Specifies the type of baggage (e.g. CarryOnBag, CheckedBag).
     * 
     * Gets the value of the baggageOptionCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageOptionCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaggageOptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageTypeCodeContentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the baggageOptionCode property.
     */
    public List<BaggageTypeCodeContentType> getBaggageOptionCode() {
        if (baggageOptionCode == null) {
            baggageOptionCode = new ArrayList<>();
        }
        return this.baggageOptionCode;
    }

    /**
     * Bilateral agreement identifier.
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
     * When TRUE, the ORA advises that the POA is given BDC designation.
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
     * When TRUE, the ORA may alter the POA's prepaid baggage charges.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedPrepaidInd() {
        return fixedPrepaidInd;
    }

    /**
     * Sets the value of the fixedPrepaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFixedPrepaidInd()
     */
    public void setFixedPrepaidInd(Boolean value) {
        this.fixedPrepaidInd = value;
    }

    /**
     * When TRUE, the POA is requested to return the settlement value for the baggage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSettlementInd() {
        return includeSettlementInd;
    }

    /**
     * Sets the value of the includeSettlementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeSettlementInd()
     */
    public void setIncludeSettlementInd(Boolean value) {
        this.includeSettlementInd = value;
    }

    /**
     * Allowance catalog requested. Example: C (Catalog Only).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalChargesCode() {
        return optionalChargesCode;
    }

    /**
     * Sets the value of the optionalChargesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOptionalChargesCode()
     */
    public void setOptionalChargesCode(String value) {
        this.optionalChargesCode = value;
    }

    /**
     * Requested action to take for this information (example: 131 DISPLAY ONLY).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedActionCode() {
        return requestedActionCode;
    }

    /**
     * Sets the value of the requestedActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequestedActionCode()
     */
    public void setRequestedActionCode(String value) {
        this.requestedActionCode = value;
    }

}
