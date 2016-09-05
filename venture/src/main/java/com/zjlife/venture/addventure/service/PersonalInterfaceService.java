package com.zjlife.venture.addventure.service;

import com.prlife.rop.annotation.IgnoreSignType;
import com.prlife.rop.annotation.NeedInSessionType;
import com.prlife.rop.annotation.ServiceMethod;
import com.zjlife.venture.addventure.request.PersonalRequest;

public interface PersonalInterfaceService {
	@ServiceMethod(method = "per.searation",version = "1.0",needInSession = NeedInSessionType.NO,ignoreSign = IgnoreSignType.YES)
	public Object perSearation(PersonalRequest requst);
	
	@ServiceMethod(method = "per.searationxml", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
	public Object perSearationXML(PersonalRequest requst);

}
