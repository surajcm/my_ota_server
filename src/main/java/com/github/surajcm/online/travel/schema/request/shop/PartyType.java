
package com.github.surajcm.online.travel.schema.request.shop;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Message/ Transaction Party(s) information. Note that information about parties is intended for business use, it is not intended for transaction authentication and routing of the message.
 * 
 * <p>Java class for PartyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PartyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Participant" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}ParticipantType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Recipient" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}RecipientType" minOccurs="0"/>
 *         <element name="Sender" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}SenderType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", propOrder = {
    "participant",
    "recipient",
    "sender"
})
public class PartyType {

    /**
     * Information related to parties relevant to the contents of this message.
     * 
     */
    @XmlElement(name = "Participant", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected List<ParticipantType> participant;
    /**
     * Information related to the party receiving this message.
     * 
     */
    @XmlElement(name = "Recipient", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ")
    protected RecipientType recipient;
    /**
     * Information related to the party sending this message.
     * 
     */
    @XmlElement(name = "Sender", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ", required = true)
    protected SenderType sender;

    /**
     * Information related to parties relevant to the contents of this message.
     * 
     * Gets the value of the participant property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantType }
     * </p>
     * 
     * 
     * @return
     *     The value of the participant property.
     */
    public List<ParticipantType> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<>();
        }
        return this.participant;
    }

    /**
     * Information related to the party receiving this message.
     * 
     * @return
     *     possible object is
     *     {@link RecipientType }
     *     
     */
    public RecipientType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientType }
     *     
     * @see #getRecipient()
     */
    public void setRecipient(RecipientType value) {
        this.recipient = value;
    }

    /**
     * Information related to the party sending this message.
     * 
     * @return
     *     possible object is
     *     {@link SenderType }
     *     
     */
    public SenderType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderType }
     *     
     * @see #getSender()
     */
    public void setSender(SenderType value) {
        this.sender = value;
    }

}
