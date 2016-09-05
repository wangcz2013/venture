package com.zjlife.venture.addventure.response;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "separationDetailed")
public class SeparationDetailed {
	
	@XmlAttribute
	private String itemKey;//费用项目主键
	@XmlAttribute
	private String insuranceActuarialCode;//险种精算代码
	@XmlAttribute
	private String insuranceCode;//险种内部代码
	@XmlAttribute
	private String insuranceName;//险种名称
	@XmlAttribute
	private String costType;//费用类型
	@XmlAttribute
	private BigDecimal preTaxAmount;//税前金额
	@XmlAttribute
	private String taxCode;//税种代码
	@XmlAttribute
	private String taxableSign;//应税标志
	@XmlAttribute
	private BigDecimal taxRate;//税率
	@XmlAttribute
	private BigDecimal afterTaxAmount;//税后金额
	@XmlAttribute
	private BigDecimal taxAmount;//应税金额
	
	public String getItemKey() {
		return itemKey;
	}
	public void setItemKey(String itemKey) {
		this.itemKey = itemKey;
	}
	public String getInsuranceActuarialCode() {
		return insuranceActuarialCode;
	}
	public void setInsuranceActuarialCode(String insuranceActuarialCode) {
		this.insuranceActuarialCode = insuranceActuarialCode;
	}
	public String getInsuranceCode() {
		return insuranceCode;
	}
	public void setInsuranceCode(String insuranceCode) {
		this.insuranceCode = insuranceCode;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getCostType() {
		return costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}
	public BigDecimal getPreTaxAmount() {
		return preTaxAmount;
	}
	public void setPreTaxAmount(BigDecimal preTaxAmount) {
		this.preTaxAmount = preTaxAmount;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getTaxableSign() {
		return taxableSign;
	}
	public void setTaxableSign(String taxableSign) {
		this.taxableSign = taxableSign;
	}
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getAfterTaxAmount() {
		return afterTaxAmount;
	}
	public void setAfterTaxAmount(BigDecimal afterTaxAmount) {
		this.afterTaxAmount = afterTaxAmount;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	

}
