package com.zjlife.venture.main.repository;

import java.util.List;

import com.zjlife.venture.main.domain.RiskAlgorithm;

public interface RiskAlgorithmDao {
	
	public void saveRiskAlgorithm(RiskAlgorithm policyHolder);
	public List<RiskAlgorithm> findRiskAlgorithm(String riskcode,String audlt);

}
