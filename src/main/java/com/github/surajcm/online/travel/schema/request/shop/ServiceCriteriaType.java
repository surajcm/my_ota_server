
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
 * Group and subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
 * 
 * <p>Java class for ServiceCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IncludeInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType" minOccurs="0"/>
 *         <element name="RFIC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RFIC_Type" minOccurs="0"/>
 *         <element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RFISC_Type" maxOccurs="99" minOccurs="0"/>
 *         <element name="ServicePricingOnlyInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="TaxonomyCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "includeInd",
    "prefLevel",
    "rfic",
    "rfisc",
    "servicePricingOnlyInd",
    "taxonomyCode"
})
public class ServiceCriteriaType {

    /**
     * When TRUE, specified service should be included in search results. When FALSE, exclude shopping results including the specified service.
     * 
     */
    @XmlElement(name = "IncludeInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean includeInd;
    /**
     * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
     * 
     */
    @XmlElement(name = "PrefLevel", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected PrefLevelType prefLevel;
    /**
     * Reason For Issuance Code  Examples: A (Air Transportation) C (Baggage) E (Airport Services) F (Merchandise) G (In-flight Services) Refer to PADIS Codeset for data element 4183 - Special Condition.
     * 
     */
    @XmlElement(name = "RFIC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String rfic;
    /**
     * Reason For Issuance Sub Code. Examples: 0CC (First Checked Bag) 0B1 (In-flight Entertainment) 0BX (Lounge)
     * 
     */
    @XmlElement(name = "RFISC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<String> rfisc;
    /**
     * When TRUE, service pricing only is requested.
     * 
     */
    @XmlElement(name = "ServicePricingOnlyInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean servicePricingOnlyInd;
    /**
     * Used  for  defining  a  product  or  service within  the Shared Industry Taxonomy or bilaterally.
     * 
     */
    @XmlElement(name = "TaxonomyCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> taxonomyCode;

    /**
     * When TRUE, specified service should be included in search results. When FALSE, exclude shopping results including the specified service.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInd() {
        return includeInd;
    }

    /**
     * Sets the value of the includeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeInd()
     */
    public void setIncludeInd(Boolean value) {
        this.includeInd = value;
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

    /**
     * Reason For Issuance Code  Examples: A (Air Transportation) C (Baggage) E (Airport Services) F (Merchandise) G (In-flight Services) Refer to PADIS Codeset for data element 4183 - Special Condition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFIC()
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Reason For Issuance Sub Code. Examples: 0CC (First Checked Bag) 0B1 (In-flight Entertainment) 0BX (Lounge)
     * 
     * Gets the value of the rfisc property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfisc property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRFISC().add(newItem);
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
     *     The value of the rfisc property.
     */
    public List<String> getRFISC() {
        if (rfisc == null) {
            rfisc = new ArrayList<>();
        }
        return this.rfisc;
    }

    /**
     * When TRUE, service pricing only is requested.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicePricingOnlyInd() {
        return servicePricingOnlyInd;
    }

    /**
     * Sets the value of the servicePricingOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isServicePricingOnlyInd()
     */
    public void setServicePricingOnlyInd(Boolean value) {
        this.servicePricingOnlyInd = value;
    }

    /**
     * Used  for  defining  a  product  or  service within  the Shared Industry Taxonomy or bilaterally.
     * 
     * Gets the value of the taxonomyCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxonomyCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTaxonomyCode().add(newItem);
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
     *     The value of the taxonomyCode property.
     */
    public List<String> getTaxonomyCode() {
        if (taxonomyCode == null) {
            taxonomyCode = new ArrayList<>();
        }
        return this.taxonomyCode;
    }

}
