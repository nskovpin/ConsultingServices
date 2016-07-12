
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createCaseRequest" type="{urn:gf-crmoperations:types}CreateCaseRequest"/>
 *         &lt;element name="attachmentRequest" type="{urn:gf-crmoperations:types}AddAttachmentRequestContext" minOccurs="0"/>
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
@XmlType(name = "CreateCase", propOrder = {
    "createCaseRequest",
    "attachmentRequest",
    "activityInfo"
})
public class CreateCase {

    @XmlElement(required = true)
    protected CreateCaseRequest createCaseRequest;
    protected AddAttachmentRequestContext attachmentRequest;
    @XmlElement(required = true)
    protected ActivityInfo activityInfo;

    /**
     * Gets the value of the createCaseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCaseRequest }
     *     
     */
    public CreateCaseRequest getCreateCaseRequest() {
        return createCaseRequest;
    }

    /**
     * Sets the value of the createCaseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCaseRequest }
     *     
     */
    public void setCreateCaseRequest(CreateCaseRequest value) {
        this.createCaseRequest = value;
    }

    /**
     * Gets the value of the attachmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddAttachmentRequestContext }
     *     
     */
    public AddAttachmentRequestContext getAttachmentRequest() {
        return attachmentRequest;
    }

    /**
     * Sets the value of the attachmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddAttachmentRequestContext }
     *     
     */
    public void setAttachmentRequest(AddAttachmentRequestContext value) {
        this.attachmentRequest = value;
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
