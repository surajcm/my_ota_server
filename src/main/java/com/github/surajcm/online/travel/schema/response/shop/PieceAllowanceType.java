
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the maximum number of each allowable baggage type.
 * 
 * <p>Java class for PieceAllowanceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PieceAllowanceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" maxOccurs="99" minOccurs="0"/>
 *         <element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DimensionAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}WeightAllowanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TotalQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}QtyType"/>
 *         <element name="TypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceAllowanceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "applicableBagText",
    "applicablePartyText",
    "desc",
    "pieceDimensionAllowance",
    "pieceWeightAllowance",
    "totalQty",
    "typeText"
})
public class PieceAllowanceType {

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
    @XmlElement(name = "ApplicablePartyText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected String applicablePartyText;
    /**
     * Piece allowance description and additional information.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<String> desc;
    /**
     * Baggage dimension allowance with application information.
     * 
     */
    @XmlElement(name = "PieceDimensionAllowance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<DimensionAllowanceType> pieceDimensionAllowance;
    /**
     * Baggage weight allowance with application information.
     * 
     */
    @XmlElement(name = "PieceWeightAllowance", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<WeightAllowanceType> pieceWeightAllowance;
    /**
     * Maximum pieces of baggage allowed. Example: 4
     * 
     */
    @XmlElement(name = "TotalQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected BigDecimal totalQty;
    /**
     * Type of bag. Example: Golf Equipment, Fishing Bag, Car Seat, etc.
     * 
     */
    @XmlElement(name = "TypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String typeText;

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
     * Piece allowance description and additional information.
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
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<String> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Baggage dimension allowance with application information.
     * 
     * Gets the value of the pieceDimensionAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceDimensionAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPieceDimensionAllowance().add(newItem);
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
     *     The value of the pieceDimensionAllowance property.
     */
    public List<DimensionAllowanceType> getPieceDimensionAllowance() {
        if (pieceDimensionAllowance == null) {
            pieceDimensionAllowance = new ArrayList<>();
        }
        return this.pieceDimensionAllowance;
    }

    /**
     * Baggage weight allowance with application information.
     * 
     * Gets the value of the pieceWeightAllowance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceWeightAllowance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPieceWeightAllowance().add(newItem);
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
     *     The value of the pieceWeightAllowance property.
     */
    public List<WeightAllowanceType> getPieceWeightAllowance() {
        if (pieceWeightAllowance == null) {
            pieceWeightAllowance = new ArrayList<>();
        }
        return this.pieceWeightAllowance;
    }

    /**
     * Maximum pieces of baggage allowed. Example: 4
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalQty() {
        return totalQty;
    }

    /**
     * Sets the value of the totalQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalQty()
     */
    public void setTotalQty(BigDecimal value) {
        this.totalQty = value;
    }

    /**
     * Type of bag. Example: Golf Equipment, Fishing Bag, Car Seat, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTypeText()
     */
    public void setTypeText(String value) {
        this.typeText = value;
    }

}
