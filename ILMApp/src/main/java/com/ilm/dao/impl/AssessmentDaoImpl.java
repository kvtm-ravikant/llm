package com.ilm.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.controller.UserController;
import com.ilm.dao.AssessmentDao;
import com.ilm.model.Assessment;

public class AssessmentDaoImpl implements AssessmentDao{
	
	static final Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public List<Assessment> findByAssessmentId(Integer assessmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Assessment> findByUserId(Integer userId) {

		LOGGER.info("userId : "+userId);
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria cr =session.createCriteria(Assessment.class);
		cr.add(Restrictions.eq("userId", userId));
		List<Assessment> assessment = cr.list();
		
//		User user = (User) session.get(User.class, userName);
		tx.commit();
		session.close();
		return assessment;
	}
	
	@Override
	public List<Assessment> findByUserIdAssId(Integer userId, Integer assId) {

		LOGGER.info("userId : "+userId);
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		Criteria cr =session.createCriteria(Assessment.class);
		cr.add(Restrictions.eq("userId", userId));
		cr.add(Restrictions.eq("assessmentId", assId));
		List<Assessment> assessment = cr.list();
		
//		User user = (User) session.get(User.class, userName);
		tx.commit();
		session.close();
		return assessment;
	}

	@Override
	public Assessment save(Assessment assessment) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Assessment> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Assessment> dataList = session.createCriteria(Assessment.class)
				.list();
		tx.commit();
		session.close();
		return dataList;
	}
	

}
