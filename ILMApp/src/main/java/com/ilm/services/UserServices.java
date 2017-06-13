package com.ilm.services;

import java.util.List;

import com.ilm.model.User;

public interface UserServices {
	
	public List<User> getEntityList() throws Exception;
	public List<User> findByUserId(Integer userId);
	public List<User> findByWorkMail(String email);
	

}
