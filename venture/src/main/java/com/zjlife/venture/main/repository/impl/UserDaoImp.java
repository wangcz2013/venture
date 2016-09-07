package com.zjlife.venture.main.repository.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.zjlife.venture.main.domain.User;
import com.zjlife.venture.main.repository.UserDao;

public class UserDaoImp extends SqlMapClientDaoSupport implements UserDao{

	@Override
	public User getUserById(String usercode) {
		  return (User)getSqlMapClientTemplate().queryForObject("getUserById",usercode);
		
	}

	@Override
	public User userLogin(String usercode, String password) {
		List<User> u =getSqlMapClientTemplate().queryForList("userLogin", "usercode='"+usercode+"'  and  password='"+password+"'");
		if(u.size()>0){
			return u.get(0);
		}
		return null;
	}

}
