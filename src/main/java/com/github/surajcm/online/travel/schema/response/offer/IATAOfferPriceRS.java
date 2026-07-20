
package com.github.surajcm.online.travel.schema.response.offer;

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
 *           <element name="Error" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ErrorType" maxOccurs="unbounded"/>
 *           <element name="Response" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ResponseType"/>
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
 *         <element name="MessageDoc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MessageDocType" minOccurs="0"/>
 *         <element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IATA_PayloadStandardAttributesType" minOccurs="0"/>
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
@XmlRootElement(name = "IATA_OfferPriceRS", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
public class IATAOfferPriceRS {

    /**
     * Contains information related to errors detected during processing of the preceding request.
     * 
     */
    @XmlElement(name = "Error", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<ErrorType> error;
    /**
     * OfferPrice response information.
     * 
     */
    @XmlElement(name = "Response", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected ResponseType response;
    /**
     * Implementer-Augmented Structure.
     * 
     */
    @XmlElement(name = "AugmentationPoint", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected IATAOfferPriceRS.AugmentationPoint augmentationPoint;
    /**
     * Message Document Information.
     * 
     */
    @XmlElement(name = "MessageDoc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MessageDocType messageDoc;
    /**
     * IATA standard payload attributes.
     * 
     */
    @XmlElement(name = "PayloadAttributes", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
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
     * OfferPrice response information.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     * @see #getResponse()
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Implementer-Augmented Structure.
     * 
     * @return
     *     possible object is
     *     {@link IATAOfferPriceRS.AugmentationPoint }
     *     
     */
    public IATAOfferPriceRS.AugmentationPoint getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAOfferPriceRS.AugmentationPoint }
     *     
     * @see #getAugmentationPoint()
     */
    public void setAugmentationPoint(IATAOfferPriceRS.AugmentationPoint value) {
        this.augmentationPoint = value;
    }

    /**
     * Message Document Information.
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

}
