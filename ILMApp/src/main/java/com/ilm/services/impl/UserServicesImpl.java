package com.ilm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.dao.UserDao;
import com.ilm.model.User;
import com.ilm.services.UserServices;

public class UserServicesImpl implements UserServices{
	
	@Autowired
	UserDao userDao;

	@Override
	public List<User> getEntityList() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getEntityList();
	}

	@Override
	public List<User> findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByWorkMail(String email) {
		// TODO Auto-generated method stub
		return userDao.findByWorkMail(email);
	}

}
