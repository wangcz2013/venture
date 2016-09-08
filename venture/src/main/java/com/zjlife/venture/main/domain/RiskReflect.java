package com.zjlife.venture.main.domain;

public class RiskReflect {
	private String reflectno;
	private String reflectname;
	private String cont;
	public String getReflectno() {
		return reflectno;
	}
	public void setReflectno(String reflectno) {
		this.reflectno = reflectno;
	}
	public String getReflectname() {
		return reflectname;
	}
	public void setReflectname(String reflectname) {
		this.reflectname = reflectname;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public RiskReflect(String reflectno, String reflectname, String cont) {
		super();
		this.reflectno = reflectno;
		this.reflectname = reflectname;
		this.cont = cont;
	}
	
	public RiskReflect() {
		// TODO Auto-generated constructor stub
	}

}
