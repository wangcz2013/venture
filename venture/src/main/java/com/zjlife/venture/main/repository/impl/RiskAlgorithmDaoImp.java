package com.zjlife.venture.main.repository.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zjlife.venture.main.domain.RiskAlgorithm;
import com.zjlife.venture.main.repository.RiskAlgorithmDao;

public class RiskAlgorithmDaoImp extends SqlMapClientDaoSupport  implements RiskAlgorithmDao{

	@Override
	public void saveRiskAlgorithm(RiskAlgorithm riskAlgorithm) {
		 getSqlMapClientTemplate().insert("saveRiskAlgorithm", riskAlgorithm);
		
	}

	@Override
	public List<RiskAlgorithm> findRiskAlgorithm(String riskcode,String isadult) {
		// TODO Auto-generated method stub
		System.out.println("sql---"+" riskcode='"+riskcode+"' and isaudlt in ("+isadult+")");
		return getSqlMapClientTemplate().queryForList("findRiskAlgorithm"," riskcode='"+riskcode+"' and isadult in ("+isadult+")");
	}

	

	

}
