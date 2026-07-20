
package com.github.surajcm.online.travel.schema.response.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Is the container of all payment relevant functions.
 * 
 * <p>Java class for PaymentFunctionsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentFunctionsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentSupportedMethod" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}PaymentSupportedMethodType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFunctionsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "paymentSupportedMethod"
})
public class PaymentFunctionsType {

    @XmlElement(name = "PaymentSupportedMethod", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<PaymentSupportedMethodType> paymentSupportedMethod;

    /**
     * Gets the value of the paymentSupportedMethod property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSupportedMethod property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentSupportedMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSupportedMethodType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentSupportedMethod property.
     */
    public List<PaymentSupportedMethodType> getPaymentSupportedMethod() {
        if (paymentSupportedMethod == null) {
            paymentSupportedMethod = new ArrayList<>();
        }
        return this.paymentSupportedMethod;
    }

}
