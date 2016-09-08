package com.zjlife.venture.main.repository;

import java.util.List;

import com.zjlife.venture.main.domain.RiskReflect;

public interface RiskReflectDao {
	
	List<RiskReflect>  findReflect(String reflectno);

}
