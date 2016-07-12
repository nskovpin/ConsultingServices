
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIdent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objid" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *         &lt;element name="serviceID" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="billingID" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIdent", propOrder = {
    "objid",
    "serviceID",
    "billingID"
})
public class ServiceIdent {

    protected String objid;
    protected String serviceID;
    protected String billingID;

    /**
     * Gets the value of the objid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjid() {
        return objid;
    }

    /**
     * Sets the value of the objid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjid(String value) {
        this.objid = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the billingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingID() {
        return billingID;
    }

    /**
     * Sets the value of the billingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingID(String value) {
        this.billingID = value;
    }

}
