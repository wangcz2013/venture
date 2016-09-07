package com.zjlife.venture.addventure.service;

import com.prlife.rop.annotation.IgnoreSignType;
import com.prlife.rop.annotation.NeedInSessionType;
import com.prlife.rop.annotation.ServiceMethod;

import com.zjlife.venture.addventure.request.UserRequest;

public interface UserInterfaceService {
	@ServiceMethod(method = "user.login",version = "1.0",needInSession = NeedInSessionType.NO,ignoreSign = IgnoreSignType.YES)
	public Object userLogin(UserRequest requst);
}
