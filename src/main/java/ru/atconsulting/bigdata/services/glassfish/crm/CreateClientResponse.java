
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateClientResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateClientResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientID" type="{urn:gf-crmoperations:types}string40Nullable"/>
 *         &lt;element name="clientObjID" type="{urn:gf-crmoperations:types}string80Nullable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateClientResponse", propOrder = {
    "clientID",
    "clientObjID"
})
public class CreateClientResponse {

    @XmlElement(required = true)
    protected String clientID;
    @XmlElement(required = true)
    protected String clientObjID;

    /**
     * Gets the value of the clientID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Sets the value of the clientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Gets the value of the clientObjID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientObjID() {
        return clientObjID;
    }

    /**
     * Sets the value of the clientObjID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientObjID(String value) {
        this.clientObjID = value;
    }

}
