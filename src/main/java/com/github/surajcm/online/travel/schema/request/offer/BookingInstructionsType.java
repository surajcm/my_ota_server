
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
 * Optional service booking instructions to include SSR, OSI and upgrade Method.
 * 
 * <p>Java class for BookingInstructionsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BookingInstructionsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MethodText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" minOccurs="0"/>
 *         <element name="OtherServiceInfoText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SpecialService" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SpecialServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UpgradeMethodCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CodeType" minOccurs="0"/>
 *         <element name="UpgradeNewClassCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}CabinTypeCodeType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingInstructionsType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "methodText",
    "otherServiceInfoText",
    "specialService",
    "upgradeMethodCode",
    "upgradeNewClassCode"
})
public class BookingInstructionsType {

    /**
     * PNR booking method. Example: AE (BY SSR - SPECIAL SERVICE REQUEST)  For maximum interoperability, refer to IATA PADIS Code List for data element 9750. Select a code value or enter a value that is bilaterally agreed upon between trading partners.
     * 
     */
    @XmlElement(name = "MethodText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected String methodText;
    /**
     * Other service information (OSI) text. Example: PAX VIP MEMBER OF PARLIAMENT
     * 
     */
    @XmlElement(name = "OtherServiceInfoText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<String> otherServiceInfoText;
    /**
     * Special service information
     * 
     */
    @XmlElement(name = "SpecialService", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    protected List<SpecialServiceType> specialService;
    /**
     * Upgrade method. Example: AE (BY SSR - SPECIAL SERVICE REQUEST)  For maximum interoperability, refer to IATA PADIS Code List for data element 9750. Select a code value or enter a value that is bilaterally agreed upon between trading partners.
     * 
     */
    @XmlElement(name = "UpgradeMethodCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String upgradeMethodCode;
    /**
     * New Cabin Type Code related to the Upgrade Method. As defined by PADIS codeset (e.g. 1, 2, 3, etc.)
     * 
     */
    @XmlElement(name = "UpgradeNewClassCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String upgradeNewClassCode;

    /**
     * PNR booking method. Example: AE (BY SSR - SPECIAL SERVICE REQUEST)  For maximum interoperability, refer to IATA PADIS Code List for data element 9750. Select a code value or enter a value that is bilaterally agreed upon between trading partners.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodText() {
        return methodText;
    }

    /**
     * Sets the value of the methodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMethodText()
     */
    public void setMethodText(String value) {
        this.methodText = value;
    }

    /**
     * Other service information (OSI) text. Example: PAX VIP MEMBER OF PARLIAMENT
     * 
     * Gets the value of the otherServiceInfoText property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherServiceInfoText property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherServiceInfoText().add(newItem);
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
     *     The value of the otherServiceInfoText property.
     */
    public List<String> getOtherServiceInfoText() {
        if (otherServiceInfoText == null) {
            otherServiceInfoText = new ArrayList<>();
        }
        return this.otherServiceInfoText;
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
     * Upgrade method. Example: AE (BY SSR - SPECIAL SERVICE REQUEST)  For maximum interoperability, refer to IATA PADIS Code List for data element 9750. Select a code value or enter a value that is bilaterally agreed upon between trading partners.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeMethodCode() {
        return upgradeMethodCode;
    }

    /**
     * Sets the value of the upgradeMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUpgradeMethodCode()
     */
    public void setUpgradeMethodCode(String value) {
        this.upgradeMethodCode = value;
    }

    /**
     * New Cabin Type Code related to the Upgrade Method. As defined by PADIS codeset (e.g. 1, 2, 3, etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeNewClassCode() {
        return upgradeNewClassCode;
    }

    /**
     * Sets the value of the upgradeNewClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUpgradeNewClassCode()
     */
    public void setUpgradeNewClassCode(String value) {
        this.upgradeNewClassCode = value;
    }

}
