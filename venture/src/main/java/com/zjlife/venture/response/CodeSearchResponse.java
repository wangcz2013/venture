package com.zjlife.venture.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zjlife.venture.request.CodeManagerInterfaceInfo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "codeSearchResponse")
public class CodeSearchResponse {
	@XmlElement
	List<CodeManagerInterfaceInfo> codeManagerInterfacelist;

	public List<CodeManagerInterfaceInfo> getCodeManagerInterfacelist() {
		return codeManagerInterfacelist;
	}

	public void setCodeManagerInterfacelist(
			List<CodeManagerInterfaceInfo> codeManagerInterfacelist) {
		this.codeManagerInterfacelist = codeManagerInterfacelist;
	}

	
	
	
}
