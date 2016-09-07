package com.zjlife.venture.riskamnt.response;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "success")
public class RiskAmntResponse {
	@XmlElement
	private Long requestTime;
	@XmlElement
	private Long responseTime;
	@XmlElement
	private VentureInfoResponse VentureInfo;
	public Long getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(Long requestTime) {
		this.requestTime = requestTime;
	}
	public Long getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Long responseTime) {
		this.responseTime = responseTime;
	}
	public VentureInfoResponse getVentureInfo() {
		return VentureInfo;
	}
	public void setVentureInfo(VentureInfoResponse ventureInfo) {
		VentureInfo = ventureInfo;
	}
	
	public RiskAmntResponse() {
		// TODO Auto-generated constructor stub
	}
	public RiskAmntResponse(Long requestTime, Long responseTime,
			VentureInfoResponse ventureInfo) {
		super();
		this.requestTime = requestTime;
		this.responseTime = responseTime;
		VentureInfo = ventureInfo;
	}
	
	

}
