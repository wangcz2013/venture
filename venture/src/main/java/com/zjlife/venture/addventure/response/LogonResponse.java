package com.zjlife.venture.addventure.response;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zjlife.venture.addventure.request.UserInterfaceInfo;

/**
 * @author Administrator
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "userResponse")
public class LogonResponse {
	@XmlAttribute
	private String  usercode;
	@XmlAttribute
	private String msessage;
	@XmlAttribute
	private String islogon;
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getMsessage() {
		return msessage;
	}
	public void setMsessage(String msessage) {
		this.msessage = msessage;
	}
	public String getIslogon() {
		return islogon;
	}
	public void setIslogon(String islogon) {
		this.islogon = islogon;
	}
    

}
