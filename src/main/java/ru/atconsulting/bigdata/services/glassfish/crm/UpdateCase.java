
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseId" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="updateCaseRequest" type="{urn:gf-crmoperations:types}UpdateCaseRequest" minOccurs="0"/>
 *         &lt;element name="logCaseNotesRequest" type="{urn:gf-crmoperations:types}LogCaseNotesRequest" minOccurs="0"/>
 *         &lt;element name="activityInfo" type="{urn:gf-crmoperations:types}ActivityInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCase", propOrder = {
    "caseId",
    "updateCaseRequest",
    "logCaseNotesRequest",
    "activityInfo"
})
public class UpdateCase {

    @XmlElement(required = true)
    protected String caseId;
    protected UpdateCaseRequest updateCaseRequest;
    protected LogCaseNotesRequest logCaseNotesRequest;
    @XmlElement(required = true)
    protected ActivityInfo activityInfo;

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
     * Gets the value of the updateCaseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCaseRequest }
     *     
     */
    public UpdateCaseRequest getUpdateCaseRequest() {
        return updateCaseRequest;
    }

    /**
     * Sets the value of the updateCaseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCaseRequest }
     *     
     */
    public void setUpdateCaseRequest(UpdateCaseRequest value) {
        this.updateCaseRequest = value;
    }

    /**
     * Gets the value of the logCaseNotesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LogCaseNotesRequest }
     *     
     */
    public LogCaseNotesRequest getLogCaseNotesRequest() {
        return logCaseNotesRequest;
    }

    /**
     * Sets the value of the logCaseNotesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogCaseNotesRequest }
     *     
     */
    public void setLogCaseNotesRequest(LogCaseNotesRequest value) {
        this.logCaseNotesRequest = value;
    }

    /**
     * Gets the value of the activityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInfo }
     *     
     */
    public ActivityInfo getActivityInfo() {
        return activityInfo;
    }

    /**
     * Sets the value of the activityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInfo }
     *     
     */
    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }

}
