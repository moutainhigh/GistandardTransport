
package com.gistandard.transport.sms.webservice.smsService;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Requester" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="Addresses" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequestedAccuracy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Frequency" type="{http://www.csapi.org/schema/common/v2_0}TimeMetric"/&gt;
 *         &lt;element name="Duration" type="{http://www.csapi.org/schema/common/v2_0}TimeMetric"/&gt;
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceType" type="{http://www.csapi.org/schema/location}ServiceType"/&gt;
 *         &lt;element name="Crs" type="{http://www.csapi.org/schema/location}CoordinateReferenceSystem"/&gt;
 *         &lt;element name="locType" type="{http://www.csapi.org/schema/location}LocType"/&gt;
 *         &lt;element name="prio" type="{http://www.csapi.org/schema/location}Priority"/&gt;
 *         &lt;element name="eventNotification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requester",
    "addresses",
    "requestedAccuracy",
    "frequency",
    "duration",
    "applicationId",
    "serviceType",
    "crs",
    "locType",
    "prio",
    "eventNotification"
})
@XmlRootElement(name = "startPeriodicNotificationRequest", namespace = "http://www.csapi.org/schema/location")
public class StartPeriodicNotificationRequest {

    @XmlElement(name = "Requester", required = true, nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String requester;
    @XmlElement(name = "Addresses", required = true, nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> addresses;
    @XmlElement(name = "RequestedAccuracy")
    protected int requestedAccuracy;
    @XmlElement(name = "Frequency", required = true, nillable = true)
    protected TimeMetric frequency;
    @XmlElement(name = "Duration", required = true, nillable = true)
    protected TimeMetric duration;
    @XmlElement(name = "ApplicationId", required = true, nillable = true)
    protected String applicationId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    @XmlElement(name = "Crs", required = true, nillable = true)
    protected CoordinateReferenceSystem crs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocType locType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Priority prio;
    @XmlElement(required = true)
    protected String eventNotification;

    /**
     * 获取requester属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester() {
        return requester;
    }

    /**
     * 设置requester属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester(String value) {
        this.requester = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<String>();
        }
        return this.addresses;
    }

    /**
     * 获取requestedAccuracy属性的值。
     * 
     */
    public int getRequestedAccuracy() {
        return requestedAccuracy;
    }

    /**
     * 设置requestedAccuracy属性的值。
     * 
     */
    public void setRequestedAccuracy(int value) {
        this.requestedAccuracy = value;
    }

    /**
     * 获取frequency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeMetric }
     *     
     */
    public TimeMetric getFrequency() {
        return frequency;
    }

    /**
     * 设置frequency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMetric }
     *     
     */
    public void setFrequency(TimeMetric value) {
        this.frequency = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeMetric }
     *     
     */
    public TimeMetric getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMetric }
     *     
     */
    public void setDuration(TimeMetric value) {
        this.duration = value;
    }

    /**
     * 获取applicationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * 设置applicationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * 获取serviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * 设置serviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * 获取crs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CoordinateReferenceSystem }
     *     
     */
    public CoordinateReferenceSystem getCrs() {
        return crs;
    }

    /**
     * 设置crs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateReferenceSystem }
     *     
     */
    public void setCrs(CoordinateReferenceSystem value) {
        this.crs = value;
    }

    /**
     * 获取locType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocType }
     *     
     */
    public LocType getLocType() {
        return locType;
    }

    /**
     * 设置locType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocType }
     *     
     */
    public void setLocType(LocType value) {
        this.locType = value;
    }

    /**
     * 获取prio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPrio() {
        return prio;
    }

    /**
     * 设置prio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPrio(Priority value) {
        this.prio = value;
    }

    /**
     * 获取eventNotification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventNotification() {
        return eventNotification;
    }

    /**
     * 设置eventNotification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventNotification(String value) {
        this.eventNotification = value;
    }

}
