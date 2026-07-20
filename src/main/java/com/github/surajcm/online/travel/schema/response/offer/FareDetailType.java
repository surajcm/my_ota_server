
package com.github.surajcm.online.travel.schema.response.offer;

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
 * The amount charged by the carrier for the carriage of a passenger and his allowable free baggage.
 * 
 * <p>Java class for FareDetailType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FareDetailType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         <element name="FareComponent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}FareComponentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FareIndCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *         <element name="FarePriceType" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}FarePriceTypeType" maxOccurs="3"/>
 *         <element name="FareRefText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="FiledFareInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}IndType" minOccurs="0"/>
 *         <element name="NetReportingCodeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Price" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}Price2Type" minOccurs="0"/>
 *         <element name="PricingSystemCodeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="StatisticalCodeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="TourCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDetailType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "accountCode",
    "fareComponent",
    "fareIndCode",
    "farePriceType",
    "fareRefText",
    "filedFareInd",
    "netReportingCodeText",
    "paxRefID",
    "price",
    "pricingSystemCodeText",
    "statisticalCodeText",
    "tourCode"
})
public class FareDetailType {

    /**
     * Corporate ID used for pricing special fares. Example: 675124
     * 
     */
    @XmlElement(name = "AccountCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountCode;
    /**
     * A portion of an itinerary between two consecutive fare construction points. If the journey has only one fare component, the points of origin and destination are the only fare construction points
     * 
     */
    @XmlElement(name = "FareComponent", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<FareComponentType> fareComponent;
    /**
     * Fare indicator code. Example: 1 (SYSTEM PRICED WITHOUT MANUAL INTERVENTION)  Encoding Scheme: IATA PADIS Code List for data element 5387 - Price Type Qualifier
     * 
     */
    @XmlElement(name = "FareIndCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fareIndCode;
    /**
     * The type of fair price applied to a Fare Detail (e.g. filed amount, net amount, or a sell amount).
     * 
     */
    @XmlElement(name = "FarePriceType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected List<FarePriceTypeType> farePriceType;
    /**
     * Fare reference key, ex: PQ123456
     * 
     */
    @XmlElement(name = "FareRefText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String fareRefText;
    /**
     * When TRUE, a component of this fare has been priced using filed fare data. If FALSE, dynamic pricing has been applied.
     * 
     */
    @XmlElement(name = "FiledFareInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Boolean filedFareInd;
    /**
     * Code indicating if the transaction is subject to a net reporting arrangement.
     * 
     */
    @XmlElement(name = "NetReportingCodeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String netReportingCodeText;
    /**
     * Reference to a Passenger ID
     * 
     */
    @XmlElement(name = "PaxRefID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     */
    @XmlElement(name = "Price", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected Price2Type price;
    /**
     * IATA assigned code identifying the system used to price the itinerary for the document being issued.
     * 
     */
    @XmlElement(name = "PricingSystemCodeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String pricingSystemCodeText;
    /**
     * Code used for domestic or international sales differentiation.
     * 
     */
    @XmlElement(name = "StatisticalCodeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String statisticalCodeText;
    /**
     * Tour Code. Example: ITGF12
     * 
     */
    @XmlElement(name = "TourCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tourCode;

    /**
     * Corporate ID used for pricing special fares. Example: 675124
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountCode()
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * A portion of an itinerary between two consecutive fare construction points. If the journey has only one fare component, the points of origin and destination are the only fare construction points
     * 
     * Gets the value of the fareComponent property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareComponent property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFareComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareComponentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fareComponent property.
     */
    public List<FareComponentType> getFareComponent() {
        if (fareComponent == null) {
            fareComponent = new ArrayList<>();
        }
        return this.fareComponent;
    }

    /**
     * Fare indicator code. Example: 1 (SYSTEM PRICED WITHOUT MANUAL INTERVENTION)  Encoding Scheme: IATA PADIS Code List for data element 5387 - Price Type Qualifier
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareIndCode() {
        return fareIndCode;
    }

    /**
     * Sets the value of the fareIndCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareIndCode()
     */
    public void setFareIndCode(String value) {
        this.fareIndCode = value;
    }

    /**
     * The type of fair price applied to a Fare Detail (e.g. filed amount, net amount, or a sell amount).
     * 
     * Gets the value of the farePriceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the farePriceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFarePriceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePriceTypeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the farePriceType property.
     */
    public List<FarePriceTypeType> getFarePriceType() {
        if (farePriceType == null) {
            farePriceType = new ArrayList<>();
        }
        return this.farePriceType;
    }

    /**
     * Fare reference key, ex: PQ123456
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRefText() {
        return fareRefText;
    }

    /**
     * Sets the value of the fareRefText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFareRefText()
     */
    public void setFareRefText(String value) {
        this.fareRefText = value;
    }

    /**
     * When TRUE, a component of this fare has been priced using filed fare data. If FALSE, dynamic pricing has been applied.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFiledFareInd() {
        return filedFareInd;
    }

    /**
     * Sets the value of the filedFareInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFiledFareInd()
     */
    public void setFiledFareInd(Boolean value) {
        this.filedFareInd = value;
    }

    /**
     * Code indicating if the transaction is subject to a net reporting arrangement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetReportingCodeText() {
        return netReportingCodeText;
    }

    /**
     * Sets the value of the netReportingCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNetReportingCodeText()
     */
    public void setNetReportingCodeText(String value) {
        this.netReportingCodeText = value;
    }

    /**
     * Reference to a Passenger ID
     * 
     * Gets the value of the paxRefID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the paxRefID property.
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<>();
        }
        return this.paxRefID;
    }

    /**
     * The amount of money expected, required, or given in payment for something.
     * 
     * @return
     *     possible object is
     *     {@link Price2Type }
     *     
     */
    public Price2Type getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price2Type }
     *     
     * @see #getPrice()
     */
    public void setPrice(Price2Type value) {
        this.price = value;
    }

    /**
     * IATA assigned code identifying the system used to price the itinerary for the document being issued.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingSystemCodeText() {
        return pricingSystemCodeText;
    }

    /**
     * Sets the value of the pricingSystemCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPricingSystemCodeText()
     */
    public void setPricingSystemCodeText(String value) {
        this.pricingSystemCodeText = value;
    }

    /**
     * Code used for domestic or international sales differentiation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalCodeText() {
        return statisticalCodeText;
    }

    /**
     * Sets the value of the statisticalCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatisticalCodeText()
     */
    public void setStatisticalCodeText(String value) {
        this.statisticalCodeText = value;
    }

    /**
     * Tour Code. Example: ITGF12
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTourCode()
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

}
