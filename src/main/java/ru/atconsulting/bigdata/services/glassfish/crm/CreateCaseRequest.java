
package ru.atconsulting.bigdata.services.glassfish.crm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="reporterContactIdent" type="{urn:gf-crmoperations:types}ContactIdent" minOccurs="0"/>
 *           &lt;element name="reporterAccountIdent" type="{urn:gf-crmoperations:types}AccountIdent" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="reporterServiceIdent" type="{urn:gf-crmoperations:types}ServiceIdent" minOccurs="0"/>
 *         &lt;element name="reporterFinAccountIdent" type="{urn:gf-crmoperations:types}FinAccountIdent" minOccurs="0"/>
 *         &lt;element name="reporterScalaIdent" type="{urn:gf-crmoperations:types}string50Nullable" minOccurs="0"/>
 *         &lt;element name="flexibleAttributes" type="{urn:gf-crmoperations:types}FlexibleAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalTTInfo" type="{urn:gf-crmoperations:types}ExternalTTInfo" minOccurs="0"/>
 *         &lt;element name="workflowInfo" type="{urn:gf-crmoperations:types}WorkflowInfo" minOccurs="0"/>
 *         &lt;element name="notificationInfo" type="{urn:gf-crmoperations:types}NotificationInfo" minOccurs="0"/>
 *         &lt;element name="mnpInfo" type="{urn:gf-crmoperations:types}MnpInfo" minOccurs="0"/>
 *         &lt;element name="caseTitle" type="{urn:gf-crmoperations:types}string80Nullable"/>
 *         &lt;element name="caseTypeLevel1" type="{urn:gf-crmoperations:types}string40Nullable"/>
 *         &lt;element name="caseTypeLevel2" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="caseTypeLevel3" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="severity" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="priority" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="parentChild" type="{urn:gf-crmoperations:types}ParentChild" minOccurs="0"/>
 *         &lt;element name="parentCaseID" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="phoneNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactName" type="{urn:gf-crmoperations:types}string120Nullable" minOccurs="0"/>
 *         &lt;element name="address" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
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
@XmlType(name = "CreateCaseRequest", propOrder = {
    "reporterContactIdent",
    "reporterAccountIdent",
    "reporterServiceIdent",
    "reporterFinAccountIdent",
    "reporterScalaIdent",
    "flexibleAttributes",
    "externalTTInfo",
    "workflowInfo",
    "notificationInfo",
    "mnpInfo",
    "caseTitle",
    "caseTypeLevel1",
    "caseTypeLevel2",
    "caseTypeLevel3",
    "severity",
    "priority",
    "status",
    "parentChild",
    "parentCaseID",
    "phoneNote",
    "caseNote",
    "contactName",
    "address",
    "caseTerritory"
})
public class CreateCaseRequest {

    protected ContactIdent reporterContactIdent;
    protected AccountIdent reporterAccountIdent;
    protected ServiceIdent reporterServiceIdent;
    protected FinAccountIdent reporterFinAccountIdent;
    protected String reporterScalaIdent;
    protected List<FlexibleAttribute> flexibleAttributes;
    protected ExternalTTInfo externalTTInfo;
    protected WorkflowInfo workflowInfo;
    protected NotificationInfo notificationInfo;
    protected MnpInfo mnpInfo;
    @XmlElement(required = true)
    protected String caseTitle;
    @XmlElement(required = true)
    protected String caseTypeLevel1;
    protected String caseTypeLevel2;
    protected String caseTypeLevel3;
    protected String severity;
    protected String priority;
    protected String status;
    protected String parentChild;
    protected String parentCaseID;
    protected String phoneNote;
    protected String caseNote;
    protected String contactName;
    protected String address;
    protected SiteIdent caseTerritory;

    /**
     * Gets the value of the reporterContactIdent property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdent }
     *     
     */
    public ContactIdent getReporterContactIdent() {
        return reporterContactIdent;
    }

    /**
     * Sets the value of the reporterContactIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdent }
     *     
     */
    public void setReporterContactIdent(ContactIdent value) {
        this.reporterContactIdent = value;
    }

    /**
     * Gets the value of the reporterAccountIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdent }
     *     
     */
    public AccountIdent getReporterAccountIdent() {
        return reporterAccountIdent;
    }

    /**
     * Sets the value of the reporterAccountIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdent }
     *     
     */
    public void setReporterAccountIdent(AccountIdent value) {
        this.reporterAccountIdent = value;
    }

    /**
     * Gets the value of the reporterServiceIdent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdent }
     *     
     */
    public ServiceIdent getReporterServiceIdent() {
        return reporterServiceIdent;
    }

    /**
     * Sets the value of the reporterServiceIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdent }
     *     
     */
    public void setReporterServiceIdent(ServiceIdent value) {
        this.reporterServiceIdent = value;
    }

    /**
     * Gets the value of the reporterFinAccountIdent property.
     * 
     * @return
     *     possible object is
     *     {@link FinAccountIdent }
     *     
     */
    public FinAccountIdent getReporterFinAccountIdent() {
        return reporterFinAccountIdent;
    }

    /**
     * Sets the value of the reporterFinAccountIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinAccountIdent }
     *     
     */
    public void setReporterFinAccountIdent(FinAccountIdent value) {
        this.reporterFinAccountIdent = value;
    }

    /**
     * Gets the value of the reporterScalaIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReporterScalaIdent() {
        return reporterScalaIdent;
    }

    /**
     * Sets the value of the reporterScalaIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReporterScalaIdent(String value) {
        this.reporterScalaIdent = value;
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
     * Gets the value of the mnpInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MnpInfo }
     *     
     */
    public MnpInfo getMnpInfo() {
        return mnpInfo;
    }

    /**
     * Sets the value of the mnpInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MnpInfo }
     *     
     */
    public void setMnpInfo(MnpInfo value) {
        this.mnpInfo = value;
    }

    /**
     * Gets the value of the caseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseTitle() {
        return caseTitle;
    }

    /**
     * Sets the value of the caseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseTitle(String value) {
        this.caseTitle = value;
    }

    /**
     * Gets the value of the caseTypeLevel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseTypeLevel1() {
        return caseTypeLevel1;
    }

    /**
     * Sets the value of the caseTypeLevel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseTypeLevel1(String value) {
        this.caseTypeLevel1 = value;
    }

    /**
     * Gets the value of the caseTypeLevel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseTypeLevel2() {
        return caseTypeLevel2;
    }

    /**
     * Sets the value of the caseTypeLevel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseTypeLevel2(String value) {
        this.caseTypeLevel2 = value;
    }

    /**
     * Gets the value of the caseTypeLevel3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseTypeLevel3() {
        return caseTypeLevel3;
    }

    /**
     * Sets the value of the caseTypeLevel3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseTypeLevel3(String value) {
        this.caseTypeLevel3 = value;
    }

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
     * Gets the value of the parentChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentChild() {
        return parentChild;
    }

    /**
     * Sets the value of the parentChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentChild(String value) {
        this.parentChild = value;
    }

    /**
     * Gets the value of the parentCaseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCaseID() {
        return parentCaseID;
    }

    /**
     * Sets the value of the parentCaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCaseID(String value) {
        this.parentCaseID = value;
    }

    /**
     * Gets the value of the phoneNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNote() {
        return phoneNote;
    }

    /**
     * Sets the value of the phoneNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNote(String value) {
        this.phoneNote = value;
    }

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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
