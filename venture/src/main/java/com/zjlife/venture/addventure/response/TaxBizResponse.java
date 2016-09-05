package com.zjlife.venture.addventure.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "taxBizResponse")
public class TaxBizResponse {
	@XmlAttribute
	private Date requestTime;
	@XmlAttribute
	private Date responseTime;
	@XmlElement
	TaxInterface taxInterface;
	
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
	public TaxInterface getTaxInterface() {
		return taxInterface;
	}
	public void setTaxInterface(TaxInterface taxInterface) {
		this.taxInterface = taxInterface;
	}
	

}
