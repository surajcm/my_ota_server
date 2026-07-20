
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enumeration values for payment status codes. {codeListAgencyName}IATA AIDM{/codeListAgencyName}
 * 
 * <p>Java class for PaymentStatusCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PaymentStatusCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="ACCEPTED"/>
 *     <enumeration value="ALLOCATED"/>
 *     <enumeration value="CLOSED"/>
 *     <enumeration value="COMMITTED"/>
 *     <enumeration value="RECEIVED"/>
 *     <enumeration value="REFUNDED"/>
 *     <enumeration value="SENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentStatusCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
@XmlEnum
public enum PaymentStatusCodeContentType {


    /**
     * The commitments to pay was accepted./At the Payment Level to indicate that a payment has been authorized, etc. or the status in not needed
     * 
     */
    ACCEPTED,

    /**
     * The value of compensation was allocated to the corresponding Order Item.
     * 
     */
    ALLOCATED,

    /**
     * The payment process was done.
     * 
     */
    CLOSED,

    /**
     * The payer has committed to pay the compensation./When NDC indicates that part of a payment is to be applied to an order item
     * 
     */
    COMMITTED,

    /**
     * The compensation was received./ The actual receipt of funds is a function of the accounting system, or it it expected that the revenue accounting system will update the order when the bank transmits funds to the airline? Don't think we need this.
     * 
     */
    RECEIVED,

    /**
     * The compensation was transfered back to the payer./When an order item is cancelled or changed, we expect that any payments applied to the item will be un-applied. this leaves a credit balance on the order that can be applied to a new item of refunded.
     * 
     */
    REFUNDED,

    /**
     * The compensation was transfered.
     * 
     */
    SENT;

    public String value() {
        return name();
    }

    public static PaymentStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
