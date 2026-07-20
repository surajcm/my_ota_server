
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
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
 * Message policy information, including PCI, PII information.
 * 
 * <p>Java class for PolicyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PolicyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         <element name="PolicyNodeInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PolicyNodeInfoType" maxOccurs="unbounded"/>
 *         <element name="PolicyTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="VersionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "desc",
    "ownerName",
    "policyNodeInfo",
    "policyTypeText",
    "versionNumber"
})
public class PolicyType {

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected List<DescType> desc;
    /**
     * Source Entity Name or Code (e.g. BA, WIDGETCO).
     * 
     */
    @XmlElement(name = "OwnerName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    /**
     * Policy data node detail, including an XPATH and associated Tag Name.
     * 
     */
    @XmlElement(name = "PolicyNodeInfo", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected List<PolicyNodeInfoType> policyNodeInfo;
    /**
     * Policy Type, examples: Policy Type. Examples: Privacy_PII, Payment_PCI, Credentialing
     * 
     */
    @XmlElement(name = "PolicyTypeText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String policyTypeText;
    /**
     * Policy version number. Example: 2.17
     * 
     */
    @XmlElement(name = "VersionNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal versionNumber;

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event .
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
     * Source Entity Name or Code (e.g. BA, WIDGETCO).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwnerName()
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Policy data node detail, including an XPATH and associated Tag Name.
     * 
     * Gets the value of the policyNodeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyNodeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPolicyNodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyNodeInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the policyNodeInfo property.
     */
    public List<PolicyNodeInfoType> getPolicyNodeInfo() {
        if (policyNodeInfo == null) {
            policyNodeInfo = new ArrayList<>();
        }
        return this.policyNodeInfo;
    }

    /**
     * Policy Type, examples: Policy Type. Examples: Privacy_PII, Payment_PCI, Credentialing
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyTypeText() {
        return policyTypeText;
    }

    /**
     * Sets the value of the policyTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPolicyTypeText()
     */
    public void setPolicyTypeText(String value) {
        this.policyTypeText = value;
    }

    /**
     * Policy version number. Example: 2.17
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVersionNumber()
     */
    public void setVersionNumber(BigDecimal value) {
        this.versionNumber = value;
    }

}
