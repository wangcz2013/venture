package com.zjlife.venture.riskamnt.service.imp;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
import com.zjlife.venture.main.domain.RiskAlgorithm;
import com.zjlife.venture.main.domain.RiskReflect;
import com.zjlife.venture.main.repository.impl.PolicyHolderDaoImp;
import com.zjlife.venture.main.repository.impl.PolicyHolderPerDaoImp;
import com.zjlife.venture.main.repository.impl.RiskAlgorithmDaoImp;
import com.zjlife.venture.main.repository.impl.RiskReflectDaoImp;
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
	
	@Autowired
	RiskReflectDaoImp riskReflectDaoImp;
	
	@Autowired
	RiskAlgorithmDaoImp riskAlgorithmDaoImp;
	
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
		policyHolder.setId(111);
		//policyHolderDaoImp.savePolicyHolder(policyHolder);
		List<RiskReflect> RiskReflects = riskReflectDaoImp.findReflect("A001");
		//获取查询
		
		String sql="";
		if(RiskReflects.size()>0){
			sql= RiskReflects.get(0).getCont();
			System.out.println(sql);
				Class clz = policyHolder.getClass();
				Field[] f = clz.getDeclaredFields();
				
				for(int i=1;i<f.length;i++){
					try {
						Method  m = clz.getDeclaredMethod("get"+f[i].getName().substring(0,1).toUpperCase()+f[i].getName().substring(1));
						String data = (String) m.invoke(policyHolder);
						sql = sql.replace("?CONDITION"+i+"?", data);
						System.out.println("sql---"+sql);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
		}
		System.out.println("sqlr===="+sql);

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
		//去个险库中去查找历史投保单记录
		List<PolicyHolderPer> holderlist = policyHolderPerDaoImp.findHoldersByRiskCode(sql);
		System.out.print(holderlist.size());
		for(int i=0;i<holderlist.size();i++){
			resultDetailed = new ResultDetailedResponse();
			System.out.println("idno"+i+":"+holderlist.get(i).getIdno());
			System.out.println("riskcode"+i+":"+holderlist.get(i).getRiskcode());
			System.out.println("risktype"+i+":"+holderlist.get(i).getRisktype());
			System.out.println("amnt"+i+":"+holderlist.get(i).getAmnt());
			System.out.println("prem"+i+":"+holderlist.get(i).getPrem());
			List<RiskAlgorithm> risklist = riskAlgorithmDaoImp.findRiskAlgorithm(holderlist.get(i).getRiskcode(),"'00','01'");
			//根据险种代码和是否未成年去作为条件去查询算法表，然后将计算好的保额保费还有有需要的值套入  risk.getAlgorithm() 中去计算保额保费
			//比如数据库中有2014险种有四条， 2条未成年，一条与该项无关，一条成年  则查出  未成年和与该项无关的两天记录，分别将值传入进行计算保额和保费
			BigDecimal sumAmnt;
			BigDecimal sumPrem;
			
			for(int j=0;j<risklist.size();j++){
				RiskAlgorithm risk = risklist.get(i);
				System.out.println("AAA"+i+risk.getAlgorithm());
				//保额
				resultDetailed = new ResultDetailedResponse();
				if(risk.getRisktype().equalsIgnoreCase("01")){
					resultDetailed.setType("累计保额");
				}else if(risk.getRisktype().equalsIgnoreCase("02")){
					resultDetailed.setType("累计保费");
				}
				
				if(risk.getFormula().equalsIgnoreCase("01")){
					//将保额值放入
					sumAmnt=new BigDecimal("100.01");
					resultDetailed.setTotalAmnt(sumAmnt);
					
				}else if(risk.getFormula().equalsIgnoreCase("02")){
					sumPrem=new BigDecimal("200.01");
					resultDetailed.setTotalprem(sumPrem);
				}
				list.add(resultDetailed);
				//将需要的值放入去计算保额和保费
			}
		}
		
		
		ventureInfo.setResultDetailedList(list);
		response.setVentureInfo(ventureInfo);
		response.setResponseTime(new Date().getTime());
		
		return response;
	}
	
	

}
