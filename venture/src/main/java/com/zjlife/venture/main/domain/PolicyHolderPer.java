package com.zjlife.venture.main.domain;

public class PolicyHolderPer {
	
    private String idno;
    private String riskcode;
    private String risktype;
    private int amnt;
    private int prem;
    

	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getRiskcode() {
		return riskcode;
	}
	public void setRiskcode(String riskcode) {
		this.riskcode = riskcode;
	}
	public String getRisktype() {
		return risktype;
	}
	public void setRisktype(String risktype) {
		this.risktype = risktype;
	}
	public int getAmnt() {
		return amnt;
	}
	public void setAmnt(int amnt) {
		this.amnt = amnt;
	}
	public int getPrem() {
		return prem;
	}
	public void setPrem(int prem) {
		this.prem = prem;
	}
    
    public PolicyHolderPer() {
		// TODO Auto-generated constructor stub
	}
	public PolicyHolderPer(String idno, String riskcode, String risktype,
			int amnt, int prem) {
		super();
		this.idno = idno;
		this.riskcode = riskcode;
		this.risktype = risktype;
		this.amnt = amnt;
		this.prem = prem;
	}
	

}
