
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
 * Fare criteria used to filter shopping results.
 * 
 * <p>Java class for FareCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FareCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FareTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GroupFareCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}GroupFareCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NoAdvancePurchaseInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="NoMaxStayInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="NoMinStayInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="NoPenaltyInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "fareBasisCode",
    "fareTypeCode",
    "groupFareCriteria",
    "noAdvancePurchaseInd",
    "noMaxStayInd",
    "noMinStayInd",
    "noPenaltyInd",
    "prefLevel"
})
public class FareCriteriaType {

    /**
     * Fare basis code. Example: Y26
     * 
     */
    @XmlElement(name = "FareBasisCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> fareBasisCode;
    /**
     * Fare type. Examples: 70J-Published Fares, 749-Negotiated Fares, 756-One Way Fare,  758-Private Fares  Encoding Scheme: PADIS codeset element 9910 - Fare Qualifier
     * 
     */
    @XmlElement(name = "FareTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> fareTypeCode;
    /**
     * Group Fare preferences by passenger type
     * 
     */
    @XmlElement(name = "GroupFareCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<GroupFareCriteriaType> groupFareCriteria;
    /**
     * When true, do not return fares with advance purchase restrictions.
     * 
     */
    @XmlElement(name = "NoAdvancePurchaseInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean noAdvancePurchaseInd;
    /**
     * When true, do not return fares with maximum stay restrictions.
     * 
     */
    @XmlElement(name = "NoMaxStayInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean noMaxStayInd;
    /**
     * When true, do not return fares with minimum stay restrictions.
     * 
     */
    @XmlElement(name = "NoMinStayInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean noMinStayInd;
    /**
     * When true, do not return fares with penalties.
     * 
     */
    @XmlElement(name = "NoPenaltyInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean noPenaltyInd;
    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected PrefLevelType prefLevel;

    /**
     * Fare basis code. Example: Y26
     * 
     * Gets the value of the fareBasisCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareBasisCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareBasisCode().add(newItem);
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
     *     The value of the fareBasisCode property.
     */
    public List<String> getFareBasisCode() {
        if (fareBasisCode == null) {
            fareBasisCode = new ArrayList<>();
        }
        return this.fareBasisCode;
    }

    /**
     * Fare type. Examples: 70J-Published Fares, 749-Negotiated Fares, 756-One Way Fare,  758-Private Fares  Encoding Scheme: PADIS codeset element 9910 - Fare Qualifier
     * 
     * Gets the value of the fareTypeCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareTypeCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareTypeCode().add(newItem);
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
     *     The value of the fareTypeCode property.
     */
    public List<String> getFareTypeCode() {
        if (fareTypeCode == null) {
            fareTypeCode = new ArrayList<>();
        }
        return this.fareTypeCode;
    }

    /**
     * Group Fare preferences by passenger type
     * 
     * Gets the value of the groupFareCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupFareCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGroupFareCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupFareCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the groupFareCriteria property.
     */
    public List<GroupFareCriteriaType> getGroupFareCriteria() {
        if (groupFareCriteria == null) {
            groupFareCriteria = new ArrayList<>();
        }
        return this.groupFareCriteria;
    }

    /**
     * When true, do not return fares with advance purchase restrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAdvancePurchaseInd() {
        return noAdvancePurchaseInd;
    }

    /**
     * Sets the value of the noAdvancePurchaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoAdvancePurchaseInd()
     */
    public void setNoAdvancePurchaseInd(Boolean value) {
        this.noAdvancePurchaseInd = value;
    }

    /**
     * When true, do not return fares with maximum stay restrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoMaxStayInd() {
        return noMaxStayInd;
    }

    /**
     * Sets the value of the noMaxStayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoMaxStayInd()
     */
    public void setNoMaxStayInd(Boolean value) {
        this.noMaxStayInd = value;
    }

    /**
     * When true, do not return fares with minimum stay restrictions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoMinStayInd() {
        return noMinStayInd;
    }

    /**
     * Sets the value of the noMinStayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoMinStayInd()
     */
    public void setNoMinStayInd(Boolean value) {
        this.noMinStayInd = value;
    }

    /**
     * When true, do not return fares with penalties.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPenaltyInd() {
        return noPenaltyInd;
    }

    /**
     * Sets the value of the noPenaltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoPenaltyInd()
     */
    public void setNoPenaltyInd(Boolean value) {
        this.noPenaltyInd = value;
    }

    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     * @see #getPrefLevel()
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
