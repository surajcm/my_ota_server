
package com.github.surajcm.online.travel.schema.request.offer;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import com.github.surajcm.online.travel.dataaccess.serialization.ZonedDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Transfer location specific filter criteria for shopping requests.
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
 *         <element name="ConnectionCriteriaID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *         <element name="ConnectionPricingInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="InterlineInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="MaximumConnectionQty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}QtyType" minOccurs="0"/>
 *         <element name="MaximumConnectionTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TimeType" minOccurs="0"/>
 *         <element name="MinimumConnectionTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TimeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "connectionCriteriaID",
    "connectionPricingInd",
    "interlineInd",
    "maximumConnectionQty",
    "maximumConnectionTime",
    "minimumConnectionTime"
})
public class ConnectionCriteriaType {

    /**
     * Unique identifier assigned to this transfer preference.
     * 
     */
    @XmlElement(name = "ConnectionCriteriaID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionCriteriaID;
    /**
     * When TRUE, connection pricing should be applied.
     * 
     */
    @XmlElement(name = "ConnectionPricingInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean connectionPricingInd;
    /**
     * When TRUE, an interline connection is preferred.
     * 
     */
    @XmlElement(name = "InterlineInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean interlineInd;
    /**
     * Maximum number of connections.
     * 
     */
    @XmlElement(name = "MaximumConnectionQty", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BigDecimal maximumConnectionQty;
    /**
     * Maximum connection time preference.
     * 
     */
    @XmlElement(name = "MaximumConnectionTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime maximumConnectionTime;
    /**
     * Minimum connection time preference.
     * 
     */
    @XmlElement(name = "MinimumConnectionTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime minimumConnectionTime;

    /**
     * Unique identifier assigned to this transfer preference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCriteriaID() {
        return connectionCriteriaID;
    }

    /**
     * Sets the value of the connectionCriteriaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConnectionCriteriaID()
     */
    public void setConnectionCriteriaID(String value) {
        this.connectionCriteriaID = value;
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

}
