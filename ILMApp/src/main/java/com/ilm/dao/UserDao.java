package com.ilm.dao;

import java.util.List;

import com.ilm.model.User;


public interface UserDao {
	
	public List<User> getEntityList() throws Exception;
	public List<User> findByUserId(Integer userId);
	public List<User> findByWorkMail(String email);

}
