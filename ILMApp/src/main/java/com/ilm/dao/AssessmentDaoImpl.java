package com.ilm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.ilm.model.Assessment;

public class AssessmentDaoImpl implements AssessmentDao{
	
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
		// TODO Auto-generated method stub
		return null;
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
