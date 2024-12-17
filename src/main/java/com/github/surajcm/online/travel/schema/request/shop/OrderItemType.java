
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
 * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
 * 
 * <p>Java class for OrderItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrderItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType" minOccurs="0"/>
 *         <element name="OrderItemID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="OrderItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}OwnerTypeCodeType" minOccurs="0"/>
 *         <element name="ReusableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="Service" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "grandTotalAmount",
    "orderItemID",
    "orderItemTypeCode",
    "ownerCode",
    "ownerTypeCode",
    "reusableInd",
    "service",
    "serviceTaxonomy",
    "webAddressURI"
})
public class OrderItemType {

    /**
     * Reflects the Differential Total Amount and the Penalty Total Amount, if netted.
     * 
     */
    @XmlElement(name = "GrandTotalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AmountType grandTotalAmount;
    /**
     * Carrier assigned ID which exists uniquely within an Order.
     * 
     */
    @XmlElement(name = "OrderItemID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemID;
    /**
     * Specify the type of Order Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     */
    @XmlElement(name = "OrderItemTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemTypeCode;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * Indicates whether or not the owner is the ORA or POA.
     * 
     */
    @XmlElement(name = "OwnerTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected OwnerTypeCodeContentType ownerTypeCode;
    /**
     * If Reusable = true, indicates that part of the value of the OrderItem may be reused for reshopping or refund. Exact reusable amount is unknown until Seller requests to reshop or to process a refund for this OrderItem.
     * 
     */
    @XmlElement(name = "ReusableInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean reusableInd;
    /**
     * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
     * 
     */
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ServiceType> service;
    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     */
    @XmlElement(name = "ServiceTaxonomy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     */
    @XmlElement(name = "WebAddressURI", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;

    /**
     * Reflects the Differential Total Amount and the Penalty Total Amount, if netted.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getGrandTotalAmount()
     */
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
    }

    /**
     * Carrier assigned ID which exists uniquely within an Order.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderItemID()
     */
    public void setOrderItemID(String value) {
        this.orderItemID = value;
    }

    /**
     * Specify the type of Order Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemTypeCode() {
        return orderItemTypeCode;
    }

    /**
     * Sets the value of the orderItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderItemTypeCode()
     */
    public void setOrderItemTypeCode(String value) {
        this.orderItemTypeCode = value;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerCode()
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Indicates whether or not the owner is the ORA or POA.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeContentType }
     *     
     */
    public OwnerTypeCodeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeContentType }
     *     
     * @see #getOwnerTypeCode()
     */
    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * If Reusable = true, indicates that part of the value of the OrderItem may be reused for reshopping or refund. Exact reusable amount is unknown until Seller requests to reshop or to process a refund for this OrderItem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReusableInd() {
        return reusableInd;
    }

    /**
     * Sets the value of the reusableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isReusableInd()
     */
    public void setReusableInd(Boolean value) {
        this.reusableInd = value;
    }

    /**
     * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
     * 
     * Gets the value of the service property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the service property.
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<>();
        }
        return this.service;
    }

    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     * Gets the value of the serviceTaxonomy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTaxonomy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceTaxonomy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTaxonomyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceTaxonomy property.
     */
    public List<ServiceTaxonomyType> getServiceTaxonomy() {
        if (serviceTaxonomy == null) {
            serviceTaxonomy = new ArrayList<>();
        }
        return this.serviceTaxonomy;
    }

    /**
     * Deep linking into another site to complete the transaction. E.g. to bring the customer directly to a page to continue with a purchase of a specific offer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURI() {
        return webAddressURI;
    }

    /**
     * Sets the value of the webAddressURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWebAddressURI()
     */
    public void setWebAddressURI(String value) {
        this.webAddressURI = value;
    }

}
