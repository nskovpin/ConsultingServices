
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="notificationEmail" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *         &lt;element name="notificationPhone" type="{urn:gf-crmoperations:types}string80Nullable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationInfo", propOrder = {
    "notificationIndicator",
    "notificationEmail",
    "notificationPhone"
})
public class NotificationInfo {

    protected boolean notificationIndicator;
    protected String notificationEmail;
    protected String notificationPhone;

    /**
     * Gets the value of the notificationIndicator property.
     * 
     */
    public boolean isNotificationIndicator() {
        return notificationIndicator;
    }

    /**
     * Sets the value of the notificationIndicator property.
     * 
     */
    public void setNotificationIndicator(boolean value) {
        this.notificationIndicator = value;
    }

    /**
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the notificationPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationPhone() {
        return notificationPhone;
    }

    /**
     * Sets the value of the notificationPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationPhone(String value) {
        this.notificationPhone = value;
    }

}
