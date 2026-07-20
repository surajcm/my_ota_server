
package com.github.surajcm.online.travel.schema.response.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to the value of a product or service as it pertains to interline transactions.
 * 
 * <p>Java class for InterlineSettlementInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InterlineSettlementInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MethodCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}SettlementMethodCodeType"/>
 *         <element name="SettlementAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AmountType"/>
 *         <element name="TaxableInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterlineSettlementInfoType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "commission",
    "methodCode",
    "settlementAmount",
    "taxableInd"
})
public class InterlineSettlementInfoType {

    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     */
    @XmlElement(name = "Commission", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<CommissionType> commission;
    /**
     * Settlement method. Examples: - AD (Internal Airline Document) - DS (Direct Settlement) - EA (EMD Associated or Internal Airline Document).
     * 
     */
    @XmlElement(name = "MethodCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String methodCode;
    /**
     * Settlement (Price) Value. Example: 300 (USD) Note: This represents a Settlement value that is only used between the POA and ORA.
     * 
     */
    @XmlElement(name = "SettlementAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected AmountType settlementAmount;
    /**
     * In some markets, commission is VAT-able (i.e. Taxable)
     * 
     */
    @XmlElement(name = "TaxableInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean taxableInd;

    /**
     * An amount of money, typically a set percentage of the value involved, paid to an agent in a commercial transaction.
     * 
     * Gets the value of the commission property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the commission property.
     */
    public List<CommissionType> getCommission() {
        if (commission == null) {
            commission = new ArrayList<>();
        }
        return this.commission;
    }

    /**
     * Settlement method. Examples: - AD (Internal Airline Document) - DS (Direct Settlement) - EA (EMD Associated or Internal Airline Document).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * Sets the value of the methodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMethodCode()
     */
    public void setMethodCode(String value) {
        this.methodCode = value;
    }

    /**
     * Settlement (Price) Value. Example: 300 (USD) Note: This represents a Settlement value that is only used between the POA and ORA.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getSettlementAmount()
     */
    public void setSettlementAmount(AmountType value) {
        this.settlementAmount = value;
    }

    /**
     * In some markets, commission is VAT-able (i.e. Taxable)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxableInd() {
        return taxableInd;
    }

    /**
     * Sets the value of the taxableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTaxableInd()
     */
    public void setTaxableInd(Boolean value) {
        this.taxableInd = value;
    }

}
