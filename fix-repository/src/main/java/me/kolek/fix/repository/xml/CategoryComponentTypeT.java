//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.25 at 07:33:34 PM EDT 
//


package me.kolek.fix.repository.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryComponentType_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoryComponentType_t"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Field"/&gt;
 *     &lt;enumeration value="Message"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CategoryComponentType_t")
@XmlEnum
public enum CategoryComponentTypeT {

    @XmlEnumValue("Field")
    FIELD("Field"),
    @XmlEnumValue("Message")
    MESSAGE("Message");
    private final String value;

    CategoryComponentTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryComponentTypeT fromValue(String v) {
        for (CategoryComponentTypeT c: CategoryComponentTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
