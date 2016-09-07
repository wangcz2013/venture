package com.zjlife.venture.main.repository.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zjlife.venture.main.domain.PolicyHolderMan;
import com.zjlife.venture.main.repository.PolicyHolderDao;

public class PolicyHolderDaoImp extends SqlMapClientDaoSupport  implements PolicyHolderDao{

	@Override
	public void savePolicyHolder(PolicyHolderMan policyHolder) {
		 getSqlMapClientTemplate().insert("savePolicyHolder", policyHolder);
		
	}

}
