
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopicRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopicRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode1" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="reasonCode2" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="result" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="isPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicRequest", propOrder = {
    "reasonCode1",
    "reasonCode2",
    "result",
    "isPrimary"
})
public class TopicRequest {

    @XmlElement(required = true)
    protected String reasonCode1;
    @XmlElement(required = true)
    protected String reasonCode2;
    @XmlElement(required = true)
    protected String result;
    protected Boolean isPrimary;

    /**
     * Gets the value of the reasonCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode1() {
        return reasonCode1;
    }

    /**
     * Sets the value of the reasonCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode1(String value) {
        this.reasonCode1 = value;
    }

    /**
     * Gets the value of the reasonCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode2() {
        return reasonCode2;
    }

    /**
     * Sets the value of the reasonCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode2(String value) {
        this.reasonCode2 = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

}
