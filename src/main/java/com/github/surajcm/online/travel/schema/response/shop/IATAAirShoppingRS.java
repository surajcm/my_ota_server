
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Error" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ErrorType" maxOccurs="unbounded"/>
 *           <element name="Response">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ResponseType">
 *                   <sequence>
 *                     <element name="AirShoppingProcessing" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AirShoppingProcessingType" minOccurs="0"/>
 *                     <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CommissionType" minOccurs="0"/>
 *                     <element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DataListsType" minOccurs="0"/>
 *                     <element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MetadataType" minOccurs="0"/>
 *                     <element name="OffersGroup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OffersGroupType"/>
 *                     <element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentFunctionsType" minOccurs="0"/>
 *                     <element name="Policy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PromotionType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ShoppingResponseType" minOccurs="0"/>
 *                     <element name="Warning" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="AugmentationPoint" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' namespace='##other' maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MessageDoc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MessageDocType" minOccurs="0"/>
 *         <element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IATA_PayloadStandardAttributesType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "error",
    "response",
    "augmentationPoint",
    "messageDoc",
    "payloadAttributes"
})
@XmlRootElement(name = "IATA_AirShoppingRS", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
public class IATAAirShoppingRS {

    /**
     * Contains information related to errors detected during processing of the preceding request.
     * 
     */
    @XmlElement(name = "Error", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<ErrorType> error;
    /**
     * AirShopping response information.
     * 
     */
    @XmlElement(name = "Response", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected IATAAirShoppingRS.Response response;
    /**
     * Implementer-Augmented Structure.
     * 
     */
    @XmlElement(name = "AugmentationPoint", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected IATAAirShoppingRS.AugmentationPoint augmentationPoint;
    /**
     * Message document information including document name and version number.
     * 
     */
    @XmlElement(name = "MessageDoc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected MessageDocType messageDoc;
    /**
     * IATA standard payload attributes.
     * 
     */
    @XmlElement(name = "PayloadAttributes", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected IATAPayloadStandardAttributesType payloadAttributes;

    /**
     * Contains information related to errors detected during processing of the preceding request.
     * 
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

    /**
     * AirShopping response information.
     * 
     * @return
     *     possible object is
     *     {@link IATAAirShoppingRS.Response }
     *     
     */
    public IATAAirShoppingRS.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAirShoppingRS.Response }
     *     
     * @see #getResponse()
     */
    public void setResponse(IATAAirShoppingRS.Response value) {
        this.response = value;
    }

    /**
     * Implementer-Augmented Structure.
     * 
     * @return
     *     possible object is
     *     {@link IATAAirShoppingRS.AugmentationPoint }
     *     
     */
    public IATAAirShoppingRS.AugmentationPoint getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAirShoppingRS.AugmentationPoint }
     *     
     * @see #getAugmentationPoint()
     */
    public void setAugmentationPoint(IATAAirShoppingRS.AugmentationPoint value) {
        this.augmentationPoint = value;
    }

    /**
     * Message document information including document name and version number.
     * 
     * @return
     *     possible object is
     *     {@link MessageDocType }
     *     
     */
    public MessageDocType getMessageDoc() {
        return messageDoc;
    }

    /**
     * Sets the value of the messageDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDocType }
     *     
     * @see #getMessageDoc()
     */
    public void setMessageDoc(MessageDocType value) {
        this.messageDoc = value;
    }

    /**
     * IATA standard payload attributes.
     * 
     * @return
     *     possible object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    public IATAPayloadStandardAttributesType getPayloadAttributes() {
        return payloadAttributes;
    }

    /**
     * Sets the value of the payloadAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     * @see #getPayloadAttributes()
     */
    public void setPayloadAttributes(IATAPayloadStandardAttributesType value) {
        this.payloadAttributes = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <any processContents='lax' namespace='##other' maxOccurs="unbounded"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class AugmentationPoint {

        /**
         * Implementer-Augmented Structure.
         * 
         */
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Implementer-Augmented Structure.
         * 
         * Gets the value of the any property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * </p>
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ResponseType">
     *       <sequence>
     *         <element name="AirShoppingProcessing" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AirShoppingProcessingType" minOccurs="0"/>
     *         <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CommissionType" minOccurs="0"/>
     *         <element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DataListsType" minOccurs="0"/>
     *         <element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MetadataType" minOccurs="0"/>
     *         <element name="OffersGroup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OffersGroupType"/>
     *         <element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentFunctionsType" minOccurs="0"/>
     *         <element name="Policy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PromotionType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ShoppingResponseType" minOccurs="0"/>
     *         <element name="Warning" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}WarningType" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airShoppingProcessing",
        "commission",
        "dataLists",
        "metadata",
        "offersGroup",
        "paymentFunctions",
        "policy",
        "promotion",
        "shoppingResponse",
        "warning"
    })
    public static class Response
        extends ResponseType
    {

        /**
         * Marketing messages for AirShoppingRS.
         * 
         */
        @XmlElement(name = "AirShoppingProcessing", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected AirShoppingProcessingType airShoppingProcessing;
        /**
         * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
         * 
         */
        @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected CommissionType commission;
        /**
         * Data List definition for this message.
         * 
         */
        @XmlElement(name = "DataLists", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected DataListsType dataLists;
        /**
         * Message wide metadata information.
         * 
         */
        @XmlElement(name = "Metadata", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected MetadataType metadata;
        /**
         * Offers grouped by Carrier.
         * 
         */
        @XmlElement(name = "OffersGroup", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
        protected OffersGroupType offersGroup;
        /**
         * Is the container of all payment relevant functions.
         * 
         */
        @XmlElement(name = "PaymentFunctions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected PaymentFunctionsType paymentFunctions;
        /**
         * Message policy information, including PCI, PII information.
         * 
         */
        @XmlElement(name = "Policy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected List<PolicyType> policy;
        /**
         * Information related to publicizing a product, organization, or venture so as to increase sales or public awareness.
         * 
         */
        @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected List<PromotionType> promotion;
        /**
         * Facilitates the tracking of what was Offered and contains an identifier unique to the source Airline for a set of product Offers returned in response to a shopping request.
         * 
         */
        @XmlElement(name = "ShoppingResponse", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected ShoppingResponseType shoppingResponse;
        /**
         * Contains information related to potential business errors detected during processing of the preceding request.
         * 
         */
        @XmlElement(name = "Warning", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
        protected List<WarningType> warning;

        /**
         * Marketing messages for AirShoppingRS.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingProcessingType }
         *     
         */
        public AirShoppingProcessingType getAirShoppingProcessing() {
            return airShoppingProcessing;
        }

        /**
         * Sets the value of the airShoppingProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingProcessingType }
         *     
         * @see #getAirShoppingProcessing()
         */
        public void setAirShoppingProcessing(AirShoppingProcessingType value) {
            this.airShoppingProcessing = value;
        }

        /**
         * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
         * 
         * @return
         *     possible object is
         *     {@link CommissionType }
         *     
         */
        public CommissionType getCommission() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionType }
         *     
         * @see #getCommission()
         */
        public void setCommission(CommissionType value) {
            this.commission = value;
        }

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
         * Offers grouped by Carrier.
         * 
         * @return
         *     possible object is
         *     {@link OffersGroupType }
         *     
         */
        public OffersGroupType getOffersGroup() {
            return offersGroup;
        }

        /**
         * Sets the value of the offersGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link OffersGroupType }
         *     
         * @see #getOffersGroup()
         */
        public void setOffersGroup(OffersGroupType value) {
            this.offersGroup = value;
        }

        /**
         * Is the container of all payment relevant functions.
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

}
