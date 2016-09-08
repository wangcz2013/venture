package com.zjlife.venture.main.repository.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zjlife.venture.main.domain.PolicyHolderPer;
import com.zjlife.venture.main.repository.PolicyHolderPerDao;

public class PolicyHolderPerDaoImp  extends SqlMapClientDaoSupport implements PolicyHolderPerDao{

	@Override
	public List<PolicyHolderPer> findHoldersByRiskCode(String resultsql) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList("findHoldersByRiskCode",resultsql);
	}
	

}
