
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
 * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
 * 
 * <p>Java class for ServiceTaxonomyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceTaxonomyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="ServiceFeature" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceFeatureType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxonomyCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTaxonomyType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "descText",
    "serviceFeature",
    "taxonomyCode"
})
public class ServiceTaxonomyType {

    /**
     * To  enable  the  Airline  to  describe  the Taxonomy without  the  need  for  the Seller  to  refer  to  a  specifc Taxonomy optionally.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String descText;
    /**
     * Bilaterally agreed mechanism to deliver service specific information to the Seller as defined by the Airline. This defines a further level of definition for a service taxonomy code.   e.g meal (TC 03F0)    ->  breakfast(03F1)  - eggs(03F2),toast(03F3)
     * 
     */
    @XmlElement(name = "ServiceFeature", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ServiceFeatureType> serviceFeature;
    /**
     * Used  for  defining  a  product  or  service within  the Shared Industry Taxonomy or bilaterally.
     * 
     */
    @XmlElement(name = "TaxonomyCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxonomyCode;

    /**
     * To  enable  the  Airline  to  describe  the Taxonomy without  the  need  for  the Seller  to  refer  to  a  specifc Taxonomy optionally.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescText()
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Bilaterally agreed mechanism to deliver service specific information to the Seller as defined by the Airline. This defines a further level of definition for a service taxonomy code.   e.g meal (TC 03F0)    ->  breakfast(03F1)  - eggs(03F2),toast(03F3)
     * 
     * Gets the value of the serviceFeature property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeature property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureType }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceFeature property.
     */
    public List<ServiceFeatureType> getServiceFeature() {
        if (serviceFeature == null) {
            serviceFeature = new ArrayList<>();
        }
        return this.serviceFeature;
    }

    /**
     * Used  for  defining  a  product  or  service within  the Shared Industry Taxonomy or bilaterally.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyCode() {
        return taxonomyCode;
    }

    /**
     * Sets the value of the taxonomyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxonomyCode()
     */
    public void setTaxonomyCode(String value) {
        this.taxonomyCode = value;
    }

}
