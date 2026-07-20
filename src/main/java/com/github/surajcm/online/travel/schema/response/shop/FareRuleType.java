
package com.github.surajcm.online.travel.schema.response.shop;

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
 * Special purchasing rules and restrictions used to differentiate fare levels from one another.
 * 
 * <p>Java class for FareRuleType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FareRuleType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstantPurchaseTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Remark" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RuleCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="TicketlessInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareRuleType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "instantPurchaseTypeCode",
    "penaltyRefID",
    "remark",
    "ruleCode",
    "ticketlessInd"
})
public class FareRuleType {

    /**
     * Instant purchase type code, Ex: CC (Ticketless purchase immediately charged to credit card) NO (Not an instant purchase) TT (Simultaneous with time of ticketing)  Encoding scheme: IATA PADIS Codeset IPT - Instant Purchase Type
     * 
     */
    @XmlElement(name = "InstantPurchaseTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String instantPurchaseTypeCode;
    /**
     * Reference to a Penalty ID.
     * 
     */
    @XmlElement(name = "PenaltyRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    /**
     * Additional, supplementary information about the document or service .
     * 
     */
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<RemarkType> remark;
    /**
     * Fare category number as defined by ATPCO.
     * 
     */
    @XmlElement(name = "RuleCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ruleCode;
    /**
     * When TRUE, the Fare can be purchased without issuing a ticket.
     * 
     */
    @XmlElement(name = "TicketlessInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean ticketlessInd;

    /**
     * Instant purchase type code, Ex: CC (Ticketless purchase immediately charged to credit card) NO (Not an instant purchase) TT (Simultaneous with time of ticketing)  Encoding scheme: IATA PADIS Codeset IPT - Instant Purchase Type
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstantPurchaseTypeCode() {
        return instantPurchaseTypeCode;
    }

    /**
     * Sets the value of the instantPurchaseTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInstantPurchaseTypeCode()
     */
    public void setInstantPurchaseTypeCode(String value) {
        this.instantPurchaseTypeCode = value;
    }

    /**
     * Reference to a Penalty ID.
     * 
     * Gets the value of the penaltyRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPenaltyRefID().add(newItem);
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
     *     The value of the penaltyRefID property.
     */
    public List<String> getPenaltyRefID() {
        if (penaltyRefID == null) {
            penaltyRefID = new ArrayList<>();
        }
        return this.penaltyRefID;
    }

    /**
     * Additional, supplementary information about the document or service .
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
     * Fare category number as defined by ATPCO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * Sets the value of the ruleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRuleCode()
     */
    public void setRuleCode(String value) {
        this.ruleCode = value;
    }

    /**
     * When TRUE, the Fare can be purchased without issuing a ticket.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketlessInd() {
        return ticketlessInd;
    }

    /**
     * Sets the value of the ticketlessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTicketlessInd()
     */
    public void setTicketlessInd(Boolean value) {
        this.ticketlessInd = value;
    }

}
