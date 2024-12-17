
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Time constraints for an Affinity Shopping request including specific Dates, Seasons, Months, or Durations.
 * 
 * <p>Java class for StayPeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StayPeriodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EndDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="MaximumStayNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="MinimumStayNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="StartDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateType" minOccurs="0"/>
 *         <element name="StayMonthName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" maxOccurs="12" minOccurs="0"/>
 *         <element name="StayQuarterText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" maxOccurs="4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayPeriodType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "endDate",
    "maximumStayNumber",
    "minimumStayNumber",
    "startDate",
    "stayMonthName",
    "stayQuarterText"
})
public class StayPeriodType {

    /**
     * Ending date of the stay period.
     * 
     */
    @XmlElement(name = "EndDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate endDate;
    /**
     * Maximum stay period within the specified date or calendar range.
     * 
     */
    @XmlElement(name = "MaximumStayNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal maximumStayNumber;
    /**
     * Minimum stay period within the specified date or calendar range.
     * 
     */
    @XmlElement(name = "MinimumStayNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal minimumStayNumber;
    /**
     * Starting Date of the stay period.
     * 
     */
    @XmlElement(name = "StartDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDate;
    /**
     * Name of the Month for which the stay is requested.
     * 
     */
    @XmlElement(name = "StayMonthName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> stayMonthName;
    /**
     * Calendar (yearly) quarter which corresponds to the stay period.
     * 
     */
    @XmlElement(name = "StayQuarterText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<String> stayQuarterText;

    /**
     * Ending date of the stay period.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(LocalDate value) {
        this.endDate = value;
    }

    /**
     * Maximum stay period within the specified date or calendar range.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumStayNumber() {
        return maximumStayNumber;
    }

    /**
     * Sets the value of the maximumStayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaximumStayNumber()
     */
    public void setMaximumStayNumber(BigDecimal value) {
        this.maximumStayNumber = value;
    }

    /**
     * Minimum stay period within the specified date or calendar range.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumStayNumber() {
        return minimumStayNumber;
    }

    /**
     * Sets the value of the minimumStayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMinimumStayNumber()
     */
    public void setMinimumStayNumber(BigDecimal value) {
        this.minimumStayNumber = value;
    }

    /**
     * Starting Date of the stay period.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(LocalDate value) {
        this.startDate = value;
    }

    /**
     * Name of the Month for which the stay is requested.
     * 
     * Gets the value of the stayMonthName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stayMonthName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStayMonthName().add(newItem);
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
     *     The value of the stayMonthName property.
     */
    public List<String> getStayMonthName() {
        if (stayMonthName == null) {
            stayMonthName = new ArrayList<>();
        }
        return this.stayMonthName;
    }

    /**
     * Calendar (yearly) quarter which corresponds to the stay period.
     * 
     * Gets the value of the stayQuarterText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stayQuarterText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStayQuarterText().add(newItem);
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
     *     The value of the stayQuarterText property.
     */
    public List<String> getStayQuarterText() {
        if (stayQuarterText == null) {
            stayQuarterText = new ArrayList<>();
        }
        return this.stayQuarterText;
    }

}
