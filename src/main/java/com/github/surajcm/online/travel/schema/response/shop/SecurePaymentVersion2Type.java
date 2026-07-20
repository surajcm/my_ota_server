
package com.github.surajcm.online.travel.schema.response.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * contains all information for the result of 3D-Secure authentication process.
 * 
 * <p>Java class for SecurePaymentVersion2Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SecurePaymentVersion2Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthenticationMerchantName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}NameType" minOccurs="0"/>
 *         <element name="AuthenticationValue" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ValueType" minOccurs="0"/>
 *         <element name="DirectoryServerTrxID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ID_Type" minOccurs="0"/>
 *         <element name="ElectronicCommerceInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IndType" minOccurs="0"/>
 *         <element name="ProgramProtocolText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="TrxStatusReasonText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType" minOccurs="0"/>
 *         <element name="TrxStatusText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}TextType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePaymentVersion2Type", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", propOrder = {
    "authenticationMerchantName",
    "authenticationValue",
    "directoryServerTrxID",
    "electronicCommerceInd",
    "programProtocolText",
    "trxStatusReasonText",
    "trxStatusText"
})
public class SecurePaymentVersion2Type {

    /**
     * Name of the merchant
     * 
     */
    @XmlElement(name = "AuthenticationMerchantName", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authenticationMerchantName;
    /**
     * Authentication value
     * 
     */
    @XmlElement(name = "AuthenticationValue", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected BigDecimal authenticationValue;
    /**
     * DS (Directory Server) transaction ID
     * 
     */
    @XmlElement(name = "DirectoryServerTrxID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String directoryServerTrxID;
    /**
     * ECI (electronic commerce indicator)
     * 
     */
    @XmlElement(name = "ElectronicCommerceInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected Boolean electronicCommerceInd;
    /**
     * Program Protocol
     * 
     */
    @XmlElement(name = "ProgramProtocolText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String programProtocolText;
    /**
     * outcome of authentication coming from the DS - see EMVCO documentation for list of possible values.
     * 
     */
    @XmlElement(name = "TrxStatusReasonText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS")
    protected String trxStatusReasonText;
    /**
     * outcome of authentication â€“ see EMVCO documentation
     * 
     */
    @XmlElement(name = "TrxStatusText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS", required = true)
    protected String trxStatusText;

    /**
     * Name of the merchant
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationMerchantName() {
        return authenticationMerchantName;
    }

    /**
     * Sets the value of the authenticationMerchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuthenticationMerchantName()
     */
    public void setAuthenticationMerchantName(String value) {
        this.authenticationMerchantName = value;
    }

    /**
     * Authentication value
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthenticationValue() {
        return authenticationValue;
    }

    /**
     * Sets the value of the authenticationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAuthenticationValue()
     */
    public void setAuthenticationValue(BigDecimal value) {
        this.authenticationValue = value;
    }

    /**
     * DS (Directory Server) transaction ID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectoryServerTrxID() {
        return directoryServerTrxID;
    }

    /**
     * Sets the value of the directoryServerTrxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDirectoryServerTrxID()
     */
    public void setDirectoryServerTrxID(String value) {
        this.directoryServerTrxID = value;
    }

    /**
     * ECI (electronic commerce indicator)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicCommerceInd() {
        return electronicCommerceInd;
    }

    /**
     * Sets the value of the electronicCommerceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isElectronicCommerceInd()
     */
    public void setElectronicCommerceInd(Boolean value) {
        this.electronicCommerceInd = value;
    }

    /**
     * Program Protocol
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramProtocolText() {
        return programProtocolText;
    }

    /**
     * Sets the value of the programProtocolText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramProtocolText()
     */
    public void setProgramProtocolText(String value) {
        this.programProtocolText = value;
    }

    /**
     * outcome of authentication coming from the DS - see EMVCO documentation for list of possible values.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxStatusReasonText() {
        return trxStatusReasonText;
    }

    /**
     * Sets the value of the trxStatusReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrxStatusReasonText()
     */
    public void setTrxStatusReasonText(String value) {
        this.trxStatusReasonText = value;
    }

    /**
     * outcome of authentication â€“ see EMVCO documentation
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxStatusText() {
        return trxStatusText;
    }

    /**
     * Sets the value of the trxStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrxStatusText()
     */
    public void setTrxStatusText(String value) {
        this.trxStatusText = value;
    }

}
