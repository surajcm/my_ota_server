
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
 *         <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AmountType"/>
 *         <element name="OrderItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaxGroupType" minOccurs="0"/>
 *         <element name="ReusableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}IndType" minOccurs="0"/>
 *         <element name="SellerFollowUpAction" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SellerFollowUpActionType" minOccurs="0"/>
 *         <element name="Service" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceType" maxOccurs="unbounded"/>
 *         <element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "commission",
    "desc",
    "grandTotalAmount",
    "orderItemTypeCode",
    "paxGroup",
    "reusableInd",
    "sellerFollowUpAction",
    "service",
    "serviceTaxonomy"
})
public class OrderItemType {

    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<CommissionType> commission;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<DescType> desc;
    /**
     * Reflects the Differential Total Amount and the Penalty Total Amount, if netted.
     * 
     */
    @XmlElement(name = "GrandTotalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected AmountType grandTotalAmount;
    /**
     * Specify the type of Order Item being presented to the Customer.    Using new  PADIS codeset -initial content -RET - Retail -WHO - Wholesale -COR - Corporate
     * 
     */
    @XmlElement(name = "OrderItemTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemTypeCode;
    /**
     * A number of individual passengers traveling under one commercial name that associates them. E.g. a Tour group or a group for sales allotment from airline to agency.
     * 
     */
    @XmlElement(name = "PaxGroup", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected PaxGroupType paxGroup;
    /**
     * If Reusable = true, indicates that part of the value of the OrderItem may be reused for reshopping or refund. Exact reusable amount is unknown until Seller requests to reshop or to process a refund for this OrderItem.
     * 
     */
    @XmlElement(name = "ReusableInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected Boolean reusableInd;
    /**
     * A seller followup action following involuntary change means a subsequent action required to an Order Item after a schedule change.
     * 
     */
    @XmlElement(name = "SellerFollowUpAction", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected SellerFollowUpActionType sellerFollowUpAction;
    /**
     * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
     * 
     */
    @XmlElement(name = "Service", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<ServiceType> service;
    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     */
    @XmlElement(name = "ServiceTaxonomy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<ServiceTaxonomyType> serviceTaxonomy;

    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     * Gets the value of the commission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the commission property.
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<>();
        }
        return this.commission;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
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
     * A number of individual passengers traveling under one commercial name that associates them. E.g. a Tour group or a group for sales allotment from airline to agency.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroup() {
        return paxGroup;
    }

    /**
     * Sets the value of the paxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     * @see #getPaxGroup()
     */
    public void setPaxGroup(PaxGroupType value) {
        this.paxGroup = value;
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
     * A seller followup action following involuntary change means a subsequent action required to an Order Item after a schedule change.
     * 
     * @return
     *     possible object is
     *     {@link SellerFollowUpActionType }
     *     
     */
    public SellerFollowUpActionType getSellerFollowUpAction() {
        return sellerFollowUpAction;
    }

    /**
     * Sets the value of the sellerFollowUpAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerFollowUpActionType }
     *     
     * @see #getSellerFollowUpAction()
     */
    public void setSellerFollowUpAction(SellerFollowUpActionType value) {
        this.sellerFollowUpAction = value;
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

}
