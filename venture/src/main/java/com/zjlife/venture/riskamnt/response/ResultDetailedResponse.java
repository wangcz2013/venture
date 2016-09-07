package com.zjlife.venture.riskamnt.response;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "resultDetailed")
public class ResultDetailedResponse {
	
	@XmlElement
	private String type;
	@XmlElement
	private BigDecimal totalAmnt;
	@XmlElement
	private BigDecimal totalprem ;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getTotalAmnt() {
		return totalAmnt;
	}
	public void setTotalAmnt(BigDecimal totalAmnt) {
		this.totalAmnt = totalAmnt;
	}
	public BigDecimal getTotalprem() {
		return totalprem;
	}
	public void setTotalprem(BigDecimal totalprem) {
		this.totalprem = totalprem;
	}
	
	public ResultDetailedResponse() {
		// TODO Auto-generated constructor stub
	}
	public ResultDetailedResponse(String type, BigDecimal totalAmnt,
			BigDecimal totalprem) {
		super();
		this.type = type;
		this.totalAmnt = totalAmnt;
		this.totalprem = totalprem;
	}

}
