
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Affinity search includes a wide range of criteria including generic origin/destination information, trip time periods, as well as travel budget.
 * 
 * <p>Java class for AffinityShoppingCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AffinityShoppingCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AffinityOriginDest" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AffinityOriginDestType" maxOccurs="unbounded"/>
 *         <element name="BudgetAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType" minOccurs="0"/>
 *         <element name="JourneyDistanceCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}JourneyDistanceCriteriaType" minOccurs="0"/>
 *         <element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}JourneyDurationCriteriaType" minOccurs="0"/>
 *         <element name="KeywordPref" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ShoppingResponseType" minOccurs="0"/>
 *         <element name="StayPeriod" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}StayPeriodType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityShoppingCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "affinityOriginDest",
    "budgetAmount",
    "journeyDistanceCriteria",
    "journeyDurationCriteria",
    "keywordPref",
    "shoppingResponse",
    "stayPeriod"
})
public class AffinityShoppingCriteriaType {

    /**
     * Origin and Destination information for affinity shopping requests.
     * 
     */
    @XmlElement(name = "AffinityOriginDest", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected List<AffinityOriginDestType> affinityOriginDest;
    /**
     * Total budget for all Passengers (Payers) for a journey request.
     * 
     */
    @XmlElement(name = "BudgetAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AmountType budgetAmount;
    /**
     * Total journey distance criteria.
     * 
     */
    @XmlElement(name = "JourneyDistanceCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected JourneyDistanceCriteriaType journeyDistanceCriteria;
    /**
     * Total journey travel time preferences. This includes the sum of all flight durations as well as connection times.
     * 
     */
    @XmlElement(name = "JourneyDurationCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    /**
     * Contextual information to further describe something using a key-value pair.
     * 
     */
    @XmlElement(name = "KeywordPref", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<KeyValuePropertyType> keywordPref;
    /**
     * Shopping session (message response) ID.
     * 
     */
    @XmlElement(name = "ShoppingResponse", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected ShoppingResponseType shoppingResponse;
    /**
     * Time constraints for an Affinity Shopping request including specific Dates, Seasons, Months, or Durations.
     * 
     */
    @XmlElement(name = "StayPeriod", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected StayPeriodType stayPeriod;

    /**
     * Origin and Destination information for affinity shopping requests.
     * 
     * Gets the value of the affinityOriginDest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinityOriginDest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAffinityOriginDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffinityOriginDestType }
     * </p>
     * 
     * 
     * @return
     *     The value of the affinityOriginDest property.
     */
    public List<AffinityOriginDestType> getAffinityOriginDest() {
        if (affinityOriginDest == null) {
            affinityOriginDest = new ArrayList<>();
        }
        return this.affinityOriginDest;
    }

    /**
     * Total budget for all Passengers (Payers) for a journey request.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets the value of the budgetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getBudgetAmount()
     */
    public void setBudgetAmount(AmountType value) {
        this.budgetAmount = value;
    }

    /**
     * Total journey distance criteria.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     */
    public JourneyDistanceCriteriaType getJourneyDistanceCriteria() {
        return journeyDistanceCriteria;
    }

    /**
     * Sets the value of the journeyDistanceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     * @see #getJourneyDistanceCriteria()
     */
    public void setJourneyDistanceCriteria(JourneyDistanceCriteriaType value) {
        this.journeyDistanceCriteria = value;
    }

    /**
     * Total journey travel time preferences. This includes the sum of all flight durations as well as connection times.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     * @see #getJourneyDurationCriteria()
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * Contextual information to further describe something using a key-value pair.
     * 
     * Gets the value of the keywordPref property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordPref property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getKeywordPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the keywordPref property.
     */
    public List<KeyValuePropertyType> getKeywordPref() {
        if (keywordPref == null) {
            keywordPref = new ArrayList<>();
        }
        return this.keywordPref;
    }

    /**
     * Shopping session (message response) ID.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     * @see #getShoppingResponse()
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
    }

    /**
     * Time constraints for an Affinity Shopping request including specific Dates, Seasons, Months, or Durations.
     * 
     * @return
     *     possible object is
     *     {@link StayPeriodType }
     *     
     */
    public StayPeriodType getStayPeriod() {
        return stayPeriod;
    }

    /**
     * Sets the value of the stayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StayPeriodType }
     *     
     * @see #getStayPeriod()
     */
    public void setStayPeriod(StayPeriodType value) {
        this.stayPeriod = value;
    }

}
