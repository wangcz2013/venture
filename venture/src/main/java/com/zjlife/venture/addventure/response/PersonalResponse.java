package com.zjlife.venture.addventure.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zjlife.venture.addventure.request.PerInterfaceInfo;

/**
 * @author Administrator
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "personalResponse")
public class PersonalResponse {@XmlAttribute
	private Date requestTime;
	@XmlAttribute
	private Date responseTime;
	@XmlElement
	PerInterfaceInfo perInterfaceInfo;
	public Date getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}
	public Date getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	public PerInterfaceInfo getPerInterfaceInfo() {
		return perInterfaceInfo;
	}
	public void setPerInterfaceInfo(PerInterfaceInfo perInterfaceInfo) {
		this.perInterfaceInfo = perInterfaceInfo;
	}
	
	

}
