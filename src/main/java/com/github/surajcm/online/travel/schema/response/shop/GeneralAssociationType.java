
package com.github.surajcm.online.travel.schema.response.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GeneralAssociationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeneralAssociationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssociatedObjectID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="AssociatedObjectName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         <element name="AssociatedObjectPath" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralAssociationType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "associatedObjectID",
    "associatedObjectName",
    "associatedObjectPath"
})
public class GeneralAssociationType {

    /**
     * Identifier of the object intended to be associated within this message. E.g. PAX001
     * 
     */
    @XmlElement(name = "AssociatedObjectID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String associatedObjectID;
    /**
     * Name of the object intended to be associated. E.g. Passenger
     * 
     */
    @XmlElement(name = "AssociatedObjectName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String associatedObjectName;
    /**
     * XPath to the object intended to be associated within this message.
     * 
     */
    @XmlElement(name = "AssociatedObjectPath", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String associatedObjectPath;

    /**
     * Identifier of the object intended to be associated within this message. E.g. PAX001
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedObjectID() {
        return associatedObjectID;
    }

    /**
     * Sets the value of the associatedObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssociatedObjectID()
     */
    public void setAssociatedObjectID(String value) {
        this.associatedObjectID = value;
    }

    /**
     * Name of the object intended to be associated. E.g. Passenger
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedObjectName() {
        return associatedObjectName;
    }

    /**
     * Sets the value of the associatedObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssociatedObjectName()
     */
    public void setAssociatedObjectName(String value) {
        this.associatedObjectName = value;
    }

    /**
     * XPath to the object intended to be associated within this message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedObjectPath() {
        return associatedObjectPath;
    }

    /**
     * Sets the value of the associatedObjectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssociatedObjectPath()
     */
    public void setAssociatedObjectPath(String value) {
        this.associatedObjectPath = value;
    }

}
