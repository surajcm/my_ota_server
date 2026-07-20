
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Indicates the owner of specific content found in a message, located by XPATH.
 * 
 * <p>Java class for ContentSourceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContentSourceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContentOwner" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ContentOwnerType"/>
 *         <element name="NodePathText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentSourceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "contentOwner",
    "nodePathText"
})
public class ContentSourceType {

    /**
     * Airline or Organization from which the associated content originates.
     * 
     */
    @XmlElement(name = "ContentOwner", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected ContentOwnerType contentOwner;
    @XmlElement(name = "NodePathText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected String nodePathText;

    /**
     * Airline or Organization from which the associated content originates.
     * 
     * @return
     *     possible object is
     *     {@link ContentOwnerType }
     *     
     */
    public ContentOwnerType getContentOwner() {
        return contentOwner;
    }

    /**
     * Sets the value of the contentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentOwnerType }
     *     
     * @see #getContentOwner()
     */
    public void setContentOwner(ContentOwnerType value) {
        this.contentOwner = value;
    }

    /**
     * Gets the value of the nodePathText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodePathText() {
        return nodePathText;
    }

    /**
     * Sets the value of the nodePathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodePathText(String value) {
        this.nodePathText = value;
    }

}
