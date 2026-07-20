
package com.github.surajcm.online.travel.schema.response.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ServiceList response information.
 * 
 * <p>Java class for ResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DataListsType" minOccurs="0"/>
 *         <element name="MessageProcessing" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MessageProcessingType" minOccurs="0"/>
 *         <element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MetadataType" minOccurs="0"/>
 *         <element name="OtherOffers" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CarrierOffersType" minOccurs="0"/>
 *         <element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PaymentFunctionsType" minOccurs="0"/>
 *         <element name="Policy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PricedOffer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}OfferType"/>
 *         <element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PromotionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ResponseParametersType" minOccurs="0"/>
 *         <element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ShoppingResponseType" minOccurs="0"/>
 *         <element name="Warning" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "dataLists",
    "messageProcessing",
    "metadata",
    "otherOffers",
    "paymentFunctions",
    "policy",
    "pricedOffer",
    "promotion",
    "responseParameters",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    /**
     * Data List definition for this message.
     * 
     */
    @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected DataListsType dataLists;
    /**
     * Marketing messages for OfferPriceRS.
     * 
     */
    @XmlElement(name = "MessageProcessing", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MessageProcessingType messageProcessing;
    /**
     * Message wide metadata information.
     * 
     */
    @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MetadataType metadata;
    /**
     * Grouping of Offers returned by a single ORA.
     * 
     */
    @XmlElement(name = "OtherOffers", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected CarrierOffersType otherOffers;
    /**
     * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
     * 
     */
    @XmlElement(name = "PaymentFunctions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected PaymentFunctionsType paymentFunctions;
    /**
     * Message policy information, including PCI, PII information.
     * 
     */
    @XmlElement(name = "Policy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<PolicyType> policy;
    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
     * 
     */
    @XmlElement(name = "PricedOffer", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected OfferType pricedOffer;
    /**
     * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
     * 
     */
    @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<PromotionType> promotion;
    /**
     * Information related to how response results should be returned.
     * 
     */
    @XmlElement(name = "ResponseParameters", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected ResponseParametersType responseParameters;
    /**
     * Facilitates the tracking of what was Offered and contains an identifier unique to the source Airline for a set of product Offers returned in response to a shopping request.
     * 
     */
    @XmlElement(name = "ShoppingResponse", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected ShoppingResponseType shoppingResponse;
    /**
     * Contains information related to potential business errors detected during processing of the preceding request.
     * 
     */
    @XmlElement(name = "Warning", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<WarningType> warning;

    /**
     * Data List definition for this message.
     * 
     * @return
     *     possible object is
     *     {@link DataListsType }
     *     
     */
    public DataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListsType }
     *     
     * @see #getDataLists()
     */
    public void setDataLists(DataListsType value) {
        this.dataLists = value;
    }

    /**
     * Marketing messages for OfferPriceRS.
     * 
     * @return
     *     possible object is
     *     {@link MessageProcessingType }
     *     
     */
    public MessageProcessingType getMessageProcessing() {
        return messageProcessing;
    }

    /**
     * Sets the value of the messageProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageProcessingType }
     *     
     * @see #getMessageProcessing()
     */
    public void setMessageProcessing(MessageProcessingType value) {
        this.messageProcessing = value;
    }

    /**
     * Message wide metadata information.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     * @see #getMetadata()
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Grouping of Offers returned by a single ORA.
     * 
     * @return
     *     possible object is
     *     {@link CarrierOffersType }
     *     
     */
    public CarrierOffersType getOtherOffers() {
        return otherOffers;
    }

    /**
     * Sets the value of the otherOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierOffersType }
     *     
     * @see #getOtherOffers()
     */
    public void setOtherOffers(CarrierOffersType value) {
        this.otherOffers = value;
    }

    /**
     * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFunctionsType }
     *     
     */
    public PaymentFunctionsType getPaymentFunctions() {
        return paymentFunctions;
    }

    /**
     * Sets the value of the paymentFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFunctionsType }
     *     
     * @see #getPaymentFunctions()
     */
    public void setPaymentFunctions(PaymentFunctionsType value) {
        this.paymentFunctions = value;
    }

    /**
     * Message policy information, including PCI, PII information.
     * 
     * Gets the value of the policy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the policy property.
     */
    public List<PolicyType> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<>();
        }
        return this.policy;
    }

    /**
     * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getPricedOffer() {
        return pricedOffer;
    }

    /**
     * Sets the value of the pricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     * @see #getPricedOffer()
     */
    public void setPricedOffer(OfferType value) {
        this.pricedOffer = value;
    }

    /**
     * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
     * 
     * Gets the value of the promotion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the promotion property.
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<>();
        }
        return this.promotion;
    }

    /**
     * Information related to how response results should be returned.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     * @see #getResponseParameters()
     */
    public void setResponseParameters(ResponseParametersType value) {
        this.responseParameters = value;
    }

    /**
     * Facilitates the tracking of what was Offered and contains an identifier unique to the source Airline for a set of product Offers returned in response to a shopping request.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     * @see #getShoppingResponse()
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
    }

    /**
     * Contains information related to potential business errors detected during processing of the preceding request.
     * 
     * Gets the value of the warning property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * </p>
     * 
     * 
     * @return
     *     The value of the warning property.
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<>();
        }
        return this.warning;
    }

}
