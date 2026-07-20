
package com.github.surajcm.online.travel.schema.response.shop;

import java.time.LocalDate;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Price Calendar Date
 * 
 * <p>Java class for PriceCalendarDateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceCalendarDateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Date" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DateType"/>
 *         <element name="OriginDestRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceCalendarDateType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "date",
    "originDestRefID"
})
public class PriceCalendarDateType {

    @XmlElement(name = "Date", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    /**
     * Association to one Origin/Destination instance. Example: od1
     * 
     */
    @XmlElement(name = "OriginDestRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestRefID;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(LocalDate value) {
        this.date = value;
    }

    /**
     * Association to one Origin/Destination instance. Example: od1
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestRefID() {
        return originDestRefID;
    }

    /**
     * Sets the value of the originDestRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOriginDestRefID()
     */
    public void setOriginDestRefID(String value) {
        this.originDestRefID = value;
    }

}
