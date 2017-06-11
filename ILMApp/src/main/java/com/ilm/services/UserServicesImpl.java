package com.ilm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.dao.UserDao;
import com.ilm.model.User;

public class UserServicesImpl implements UserServices{
	
	@Autowired
	UserDao userDao;

	@Override
	public List<User> getEntityList() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getEntityList();
	}

}
