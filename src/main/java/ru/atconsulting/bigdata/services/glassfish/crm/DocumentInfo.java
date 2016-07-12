
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentType" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="documentSeries" type="{urn:gf-crmoperations:types}string255Nullable"/>
 *         &lt;element name="documentID" type="{urn:gf-crmoperations:types}string50Nullable" minOccurs="0"/>
 *         &lt;element name="documentIssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="documentIssuerName" type="{urn:gf-crmoperations:types}string255Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentInfo", propOrder = {
    "documentType",
    "documentSeries",
    "documentID",
    "documentIssueDate",
    "documentIssuerName"
})
public class DocumentInfo {

    @XmlElement(required = true)
    protected String documentType;
    @XmlElement(required = true)
    protected String documentSeries;
    protected String documentID;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentIssueDate;
    protected String documentIssuerName;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the documentIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentIssueDate() {
        return documentIssueDate;
    }

    /**
     * Sets the value of the documentIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentIssueDate(XMLGregorianCalendar value) {
        this.documentIssueDate = value;
    }

    /**
     * Gets the value of the documentIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentIssuerName() {
        return documentIssuerName;
    }

    /**
     * Sets the value of the documentIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentIssuerName(String value) {
        this.documentIssuerName = value;
    }

}
