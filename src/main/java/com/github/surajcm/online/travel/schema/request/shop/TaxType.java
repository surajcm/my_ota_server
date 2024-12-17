
package com.github.surajcm.online.travel.schema.request.shop;

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
 * A compulsory contribution to state revenue, levied by the government on workers' income and business profits or added to the cost of some goods, services, and transactions.
 * 
 * <p>Java class for TaxType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TaxType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AddlFiledTaxCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxCodeType" minOccurs="0"/>
 *         <element name="AddlTaxCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxCodeType" minOccurs="0"/>
 *         <element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType" minOccurs="0"/>
 *         <element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="AppTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="CollectionInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="CollectionPointTax" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CollectionPointTaxType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountryType" minOccurs="0"/>
 *         <element name="CountrySubDivision" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CountrySubDivisionType" minOccurs="0"/>
 *         <element name="CurConversion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CurConversionType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="FiledAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}AmountType" minOccurs="0"/>
 *         <element name="FiledTaxCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxCodeType" minOccurs="0"/>
 *         <element name="QualifierCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxQualifierCodeType" minOccurs="0"/>
 *         <element name="RefundInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="TaxCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxCodeType" minOccurs="0"/>
 *         <element name="TaxName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="TaxTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TaxTypeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "addlFiledTaxCode",
    "addlTaxCode",
    "amount",
    "approximateInd",
    "appTypeCode",
    "collectionInd",
    "collectionPointTax",
    "country",
    "countrySubDivision",
    "curConversion",
    "descText",
    "filedAmount",
    "filedTaxCode",
    "qualifierCode",
    "refundInd",
    "taxCode",
    "taxName",
    "taxTypeCode"
})
public class TaxType {

    /**
     * A qualifier to the Tax Code to distinguish taxes/fees/charges with the same tax code but with different business uses.
     * 
     */
    @XmlElement(name = "AddlFiledTaxCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addlFiledTaxCode;
    /**
     * A qualifier to the Tax Code to distinguish taxes/fees/charges with the same tax code but with different business uses.
     * 
     */
    @XmlElement(name = "AddlTaxCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addlTaxCode;
    /**
     * Tax amount. Example: 15000 USD
     * 
     */
    @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AmountType amount;
    /**
     * When true, this tax amount is approximate.
     * 
     */
    @XmlElement(name = "ApproximateInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean approximateInd;
    /**
     * Indicates at which point the tax was applied (e.g. S - Sale, D - Departure, A - Arrival, X - Delivery).
     * 
     */
    @XmlElement(name = "AppTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appTypeCode;
    /**
     * When true, this tax must be collected.
     * 
     */
    @XmlElement(name = "CollectionInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean collectionInd;
    /**
     * Tax data breakdown by collection point for XF(Passenger Facility Fee) and ZP(federal tax segment) taxes.
     * 
     */
    @XmlElement(name = "CollectionPointTax", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<CollectionPointTaxType> collectionPointTax;
    /**
     * A nation with its own government, occupying a particular territory.
     * 
     */
    @XmlElement(name = "Country", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CountryType country;
    /**
     * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
     * 
     */
    @XmlElement(name = "CountrySubDivision", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CountrySubDivisionType countrySubDivision;
    /**
     * The result of converting one currency into another currency. E.g. local currency to USD, air miles to monetary.
     * 
     */
    @XmlElement(name = "CurConversion", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected CurConversionType curConversion;
    /**
     * Tax short description. Example: $4 per flight segment, per passenger (U.S. domestic segment tax)
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String descText;
    /**
     * Internal tax filed amount as determined by the airline.
     * 
     */
    @XmlElement(name = "FiledAmount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected AmountType filedAmount;
    /**
     * Internal tax filed type code as determined by the airline.
     * 
     */
    @XmlElement(name = "FiledTaxCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String filedTaxCode;
    /**
     * Indicate additional information regarding this tax (for example tax on EMD, VAT, etc.).
     * 
     */
    @XmlElement(name = "QualifierCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String qualifierCode;
    /**
     * When true, this tax is refundable.
     * 
     */
    @XmlElement(name = "RefundInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean refundInd;
    /**
     * IATA TTBS Tax Code. Example: AY, GB
     * 
     */
    @XmlElement(name = "TaxCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxCode;
    /**
     * The name given to describe the tax. For example, this name can be taken from the IATA TTBS
     * 
     */
    @XmlElement(name = "TaxName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxName;
    /**
     * Tax type code (e.g. Applied or Exempt).
     * 
     */
    @XmlElement(name = "TaxTypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlSchemaType(name = "token")
    protected TaxTypeCodeContentType taxTypeCode;

    /**
     * A qualifier to the Tax Code to distinguish taxes/fees/charges with the same tax code but with different business uses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlFiledTaxCode() {
        return addlFiledTaxCode;
    }

    /**
     * Sets the value of the addlFiledTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddlFiledTaxCode()
     */
    public void setAddlFiledTaxCode(String value) {
        this.addlFiledTaxCode = value;
    }

    /**
     * A qualifier to the Tax Code to distinguish taxes/fees/charges with the same tax code but with different business uses.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddlTaxCode() {
        return addlTaxCode;
    }

    /**
     * Sets the value of the addlTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddlTaxCode()
     */
    public void setAddlTaxCode(String value) {
        this.addlTaxCode = value;
    }

    /**
     * Tax amount. Example: 15000 USD
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getAmount()
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * When true, this tax amount is approximate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isApproximateInd()
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Indicates at which point the tax was applied (e.g. S - Sale, D - Departure, A - Arrival, X - Delivery).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTypeCode() {
        return appTypeCode;
    }

    /**
     * Sets the value of the appTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAppTypeCode()
     */
    public void setAppTypeCode(String value) {
        this.appTypeCode = value;
    }

    /**
     * When true, this tax must be collected.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionInd() {
        return collectionInd;
    }

    /**
     * Sets the value of the collectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCollectionInd()
     */
    public void setCollectionInd(Boolean value) {
        this.collectionInd = value;
    }

    /**
     * Tax data breakdown by collection point for XF(Passenger Facility Fee) and ZP(federal tax segment) taxes.
     * 
     * Gets the value of the collectionPointTax property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionPointTax property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCollectionPointTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionPointTaxType }
     * </p>
     * 
     * 
     * @return
     *     The value of the collectionPointTax property.
     */
    public List<CollectionPointTaxType> getCollectionPointTax() {
        if (collectionPointTax == null) {
            collectionPointTax = new ArrayList<>();
        }
        return this.collectionPointTax;
    }

    /**
     * A nation with its own government, occupying a particular territory.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     * @see #getCountry()
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public CountrySubDivisionType getCountrySubDivision() {
        return countrySubDivision;
    }

    /**
     * Sets the value of the countrySubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionType }
     *     
     * @see #getCountrySubDivision()
     */
    public void setCountrySubDivision(CountrySubDivisionType value) {
        this.countrySubDivision = value;
    }

    /**
     * The result of converting one currency into another currency. E.g. local currency to USD, air miles to monetary.
     * 
     * @return
     *     possible object is
     *     {@link CurConversionType }
     *     
     */
    public CurConversionType getCurConversion() {
        return curConversion;
    }

    /**
     * Sets the value of the curConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurConversionType }
     *     
     * @see #getCurConversion()
     */
    public void setCurConversion(CurConversionType value) {
        this.curConversion = value;
    }

    /**
     * Tax short description. Example: $4 per flight segment, per passenger (U.S. domestic segment tax)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescText()
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Internal tax filed amount as determined by the airline.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFiledAmount() {
        return filedAmount;
    }

    /**
     * Sets the value of the filedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     * @see #getFiledAmount()
     */
    public void setFiledAmount(AmountType value) {
        this.filedAmount = value;
    }

    /**
     * Internal tax filed type code as determined by the airline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledTaxCode() {
        return filedTaxCode;
    }

    /**
     * Sets the value of the filedTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFiledTaxCode()
     */
    public void setFiledTaxCode(String value) {
        this.filedTaxCode = value;
    }

    /**
     * Indicate additional information regarding this tax (for example tax on EMD, VAT, etc.).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifierCode() {
        return qualifierCode;
    }

    /**
     * Sets the value of the qualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQualifierCode()
     */
    public void setQualifierCode(String value) {
        this.qualifierCode = value;
    }

    /**
     * When true, this tax is refundable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInd() {
        return refundInd;
    }

    /**
     * Sets the value of the refundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRefundInd()
     */
    public void setRefundInd(Boolean value) {
        this.refundInd = value;
    }

    /**
     * IATA TTBS Tax Code. Example: AY, GB
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxCode()
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * The name given to describe the tax. For example, this name can be taken from the IATA TTBS
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxName() {
        return taxName;
    }

    /**
     * Sets the value of the taxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTaxName()
     */
    public void setTaxName(String value) {
        this.taxName = value;
    }

    /**
     * Tax type code (e.g. Applied or Exempt).
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCodeContentType }
     *     
     */
    public TaxTypeCodeContentType getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCodeContentType }
     *     
     * @see #getTaxTypeCode()
     */
    public void setTaxTypeCode(TaxTypeCodeContentType value) {
        this.taxTypeCode = value;
    }

}
