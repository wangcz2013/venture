package com.zjlife.venture.main.repository;

import java.util.List;

import com.zjlife.venture.main.domain.PolicyHolderPer;

public interface PolicyHolderPerDao {
	List<PolicyHolderPer> findHoldersByRiskCode(String idno,String riskcode);
}
