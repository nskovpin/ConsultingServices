
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workflowOperation" type="{urn:gf-crmoperations:types}WorkflowOperation" minOccurs="0"/>
 *         &lt;element name="workflowTarget" type="{urn:gf-crmoperations:types}string30Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowInfo", propOrder = {
    "workflowOperation",
    "workflowTarget"
})
public class WorkflowInfo {

    protected String workflowOperation;
    protected String workflowTarget;

    /**
     * Gets the value of the workflowOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowOperation() {
        return workflowOperation;
    }

    /**
     * Sets the value of the workflowOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowOperation(String value) {
        this.workflowOperation = value;
    }

    /**
     * Gets the value of the workflowTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowTarget() {
        return workflowTarget;
    }

    /**
     * Sets the value of the workflowTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowTarget(String value) {
        this.workflowTarget = value;
    }

}
