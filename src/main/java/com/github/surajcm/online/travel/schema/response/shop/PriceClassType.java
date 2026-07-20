
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
 * A price point within a particular Cabin Type (sometimes referred to as 'Fare Families').
 * 
 * <p>Java class for PriceClassType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceClassType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Code" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DisplayOrderText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="FareBasisAppText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="FareBasisCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CodeType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ProperNameType"/>
 *         <element name="PriceClassID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceClassType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "cabinType",
    "code",
    "desc",
    "displayOrderText",
    "fareBasisAppText",
    "fareBasisCode",
    "name",
    "priceClassID"
})
public class PriceClassType {

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     */
    @XmlElement(name = "CabinType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<CabinTypeType> cabinType;
    /**
     * Price class code. Example: 1, ABC
     * 
     */
    @XmlElement(name = "Code", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String code;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<DescType> desc;
    /**
     * The Airline requested default display order (in a client application) for this price class. For example: 2.
     * 
     */
    @XmlElement(name = "DisplayOrderText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String displayOrderText;
    /**
     * Fare basis application. Examples: Requested, Ticketed, Other.
     * 
     */
    @XmlElement(name = "FareBasisAppText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String fareBasisAppText;
    /**
     * Fare basis code. Example: Y26
     * 
     */
    @XmlElement(name = "FareBasisCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareBasisCode;
    /**
     * Price class name. Example: SUPERSAVER
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    /**
     * Uniquely Identifies a Price Class within the context of one message.
     * 
     */
    @XmlElement(name = "PriceClassID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassID;

    /**
     * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
     * 
     * Gets the value of the cabinType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the cabinType property.
     */
    public List<CabinTypeType> getCabinType() {
        if (cabinType == null) {
            cabinType = new ArrayList<>();
        }
        return this.cabinType;
    }

    /**
     * Price class code. Example: 1, ABC
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
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
     * {@link DescType }
     * </p>
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * The Airline requested default display order (in a client application) for this price class. For example: 2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayOrderText() {
        return displayOrderText;
    }

    /**
     * Sets the value of the displayOrderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDisplayOrderText()
     */
    public void setDisplayOrderText(String value) {
        this.displayOrderText = value;
    }

    /**
     * Fare basis application. Examples: Requested, Ticketed, Other.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisAppText() {
        return fareBasisAppText;
    }

    /**
     * Sets the value of the fareBasisAppText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasisAppText()
     */
    public void setFareBasisAppText(String value) {
        this.fareBasisAppText = value;
    }

    /**
     * Fare basis code. Example: Y26
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareBasisCode()
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Price class name. Example: SUPERSAVER
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Uniquely Identifies a Price Class within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClassID() {
        return priceClassID;
    }

    /**
     * Sets the value of the priceClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPriceClassID()
     */
    public void setPriceClassID(String value) {
        this.priceClassID = value;
    }

}
