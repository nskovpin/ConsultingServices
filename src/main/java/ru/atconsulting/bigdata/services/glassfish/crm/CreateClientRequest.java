
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateClientRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateClientRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientType" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;choice>
 *           &lt;element name="inn" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *           &lt;element name="headquartersInfo" type="{urn:gf-crmoperations:types}HeadquartersInfo"/>
 *         &lt;/choice>
 *         &lt;element name="companyInfo" type="{urn:gf-crmoperations:types}CompanyInfo" minOccurs="0"/>
 *         &lt;element name="primaryContactInfo" type="{urn:gf-crmoperations:types}PrimaryContactInfo" minOccurs="0"/>
 *         &lt;element name="infoSource" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="serviceManager" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *         &lt;element name="description" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateClientRequest", propOrder = {
    "clientType",
    "inn",
    "headquartersInfo",
    "companyInfo",
    "primaryContactInfo",
    "infoSource",
    "salesRep",
    "serviceManager",
    "description"
})
public class CreateClientRequest {

    @XmlElement(required = true)
    protected String clientType;
    protected String inn;
    protected HeadquartersInfo headquartersInfo;
    protected CompanyInfo companyInfo;
    protected PrimaryContactInfo primaryContactInfo;
    protected String infoSource;
    protected String salesRep;
    protected String serviceManager;
    protected String description;

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the headquartersInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HeadquartersInfo }
     *     
     */
    public HeadquartersInfo getHeadquartersInfo() {
        return headquartersInfo;
    }

    /**
     * Sets the value of the headquartersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadquartersInfo }
     *     
     */
    public void setHeadquartersInfo(HeadquartersInfo value) {
        this.headquartersInfo = value;
    }

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfo }
     *     
     */
    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfo }
     *     
     */
    public void setCompanyInfo(CompanyInfo value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the primaryContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryContactInfo }
     *     
     */
    public PrimaryContactInfo getPrimaryContactInfo() {
        return primaryContactInfo;
    }

    /**
     * Sets the value of the primaryContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryContactInfo }
     *     
     */
    public void setPrimaryContactInfo(PrimaryContactInfo value) {
        this.primaryContactInfo = value;
    }

    /**
     * Gets the value of the infoSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoSource() {
        return infoSource;
    }

    /**
     * Sets the value of the infoSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoSource(String value) {
        this.infoSource = value;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRep() {
        return salesRep;
    }

    /**
     * Sets the value of the salesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRep(String value) {
        this.salesRep = value;
    }

    /**
     * Gets the value of the serviceManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceManager() {
        return serviceManager;
    }

    /**
     * Sets the value of the serviceManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceManager(String value) {
        this.serviceManager = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
