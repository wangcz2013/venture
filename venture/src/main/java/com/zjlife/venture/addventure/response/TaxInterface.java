package com.zjlife.venture.addventure.response;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "taxInterface")
public class TaxInterface {
	@XmlAttribute
	private String log;
	@XmlAttribute
	private BigDecimal preTaxAmount;
	@XmlAttribute
	private String taxableSign;
	@XmlAttribute
	private BigDecimal taxRate;
	@XmlAttribute
	private BigDecimal afterTaxAmount;
	@XmlAttribute
	private BigDecimal taxAmount;
	
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public BigDecimal getPreTaxAmount() {
		return preTaxAmount;
	}
	public void setPreTaxAmount(BigDecimal preTaxAmount) {
		this.preTaxAmount = preTaxAmount;
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
