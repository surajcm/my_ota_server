
package com.github.surajcm.online.travel.schema.response.offer;

import java.time.LocalDate;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A document that entitles the holder to a discount or that may be exchanged for goods or services.
 * 
 * <p>Java class for VoucherType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VoucherType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EffectiveDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DateType" minOccurs="0"/>
 *         <element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DateType" minOccurs="0"/>
 *         <element name="RemainingAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType" minOccurs="0"/>
 *         <element name="VoucherID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoucherType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "effectiveDate",
    "expirationDate",
    "remainingAmount",
    "voucherID"
})
public class VoucherType {

    /**
     * Voucher Effective Date. Example: 2017-01-13
     * 
     */
    @XmlElement(name = "EffectiveDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate effectiveDate;
    /**
     * Voucher Expiration date. Example: 2017-06-13
     * 
     */
    @XmlElement(name = "ExpirationDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate expirationDate;
    /**
     * Remaining Amount on Voucher.
     * 
     */
    @XmlElement(name = "RemainingAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected AmountType remainingAmount;
    /**
     * Voucher ID or Number. Example: XX12345
     * 
     */
    @XmlElement(name = "VoucherID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String voucherID;

    /**
     * Voucher Effective Date. Example: 2017-01-13
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEffectiveDate()
     */
    public void setEffectiveDate(LocalDate value) {
        this.effectiveDate = value;
    }

    /**
     * Voucher Expiration date. Example: 2017-06-13
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExpirationDate()
     */
    public void setExpirationDate(LocalDate value) {
        this.expirationDate = value;
    }

    /**
     * Remaining Amount on Voucher.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Sets the value of the remainingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getRemainingAmount()
     */
    public void setRemainingAmount(AmountType value) {
        this.remainingAmount = value;
    }

    /**
     * Voucher ID or Number. Example: XX12345
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherID() {
        return voucherID;
    }

    /**
     * Sets the value of the voucherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVoucherID()
     */
    public void setVoucherID(String value) {
        this.voucherID = value;
    }

}
