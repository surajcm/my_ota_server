
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data returned from the Directory Server/ACS containing the PAReq and the ACS URL that enable the cardholder to authenticate. Applicable for 3D-Secure.
 * 
 * <p>Java class for SecurePaymentAuthenticationInstructionsVersion2Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SecurePaymentAuthenticationInstructionsVersion2Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcquirerBankIdentificationNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NumberType" minOccurs="0"/>
 *         <element name="ChallengeMandateInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType"/>
 *         <element name="RequestorURI" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}URI_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentAuthenticationInstructionsVersion2Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "acquirerBankIdentificationNumber",
    "challengeMandateInd",
    "requestorURI"
})
public class SecurePaymentAuthenticationInstructionsVersion2Type {

    /**
     * BIN of acquirer.
     * 
     */
    @XmlElement(name = "AcquirerBankIdentificationNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal acquirerBankIdentificationNumber;
    /**
     * Airline specify whether or not Seller should challenge 3D-Secure authentication.
     * 
     */
    @XmlElement(name = "ChallengeMandateInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected boolean challengeMandateInd;
    /**
     * Fully qualified URL of 3DS Requestor web site or customer care site.
     * 
     */
    @XmlElement(name = "RequestorURI", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlSchemaType(name = "anyURI")
    protected String requestorURI;

    /**
     * BIN of acquirer.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquirerBankIdentificationNumber() {
        return acquirerBankIdentificationNumber;
    }

    /**
     * Sets the value of the acquirerBankIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAcquirerBankIdentificationNumber()
     */
    public void setAcquirerBankIdentificationNumber(BigDecimal value) {
        this.acquirerBankIdentificationNumber = value;
    }

    /**
     * Airline specify whether or not Seller should challenge 3D-Secure authentication.
     * 
     */
    public boolean isChallengeMandateInd() {
        return challengeMandateInd;
    }

    /**
     * Sets the value of the challengeMandateInd property.
     * 
     */
    public void setChallengeMandateInd(boolean value) {
        this.challengeMandateInd = value;
    }

    /**
     * Fully qualified URL of 3DS Requestor web site or customer care site.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorURI() {
        return requestorURI;
    }

    /**
     * Sets the value of the requestorURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequestorURI()
     */
    public void setRequestorURI(String value) {
        this.requestorURI = value;
    }

}
