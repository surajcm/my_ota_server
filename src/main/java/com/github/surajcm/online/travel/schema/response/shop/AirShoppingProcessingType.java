
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Marketing messages for AirShoppingRS.
 * 
 * <p>Java class for AirShoppingProcessingType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AirShoppingProcessingType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MarketingMessage" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MarketingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirShoppingProcessingType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "marketingMessage"
})
public class AirShoppingProcessingType {

    /**
     * Additional, supplementary information about the document or service.
     * 
     */
    @XmlElement(name = "MarketingMessage", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<MarketingMessageType> marketingMessage;

    /**
     * Additional, supplementary information about the document or service.
     * 
     * Gets the value of the marketingMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMarketingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingMessageType }
     * </p>
     * 
     * 
     * @return
     *     The value of the marketingMessage property.
     */
    public List<MarketingMessageType> getMarketingMessage() {
        if (marketingMessage == null) {
            marketingMessage = new ArrayList<>();
        }
        return this.marketingMessage;
    }

}
