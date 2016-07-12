
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinAccountIdent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinAccountIdent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objid" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *         &lt;element name="crmFaID" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *         &lt;element name="internalFaID" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *         &lt;element name="externalFaID" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinAccountIdent", propOrder = {
    "objid",
    "crmFaID",
    "internalFaID",
    "externalFaID"
})
public class FinAccountIdent {

    protected String objid;
    protected String crmFaID;
    protected String internalFaID;
    protected String externalFaID;

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
     * Gets the value of the crmFaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrmFaID() {
        return crmFaID;
    }

    /**
     * Sets the value of the crmFaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrmFaID(String value) {
        this.crmFaID = value;
    }

    /**
     * Gets the value of the internalFaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalFaID() {
        return internalFaID;
    }

    /**
     * Sets the value of the internalFaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalFaID(String value) {
        this.internalFaID = value;
    }

    /**
     * Gets the value of the externalFaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalFaID() {
        return externalFaID;
    }

    /**
     * Sets the value of the externalFaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalFaID(String value) {
        this.externalFaID = value;
    }

}
