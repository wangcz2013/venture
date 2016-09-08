package com.zjlife.venture.main.repository.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zjlife.venture.main.domain.RiskReflect;
import com.zjlife.venture.main.repository.RiskReflectDao;


public class RiskReflectDaoImp  extends SqlMapClientDaoSupport implements RiskReflectDao{

	@Override
	public List<RiskReflect> findReflect(String reflectno) {
		// TODO Auto-generated method stub
		return getSqlMapClientTemplate().queryForList("findReflect",reflectno);
	}

}
