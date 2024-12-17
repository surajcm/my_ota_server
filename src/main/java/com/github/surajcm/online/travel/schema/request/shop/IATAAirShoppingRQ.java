
package com.github.surajcm.online.travel.schema.request.shop;

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
 *         <element name="MessageDoc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}MessageDocType" minOccurs="0"/>
 *         <element name="Party" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PartyType"/>
 *         <element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IATA_PayloadStandardAttributesType" minOccurs="0"/>
 *         <element name="POS" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}POS_Type" minOccurs="0"/>
 *         <element name="Request" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RequestType"/>
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
    "augmentationPoint",
    "messageDoc",
    "party",
    "payloadAttributes",
    "pos",
    "request"
})
@XmlRootElement(name = "IATA_AirShoppingRQ", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
public class IATAAirShoppingRQ {

    /**
     * Implementer-Augmented Structure.
     * 
     */
    @XmlElement(name = "AugmentationPoint", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected IATAAirShoppingRQ.AugmentationPoint augmentationPoint;
    /**
     * Message document information.
     * 
     */
    @XmlElement(name = "MessageDoc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected MessageDocType messageDoc;
    /**
     * Party information. This information is intended for business use, it is not intended for transaction authentication and routing of the message.
     * 
     */
    @XmlElement(name = "Party", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected PartyType party;
    /**
     * IATA payload standard attributes.
     * 
     */
    @XmlElement(name = "PayloadAttributes", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected IATAPayloadStandardAttributesType payloadAttributes;
    /**
     * Point of Sale Information
     * 
     */
    @XmlElement(name = "POS", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected POSType pos;
    /**
     * AirShoppingRQ request information.
     * 
     */
    @XmlElement(name = "Request", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected RequestType request;

    /**
     * Implementer-Augmented Structure.
     * 
     * @return
     *     possible object is
     *     {@link IATAAirShoppingRQ.AugmentationPoint }
     *     
     */
    public IATAAirShoppingRQ.AugmentationPoint getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAirShoppingRQ.AugmentationPoint }
     *     
     * @see #getAugmentationPoint()
     */
    public void setAugmentationPoint(IATAAirShoppingRQ.AugmentationPoint value) {
        this.augmentationPoint = value;
    }

    /**
     * Message document information.
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
     * Party information. This information is intended for business use, it is not intended for transaction authentication and routing of the message.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     * @see #getParty()
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * IATA payload standard attributes.
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
     * Point of Sale Information
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     * @see #getPOS()
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * AirShoppingRQ request information.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     * @see #getRequest()
     */
    public void setRequest(RequestType value) {
        this.request = value;
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
