
package com.github.surajcm.online.travel.schema.request.offer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * shows the possible statuses of an Order
 * 
 * <p>Java class for OrderStatusCodeContentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OrderStatusCodeContentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="CLOSED"/>
 *     <enumeration value="FROZEN"/>
 *     <enumeration value="OPENED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrderStatusCodeContentType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
@XmlEnum
public enum OrderStatusCodeContentType {


    /**
     * Once all Order Items are FULLY PAID and Services are either DELIVERED or REFUNDED or EXPIRED
     * 
     */
    CLOSED,

    /**
     * emergency lock
     * 
     */
    FROZEN,

    /**
     * Order was built based on offer information.
     * 
     */
    OPENED;

    public String value() {
        return name();
    }

    public static OrderStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
