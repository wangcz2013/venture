package com.zjlife.venture.addventure.service.impl;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.prlife.rop.annotation.IgnoreSignType;
import com.prlife.rop.annotation.NeedInSessionType;
import com.prlife.rop.annotation.ServiceMethod;
import com.prlife.rop.annotation.ServiceMethodBean;
import com.prlife.rop.marshaller.MessageMarshallerUtils;
import com.zjlife.venture.addventure.request.UserInterfaceInfo;
import com.zjlife.venture.addventure.request.UserRequest;
import com.zjlife.venture.addventure.response.LogonResponse;
import com.zjlife.venture.addventure.service.UserInterfaceService;
import com.zjlife.venture.main.domain.User;
import com.zjlife.venture.main.repository.impl.UserDaoImp;

@ServiceMethodBean(version = "1.0")
public class UserInterfaceServiceImp  implements UserInterfaceService{

	@Autowired
	private UserDaoImp userDaoImp;
	@Override
	@ServiceMethod(method = "user.login", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
	public Object userLogin(UserRequest requst) {
		LogonResponse response = new LogonResponse();
		  response.setIslogon("02");
		 String usercode = requst.getUserInterface().getUsercode();
		 String password = requst.getUserInterface().getPassword();
		 //增加用户名密码不能为空的判断

		 if(usercode ==""||password ==""){
				response.setMsessage("用户名密码不能为空");
			    return response;
		 }
	    System.out.println("我来了:"+usercode);
	    User user =userDaoImp.getUserById(usercode);
	    response.setUsercode(usercode);
	  
	    if(user==null){
//	    	System.out.println(usercode+"用户不存在");
	    	response.setMsessage("用户不存在");
	    }else {
	    	User logonuser =userDaoImp.userLogin(usercode, password);
	    	if(logonuser==null){
//	    		System.out.println("用户名或者密码错误");
	    		response.setMsessage("用户名或者密码错误");
	    	}else{
//	    		System.out.println("登录成功");
	    		response.setIslogon("01");
	    		response.setMsessage("登录成功");
	    	}
	    }
	    
	   
		return response;
	}

}
