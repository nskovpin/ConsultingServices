
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeadquartersInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeadquartersInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branch" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="headquartersMarketCode" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeadquartersInfo", propOrder = {
    "branch",
    "headquartersMarketCode"
})
public class HeadquartersInfo {

    @XmlElement(required = true)
    protected String branch;
    @XmlElement(required = true)
    protected String headquartersMarketCode;

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the headquartersMarketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadquartersMarketCode() {
        return headquartersMarketCode;
    }

    /**
     * Sets the value of the headquartersMarketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadquartersMarketCode(String value) {
        this.headquartersMarketCode = value;
    }

}
