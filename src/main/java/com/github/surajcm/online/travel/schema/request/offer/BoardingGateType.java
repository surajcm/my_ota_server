
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An exit/entry from an airport building to an aircraft. Could for example be a boarding gate, arrival gate, departing gate etc.
 * 
 * <p>Java class for BoardingGateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BoardingGateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BoardingGateID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingGateType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "boardingGateID"
})
public class BoardingGateType {

    /**
     * Identifier of the gate. E.g. 'A5'.
     * 
     */
    @XmlElement(name = "BoardingGateID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;

    /**
     * Identifier of the gate. E.g. 'A5'.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingGateID() {
        return boardingGateID;
    }

    /**
     * Sets the value of the boardingGateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBoardingGateID()
     */
    public void setBoardingGateID(String value) {
        this.boardingGateID = value;
    }

}
