package com.zjlife.venture.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "codeManagerInterface")
public class CodeManagerInterfaceInfo {
	
	@XmlElement
	private String code;
	@XmlElement
	private String codetype;
	@XmlElement
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
	
	public CodeManagerInterfaceInfo() {
		// TODO Auto-generated constructor stub
	}
	public CodeManagerInterfaceInfo(String code, String codetype,
			String codename) {
		super();
		this.code = code;
		this.codetype = codetype;
		this.codename = codename;
	}
	

}
