
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Facilitates the tracking of what was Offered and contains an identifier unique to the source Airline for a set of product Offers returned in response to a shopping request.
 * 
 * <p>Java class for ShoppingResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ShoppingResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ShoppingResponseRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingResponseType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "shoppingResponseRefID"
})
public class ShoppingResponseType {

    /**
     * Reference to unique shopping session response ID, as provided in the airline's previous shopping response.
     * 
     */
    @XmlElement(name = "ShoppingResponseRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shoppingResponseRefID;

    /**
     * Reference to unique shopping session response ID, as provided in the airline's previous shopping response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingResponseRefID() {
        return shoppingResponseRefID;
    }

    /**
     * Sets the value of the shoppingResponseRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShoppingResponseRefID()
     */
    public void setShoppingResponseRefID(String value) {
        this.shoppingResponseRefID = value;
    }

}
