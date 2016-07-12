
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyName" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="trademark" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="shortName" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="characterization" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="organisationForm" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="okved" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInfo", propOrder = {
    "companyName",
    "trademark",
    "shortName",
    "category",
    "characterization",
    "organisationForm",
    "okved"
})
public class CompanyInfo {

    protected String companyName;
    protected String trademark;
    protected String shortName;
    protected String category;
    protected String characterization;
    protected String organisationForm;
    protected String okved;

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the trademark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * Sets the value of the trademark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrademark(String value) {
        this.trademark = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the characterization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterization() {
        return characterization;
    }

    /**
     * Sets the value of the characterization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterization(String value) {
        this.characterization = value;
    }

    /**
     * Gets the value of the organisationForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationForm() {
        return organisationForm;
    }

    /**
     * Sets the value of the organisationForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationForm(String value) {
        this.organisationForm = value;
    }

    /**
     * Gets the value of the okved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkved() {
        return okved;
    }

    /**
     * Sets the value of the okved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkved(String value) {
        this.okved = value;
    }

}
