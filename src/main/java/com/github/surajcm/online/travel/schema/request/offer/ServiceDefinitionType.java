
package com.github.surajcm.online.travel.schema.request.offer;

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
 * Description and characteristics of a non-flight product or service that can be separately sold and delivered. E.g. bag, seat, meal on a flight.
 * 
 * <p>Java class for ServiceDefinitionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceDefinitionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceTaxonomy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceTaxonomyType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BilateralTimeLimit" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BilateralTimeLimitType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BookingInstructions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}BookingInstructionsType" minOccurs="0"/>
 *         <element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DescType" maxOccurs="unbounded"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NameType"/>
 *         <element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}DateTimeType" minOccurs="0"/>
 *         <element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AirlineDesigCodeType" minOccurs="0"/>
 *         <element name="RFIC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RFIC_Type" minOccurs="0"/>
 *         <element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}RFISC_Type" minOccurs="0"/>
 *         <element name="ServiceCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="ServiceDefinitionAssociation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ServiceDefinitionAssociationType" minOccurs="0"/>
 *         <element name="ServiceDefinitionID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type"/>
 *         <element name="SpecialService" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SpecialServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}AirlineDesigCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "serviceTaxonomy",
    "bilateralTimeLimit",
    "bookingInstructions",
    "depositTimeLimitDateTime",
    "desc",
    "name",
    "namingTimeLimitDateTime",
    "ownerCode",
    "rfic",
    "rfisc",
    "serviceCode",
    "serviceDefinitionAssociation",
    "serviceDefinitionID",
    "specialService",
    "validatingCarrierCode"
})
public class ServiceDefinitionType {

    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     */
    @XmlElement(name = "ServiceTaxonomy", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<ServiceTaxonomyType> serviceTaxonomy;
    /**
     * A bilaterally agreed limitation or restriction of time.
     * 
     */
    @XmlElement(name = "BilateralTimeLimit", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<BilateralTimeLimitType> bilateralTimeLimit;
    /**
     * Optional service booking instructions to include SSR, OSI and upgrade Method.
     * 
     */
    @XmlElement(name = "BookingInstructions", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected BookingInstructionsType bookingInstructions;
    /**
     * The date by which a deposit must be paid for an order Examples: 2015-01-13T13:59:38Z
     * 
     */
    @XmlElement(name = "DepositTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType depositTimeLimitDateTime;
    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    protected List<DescType> desc;
    /**
     * Service name. Example: Lounge Pass
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    /**
     * The time by which an Order must be completed with individual passenger names. Examples: 2015-01-13T13:59:38Z
     * 
     */
    @XmlElement(name = "NamingTimeLimitDateTime", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected DateTimeType namingTimeLimitDateTime;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "OwnerCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    /**
     * Reason For Issuance Code  Examples: A (Air Transportation) C (Baggage) E (Airport Services) F (Merchandise) G (In-flight Services)
     * 
     */
    @XmlElement(name = "RFIC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String rfic;
    /**
     * Reason For Issuance Sub Code. Examples: 0CC (First Checked Bag) 0B1 (In-flight Entertainment) 0BX (Lounge)
     * 
     */
    @XmlElement(name = "RFISC", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String rfisc;
    /**
     * Airline specific service code which can be associated with the Reason for Issuance Sub Code.  Sample implementer encoding: XLEG for Extra Leg Room Seat XBAG for Extra Bag
     * 
     */
    @XmlElement(name = "ServiceCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceCode;
    /**
     * Choice to determine if the information of this ServiceDefinition needs to be extended with specific Bag or Seat characteristics, or whether the ServiceDefinition is used as a bundle of further ServiceDefinitions.
     * 
     */
    @XmlElement(name = "ServiceDefinitionAssociation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ServiceDefinitionAssociationType serviceDefinitionAssociation;
    /**
     * Uniquely Identifies a Service Definition within the context of one message.
     * 
     */
    @XmlElement(name = "ServiceDefinitionID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDefinitionID;
    /**
     * Special service information
     * 
     */
    @XmlElement(name = "SpecialService", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<SpecialServiceType> specialService;
    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     */
    @XmlElement(name = "ValidatingCarrierCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatingCarrierCode;

    /**
     * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
     * 
     * Gets the value of the serviceTaxonomy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTaxonomy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceTaxonomy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTaxonomyType }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceTaxonomy property.
     */
    public List<ServiceTaxonomyType> getServiceTaxonomy() {
        if (serviceTaxonomy == null) {
            serviceTaxonomy = new ArrayList<>();
        }
        return this.serviceTaxonomy;
    }

    /**
     * A bilaterally agreed limitation or restriction of time.
     * 
     * Gets the value of the bilateralTimeLimit property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilateralTimeLimit property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBilateralTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralTimeLimitType }
     * </p>
     * 
     * 
     * @return
     *     The value of the bilateralTimeLimit property.
     */
    public List<BilateralTimeLimitType> getBilateralTimeLimit() {
        if (bilateralTimeLimit == null) {
            bilateralTimeLimit = new ArrayList<>();
        }
        return this.bilateralTimeLimit;
    }

    /**
     * Optional service booking instructions to include SSR, OSI and upgrade Method.
     * 
     * @return
     *     possible object is
     *     {@link BookingInstructionsType }
     *     
     */
    public BookingInstructionsType getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * Sets the value of the bookingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingInstructionsType }
     *     
     * @see #getBookingInstructions()
     */
    public void setBookingInstructions(BookingInstructionsType value) {
        this.bookingInstructions = value;
    }

    /**
     * The date by which a deposit must be paid for an order Examples: 2015-01-13T13:59:38Z
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDepositTimeLimitDateTime() {
        return depositTimeLimitDateTime;
    }

    /**
     * Sets the value of the depositTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getDepositTimeLimitDateTime()
     */
    public void setDepositTimeLimitDateTime(DateTimeType value) {
        this.depositTimeLimitDateTime = value;
    }

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     * Gets the value of the desc property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * </p>
     * 
     * 
     * @return
     *     The value of the desc property.
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<>();
        }
        return this.desc;
    }

    /**
     * Service name. Example: Lounge Pass
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The time by which an Order must be completed with individual passenger names. Examples: 2015-01-13T13:59:38Z
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getNamingTimeLimitDateTime() {
        return namingTimeLimitDateTime;
    }

    /**
     * Sets the value of the namingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getNamingTimeLimitDateTime()
     */
    public void setNamingTimeLimitDateTime(DateTimeType value) {
        this.namingTimeLimitDateTime = value;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerCode()
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Reason For Issuance Code  Examples: A (Air Transportation) C (Baggage) E (Airport Services) F (Merchandise) G (In-flight Services)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFIC()
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Reason For Issuance Sub Code. Examples: 0CC (First Checked Bag) 0B1 (In-flight Entertainment) 0BX (Lounge)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRFISC()
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     * Airline specific service code which can be associated with the Reason for Issuance Sub Code.  Sample implementer encoding: XLEG for Extra Leg Room Seat XBAG for Extra Bag
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceCode()
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Choice to determine if the information of this ServiceDefinition needs to be extended with specific Bag or Seat characteristics, or whether the ServiceDefinition is used as a bundle of further ServiceDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     */
    public ServiceDefinitionAssociationType getServiceDefinitionAssociation() {
        return serviceDefinitionAssociation;
    }

    /**
     * Sets the value of the serviceDefinitionAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     * @see #getServiceDefinitionAssociation()
     */
    public void setServiceDefinitionAssociation(ServiceDefinitionAssociationType value) {
        this.serviceDefinitionAssociation = value;
    }

    /**
     * Uniquely Identifies a Service Definition within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionID() {
        return serviceDefinitionID;
    }

    /**
     * Sets the value of the serviceDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceDefinitionID()
     */
    public void setServiceDefinitionID(String value) {
        this.serviceDefinitionID = value;
    }

    /**
     * Special service information
     * 
     * Gets the value of the specialService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpecialService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the specialService property.
     */
    public List<SpecialServiceType> getSpecialService() {
        if (specialService == null) {
            specialService = new ArrayList<>();
        }
        return this.specialService;
    }

    /**
     * Airline code assigned to a carrier. Either ICAO-defined 3-character code or IATA-defined 2-character code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValidatingCarrierCode()
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

}
