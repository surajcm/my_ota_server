
package com.github.surajcm.online.travel.schema.response.offer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Electronic documents, images, and other files which accompany and support some information.
 * 
 * <p>Java class for MediaObjectType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MediaObjectType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BinaryObject" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}BinaryObjectType" minOccurs="0"/>
 *         <element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="FileSizeMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MeasureType" minOccurs="0"/>
 *         <element name="HeightMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MeasureType" minOccurs="0"/>
 *         <element name="HintText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="MediaID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}ID_Type" minOccurs="0"/>
 *         <element name="RenderingInstructionsText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="RenderingMethodText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="RenderingOutputFormatText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="RenderingOverviewText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}TextType" minOccurs="0"/>
 *         <element name="WidthMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS}MeasureType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaObjectType", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS", propOrder = {
    "binaryObject",
    "descText",
    "fileSizeMeasure",
    "heightMeasure",
    "hintText",
    "mediaID",
    "renderingInstructionsText",
    "renderingMethodText",
    "renderingOutputFormatText",
    "renderingOverviewText",
    "widthMeasure"
})
public class MediaObjectType {

    /**
     * Binary Object Information. Supplementary attributes include character set code, MIME code, encoding information, file name, format, and URI
     * 
     */
    @XmlElement(name = "BinaryObject", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected BinaryObjectType binaryObject;
    /**
     * Description of the referenced media.
     * 
     */
    @XmlElement(name = "DescText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String descText;
    /**
     * The size of the Attachment in kilobytes (KB). Example: 60
     * 
     */
    @XmlElement(name = "FileSizeMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MeasureType fileSizeMeasure;
    /**
     * Media (typically Image) height in specified units.
     * 
     */
    @XmlElement(name = "HeightMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MeasureType heightMeasure;
    /**
     * Media object tip which is typically used in a client GUI (a mouseover tip). Example: Envoy Class Seat
     * 
     */
    @XmlElement(name = "HintText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String hintText;
    /**
     * Uniquely Identifies a Media file within the context of one message.
     * 
     */
    @XmlElement(name = "MediaID", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mediaID;
    /**
     * Rendering Instruction Parameters. Notes: This is typically used for XSLT.
     * 
     */
    @XmlElement(name = "RenderingInstructionsText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String renderingInstructionsText;
    /**
     * Rendering Method name. E.g. Narrative, XSLT, etc.
     * 
     */
    @XmlElement(name = "RenderingMethodText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String renderingMethodText;
    /**
     * An identifier for a file format or content type of the rendered output.
     * 
     */
    @XmlElement(name = "RenderingOutputFormatText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String renderingOutputFormatText;
    /**
     * An overview of the rendering method or style.
     * 
     */
    @XmlElement(name = "RenderingOverviewText", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected String renderingOverviewText;
    /**
     * Media (typically Image) width in specified units.
     * 
     */
    @XmlElement(name = "WidthMeasure", namespace = "http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRS")
    protected MeasureType widthMeasure;

    /**
     * Binary Object Information. Supplementary attributes include character set code, MIME code, encoding information, file name, format, and URI
     * 
     * @return
     *     possible object is
     *     {@link BinaryObjectType }
     *     
     */
    public BinaryObjectType getBinaryObject() {
        return binaryObject;
    }

    /**
     * Sets the value of the binaryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObjectType }
     *     
     * @see #getBinaryObject()
     */
    public void setBinaryObject(BinaryObjectType value) {
        this.binaryObject = value;
    }

    /**
     * Description of the referenced media.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescText()
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * The size of the Attachment in kilobytes (KB). Example: 60
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getFileSizeMeasure() {
        return fileSizeMeasure;
    }

    /**
     * Sets the value of the fileSizeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getFileSizeMeasure()
     */
    public void setFileSizeMeasure(MeasureType value) {
        this.fileSizeMeasure = value;
    }

    /**
     * Media (typically Image) height in specified units.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getHeightMeasure()
     */
    public void setHeightMeasure(MeasureType value) {
        this.heightMeasure = value;
    }

    /**
     * Media object tip which is typically used in a client GUI (a mouseover tip). Example: Envoy Class Seat
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHintText() {
        return hintText;
    }

    /**
     * Sets the value of the hintText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHintText()
     */
    public void setHintText(String value) {
        this.hintText = value;
    }

    /**
     * Uniquely Identifies a Media file within the context of one message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaID() {
        return mediaID;
    }

    /**
     * Sets the value of the mediaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMediaID()
     */
    public void setMediaID(String value) {
        this.mediaID = value;
    }

    /**
     * Rendering Instruction Parameters. Notes: This is typically used for XSLT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingInstructionsText() {
        return renderingInstructionsText;
    }

    /**
     * Sets the value of the renderingInstructionsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRenderingInstructionsText()
     */
    public void setRenderingInstructionsText(String value) {
        this.renderingInstructionsText = value;
    }

    /**
     * Rendering Method name. E.g. Narrative, XSLT, etc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingMethodText() {
        return renderingMethodText;
    }

    /**
     * Sets the value of the renderingMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRenderingMethodText()
     */
    public void setRenderingMethodText(String value) {
        this.renderingMethodText = value;
    }

    /**
     * An identifier for a file format or content type of the rendered output.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingOutputFormatText() {
        return renderingOutputFormatText;
    }

    /**
     * Sets the value of the renderingOutputFormatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRenderingOutputFormatText()
     */
    public void setRenderingOutputFormatText(String value) {
        this.renderingOutputFormatText = value;
    }

    /**
     * An overview of the rendering method or style.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderingOverviewText() {
        return renderingOverviewText;
    }

    /**
     * Sets the value of the renderingOverviewText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRenderingOverviewText()
     */
    public void setRenderingOverviewText(String value) {
        this.renderingOverviewText = value;
    }

    /**
     * Media (typically Image) width in specified units.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Sets the value of the widthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     * @see #getWidthMeasure()
     */
    public void setWidthMeasure(MeasureType value) {
        this.widthMeasure = value;
    }

}
