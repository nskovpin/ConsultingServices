
package ru.atconsulting.bigdata.services.glassfish.crm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateInteractionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateInteractionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionTitle" type="{urn:gf-crmoperations:types}string765Nullable" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="type" type="{urn:gf-crmoperations:types}string40Nullable"/>
 *         &lt;element name="media" type="{urn:gf-crmoperations:types}string40Nullable"/>
 *         &lt;element name="reporterAccountIdent" type="{urn:gf-crmoperations:types}AccountIdent" minOccurs="0"/>
 *         &lt;element name="reporterServiceIdent" type="{urn:gf-crmoperations:types}ServiceIdent" minOccurs="0"/>
 *         &lt;element name="reporterFinAccountIdent" type="{urn:gf-crmoperations:types}FinAccountIdent" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{urn:gf-crmoperations:types}string30Nullable" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="topics" type="{urn:gf-crmoperations:types}TopicRequest" maxOccurs="unbounded"/>
 *         &lt;element name="dealerFinAccountIdent" type="{urn:gf-crmoperations:types}FinAccountIdent" minOccurs="0"/>
 *         &lt;element name="interactionTerritory" type="{urn:gf-crmoperations:types}SiteIdent" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateInteractionRequest", propOrder = {
    "interactionTitle",
    "direction",
    "type",
    "media",
    "reporterAccountIdent",
    "reporterServiceIdent",
    "reporterFinAccountIdent",
    "sessionId",
    "notes",
    "topics",
    "dealerFinAccountIdent",
    "interactionTerritory",
    "startDate",
    "endDate"
})
public class CreateInteractionRequest {

    protected String interactionTitle;
    @XmlElement(required = true)
    protected BigInteger direction;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String media;
    protected AccountIdent reporterAccountIdent;
    protected ServiceIdent reporterServiceIdent;
    protected FinAccountIdent reporterFinAccountIdent;
    protected String sessionId;
    protected String notes;
    @XmlElement(required = true)
    protected List<TopicRequest> topics;
    protected FinAccountIdent dealerFinAccountIdent;
    protected SiteIdent interactionTerritory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the interactionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionTitle() {
        return interactionTitle;
    }

    /**
     * Sets the value of the interactionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionTitle(String value) {
        this.interactionTitle = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirection(BigInteger value) {
        this.direction = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedia(String value) {
        this.media = value;
    }

    /**
     * Gets the value of the reporterAccountIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdent }
     *     
     */
    public AccountIdent getReporterAccountIdent() {
        return reporterAccountIdent;
    }

    /**
     * Sets the value of the reporterAccountIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdent }
     *     
     */
    public void setReporterAccountIdent(AccountIdent value) {
        this.reporterAccountIdent = value;
    }

    /**
     * Gets the value of the reporterServiceIdent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdent }
     *     
     */
    public ServiceIdent getReporterServiceIdent() {
        return reporterServiceIdent;
    }

    /**
     * Sets the value of the reporterServiceIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdent }
     *     
     */
    public void setReporterServiceIdent(ServiceIdent value) {
        this.reporterServiceIdent = value;
    }

    /**
     * Gets the value of the reporterFinAccountIdent property.
     * 
     * @return
     *     possible object is
     *     {@link FinAccountIdent }
     *     
     */
    public FinAccountIdent getReporterFinAccountIdent() {
        return reporterFinAccountIdent;
    }

    /**
     * Sets the value of the reporterFinAccountIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinAccountIdent }
     *     
     */
    public void setReporterFinAccountIdent(FinAccountIdent value) {
        this.reporterFinAccountIdent = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the topics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopicRequest }
     * 
     * 
     */
    public List<TopicRequest> getTopics() {
        if (topics == null) {
            topics = new ArrayList<TopicRequest>();
        }
        return this.topics;
    }

    /**
     * Gets the value of the dealerFinAccountIdent property.
     * 
     * @return
     *     possible object is
     *     {@link FinAccountIdent }
     *     
     */
    public FinAccountIdent getDealerFinAccountIdent() {
        return dealerFinAccountIdent;
    }

    /**
     * Sets the value of the dealerFinAccountIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinAccountIdent }
     *     
     */
    public void setDealerFinAccountIdent(FinAccountIdent value) {
        this.dealerFinAccountIdent = value;
    }

    /**
     * Gets the value of the interactionTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link SiteIdent }
     *     
     */
    public SiteIdent getInteractionTerritory() {
        return interactionTerritory;
    }

    /**
     * Sets the value of the interactionTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteIdent }
     *     
     */
    public void setInteractionTerritory(SiteIdent value) {
        this.interactionTerritory = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
