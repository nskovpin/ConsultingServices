
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MnpInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MnpInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mnpApplicationID" type="{urn:gf-crmoperations:types}string30Nullable" minOccurs="0"/>
 *         &lt;element name="mnpClaimID" type="{urn:gf-crmoperations:types}string30Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MnpInfo", propOrder = {
    "mnpApplicationID",
    "mnpClaimID"
})
public class MnpInfo {

    protected String mnpApplicationID;
    protected String mnpClaimID;

    /**
     * Gets the value of the mnpApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnpApplicationID() {
        return mnpApplicationID;
    }

    /**
     * Sets the value of the mnpApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnpApplicationID(String value) {
        this.mnpApplicationID = value;
    }

    /**
     * Gets the value of the mnpClaimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnpClaimID() {
        return mnpClaimID;
    }

    /**
     * Sets the value of the mnpClaimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnpClaimID(String value) {
        this.mnpClaimID = value;
    }

}
