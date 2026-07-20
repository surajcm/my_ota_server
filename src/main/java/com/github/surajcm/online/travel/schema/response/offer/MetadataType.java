
package com.github.surajcm.online.travel.schema.response.offer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Message wide metadata information.
 * 
 * <p>Java class for MetadataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MetadataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CodesetMetadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}CodesetMetadataType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FieldMetadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}FieldMetadataType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "codesetMetadata",
    "fieldMetadata"
})
public class MetadataType {

    /**
     * Pre-defined code set metadata.
     * 
     */
    @XmlElement(name = "CodesetMetadata", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<CodesetMetadataType> codesetMetadata;
    /**
     * Defines implementation specific fields which should be populated.
     * 
     */
    @XmlElement(name = "FieldMetadata", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected List<FieldMetadataType> fieldMetadata;

    /**
     * Pre-defined code set metadata.
     * 
     * Gets the value of the codesetMetadata property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codesetMetadata property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCodesetMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodesetMetadataType }
     * </p>
     * 
     * 
     * @return
     *     The value of the codesetMetadata property.
     */
    public List<CodesetMetadataType> getCodesetMetadata() {
        if (codesetMetadata == null) {
            codesetMetadata = new ArrayList<>();
        }
        return this.codesetMetadata;
    }

    /**
     * Defines implementation specific fields which should be populated.
     * 
     * Gets the value of the fieldMetadata property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMetadata property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFieldMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldMetadataType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fieldMetadata property.
     */
    public List<FieldMetadataType> getFieldMetadata() {
        if (fieldMetadata == null) {
            fieldMetadata = new ArrayList<>();
        }
        return this.fieldMetadata;
    }

}
