
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyValueType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="KeyValueType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RSAKeyValue" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}RSAKeyValueType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValueType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "rsaKeyValue"
})
public class KeyValueType {

    @XmlElement(name = "RSAKeyValue", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected RSAKeyValueType rsaKeyValue;

    /**
     * Gets the value of the rsaKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link RSAKeyValueType }
     *     
     */
    public RSAKeyValueType getRSAKeyValue() {
        return rsaKeyValue;
    }

    /**
     * Sets the value of the rsaKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSAKeyValueType }
     *     
     */
    public void setRSAKeyValue(RSAKeyValueType value) {
        this.rsaKeyValue = value;
    }

}
