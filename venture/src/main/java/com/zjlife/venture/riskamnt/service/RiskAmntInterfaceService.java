package com.zjlife.venture.riskamnt.service;

import com.prlife.rop.annotation.IgnoreSignType;
import com.prlife.rop.annotation.NeedInSessionType;
import com.prlife.rop.annotation.ServiceMethod;
import com.zjlife.venture.riskamnt.request.ReauestMessageRequest;


public interface RiskAmntInterfaceService {
	@ServiceMethod(method = "risk.queryAmnt",version = "1.0",needInSession = NeedInSessionType.NO,ignoreSign = IgnoreSignType.YES)
	public Object riskQueryAmnt(ReauestMessageRequest requst);
	
	@ServiceMethod(method = "risk.queryAmntXML", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
	public Object riskQueryAmntXML(ReauestMessageRequest requst);

}
