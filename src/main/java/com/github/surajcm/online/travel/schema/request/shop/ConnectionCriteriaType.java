
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import com.github.surajcm.online.travel.dataaccess.serialization.ZonedDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Customer's requested connection information.
 * 
 * <p>Java class for ConnectionCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConnectionCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConnectionPrefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type"/>
 *         <element name="ConnectionPricingInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="InterlineInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="MaximumConnectionQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}QtyType" minOccurs="0"/>
 *         <element name="MaximumConnectionTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *         <element name="MinimumConnectionTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TimeType" minOccurs="0"/>
 *         <element name="StationCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}StationCriteriaType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "connectionPrefID",
    "connectionPricingInd",
    "interlineInd",
    "maximumConnectionQty",
    "maximumConnectionTime",
    "minimumConnectionTime",
    "stationCriteria"
})
public class ConnectionCriteriaType {

    /**
     * Unique identifier assigned to this connection preference.
     * 
     */
    @XmlElement(name = "ConnectionPrefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionPrefID;
    /**
     * When TRUE, connection pricing should be applied.
     * 
     */
    @XmlElement(name = "ConnectionPricingInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean connectionPricingInd;
    /**
     * When TRUE, an interline connection is preferred.
     * 
     */
    @XmlElement(name = "InterlineInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean interlineInd;
    /**
     * Maximum number of connections.
     * 
     */
    @XmlElement(name = "MaximumConnectionQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal maximumConnectionQty;
    /**
     * Maximum connection time preference.
     * 
     */
    @XmlElement(name = "MaximumConnectionTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime maximumConnectionTime;
    /**
     * Minimum connection time preference.
     * 
     */
    @XmlElement(name = "MinimumConnectionTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime minimumConnectionTime;
    /**
     * The customer's requested Station criteria.
     * 
     */
    @XmlElement(name = "StationCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected List<StationCriteriaType> stationCriteria;

    /**
     * Unique identifier assigned to this connection preference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionPrefID() {
        return connectionPrefID;
    }

    /**
     * Sets the value of the connectionPrefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConnectionPrefID()
     */
    public void setConnectionPrefID(String value) {
        this.connectionPrefID = value;
    }

    /**
     * When TRUE, connection pricing should be applied.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionPricingInd() {
        return connectionPricingInd;
    }

    /**
     * Sets the value of the connectionPricingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isConnectionPricingInd()
     */
    public void setConnectionPricingInd(Boolean value) {
        this.connectionPricingInd = value;
    }

    /**
     * When TRUE, an interline connection is preferred.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterlineInd() {
        return interlineInd;
    }

    /**
     * Sets the value of the interlineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInterlineInd()
     */
    public void setInterlineInd(Boolean value) {
        this.interlineInd = value;
    }

    /**
     * Maximum number of connections.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumConnectionQty() {
        return maximumConnectionQty;
    }

    /**
     * Sets the value of the maximumConnectionQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaximumConnectionQty()
     */
    public void setMaximumConnectionQty(BigDecimal value) {
        this.maximumConnectionQty = value;
    }

    /**
     * Maximum connection time preference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getMaximumConnectionTime() {
        return maximumConnectionTime;
    }

    /**
     * Sets the value of the maximumConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMaximumConnectionTime()
     */
    public void setMaximumConnectionTime(ZonedDateTime value) {
        this.maximumConnectionTime = value;
    }

    /**
     * Minimum connection time preference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getMinimumConnectionTime() {
        return minimumConnectionTime;
    }

    /**
     * Sets the value of the minimumConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMinimumConnectionTime()
     */
    public void setMinimumConnectionTime(ZonedDateTime value) {
        this.minimumConnectionTime = value;
    }

    /**
     * The customer's requested Station criteria.
     * 
     * Gets the value of the stationCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStationCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the stationCriteria property.
     */
    public List<StationCriteriaType> getStationCriteria() {
        if (stationCriteria == null) {
            stationCriteria = new ArrayList<>();
        }
        return this.stationCriteria;
    }

}
