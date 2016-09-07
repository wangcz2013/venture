package com.zjlife.venture.request;

import javax.validation.Valid;

import com.prlife.rop.AbstractRopRequest;

public class CodeManagerRequest  extends AbstractRopRequest{
	@Valid
	 private CodeManagerInterfaceInfo codeManagerInterface;

	public CodeManagerInterfaceInfo getCodeManagerInterface() {
		return codeManagerInterface;
	}

	public void setCodeManagerInterface(
			CodeManagerInterfaceInfo codeManagerInterface) {
		this.codeManagerInterface = codeManagerInterface;
	}
	
	


}
