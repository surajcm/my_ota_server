
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Amount added on to a usual charge for a specific product, purpose, or service.
 * 
 * <p>Java class for SurchargeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SurchargeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AllRefundableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="Breakdown" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}FeeType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TotalAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "allRefundableInd",
    "breakdown",
    "totalAmount"
})
public class SurchargeType {

    /**
     * When true, all fee/ surcharge amounts are refundable. Example: true
     * 
     */
    @XmlElement(name = "AllRefundableInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean allRefundableInd;
    /**
     * Amount added on to a charge for a specific product, purpose, or service .
     * 
     */
    @XmlElement(name = "Breakdown", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<FeeType> breakdown;
    /**
     * Summary of all fee amounts.
     * 
     */
    @XmlElement(name = "TotalAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected AmountType totalAmount;

    /**
     * When true, all fee/ surcharge amounts are refundable. Example: true
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllRefundableInd() {
        return allRefundableInd;
    }

    /**
     * Sets the value of the allRefundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllRefundableInd()
     */
    public void setAllRefundableInd(Boolean value) {
        this.allRefundableInd = value;
    }

    /**
     * Amount added on to a charge for a specific product, purpose, or service .
     * 
     * Gets the value of the breakdown property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakdown property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBreakdown().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the breakdown property.
     */
    public List<FeeType> getBreakdown() {
        if (breakdown == null) {
            breakdown = new ArrayList<>();
        }
        return this.breakdown;
    }

    /**
     * Summary of all fee amounts.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getTotalAmount()
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

}
