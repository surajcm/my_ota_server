
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
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
 * Information related to a punishment imposed for breaking a law, rule, or contract.
 * 
 * <p>Java class for PenaltyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PenaltyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PenaltyAppCodeType" minOccurs="0"/>
 *         <element name="CancelFeeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="ChangeFeeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         <element name="NetInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="PenaltyID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="PenaltyPercent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PercentType" minOccurs="0"/>
 *         <element name="Price" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}Price1Type" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PenaltyTypeCodeType" minOccurs="0"/>
 *         <element name="UpgradeFeeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "appCode",
    "cancelFeeInd",
    "changeFeeInd",
    "descText",
    "netInd",
    "penaltyID",
    "penaltyPercent",
    "price",
    "typeCode",
    "upgradeFeeInd"
})
public class PenaltyType {

    /**
     * Penalty application type. Examples: ADE (After departure) NOS (No show) PDE (Prior to departure)
     * 
     */
    @XmlElement(name = "AppCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appCode;
    /**
     * When TRUE, Cancellation fee(s) may apply.
     * 
     */
    @XmlElement(name = "CancelFeeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean cancelFeeInd;
    /**
     * When TRUE, Change of Itinerary fee(s) may apply.
     * 
     */
    @XmlElement(name = "ChangeFeeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean changeFeeInd;
    /**
     * Description of the applicable penalty.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<String> descText;
    /**
     * The airline informs the seller if the penalty is netted (True) (i.e. taken from any amount that airline will owe to customer consequently to the servicing) or to be paid (False) (i.e. charged to customer upfront any servicing action, and even if customer benefits from a subsequent refund/ residual value).
     * 
     */
    @XmlElement(name = "NetInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean netInd;
    /**
     * Unique identifier of this Penalty instance.
     * 
     */
    @XmlElement(name = "PenaltyID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String penaltyID;
    /**
     * Percentage Value relating to acceptable the total amount by which the Order item price can vary; OR the amount of a penalty.  Example: 20 USD, 2 Percent
     * 
     */
    @XmlElement(name = "PenaltyPercent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal penaltyPercent;
    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     */
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Price1Type price;
    /**
     * Penalty type information. Examples: Cancellation, Change, NoShow, Upgrade, Other
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "token")
    protected PenaltyTypeCodeContentType typeCode;
    /**
     * When TRUE, Upgrade fee(s) may apply.
     * 
     */
    @XmlElement(name = "UpgradeFeeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean upgradeFeeInd;

    /**
     * Penalty application type. Examples: ADE (After departure) NOS (No show) PDE (Prior to departure)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAppCode()
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * When TRUE, Cancellation fee(s) may apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelFeeInd() {
        return cancelFeeInd;
    }

    /**
     * Sets the value of the cancelFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCancelFeeInd()
     */
    public void setCancelFeeInd(Boolean value) {
        this.cancelFeeInd = value;
    }

    /**
     * When TRUE, Change of Itinerary fee(s) may apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeFeeInd() {
        return changeFeeInd;
    }

    /**
     * Sets the value of the changeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isChangeFeeInd()
     */
    public void setChangeFeeInd(Boolean value) {
        this.changeFeeInd = value;
    }

    /**
     * Description of the applicable penalty.
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
     * The airline informs the seller if the penalty is netted (True) (i.e. taken from any amount that airline will owe to customer consequently to the servicing) or to be paid (False) (i.e. charged to customer upfront any servicing action, and even if customer benefits from a subsequent refund/ residual value).
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetInd() {
        return netInd;
    }

    /**
     * Sets the value of the netInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNetInd()
     */
    public void setNetInd(Boolean value) {
        this.netInd = value;
    }

    /**
     * Unique identifier of this Penalty instance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyID() {
        return penaltyID;
    }

    /**
     * Sets the value of the penaltyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPenaltyID()
     */
    public void setPenaltyID(String value) {
        this.penaltyID = value;
    }

    /**
     * Percentage Value relating to acceptable the total amount by which the Order item price can vary; OR the amount of a penalty.  Example: 20 USD, 2 Percent
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyPercent() {
        return penaltyPercent;
    }

    /**
     * Sets the value of the penaltyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPenaltyPercent()
     */
    public void setPenaltyPercent(BigDecimal value) {
        this.penaltyPercent = value;
    }

    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     * @return
     *     possible object is
     *     {@link Price1Type }
     *     
     */
    public Price1Type getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1Type }
     *     
     * @see #getPrice()
     */
    public void setPrice(Price1Type value) {
        this.price = value;
    }

    /**
     * Penalty type information. Examples: Cancellation, Change, NoShow, Upgrade, Other
     * 
     * @return
     *     possible object is
     *     {@link PenaltyTypeCodeContentType }
     *     
     */
    public PenaltyTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyTypeCodeContentType }
     *     
     * @see #getTypeCode()
     */
    public void setTypeCode(PenaltyTypeCodeContentType value) {
        this.typeCode = value;
    }

    /**
     * When TRUE, Upgrade fee(s) may apply.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeFeeInd() {
        return upgradeFeeInd;
    }

    /**
     * Sets the value of the upgradeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isUpgradeFeeInd()
     */
    public void setUpgradeFeeInd(Boolean value) {
        this.upgradeFeeInd = value;
    }

}
