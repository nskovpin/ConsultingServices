
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloseCaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloseCaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseId" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="caseResolution" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *         &lt;element name="caseResolutionNotes" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="caseStatus" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="responceToCustomer" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloseCaseRequest", propOrder = {
    "caseId",
    "caseResolution",
    "caseResolutionNotes",
    "caseStatus",
    "responceToCustomer"
})
public class CloseCaseRequest {

    @XmlElement(required = true)
    protected String caseId;
    protected String caseResolution;
    protected String caseResolutionNotes;
    protected String caseStatus;
    protected String responceToCustomer;

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the caseResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseResolution() {
        return caseResolution;
    }

    /**
     * Sets the value of the caseResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseResolution(String value) {
        this.caseResolution = value;
    }

    /**
     * Gets the value of the caseResolutionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseResolutionNotes() {
        return caseResolutionNotes;
    }

    /**
     * Sets the value of the caseResolutionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseResolutionNotes(String value) {
        this.caseResolutionNotes = value;
    }

    /**
     * Gets the value of the caseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * Sets the value of the caseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatus(String value) {
        this.caseStatus = value;
    }

    /**
     * Gets the value of the responceToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponceToCustomer() {
        return responceToCustomer;
    }

    /**
     * Sets the value of the responceToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponceToCustomer(String value) {
        this.responceToCustomer = value;
    }

}
