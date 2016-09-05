package com.zjlife.venture.addventure.service.impl;

import java.util.Date;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

import com.prlife.rop.annotation.IgnoreSignType;
import com.prlife.rop.annotation.NeedInSessionType;
import com.prlife.rop.annotation.ServiceMethod;
import com.prlife.rop.annotation.ServiceMethodBean;
import com.zjlife.venture.addventure.response.PersonalResponse;
import com.zjlife.venture.addventure.service.PersonalInterfaceService;
import com.zjlife.venture.addventure.request.PerInterfaceInfo;
import com.zjlife.venture.addventure.request.PersonalRequest;
import com.zjlife.venture.request.DaoImp;
import com.zjlife.venture.request.Ibatis;

@ServiceMethodBean(version = "1.0")
public class PersonalInterfaceServiceImp  implements PersonalInterfaceService{
   
	@Autowired
	public DaoImp daoImp;
	@Override
	@ServiceMethod(method = "per.searationxml", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
	public Object perSearationXML(PersonalRequest requst) {
		PersonalResponse response = new PersonalResponse();
		response.setRequestTime(new Date());
		String body = requst.getRopRequestContext().getParamValue("per.searationxml");
		System.out.print("body:"+body);
		try {
			Document document = DocumentHelper.parseText(body);
			Element root = document.getRootElement();  
			String id=root.element("id").getText();  
			String name=root.element("name").getText();  
			System.out.println("id:"+id);
			System.out.println("name:"+name);
			//System.out.println("dao:"+daoImp.getById(id).getName());
			//daoImp.delete(id);
			daoImp.insert(new Ibatis(id, name));
			//daoImp.update(new Ibatis(id, name));
			response.setResponseTime(new Date());
			response.setPerInterfaceInfo(new PerInterfaceInfo("1","2"));
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return response;
	}
		
		@Override
		@ServiceMethod(method = "per.searation", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
		public Object perSearation(PersonalRequest requst) {
			PersonalResponse response = new PersonalResponse();
			response.setRequestTime(new Date());
			System.out.println("id-json:"+requst.getPerInterface().getId());
			System.out.println("name-json:"+requst.getPerInterface().getName());
			response.setResponseTime(new Date());
			response.setPerInterfaceInfo(new PerInterfaceInfo("json_1","json_2"));
			return response;
		}

	
	

}
