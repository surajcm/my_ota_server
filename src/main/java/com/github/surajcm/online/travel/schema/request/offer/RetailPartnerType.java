
package com.github.surajcm.online.travel.schema.request.offer;

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
 * A company that partners with a manufacturer or producer to market and sell the manufacturer's products, services, or technologies.
 * 
 * <p>Java class for RetailPartnerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RetailPartnerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NameType" minOccurs="0"/>
 *         <element name="RetailPartnerID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailPartnerType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "contactInfoRefID",
    "name",
    "retailPartnerID"
})
public class RetailPartnerType {

    /**
     * Reference to a ContactInfoID
     * 
     */
    @XmlElement(name = "ContactInfoRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> contactInfoRefID;
    /**
     * Retail partner name.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    /**
     * Unique Retailer ID
     * 
     */
    @XmlElement(name = "RetailPartnerID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String retailPartnerID;

    /**
     * Reference to a ContactInfoID
     * 
     * Gets the value of the contactInfoRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfoRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContactInfoRefID().add(newItem);
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
     *     The value of the contactInfoRefID property.
     */
    public List<String> getContactInfoRefID() {
        if (contactInfoRefID == null) {
            contactInfoRefID = new ArrayList<>();
        }
        return this.contactInfoRefID;
    }

    /**
     * Retail partner name.
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
     * Unique Retailer ID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailPartnerID() {
        return retailPartnerID;
    }

    /**
     * Sets the value of the retailPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRetailPartnerID()
     */
    public void setRetailPartnerID(String value) {
        this.retailPartnerID = value;
    }

}
