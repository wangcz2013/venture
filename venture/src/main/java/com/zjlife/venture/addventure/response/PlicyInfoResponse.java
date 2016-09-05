package com.zjlife.venture.addventure.response;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "resultInfo")
public class PlicyInfoResponse {
	@XmlAttribute
	private Date requestTime;
	@XmlAttribute
	private Date responseTime;
	
	@XmlElement
	List<SeparationDetailed> separationDetailed;

	public List<SeparationDetailed> getSeparationDetailed() {
		return separationDetailed;
	}

	public void setSeparationDetailed(List<SeparationDetailed> separationDetailed) {
		this.separationDetailed = separationDetailed;
	}

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

	
}
