
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
 * Filtering criteria based on discount programs.
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
 *         <element name="CompanyIndexText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="MemberStatusText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/>
 *         <element name="PrePaidCertificate" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrePaidCertificateType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ProgamContract" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProgamContractType" minOccurs="0"/>
 *         <element name="ProgramAccount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProgramAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ProgramOwner" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ProgramOwnerType"/>
 *         <element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramCriteriaType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "companyIndexText",
    "memberStatusText",
    "name",
    "prePaidCertificate",
    "progamContract",
    "programAccount",
    "programOwner",
    "typeCode"
})
public class ProgramCriteriaType {

    /**
     * Company profile index associated with this special fare. Example: COM1234
     * 
     */
    @XmlElement(name = "CompanyIndexText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String companyIndexText;
    /**
     * Member or participant status within the program (e.g. VP, Director, Exec).
     * 
     */
    @XmlElement(name = "MemberStatusText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String memberStatusText;
    /**
     * The name of the program.
     * 
     */
    @XmlElement(name = "Name", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "PrePaidCertificate", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<PrePaidCertificateType> prePaidCertificate;
    /**
     * a written or spoken agreement, especially one concerning employment, sales, or tenancy, that is intended to be enforceable by law
     * 
     */
    @XmlElement(name = "ProgamContract", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected ProgamContractType progamContract;
    @XmlElement(name = "ProgramAccount", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ProgramAccountType> programAccount;
    /**
     * Program Owner information.
     * 
     */
    @XmlElement(name = "ProgramOwner", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected ProgramOwnerType programOwner;
    /**
     * Program type code (e.g. Discount Program, Incentive Program, Pre-paid Program).
     * 
     */
    @XmlElement(name = "TypeCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
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
     * a written or spoken agreement, especially one concerning employment, sales, or tenancy, that is intended to be enforceable by law
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
     * Program Owner information.
     * 
     * @return
     *     possible object is
     *     {@link ProgramOwnerType }
     *     
     */
    public ProgramOwnerType getProgramOwner() {
        return programOwner;
    }

    /**
     * Sets the value of the programOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramOwnerType }
     *     
     * @see #getProgramOwner()
     */
    public void setProgramOwner(ProgramOwnerType value) {
        this.programOwner = value;
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
