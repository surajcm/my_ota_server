
package com.github.surajcm.online.travel.schema.request.shop;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The carrier whose baggage allowances and charges apply.
 * 
 * <p>Java class for BDC_Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BDC_Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BagRuleCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BagRuleCodeType" minOccurs="0"/>
 *         <element name="BDC_AnalysisResultCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}BDC_AnalysisResultCodeType" minOccurs="0"/>
 *         <element name="BDC_ReasonText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AirlineDesigCodeType"/>
 *         <element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BDC_Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "bagRuleCode",
    "bdcAnalysisResultCode",
    "bdcReasonText",
    "carrierDesigCode",
    "carrierName"
})
public class BDCType {

    /**
     * US Department of Transportation (DOT) Reservation or Disclosure baggage rule. Examples: Y, Disclosure AND US DOT Reservation
     * 
     */
    @XmlElement(name = "BagRuleCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected BagRuleCodeContentType bagRuleCode;
    /**
     * In concert with BaggageDeterminingCarrier data field, specifies the reason for the carrier code in the AirlineID element.  Encoding Scheme: IATA PADIS Code List for data element RES.
     * 
     */
    @XmlElement(name = "BDC_AnalysisResultCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bdcAnalysisResultCode;
    /**
     * Reason for selection of the Baggage Determining Carrier.  Examples: Regulatory (application of regulation or resolution), Deferral (deferral by ORA), Bilateral (bilateral agreement).
     * 
     */
    @XmlElement(name = "BDC_ReasonText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String bdcReasonText;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "CarrierDesigCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierDesigCode;
    /**
     * Commercial name of the carrier.
     * 
     */
    @XmlElement(name = "CarrierName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;

    /**
     * US Department of Transportation (DOT) Reservation or Disclosure baggage rule. Examples: Y, Disclosure AND US DOT Reservation
     * 
     * @return
     *     possible object is
     *     {@link BagRuleCodeContentType }
     *     
     */
    public BagRuleCodeContentType getBagRuleCode() {
        return bagRuleCode;
    }

    /**
     * Sets the value of the bagRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagRuleCodeContentType }
     *     
     * @see #getBagRuleCode()
     */
    public void setBagRuleCode(BagRuleCodeContentType value) {
        this.bagRuleCode = value;
    }

    /**
     * In concert with BaggageDeterminingCarrier data field, specifies the reason for the carrier code in the AirlineID element.  Encoding Scheme: IATA PADIS Code List for data element RES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCAnalysisResultCode() {
        return bdcAnalysisResultCode;
    }

    /**
     * Sets the value of the bdcAnalysisResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBDCAnalysisResultCode()
     */
    public void setBDCAnalysisResultCode(String value) {
        this.bdcAnalysisResultCode = value;
    }

    /**
     * Reason for selection of the Baggage Determining Carrier.  Examples: Regulatory (application of regulation or resolution), Deferral (deferral by ORA), Bilateral (bilateral agreement).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCReasonText() {
        return bdcReasonText;
    }

    /**
     * Sets the value of the bdcReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBDCReasonText()
     */
    public void setBDCReasonText(String value) {
        this.bdcReasonText = value;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDesigCode() {
        return carrierDesigCode;
    }

    /**
     * Sets the value of the carrierDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierDesigCode()
     */
    public void setCarrierDesigCode(String value) {
        this.carrierDesigCode = value;
    }

    /**
     * Commercial name of the carrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCarrierName()
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

}
