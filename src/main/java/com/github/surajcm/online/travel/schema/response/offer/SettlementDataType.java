
package com.github.surajcm.online.travel.schema.response.offer;

import java.time.LocalDate;
import com.github.surajcm.online.travel.dataaccess.serialization.LocalDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Amounts that define the funds to be cleared as a result of the payment commitment and the selected payment method, and the date when the funds must be remitted.
 * 
 * <p>Java class for SettlementDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SettlementDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NetClearanceAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType"/>
 *         <element name="RemittanceDate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DateType" minOccurs="0"/>
 *         <element name="ORA_NetPayable" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType"/>
 *         <element name="ORA_NetReceivable" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}AmountType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDataType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "netClearanceAmount",
    "remittanceDate",
    "oraNetPayable",
    "oraNetReceivable"
})
public class SettlementDataType {

    /**
     * The amount agreed to be cleared in the Agreement between the two parties to the Agreement. It is obtained from the Commitment in the Agreement. The value of the Net Clearance Amount in the Payment Commitment of the Agreement can be either positive [+] or negative [-]. If it is positive [+] then the party initiating the clearance request will be the Payee in the clearance, i.e. the initiator of the clearance is to receive funds. If it is negative [-] then the party initiating the clearance request will be the Payer in the clearance, i.e. the initiator of the clearance has to pay-out funds. It is the absolute value of the Net Clearance Amount that is used in the Clearance.
     * 
     */
    @XmlElement(name = "NetClearanceAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected AmountType netClearanceAmount;
    /**
     * This is the date when the Payer will have to transfer the amount in the clearance request into the settlement managerâ€™s bank account.
     * 
     */
    @XmlElement(name = "RemittanceDate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", type = String.class)
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate remittanceDate;
    /**
     * Amount owed by ORA that has not yet been paid.
     * 
     */
    @XmlElement(name = "ORA_NetPayable", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected AmountType oraNetPayable;
    /**
     * Amount owed to ORA at a particular time and not yet paid.
     * 
     */
    @XmlElement(name = "ORA_NetReceivable", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected AmountType oraNetReceivable;

    /**
     * The amount agreed to be cleared in the Agreement between the two parties to the Agreement. It is obtained from the Commitment in the Agreement. The value of the Net Clearance Amount in the Payment Commitment of the Agreement can be either positive [+] or negative [-]. If it is positive [+] then the party initiating the clearance request will be the Payee in the clearance, i.e. the initiator of the clearance is to receive funds. If it is negative [-] then the party initiating the clearance request will be the Payer in the clearance, i.e. the initiator of the clearance has to pay-out funds. It is the absolute value of the Net Clearance Amount that is used in the Clearance.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetClearanceAmount() {
        return netClearanceAmount;
    }

    /**
     * Sets the value of the netClearanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getNetClearanceAmount()
     */
    public void setNetClearanceAmount(AmountType value) {
        this.netClearanceAmount = value;
    }

    /**
     * This is the date when the Payer will have to transfer the amount in the clearance request into the settlement managerâ€™s bank account.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRemittanceDate() {
        return remittanceDate;
    }

    /**
     * Sets the value of the remittanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRemittanceDate()
     */
    public void setRemittanceDate(LocalDate value) {
        this.remittanceDate = value;
    }

    /**
     * Amount owed by ORA that has not yet been paid.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getORANetPayable() {
        return oraNetPayable;
    }

    /**
     * Sets the value of the oraNetPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getORANetPayable()
     */
    public void setORANetPayable(AmountType value) {
        this.oraNetPayable = value;
    }

    /**
     * Amount owed to ORA at a particular time and not yet paid.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getORANetReceivable() {
        return oraNetReceivable;
    }

    /**
     * Sets the value of the oraNetReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getORANetReceivable()
     */
    public void setORANetReceivable(AmountType value) {
        this.oraNetReceivable = value;
    }

}
