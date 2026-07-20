
package com.github.surajcm.online.travel.schema.response.offer;

import java.math.BigDecimal;
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
 * A written order instructing a financial institution to pay immediately on demand a specified amount of money from the check writer's account to the person named on the check or, if a specific person is not named, to whoever bears the check to the institution for payment.
 * 
 * <p>Java class for CheckType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CheckType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CheckNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}NumberType" minOccurs="0"/>
 *         <element name="PayeeName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ProperNameType" minOccurs="0"/>
 *         <element name="SignedDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DateType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "checkNumber",
    "payeeName",
    "signedDate"
})
public class CheckType {

    /**
     * Number found on the check which uniquely identifies the check being used as payment.
     * 
     */
    @XmlElement(name = "CheckNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BigDecimal checkNumber;
    /**
     * The name of the payee or check recipient.
     * 
     */
    @XmlElement(name = "PayeeName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String payeeName;
    /**
     * Date that the check is signed.
     * 
     */
    @XmlElement(name = "SignedDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate signedDate;

    /**
     * Number found on the check which uniquely identifies the check being used as payment.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCheckNumber()
     */
    public void setCheckNumber(BigDecimal value) {
        this.checkNumber = value;
    }

    /**
     * The name of the payee or check recipient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPayeeName()
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Date that the check is signed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSignedDate() {
        return signedDate;
    }

    /**
     * Sets the value of the signedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSignedDate()
     */
    public void setSignedDate(LocalDate value) {
        this.signedDate = value;
    }

}
