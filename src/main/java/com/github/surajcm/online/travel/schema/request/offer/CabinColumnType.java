
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
 * Column within a Cabin used to identify Seats and Cabin Components within a Row.
 * 
 * <p>Java class for CabinColumnType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CabinColumnType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatCharacteristicCodeType" maxOccurs="99" minOccurs="0"/>
 *         <element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}ID_Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinColumnType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ", propOrder = {
    "characteristicCode",
    "columnID"
})
public class CabinColumnType {

    /**
     * Column characteristic/property code (e.g. A - Aisle, W - Window, etc.).
     * 
     */
    @XmlElement(name = "CharacteristicCode", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> characteristicCode;
    /**
     * Identifier of the column (e.g. A, B, C, etc.).
     * 
     */
    @XmlElement(name = "ColumnID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String columnID;

    /**
     * Column characteristic/property code (e.g. A - Aisle, W - Window, etc.).
     * 
     * Gets the value of the characteristicCode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicCode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCharacteristicCode().add(newItem);
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
     *     The value of the characteristicCode property.
     */
    public List<String> getCharacteristicCode() {
        if (characteristicCode == null) {
            characteristicCode = new ArrayList<>();
        }
        return this.characteristicCode;
    }

    /**
     * Identifier of the column (e.g. A, B, C, etc.).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnID() {
        return columnID;
    }

    /**
     * Sets the value of the columnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getColumnID()
     */
    public void setColumnID(String value) {
        this.columnID = value;
    }

}
