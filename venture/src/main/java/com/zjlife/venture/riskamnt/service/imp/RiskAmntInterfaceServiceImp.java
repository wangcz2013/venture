package com.zjlife.venture.riskamnt.service.imp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prlife.rop.annotation.IgnoreSignType;
import com.prlife.rop.annotation.NeedInSessionType;
import com.prlife.rop.annotation.ServiceMethod;
import com.prlife.rop.annotation.ServiceMethodBean;
import com.zjlife.venture.main.domain.PolicyHolderMan;
import com.zjlife.venture.main.domain.PolicyHolderPer;
import com.zjlife.venture.main.repository.impl.PolicyHolderDaoImp;
import com.zjlife.venture.main.repository.impl.PolicyHolderPerDaoImp;
import com.zjlife.venture.riskamnt.request.ReauestMessageRequest;
import com.zjlife.venture.riskamnt.response.ResultDetailedResponse;
import com.zjlife.venture.riskamnt.response.RiskAmntResponse;
import com.zjlife.venture.riskamnt.response.VentureInfoResponse;
import com.zjlife.venture.riskamnt.service.RiskAmntInterfaceService;

@ServiceMethodBean(version = "1.0")
public class RiskAmntInterfaceServiceImp implements RiskAmntInterfaceService{
	
	@Autowired
	PolicyHolderDaoImp policyHolderDaoImp;
	
	@Autowired
	PolicyHolderPerDaoImp policyHolderPerDaoImp;
	
	@Override
	@ServiceMethod(method = "risk.queryAmnt", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
	public Object riskQueryAmnt(ReauestMessageRequest requst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@ServiceMethod(method = "risk.queryAmntXML", version = "1.0", needInSession = NeedInSessionType.NO, ignoreSign = IgnoreSignType.YES)
	public Object riskQueryAmntXML(ReauestMessageRequest requst) {
		RiskAmntResponse response = new RiskAmntResponse();
		response.setRequestTime(new Date().getTime());
		//将投保人信息存入本地数据库
		PolicyHolderMan policyHolder = new PolicyHolderMan();
		policyHolder.setRiskCode(requst.getReauestMessage().getRiskCode());
		policyHolder.setName(requst.getReauestMessage().getName());
		policyHolder.setSex(requst.getReauestMessage().getSex());
		policyHolder.setBirthDay(requst.getReauestMessage().getBirthDay());
		policyHolder.setIdType(requst.getReauestMessage().getIdType());
		policyHolder.setIdNo(requst.getReauestMessage().getIdNo());
		policyHolder.setAmnt(requst.getReauestMessage().getAmnt());
		policyHolder.setPrem(requst.getReauestMessage().getPrem());
		policyHolderDaoImp.savePolicyHolder(policyHolder);
		
		//去个险库中去查找历史投保单记录
		List<PolicyHolderPer> holderlist = policyHolderPerDaoImp.findHoldersByRiskCode(requst.getReauestMessage().getIdNo(),requst.getReauestMessage().getRiskCode());
		System.out.print(holderlist.size());
		for(int i=0;i<holderlist.size();i++){
			System.out.println("idno"+i+":"+holderlist.get(i).getIdno());
			System.out.println("riskcode"+i+":"+holderlist.get(i).getRiskcode());
			System.out.println("risktype"+i+":"+holderlist.get(i).getRisktype());
			System.out.println("amnt"+i+":"+holderlist.get(i).getAmnt());
			System.out.println("prem"+i+":"+holderlist.get(i).getPrem());
		}
		
		//根据险种类别去统计保额和保费
		//返回数据
		VentureInfoResponse ventureInfo = new VentureInfoResponse();
		ventureInfo.setRiskCode("2014");
		ventureInfo.setName("张三");
		ventureInfo.setSex("男");
		ventureInfo.setBirthDay("1990-02-10");
		ventureInfo.setIdType("身份证");
		ventureInfo.setIdNo("1111111111111111");
		List<ResultDetailedResponse> list = new ArrayList<ResultDetailedResponse>();
		ResultDetailedResponse  resultDetailed = null;
		for(int i=0;i<=3;i++){
			resultDetailed = new ResultDetailedResponse();
			resultDetailed.setType("寿险1");
			resultDetailed.setTotalAmnt(new BigDecimal(100000.00));
			list.add(resultDetailed);
		}
		ventureInfo.setResultDetailedList(list);
		response.setVentureInfo(ventureInfo);
		response.setResponseTime(new Date().getTime());
		
		return response;
	}
	
	

}
