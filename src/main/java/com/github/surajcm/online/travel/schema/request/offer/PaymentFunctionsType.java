
package com.github.surajcm.online.travel.schema.request.offer;

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
 *         <element name="PaymentInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaymentInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PaymentMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PaymentMethodCriteriaType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFunctionsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "paymentInfo",
    "paymentMethodCriteria"
})
public class PaymentFunctionsType {

    /**
     * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
     * 
     */
    @XmlElement(name = "PaymentInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<PaymentInfoType> paymentInfo;
    /**
     * Criteria for: A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
     * 
     */
    @XmlElement(name = "PaymentMethodCriteria", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<PaymentMethodCriteriaType> paymentMethodCriteria;

    /**
     * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
     * 
     * Gets the value of the paymentInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentInfo property.
     */
    public List<PaymentInfoType> getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new ArrayList<>();
        }
        return this.paymentInfo;
    }

    /**
     * Criteria for: A form of procedure for the payment of goods or services, plus any transactional information specific to the payment method other than the amount.
     * 
     * Gets the value of the paymentMethodCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentMethodCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodCriteriaType }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentMethodCriteria property.
     */
    public List<PaymentMethodCriteriaType> getPaymentMethodCriteria() {
        if (paymentMethodCriteria == null) {
            paymentMethodCriteria = new ArrayList<>();
        }
        return this.paymentMethodCriteria;
    }

}
