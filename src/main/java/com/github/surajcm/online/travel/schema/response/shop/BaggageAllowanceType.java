
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
 * The amount of checked or carry-on luggage the airline will allow per passenger.
 * 
 * <p>Java class for BaggageAllowanceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaggageAllowanceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="BaggageAllowanceID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type"/>
 *         <element name="BDC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}BDC_Type" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         <element name="DimensionAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DimensionAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PieceAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PieceAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}RFISC_Type" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}BaggageTypeCodeType"/>
 *         <element name="WeightAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}WeightAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageAllowanceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "applicableBagText",
    "applicablePartyText",
    "baggageAllowanceID",
    "bdc",
    "descText",
    "dimensionAllowance",
    "pieceAllowance",
    "rfisc",
    "typeCode",
    "weightAllowance"
})
public class BaggageAllowanceType {

    /**
     * Applicable bag type. Examples: Carry-On, 1st Checked Bag, 2nd Checked Bag
     * 
     */
    @XmlElement(name = "ApplicableBagText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String applicableBagText;
    /**
     * Baggage weight restriction application. Examples: Party, Traveler. Party applies to all Travelers.
     * 
     */
    @XmlElement(name = "ApplicablePartyText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String applicablePartyText;
    /**
     * Unique identifier of this Baggage Allowance.
     * 
     */
    @XmlElement(name = "BaggageAllowanceID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceID;
    /**
     * The carrier whose baggage allowances and charges apply.
     * 
     */
    @XmlElement(name = "BDC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BDCType bdc;
    /**
     * Baggage Allowance description and additional information.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<String> descText;
    /**
     * Baggage dimension allowance with application information.
     * 
     */
    @XmlElement(name = "DimensionAllowance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<DimensionAllowanceType> dimensionAllowance;
    /**
     * Defines the maximum number of each allowable baggage type.
     * 
     */
    @XmlElement(name = "PieceAllowance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<PieceAllowanceType> pieceAllowance;
    /**
     * Reason For Issuance Sub Code. Examples: 0CC (First Checked Bag) 0B1 (In-flight Entertainment) 0BX (Lounge)
     * 
     */
    @XmlElement(name = "RFISC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String rfisc;
    /**
     * Type of Baggage Allowance. E.g. Checked or CarryOn.
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlSchemaType(name = "string")
    protected BaggageTypeCodeContentType typeCode;
    /**
     * Baggage weight allowance with application information.
     * 
     */
    @XmlElement(name = "WeightAllowance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<WeightAllowanceType> weightAllowance;

    /**
     * Applicable bag type. Examples: Carry-On, 1st Checked Bag, 2nd Checked Bag
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBagText() {
        return applicableBagText;
    }

    /**
     * Sets the value of the applicableBagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApplicableBagText()
     */
    public void setApplicableBagText(String value) {
        this.applicableBagText = value;
    }

    /**
     * Baggage weight restriction application. Examples: Party, Traveler. Party applies to all Travelers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicablePartyText() {
        return applicablePartyText;
    }

    /**
     * Sets the value of the applicablePartyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApplicablePartyText()
     */
    public void setApplicablePartyText(String value) {
        this.applicablePartyText = value;
    }

    /**
     * Unique identifier of this Baggage Allowance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceID() {
        return baggageAllowanceID;
    }

    /**
     * Sets the value of the baggageAllowanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBaggageAllowanceID()
     */
    public void setBaggageAllowanceID(String value) {
        this.baggageAllowanceID = value;
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
     * Baggage Allowance description and additional information.
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
     * Baggage dimension allowance with application information.
     * 
     * Gets the value of the dimensionAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDimensionAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionAllowanceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the dimensionAllowance property.
     */
    public List<DimensionAllowanceType> getDimensionAllowance() {
        if (dimensionAllowance == null) {
            dimensionAllowance = new ArrayList<>();
        }
        return this.dimensionAllowance;
    }

    /**
     * Defines the maximum number of each allowable baggage type.
     * 
     * Gets the value of the pieceAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPieceAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceAllowanceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the pieceAllowance property.
     */
    public List<PieceAllowanceType> getPieceAllowance() {
        if (pieceAllowance == null) {
            pieceAllowance = new ArrayList<>();
        }
        return this.pieceAllowance;
    }

    /**
     * Reason For Issuance Sub Code. Examples: 0CC (First Checked Bag) 0B1 (In-flight Entertainment) 0BX (Lounge)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFISC()
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     * Type of Baggage Allowance. E.g. Checked or CarryOn.
     * 
     * @return
     *     possible object is
     *     {@link BaggageTypeCodeContentType }
     *     
     */
    public BaggageTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageTypeCodeContentType }
     *     
     * @see #getTypeCode()
     */
    public void setTypeCode(BaggageTypeCodeContentType value) {
        this.typeCode = value;
    }

    /**
     * Baggage weight allowance with application information.
     * 
     * Gets the value of the weightAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWeightAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightAllowanceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the weightAllowance property.
     */
    public List<WeightAllowanceType> getWeightAllowance() {
        if (weightAllowance == null) {
            weightAllowance = new ArrayList<>();
        }
        return this.weightAllowance;
    }

}
