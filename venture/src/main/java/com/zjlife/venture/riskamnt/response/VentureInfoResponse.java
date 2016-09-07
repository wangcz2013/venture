package com.zjlife.venture.riskamnt.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ventureInfo")
public class VentureInfoResponse {
	
	@XmlElement
	private String riskCode;
	@XmlElement
	private String name;
	@XmlElement
	private String sex;
	@XmlElement
	private String birthDay;
	@XmlElement
	private String idType;
	@XmlElement
	private String idNo;
	@XmlElement
	List<ResultDetailedResponse> resultDetailedList;
	
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public List<ResultDetailedResponse> getResultDetailedList() {
		return resultDetailedList;
	}
	public void setResultDetailedList(
			List<ResultDetailedResponse> resultDetailedList) {
		this.resultDetailedList = resultDetailedList;
	}
	public VentureInfoResponse(String riskCode, String name, String sex,
			String birthDay, String idType, String idNo,
			List<ResultDetailedResponse> resultDetailedList) {
		super();
		this.riskCode = riskCode;
		this.name = name;
		this.sex = sex;
		this.birthDay = birthDay;
		this.idType = idType;
		this.idNo = idNo;
		this.resultDetailedList = resultDetailedList;
	}
	public VentureInfoResponse() {
		// TODO Auto-generated constructor stub
	}
	
}
