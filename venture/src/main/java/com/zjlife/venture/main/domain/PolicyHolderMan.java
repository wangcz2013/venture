package com.zjlife.venture.main.domain;

public class PolicyHolderMan {
	private Integer id;
	private String riskCode;
	private String name;
	private String sex;
	private String birthDay;
	private String idType;
	private String idNo;
	private String amnt;
	private String prem;
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
	public String getAmnt() {
		return amnt;
	}
	public void setAmnt(String amnt) {
		this.amnt = amnt;
	}
	public String getPrem() {
		return prem;
	}
	public void setPrem(String prem) {
		this.prem = prem;
	}
	
	public PolicyHolderMan() {
		// TODO Auto-generated constructor stub
	}
	public PolicyHolderMan(Integer id, String riskCode, String name,
			String sex, String birthDay, String idType, String idNo,
			String amnt, String prem) {
		super();
		this.id = id;
		this.riskCode = riskCode;
		this.name = name;
		this.sex = sex;
		this.birthDay = birthDay;
		this.idType = idType;
		this.idNo = idNo;
		this.amnt = amnt;
		this.prem = prem;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

}
