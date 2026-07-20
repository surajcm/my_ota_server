
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Form of payment which utilizes a previously issued accountable travel document (ticket, EMD, coupon, etc.) which has an outstanding credit value.
 * 
 * <p>Java class for AccountableDocType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountableDocType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType"/>
 *         <element name="TicketID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountableDocType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "docType",
    "ticketID"
})
public class AccountableDocType {

    /**
     * Type of Accountable Document e.g. T, E and M or E-ticket, EMD, MCO
     * 
     */
    @XmlElement(name = "DocType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected String docType;
    /**
     * MCO, Ticket or EMD reference number, indicating a previously issued document
     * 
     */
    @XmlElement(name = "TicketID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ticketID;

    /**
     * Type of Accountable Document e.g. T, E and M or E-ticket, EMD, MCO
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocType()
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * MCO, Ticket or EMD reference number, indicating a previously issued document
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketID() {
        return ticketID;
    }

    /**
     * Sets the value of the ticketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTicketID()
     */
    public void setTicketID(String value) {
        this.ticketID = value;
    }

}
