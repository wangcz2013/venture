package com.zjlife.venture.main.domain;

public class CodeTable {
	private String code;
	private String codetype;
	private String codename;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodetype() {
		return codetype;
	}
	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}
	public String getCodename() {
		return codename;
	}
	public void setCodename(String codename) {
		this.codename = codename;
	}
	
	public CodeTable() {
		// TODO Auto-generated constructor stub
	}
	public CodeTable(String code, String codetype, String codename) {
		super();
		this.code = code;
		this.codetype = codetype;
		this.codename = codename;
	}
}
