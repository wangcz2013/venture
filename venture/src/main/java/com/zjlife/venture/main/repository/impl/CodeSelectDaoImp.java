package com.zjlife.venture.main.repository.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zjlife.venture.main.domain.CodeTable;
import com.zjlife.venture.main.repository.CodeSelectDao;

public class CodeSelectDaoImp extends SqlMapClientDaoSupport implements CodeSelectDao{

	@Override
	public List<CodeTable> codeSearch(String codetype) {
		
		return getSqlMapClientTemplate().queryForList("codeSearch",codetype);
	}
	

}
