
package com.github.surajcm.online.travel.schema.response.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketingMessageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MarketingMessageType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}DescType"/>
 *         <element name="GeneralAssociation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}GeneralAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketingMessageType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "desc",
    "generalAssociation"
})
public class MarketingMessageType {

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     */
    @XmlElement(name = "Desc", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", required = true)
    protected DescType desc;
    @XmlElement(name = "GeneralAssociation", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<GeneralAssociationType> generalAssociation;

    /**
     * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     * @see #getDesc()
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the generalAssociation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalAssociation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeneralAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralAssociationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the generalAssociation property.
     */
    public List<GeneralAssociationType> getGeneralAssociation() {
        if (generalAssociation == null) {
            generalAssociation = new ArrayList<>();
        }
        return this.generalAssociation;
    }

}
