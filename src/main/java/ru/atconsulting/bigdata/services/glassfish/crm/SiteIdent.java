
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteIdent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mrkCode" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *         &lt;element name="siteID" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteIdent", propOrder = {
    "mrkCode",
    "siteID",
    "externalId"
})
public class SiteIdent {

    protected String mrkCode;
    protected String siteID;
    protected String externalId;

    /**
     * Gets the value of the mrkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrkCode() {
        return mrkCode;
    }

    /**
     * Sets the value of the mrkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrkCode(String value) {
        this.mrkCode = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteID(String value) {
        this.siteID = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
