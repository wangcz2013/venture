package com.zjlife.venture.main.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class RiskAlgorithm {
	
	private int id;
	private String riskCode;
	private String risktype;
	private String isadult;
	private String formula;
	private String percent;
	private String algorithm;
	private Date makedate;
	private String usercode; 
	private String maketime;
	private Date modifydate;
	private String modifytime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getRisktype() {
		return risktype;
	}
	public void setRisktype(String risktype) {
		this.risktype = risktype;
	}
	public String getIsadult() {
		return isadult;
	}
	public void setIsadult(String isadult) {
		this.isadult = isadult;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	public Date getMakedate() {
		return makedate;
	}
	public void setMakedate(Date makedate) {
		this.makedate = makedate;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getMaketime() {
		return maketime;
	}
	public void setMaketime(String maketime) {
		this.maketime = maketime;
	}
	public Date getModifydate() {
		return modifydate;
	}
	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}
	public String getModifytime() {
		return modifytime;
	}
	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}
	public RiskAlgorithm(int id, String riskCode, String risktype,
			String isadult, String formula, String percent, String algorithm,
			Date makedate, String usercode, String maketime, Date modifydate,
			String modifytime) {
		super();
		this.id = id;
		this.riskCode = riskCode;
		this.risktype = risktype;
		this.isadult = isadult;
		this.formula = formula;
		this.percent = percent;
		this.algorithm = algorithm;
		this.makedate = makedate;
		this.usercode = usercode;
		this.maketime = maketime;
		this.modifydate = modifydate;
		this.modifytime = modifytime;
	}
	
	public RiskAlgorithm() {
		// TODO Auto-generated constructor stub
	}
}
