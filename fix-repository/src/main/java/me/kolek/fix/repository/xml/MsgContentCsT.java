//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.25 at 07:33:34 PM EDT 
//


package me.kolek.fix.repository.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MsgContent_cs_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgContent_cs_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentID" type="{}MsgOrCompID_t"/&gt;
 *         &lt;element name="TagText" type="{}TagText_t"/&gt;
 *         &lt;element name="Indent" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Reqd" type="{}BOOL_t"/&gt;
 *         &lt;element name="Inlined" type="{}BOOL_t" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{}Description_t" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{}EntityLevelRevisionAttribGrp"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgContent_cs_t", propOrder = {
    "componentID",
    "tagText",
    "indent",
    "position",
    "reqd",
    "inlined",
    "description"
})
public class MsgContentCsT {

    @XmlElement(name = "ComponentID", required = true)
    protected String componentID;
    @XmlElement(name = "TagText", required = true)
    protected String tagText;
    @XmlElement(name = "Indent", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger indent;
    @XmlElement(name = "Position", required = true)
    protected BigDecimal position;
    @XmlElement(name = "Reqd")
    protected short reqd;
    @XmlElement(name = "Inlined")
    protected Short inlined;
    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "added")
    protected String added;
    @XmlAttribute(name = "addedEP")
    protected BigInteger addedEP;
    @XmlAttribute(name = "deprecated")
    protected String deprecated;
    @XmlAttribute(name = "deprecatedEP")
    protected BigInteger deprecatedEP;
    @XmlAttribute(name = "issue")
    protected String issue;
    @XmlAttribute(name = "updated")
    protected String updated;
    @XmlAttribute(name = "updatedEP")
    protected BigInteger updatedEP;

    /**
     * Gets the value of the componentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentID() {
        return componentID;
    }

    /**
     * Sets the value of the componentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentID(String value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the tagText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagText() {
        return tagText;
    }

    /**
     * Sets the value of the tagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagText(String value) {
        this.tagText = value;
    }

    /**
     * Gets the value of the indent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndent() {
        return indent;
    }

    /**
     * Sets the value of the indent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndent(BigInteger value) {
        this.indent = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPosition(BigDecimal value) {
        this.position = value;
    }

    /**
     * Gets the value of the reqd property.
     * 
     */
    public short getReqd() {
        return reqd;
    }

    /**
     * Sets the value of the reqd property.
     * 
     */
    public void setReqd(short value) {
        this.reqd = value;
    }

    /**
     * Gets the value of the inlined property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getInlined() {
        return inlined;
    }

    /**
     * Sets the value of the inlined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setInlined(Short value) {
        this.inlined = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the added property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdded() {
        return added;
    }

    /**
     * Sets the value of the added property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdded(String value) {
        this.added = value;
    }

    /**
     * Gets the value of the addedEP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddedEP() {
        return addedEP;
    }

    /**
     * Sets the value of the addedEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddedEP(BigInteger value) {
        this.addedEP = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeprecated() {
        return deprecated;
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeprecated(String value) {
        this.deprecated = value;
    }

    /**
     * Gets the value of the deprecatedEP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeprecatedEP() {
        return deprecatedEP;
    }

    /**
     * Sets the value of the deprecatedEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeprecatedEP(BigInteger value) {
        this.deprecatedEP = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedEP property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpdatedEP() {
        return updatedEP;
    }

    /**
     * Sets the value of the updatedEP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpdatedEP(BigInteger value) {
        this.updatedEP = value;
    }

}
