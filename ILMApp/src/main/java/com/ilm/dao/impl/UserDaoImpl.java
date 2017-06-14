package com.ilm.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.dao.UserDao;
import com.ilm.model.User;


public class UserDaoImpl implements UserDao{
	
	static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;


	@SuppressWarnings("unchecked")
	@Override
	public List<User> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<User> userList = session.createCriteria(User.class)
				.list();
		tx.commit();
		session.close();
		return userList;
	}


	@Override
	public List<User> findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<User> findByWorkMail(String email) {
		
		LOGGER.info("email : "+email);
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria cr =session.createCriteria(User.class);
		cr.add(Restrictions.eq("workEmail", email));
		List<User> user = cr.list();
		
//		User user = (User) session.get(User.class, userName);
		tx.commit();
		session.close();
		return user;
	}
}
