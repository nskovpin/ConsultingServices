
package ru.atconsulting.bigdata.services.glassfish.crm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchClientRequest" type="{urn:gf-crmoperations:types}SearchClientRequest"/>
 *         &lt;element name="activityInfo" type="{urn:gf-crmoperations:types}ActivityInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchClient", propOrder = {
    "searchClientRequest",
    "activityInfo"
})
public class SearchClient {

    @XmlElement(required = true)
    protected SearchClientRequest searchClientRequest;
    @XmlElement(required = true)
    protected ActivityInfo activityInfo;

    /**
     * Gets the value of the searchClientRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SearchClientRequest }
     *     
     */
    public SearchClientRequest getSearchClientRequest() {
        return searchClientRequest;
    }

    /**
     * Sets the value of the searchClientRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchClientRequest }
     *     
     */
    public void setSearchClientRequest(SearchClientRequest value) {
        this.searchClientRequest = value;
    }

    /**
     * Gets the value of the activityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInfo }
     *     
     */
    public ActivityInfo getActivityInfo() {
        return activityInfo;
    }

    /**
     * Sets the value of the activityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInfo }
     *     
     */
    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }

}
