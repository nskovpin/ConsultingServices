
package ru.atconsulting.bigdata.services.glassfish.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="severity" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="creditNoteNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="flexibleAttributes" type="{urn:gf-crmoperations:types}FlexibleAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalTTInfo" type="{urn:gf-crmoperations:types}ExternalTTInfo" minOccurs="0"/>
 *         &lt;element name="workflowInfo" type="{urn:gf-crmoperations:types}WorkflowInfo" minOccurs="0"/>
 *         &lt;element name="notificationInfo" type="{urn:gf-crmoperations:types}NotificationInfo" minOccurs="0"/>
 *         &lt;element name="caseTerritory" type="{urn:gf-crmoperations:types}SiteIdent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCaseRequest", propOrder = {
    "severity",
    "priority",
    "status",
    "creditNoteNumber",
    "flexibleAttributes",
    "externalTTInfo",
    "workflowInfo",
    "notificationInfo",
    "caseTerritory"
})
public class UpdateCaseRequest {

    protected String severity;
    protected String priority;
    protected String status;
    protected Long creditNoteNumber;
    protected List<FlexibleAttribute> flexibleAttributes;
    protected ExternalTTInfo externalTTInfo;
    protected WorkflowInfo workflowInfo;
    protected NotificationInfo notificationInfo;
    protected SiteIdent caseTerritory;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the creditNoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditNoteNumber() {
        return creditNoteNumber;
    }

    /**
     * Sets the value of the creditNoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditNoteNumber(Long value) {
        this.creditNoteNumber = value;
    }

    /**
     * Gets the value of the flexibleAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flexibleAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlexibleAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexibleAttribute }
     * 
     * 
     */
    public List<FlexibleAttribute> getFlexibleAttributes() {
        if (flexibleAttributes == null) {
            flexibleAttributes = new ArrayList<FlexibleAttribute>();
        }
        return this.flexibleAttributes;
    }

    /**
     * Gets the value of the externalTTInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalTTInfo }
     *     
     */
    public ExternalTTInfo getExternalTTInfo() {
        return externalTTInfo;
    }

    /**
     * Sets the value of the externalTTInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalTTInfo }
     *     
     */
    public void setExternalTTInfo(ExternalTTInfo value) {
        this.externalTTInfo = value;
    }

    /**
     * Gets the value of the workflowInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowInfo }
     *     
     */
    public WorkflowInfo getWorkflowInfo() {
        return workflowInfo;
    }

    /**
     * Sets the value of the workflowInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowInfo }
     *     
     */
    public void setWorkflowInfo(WorkflowInfo value) {
        this.workflowInfo = value;
    }

    /**
     * Gets the value of the notificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationInfo }
     *     
     */
    public NotificationInfo getNotificationInfo() {
        return notificationInfo;
    }

    /**
     * Sets the value of the notificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationInfo }
     *     
     */
    public void setNotificationInfo(NotificationInfo value) {
        this.notificationInfo = value;
    }

    /**
     * Gets the value of the caseTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link SiteIdent }
     *     
     */
    public SiteIdent getCaseTerritory() {
        return caseTerritory;
    }

    /**
     * Sets the value of the caseTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteIdent }
     *     
     */
    public void setCaseTerritory(SiteIdent value) {
        this.caseTerritory = value;
    }

}
