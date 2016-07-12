
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CloseCase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CloseCase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="closeCaseRequest" type="{urn:gf-crmoperations:types}CloseCaseRequest"/>
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
@XmlType(name = "CloseCase", propOrder = {
    "closeCaseRequest",
    "activityInfo"
})
public class CloseCase {

    @XmlElement(required = true)
    protected CloseCaseRequest closeCaseRequest;
    @XmlElement(required = true)
    protected ActivityInfo activityInfo;

    /**
     * Gets the value of the closeCaseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CloseCaseRequest }
     *     
     */
    public CloseCaseRequest getCloseCaseRequest() {
        return closeCaseRequest;
    }

    /**
     * Sets the value of the closeCaseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseCaseRequest }
     *     
     */
    public void setCloseCaseRequest(CloseCaseRequest value) {
        this.closeCaseRequest = value;
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
