package com.zjlife.venture.addventure.request;

import javax.validation.Valid;

import com.prlife.rop.AbstractRopRequest;

public class UserRequest   extends AbstractRopRequest{
	
	@Valid
	private UserInterfaceInfo userInterface;

	public UserInterfaceInfo getUserInterface() {
		return userInterface;
	}

	public void setUserInterface(UserInterfaceInfo userInterface) {
		this.userInterface = userInterface;
	}

	

	
	
	
}
