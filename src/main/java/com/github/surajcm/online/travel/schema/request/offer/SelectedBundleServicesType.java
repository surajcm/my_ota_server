
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
 * For service bundle selection - only to be used for bundles with optional choices (e.g. pick 2 out of 4)
 * 
 * <p>Java class for SelectedBundleServicesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SelectedBundleServicesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SelectedServiceDefinitionRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SelectedServiceRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedBundleServicesType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "selectedServiceDefinitionRefID",
    "selectedServiceRefID"
})
public class SelectedBundleServicesType {

    /**
     * Reference to the Service Definition selected by the Passenger as part of a service bundle.
     * 
     */
    @XmlElement(name = "SelectedServiceDefinitionRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> selectedServiceDefinitionRefID;
    /**
     * Reference to the Service (within the Offer Item) form which the Service Bundle is contained.
     * 
     */
    @XmlElement(name = "SelectedServiceRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String selectedServiceRefID;

    /**
     * Reference to the Service Definition selected by the Passenger as part of a service bundle.
     * 
     * Gets the value of the selectedServiceDefinitionRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedServiceDefinitionRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSelectedServiceDefinitionRefID().add(newItem);
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
     *     The value of the selectedServiceDefinitionRefID property.
     */
    public List<String> getSelectedServiceDefinitionRefID() {
        if (selectedServiceDefinitionRefID == null) {
            selectedServiceDefinitionRefID = new ArrayList<>();
        }
        return this.selectedServiceDefinitionRefID;
    }

    /**
     * Reference to the Service (within the Offer Item) form which the Service Bundle is contained.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedServiceRefID() {
        return selectedServiceRefID;
    }

    /**
     * Sets the value of the selectedServiceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSelectedServiceRefID()
     */
    public void setSelectedServiceRefID(String value) {
        this.selectedServiceRefID = value;
    }

}
