package com.zjlife.venture.main.repository;

import com.zjlife.venture.main.domain.User;

public interface UserDao {
	 public User getUserById(String usercode);
	 public User userLogin(String usercode,String password);
}
