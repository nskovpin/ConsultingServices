
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalTTInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalTTInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replicateToExternalTT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalTTNumber" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="externalTTStatus" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="externalTTSysCode" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalTTInfo", propOrder = {
    "replicateToExternalTT",
    "externalTTNumber",
    "externalTTStatus",
    "externalTTSysCode"
})
public class ExternalTTInfo {

    protected Boolean replicateToExternalTT;
    protected String externalTTNumber;
    protected String externalTTStatus;
    @XmlElement(required = true)
    protected String externalTTSysCode;

    /**
     * Gets the value of the replicateToExternalTT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplicateToExternalTT() {
        return replicateToExternalTT;
    }

    /**
     * Sets the value of the replicateToExternalTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplicateToExternalTT(Boolean value) {
        this.replicateToExternalTT = value;
    }

    /**
     * Gets the value of the externalTTNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTTNumber() {
        return externalTTNumber;
    }

    /**
     * Sets the value of the externalTTNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTTNumber(String value) {
        this.externalTTNumber = value;
    }

    /**
     * Gets the value of the externalTTStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTTStatus() {
        return externalTTStatus;
    }

    /**
     * Sets the value of the externalTTStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTTStatus(String value) {
        this.externalTTStatus = value;
    }

    /**
     * Gets the value of the externalTTSysCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTTSysCode() {
        return externalTTSysCode;
    }

    /**
     * Sets the value of the externalTTSysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTTSysCode(String value) {
        this.externalTTSysCode = value;
    }

}
