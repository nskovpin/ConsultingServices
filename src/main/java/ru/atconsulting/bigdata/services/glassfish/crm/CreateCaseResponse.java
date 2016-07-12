
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseId" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="caseObjid" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCaseResponse", propOrder = {
    "caseId",
    "caseObjid"
})
public class CreateCaseResponse {

    @XmlElement(required = true)
    protected String caseId;
    @XmlElement(required = true)
    protected String caseObjid;

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
     * Gets the value of the caseObjid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseObjid() {
        return caseObjid;
    }

    /**
     * Sets the value of the caseObjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseObjid(String value) {
        this.caseObjid = value;
    }

}
