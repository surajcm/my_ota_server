
package com.github.surajcm.online.travel.schema.request.shop;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The IATA_PayloadStdAttributes defines the standard attributes that appear on the root element for all IATA payloads.
 * 
 * <p>Java class for IATA_PayloadStandardAttributesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IATA_PayloadStandardAttributesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AltLangID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="CorrelationID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="EchoTokenText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}TextType" minOccurs="0"/>
 *         <element name="PrimaryLangID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="RetransmissionInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}IndType" minOccurs="0"/>
 *         <element name="SeqNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *         <element name="Timestamp" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}DateTimeType" minOccurs="0"/>
 *         <element name="TrxID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ID_Type" minOccurs="0"/>
 *         <element name="TrxStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CodeType" minOccurs="0"/>
 *         <element name="VersionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_PayloadStandardAttributesType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "altLangID",
    "correlationID",
    "echoTokenText",
    "primaryLangID",
    "retransmissionInd",
    "seqNumber",
    "timestamp",
    "trxID",
    "trxStatusCode",
    "versionNumber"
})
public class IATAPayloadStandardAttributesType {

    /**
     * Identifies the alternate language for a customer or message. The human language is identified by ISO 639 codes.
     * 
     */
    @XmlElement(name = "AltLangID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String altLangID;
    /**
     * Allow end-to-end correlation of log messages with the corresponding Web service message throughout the processing of the Web service message.
     * 
     */
    @XmlElement(name = "CorrelationID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String correlationID;
    /**
     * A reference for additional message identification, assigned by the requesting host system. When a request message includes an echo token the corresponding response message MUST include an echo token with an identical value.
     * 
     */
    @XmlElement(name = "EchoTokenText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected String echoTokenText;
    /**
     * Identifes the primary language preference for the message. The human language is identified by ISO 639 codes.
     * 
     */
    @XmlElement(name = "PrimaryLangID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String primaryLangID;
    /**
     * When true, indicates the message is being re-sent after a failure. It is recommended that this attribute is used (i.e., set to true) only when a message is retransmitted.
     * 
     */
    @XmlElement(name = "RetransmissionInd", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected Boolean retransmissionInd;
    /**
     * Used to identify the sequence number of the transaction as assigned by the sending system; allows for an application to process messages in a certain order or to request a resynchronization of messages in the event that a system has been off-line and needs to retrieve messages that were missed.
     * 
     */
    @XmlElement(name = "SeqNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal seqNumber;
    /**
     * Indicates the creation date and time of the message in UTC.
     * 
     */
    @XmlElement(name = "Timestamp", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected DateTimeType timestamp;
    /**
     * A unique identifier to relate all messages within a transaction (e.g. this would be sent in all request and response messages that are part of an on-going transaction).
     * 
     */
    @XmlElement(name = "TrxID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trxID;
    /**
     * This indicates where this message falls within a sequence of messages.
     * 
     */
    @XmlElement(name = "TrxStatusCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trxStatusCode;
    /**
     * For all IATA versioned messages, the version of the message is indicated by a decimal value.
     * 
     */
    @XmlElement(name = "VersionNumber", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected BigDecimal versionNumber;

    /**
     * Identifies the alternate language for a customer or message. The human language is identified by ISO 639 codes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAltLangID()
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Allow end-to-end correlation of log messages with the corresponding Web service message throughout the processing of the Web service message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCorrelationID()
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * A reference for additional message identification, assigned by the requesting host system. When a request message includes an echo token the corresponding response message MUST include an echo token with an identical value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoTokenText() {
        return echoTokenText;
    }

    /**
     * Sets the value of the echoTokenText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEchoTokenText()
     */
    public void setEchoTokenText(String value) {
        this.echoTokenText = value;
    }

    /**
     * Identifes the primary language preference for the message. The human language is identified by ISO 639 codes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPrimaryLangID()
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * When true, indicates the message is being re-sent after a failure. It is recommended that this attribute is used (i.e., set to true) only when a message is retransmitted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetransmissionInd() {
        return retransmissionInd;
    }

    /**
     * Sets the value of the retransmissionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRetransmissionInd()
     */
    public void setRetransmissionInd(Boolean value) {
        this.retransmissionInd = value;
    }

    /**
     * Used to identify the sequence number of the transaction as assigned by the sending system; allows for an application to process messages in a certain order or to request a resynchronization of messages in the event that a system has been off-line and needs to retrieve messages that were missed.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSeqNumber()
     */
    public void setSeqNumber(BigDecimal value) {
        this.seqNumber = value;
    }

    /**
     * Indicates the creation date and time of the message in UTC.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     * @see #getTimestamp()
     */
    public void setTimestamp(DateTimeType value) {
        this.timestamp = value;
    }

    /**
     * A unique identifier to relate all messages within a transaction (e.g. this would be sent in all request and response messages that are part of an on-going transaction).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxID() {
        return trxID;
    }

    /**
     * Sets the value of the trxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrxID()
     */
    public void setTrxID(String value) {
        this.trxID = value;
    }

    /**
     * This indicates where this message falls within a sequence of messages.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxStatusCode() {
        return trxStatusCode;
    }

    /**
     * Sets the value of the trxStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTrxStatusCode()
     */
    public void setTrxStatusCode(String value) {
        this.trxStatusCode = value;
    }

    /**
     * For all IATA versioned messages, the version of the message is indicated by a decimal value.
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
