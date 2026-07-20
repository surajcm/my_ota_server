
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
 * Discount program specific filter criteria for shopping requests.
 * 
 * <p>Java class for ProgramCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProgramCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CompanyIndexText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/>
 *         <element name="MemberStatusText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NameType" minOccurs="0"/>
 *         <element name="PrePaidCertificate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}PrePaidCertificateType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ProgamContract" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ProgamContractType" minOccurs="0"/>
 *         <element name="ProgramAccount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ProgramAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "companyIndexText",
    "memberStatusText",
    "name",
    "prePaidCertificate",
    "progamContract",
    "programAccount",
    "typeCode"
})
public class ProgramCriteriaType {

    /**
     * Company profile index associated with this special fare. Example: COM1234
     * 
     */
    @XmlElement(name = "CompanyIndexText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String companyIndexText;
    /**
     * Member or participant status within the program (e.g. VP, Director, Exec).
     * 
     */
    @XmlElement(name = "MemberStatusText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String memberStatusText;
    /**
     * The name of the program.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "PrePaidCertificate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<PrePaidCertificateType> prePaidCertificate;
    /**
     * An agreement which provides access to discounted or negotiated prices.
     * 
     */
    @XmlElement(name = "ProgamContract", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected ProgamContractType progamContract;
    /**
     * An account which provides access to discounted or negotiated prices.
     * 
     */
    @XmlElement(name = "ProgramAccount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<ProgramAccountType> programAccount;
    /**
     * Program type code (e.g. Discount Program, Incentive Program, Pre-paid Program).
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;

    /**
     * Company profile index associated with this special fare. Example: COM1234
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIndexText() {
        return companyIndexText;
    }

    /**
     * Sets the value of the companyIndexText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCompanyIndexText()
     */
    public void setCompanyIndexText(String value) {
        this.companyIndexText = value;
    }

    /**
     * Member or participant status within the program (e.g. VP, Director, Exec).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberStatusText() {
        return memberStatusText;
    }

    /**
     * Sets the value of the memberStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMemberStatusText()
     */
    public void setMemberStatusText(String value) {
        this.memberStatusText = value;
    }

    /**
     * The name of the program.
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
     * Gets the value of the prePaidCertificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePaidCertificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPrePaidCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrePaidCertificateType }
     * </p>
     * 
     * 
     * @return
     *     The value of the prePaidCertificate property.
     */
    public List<PrePaidCertificateType> getPrePaidCertificate() {
        if (prePaidCertificate == null) {
            prePaidCertificate = new ArrayList<>();
        }
        return this.prePaidCertificate;
    }

    /**
     * An agreement which provides access to discounted or negotiated prices.
     * 
     * @return
     *     possible object is
     *     {@link ProgamContractType }
     *     
     */
    public ProgamContractType getProgamContract() {
        return progamContract;
    }

    /**
     * Sets the value of the progamContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgamContractType }
     *     
     * @see #getProgamContract()
     */
    public void setProgamContract(ProgamContractType value) {
        this.progamContract = value;
    }

    /**
     * An account which provides access to discounted or negotiated prices.
     * 
     * Gets the value of the programAccount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programAccount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramAccountType }
     * </p>
     * 
     * 
     * @return
     *     The value of the programAccount property.
     */
    public List<ProgramAccountType> getProgramAccount() {
        if (programAccount == null) {
            programAccount = new ArrayList<>();
        }
        return this.programAccount;
    }

    /**
     * Program type code (e.g. Discount Program, Incentive Program, Pre-paid Program).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTypeCode()
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

}
