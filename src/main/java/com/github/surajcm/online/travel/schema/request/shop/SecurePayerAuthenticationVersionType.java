
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
 * 
 * <p>Java class for SecurePayerAuthenticationVersionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SecurePayerAuthenticationVersionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardEnrollmentVersionText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SupportedVersionText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePayerAuthenticationVersionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "cardEnrollmentVersionText",
    "supportedVersionText"
})
public class SecurePayerAuthenticationVersionType {

    /**
     * Version of 3D-Secure for which the card is enrolled.
     * 
     */
    @XmlElement(name = "CardEnrollmentVersionText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<String> cardEnrollmentVersionText;
    /**
     * specifies the exact supported 3D-Secure version.
     * 
     */
    @XmlElement(name = "SupportedVersionText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected List<String> supportedVersionText;

    /**
     * Version of 3D-Secure for which the card is enrolled.
     * 
     * Gets the value of the cardEnrollmentVersionText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardEnrollmentVersionText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCardEnrollmentVersionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the cardEnrollmentVersionText property.
     */
    public List<String> getCardEnrollmentVersionText() {
        if (cardEnrollmentVersionText == null) {
            cardEnrollmentVersionText = new ArrayList<>();
        }
        return this.cardEnrollmentVersionText;
    }

    /**
     * specifies the exact supported 3D-Secure version.
     * 
     * Gets the value of the supportedVersionText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVersionText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportedVersionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the supportedVersionText property.
     */
    public List<String> getSupportedVersionText() {
        if (supportedVersionText == null) {
            supportedVersionText = new ArrayList<>();
        }
        return this.supportedVersionText;
    }

}
