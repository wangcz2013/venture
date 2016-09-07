package com.zjlife.venture.util;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prlife.rop.annotation.IgnoreSignType;
import com.prlife.rop.annotation.NeedInSessionType;
import com.prlife.rop.annotation.ServiceMethod;
import com.prlife.rop.annotation.ServiceMethodBean;
import com.zjlife.venture.main.domain.CodeTable;
import com.zjlife.venture.main.repository.impl.CodeSelectDaoImp;

import com.zjlife.venture.request.CodeManagerInterfaceInfo;
import com.zjlife.venture.request.CodeManagerRequest;
import com.zjlife.venture.response.CodeSearchResponse;

@ServiceMethodBean(version = "1.0")
public class CodeManager {
	@Autowired
	CodeSelectDaoImp codeSelectDaoImp;
	
	@ServiceMethod(method = "code.search", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
	public Object codeSearch(CodeManagerRequest requst) {
		System.out.print(requst.getCodeManagerInterface().getCodetype());
		List<CodeTable> codeList = codeSelectDaoImp.codeSearch(requst.getCodeManagerInterface().getCodetype());
		List<CodeManagerInterfaceInfo> codeselectlist = new ArrayList<CodeManagerInterfaceInfo>();
		for (int i = 0; i < codeList.size(); i++) {
			CodeManagerInterfaceInfo info = new CodeManagerInterfaceInfo();
			info.setCode(codeList.get(i).getCode());
			info.setCodetype(codeList.get(i).getCodetype());
			info.setCodename(codeList.get(i).getCodename());
			codeselectlist.add(info);
		}
		CodeSearchResponse codeSearchResponse = new CodeSearchResponse();
		codeSearchResponse.setCodeManagerInterfacelist(codeselectlist);
		return codeSearchResponse;
	}
}
