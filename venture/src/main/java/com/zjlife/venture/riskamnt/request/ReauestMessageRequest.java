package com.zjlife.venture.riskamnt.request;

import javax.validation.Valid;
import com.prlife.rop.AbstractRopRequest;

public class ReauestMessageRequest extends AbstractRopRequest{
	
	@Valid
	private ReauestMessageInfo reauestMessage;

	public ReauestMessageInfo getReauestMessage() {
		return reauestMessage;
	}

	public void setReauestMessage(ReauestMessageInfo reauestMessage) {
		this.reauestMessage = reauestMessage;
	}

	

	
}
