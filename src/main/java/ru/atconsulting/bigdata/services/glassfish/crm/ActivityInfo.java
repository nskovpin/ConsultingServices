
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActivityInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{urn:gf-crmoperations:types}string50Nullable" minOccurs="0"/>
 *         &lt;element name="sourceApplication" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="sourceChannel" type="{urn:gf-crmoperations:types}string40Nullable" minOccurs="0"/>
 *         &lt;element name="activityReason" type="{urn:gf-crmoperations:types}string50Nullable" minOccurs="0"/>
 *         &lt;element name="requestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="note" type="{urn:gf-crmoperations:types}string200Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInfo", propOrder = {
    "userName",
    "sourceApplication",
    "sourceChannel",
    "activityReason",
    "requestTime",
    "note"
})
public class ActivityInfo {

    protected String userName;
    protected String sourceApplication;
    protected String sourceChannel;
    protected String activityReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTime;
    protected String note;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the sourceApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceApplication() {
        return sourceApplication;
    }

    /**
     * Sets the value of the sourceApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceApplication(String value) {
        this.sourceApplication = value;
    }

    /**
     * Gets the value of the sourceChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceChannel() {
        return sourceChannel;
    }

    /**
     * Sets the value of the sourceChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceChannel(String value) {
        this.sourceChannel = value;
    }

    /**
     * Gets the value of the activityReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityReason() {
        return activityReason;
    }

    /**
     * Sets the value of the activityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityReason(String value) {
        this.activityReason = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTime(XMLGregorianCalendar value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
