package com.zjlife.venture.addventure.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotBlank;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "userInterface")
public class UserInterfaceInfo {
	@XmlAttribute
	private String usercode; 
	@XmlAttribute
	private String username;
	private String password;
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserInterfaceInfo(String usercode, String username, String password) {
		super();
		this.usercode = usercode;
		this.username = username;
		this.password = password;
	}
	
	public UserInterfaceInfo() {
		// TODO Auto-generated constructor stub
	}

}
