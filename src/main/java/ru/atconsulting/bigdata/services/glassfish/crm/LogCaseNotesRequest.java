
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogCaseNotesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogCaseNotesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseNote" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logNoteActionType" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogCaseNotesRequest", propOrder = {
    "caseNote",
    "logNoteActionType"
})
public class LogCaseNotesRequest {

    @XmlElement(required = true)
    protected String caseNote;
    protected String logNoteActionType;

    /**
     * Gets the value of the caseNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNote() {
        return caseNote;
    }

    /**
     * Sets the value of the caseNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNote(String value) {
        this.caseNote = value;
    }

    /**
     * Gets the value of the logNoteActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogNoteActionType() {
        return logNoteActionType;
    }

    /**
     * Sets the value of the logNoteActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogNoteActionType(String value) {
        this.logNoteActionType = value;
    }

}
