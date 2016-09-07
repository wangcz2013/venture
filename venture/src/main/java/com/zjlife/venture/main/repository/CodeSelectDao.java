package com.zjlife.venture.main.repository;

import java.util.List;

import com.zjlife.venture.main.domain.CodeTable;


public interface CodeSelectDao {
	 public List<CodeTable> codeSearch(String codetype);
}
