
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createClientRequest" type="{urn:gf-crmoperations:types}CreateClientRequest"/>
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
@XmlType(name = "CreateClient", propOrder = {
    "createClientRequest",
    "activityInfo"
})
public class CreateClient {

    @XmlElement(required = true)
    protected CreateClientRequest createClientRequest;
    @XmlElement(required = true)
    protected ActivityInfo activityInfo;

    /**
     * Gets the value of the createClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateClientRequest }
     *     
     */
    public CreateClientRequest getCreateClientRequest() {
        return createClientRequest;
    }

    /**
     * Sets the value of the createClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateClientRequest }
     *     
     */
    public void setCreateClientRequest(CreateClientRequest value) {
        this.createClientRequest = value;
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
